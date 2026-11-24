// default package

/* loaded from: classes.dex */
public final class aud implements ywd {
    public final xkd a;
    public final m0e b;
    public final khd c;

    public aud(m0e m0eVar, khd khdVar, xkd xkdVar) {
        this.b = m0eVar;
        khdVar.getClass();
        this.c = khdVar;
        this.a = xkdVar;
    }

    @Override // ywd
    public final Object a() {
        return ((vkd) this.a.a(5)).c();
    }

    @Override // ywd
    public final void b(Object obj) {
        this.b.getClass();
        ((xkd) obj).zzjp.d = false;
        this.c.getClass();
        ts2.t(obj);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[EDGE_INSN: B:24:0x0061->B:25:0x0061 BREAK  A[LOOP:1: B:10:0x0032->B:18:0x0032], SYNTHETIC] */
    @Override // ywd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, byte[] bArr, int i, int i2, ucd ucdVar) {
        xkd xkdVar = (xkd) obj;
        g0e g0eVar = xkdVar.zzjp;
        if (g0eVar == g0e.e) {
            g0eVar = g0e.b();
            xkdVar.zzjp = g0eVar;
        }
        g0e g0eVar2 = g0eVar;
        while (i < i2) {
            int d = r1f.d(bArr, i, ucdVar);
            int i3 = ucdVar.a;
            if (i3 != 11) {
                byte[] bArr2 = bArr;
                int i4 = i2;
                ucd ucdVar2 = ucdVar;
                i = (i3 & 7) == 2 ? r1f.b(i3, bArr2, d, i4, g0eVar2, ucdVar2) : r1f.a(i3, bArr2, d, i4, ucdVar2);
            } else {
                byte[] bArr3 = bArr;
                int i5 = i2;
                ucd ucdVar3 = ucdVar;
                int i6 = 0;
                efd efdVar = null;
                while (true) {
                    if (d >= i5) {
                        i = d;
                        break;
                    }
                    i = r1f.d(bArr3, d, ucdVar3);
                    int i7 = ucdVar3.a;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3 && i9 == 2) {
                            d = r1f.i(bArr3, i, ucdVar3);
                            efdVar = (efd) ucdVar3.c;
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            d = r1f.a(i7, bArr3, i, i5, ucdVar3);
                        }
                    } else if (i9 == 0) {
                        d = r1f.d(bArr3, i, ucdVar3);
                        i6 = ucdVar3.a;
                    } else if (i7 != 12) {
                    }
                }
                if (efdVar != null) {
                    g0eVar2.a((i6 << 3) | 2, efdVar);
                }
                bArr = bArr3;
                i2 = i5;
                ucdVar = ucdVar3;
            }
        }
        if (i != i2) {
            throw xmd.b();
        }
    }

    @Override // ywd
    public final void d(xkd xkdVar, xkd xkdVar2) {
        jxd.a(this.b, xkdVar, xkdVar2);
    }

    @Override // ywd
    public final int e(xkd xkdVar) {
        this.b.getClass();
        return xkdVar.zzjp.hashCode();
    }

    @Override // ywd
    public final boolean f(xkd xkdVar, xkd xkdVar2) {
        this.b.getClass();
        return xkdVar.zzjp.equals(xkdVar2.zzjp);
    }

    @Override // ywd
    public final boolean g(Object obj) {
        this.c.getClass();
        ts2.t(obj);
        throw null;
    }
}
