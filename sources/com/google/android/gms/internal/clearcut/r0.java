package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class r0 implements b1 {
    public final j a;
    public final e1 b;
    public final r c;

    public r0(e1 e1Var, r rVar, j jVar) {
        this.b = e1Var;
        rVar.getClass();
        this.c = rVar;
        this.a = jVar;
    }

    @Override // com.google.android.gms.internal.clearcut.b1
    public final Object a() {
        return ((x) ((z) this.a).a(5)).c();
    }

    @Override // com.google.android.gms.internal.clearcut.b1
    public final void b(Object obj) {
        this.b.getClass();
        ((z) obj).zzjp.d = false;
        this.c.getClass();
        a9.p.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.clearcut.b1
    public final void c(z zVar, z zVar2) {
        c1.a(this.b, zVar, zVar2);
    }

    @Override // com.google.android.gms.internal.clearcut.b1
    public final boolean d(z zVar, z zVar2) {
        this.b.getClass();
        return zVar.zzjp.equals(zVar2.zzjp);
    }

    @Override // com.google.android.gms.internal.clearcut.b1
    public final int e(z zVar) {
        this.b.getClass();
        return zVar.zzjp.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[EDGE_INSN: B:24:0x0062->B:25:0x0062 BREAK  A[LOOP:1: B:10:0x0032->B:18:0x0032], SYNTHETIC] */
    @Override // com.google.android.gms.internal.clearcut.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, byte[] bArr, int i10, int i11, m mVar) {
        int i12;
        z zVar = (z) obj;
        d1 d1Var = zVar.zzjp;
        if (d1Var == d1.e) {
            d1Var = d1.b();
            zVar.zzjp = d1Var;
        }
        d1 d1Var2 = d1Var;
        while (i10 < i11) {
            int f10 = o1.f(bArr, i10, mVar);
            int i13 = mVar.a;
            if (i13 != 11) {
                byte[] bArr2 = bArr;
                int i14 = i11;
                m mVar2 = mVar;
                i10 = (i13 & 7) == 2 ? o1.c(i13, bArr2, f10, i14, d1Var2, mVar2) : o1.b(i13, bArr2, f10, i14, mVar2);
            } else {
                byte[] bArr3 = bArr;
                int i15 = i11;
                m mVar3 = mVar;
                int i16 = 0;
                o oVar = null;
                while (true) {
                    if (f10 >= i15) {
                        i12 = f10;
                        break;
                    }
                    i12 = o1.f(bArr3, f10, mVar3);
                    int i17 = mVar3.a;
                    int i18 = i17 >>> 3;
                    int i19 = i17 & 7;
                    if (i18 != 2) {
                        if (i18 == 3 && i19 == 2) {
                            f10 = o1.s(bArr3, i12, mVar3);
                            oVar = (o) mVar3.c;
                        }
                        if (i17 != 12) {
                            break;
                        } else {
                            f10 = o1.b(i17, bArr3, i12, i15, mVar3);
                        }
                    } else if (i19 == 0) {
                        f10 = o1.f(bArr3, i12, mVar3);
                        i16 = mVar3.a;
                    } else if (i17 != 12) {
                    }
                }
                if (oVar != null) {
                    d1Var2.a((i16 << 3) | 2, oVar);
                }
                i10 = i12;
                bArr = bArr3;
                i11 = i15;
                mVar = mVar3;
            }
        }
        if (i10 != i11) {
            throw d0.b();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.b1
    public final boolean g(Object obj) {
        this.c.getClass();
        a9.p.t(obj);
        throw null;
    }
}
