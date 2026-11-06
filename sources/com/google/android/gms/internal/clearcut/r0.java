package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class r0 implements a1 {
    public final j a;
    public final d1 b;
    public final r c;

    public r0(d1 d1Var, r rVar, j jVar) {
        this.b = d1Var;
        rVar.getClass();
        this.c = rVar;
        this.a = jVar;
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final Object a() {
        return ((x) ((z) this.a).a(5)).c();
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final void b(Object obj) {
        this.b.getClass();
        ((z) obj).zzjp.d = false;
        this.c.getClass();
        a8.p0.A(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final void c(z zVar, z zVar2) {
        b1.a(this.b, zVar, zVar2);
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final boolean d(z zVar, z zVar2) {
        this.b.getClass();
        return zVar.zzjp.equals(zVar2.zzjp);
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final int e(z zVar) {
        this.b.getClass();
        return zVar.zzjp.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[EDGE_INSN: B:24:0x0062->B:25:0x0062 BREAK  A[LOOP:1: B:10:0x0032->B:18:0x0032], SYNTHETIC] */
    @Override // com.google.android.gms.internal.clearcut.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, byte[] bArr, int i7, int i10, m mVar) {
        int i11;
        z zVar = (z) obj;
        c1 c1Var = zVar.zzjp;
        if (c1Var == c1.e) {
            c1Var = c1.b();
            zVar.zzjp = c1Var;
        }
        c1 c1Var2 = c1Var;
        while (i7 < i10) {
            int f10 = m1.f(bArr, i7, mVar);
            int i12 = mVar.a;
            if (i12 != 11) {
                byte[] bArr2 = bArr;
                int i13 = i10;
                m mVar2 = mVar;
                i7 = (i12 & 7) == 2 ? m1.c(i12, bArr2, f10, i13, c1Var2, mVar2) : m1.b(i12, bArr2, f10, i13, mVar2);
            } else {
                byte[] bArr3 = bArr;
                int i14 = i10;
                m mVar3 = mVar;
                int i15 = 0;
                o oVar = null;
                while (true) {
                    if (f10 >= i14) {
                        i11 = f10;
                        break;
                    }
                    i11 = m1.f(bArr3, f10, mVar3);
                    int i16 = mVar3.a;
                    int i17 = i16 >>> 3;
                    int i18 = i16 & 7;
                    if (i17 != 2) {
                        if (i17 == 3 && i18 == 2) {
                            f10 = m1.s(bArr3, i11, mVar3);
                            oVar = (o) mVar3.c;
                        }
                        if (i16 != 12) {
                            break;
                        } else {
                            f10 = m1.b(i16, bArr3, i11, i14, mVar3);
                        }
                    } else if (i18 == 0) {
                        f10 = m1.f(bArr3, i11, mVar3);
                        i15 = mVar3.a;
                    } else if (i16 != 12) {
                    }
                }
                if (oVar != null) {
                    c1Var2.a((i15 << 3) | 2, oVar);
                }
                i7 = i11;
                bArr = bArr3;
                i10 = i14;
                mVar = mVar3;
            }
        }
        if (i7 != i10) {
            throw d0.b();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.a1
    public final boolean g(Object obj) {
        this.c.getClass();
        a8.p0.A(obj);
        throw null;
    }
}
