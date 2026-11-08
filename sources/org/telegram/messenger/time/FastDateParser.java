package org.telegram.messenger.time;

import a8.p0;
import com.google.android.recaptcha.internal.a;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class FastDateParser implements DateParser, Serializable {
    private static final long serialVersionUID = 2;
    private final int century;
    private transient String currentFormatField;
    private final Locale locale;
    private transient Strategy nextStrategy;
    private transient Pattern parsePattern;
    private final String pattern;
    private final int startYear;
    private transient Strategy[] strategies;
    private final TimeZone timeZone;
    static final Locale JAPANESE_IMPERIAL = new Locale("ja", "JP", "JP");
    private static final Pattern formatPattern = Pattern.compile("D+|E+|F+|G+|H+|K+|M+|L+|S+|W+|Z+|a+|d+|h+|k+|m+|s+|w+|y+|z+|''|'[^']++(''[^']*+)*+'|[^'A-Za-z]++");
    private static final ConcurrentMap<Locale, Strategy>[] caches = new ConcurrentMap[17];
    private static final Strategy ABBREVIATED_YEAR_STRATEGY = new NumberStrategy(1) { // from class: org.telegram.messenger.time.FastDateParser.1
        @Override // org.telegram.messenger.time.FastDateParser.NumberStrategy, org.telegram.messenger.time.FastDateParser.Strategy
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            int parseInt = Integer.parseInt(str);
            if (parseInt < 100) {
                parseInt = fastDateParser.adjustYear(parseInt);
            }
            calendar.set(1, parseInt);
        }
    };
    private static final Strategy NUMBER_MONTH_STRATEGY = new NumberStrategy(2) { // from class: org.telegram.messenger.time.FastDateParser.2
        @Override // org.telegram.messenger.time.FastDateParser.NumberStrategy
        public int modify(int i7) {
            return i7 - 1;
        }
    };
    private static final Strategy LITERAL_YEAR_STRATEGY = new NumberStrategy(1);
    private static final Strategy WEEK_OF_YEAR_STRATEGY = new NumberStrategy(3);
    private static final Strategy WEEK_OF_MONTH_STRATEGY = new NumberStrategy(4);
    private static final Strategy DAY_OF_YEAR_STRATEGY = new NumberStrategy(6);
    private static final Strategy DAY_OF_MONTH_STRATEGY = new NumberStrategy(5);
    private static final Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = new NumberStrategy(8);
    private static final Strategy HOUR_OF_DAY_STRATEGY = new NumberStrategy(11);
    private static final Strategy MODULO_HOUR_OF_DAY_STRATEGY = new NumberStrategy(11) { // from class: org.telegram.messenger.time.FastDateParser.3
        @Override // org.telegram.messenger.time.FastDateParser.NumberStrategy
        public int modify(int i7) {
            return i7 % 24;
        }
    };
    private static final Strategy MODULO_HOUR_STRATEGY = new NumberStrategy(10) { // from class: org.telegram.messenger.time.FastDateParser.4
        @Override // org.telegram.messenger.time.FastDateParser.NumberStrategy
        public int modify(int i7) {
            return i7 % 12;
        }
    };
    private static final Strategy HOUR_STRATEGY = new NumberStrategy(10);
    private static final Strategy MINUTE_STRATEGY = new NumberStrategy(12);
    private static final Strategy SECOND_STRATEGY = new NumberStrategy(13);
    private static final Strategy MILLISECOND_STRATEGY = new NumberStrategy(14);

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static class CopyQuotedStrategy extends Strategy {
        private final String formatField;

        public CopyQuotedStrategy(String str) {
            super();
            this.formatField = str;
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            FastDateParser.escapeRegex(sb2, this.formatField, true);
            return false;
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public boolean isNumber() {
            char charAt = this.formatField.charAt(0);
            if (charAt == '\'') {
                charAt = this.formatField.charAt(1);
            }
            return Character.isDigit(charAt);
        }
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static class TextStrategy extends Strategy {
        private final int field;
        private final Map<String, Integer> keyValues;

        public TextStrategy(int i7, Calendar calendar, Locale locale) {
            super();
            this.field = i7;
            this.keyValues = FastDateParser.getDisplayNames(i7, calendar, locale);
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            sb2.append('(');
            Iterator<String> it = this.keyValues.keySet().iterator();
            while (it.hasNext()) {
                FastDateParser.escapeRegex(sb2, it.next(), false).append('|');
            }
            sb2.setCharAt(sb2.length() - 1, ')');
            return true;
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            Integer num = this.keyValues.get(str);
            if (num != null) {
                calendar.set(this.field, num.intValue());
                return;
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(" not in (");
            Iterator<String> it = this.keyValues.keySet().iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
            sb2.setCharAt(sb2.length() - 1, ')');
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static class TimeZoneStrategy extends Strategy {
        private static final int ID = 0;
        private static final int LONG_DST = 3;
        private static final int LONG_STD = 1;
        private static final int SHORT_DST = 4;
        private static final int SHORT_STD = 2;
        private final SortedMap<String, TimeZone> tzNames;
        private final String validTimeZoneChars;

        public TimeZoneStrategy(Locale locale) {
            super();
            this.tzNames = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
                if (!strArr[0].startsWith("GMT")) {
                    TimeZone timeZone = DesugarTimeZone.getTimeZone(strArr[0]);
                    if (!this.tzNames.containsKey(strArr[1])) {
                        this.tzNames.put(strArr[1], timeZone);
                    }
                    if (!this.tzNames.containsKey(strArr[2])) {
                        this.tzNames.put(strArr[2], timeZone);
                    }
                    if (timeZone.useDaylightTime()) {
                        if (!this.tzNames.containsKey(strArr[3])) {
                            this.tzNames.put(strArr[3], timeZone);
                        }
                        if (!this.tzNames.containsKey(strArr[4])) {
                            this.tzNames.put(strArr[4], timeZone);
                        }
                    }
                }
            }
            StringBuilder m10 = a.m("(GMT[+\\-]\\d{0,1}\\d{2}|[+\\-]\\d{2}:?\\d{2}|");
            Iterator<String> it = this.tzNames.keySet().iterator();
            while (it.hasNext()) {
                FastDateParser.escapeRegex(m10, it.next(), false).append('|');
            }
            m10.setCharAt(m10.length() - 1, ')');
            this.validTimeZoneChars = m10.toString();
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            sb2.append(this.validTimeZoneChars);
            return true;
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            TimeZone timeZone;
            if (str.charAt(0) == '+' || str.charAt(0) == '-') {
                timeZone = DesugarTimeZone.getTimeZone("GMT".concat(str));
            } else if (str.startsWith("GMT")) {
                timeZone = DesugarTimeZone.getTimeZone(str);
            } else {
                timeZone = this.tzNames.get(str);
                if (timeZone == null) {
                    throw new IllegalArgumentException(str.concat(" is not a supported timezone name"));
                }
            }
            calendar.setTimeZone(timeZone);
        }
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int adjustYear(int i7) {
        int i10 = this.century + i7;
        return i7 >= this.startYear ? i10 : i10 + 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static StringBuilder escapeRegex(StringBuilder sb2, String str, boolean z9) {
        sb2.append("\\Q");
        int i7 = 0;
        while (i7 < str.length()) {
            char charAt = str.charAt(i7);
            if (charAt != '\'') {
                if (charAt == '\\' && (i7 = i7 + 1) != str.length()) {
                    sb2.append(charAt);
                    charAt = str.charAt(i7);
                    if (charAt == 'E') {
                        sb2.append("E\\\\E\\");
                        charAt = 'Q';
                    }
                }
            } else if (z9) {
                i7++;
                if (i7 == str.length()) {
                    return sb2;
                }
                charAt = str.charAt(i7);
            } else {
                continue;
            }
            sb2.append(charAt);
            i7++;
        }
        sb2.append("\\E");
        return sb2;
    }

    private static ConcurrentMap<Locale, Strategy> getCache(int i7) {
        ConcurrentMap<Locale, Strategy> concurrentMap;
        ConcurrentMap<Locale, Strategy>[] concurrentMapArr = caches;
        synchronized (concurrentMapArr) {
            try {
                if (concurrentMapArr[i7] == null) {
                    concurrentMapArr[i7] = new ConcurrentHashMap(3);
                }
                concurrentMap = concurrentMapArr[i7];
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return concurrentMap;
    }

    private static String[] getDisplayNameArray(int i7, boolean z9, Locale locale) {
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(locale);
        if (i7 == 0) {
            return dateFormatSymbols.getEras();
        }
        if (i7 == 2) {
            return z9 ? dateFormatSymbols.getMonths() : dateFormatSymbols.getShortMonths();
        }
        if (i7 == 7) {
            return z9 ? dateFormatSymbols.getWeekdays() : dateFormatSymbols.getShortWeekdays();
        }
        if (i7 != 9) {
            return null;
        }
        return dateFormatSymbols.getAmPmStrings();
    }

    private static Map<String, Integer> getDisplayNames(int i7, Locale locale) {
        HashMap hashMap = new HashMap();
        insertValuesInMap(hashMap, getDisplayNameArray(i7, false, locale));
        insertValuesInMap(hashMap, getDisplayNameArray(i7, true, locale));
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    private Strategy getLocaleSpecificStrategy(int i7, Calendar calendar) {
        ConcurrentMap<Locale, Strategy> cache = getCache(i7);
        Strategy strategy = cache.get(this.locale);
        if (strategy != null) {
            return strategy;
        }
        Strategy timeZoneStrategy = i7 == 15 ? new TimeZoneStrategy(this.locale) : new TextStrategy(i7, calendar, this.locale);
        Strategy putIfAbsent = cache.putIfAbsent(this.locale, timeZoneStrategy);
        return putIfAbsent != null ? putIfAbsent : timeZoneStrategy;
    }

    private Strategy getStrategy(String str, Calendar calendar) {
        char charAt = str.charAt(0);
        if (charAt == 'y') {
            return str.length() > 2 ? LITERAL_YEAR_STRATEGY : ABBREVIATED_YEAR_STRATEGY;
        }
        if (charAt != 'z') {
            switch (charAt) {
                case '\'':
                    if (str.length() > 2) {
                        return new CopyQuotedStrategy(a.k(str, 1, 1));
                    }
                    break;
                case qs.U0 /* 83 */:
                    return MILLISECOND_STRATEGY;
                case qs.Y0 /* 87 */:
                    return WEEK_OF_MONTH_STRATEGY;
                case qs.b1 /* 90 */:
                    break;
                case qs.i1 /* 97 */:
                    return getLocaleSpecificStrategy(9, calendar);
                case qs.l1 /* 100 */:
                    return DAY_OF_MONTH_STRATEGY;
                case qs.p1 /* 104 */:
                    return MODULO_HOUR_STRATEGY;
                case qs.s1 /* 107 */:
                    return HOUR_OF_DAY_STRATEGY;
                case qs.u1 /* 109 */:
                    return MINUTE_STRATEGY;
                case qs.A1 /* 115 */:
                    return SECOND_STRATEGY;
                case qs.E1 /* 119 */:
                    return WEEK_OF_YEAR_STRATEGY;
                default:
                    switch (charAt) {
                        case qs.F0 /* 68 */:
                            return DAY_OF_YEAR_STRATEGY;
                        case qs.G0 /* 69 */:
                            return getLocaleSpecificStrategy(7, calendar);
                        case qs.H0 /* 70 */:
                            return DAY_OF_WEEK_IN_MONTH_STRATEGY;
                        case qs.I0 /* 71 */:
                            return getLocaleSpecificStrategy(0, calendar);
                        case qs.J0 /* 72 */:
                            return MODULO_HOUR_OF_DAY_STRATEGY;
                        default:
                            switch (charAt) {
                                case qs.M0 /* 75 */:
                                    return HOUR_STRATEGY;
                                case qs.N0 /* 76 */:
                                case qs.O0 /* 77 */:
                                    return str.length() >= 3 ? getLocaleSpecificStrategy(2, calendar) : NUMBER_MONTH_STRATEGY;
                            }
                    }
            }
            return new CopyQuotedStrategy(str);
        }
        return getLocaleSpecificStrategy(15, calendar);
    }

    private void init(Calendar calendar) {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = formatPattern.matcher(this.pattern);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("Illegal pattern character '" + this.pattern.charAt(matcher.regionStart()) + "'");
        }
        String group = matcher.group();
        this.currentFormatField = group;
        Strategy strategy = getStrategy(group, calendar);
        while (true) {
            matcher.region(matcher.end(), matcher.regionEnd());
            if (!matcher.lookingAt()) {
                break;
            }
            String group2 = matcher.group();
            this.nextStrategy = getStrategy(group2, calendar);
            if (strategy.addRegex(this, sb2)) {
                arrayList.add(strategy);
            }
            this.currentFormatField = group2;
            strategy = this.nextStrategy;
        }
        this.nextStrategy = null;
        if (matcher.regionStart() != matcher.regionEnd()) {
            throw new IllegalArgumentException("Failed to parse \"" + this.pattern + "\" ; gave up at index " + matcher.regionStart());
        }
        if (strategy.addRegex(this, sb2)) {
            arrayList.add(strategy);
        }
        this.currentFormatField = null;
        this.strategies = (Strategy[]) arrayList.toArray(new Strategy[arrayList.size()]);
        this.parsePattern = Pattern.compile(sb2.toString());
    }

    private static void insertValuesInMap(Map<String, Integer> map, String[] strArr) {
        if (strArr == null) {
            return;
        }
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            if (str != null && str.length() > 0) {
                map.put(strArr[i7], Integer.valueOf(i7));
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init(Calendar.getInstance(this.timeZone, this.locale));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDateParser)) {
            return false;
        }
        FastDateParser fastDateParser = (FastDateParser) obj;
        return this.pattern.equals(fastDateParser.pattern) && this.timeZone.equals(fastDateParser.timeZone) && this.locale.equals(fastDateParser.locale);
    }

    public int getFieldWidth() {
        return this.currentFormatField.length();
    }

    @Override // org.telegram.messenger.time.DateParser, org.telegram.messenger.time.DatePrinter
    public Locale getLocale() {
        return this.locale;
    }

    public Pattern getParsePattern() {
        return this.parsePattern;
    }

    @Override // org.telegram.messenger.time.DateParser, org.telegram.messenger.time.DatePrinter
    public String getPattern() {
        return this.pattern;
    }

    @Override // org.telegram.messenger.time.DateParser, org.telegram.messenger.time.DatePrinter
    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((this.locale.hashCode() * 13) + this.timeZone.hashCode()) * 13) + this.pattern.hashCode();
    }

    public boolean isNextNumber() {
        Strategy strategy = this.nextStrategy;
        return strategy != null && strategy.isNumber();
    }

    @Override // org.telegram.messenger.time.DateParser
    public Date parse(String str) {
        Date parse = parse(str, new ParsePosition(0));
        if (parse != null) {
            return parse;
        }
        if (!this.locale.equals(JAPANESE_IMPERIAL)) {
            StringBuilder u10 = p0.u("Unparseable date: \"", str, "\" does not match ");
            u10.append(this.parsePattern.pattern());
            throw new ParseException(u10.toString(), 0);
        }
        throw new ParseException("(The " + this.locale + " locale does not support dates before 1868 AD)\nUnparseable date: \"" + str + "\" does not match " + this.parsePattern.pattern(), 0);
    }

    @Override // org.telegram.messenger.time.DateParser
    public Object parseObject(String str) {
        return parse(str);
    }

    public String toString() {
        return "FastDateParser[" + this.pattern + "," + this.locale + "," + this.timeZone.getID() + "]";
    }

    public FastDateParser(String str, TimeZone timeZone, Locale locale, Date date) {
        int i7;
        this.pattern = str;
        this.timeZone = timeZone;
        this.locale = locale;
        Calendar calendar = Calendar.getInstance(timeZone, locale);
        if (date != null) {
            calendar.setTime(date);
            i7 = calendar.get(1);
        } else if (locale.equals(JAPANESE_IMPERIAL)) {
            i7 = 0;
        } else {
            calendar.setTime(new Date());
            i7 = calendar.get(1) - 80;
        }
        int i10 = (i7 / 100) * 100;
        this.century = i10;
        this.startYear = i7 - i10;
        init(calendar);
    }

    @Override // org.telegram.messenger.time.DateParser
    public Object parseObject(String str, ParsePosition parsePosition) {
        return parse(str, parsePosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Integer> getDisplayNames(int i7, Calendar calendar, Locale locale) {
        return getDisplayNames(i7, locale);
    }

    @Override // org.telegram.messenger.time.DateParser
    public Date parse(String str, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        Matcher matcher = this.parsePattern.matcher(str.substring(index));
        if (!matcher.lookingAt()) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(this.timeZone, this.locale);
        calendar.clear();
        int i7 = 0;
        while (true) {
            Strategy[] strategyArr = this.strategies;
            if (i7 < strategyArr.length) {
                int i10 = i7 + 1;
                strategyArr[i7].setCalendar(this, calendar, matcher.group(i10));
                i7 = i10;
            } else {
                parsePosition.setIndex(matcher.end() + index);
                return calendar.getTime();
            }
        }
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static class NumberStrategy extends Strategy {
        private final int field;

        public NumberStrategy(int i7) {
            super();
            this.field = i7;
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2) {
            if (!fastDateParser.isNextNumber()) {
                sb2.append("(\\p{Nd}++)");
                return true;
            }
            sb2.append("(\\p{Nd}{");
            sb2.append(fastDateParser.getFieldWidth());
            sb2.append("}+)");
            return true;
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public boolean isNumber() {
            return true;
        }

        @Override // org.telegram.messenger.time.FastDateParser.Strategy
        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
            calendar.set(this.field, modify(Integer.parseInt(str)));
        }

        public int modify(int i7) {
            return i7;
        }
    }

    /* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
    public static abstract class Strategy {
        private Strategy() {
        }

        public abstract boolean addRegex(FastDateParser fastDateParser, StringBuilder sb2);

        public boolean isNumber() {
            return false;
        }

        public void setCalendar(FastDateParser fastDateParser, Calendar calendar, String str) {
        }
    }
}
