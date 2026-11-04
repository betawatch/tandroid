package bd;

import b8.dc;
import b8.s1;
import gf.m;
import gf.p;
import gf.s;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Pattern e = j.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    @Override // bd.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p b() {
        boolean z10;
        String str;
        String str2;
        int i3 = this.d + 1;
        this.d = i3;
        j jVar = this.a;
        df.d dVar = jVar.i;
        if (dVar == null) {
            return f("]");
        }
        s sVar = (s) dVar.e;
        boolean z11 = dVar.a;
        if (!dVar.c) {
            jVar.i = (df.d) dVar.f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            j jVar2 = this.a;
            int i10 = this.d;
            jVar2.g = i10;
            int a10 = dc.a(i10, jVar2.f);
            if (a10 == -1) {
                str = null;
            } else {
                String substring = jVar2.d() == '<' ? jVar2.f.substring(jVar2.g + 1, a10 - 1) : jVar2.f.substring(jVar2.g, a10);
                jVar2.g = a10;
                str = ff.a.a(substring);
            }
            this.d = this.a.g;
            if (str != null) {
                e();
                String str3 = this.c;
                int i11 = this.d;
                if (e.matcher(str3.substring(i11 - 1, i11)).matches()) {
                    j jVar3 = this.a;
                    int i12 = this.d;
                    jVar3.g = i12;
                    int c2 = dc.c(i12, jVar3.f);
                    if (c2 == -1) {
                        str2 = null;
                    } else {
                        String substring2 = jVar3.f.substring(jVar3.g + 1, c2 - 1);
                        jVar3.g = c2;
                        str2 = ff.a.a(substring2);
                    }
                    this.d = this.a.g;
                    e();
                } else {
                    str2 = null;
                }
                if (c() == ')') {
                    this.d++;
                    z10 = true;
                } else {
                    this.d = i3;
                    z10 = false;
                }
                if (!z10) {
                    int i13 = this.d;
                    j jVar4 = this.a;
                    jVar4.g = i13;
                    if (i13 < jVar4.f.length() && jVar4.f.charAt(jVar4.g) == '[') {
                        int i14 = jVar4.g + 1;
                        int b10 = dc.b(i14, jVar4.f);
                        int i15 = b10 - i14;
                        if (b10 != -1 && i15 <= 999 && b10 < jVar4.f.length() && jVar4.f.charAt(b10) == ']') {
                            jVar4.g = b10 + 1;
                        }
                    }
                    int i16 = this.a.g;
                    this.d = i16;
                    int i17 = i16 - i13;
                    String substring3 = i17 > 2 ? this.c.substring(i13, i17 + i13) : !dVar.d ? this.c.substring(dVar.b, i3) : null;
                    if (substring3 != null) {
                        Pattern pattern = ff.a.a;
                        String replaceAll = ff.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        j jVar5 = this.a;
                        jVar5.getClass();
                        m mVar = (m) ((Map) jVar5.a.b).get(replaceAll);
                        if (mVar != null) {
                            str = mVar.h;
                            str2 = mVar.i;
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    this.d = i3;
                    j jVar6 = this.a;
                    jVar6.i = (df.d) jVar6.i.f;
                    return f("]");
                }
                gf.k kVar = z11 ? new gf.k(0, str, str2) : new gf.k(1, str, str2);
                p pVar = (p) sVar.f;
                while (pVar != null) {
                    p pVar2 = (p) pVar.f;
                    kVar.b(pVar);
                    pVar = pVar2;
                }
                df.e eVar = (df.e) dVar.g;
                j jVar7 = this.a;
                jVar7.g = this.d;
                jVar7.e(eVar);
                this.d = this.a.g;
                p pVar3 = (p) kVar.c;
                p pVar4 = (p) kVar.d;
                if (pVar3 != pVar4) {
                    s1.b(pVar3, pVar4);
                }
                sVar.g();
                j jVar8 = this.a;
                df.d dVar2 = (df.d) jVar8.i.f;
                jVar8.i = dVar2;
                if (!z11) {
                    while (dVar2 != null) {
                        if (!dVar2.a) {
                            dVar2.c = false;
                        }
                        dVar2 = (df.d) dVar2.f;
                    }
                }
                return kVar;
            }
            z10 = false;
        } else {
            z10 = false;
            str = null;
        }
        str2 = null;
        if (!z10) {
        }
        if (z10) {
        }
    }

    @Override // bd.h
    public final char d() {
        return ']';
    }
}
