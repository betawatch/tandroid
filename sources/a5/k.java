package a5;

import android.text.TextUtils;
import d5.f0;
import d5.y;
import g7.b0;
import h3.t1;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends r4.e {
    public final y b;
    public final b c;

    public k() {
        super("WebvttDecoder");
        this.b = new y();
        this.c = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x03a6, code lost:
    
        r2.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x010e, code lost:
    
        if (")".equals(a5.b.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // r4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r4.f c(int i9, boolean z10, byte[] bArr) {
        d dVar;
        String str;
        String str2;
        String sb2;
        char c10;
        int i10;
        k kVar = this;
        y yVar = kVar.b;
        yVar.A(i9, bArr);
        ArrayList arrayList = new ArrayList();
        try {
            l.d(yVar);
            while (!TextUtils.isEmpty(yVar.f(n8.d.c))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                ?? r42 = 0;
                int i11 = -1;
                char c11 = 65535;
                int i12 = 0;
                while (true) {
                    int i13 = 1;
                    if (c11 == 65535) {
                        i12 = yVar.b;
                        String f10 = yVar.f(n8.d.c);
                        c11 = f10 == null ? (char) 0 : "STYLE".equals(f10) ? (char) 2 : f10.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        yVar.C(i12);
                        if (c11 == 0) {
                            return new m(arrayList2);
                        }
                        if (c11 == 1) {
                            while (!TextUtils.isEmpty(yVar.f(n8.d.c))) {
                            }
                        } else {
                            String str3 = null;
                            if (c11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new r4.h("A style block was found after the first cue.");
                                }
                                yVar.f(n8.d.c);
                                b bVar = kVar.c;
                                y yVar2 = bVar.a;
                                StringBuilder sb3 = bVar.b;
                                sb3.setLength(0);
                                int i14 = yVar.b;
                                while (!TextUtils.isEmpty(yVar.f(n8.d.c))) {
                                }
                                yVar2.A(yVar.b, yVar.a);
                                yVar2.C(i14);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    b.c(yVar2);
                                    if (yVar2.a() >= 5 && "::cue".equals(yVar2.p(5, n8.d.c))) {
                                        int i15 = yVar2.b;
                                        String b10 = b.b(yVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                yVar2.C(i15);
                                                str2 = "";
                                            } else {
                                                if ("(".equals(b10)) {
                                                    int i16 = yVar2.b;
                                                    int i17 = yVar2.c;
                                                    boolean z11 = false;
                                                    while (i16 < i17 && !z11) {
                                                        int i18 = i16 + 1;
                                                        z11 = ((char) yVar2.a[i16]) == ')';
                                                        i16 = i18;
                                                    }
                                                    str = yVar2.p((i16 - 1) - yVar2.b, n8.d.c).trim();
                                                } else {
                                                    str = str3;
                                                }
                                                str2 = str;
                                            }
                                            if (str2 == 0 && "{".equals(b.b(yVar2, sb3))) {
                                                c cVar = new c();
                                                cVar.a = "";
                                                cVar.b = "";
                                                cVar.c = Collections.EMPTY_SET;
                                                cVar.d = "";
                                                cVar.e = str3;
                                                cVar.g = r42;
                                                cVar.i = r42;
                                                cVar.j = i11;
                                                cVar.k = i11;
                                                cVar.l = i11;
                                                cVar.m = i11;
                                                cVar.n = i11;
                                                cVar.p = i11;
                                                cVar.q = r42;
                                                if (!"".equals(str2)) {
                                                    int indexOf = str2.indexOf(91);
                                                    String str4 = str2;
                                                    if (indexOf != i11) {
                                                        Matcher matcher = b.c.matcher(str2.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(i13);
                                                            group.getClass();
                                                            cVar.d = group;
                                                        }
                                                        str4 = str2.substring(r42, indexOf);
                                                    }
                                                    int i19 = f0.a;
                                                    String[] split = str4.split("\\.", i11);
                                                    String str5 = split[r42];
                                                    int indexOf2 = str5.indexOf(35);
                                                    if (indexOf2 != i11) {
                                                        cVar.b = str5.substring(r42, indexOf2);
                                                        cVar.a = str5.substring(indexOf2 + 1);
                                                    } else {
                                                        cVar.b = str5;
                                                    }
                                                    if (split.length > i13) {
                                                        int length = split.length;
                                                        d5.a.f(length <= split.length);
                                                        cVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, i13, length)));
                                                    }
                                                }
                                                boolean z12 = false;
                                                String str6 = null;
                                                while (!z12) {
                                                    int i20 = yVar2.b;
                                                    str6 = b.b(yVar2, sb3);
                                                    boolean z13 = str6 == null || "}".equals(str6);
                                                    if (!z13) {
                                                        yVar2.C(i20);
                                                        b.c(yVar2);
                                                        String a2 = b.a(yVar2, sb3);
                                                        if (!"".equals(a2) && ":".equals(b.b(yVar2, sb3))) {
                                                            b.c(yVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z14 = false;
                                                            while (true) {
                                                                if (z14) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i21 = yVar2.b;
                                                                    boolean z15 = z14;
                                                                    String b11 = b.b(yVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        yVar2.C(i21);
                                                                        z14 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                        z14 = z15;
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !"".equals(sb2)) {
                                                                int i22 = yVar2.b;
                                                                String b12 = b.b(yVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        yVar2.C(i22);
                                                                    }
                                                                }
                                                                if ("color".equals(a2)) {
                                                                    cVar.f = d5.b.a(sb2, true);
                                                                    cVar.g = true;
                                                                } else if ("background-color".equals(a2)) {
                                                                    cVar.h = d5.b.a(sb2, true);
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
                                                                    cVar.e = b0.b(sb2);
                                                                } else if ("font-weight".equals(a2)) {
                                                                    if ("bold".equals(sb2)) {
                                                                        cVar.l = 1;
                                                                    }
                                                                } else if ("font-style".equals(a2)) {
                                                                    if ("italic".equals(sb2)) {
                                                                        cVar.m = 1;
                                                                    }
                                                                } else if ("font-size".equals(a2)) {
                                                                    Matcher matcher2 = b.d.matcher(b0.b(sb2));
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
                                                                                i10 = 1;
                                                                                cVar.n = 3;
                                                                                break;
                                                                            case 1:
                                                                                i10 = 1;
                                                                                cVar.n = 2;
                                                                                break;
                                                                            case 2:
                                                                                i10 = 1;
                                                                                cVar.n = 1;
                                                                                break;
                                                                            default:
                                                                                throw new IllegalStateException();
                                                                        }
                                                                        String group3 = matcher2.group(i10);
                                                                        group3.getClass();
                                                                        cVar.o = Float.parseFloat(group3);
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
                                                    arrayList3.add(cVar);
                                                }
                                                r42 = 0;
                                                i11 = -1;
                                                str3 = null;
                                                i13 = 1;
                                            }
                                        }
                                    }
                                    str2 = str3;
                                    if (str2 == 0) {
                                    }
                                }
                            } else if (c11 == 3) {
                                Pattern pattern = j.a;
                                Charset charset = n8.d.c;
                                String f11 = yVar.f(charset);
                                if (f11 == null) {
                                    dVar = null;
                                } else {
                                    Pattern pattern2 = j.a;
                                    Matcher matcher3 = pattern2.matcher(f11);
                                    if (matcher3.matches()) {
                                        dVar = j.d(null, matcher3, yVar, arrayList);
                                    } else {
                                        dVar = null;
                                        String f12 = yVar.f(charset);
                                        if (f12 != null) {
                                            Matcher matcher4 = pattern2.matcher(f12);
                                            if (matcher4.matches()) {
                                                dVar = j.d(f11.trim(), matcher4, yVar, arrayList);
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
            throw new r4.h(e10);
        }
    }
}
