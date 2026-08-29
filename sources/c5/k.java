package c5;

import android.text.TextUtils;
import f5.d0;
import f5.w;
import i7.n6;
import j3.t1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class k extends t4.e {
    public final w b;
    public final b c;

    public k() {
        super("WebvttDecoder");
        this.b = new w();
        this.c = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a6, code lost:
    
        r2.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x010e, code lost:
    
        if (")".equals(c5.b.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // t4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t4.f c(int i10, boolean z10, byte[] bArr) {
        d dVar;
        String str;
        String str2;
        String sb2;
        char c3;
        int i11;
        k kVar = this;
        w wVar = kVar.b;
        wVar.A(i10, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            l.d(wVar);
            while (!TextUtils.isEmpty(wVar.f(p8.d.c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r42 = 0;
                int i12 = -1;
                char c6 = 65535;
                int i13 = 0;
                while (true) {
                    int i14 = 1;
                    if (c6 == 65535) {
                        i13 = wVar.b;
                        String f9 = wVar.f(p8.d.c);
                        c6 = f9 == null ? (char) 0 : "STYLE".equals(f9) ? (char) 2 : f9.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        wVar.C(i13);
                        if (c6 == 0) {
                            return new androidx.biometric.e(arrayList2);
                        }
                        if (c6 == 1) {
                            while (!TextUtils.isEmpty(wVar.f(p8.d.c))) {
                            }
                        } else {
                            String str3 = null;
                            if (c6 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new t4.h("A style block was found after the first cue.");
                                }
                                wVar.f(p8.d.c);
                                b bVar = kVar.c;
                                w wVar2 = bVar.a;
                                StringBuilder sb3 = bVar.b;
                                sb3.setLength(0);
                                int i15 = wVar.b;
                                while (!TextUtils.isEmpty(wVar.f(p8.d.c))) {
                                }
                                wVar2.A(wVar.b, wVar.a);
                                wVar2.C(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    b.c(wVar2);
                                    if (wVar2.a() >= 5 && "::cue".equals(wVar2.p(5, p8.d.c))) {
                                        int i16 = wVar2.b;
                                        String b10 = b.b(wVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                wVar2.C(i16);
                                                str2 = "";
                                            } else {
                                                if ("(".equals(b10)) {
                                                    int i17 = wVar2.b;
                                                    int i18 = wVar2.c;
                                                    boolean z11 = false;
                                                    while (i17 < i18 && !z11) {
                                                        int i19 = i17 + 1;
                                                        z11 = ((char) wVar2.a[i17]) == ')';
                                                        i17 = i19;
                                                    }
                                                    str = wVar2.p((i17 - 1) - wVar2.b, p8.d.c).trim();
                                                } else {
                                                    str = str3;
                                                }
                                                str2 = str;
                                            }
                                            if (str2 == 0 && "{".equals(b.b(wVar2, sb3))) {
                                                c cVar = new c();
                                                cVar.a = "";
                                                cVar.b = "";
                                                cVar.c = Collections.EMPTY_SET;
                                                cVar.d = "";
                                                cVar.e = str3;
                                                cVar.g = r42;
                                                cVar.i = r42;
                                                cVar.j = i12;
                                                cVar.k = i12;
                                                cVar.l = i12;
                                                cVar.m = i12;
                                                cVar.n = i12;
                                                cVar.p = i12;
                                                cVar.q = r42;
                                                if (!"".equals(str2)) {
                                                    int indexOf = str2.indexOf(91);
                                                    String str4 = str2;
                                                    if (indexOf != i12) {
                                                        Matcher matcher = b.c.matcher(str2.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i14);
                                                            group.getClass();
                                                            cVar.d = group;
                                                        }
                                                        str4 = str2.substring(r42, indexOf);
                                                    }
                                                    int i20 = d0.a;
                                                    String[] split = str4.split("\\.", i12);
                                                    String str5 = split[r42];
                                                    int indexOf2 = str5.indexOf(35);
                                                    if (indexOf2 != i12) {
                                                        cVar.b = str5.substring(r42, indexOf2);
                                                        cVar.a = str5.substring(indexOf2 + 1);
                                                    } else {
                                                        cVar.b = str5;
                                                    }
                                                    if (split.length > i14) {
                                                        int length = split.length;
                                                        f5.a.f(length <= split.length);
                                                        cVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i14, length)));
                                                    }
                                                }
                                                boolean z12 = false;
                                                String str6 = null;
                                                while (!z12) {
                                                    int i21 = wVar2.b;
                                                    str6 = b.b(wVar2, sb3);
                                                    boolean z13 = str6 == null || "}".equals(str6);
                                                    if (!z13) {
                                                        wVar2.C(i21);
                                                        b.c(wVar2);
                                                        String a2 = b.a(wVar2, sb3);
                                                        if (!"".equals(a2) && ":".equals(b.b(wVar2, sb3))) {
                                                            b.c(wVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z14 = false;
                                                            while (true) {
                                                                if (z14) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i22 = wVar2.b;
                                                                    boolean z15 = z14;
                                                                    String b11 = b.b(wVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        wVar2.C(i22);
                                                                        z14 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                        z14 = z15;
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !"".equals(sb2)) {
                                                                int i23 = wVar2.b;
                                                                String b12 = b.b(wVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        wVar2.C(i23);
                                                                    }
                                                                }
                                                                if ("color".equals(a2)) {
                                                                    cVar.f = f5.b.a(sb2, true);
                                                                    cVar.g = true;
                                                                } else if ("background-color".equals(a2)) {
                                                                    cVar.h = f5.b.a(sb2, true);
                                                                    cVar.i = true;
                                                                } else if ("ruby-position".equals(a2)) {
                                                                    if ("over".equals(sb2)) {
                                                                        cVar.p = 1;
                                                                    } else if ("under".equals(sb2)) {
                                                                        cVar.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a2)) {
                                                                    cVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                } else if ("text-decoration".equals(a2)) {
                                                                    if ("underline".equals(sb2)) {
                                                                        cVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a2)) {
                                                                    cVar.e = n6.b(sb2);
                                                                } else if ("font-weight".equals(a2)) {
                                                                    if ("bold".equals(sb2)) {
                                                                        cVar.l = 1;
                                                                    }
                                                                } else if ("font-style".equals(a2)) {
                                                                    if ("italic".equals(sb2)) {
                                                                        cVar.m = 1;
                                                                    }
                                                                } else if ("font-size".equals(a2)) {
                                                                    Matcher matcher2 = b.d.matcher(n6.b(sb2));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        switch (group2.hashCode()) {
                                                                            case 37:
                                                                                if (group2.equals("%")) {
                                                                                    c3 = 0;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3240:
                                                                                if (group2.equals("em")) {
                                                                                    c3 = 1;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3592:
                                                                                if (group2.equals("px")) {
                                                                                    c3 = 2;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        c3 = 65535;
                                                                        switch (c3) {
                                                                            case 0:
                                                                                i11 = 1;
                                                                                cVar.n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i11 = 1;
                                                                                cVar.n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i11 = 1;
                                                                                cVar.n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String group3 = matcher2.group(i11);
                                                                        group3.getClass();
                                                                        cVar.o = Float.parseFloat(group3);
                                                                        z12 = z13;
                                                                    } else {
                                                                        f5.a.K("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z12 = z13;
                                                }
                                                if ("}".equals(str6)) {
                                                    arrayList3.add(cVar);
                                                }
                                                r42 = 0;
                                                i12 = -1;
                                                str3 = null;
                                                i14 = 1;
                                            }
                                        }
                                    }
                                    str2 = str3;
                                    if (str2 == 0) {
                                    }
                                }
                            } else if (c6 == 3) {
                                Pattern pattern = j.a;
                                Charset charset = p8.d.c;
                                String f10 = wVar.f(charset);
                                if (f10 == null) {
                                    dVar = null;
                                } else {
                                    Pattern pattern2 = j.a;
                                    Matcher matcher3 = pattern2.matcher(f10);
                                    if (matcher3.matches()) {
                                        dVar = j.d(null, matcher3, wVar, arrayList);
                                    } else {
                                        dVar = null;
                                        String f11 = wVar.f(charset);
                                        if (f11 != null) {
                                            Matcher matcher4 = pattern2.matcher(f11);
                                            if (matcher4.matches()) {
                                                dVar = j.d(f10.trim(), matcher4, wVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (dVar != null) {
                                    arrayList2.add(dVar);
                                }
                            }
                            kVar = this;
                        }
                    }
                }
            }
        } catch (t1 e10) {
            throw new t4.h(e10);
        }
    }
}
