package e5;

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
import h5.d0;
import h5.w;
import h7.u;
import j$.util.DesugarCollections;
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
import k7.v8;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class k {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
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
    public static void a(String str, h hVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c3;
        int i10 = hVar.b;
        int length = spannableStringBuilder.length();
        String str2 = hVar.a;
        str2.getClass();
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                for (String str3 : hVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                c(list2, str, hVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, g.c);
                int i11 = hVar.b;
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if ("rt".equals(((g) arrayList.get(i13)).a.a)) {
                        g gVar = (g) arrayList.get(i13);
                        c(list2, str, gVar.a);
                        int i14 = gVar.a.b - i12;
                        int i15 = gVar.b - i12;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i14, i15);
                        spannableStringBuilder.delete(i14, i15);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new z9.d(25), i11, i14, 33);
                        i12 = subSequence.length() + i12;
                        i11 = i14;
                    }
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, hVar);
        for (int i16 = 0; i16 < b10.size(); i16++) {
            d dVar = ((i) b10.get(i16)).b;
            int i17 = dVar.l;
            if (((i17 == -1 && dVar.m == -1) ? -1 : (i17 == 1 ? (char) 1 : (char) 0) | (dVar.m == 1 ? (char) 2 : (char) 0)) != -1) {
                int i18 = dVar.l;
                v8.a(new StyleSpan((i18 == -1 && dVar.m == -1) ? -1 : (i18 == 1 ? 1 : 0) | (dVar.m == 1 ? 2 : 0)), spannableStringBuilder, i10, length);
            }
            if (dVar.j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, length, 33);
            }
            if (dVar.k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (dVar.g) {
                if (!dVar.g) {
                    throw new IllegalStateException("Font color not defined");
                }
                v8.a(new ForegroundColorSpan(dVar.f), spannableStringBuilder, i10, length);
            }
            if (dVar.i) {
                if (!dVar.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                v8.a(new BackgroundColorSpan(dVar.h), spannableStringBuilder, i10, length);
            }
            if (dVar.e != null) {
                v8.a(new TypefaceSpan(dVar.e), spannableStringBuilder, i10, length);
            }
            int i19 = dVar.n;
            if (i19 == 1) {
                v8.a(new AbsoluteSizeSpan((int) dVar.o, true), spannableStringBuilder, i10, length);
            } else if (i19 == 2) {
                v8.a(new RelativeSizeSpan(dVar.o), spannableStringBuilder, i10, length);
            } else if (i19 == 3) {
                v8.a(new RelativeSizeSpan(dVar.o / 100.0f), spannableStringBuilder, i10, length);
            }
            if (dVar.q) {
                spannableStringBuilder.setSpan(new u(25), i10, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, h hVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            String str2 = hVar.a;
            Set set = hVar.d;
            String str3 = hVar.c;
            if (dVar.a.isEmpty() && dVar.b.isEmpty() && dVar.c.isEmpty() && dVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a2 = d.a(d.a(d.a(0, TLObject.FLAG_30, dVar.a, str), 2, dVar.b, str2), 4, dVar.d, str3);
                size = (a2 == -1 || !set.containsAll(dVar.c)) ? 0 : a2 + (dVar.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new i(size, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, h hVar) {
        ArrayList b10 = b(list, str, hVar);
        for (int i10 = 0; i10 < b10.size() && ((i) b10.get(i10)).b.p == -1; i10++) {
        }
    }

    public static e d(String str, Matcher matcher, w wVar, ArrayList arrayList) {
        j jVar = new j();
        try {
            String group = matcher.group(1);
            group.getClass();
            jVar.a = m.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            jVar.b = m.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, jVar);
            StringBuilder sb = new StringBuilder();
            wVar.getClass();
            String h = wVar.h(r8.d.c);
            while (!TextUtils.isEmpty(h)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(h.trim());
                h = wVar.h(r8.d.c);
            }
            jVar.c = f(str, sb.toString(), arrayList);
            return new e(jVar.a().a(), jVar.a, jVar.b);
        } catch (NumberFormatException unused) {
            h5.a.K("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
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
    public static void e(String str, j jVar) {
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
                    g(group2, jVar);
                } else {
                    char c3 = 5;
                    char c10 = 0;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    c10 = 5;
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
                                h5.a.K("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i10 = 2;
                                break;
                        }
                        jVar.d = i10;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            substring.getClass();
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1074341483:
                                    if (substring.equals("middle")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 109757538:
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
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
                                    h5.a.K("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i11 = TLObject.FLAG_31;
                                    break;
                            }
                            jVar.i = i11;
                            group2 = group2.substring(0, indexOf);
                        }
                        jVar.h = m.b(group2);
                    } else if ("size".equals(group)) {
                        jVar.j = m.b(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i12 = 2;
                        } else if (group2.equals("rl")) {
                            i12 = 1;
                        } else {
                            h5.a.K("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i12 = TLObject.FLAG_31;
                        }
                        jVar.k = i12;
                    } else {
                        h5.a.K("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                h5.a.K("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List list) {
        char c3;
        char c10;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String str3 = "";
            if (i10 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (h) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new h("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
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
                            h5.a.K("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
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
                    boolean z4 = str2.charAt(i11) == '/';
                    int indexOf3 = str2.indexOf(62, i11);
                    i11 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i12 = i11 - 2;
                    boolean z10 = str2.charAt(i12) == '/';
                    int i13 = i10 + (z4 ? 2 : 1);
                    if (!z10) {
                        i12 = i11 - 1;
                    }
                    String substring2 = str2.substring(i13, i12);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        h5.a.f(!trim.isEmpty());
                        int i14 = d0.a;
                        String str4 = trim.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case 98:
                                if (str4.equals("b")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 99:
                                if (str4.equals("c")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 105:
                                if (str4.equals("i")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 117:
                                if (str4.equals("u")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 118:
                                if (str4.equals("v")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3650:
                                if (str4.equals("rt")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3314158:
                                if (str4.equals("lang")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 3511770:
                                if (str4.equals("ruby")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (z4) {
                                    while (!arrayDeque.isEmpty()) {
                                        h hVar = (h) arrayDeque.pop();
                                        a(str, hVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new g(hVar, spannableStringBuilder.length()));
                                        }
                                        if (hVar.a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z10) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    h5.a.f(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c10 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c10 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str5 = split[c10];
                                    HashSet hashSet = new HashSet();
                                    for (int i15 = 1; i15 < split.length; i15++) {
                                        hashSet.add(split[i15]);
                                    }
                                    arrayDeque.push(new h(str5, length, str3, hashSet));
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

    public static void g(String str, j jVar) {
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
                    h5.a.K("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = TLObject.FLAG_31;
                    break;
            }
            jVar.g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            jVar.e = m.b(str);
            jVar.f = 0;
        } else {
            jVar.e = Integer.parseInt(str);
            jVar.f = 1;
        }
    }
}
