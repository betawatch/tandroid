package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class q0 implements z0 {
    public final i a;
    public final c1 b;
    public final q c;

    public q0(c1 c1Var, q qVar, i iVar) {
        this.b = c1Var;
        qVar.getClass();
        this.c = qVar;
        this.a = iVar;
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final Object a() {
        return ((w) ((y) this.a).a(5)).c();
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final void b(Object obj) {
        this.b.getClass();
        ((y) obj).zzjp.d = false;
        this.c.getClass();
        a4.a.y(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final void c(y yVar, y yVar2) {
        a1.a(this.b, yVar, yVar2);
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final boolean d(y yVar, y yVar2) {
        this.b.getClass();
        return yVar.zzjp.equals(yVar2.zzjp);
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final int e(y yVar) {
        this.b.getClass();
        return yVar.zzjp.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[EDGE_INSN: B:24:0x0062->B:25:0x0062 BREAK  A[LOOP:1: B:10:0x0032->B:18:0x0032], SYNTHETIC] */
    @Override // com.google.android.gms.internal.clearcut.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, byte[] bArr, int i10, int i11, l lVar) {
        int i12;
        y yVar = (y) obj;
        b1 b1Var = yVar.zzjp;
        if (b1Var == b1.e) {
            b1Var = b1.b();
            yVar.zzjp = b1Var;
        }
        b1 b1Var2 = b1Var;
        while (i10 < i11) {
            int f7 = m1.f(bArr, i10, lVar);
            int i13 = lVar.a;
            if (i13 != 11) {
                byte[] bArr2 = bArr;
                int i14 = i11;
                l lVar2 = lVar;
                i10 = (i13 & 7) == 2 ? m1.c(i13, bArr2, f7, i14, b1Var2, lVar2) : m1.b(i13, bArr2, f7, i14, lVar2);
            } else {
                byte[] bArr3 = bArr;
                int i15 = i11;
                l lVar3 = lVar;
                int i16 = 0;
                n nVar = null;
                while (true) {
                    if (f7 >= i15) {
                        i12 = f7;
                        break;
                    }
                    i12 = m1.f(bArr3, f7, lVar3);
                    int i17 = lVar3.a;
                    int i18 = i17 >>> 3;
                    int i19 = i17 & 7;
                    if (i18 != 2) {
                        if (i18 == 3 && i19 == 2) {
                            f7 = m1.s(bArr3, i12, lVar3);
                            nVar = (n) lVar3.c;
                        }
                        if (i17 != 12) {
                            break;
                        } else {
                            f7 = m1.b(i17, bArr3, i12, i15, lVar3);
                        }
                    } else if (i19 == 0) {
                        f7 = m1.f(bArr3, i12, lVar3);
                        i16 = lVar3.a;
                    } else if (i17 != 12) {
                    }
                }
                if (nVar != null) {
                    b1Var2.a((i16 << 3) | 2, nVar);
                }
                i10 = i12;
                bArr = bArr3;
                i11 = i15;
                lVar = lVar3;
            }
        }
        if (i10 != i11) {
            throw c0.b();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final boolean g(Object obj) {
        this.c.getClass();
        a4.a.y(obj);
        throw null;
    }
}
