// default package

/* loaded from: classes.dex */
public final class nwd implements lzd {
    public final mnd a;
    public final z2e b;
    public final akd c;

    public nwd(z2e z2eVar, akd akdVar, mnd mndVar) {
        this.b = z2eVar;
        akdVar.getClass();
        this.c = akdVar;
        this.a = mndVar;
    }

    @Override // lzd
    public final Object a() {
        return ((knd) this.a.a(5)).c();
    }

    @Override // lzd
    public final void b(Object obj) {
        this.b.getClass();
        ((mnd) obj).zzjp.d = false;
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[EDGE_INSN: B:24:0x0061->B:25:0x0061 BREAK  A[LOOP:1: B:10:0x0032->B:18:0x0032], SYNTHETIC] */
    @Override // lzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, byte[] bArr, int i, int i2, lfd lfdVar) {
        mnd mndVar = (mnd) obj;
        t2e t2eVar = mndVar.zzjp;
        if (t2eVar == t2e.e) {
            t2eVar = t2e.b();
            mndVar.zzjp = t2eVar;
        }
        t2e t2eVar2 = t2eVar;
        while (i < i2) {
            int d = i4f.d(bArr, i, lfdVar);
            int i3 = lfdVar.a;
            if (i3 != 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                lfd lfdVar2 = lfdVar;
                i = (i3 & 7) == 2 ? i4f.b(i3, bArr2, d, i4, t2eVar2, lfdVar2) : i4f.a(i3, bArr2, d, i4, lfdVar2);
            } else {
                byte[] bArr3 = bArr;
                int i5 = i2;
                lfd lfdVar3 = lfdVar;
                int i6 = 0;
                vhd vhdVar = null;
                while (true) {
                    if (d >= i5) {
                        i = d;
                        break;
                    }
                    i = i4f.d(bArr3, d, lfdVar3);
                    int i7 = lfdVar3.a;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3 && i9 == 2) {
                            d = i4f.i(bArr3, i, lfdVar3);
                            vhdVar = (vhd) lfdVar3.c;
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            d = i4f.a(i7, bArr3, i, i5, lfdVar3);
                        }
                    } else if (i9 == 0) {
                        d = i4f.d(bArr3, i, lfdVar3);
                        i6 = lfdVar3.a;
                    } else if (i7 != 12) {
                    }
                }
                if (vhdVar != null) {
                    t2eVar2.a((i6 << 3) | 2, vhdVar);
                }
                bArr = bArr3;
                i2 = i5;
                lfdVar = lfdVar3;
            }
        }
        if (i != i2) {
            throw mpd.b();
        }
    }

    @Override // lzd
    public final void d(mnd mndVar, mnd mndVar2) {
        wzd.a(this.b, mndVar, mndVar2);
    }

    @Override // lzd
    public final int e(mnd mndVar) {
        this.b.getClass();
        return mndVar.zzjp.hashCode();
    }

    @Override // lzd
    public final boolean f(mnd mndVar, mnd mndVar2) {
        this.b.getClass();
        return mndVar.zzjp.equals(mndVar2.zzjp);
    }

    @Override // lzd
    public final boolean g(Object obj) {
        this.c.getClass();
        bs2.u(obj);
        throw null;
    }
}
