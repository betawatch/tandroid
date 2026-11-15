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
        a8.p0.A(obj);
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
    public final void f(Object obj, byte[] bArr, int i7, int i10, l lVar) {
        int i11;
        y yVar = (y) obj;
        b1 b1Var = yVar.zzjp;
        if (b1Var == b1.e) {
            b1Var = b1.b();
            yVar.zzjp = b1Var;
        }
        b1 b1Var2 = b1Var;
        while (i7 < i10) {
            int f10 = l1.f(bArr, i7, lVar);
            int i12 = lVar.a;
            if (i12 != 11) {
                byte[] bArr2 = bArr;
                int i13 = i10;
                l lVar2 = lVar;
                i7 = (i12 & 7) == 2 ? l1.c(i12, bArr2, f10, i13, b1Var2, lVar2) : l1.b(i12, bArr2, f10, i13, lVar2);
            } else {
                byte[] bArr3 = bArr;
                int i14 = i10;
                l lVar3 = lVar;
                int i15 = 0;
                n nVar = null;
                while (true) {
                    if (f10 >= i14) {
                        i11 = f10;
                        break;
                    }
                    i11 = l1.f(bArr3, f10, lVar3);
                    int i16 = lVar3.a;
                    int i17 = i16 >>> 3;
                    int i18 = i16 & 7;
                    if (i17 != 2) {
                        if (i17 == 3 && i18 == 2) {
                            f10 = l1.s(bArr3, i11, lVar3);
                            nVar = (n) lVar3.c;
                        }
                        if (i16 != 12) {
                            break;
                        } else {
                            f10 = l1.b(i16, bArr3, i11, i14, lVar3);
                        }
                    } else if (i18 == 0) {
                        f10 = l1.f(bArr3, i11, lVar3);
                        i15 = lVar3.a;
                    } else if (i16 != 12) {
                    }
                }
                if (nVar != null) {
                    b1Var2.a((i15 << 3) | 2, nVar);
                }
                i7 = i11;
                bArr = bArr3;
                i10 = i14;
                lVar = lVar3;
            }
        }
        if (i7 != i10) {
            throw c0.b();
        }
    }

    @Override // com.google.android.gms.internal.clearcut.z0
    public final boolean g(Object obj) {
        this.c.getClass();
        a8.p0.A(obj);
        throw null;
    }
}
