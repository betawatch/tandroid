package ed;

import bf.m;
import bf.p;
import bf.s;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import v7.a7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Pattern e = i.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    @Override // ed.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p b() {
        String str;
        String str2;
        boolean z10;
        int i10 = this.d + 1;
        this.d = i10;
        i iVar = this.a;
        f6.f fVar = iVar.i;
        if (fVar == null) {
            return f("]");
        }
        s sVar = (s) fVar.e;
        boolean z11 = fVar.b;
        if (!fVar.c) {
            iVar.i = (f6.f) fVar.f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            i iVar2 = this.a;
            int i11 = this.d;
            iVar2.g = i11;
            int b10 = se.b.b(i11, iVar2.f);
            if (b10 == -1) {
                str = null;
            } else {
                String substring = iVar2.d() == '<' ? iVar2.f.substring(iVar2.g + 1, b10 - 1) : iVar2.f.substring(iVar2.g, b10);
                iVar2.g = b10;
                str = af.a.a(substring);
            }
            this.d = this.a.g;
            if (str != null) {
                e();
                String str3 = this.c;
                int i12 = this.d;
                if (e.matcher(str3.substring(i12 - 1, i12)).matches()) {
                    i iVar3 = this.a;
                    int i13 = this.d;
                    iVar3.g = i13;
                    int d = se.b.d(i13, iVar3.f);
                    if (d == -1) {
                        str2 = null;
                    } else {
                        String substring2 = iVar3.f.substring(iVar3.g + 1, d - 1);
                        iVar3.g = d;
                        str2 = af.a.a(substring2);
                    }
                    this.d = this.a.g;
                    e();
                } else {
                    str2 = null;
                }
                if (c() == ')') {
                    this.d++;
                    z10 = true;
                    if (!z10) {
                        int i14 = this.d;
                        i iVar4 = this.a;
                        iVar4.g = i14;
                        if (i14 < iVar4.f.length() && iVar4.f.charAt(iVar4.g) == '[') {
                            int i15 = iVar4.g + 1;
                            int c10 = se.b.c(i15, iVar4.f);
                            int i16 = c10 - i15;
                            if (c10 != -1 && i16 <= 999 && c10 < iVar4.f.length() && iVar4.f.charAt(c10) == ']') {
                                iVar4.g = c10 + 1;
                            }
                        }
                        int i17 = this.a.g;
                        this.d = i17;
                        int i18 = i17 - i14;
                        String substring3 = i18 > 2 ? this.c.substring(i14, i18 + i14) : !fVar.d ? this.c.substring(fVar.a, i10) : null;
                        if (substring3 != null) {
                            Pattern pattern = af.a.a;
                            String replaceAll = af.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                            i iVar5 = this.a;
                            iVar5.getClass();
                            m mVar = (m) ((Map) iVar5.a.c).get(replaceAll);
                            if (mVar != null) {
                                str = mVar.h;
                                str2 = mVar.i;
                                z10 = true;
                            }
                        }
                    }
                    if (!z10) {
                        this.d = i10;
                        i iVar6 = this.a;
                        iVar6.i = (f6.f) iVar6.i.f;
                        return f("]");
                    }
                    bf.k kVar = z11 ? new bf.k(0, str, str2) : new bf.k(1, str, str2);
                    p pVar = (p) sVar.f;
                    while (pVar != null) {
                        p pVar2 = (p) pVar.f;
                        kVar.b(pVar);
                        pVar = pVar2;
                    }
                    ye.b bVar = (ye.b) fVar.g;
                    i iVar7 = this.a;
                    iVar7.g = this.d;
                    iVar7.e(bVar);
                    this.d = this.a.g;
                    p pVar3 = (p) kVar.c;
                    p pVar4 = (p) kVar.d;
                    if (pVar3 != pVar4) {
                        a7.b(pVar3, pVar4);
                    }
                    sVar.g();
                    i iVar8 = this.a;
                    f6.f fVar2 = (f6.f) iVar8.i.f;
                    iVar8.i = fVar2;
                    if (!z11) {
                        while (fVar2 != null) {
                            if (!fVar2.b) {
                                fVar2.c = false;
                            }
                            fVar2 = (f6.f) fVar2.f;
                        }
                    }
                    return kVar;
                }
                this.d = i10;
                z10 = false;
                if (!z10) {
                }
                if (!z10) {
                }
            }
        } else {
            str = null;
        }
        str2 = null;
        z10 = false;
        if (!z10) {
        }
        if (!z10) {
        }
    }

    @Override // ed.h
    public final char d() {
        return ']';
    }
}
