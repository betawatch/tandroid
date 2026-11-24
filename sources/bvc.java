// default package

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class bvc {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", -1);
        hashMap.put("lime", -16711936);
        hashMap.put("cyan", -16711681);
        hashMap.put("red", -65536);
        hashMap.put("yellow", -256);
        hashMap.put("magenta", -65281);
        hashMap.put("blue", -16776961);
        hashMap.put("black", -16777216);
        c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", -1);
        hashMap2.put("bg_lime", -16711936);
        hashMap2.put("bg_cyan", -16711681);
        hashMap2.put("bg_red", -65536);
        hashMap2.put("bg_yellow", -256);
        hashMap2.put("bg_magenta", -65281);
        hashMap2.put("bg_blue", -16776961);
        hashMap2.put("bg_black", -16777216);
        d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, yuc yucVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i;
        int i2;
        int i3;
        int i4 = yucVar.b;
        int length = spannableStringBuilder.length();
        String str2 = yucVar.a;
        str2.getClass();
        int i5 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case kk7.i1 /* 98 */:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case kk7.j1 /* 99 */:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case kk7.p1 /* 105 */:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case kk7.B1 /* 117 */:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case kk7.C1 /* 118 */:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i4, length, 33);
                break;
            case 2:
                for (String str3 : yucVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i4, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i4, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new njc(yucVar.c), i4, length, 33);
                break;
            case 7:
                int c3 = c(list2, str, yucVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, xuc.c);
                int i6 = yucVar.b;
                int i7 = 0;
                int i8 = 0;
                while (i7 < arrayList.size()) {
                    if ("rt".equals(((xuc) arrayList.get(i7)).a.a)) {
                        xuc xucVar = (xuc) arrayList.get(i7);
                        int c4 = c(list2, str, xucVar.a);
                        if (c4 == i5) {
                            c4 = c3 != i5 ? c3 : 1;
                        }
                        int i9 = xucVar.a.b - i8;
                        int i10 = xucVar.b - i8;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i9, i10);
                        spannableStringBuilder.delete(i9, i10);
                        spannableStringBuilder.setSpan(new co9(subSequence.toString(), c4), i6, i9, 33);
                        i8 = subSequence.length() + i8;
                        i6 = i9;
                    }
                    i7++;
                    i5 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, yucVar);
        for (int i11 = 0; i11 < b2.size(); i11++) {
            vuc vucVar = ((zuc) b2.get(i11)).b;
            int i12 = vucVar.l;
            if (i12 == -1 && vucVar.m == -1) {
                i = -1;
            } else {
                i = (vucVar.m == 1 ? (char) 2 : (char) 0) | (i12 == 1 ? (char) 1 : (char) 0);
            }
            if (i != -1) {
                int i13 = vucVar.l;
                if (i13 == -1 && vucVar.m == -1) {
                    i3 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = (i13 == 1 ? 1 : 0) | (vucVar.m == 1 ? 2 : 0);
                }
                iue.a(spannableStringBuilder, new StyleSpan(i3), i4, length);
            } else {
                i2 = 1;
            }
            if (vucVar.j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i4, length, 33);
            }
            if (vucVar.k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
            }
            if (vucVar.g) {
                if (!vucVar.g) {
                    sc8.j("Font color not defined");
                    return;
                }
                iue.a(spannableStringBuilder, new ForegroundColorSpan(vucVar.f), i4, length);
            }
            if (vucVar.i) {
                if (!vucVar.i) {
                    sc8.j("Background color not defined.");
                    return;
                }
                iue.a(spannableStringBuilder, new BackgroundColorSpan(vucVar.h), i4, length);
            }
            if (vucVar.e != null) {
                iue.a(spannableStringBuilder, new TypefaceSpan(vucVar.e), i4, length);
            }
            int i14 = vucVar.n;
            if (i14 == 1) {
                iue.a(spannableStringBuilder, new AbsoluteSizeSpan((int) vucVar.o, true), i4, length);
            } else if (i14 == 2) {
                iue.a(spannableStringBuilder, new RelativeSizeSpan(vucVar.o), i4, length);
            } else if (i14 == 3) {
                iue.a(spannableStringBuilder, new RelativeSizeSpan(vucVar.o / 100.0f), i4, length);
            }
            if (vucVar.q) {
                spannableStringBuilder.setSpan(new yf5(), i4, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, yuc yucVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            vuc vucVar = (vuc) list.get(i);
            String str2 = yucVar.a;
            Set set = yucVar.d;
            String str3 = yucVar.c;
            if (vucVar.a.isEmpty() && vucVar.b.isEmpty() && vucVar.c.isEmpty() && vucVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a2 = vuc.a(vuc.a(vuc.a(0, TLObject.FLAG_30, vucVar.a, str), 2, vucVar.b, str2), 4, vucVar.d, str3);
                size = (a2 == -1 || !set.containsAll(vucVar.c)) ? 0 : a2 + (vucVar.c.size() << 2);
            }
            if (size > 0) {
                arrayList.add(new zuc(size, vucVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, yuc yucVar) {
        ArrayList b2 = b(list, str, yucVar);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((zuc) b2.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static wuc d(String str, Matcher matcher, xu7 xu7Var, ArrayList arrayList) {
        avc avcVar = new avc();
        try {
            String group = matcher.group(1);
            group.getClass();
            avcVar.a = dvc.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            avcVar.b = dvc.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, avcVar);
            StringBuilder sb = new StringBuilder();
            String n = xu7Var.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n.trim());
                n = xu7Var.n(StandardCharsets.UTF_8);
            }
            avcVar.c = f(str, sb.toString(), arrayList);
            return new wuc(avcVar.a().a(), avcVar.a, avcVar.b);
        } catch (IllegalArgumentException unused) {
            lad.f("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x007b, code lost:
    
        if (r6.equals("center") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r7.equals("start") == false) goto L66;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, avc avcVar) {
        byte b2;
        int i;
        int i2;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, avcVar);
                } else {
                    char c2 = 5;
                    boolean z = false;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    z = true;
                                    break;
                                }
                                z = -1;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    z = 2;
                                    break;
                                }
                                z = -1;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    z = 3;
                                    break;
                                }
                                z = -1;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    z = 4;
                                    break;
                                }
                                z = -1;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    z = 5;
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
                            case true:
                                b2 = 2;
                                break;
                            case true:
                                b2 = 3;
                                break;
                            case true:
                                b2 = 4;
                                break;
                            case true:
                                b2 = 5;
                                break;
                            case true:
                                b2 = 1;
                                break;
                            default:
                                lad.f("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                b2 = 2;
                                break;
                        }
                        avcVar.d = b2;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                case 5:
                                    i = 0;
                                    break;
                                case 1:
                                case 3:
                                    i = 1;
                                    break;
                                case 2:
                                case 4:
                                    i = 2;
                                    break;
                                default:
                                    lad.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i = Integer.MIN_VALUE;
                                    break;
                            }
                            avcVar.i = i;
                            group2 = group2.substring(0, indexOf);
                        }
                        avcVar.h = dvc.b(group2);
                    } else if ("size".equals(group)) {
                        avcVar.j = dvc.b(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i2 = 2;
                        } else if (group2.equals("rl")) {
                            i2 = 1;
                        } else {
                            lad.f("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i2 = Integer.MIN_VALUE;
                        }
                        avcVar.k = i2;
                    } else {
                        lad.f("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                lad.f("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List list) {
        char c2;
        char c3;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str3 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (yuc) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new yuc("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i, indexOf);
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            lad.f("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i4, i3);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        gre.f(!trim.isEmpty());
                        String str4 = g8c.a;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case kk7.i1 /* 98 */:
                                if (str5.equals("b")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case kk7.j1 /* 99 */:
                                if (str5.equals("c")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case kk7.p1 /* 105 */:
                                if (str5.equals("i")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case kk7.B1 /* 117 */:
                                if (str5.equals("u")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case kk7.C1 /* 118 */:
                                if (str5.equals("v")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3650:
                                if (str5.equals("rt")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3314158:
                                if (str5.equals("lang")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3511770:
                                if (str5.equals("ruby")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z) {
                                    while (!arrayDeque.isEmpty()) {
                                        yuc yucVar = (yuc) arrayDeque.pop();
                                        a(str, yucVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new xuc(yucVar, spannableStringBuilder.length()));
                                        }
                                        if (yucVar.a.equals(str5)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z2) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    gre.f(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c3 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c3 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c3];
                                    HashSet hashSet = new HashSet();
                                    for (int i5 = 1; i5 < split.length; i5++) {
                                        hashSet.add(split[i5]);
                                    }
                                    arrayDeque.push(new yuc(str6, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = i2;
            }
        }
    }

    public static void g(String str, avc avcVar) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            i = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    lad.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = TLObject.FLAG_31;
                    break;
            }
            avcVar.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            avcVar.e = dvc.b(str);
            avcVar.f = false;
        } else {
            avcVar.e = Integer.parseInt(str);
            avcVar.f = true;
        }
    }
}
