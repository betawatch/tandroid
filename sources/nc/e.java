package nc;

import g7.i8;
import h7.z;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import je.m;
import je.p;
import je.s;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Pattern e = i.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    @Override // nc.h
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
        ge.b bVar = iVar.i;
        if (bVar == null) {
            return f("]");
        }
        s sVar = (s) bVar.e;
        boolean z11 = bVar.a;
        if (!bVar.c) {
            iVar.i = (ge.b) bVar.f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            i iVar2 = this.a;
            int i11 = this.d;
            iVar2.g = i11;
            int a2 = i8.a(i11, iVar2.f);
            if (a2 == -1) {
                str = null;
            } else {
                String substring = iVar2.d() == '<' ? iVar2.f.substring(iVar2.g + 1, a2 - 1) : iVar2.f.substring(iVar2.g, a2);
                iVar2.g = a2;
                str = ie.a.a(substring);
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
                    int c10 = i8.c(i13, iVar3.f);
                    if (c10 == -1) {
                        str2 = null;
                    } else {
                        String substring2 = iVar3.f.substring(iVar3.g + 1, c10 - 1);
                        iVar3.g = c10;
                        str2 = ie.a.a(substring2);
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
                            int b10 = i8.b(i15, iVar4.f);
                            int i16 = b10 - i15;
                            if (b10 != -1 && i16 <= 999 && b10 < iVar4.f.length() && iVar4.f.charAt(b10) == ']') {
                                iVar4.g = b10 + 1;
                            }
                        }
                        int i17 = this.a.g;
                        this.d = i17;
                        int i18 = i17 - i14;
                        String substring3 = i18 > 2 ? this.c.substring(i14, i18 + i14) : !bVar.d ? this.c.substring(bVar.b, i10) : null;
                        if (substring3 != null) {
                            Pattern pattern = ie.a.a;
                            String replaceAll = ie.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
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
                        iVar6.i = (ge.b) iVar6.i.f;
                        return f("]");
                    }
                    je.k kVar = z11 ? new je.k(0, str, str2) : new je.k(1, str, str2);
                    p pVar = (p) sVar.f;
                    while (pVar != null) {
                        p pVar2 = (p) pVar.f;
                        kVar.b(pVar);
                        pVar = pVar2;
                    }
                    ge.c cVar = (ge.c) bVar.g;
                    i iVar7 = this.a;
                    iVar7.g = this.d;
                    iVar7.e(cVar);
                    this.d = this.a.g;
                    p pVar3 = (p) kVar.c;
                    p pVar4 = (p) kVar.d;
                    if (pVar3 != pVar4) {
                        z.b(pVar3, pVar4);
                    }
                    sVar.g();
                    i iVar8 = this.a;
                    ge.b bVar2 = (ge.b) iVar8.i.f;
                    iVar8.i = bVar2;
                    if (!z11) {
                        while (bVar2 != null) {
                            if (!bVar2.a) {
                                bVar2.c = false;
                            }
                            bVar2 = (ge.b) bVar2.f;
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

    @Override // nc.h
    public final char d() {
        return ']';
    }
}
