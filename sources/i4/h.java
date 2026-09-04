package i4;

import android.graphics.Color;
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
import e2.d0;
import e2.v;
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
import v7.p6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public abstract class h {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        int i10;
        int i11;
        int i12;
        int i13 = eVar.b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.a;
        str2.getClass();
        int i14 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i13, length, 33);
                break;
            case 2:
                for (String str3 : eVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i13, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i13, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new d2.h(eVar.c), i13, length, 33);
                break;
            case 7:
                int c11 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.c);
                int i15 = eVar.b;
                int i16 = 0;
                int i17 = 0;
                while (i16 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i16)).a.a)) {
                        d dVar = (d) arrayList.get(i16);
                        int c12 = c(list2, str, dVar.a);
                        if (c12 == i14) {
                            c12 = c11 != i14 ? c11 : 1;
                        }
                        int i18 = dVar.a.b - i17;
                        int i19 = dVar.b - i17;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i18, i19);
                        spannableStringBuilder.delete(i18, i19);
                        spannableStringBuilder.setSpan(new d2.f(subSequence.toString(), c12), i15, i18, 33);
                        i17 = subSequence.length() + i17;
                        i15 = i18;
                    }
                    i16++;
                    i14 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, eVar);
        for (int i20 = 0; i20 < b10.size(); i20++) {
            b bVar = ((f) b10.get(i20)).b;
            int i21 = bVar.l;
            if (i21 == -1 && bVar.m == -1) {
                i10 = -1;
            } else {
                i10 = (bVar.m == 1 ? (char) 2 : (char) 0) | (i21 == 1 ? (char) 1 : (char) 0);
            }
            if (i10 != -1) {
                int i22 = bVar.l;
                if (i22 == -1 && bVar.m == -1) {
                    i12 = -1;
                    i11 = 1;
                } else {
                    i11 = 1;
                    i12 = (i22 == 1 ? 1 : 0) | (bVar.m == 1 ? 2 : 0);
                }
                p6.a(new StyleSpan(i12), spannableStringBuilder, i13, length);
            } else {
                i11 = 1;
            }
            if (bVar.j == i11) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, length, 33);
            }
            if (bVar.k == i11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
            }
            if (bVar.g) {
                if (!bVar.g) {
                    throw new IllegalStateException("Font color not defined");
                }
                p6.a(new ForegroundColorSpan(bVar.f), spannableStringBuilder, i13, length);
            }
            if (bVar.i) {
                if (!bVar.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                p6.a(new BackgroundColorSpan(bVar.h), spannableStringBuilder, i13, length);
            }
            if (bVar.e != null) {
                p6.a(new TypefaceSpan(bVar.e), spannableStringBuilder, i13, length);
            }
            int i23 = bVar.n;
            if (i23 == 1) {
                p6.a(new AbsoluteSizeSpan((int) bVar.o, true), spannableStringBuilder, i13, length);
            } else if (i23 == 2) {
                p6.a(new RelativeSizeSpan(bVar.o), spannableStringBuilder, i13, length);
            } else if (i23 == 3) {
                p6.a(new RelativeSizeSpan(bVar.o / 100.0f), spannableStringBuilder, i13, length);
            }
            if (bVar.q) {
                spannableStringBuilder.setSpan(new d2.e(), i13, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.a;
            Set set = eVar.d;
            String str3 = eVar.c;
            if (bVar.a.isEmpty() && bVar.b.isEmpty() && bVar.c.isEmpty() && bVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a2 = b.a(b.a(b.a(0, TLObject.FLAG_30, bVar.a, str), 2, bVar.b, str2), 4, bVar.d, str3);
                size = (a2 == -1 || !set.containsAll(bVar.c)) ? 0 : a2 + (bVar.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new f(size, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b10 = b(list, str, eVar);
        for (int i10 = 0; i10 < b10.size(); i10++) {
            int i11 = ((f) b10.get(i10)).b.p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, v vVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.a = i.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.b = i.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb2 = new StringBuilder();
            vVar.getClass();
            String k10 = vVar.k(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(k10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(k10.trim());
                k10 = vVar.k(StandardCharsets.UTF_8);
            }
            gVar.c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.a, gVar.b);
        } catch (IllegalArgumentException unused) {
            e2.a.n("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0083, code lost:
    
        if (r6.equals("center") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:
    
        if (r7.equals("start") == false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, g gVar) {
        int i10;
        int i11;
        int i12;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, gVar);
                } else {
                    char c10 = 5;
                    char c11 = 0;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    c11 = 1;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    c11 = 2;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    c11 = 3;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    c11 = 4;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    c11 = 5;
                                    break;
                                }
                                c11 = 65535;
                                break;
                            default:
                                c11 = 65535;
                                break;
                        }
                        switch (c11) {
                            case 0:
                            case 1:
                                i10 = 2;
                                break;
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                                i10 = 4;
                                break;
                            case 4:
                                i10 = 5;
                                break;
                            case 5:
                                i10 = 1;
                                break;
                            default:
                                e2.a.n("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i10 = 2;
                                break;
                        }
                        gVar.d = i10;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            substring.getClass();
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c10 = 3;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c10 = 65535;
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                case 5:
                                    i11 = 0;
                                    break;
                                case 1:
                                case 3:
                                    i11 = 1;
                                    break;
                                case 2:
                                case 4:
                                    i11 = 2;
                                    break;
                                default:
                                    e2.a.n("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i11 = TLObject.FLAG_31;
                                    break;
                            }
                            gVar.i = i11;
                            group2 = group2.substring(0, indexOf);
                        }
                        gVar.h = i.b(group2);
                    } else if ("size".equals(group)) {
                        gVar.j = i.b(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i12 = 2;
                        } else if (group2.equals("rl")) {
                            i12 = 1;
                        } else {
                            e2.a.n("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i12 = TLObject.FLAG_31;
                        }
                        gVar.k = i12;
                    } else {
                        e2.a.n("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                e2.a.n("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List list) {
        char c10;
        char c11;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String str3 = "";
            if (i10 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i10);
            if (charAt == '&') {
                i10++;
                int indexOf = str2.indexOf(59, i10);
                int indexOf2 = str2.indexOf(32, i10);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i10, indexOf);
                    substring.getClass();
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
                            e2.a.n("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i10++;
            } else {
                int i11 = i10 + 1;
                if (i11 < str2.length()) {
                    boolean z10 = str2.charAt(i11) == '/';
                    int indexOf3 = str2.indexOf(62, i11);
                    i11 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i12 = i11 - 2;
                    boolean z11 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i12 = i11 - 1;
                    }
                    String substring2 = str2.substring(i13, i12);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        e2.d.b(!trim.isEmpty());
                        String str4 = d0.a;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case 98:
                                if (str5.equals("b")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 99:
                                if (str5.equals("c")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 105:
                                if (str5.equals("i")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 117:
                                if (str5.equals("u")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 118:
                                if (str5.equals("v")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3650:
                                if (str5.equals("rt")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3314158:
                                if (str5.equals("lang")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3511770:
                                if (str5.equals("ruby")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z10) {
                                    while (!arrayDeque.isEmpty()) {
                                        e eVar = (e) arrayDeque.pop();
                                        a(str, eVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                        }
                                        if (eVar.a.equals(str5)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z11) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    e2.d.b(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c11 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c11 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c11];
                                    HashSet hashSet = new HashSet();
                                    for (int i14 = 1; i14 < split.length; i14++) {
                                        hashSet.add(split[i14]);
                                    }
                                    arrayDeque.push(new e(str6, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i10 = i11;
            }
        }
    }

    public static void g(String str, g gVar) {
        String substring;
        int i10;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            i10 = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    e2.a.n("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = TLObject.FLAG_31;
                    break;
            }
            gVar.g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.e = i.b(str);
            gVar.f = 0;
        } else {
            gVar.e = Integer.parseInt(str);
            gVar.f = 1;
        }
    }
}
