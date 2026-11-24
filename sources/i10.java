// default package

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.icu.text.Collator;
import android.icu.text.DateFormat;
import android.icu.text.ListFormatter;
import android.icu.text.NumberFormat;
import android.icu.text.PluralRules;
import android.icu.text.RelativeDateTimeFormatter;
import android.icu.util.Currency;
import android.icu.util.TimeZone;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
import android.view.MenuItem;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class i10 {
    public static AudioManager a;

    public static void a(AudioManager audioManager, f10 f10Var) {
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(f10Var.b);
            return;
        }
        Object obj = f10Var.f;
        obj.getClass();
        audioManager.abandonAudioFocusRequest((AudioFocusRequest) obj);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static DateFormat c(JSONObject jSONObject, String str, Locale locale) {
        boolean z;
        int i;
        boolean z2;
        String optString = jSONObject.optString("dateStyle");
        optString.getClass();
        int i2 = 2;
        boolean z3 = true;
        switch (optString.hashCode()) {
            case -1078030475:
                if (optString.equals("medium")) {
                    z = false;
                    break;
                }
                z = -1;
                break;
            case 3154575:
                if (optString.equals("full")) {
                    z = true;
                    break;
                }
                z = -1;
                break;
            case 3327612:
                if (optString.equals("long")) {
                    z = 2;
                    break;
                }
                z = -1;
                break;
            case 109413500:
                if (optString.equals("short")) {
                    z = 3;
                    break;
                }
                z = -1;
                break;
            default:
                z = -1;
                break;
        }
        switch (z) {
            case false:
                i = 2;
                break;
            case true:
                i = 0;
                break;
            case true:
                i = 1;
                break;
            case true:
                i = 3;
                break;
            default:
                i = -1;
                break;
        }
        String optString2 = jSONObject.optString("timeStyle");
        optString2.getClass();
        switch (optString2.hashCode()) {
            case -1078030475:
                if (optString2.equals("medium")) {
                    z2 = false;
                    break;
                }
                z2 = -1;
                break;
            case 3154575:
                if (optString2.equals("full")) {
                    z2 = true;
                    break;
                }
                z2 = -1;
                break;
            case 3327612:
                if (optString2.equals("long")) {
                    z2 = 2;
                    break;
                }
                z2 = -1;
                break;
            case 109413500:
                if (optString2.equals("short")) {
                    z2 = 3;
                    break;
                }
                z2 = -1;
                break;
            default:
                z2 = -1;
                break;
        }
        switch (z2) {
            case false:
                break;
            case true:
                i2 = 0;
                break;
            case true:
                i2 = 1;
                break;
            case true:
                i2 = 3;
                break;
            default:
                i2 = -1;
                break;
        }
        DateFormat dateTimeInstance = i >= 0 ? i2 >= 0 ? DateFormat.getDateTimeInstance(i, i2, locale) : DateFormat.getDateInstance(i, locale) : i2 >= 0 ? DateFormat.getTimeInstance(i2, locale) : null;
        if (dateTimeInstance == null) {
            StringBuilder sb = new StringBuilder();
            String optString3 = jSONObject.optString("era");
            if (!optString3.isEmpty()) {
                sb.append(optString3.equals("long") ? "GGGG" : optString3.equals("narrow") ? "GGGGG" : "G");
            }
            String optString4 = jSONObject.optString("year");
            if (!optString4.isEmpty()) {
                sb.append(optString4.equals("2-digit") ? "yy" : "y");
            }
            String optString5 = jSONObject.optString("month");
            if (!optString5.isEmpty()) {
                sb.append(optString5.equals("long") ? "MMMM" : optString5.equals("short") ? "MMM" : optString5.equals("narrow") ? "MMMMM" : optString5.equals("2-digit") ? "MM" : "M");
            }
            String optString6 = jSONObject.optString("weekday");
            if (!optString6.isEmpty()) {
                sb.append(optString6.equals("long") ? "EEEE" : optString6.equals("narrow") ? "EEEEE" : "EEE");
            }
            String optString7 = jSONObject.optString("day");
            if (!optString7.isEmpty()) {
                sb.append(optString7.equals("2-digit") ? "dd" : "d");
            }
            String optString8 = jSONObject.optString("hour");
            if (!optString8.isEmpty()) {
                sb.append(f(jSONObject, optString8.equals("2-digit")));
            }
            if (jSONObject.has("minute")) {
                sb.append("mm");
            }
            if (jSONObject.has("second")) {
                sb.append("ss");
            }
            if (sb.length() == 0) {
                boolean equals = str.equals("toLocaleTimeString");
                if (!str.equals("toLocaleTimeString") && !str.equals("toLocaleString")) {
                    z3 = false;
                }
                if (!equals) {
                    sb.append("yMd");
                }
                if (z3) {
                    sb.append(f(jSONObject, false));
                    sb.append("mmss");
                }
            }
            String optString9 = jSONObject.optString("timeZoneName");
            if (!optString9.isEmpty()) {
                sb.append(optString9.equals("long") ? "zzzz" : "z");
            }
            dateTimeInstance = DateFormat.getInstanceForSkeleton(sb.toString(), locale);
        }
        String optString10 = jSONObject.optString("timeZone");
        if (!optString10.isEmpty()) {
            dateTimeInstance.setTimeZone(TimeZone.getTimeZone(optString10));
        }
        return dateTimeInstance;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        if (r13.equals("date") != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cd, code lost:
    
        if (r2.equals("day") == false) goto L101;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x01d1. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0277 A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:6:0x0014, B:8:0x0023, B:9:0x0028, B:11:0x0033, B:12:0x0042, B:14:0x0048, B:15:0x0051, B:16:0x0065, B:18:0x006a, B:20:0x0072, B:22:0x008f, B:25:0x00f6, B:27:0x0098, B:29:0x00a0, B:31:0x00a9, B:33:0x00b1, B:35:0x00ba, B:39:0x00c6, B:41:0x00d1, B:43:0x00d7, B:45:0x00e5, B:47:0x00ee, B:49:0x010b, B:51:0x0113, B:53:0x0122, B:54:0x012b, B:57:0x013b, B:59:0x0141, B:60:0x0183, B:64:0x0199, B:66:0x019f, B:76:0x01d5, B:79:0x01e6, B:80:0x01fa, B:82:0x01ed, B:85:0x01f6, B:86:0x01d8, B:87:0x01db, B:88:0x01de, B:98:0x0201, B:100:0x0209, B:101:0x0212, B:103:0x020e, B:104:0x0146, B:106:0x014c, B:107:0x0151, B:109:0x0157, B:110:0x015a, B:112:0x0162, B:113:0x0167, B:115:0x016d, B:116:0x0172, B:118:0x017a, B:119:0x017f, B:120:0x0217, B:122:0x021f, B:124:0x0228, B:126:0x0230, B:130:0x0244, B:132:0x024a, B:134:0x0271, B:136:0x0277, B:137:0x027e, B:139:0x0284, B:140:0x028b, B:142:0x0291, B:143:0x0298, B:149:0x026d, B:150:0x0260, B:152:0x0268, B:153:0x004d, B:154:0x0036, B:156:0x003a), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0284 A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:6:0x0014, B:8:0x0023, B:9:0x0028, B:11:0x0033, B:12:0x0042, B:14:0x0048, B:15:0x0051, B:16:0x0065, B:18:0x006a, B:20:0x0072, B:22:0x008f, B:25:0x00f6, B:27:0x0098, B:29:0x00a0, B:31:0x00a9, B:33:0x00b1, B:35:0x00ba, B:39:0x00c6, B:41:0x00d1, B:43:0x00d7, B:45:0x00e5, B:47:0x00ee, B:49:0x010b, B:51:0x0113, B:53:0x0122, B:54:0x012b, B:57:0x013b, B:59:0x0141, B:60:0x0183, B:64:0x0199, B:66:0x019f, B:76:0x01d5, B:79:0x01e6, B:80:0x01fa, B:82:0x01ed, B:85:0x01f6, B:86:0x01d8, B:87:0x01db, B:88:0x01de, B:98:0x0201, B:100:0x0209, B:101:0x0212, B:103:0x020e, B:104:0x0146, B:106:0x014c, B:107:0x0151, B:109:0x0157, B:110:0x015a, B:112:0x0162, B:113:0x0167, B:115:0x016d, B:116:0x0172, B:118:0x017a, B:119:0x017f, B:120:0x0217, B:122:0x021f, B:124:0x0228, B:126:0x0230, B:130:0x0244, B:132:0x024a, B:134:0x0271, B:136:0x0277, B:137:0x027e, B:139:0x0284, B:140:0x028b, B:142:0x0291, B:143:0x0298, B:149:0x026d, B:150:0x0260, B:152:0x0268, B:153:0x004d, B:154:0x0036, B:156:0x003a), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0291 A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:6:0x0014, B:8:0x0023, B:9:0x0028, B:11:0x0033, B:12:0x0042, B:14:0x0048, B:15:0x0051, B:16:0x0065, B:18:0x006a, B:20:0x0072, B:22:0x008f, B:25:0x00f6, B:27:0x0098, B:29:0x00a0, B:31:0x00a9, B:33:0x00b1, B:35:0x00ba, B:39:0x00c6, B:41:0x00d1, B:43:0x00d7, B:45:0x00e5, B:47:0x00ee, B:49:0x010b, B:51:0x0113, B:53:0x0122, B:54:0x012b, B:57:0x013b, B:59:0x0141, B:60:0x0183, B:64:0x0199, B:66:0x019f, B:76:0x01d5, B:79:0x01e6, B:80:0x01fa, B:82:0x01ed, B:85:0x01f6, B:86:0x01d8, B:87:0x01db, B:88:0x01de, B:98:0x0201, B:100:0x0209, B:101:0x0212, B:103:0x020e, B:104:0x0146, B:106:0x014c, B:107:0x0151, B:109:0x0157, B:110:0x015a, B:112:0x0162, B:113:0x0167, B:115:0x016d, B:116:0x0172, B:118:0x017a, B:119:0x017f, B:120:0x0217, B:122:0x021f, B:124:0x0228, B:126:0x0230, B:130:0x0244, B:132:0x024a, B:134:0x0271, B:136:0x0277, B:137:0x027e, B:139:0x0284, B:140:0x028b, B:142:0x0291, B:143:0x0298, B:149:0x026d, B:150:0x0260, B:152:0x0268, B:153:0x004d, B:154:0x0036, B:156:0x003a), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6 A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:6:0x0014, B:8:0x0023, B:9:0x0028, B:11:0x0033, B:12:0x0042, B:14:0x0048, B:15:0x0051, B:16:0x0065, B:18:0x006a, B:20:0x0072, B:22:0x008f, B:25:0x00f6, B:27:0x0098, B:29:0x00a0, B:31:0x00a9, B:33:0x00b1, B:35:0x00ba, B:39:0x00c6, B:41:0x00d1, B:43:0x00d7, B:45:0x00e5, B:47:0x00ee, B:49:0x010b, B:51:0x0113, B:53:0x0122, B:54:0x012b, B:57:0x013b, B:59:0x0141, B:60:0x0183, B:64:0x0199, B:66:0x019f, B:76:0x01d5, B:79:0x01e6, B:80:0x01fa, B:82:0x01ed, B:85:0x01f6, B:86:0x01d8, B:87:0x01db, B:88:0x01de, B:98:0x0201, B:100:0x0209, B:101:0x0212, B:103:0x020e, B:104:0x0146, B:106:0x014c, B:107:0x0151, B:109:0x0157, B:110:0x015a, B:112:0x0162, B:113:0x0167, B:115:0x016d, B:116:0x0172, B:118:0x017a, B:119:0x017f, B:120:0x0217, B:122:0x021f, B:124:0x0228, B:126:0x0230, B:130:0x0244, B:132:0x024a, B:134:0x0271, B:136:0x0277, B:137:0x027e, B:139:0x0284, B:140:0x028b, B:142:0x0291, B:143:0x0298, B:149:0x026d, B:150:0x0260, B:152:0x0268, B:153:0x004d, B:154:0x0036, B:156:0x003a), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String d(String str) {
        NumberFormat percentInstance;
        RelativeDateTimeFormatter.RelativeUnit relativeUnit;
        String str2;
        RelativeDateTimeFormatter.AbsoluteUnit absoluteUnit;
        RelativeDateTimeFormatter.Direction direction;
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject optJSONObject = jSONObject.optJSONObject("opts");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                Object opt = jSONObject.opt("locale");
                int i2 = 0;
                String optString = opt instanceof String ? (String) opt : opt instanceof JSONArray ? ((JSONArray) opt).optString(0, "") : "";
                Locale locale = optString.isEmpty() ? Locale.getDefault() : Locale.forLanguageTag(optString);
                double optDouble = jSONObject.optDouble("value", 0.0d);
                String optString2 = jSONObject.optString("kind");
                switch (optString2.hashCode()) {
                    case -1034364087:
                        if (optString2.equals("number")) {
                            String optString3 = optJSONObject.optString("style");
                            int hashCode = optString3.hashCode();
                            if (hashCode != -678927291) {
                                if (hashCode == 575402001 && optString3.equals("currency")) {
                                    percentInstance = NumberFormat.getCurrencyInstance(locale);
                                    String optString4 = optJSONObject.optString("currency");
                                    if (!optString4.isEmpty()) {
                                        try {
                                            percentInstance.setCurrency(Currency.getInstance(optString4));
                                        } catch (Exception unused) {
                                        }
                                    }
                                    if (optJSONObject.has("minimumFractionDigits")) {
                                        percentInstance.setMinimumFractionDigits(optJSONObject.optInt("minimumFractionDigits"));
                                    }
                                    if (optJSONObject.has("maximumFractionDigits")) {
                                        percentInstance.setMaximumFractionDigits(optJSONObject.optInt("maximumFractionDigits"));
                                    }
                                    if (optJSONObject.has("useGrouping")) {
                                        percentInstance.setGroupingUsed(optJSONObject.optBoolean("useGrouping"));
                                    }
                                    return percentInstance.format(optDouble);
                                }
                            } else if (optString3.equals("percent")) {
                                percentInstance = NumberFormat.getPercentInstance(locale);
                                if (optJSONObject.has("minimumFractionDigits")) {
                                }
                                if (optJSONObject.has("maximumFractionDigits")) {
                                }
                                if (optJSONObject.has("useGrouping")) {
                                }
                                return percentInstance.format(optDouble);
                            }
                            percentInstance = NumberFormat.getNumberInstance(locale);
                            if (optJSONObject.has("minimumFractionDigits")) {
                            }
                            if (optJSONObject.has("maximumFractionDigits")) {
                            }
                            if (optJSONObject.has("useGrouping")) {
                            }
                            return percentInstance.format(optDouble);
                        }
                        break;
                    case -985163900:
                        if (optString2.equals("plural")) {
                            return PluralRules.forLocale(locale).select(optDouble);
                        }
                        break;
                    case -554435892:
                        if (optString2.equals("relative")) {
                            String optString5 = jSONObject.optString("unit", "second");
                            if (optString5.endsWith("s")) {
                                optString5 = optString5.substring(0, optString5.length() - 1);
                            }
                            switch (optString5.hashCode()) {
                                case -1074026988:
                                    if (optString5.equals("minute")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MINUTES;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 99228:
                                    if (optString5.equals("day")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.DAYS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 3208676:
                                    if (optString5.equals("hour")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.HOURS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 3645428:
                                    if (optString5.equals("week")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.WEEKS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 3704893:
                                    if (optString5.equals("year")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.YEARS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                case 104080000:
                                    if (optString5.equals("month")) {
                                        relativeUnit = RelativeDateTimeFormatter.RelativeUnit.MONTHS;
                                        break;
                                    }
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                                default:
                                    relativeUnit = RelativeDateTimeFormatter.RelativeUnit.SECONDS;
                                    break;
                            }
                            RelativeDateTimeFormatter relativeDateTimeFormatter = RelativeDateTimeFormatter.getInstance(locale);
                            if (optJSONObject.optString("numeric").equals("auto")) {
                                if (optDouble != 0.0d || !optString5.equals("second")) {
                                    switch (optString5.hashCode()) {
                                        case 99228:
                                            break;
                                        case 3645428:
                                            if (optString5.equals("week")) {
                                                i2 = 1;
                                                break;
                                            }
                                            i2 = -1;
                                            break;
                                        case 3704893:
                                            if (optString5.equals("year")) {
                                                i2 = 2;
                                                break;
                                            }
                                            i2 = -1;
                                            break;
                                        case 104080000:
                                            if (optString5.equals("month")) {
                                                i2 = 3;
                                                break;
                                            }
                                            i2 = -1;
                                            break;
                                        default:
                                            i2 = -1;
                                            break;
                                    }
                                    str2 = null;
                                    switch (i2) {
                                        case 0:
                                            absoluteUnit = RelativeDateTimeFormatter.AbsoluteUnit.DAY;
                                            if (optDouble != -1.0d) {
                                                direction = RelativeDateTimeFormatter.Direction.LAST;
                                            } else if (optDouble == 0.0d) {
                                                direction = RelativeDateTimeFormatter.Direction.THIS;
                                            } else if (optDouble == 1.0d) {
                                                direction = RelativeDateTimeFormatter.Direction.NEXT;
                                            }
                                            str2 = relativeDateTimeFormatter.format(direction, absoluteUnit);
                                            break;
                                        case 1:
                                            absoluteUnit = RelativeDateTimeFormatter.AbsoluteUnit.WEEK;
                                            if (optDouble != -1.0d) {
                                            }
                                            str2 = relativeDateTimeFormatter.format(direction, absoluteUnit);
                                            break;
                                        case 2:
                                            absoluteUnit = RelativeDateTimeFormatter.AbsoluteUnit.YEAR;
                                            if (optDouble != -1.0d) {
                                            }
                                            str2 = relativeDateTimeFormatter.format(direction, absoluteUnit);
                                            break;
                                        case 3:
                                            absoluteUnit = RelativeDateTimeFormatter.AbsoluteUnit.MONTH;
                                            if (optDouble != -1.0d) {
                                            }
                                            str2 = relativeDateTimeFormatter.format(direction, absoluteUnit);
                                            break;
                                    }
                                } else {
                                    str2 = relativeDateTimeFormatter.format(RelativeDateTimeFormatter.Direction.PLAIN, RelativeDateTimeFormatter.AbsoluteUnit.NOW);
                                }
                                if (str2 != null) {
                                    return str2;
                                }
                            }
                            return relativeDateTimeFormatter.format(Math.abs(optDouble), optDouble < 0.0d ? RelativeDateTimeFormatter.Direction.LAST : RelativeDateTimeFormatter.Direction.NEXT, relativeUnit);
                        }
                        break;
                    case 3076014:
                        break;
                    case 3322014:
                        if (optString2.equals("list") && i >= 26) {
                            JSONArray optJSONArray = jSONObject.optJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            if (optJSONArray != null) {
                                while (i2 < optJSONArray.length()) {
                                    arrayList.add(String.valueOf(optJSONArray.opt(i2)));
                                    i2++;
                                }
                            }
                            return ListFormatter.getInstance(locale).format(arrayList);
                        }
                        break;
                    case 103164673:
                        if (optString2.equals("lower")) {
                            return jSONObject.optString("value").toLowerCase(locale);
                        }
                        break;
                    case 111499426:
                        if (optString2.equals("upper")) {
                            return jSONObject.optString("value").toUpperCase(locale);
                        }
                        break;
                    case 346468911:
                        if (optString2.equals("dateMethod")) {
                            return c(optJSONObject, jSONObject.optString("method"), locale).format(new Date((long) optDouble));
                        }
                        break;
                    case 950484197:
                        if (optString2.equals("compare")) {
                            return Integer.toString(Integer.signum(Collator.getInstance(locale).compare(jSONObject.optString("a"), jSONObject.optString("b"))));
                        }
                        break;
                }
            } catch (Exception unused2) {
            }
        }
        return "";
    }

    public static synchronized AudioManager e(Context context) {
        synchronized (i10.class) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper == null || myLooper == Looper.getMainLooper()) {
                AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                a = audioManager2;
                audioManager2.getClass();
                return audioManager2;
            }
            gs2 gs2Var = new gs2();
            pe0.a().execute(new pf2(applicationContext, gs2Var, (byte) 29));
            gs2Var.b();
            AudioManager audioManager3 = a;
            audioManager3.getClass();
            return audioManager3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r4.optBoolean("hour12") != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String f(JSONObject jSONObject, boolean z) {
        String str = "H";
        if (!jSONObject.has("hour12")) {
            String optString = jSONObject.optString("hourCycle");
            if (!optString.equals("h11") && !optString.equals("h12")) {
                if (!optString.equals("h23") && !optString.equals("h24")) {
                    str = "j";
                }
            }
            str = "h";
        }
        return z ? str.concat(str) : str;
    }

    public static boolean g(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static Intent h(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, rs.l(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null, i & 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0025, code lost:
    
        if (r0 == Integer.MIN_VALUE) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i(AudioManager audioManager, f10 f10Var) {
        int volumeControlStream;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Object obj = f10Var.f;
            obj.getClass();
            return audioManager.requestAudioFocus((AudioFocusRequest) obj);
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = f10Var.b;
        o00 o00Var = f10Var.d;
        o00Var.getClass();
        if (i >= 26) {
            try {
                volumeControlStream = o00Var.b().getVolumeControlStream();
            } catch (RuntimeException unused) {
            }
        } else {
            if ((o00Var.b & 1) != 1) {
                switch (o00Var.c) {
                    case 2:
                        volumeControlStream = 0;
                        break;
                    case 3:
                        volumeControlStream = 8;
                        break;
                    case 4:
                        volumeControlStream = 4;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        volumeControlStream = 5;
                        break;
                    case 6:
                        volumeControlStream = 2;
                        break;
                    case 11:
                        volumeControlStream = 10;
                        break;
                    case 12:
                    default:
                        volumeControlStream = 3;
                        break;
                    case 13:
                        break;
                }
            }
            volumeControlStream = 1;
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, volumeControlStream, f10Var.a);
    }

    public static void j(RemoteInput.Builder builder, String str) {
        builder.setAllowDataType(str, true);
    }

    public static void k(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void l(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void m(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void n(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void o(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
