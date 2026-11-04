package k4;

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
import b8.vb;
import b8.zb;
import g2.n0;
import g2.y;
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
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(hs.e4, hs.e4, hs.e4)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, hs.e4, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, hs.e4, hs.e4)));
        hashMap.put("red", Integer.valueOf(Color.rgb(hs.e4, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(hs.e4, hs.e4, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(hs.e4, 0, hs.e4)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, hs.e4)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(hs.e4, hs.e4, hs.e4)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, hs.e4, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, hs.e4, hs.e4)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(hs.e4, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(hs.e4, hs.e4, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(hs.e4, 0, hs.e4)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, hs.e4)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        int i3;
        int i10;
        int i11;
        int i12 = eVar.b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.a;
        str2.getClass();
        int i13 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case hs.j1 /* 98 */:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case hs.k1 /* 99 */:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case hs.q1 /* 105 */:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case hs.C1 /* 117 */:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case hs.D1 /* 118 */:
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
                spannableStringBuilder.setSpan(new StyleSpan(1), i12, length, 33);
                break;
            case 2:
                for (String str3 : eVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i12, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i12, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new f2.h(eVar.c), i12, length, 33);
                break;
            case 7:
                int c10 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.c);
                int i14 = eVar.b;
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i15)).a.a)) {
                        d dVar = (d) arrayList.get(i15);
                        int c11 = c(list2, str, dVar.a);
                        if (c11 == i13) {
                            c11 = c10 != i13 ? c10 : 1;
                        }
                        int i17 = dVar.a.b - i16;
                        int i18 = dVar.b - i16;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i17, i18);
                        spannableStringBuilder.delete(i17, i18);
                        spannableStringBuilder.setSpan(new f2.f(subSequence.toString(), c11), i14, i17, 33);
                        i16 = subSequence.length() + i16;
                        i14 = i17;
                    }
                    i15++;
                    i13 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, eVar);
        for (int i19 = 0; i19 < b10.size(); i19++) {
            b bVar = ((f) b10.get(i19)).b;
            int i20 = bVar.l;
            if (i20 == -1 && bVar.m == -1) {
                i3 = -1;
            } else {
                i3 = (bVar.m == 1 ? (char) 2 : (char) 0) | (i20 == 1 ? (char) 1 : (char) 0);
            }
            if (i3 != -1) {
                int i21 = bVar.l;
                if (i21 == -1 && bVar.m == -1) {
                    i11 = -1;
                    i10 = 1;
                } else {
                    i10 = 1;
                    i11 = (i21 == 1 ? 1 : 0) | (bVar.m == 1 ? 2 : 0);
                }
                vb.a(spannableStringBuilder, new StyleSpan(i11), i12, length);
            } else {
                i10 = 1;
            }
            if (bVar.j == i10) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i12, length, 33);
            }
            if (bVar.k == i10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
            }
            if (bVar.g) {
                if (!bVar.g) {
                    throw new IllegalStateException("Font color not defined");
                }
                vb.a(spannableStringBuilder, new ForegroundColorSpan(bVar.f), i12, length);
            }
            if (bVar.i) {
                if (!bVar.i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                vb.a(spannableStringBuilder, new BackgroundColorSpan(bVar.h), i12, length);
            }
            if (bVar.e != null) {
                vb.a(spannableStringBuilder, new TypefaceSpan(bVar.e), i12, length);
            }
            int i22 = bVar.n;
            if (i22 == 1) {
                vb.a(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.o, true), i12, length);
            } else if (i22 == 2) {
                vb.a(spannableStringBuilder, new RelativeSizeSpan(bVar.o), i12, length);
            } else if (i22 == 3) {
                vb.a(spannableStringBuilder, new RelativeSizeSpan(bVar.o / 100.0f), i12, length);
            }
            if (bVar.q) {
                spannableStringBuilder.setSpan(new f2.e(), i12, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, e eVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            b bVar = (b) list.get(i3);
            String str2 = eVar.a;
            Set set = eVar.d;
            String str3 = eVar.c;
            if (bVar.a.isEmpty() && bVar.b.isEmpty() && bVar.c.isEmpty() && bVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int a10 = b.a(b.a(b.a(0, TLObject.FLAG_30, bVar.a, str), 2, bVar.b, str2), 4, bVar.d, str3);
                size = (a10 == -1 || !set.containsAll(bVar.c)) ? 0 : a10 + (bVar.c.size() * 4);
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
        for (int i3 = 0; i3 < b10.size(); i3++) {
            int i10 = ((f) b10.get(i3)).b.p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, y yVar, ArrayList arrayList) {
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
            yVar.getClass();
            String n4 = yVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n4)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(n4.trim());
                n4 = yVar.n(StandardCharsets.UTF_8);
            }
            gVar.c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.a, gVar.b);
        } catch (IllegalArgumentException unused) {
            g2.a.l("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0081, code lost:
    
        if (r6.equals("center") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
    
        if (r7.equals("start") == false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(String str, g gVar) {
        int i3;
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
                    g(group2, gVar);
                } else {
                    char c2 = 5;
                    boolean z10 = false;
                    if ("align".equals(group)) {
                        switch (group2.hashCode()) {
                            case -1364013995:
                                break;
                            case -1074341483:
                                if (group2.equals("middle")) {
                                    z10 = true;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 100571:
                                if (group2.equals("end")) {
                                    z10 = 2;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 3317767:
                                if (group2.equals("left")) {
                                    z10 = 3;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 108511772:
                                if (group2.equals("right")) {
                                    z10 = 4;
                                    break;
                                }
                                z10 = -1;
                                break;
                            case 109757538:
                                if (group2.equals("start")) {
                                    z10 = 5;
                                    break;
                                }
                                z10 = -1;
                                break;
                            default:
                                z10 = -1;
                                break;
                        }
                        switch (z10) {
                            case false:
                            case true:
                                i3 = 2;
                                break;
                            case true:
                                i3 = 3;
                                break;
                            case true:
                                i3 = 4;
                                break;
                            case true:
                                i3 = 5;
                                break;
                            case true:
                                i3 = 1;
                                break;
                            default:
                                g2.a.l("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i3 = 2;
                                break;
                        }
                        gVar.d = i3;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            substring.getClass();
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
                                    g2.a.l("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                                    i10 = Integer.MIN_VALUE;
                                    break;
                            }
                            gVar.i = i10;
                            group2 = group2.substring(0, indexOf);
                        }
                        gVar.h = i.b(group2);
                    } else if ("size".equals(group)) {
                        gVar.j = i.b(group2);
                    } else if ("vertical".equals(group)) {
                        if (group2.equals("lr")) {
                            i11 = 2;
                        } else if (group2.equals("rl")) {
                            i11 = 1;
                        } else {
                            g2.a.l("WebvttCueParser", "Invalid 'vertical' value: ".concat(group2));
                            i11 = Integer.MIN_VALUE;
                        }
                        gVar.k = i11;
                    } else {
                        g2.a.l("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                    }
                }
            } catch (NumberFormatException unused) {
                g2.a.l("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List list) {
        char c2;
        char c10;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            String str3 = "";
            if (i3 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i3);
            if (charAt == '&') {
                i3++;
                int indexOf = str2.indexOf(59, i3);
                int indexOf2 = str2.indexOf(32, i3);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i3, indexOf);
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
                            g2.a.l("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i3 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i3++;
            } else {
                int i10 = i3 + 1;
                if (i10 < str2.length()) {
                    boolean z10 = str2.charAt(i10) == '/';
                    int indexOf3 = str2.indexOf(62, i10);
                    i10 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i11 = i10 - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i3 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = i10 - 1;
                    }
                    String substring2 = str2.substring(i12, i11);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        zb.f(!trim.isEmpty());
                        String str4 = n0.a;
                        String str5 = trim.split("[ \\.]", 2)[0];
                        str5.getClass();
                        switch (str5.hashCode()) {
                            case hs.j1 /* 98 */:
                                if (str5.equals("b")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case hs.k1 /* 99 */:
                                if (str5.equals("c")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case hs.q1 /* 105 */:
                                if (str5.equals("i")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case hs.C1 /* 117 */:
                                if (str5.equals("u")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case hs.D1 /* 118 */:
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
                                    zb.f(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c10 = 0;
                                    } else {
                                        str3 = trim2.substring(indexOf4).trim();
                                        c10 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] split = trim2.split("\\.", -1);
                                    String str6 = split[c10];
                                    HashSet hashSet = new HashSet();
                                    for (int i13 = 1; i13 < split.length; i13++) {
                                        hashSet.add(split[i13]);
                                    }
                                    arrayDeque.push(new e(str6, length, str3, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i3 = i10;
            }
        }
    }

    public static void g(String str, g gVar) {
        String substring;
        int i3;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            i3 = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i3 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i3 = 0;
                    break;
                default:
                    g2.a.l("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i3 = TLObject.FLAG_31;
                    break;
            }
            gVar.g = i3;
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
