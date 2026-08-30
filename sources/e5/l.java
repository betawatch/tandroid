package e5;

import android.text.TextUtils;
import h5.d0;
import h5.w;
import j3.r1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.z6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class l extends v4.e {
    public final w n;
    public final c o;

    public l() {
        super("WebvttDecoder");
        this.n = new w();
        this.o = new c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a6, code lost:
    
        r2.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x010e, code lost:
    
        if (")".equals(e5.c.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // v4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v4.f k(int i10, boolean z4, byte[] bArr) {
        e eVar;
        String str;
        String str2;
        String sb;
        char c3;
        int i11;
        l lVar = this;
        w wVar = lVar.n;
        wVar.D(i10, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            m.d(wVar);
            while (!TextUtils.isEmpty(wVar.h(r8.d.c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r42 = 0;
                int i12 = -1;
                char c10 = 65535;
                int i13 = 0;
                while (true) {
                    int i14 = 1;
                    if (c10 == 65535) {
                        i13 = wVar.b;
                        String h = wVar.h(r8.d.c);
                        c10 = h == null ? (char) 0 : "STYLE".equals(h) ? (char) 2 : h.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        wVar.F(i13);
                        if (c10 == 0) {
                            return new androidx.biometric.e(arrayList2);
                        }
                        if (c10 == 1) {
                            while (!TextUtils.isEmpty(wVar.h(r8.d.c))) {
                            }
                        } else {
                            String str3 = null;
                            if (c10 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new v4.h("A style block was found after the first cue.");
                                }
                                wVar.h(r8.d.c);
                                c cVar = lVar.o;
                                w wVar2 = cVar.a;
                                StringBuilder sb2 = cVar.b;
                                sb2.setLength(0);
                                int i15 = wVar.b;
                                while (!TextUtils.isEmpty(wVar.h(r8.d.c))) {
                                }
                                wVar2.D(wVar.b, wVar.a);
                                wVar2.F(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    c.c(wVar2);
                                    if (wVar2.a() >= 5 && "::cue".equals(wVar2.s(5, r8.d.c))) {
                                        int i16 = wVar2.b;
                                        String b10 = c.b(wVar2, sb2);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                wVar2.F(i16);
                                                str2 = "";
                                            } else {
                                                if ("(".equals(b10)) {
                                                    int i17 = wVar2.b;
                                                    int i18 = wVar2.c;
                                                    boolean z10 = false;
                                                    while (i17 < i18 && !z10) {
                                                        int i19 = i17 + 1;
                                                        z10 = ((char) wVar2.a[i17]) == ')';
                                                        i17 = i19;
                                                    }
                                                    str = wVar2.s((i17 - 1) - wVar2.b, r8.d.c).trim();
                                                } else {
                                                    str = str3;
                                                }
                                                str2 = str;
                                            }
                                            if (str2 == 0 && "{".equals(c.b(wVar2, sb2))) {
                                                d dVar = new d();
                                                dVar.a = "";
                                                dVar.b = "";
                                                dVar.c = Collections.EMPTY_SET;
                                                dVar.d = "";
                                                dVar.e = str3;
                                                dVar.g = r42;
                                                dVar.i = r42;
                                                dVar.j = i12;
                                                dVar.k = i12;
                                                dVar.l = i12;
                                                dVar.m = i12;
                                                dVar.n = i12;
                                                dVar.p = i12;
                                                dVar.q = r42;
                                                if (!"".equals(str2)) {
                                                    int indexOf = str2.indexOf(91);
                                                    String str4 = str2;
                                                    if (indexOf != i12) {
                                                        Matcher matcher = c.c.matcher(str2.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i14);
                                                            group.getClass();
                                                            dVar.d = group;
                                                        }
                                                        str4 = str2.substring(r42, indexOf);
                                                    }
                                                    int i20 = d0.a;
                                                    String[] split = str4.split("\\.", i12);
                                                    String str5 = split[r42];
                                                    int indexOf2 = str5.indexOf(35);
                                                    if (indexOf2 != i12) {
                                                        dVar.b = str5.substring(r42, indexOf2);
                                                        dVar.a = str5.substring(indexOf2 + 1);
                                                    } else {
                                                        dVar.b = str5;
                                                    }
                                                    if (split.length > i14) {
                                                        int length = split.length;
                                                        h5.a.f(length <= split.length);
                                                        dVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i14, length)));
                                                    }
                                                }
                                                boolean z11 = false;
                                                String str6 = null;
                                                while (!z11) {
                                                    int i21 = wVar2.b;
                                                    str6 = c.b(wVar2, sb2);
                                                    boolean z12 = str6 == null || "}".equals(str6);
                                                    if (!z12) {
                                                        wVar2.F(i21);
                                                        c.c(wVar2);
                                                        String a2 = c.a(wVar2, sb2);
                                                        if (!"".equals(a2) && ":".equals(c.b(wVar2, sb2))) {
                                                            c.c(wVar2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z13 = false;
                                                            while (true) {
                                                                if (z13) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i22 = wVar2.b;
                                                                    boolean z14 = z13;
                                                                    String b11 = c.b(wVar2, sb2);
                                                                    if (b11 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        wVar2.F(i22);
                                                                        z13 = true;
                                                                    } else {
                                                                        sb3.append(b11);
                                                                        z13 = z14;
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !"".equals(sb)) {
                                                                int i23 = wVar2.b;
                                                                String b12 = c.b(wVar2, sb2);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        wVar2.F(i23);
                                                                    }
                                                                }
                                                                if ("color".equals(a2)) {
                                                                    dVar.f = h5.b.a(sb, true);
                                                                    dVar.g = true;
                                                                } else if ("background-color".equals(a2)) {
                                                                    dVar.h = h5.b.a(sb, true);
                                                                    dVar.i = true;
                                                                } else if ("ruby-position".equals(a2)) {
                                                                    if ("over".equals(sb)) {
                                                                        dVar.p = 1;
                                                                    } else if ("under".equals(sb)) {
                                                                        dVar.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a2)) {
                                                                    dVar.q = "all".equals(sb) || sb.startsWith("digits");
                                                                } else if ("text-decoration".equals(a2)) {
                                                                    if ("underline".equals(sb)) {
                                                                        dVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a2)) {
                                                                    dVar.e = z6.b(sb);
                                                                } else if ("font-weight".equals(a2)) {
                                                                    if ("bold".equals(sb)) {
                                                                        dVar.l = 1;
                                                                    }
                                                                } else if ("font-style".equals(a2)) {
                                                                    if ("italic".equals(sb)) {
                                                                        dVar.m = 1;
                                                                    }
                                                                } else if ("font-size".equals(a2)) {
                                                                    Matcher matcher2 = c.d.matcher(z6.b(sb));
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
                                                                                dVar.n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i11 = 1;
                                                                                dVar.n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i11 = 1;
                                                                                dVar.n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String group3 = matcher2.group(i11);
                                                                        group3.getClass();
                                                                        dVar.o = Float.parseFloat(group3);
                                                                        z11 = z12;
                                                                    } else {
                                                                        h5.a.K("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z11 = z12;
                                                }
                                                if ("}".equals(str6)) {
                                                    arrayList3.add(dVar);
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
                            } else if (c10 == 3) {
                                Pattern pattern = k.a;
                                Charset charset = r8.d.c;
                                String h9 = wVar.h(charset);
                                if (h9 == null) {
                                    eVar = null;
                                } else {
                                    Pattern pattern2 = k.a;
                                    Matcher matcher3 = pattern2.matcher(h9);
                                    if (matcher3.matches()) {
                                        eVar = k.d(null, matcher3, wVar, arrayList);
                                    } else {
                                        eVar = null;
                                        String h10 = wVar.h(charset);
                                        if (h10 != null) {
                                            Matcher matcher4 = pattern2.matcher(h10);
                                            if (matcher4.matches()) {
                                                eVar = k.d(h9.trim(), matcher4, wVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (eVar != null) {
                                    arrayList2.add(eVar);
                                }
                            }
                            lVar = this;
                        }
                    }
                }
            }
        } catch (r1 e) {
            throw new v4.h(e);
        }
    }
}
