package oc;

import i7.a6;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import le.m;
import le.p;
import le.s;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends h {
    public static final Pattern e = j.n;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    @Override // oc.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p b() {
        String str;
        String str2;
        boolean z10;
        int i10 = this.d + 1;
        this.d = i10;
        j jVar = this.a;
        ie.b bVar = jVar.i;
        if (bVar == null) {
            return f("]");
        }
        s sVar = (s) bVar.e;
        boolean z11 = bVar.a;
        if (!bVar.c) {
            jVar.i = (ie.b) bVar.f;
            return f("]");
        }
        if (c() == '(') {
            this.d++;
            e();
            j jVar2 = this.a;
            int i11 = this.d;
            jVar2.g = i11;
            int a2 = i7.j.a(i11, jVar2.f);
            if (a2 == -1) {
                str = null;
            } else {
                String substring = jVar2.d() == '<' ? jVar2.f.substring(jVar2.g + 1, a2 - 1) : jVar2.f.substring(jVar2.g, a2);
                jVar2.g = a2;
                str = ke.a.a(substring);
            }
            this.d = this.a.g;
            if (str != null) {
                e();
                String str3 = this.c;
                int i12 = this.d;
                if (e.matcher(str3.substring(i12 - 1, i12)).matches()) {
                    j jVar3 = this.a;
                    int i13 = this.d;
                    jVar3.g = i13;
                    int c3 = i7.j.c(i13, jVar3.f);
                    if (c3 == -1) {
                        str2 = null;
                    } else {
                        String substring2 = jVar3.f.substring(jVar3.g + 1, c3 - 1);
                        jVar3.g = c3;
                        str2 = ke.a.a(substring2);
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
                        j jVar4 = this.a;
                        jVar4.g = i14;
                        if (i14 < jVar4.f.length() && jVar4.f.charAt(jVar4.g) == '[') {
                            int i15 = jVar4.g + 1;
                            int b10 = i7.j.b(i15, jVar4.f);
                            int i16 = b10 - i15;
                            if (b10 != -1 && i16 <= 999 && b10 < jVar4.f.length() && jVar4.f.charAt(b10) == ']') {
                                jVar4.g = b10 + 1;
                            }
                        }
                        int i17 = this.a.g;
                        this.d = i17;
                        int i18 = i17 - i14;
                        String substring3 = i18 > 2 ? this.c.substring(i14, i18 + i14) : !bVar.d ? this.c.substring(bVar.b, i10) : null;
                        if (substring3 != null) {
                            Pattern pattern = ke.a.a;
                            String replaceAll = ke.a.c.matcher(substring3.substring(1, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                            j jVar5 = this.a;
                            jVar5.getClass();
                            m mVar = (m) ((Map) jVar5.a.c).get(replaceAll);
                            if (mVar != null) {
                                str = mVar.h;
                                str2 = mVar.i;
                                z10 = true;
                            }
                        }
                    }
                    if (!z10) {
                        this.d = i10;
                        j jVar6 = this.a;
                        jVar6.i = (ie.b) jVar6.i.f;
                        return f("]");
                    }
                    le.k kVar = z11 ? new le.k(0, str, str2) : new le.k(1, str, str2);
                    p pVar = (p) sVar.f;
                    while (pVar != null) {
                        p pVar2 = (p) pVar.f;
                        kVar.b(pVar);
                        pVar = pVar2;
                    }
                    ie.c cVar = (ie.c) bVar.g;
                    j jVar7 = this.a;
                    jVar7.g = this.d;
                    jVar7.e(cVar);
                    this.d = this.a.g;
                    p pVar3 = (p) kVar.c;
                    p pVar4 = (p) kVar.d;
                    if (pVar3 != pVar4) {
                        a6.b(pVar3, pVar4);
                    }
                    sVar.g();
                    j jVar8 = this.a;
                    ie.b bVar2 = (ie.b) jVar8.i.f;
                    jVar8.i = bVar2;
                    if (!z11) {
                        while (bVar2 != null) {
                            if (!bVar2.a) {
                                bVar2.c = false;
                            }
                            bVar2 = (ie.b) bVar2.f;
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

    @Override // oc.h
    public final char d() {
        return ']';
    }
}
