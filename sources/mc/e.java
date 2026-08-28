package mc;

import f7.d8;
import g7.x;
import ie.m;
import ie.p;
import ie.s;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Pattern e = i.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    @Override // mc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p b() {
        String str;
        String str2;
        boolean z10;
        int i9 = this.d + 1;
        this.d = i9;
        i iVar = this.a;
        fe.b bVar = iVar.i;
        if (bVar == null) {
            return f("]");
        }
        s sVar = (s) bVar.e;
        boolean z11 = bVar.a;
        if (!bVar.c) {
            iVar.i = (fe.b) bVar.f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            i iVar2 = this.a;
            int i10 = this.d;
            iVar2.g = i10;
            int a2 = d8.a(i10, iVar2.f);
            if (a2 == -1) {
                str = null;
            } else {
                String substring = iVar2.d() == '<' ? iVar2.f.substring(iVar2.g + 1, a2 - 1) : iVar2.f.substring(iVar2.g, a2);
                iVar2.g = a2;
                str = he.a.a(substring);
            }
            this.d = this.a.g;
            if (str != null) {
                e();
                String str3 = this.c;
                int i11 = this.d;
                if (e.matcher(str3.substring(i11 - 1, i11)).matches()) {
                    i iVar3 = this.a;
                    int i12 = this.d;
                    iVar3.g = i12;
                    int c10 = d8.c(i12, iVar3.f);
                    if (c10 == -1) {
                        str2 = null;
                    } else {
                        String substring2 = iVar3.f.substring(iVar3.g + 1, c10 - 1);
                        iVar3.g = c10;
                        str2 = he.a.a(substring2);
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
                        int i13 = this.d;
                        i iVar4 = this.a;
                        iVar4.g = i13;
                        if (i13 < iVar4.f.length() && iVar4.f.charAt(iVar4.g) == '[') {
                            int i14 = iVar4.g + 1;
                            int b10 = d8.b(i14, iVar4.f);
                            int i15 = b10 - i14;
                            if (b10 != -1 && i15 <= 999 && b10 < iVar4.f.length() && iVar4.f.charAt(b10) == ']') {
                                iVar4.g = b10 + 1;
                            }
                        }
                        int i16 = this.a.g;
                        this.d = i16;
                        int i17 = i16 - i13;
                        String substring3 = i17 > 2 ? this.c.substring(i13, i17 + i13) : !bVar.d ? this.c.substring(bVar.b, i9) : null;
                        if (substring3 != null) {
                            Pattern pattern = he.a.a;
                            String replaceAll = he.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
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
                        this.d = i9;
                        i iVar6 = this.a;
                        iVar6.i = (fe.b) iVar6.i.f;
                        return f("]");
                    }
                    ie.k kVar = z11 ? new ie.k(0, str, str2) : new ie.k(1, str, str2);
                    p pVar = (p) sVar.f;
                    while (pVar != null) {
                        p pVar2 = (p) pVar.f;
                        kVar.b(pVar);
                        pVar = pVar2;
                    }
                    fe.c cVar = (fe.c) bVar.g;
                    i iVar7 = this.a;
                    iVar7.g = this.d;
                    iVar7.e(cVar);
                    this.d = this.a.g;
                    p pVar3 = (p) kVar.c;
                    p pVar4 = (p) kVar.d;
                    if (pVar3 != pVar4) {
                        x.b(pVar3, pVar4);
                    }
                    sVar.g();
                    i iVar8 = this.a;
                    fe.b bVar2 = (fe.b) iVar8.i.f;
                    iVar8.i = bVar2;
                    if (!z11) {
                        while (bVar2 != null) {
                            if (!bVar2.a) {
                                bVar2.c = false;
                            }
                            bVar2 = (fe.b) bVar2.f;
                        }
                    }
                    return kVar;
                }
                this.d = i9;
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

    @Override // mc.h
    public final char d() {
        return ']';
    }
}
