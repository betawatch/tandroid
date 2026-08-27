package a5;

import android.text.TextUtils;
import d5.g0;
import d5.z;
import h3.t1;
import h7.d0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l extends r4.f {
    public final z b;
    public final c c;

    public l() {
        super("WebvttDecoder");
        this.b = new z();
        this.c = new c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a6, code lost:
    
        r2.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x010e, code lost:
    
        if (")".equals(a5.c.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // r4.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r4.g c(int i10, boolean z10, byte[] bArr) {
        e eVar;
        String str;
        String str2;
        String sb2;
        char c10;
        int i11;
        l lVar = this;
        z zVar = lVar.b;
        zVar.A(i10, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            m.d(zVar);
            while (!TextUtils.isEmpty(zVar.f(o8.d.c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r42 = 0;
                int i12 = -1;
                char c11 = 65535;
                int i13 = 0;
                while (true) {
                    int i14 = 1;
                    if (c11 == 65535) {
                        i13 = zVar.b;
                        String f10 = zVar.f(o8.d.c);
                        c11 = f10 == null ? (char) 0 : "STYLE".equals(f10) ? (char) 2 : f10.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        zVar.C(i13);
                        if (c11 == 0) {
                            return new n(arrayList2);
                        }
                        if (c11 == 1) {
                            while (!TextUtils.isEmpty(zVar.f(o8.d.c))) {
                            }
                        } else {
                            String str3 = null;
                            if (c11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new r4.i("A style block was found after the first cue.");
                                }
                                zVar.f(o8.d.c);
                                c cVar = lVar.c;
                                z zVar2 = cVar.a;
                                StringBuilder sb3 = cVar.b;
                                sb3.setLength(0);
                                int i15 = zVar.b;
                                while (!TextUtils.isEmpty(zVar.f(o8.d.c))) {
                                }
                                zVar2.A(zVar.b, zVar.a);
                                zVar2.C(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    c.c(zVar2);
                                    if (zVar2.a() >= 5 && "::cue".equals(zVar2.p(5, o8.d.c))) {
                                        int i16 = zVar2.b;
                                        String b10 = c.b(zVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                zVar2.C(i16);
                                                str2 = "";
                                            } else {
                                                if ("(".equals(b10)) {
                                                    int i17 = zVar2.b;
                                                    int i18 = zVar2.c;
                                                    boolean z11 = false;
                                                    while (i17 < i18 && !z11) {
                                                        int i19 = i17 + 1;
                                                        z11 = ((char) zVar2.a[i17]) == ')';
                                                        i17 = i19;
                                                    }
                                                    str = zVar2.p((i17 - 1) - zVar2.b, o8.d.c).trim();
                                                } else {
                                                    str = str3;
                                                }
                                                str2 = str;
                                            }
                                            if (str2 == 0 && "{".equals(c.b(zVar2, sb3))) {
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
                                                    int i20 = g0.a;
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
                                                        d5.a.f(length <= split.length);
                                                        dVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i14, length)));
                                                    }
                                                }
                                                boolean z12 = false;
                                                String str6 = null;
                                                while (!z12) {
                                                    int i21 = zVar2.b;
                                                    str6 = c.b(zVar2, sb3);
                                                    boolean z13 = str6 == null || "}".equals(str6);
                                                    if (!z13) {
                                                        zVar2.C(i21);
                                                        c.c(zVar2);
                                                        String a2 = c.a(zVar2, sb3);
                                                        if (!"".equals(a2) && ":".equals(c.b(zVar2, sb3))) {
                                                            c.c(zVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z14 = false;
                                                            while (true) {
                                                                if (z14) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i22 = zVar2.b;
                                                                    boolean z15 = z14;
                                                                    String b11 = c.b(zVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        zVar2.C(i22);
                                                                        z14 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                        z14 = z15;
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !"".equals(sb2)) {
                                                                int i23 = zVar2.b;
                                                                String b12 = c.b(zVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        zVar2.C(i23);
                                                                    }
                                                                }
                                                                if ("color".equals(a2)) {
                                                                    dVar.f = d5.b.a(sb2, true);
                                                                    dVar.g = true;
                                                                } else if ("background-color".equals(a2)) {
                                                                    dVar.h = d5.b.a(sb2, true);
                                                                    dVar.i = true;
                                                                } else if ("ruby-position".equals(a2)) {
                                                                    if ("over".equals(sb2)) {
                                                                        dVar.p = 1;
                                                                    } else if ("under".equals(sb2)) {
                                                                        dVar.p = 2;
                                                                    }
                                                                } else if ("text-combine-upright".equals(a2)) {
                                                                    dVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                } else if ("text-decoration".equals(a2)) {
                                                                    if ("underline".equals(sb2)) {
                                                                        dVar.k = 1;
                                                                    }
                                                                } else if ("font-family".equals(a2)) {
                                                                    dVar.e = d0.b(sb2);
                                                                } else if ("font-weight".equals(a2)) {
                                                                    if ("bold".equals(sb2)) {
                                                                        dVar.l = 1;
                                                                    }
                                                                } else if ("font-style".equals(a2)) {
                                                                    if ("italic".equals(sb2)) {
                                                                        dVar.m = 1;
                                                                    }
                                                                } else if ("font-size".equals(a2)) {
                                                                    Matcher matcher2 = c.d.matcher(d0.b(sb2));
                                                                    if (matcher2.matches()) {
                                                                        String group2 = matcher2.group(2);
                                                                        group2.getClass();
                                                                        switch (group2.hashCode()) {
                                                                            case 37:
                                                                                if (group2.equals("%")) {
                                                                                    c10 = 0;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3240:
                                                                                if (group2.equals("em")) {
                                                                                    c10 = 1;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 3592:
                                                                                if (group2.equals("px")) {
                                                                                    c10 = 2;
                                                                                    break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        c10 = 65535;
                                                                        switch (c10) {
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
                                                                        z12 = z13;
                                                                    } else {
                                                                        d5.a.K("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z12 = z13;
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
                            } else if (c11 == 3) {
                                Pattern pattern = k.a;
                                Charset charset = o8.d.c;
                                String f11 = zVar.f(charset);
                                if (f11 == null) {
                                    eVar = null;
                                } else {
                                    Pattern pattern2 = k.a;
                                    Matcher matcher3 = pattern2.matcher(f11);
                                    if (matcher3.matches()) {
                                        eVar = k.d(null, matcher3, zVar, arrayList);
                                    } else {
                                        eVar = null;
                                        String f12 = zVar.f(charset);
                                        if (f12 != null) {
                                            Matcher matcher4 = pattern2.matcher(f12);
                                            if (matcher4.matches()) {
                                                eVar = k.d(f11.trim(), matcher4, zVar, arrayList);
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
        } catch (t1 e9) {
            throw new r4.i(e9);
        }
    }
}
