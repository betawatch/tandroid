package org.telegram.messenger.time;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class FastDatePrinter implements DatePrinter, Serializable {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final ConcurrentMap<TimeZoneDisplayKey, String> cTimeZoneDisplayCache = new ConcurrentHashMap(7);
    private static final long serialVersionUID = 1;
    private final Locale mLocale;
    private transient int mMaxLengthEstimate;
    private final String mPattern;
    private transient Rule[] mRules;
    private final TimeZone mTimeZone;

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class CharacterLiteral implements Rule {
        private final char mValue;

        public CharacterLiteral(char c10) {
            this.mValue = c10;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValue);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 1;
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public interface NumberRule extends Rule {
        void appendTo(StringBuffer stringBuffer, int i10);
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class PaddedNumberField implements NumberRule {
        private final int mField;
        private final int mSize;

        public PaddedNumberField(int i10, int i11) {
            if (i11 < 3) {
                throw new IllegalArgumentException();
            }
            this.mField = i10;
            this.mSize = i11;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 4;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            if (i10 < 100) {
                int i11 = this.mSize;
                while (true) {
                    i11--;
                    if (i11 < 2) {
                        stringBuffer.append((char) ((i10 / 10) + 48));
                        stringBuffer.append((char) ((i10 % 10) + 48));
                        return;
                    }
                    stringBuffer.append('0');
                }
            } else {
                int length = i10 < 1000 ? 3 : Integer.toString(i10).length();
                int i12 = this.mSize;
                while (true) {
                    i12--;
                    if (i12 < length) {
                        stringBuffer.append(Integer.toString(i10));
                        return;
                    }
                    stringBuffer.append('0');
                }
            }
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public interface Rule {
        void appendTo(StringBuffer stringBuffer, Calendar calendar);

        int estimateLength();
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class StringLiteral implements Rule {
        private final String mValue;

        public StringLiteral(String str) {
            this.mValue = str;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValue);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mValue.length();
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TextField implements Rule {
        private final int mField;
        private final String[] mValues;

        public TextField(int i10, String[] strArr) {
            this.mField = i10;
            this.mValues = strArr;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.mValues[calendar.get(this.mField)]);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            int length = this.mValues.length;
            int i10 = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i10;
                }
                int length2 = this.mValues[length].length();
                if (length2 > i10) {
                    i10 = length2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TimeZoneDisplayKey {
        private final Locale mLocale;
        private final int mStyle;
        private final TimeZone mTimeZone;

        public TimeZoneDisplayKey(TimeZone timeZone, boolean z10, int i10, Locale locale) {
            this.mTimeZone = timeZone;
            if (z10) {
                this.mStyle = Integer.MIN_VALUE | i10;
            } else {
                this.mStyle = i10;
            }
            this.mLocale = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TimeZoneDisplayKey) {
                TimeZoneDisplayKey timeZoneDisplayKey = (TimeZoneDisplayKey) obj;
                if (this.mTimeZone.equals(timeZoneDisplayKey.mTimeZone) && this.mStyle == timeZoneDisplayKey.mStyle && this.mLocale.equals(timeZoneDisplayKey.mLocale)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.mTimeZone.hashCode() + ((this.mLocale.hashCode() + (this.mStyle * 31)) * 31);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TimeZoneNameRule implements Rule {
        private final String mDaylight;
        private final Locale mLocale;
        private final String mStandard;
        private final int mStyle;

        public TimeZoneNameRule(TimeZone timeZone, Locale locale, int i10) {
            this.mLocale = locale;
            this.mStyle = i10;
            this.mStandard = FastDatePrinter.getTimeZoneDisplay(timeZone, false, i10, locale);
            this.mDaylight = FastDatePrinter.getTimeZoneDisplay(timeZone, true, i10, locale);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            TimeZone timeZone = calendar.getTimeZone();
            if (!timeZone.useDaylightTime() || calendar.get(16) == 0) {
                stringBuffer.append(FastDatePrinter.getTimeZoneDisplay(timeZone, false, this.mStyle, this.mLocale));
            } else {
                stringBuffer.append(FastDatePrinter.getTimeZoneDisplay(timeZone, true, this.mStyle, this.mLocale));
            }
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return Math.max(this.mStandard.length(), this.mDaylight.length());
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TimeZoneNumberRule implements Rule {
        static final TimeZoneNumberRule INSTANCE_COLON = new TimeZoneNumberRule(true);
        static final TimeZoneNumberRule INSTANCE_NO_COLON = new TimeZoneNumberRule(false);
        final boolean mColon;

        public TimeZoneNumberRule(boolean z10) {
            this.mColon = z10;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i10 = calendar.get(16) + calendar.get(15);
            if (i10 < 0) {
                stringBuffer.append('-');
                i10 = -i10;
            } else {
                stringBuffer.append('+');
            }
            int i11 = i10 / 3600000;
            stringBuffer.append((char) ((i11 / 10) + 48));
            stringBuffer.append((char) ((i11 % 10) + 48));
            if (this.mColon) {
                stringBuffer.append(':');
            }
            int i12 = (i10 / 60000) - (i11 * 60);
            stringBuffer.append((char) ((i12 / 10) + 48));
            stringBuffer.append((char) ((i12 % 10) + 48));
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 5;
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TwoDigitMonthField implements NumberRule {
        static final TwoDigitMonthField INSTANCE = new TwoDigitMonthField();

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append((char) ((i10 / 10) + 48));
            stringBuffer.append((char) ((i10 % 10) + 48));
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TwoDigitNumberField implements NumberRule {
        private final int mField;

        public TwoDigitNumberField(int i10) {
            this.mField = i10;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            if (i10 >= 100) {
                stringBuffer.append(Integer.toString(i10));
            } else {
                stringBuffer.append((char) ((i10 / 10) + 48));
                stringBuffer.append((char) ((i10 % 10) + 48));
            }
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TwoDigitYearField implements NumberRule {
        static final TwoDigitYearField INSTANCE = new TwoDigitYearField();

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(1) % 100);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            stringBuffer.append((char) ((i10 / 10) + 48));
            stringBuffer.append((char) ((i10 % 10) + 48));
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class UnpaddedMonthField implements NumberRule {
        static final UnpaddedMonthField INSTANCE = new UnpaddedMonthField();

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(2) + 1);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 2;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            if (i10 < 10) {
                stringBuffer.append((char) (i10 + 48));
            } else {
                stringBuffer.append((char) ((i10 / 10) + 48));
                stringBuffer.append((char) ((i10 % 10) + 48));
            }
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class UnpaddedNumberField implements NumberRule {
        private final int mField;

        public UnpaddedNumberField(int i10) {
            this.mField = i10;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            appendTo(stringBuffer, calendar.get(this.mField));
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return 4;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.NumberRule
        public final void appendTo(StringBuffer stringBuffer, int i10) {
            if (i10 < 10) {
                stringBuffer.append((char) (i10 + 48));
            } else if (i10 >= 100) {
                stringBuffer.append(Integer.toString(i10));
            } else {
                stringBuffer.append((char) ((i10 / 10) + 48));
                stringBuffer.append((char) ((i10 % 10) + 48));
            }
        }
    }

    public FastDatePrinter(String str, TimeZone timeZone, Locale locale) {
        this.mPattern = str;
        this.mTimeZone = timeZone;
        this.mLocale = locale;
        init();
    }

    private String applyRulesToString(Calendar calendar) {
        return applyRules(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    public static String getTimeZoneDisplay(TimeZone timeZone, boolean z10, int i10, Locale locale) {
        TimeZoneDisplayKey timeZoneDisplayKey = new TimeZoneDisplayKey(timeZone, z10, i10, locale);
        ConcurrentMap<TimeZoneDisplayKey, String> concurrentMap = cTimeZoneDisplayCache;
        String str = concurrentMap.get(timeZoneDisplayKey);
        if (str != null) {
            return str;
        }
        String displayName = timeZone.getDisplayName(z10, i10, locale);
        String putIfAbsent = concurrentMap.putIfAbsent(timeZoneDisplayKey, displayName);
        return putIfAbsent != null ? putIfAbsent : displayName;
    }

    private void init() {
        List<Rule> parsePattern = parsePattern();
        Rule[] ruleArr = (Rule[]) parsePattern.toArray(new Rule[parsePattern.size()]);
        this.mRules = ruleArr;
        int length = ruleArr.length;
        int i10 = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.mMaxLengthEstimate = i10;
                return;
            }
            i10 += this.mRules[length].estimateLength();
        }
    }

    private GregorianCalendar newCalendar() {
        return new GregorianCalendar(this.mTimeZone, this.mLocale);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        init();
    }

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        for (Rule rule : this.mRules) {
            rule.appendTo(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FastDatePrinter)) {
            return false;
        }
        FastDatePrinter fastDatePrinter = (FastDatePrinter) obj;
        return this.mPattern.equals(fastDatePrinter.mPattern) && this.mTimeZone.equals(fastDatePrinter.mTimeZone) && this.mLocale.equals(fastDatePrinter.mLocale);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (obj instanceof Date) {
            return format((Date) obj, stringBuffer);
        }
        if (obj instanceof Calendar) {
            return format((Calendar) obj, stringBuffer);
        }
        if (obj instanceof Long) {
            return format(((Long) obj).longValue(), stringBuffer);
        }
        throw new IllegalArgumentException("Unknown class: ".concat(obj == null ? "<null>" : obj.getClass().getName()));
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public Locale getLocale() {
        return this.mLocale;
    }

    public int getMaxLengthEstimate() {
        return this.mMaxLengthEstimate;
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public String getPattern() {
        return this.mPattern;
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public TimeZone getTimeZone() {
        return this.mTimeZone;
    }

    public int hashCode() {
        return (((this.mLocale.hashCode() * 13) + this.mTimeZone.hashCode()) * 13) + this.mPattern.hashCode();
    }

    public List<Rule> parsePattern() {
        int i10;
        int i11;
        Rule selectNumberRule;
        Rule rule;
        Rule timeZoneNameRule;
        int i12;
        Rule textField;
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(this.mLocale);
        ArrayList arrayList = new ArrayList();
        String[] eras = dateFormatSymbols.getEras();
        String[] months = dateFormatSymbols.getMonths();
        String[] shortMonths = dateFormatSymbols.getShortMonths();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
        String[] amPmStrings = dateFormatSymbols.getAmPmStrings();
        int length = this.mPattern.length();
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            int[] iArr = {i14};
            String parseToken = parseToken(this.mPattern, iArr);
            int i15 = iArr[i13];
            int length2 = parseToken.length();
            if (length2 == 0) {
                return arrayList;
            }
            char charAt = parseToken.charAt(i13);
            if (charAt == 'y') {
                i10 = 0;
                if (length2 == 2) {
                    rule = TwoDigitYearField.INSTANCE;
                    selectNumberRule = rule;
                    i11 = 1;
                } else {
                    if (length2 < 4) {
                        length2 = 4;
                    }
                    i11 = 1;
                    selectNumberRule = selectNumberRule(1, length2);
                }
            } else if (charAt != 'z') {
                switch (charAt) {
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        String substring = parseToken.substring(1);
                        selectNumberRule = substring.length() == 1 ? new CharacterLiteral(substring.charAt(0)) : new StringLiteral(substring);
                        i11 = 1;
                        i10 = 0;
                        break;
                    case 'S':
                        i12 = 1;
                        timeZoneNameRule = selectNumberRule(14, length2);
                        selectNumberRule = timeZoneNameRule;
                        i11 = i12;
                        i10 = 0;
                        break;
                    case 'W':
                        i12 = 1;
                        timeZoneNameRule = selectNumberRule(4, length2);
                        selectNumberRule = timeZoneNameRule;
                        i11 = i12;
                        i10 = 0;
                        break;
                    case 'Z':
                        i12 = 1;
                        timeZoneNameRule = length2 == 1 ? TimeZoneNumberRule.INSTANCE_NO_COLON : TimeZoneNumberRule.INSTANCE_COLON;
                        selectNumberRule = timeZoneNameRule;
                        i11 = i12;
                        i10 = 0;
                        break;
                    case 'a':
                        textField = new TextField(9, amPmStrings);
                        selectNumberRule = textField;
                        i11 = 1;
                        i10 = 0;
                        break;
                    case 'd':
                        textField = selectNumberRule(5, length2);
                        selectNumberRule = textField;
                        i11 = 1;
                        i10 = 0;
                        break;
                    case 'h':
                        textField = new TwelveHourField(selectNumberRule(10, length2));
                        selectNumberRule = textField;
                        i11 = 1;
                        i10 = 0;
                        break;
                    case 'k':
                        textField = new TwentyFourHourField(selectNumberRule(11, length2));
                        selectNumberRule = textField;
                        i11 = 1;
                        i10 = 0;
                        break;
                    case 'm':
                        textField = selectNumberRule(12, length2);
                        selectNumberRule = textField;
                        i11 = 1;
                        i10 = 0;
                        break;
                    case 's':
                        textField = selectNumberRule(13, length2);
                        selectNumberRule = textField;
                        i11 = 1;
                        i10 = 0;
                        break;
                    case 'w':
                        textField = selectNumberRule(3, length2);
                        selectNumberRule = textField;
                        i11 = 1;
                        i10 = 0;
                        break;
                    default:
                        switch (charAt) {
                            case 'D':
                                textField = selectNumberRule(6, length2);
                                selectNumberRule = textField;
                                i11 = 1;
                                i10 = 0;
                                break;
                            case 'E':
                                selectNumberRule = new TextField(7, length2 < 4 ? shortWeekdays : weekdays);
                                i11 = 1;
                                i10 = 0;
                                break;
                            case 'F':
                                textField = selectNumberRule(8, length2);
                                selectNumberRule = textField;
                                i11 = 1;
                                i10 = 0;
                                break;
                            case 'G':
                                rule = new TextField(0, eras);
                                i10 = 0;
                                selectNumberRule = rule;
                                i11 = 1;
                                break;
                            case 'H':
                                textField = selectNumberRule(11, length2);
                                selectNumberRule = textField;
                                i11 = 1;
                                i10 = 0;
                                break;
                            default:
                                switch (charAt) {
                                    case 'K':
                                        textField = selectNumberRule(10, length2);
                                        break;
                                    case 'L':
                                        if (length2 < 4) {
                                            if (length2 != 3) {
                                                if (length2 != 2) {
                                                    textField = UnpaddedMonthField.INSTANCE;
                                                    break;
                                                } else {
                                                    textField = TwoDigitMonthField.INSTANCE;
                                                    break;
                                                }
                                            } else {
                                                textField = new TextField(2, shortMonths);
                                                break;
                                            }
                                        } else {
                                            textField = new TextField(2, months);
                                            break;
                                        }
                                    case 'M':
                                        if (length2 < 4) {
                                            if (length2 != 3) {
                                                if (length2 != 2) {
                                                    textField = UnpaddedMonthField.INSTANCE;
                                                    break;
                                                } else {
                                                    textField = TwoDigitMonthField.INSTANCE;
                                                    break;
                                                }
                                            } else {
                                                textField = new TextField(2, shortMonths);
                                                break;
                                            }
                                        } else {
                                            textField = new TextField(2, months);
                                            break;
                                        }
                                    default:
                                        throw new IllegalArgumentException("Illegal pattern component: ".concat(parseToken));
                                }
                                selectNumberRule = textField;
                                i11 = 1;
                                i10 = 0;
                                break;
                        }
                }
            } else if (length2 >= 4) {
                i12 = 1;
                timeZoneNameRule = new TimeZoneNameRule(this.mTimeZone, this.mLocale, 1);
                selectNumberRule = timeZoneNameRule;
                i11 = i12;
                i10 = 0;
            } else {
                i10 = 0;
                rule = new TimeZoneNameRule(this.mTimeZone, this.mLocale, 0);
                selectNumberRule = rule;
                i11 = 1;
            }
            arrayList.add(selectNumberRule);
            i14 = i15 + i11;
            i13 = i10;
        }
        return arrayList;
    }

    public String parseToken(String str, int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i10);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb2.append(charAt);
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= length || str.charAt(i11) != charAt) {
                    break;
                }
                sb2.append(charAt);
                i10 = i11;
            }
        } else {
            sb2.append('\'');
            boolean z10 = false;
            while (i10 < length) {
                char charAt2 = str.charAt(i10);
                if (charAt2 != '\'') {
                    if (!z10 && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i10--;
                        break;
                    }
                    sb2.append(charAt2);
                } else {
                    int i12 = i10 + 1;
                    if (i12 >= length || str.charAt(i12) != '\'') {
                        z10 = !z10;
                    } else {
                        sb2.append(charAt2);
                        i10 = i12;
                    }
                }
                i10++;
            }
        }
        iArr[0] = i10;
        return sb2.toString();
    }

    public NumberRule selectNumberRule(int i10, int i11) {
        return i11 != 1 ? i11 != 2 ? new PaddedNumberField(i10, i11) : new TwoDigitNumberField(i10) : new UnpaddedNumberField(i10);
    }

    public String toString() {
        return "FastDatePrinter[" + this.mPattern + "," + this.mLocale + "," + this.mTimeZone.getID() + "]";
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TwelveHourField implements NumberRule {
        private final NumberRule mRule;

        public TwelveHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i10 = calendar.get(10);
            if (i10 == 0) {
                i10 = calendar.getLeastMaximum(10) + 1;
            }
            this.mRule.appendTo(stringBuffer, i10);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.NumberRule
        public void appendTo(StringBuffer stringBuffer, int i10) {
            this.mRule.appendTo(stringBuffer, i10);
        }
    }

    /* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
    public static class TwentyFourHourField implements NumberRule {
        private final NumberRule mRule;

        public TwentyFourHourField(NumberRule numberRule) {
            this.mRule = numberRule;
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public void appendTo(StringBuffer stringBuffer, Calendar calendar) {
            int i10 = calendar.get(11);
            if (i10 == 0) {
                i10 = calendar.getMaximum(11) + 1;
            }
            this.mRule.appendTo(stringBuffer, i10);
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.Rule
        public int estimateLength() {
            return this.mRule.estimateLength();
        }

        @Override // org.telegram.messenger.time.FastDatePrinter.NumberRule
        public void appendTo(StringBuffer stringBuffer, int i10) {
            this.mRule.appendTo(stringBuffer, i10);
        }
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public String format(long j3) {
        GregorianCalendar newCalendar = newCalendar();
        newCalendar.setTimeInMillis(j3);
        return applyRulesToString(newCalendar);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public String format(Date date) {
        GregorianCalendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return applyRulesToString(newCalendar);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public String format(Calendar calendar) {
        return format(calendar, new StringBuffer(this.mMaxLengthEstimate)).toString();
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public StringBuffer format(long j3, StringBuffer stringBuffer) {
        return format(new Date(j3), stringBuffer);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        GregorianCalendar newCalendar = newCalendar();
        newCalendar.setTime(date);
        return applyRules(newCalendar, stringBuffer);
    }

    @Override // org.telegram.messenger.time.DatePrinter
    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return applyRules(calendar, stringBuffer);
    }
}
