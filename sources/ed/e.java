package ed;

import a8.x9;
import c8.w0;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kf.m;
import kf.p;
import kf.s;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Pattern e = i.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    @Override // ed.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p b() {
        boolean z9;
        String str;
        String str2;
        int i7 = this.d + 1;
        this.d = i7;
        i iVar = this.a;
        gf.d dVar = iVar.i;
        if (dVar == null) {
            return f("]");
        }
        s sVar = (s) dVar.e;
        boolean z10 = dVar.a;
        if (!dVar.c) {
            iVar.i = (gf.d) dVar.f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            i iVar2 = this.a;
            int i10 = this.d;
            iVar2.g = i10;
            int a10 = w0.a(i10, iVar2.f);
            if (a10 == -1) {
                str = null;
            } else {
                String substring = iVar2.d() == '<' ? iVar2.f.substring(iVar2.g + 1, a10 - 1) : iVar2.f.substring(iVar2.g, a10);
                iVar2.g = a10;
                str = jf.a.a(substring);
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
                    int c10 = w0.c(i12, iVar3.f);
                    if (c10 == -1) {
                        str2 = null;
                    } else {
                        String substring2 = iVar3.f.substring(iVar3.g + 1, c10 - 1);
                        iVar3.g = c10;
                        str2 = jf.a.a(substring2);
                    }
                    this.d = this.a.g;
                    e();
                } else {
                    str2 = null;
                }
                if (c() == ')') {
                    this.d++;
                    z9 = true;
                } else {
                    this.d = i7;
                    z9 = false;
                }
                if (!z9) {
                    int i13 = this.d;
                    i iVar4 = this.a;
                    iVar4.g = i13;
                    if (i13 < iVar4.f.length() && iVar4.f.charAt(iVar4.g) == '[') {
                        int i14 = iVar4.g + 1;
                        int b10 = w0.b(i14, iVar4.f);
                        int i15 = b10 - i14;
                        if (b10 != -1 && i15 <= 999 && b10 < iVar4.f.length() && iVar4.f.charAt(b10) == ']') {
                            iVar4.g = b10 + 1;
                        }
                    }
                    int i16 = this.a.g;
                    this.d = i16;
                    int i17 = i16 - i13;
                    String substring3 = i17 > 2 ? this.c.substring(i13, i17 + i13) : !dVar.d ? this.c.substring(dVar.b, i7) : null;
                    if (substring3 != null) {
                        Pattern pattern = jf.a.a;
                        String replaceAll = jf.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        i iVar5 = this.a;
                        iVar5.getClass();
                        m mVar = (m) ((Map) iVar5.a.c).get(replaceAll);
                        if (mVar != null) {
                            str = mVar.h;
                            str2 = mVar.i;
                            z9 = true;
                        }
                    }
                }
                if (z9) {
                    this.d = i7;
                    i iVar6 = this.a;
                    iVar6.i = (gf.d) iVar6.i.f;
                    return f("]");
                }
                kf.k kVar = z10 ? new kf.k(0, str, str2) : new kf.k(1, str, str2);
                p pVar = (p) sVar.f;
                while (pVar != null) {
                    p pVar2 = (p) pVar.f;
                    kVar.b(pVar);
                    pVar = pVar2;
                }
                gf.e eVar = (gf.e) dVar.g;
                i iVar7 = this.a;
                iVar7.g = this.d;
                iVar7.e(eVar);
                this.d = this.a.g;
                p pVar3 = (p) kVar.c;
                p pVar4 = (p) kVar.d;
                if (pVar3 != pVar4) {
                    x9.b(pVar3, pVar4);
                }
                sVar.g();
                i iVar8 = this.a;
                gf.d dVar2 = (gf.d) iVar8.i.f;
                iVar8.i = dVar2;
                if (!z10) {
                    while (dVar2 != null) {
                        if (!dVar2.a) {
                            dVar2.c = false;
                        }
                        dVar2 = (gf.d) dVar2.f;
                    }
                }
                return kVar;
            }
            z9 = false;
        } else {
            z9 = false;
            str = null;
        }
        str2 = null;
        if (!z9) {
        }
        if (z9) {
        }
    }

    @Override // ed.h
    public final char d() {
        return ']';
    }
}
