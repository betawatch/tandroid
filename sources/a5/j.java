package a5;

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
import d5.f0;
import d5.y;
import d7.u;
import g7.y7;
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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j {
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
    public static void a(String str, g gVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        int i9;
        int i10 = gVar.b;
        int length = spannableStringBuilder.length();
        String str2 = gVar.a;
        str2.getClass();
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
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                for (String str3 : gVar.d) {
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
                c(list2, str, gVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, f.c);
                int i11 = gVar.b;
                int i12 = 0;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if ("rt".equals(((f) arrayList.get(i13)).a.a)) {
                        f fVar = (f) arrayList.get(i13);
                        c(list2, str, fVar.a);
                        int i14 = fVar.a.b - i12;
                        int i15 = fVar.b - i12;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i14, i15);
                        spannableStringBuilder.delete(i14, i15);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new u(23), i11, i14, 33);
                        i12 += subSequence.length();
                        i11 = i14;
                    }
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, gVar);
        for (int i16 = 0; i16 < b10.size(); i16++) {
            c cVar = ((h) b10.get(i16)).b;
            int i17 = cVar.l;
            if (i17 == -1 && cVar.m == -1) {
                i9 = -1;
            } else {
                i9 = (cVar.m == 1 ? (char) 2 : (char) 0) | (i17 == 1 ? (char) 1 : (char) 0);
            }
            if (i9 != -1) {
                int i18 = cVar.l;
                y7.a(new StyleSpan((i18 == -1 && cVar.m == -1) ? -1 : (i18 == 1 ? 1 : 0) | (cVar.m == 1 ? 2 : 0)), spannableStringBuilder, i10, length);
            }
            if (cVar.j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, length, 33);
            }
            if (cVar.k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (cVar.g) {
                if (!cVar.g) {
                    throw new IllegalStateException("Font color not defined");
                }
                y7.a(new ForegroundColorSpan(cVar.f), spannableStringBuilder, i10, length);
            }
            if (cVar.i) {
                if (!cVar.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                y7.a(new BackgroundColorSpan(cVar.h), spannableStringBuilder, i10, length);
            }
            if (cVar.e != null) {
                y7.a(new TypefaceSpan(cVar.e), spannableStringBuilder, i10, length);
            }
            int i19 = cVar.n;
            if (i19 == 1) {
                y7.a(new AbsoluteSizeSpan((int) cVar.o, true), spannableStringBuilder, i10, length);
            } else if (i19 == 2) {
                y7.a(new RelativeSizeSpan(cVar.o), spannableStringBuilder, i10, length);
            } else if (i19 == 3) {
                y7.a(new RelativeSizeSpan(cVar.o / 100.0f), spannableStringBuilder, i10, length);
            }
            if (cVar.q) {
                spannableStringBuilder.setSpan(new za.a(22), i10, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, g gVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            c cVar = (c) list.get(i9);
            String str2 = gVar.a;
            Set set = gVar.d;
            String str3 = gVar.c;
            if (cVar.a.isEmpty() && cVar.b.isEmpty() && cVar.c.isEmpty() && cVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a2 = c.a(c.a(c.a(0, TLObject.FLAG_30, cVar.a, str), 2, cVar.b, str2), 4, cVar.d, str3);
                size = (a2 == -1 || !set.containsAll(cVar.c)) ? 0 : a2 + (cVar.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new h(size, cVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, g gVar) {
        ArrayList b10 = b(list, str, gVar);
        for (int i9 = 0; i9 < b10.size() && ((h) b10.get(i9)).b.p == -1; i9++) {
        }
    }

    public static d d(String str, Matcher matcher, y yVar, ArrayList arrayList) {
        i iVar = new i();
        try {
            String group = matcher.group(1);
            group.getClass();
            iVar.a = l.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            iVar.b = l.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, iVar);
            StringBuilder sb2 = new StringBuilder();
            yVar.getClass();
            String f10 = yVar.f(n8.d.c);
            while (!TextUtils.isEmpty(f10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(f10.trim());
                f10 = yVar.f(n8.d.c);
            }
            iVar.c = f(str, sb2.toString(), arrayList);
            return new d(iVar.a().a(), iVar.a, iVar.b);
        } catch (NumberFormatException unused) {
            d5.a.K("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
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
    public static void e(String str, i iVar) {
        int i9;
        int i10;
        int i11;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    g(group2, iVar);
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
                                i9 = 2;
                                break;
                            case 2:
                                i9 = 3;
                                break;
                            case 3:
                                i9 = 4;
                                break;
                            case 4:
                                i9 = 5;
                                break;
                            case 5:
                                i9 = 1;
                                break;
                            default:
                                d5.a.K("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i9 = 2;
                                break;
                        }
                        iVar.d = i9;
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
                                    i10 = 0;
                                    break;
                                case 1:
                                case 3:
                                    i10 = 1;
                                    break;
                                case 2:
                                case 4:
                                    i10 = 2;
                                    break;
                                default:
                                    d5.a.K("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i10 = TLObject.FLAG_31;
                                    break;
                            }
                            iVar.i = i10;
                            group2 = group2.substring(0, indexOf);
                        }
                        iVar.h = l.b(group2);
                    } else if ("size".equals(group)) {
                        iVar.j = l.b(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i11 = 2;
                        } else if (group2.equals("rl")) {
                            i11 = 1;
                        } else {
                            d5.a.K("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i11 = TLObject.FLAG_31;
                        }
                        iVar.k = i11;
                    } else {
                        d5.a.K("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                d5.a.K("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
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
        int i9 = 0;
        while (true) {
            String str3 = "";
            if (i9 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (g) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new g("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i9);
            if (charAt == '&') {
                i9++;
                int indexOf = str2.indexOf(59, i9);
                int indexOf2 = str2.indexOf(32, i9);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i9, indexOf);
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
                            d5.a.K("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i9 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i9++;
            } else {
                int i10 = i9 + 1;
                if (i10 < str2.length()) {
                    boolean z10 = str2.charAt(i10) == '/';
                    int indexOf3 = str2.indexOf(62, i10);
                    i10 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i11 = i10 - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i9 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = i10 - 1;
                    }
                    String substring2 = str2.substring(i12, i11);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        d5.a.f(!trim.isEmpty());
                        int i13 = f0.a;
                        String str4 = trim.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case 98:
                                if (str4.equals("b")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 99:
                                if (str4.equals("c")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 105:
                                if (str4.equals("i")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 117:
                                if (str4.equals("u")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 118:
                                if (str4.equals("v")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3650:
                                if (str4.equals("rt")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3314158:
                                if (str4.equals("lang")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3511770:
                                if (str4.equals("ruby")) {
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
                                        g gVar = (g) arrayDeque.pop();
                                        a(str, gVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new f(gVar, spannableStringBuilder.length()));
                                        }
                                        if (gVar.a.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z11) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    d5.a.f(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c11 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c11 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str5 = split[c11];
                                    HashSet hashSet = new HashSet();
                                    for (int i14 = 1; i14 < split.length; i14++) {
                                        hashSet.add(split[i14]);
                                    }
                                    arrayDeque.push(new g(str5, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i9 = i10;
            }
        }
    }

    public static void g(String str, i iVar) {
        String substring;
        int i9;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            i9 = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i9 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i9 = 0;
                    break;
                default:
                    d5.a.K("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i9 = TLObject.FLAG_31;
                    break;
            }
            iVar.g = i9;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            iVar.e = l.b(str);
            iVar.f = 0;
        } else {
            iVar.e = Integer.parseInt(str);
            iVar.f = 1;
        }
    }
}
