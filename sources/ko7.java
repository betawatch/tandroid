// default package

import java.io.EOFException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ko7 {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[kk7.d4];
    public final xu7 g = new xu7(kk7.d4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int, short] */
    public final boolean a(ja3 ja3Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        xu7 xu7Var = this.g;
        xu7Var.K(27);
        try {
            z2 = ja3Var.d(xu7Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && xu7Var.C() == 1332176723) {
            if (xu7Var.A() == 0) {
                this.a = xu7Var.A();
                this.b = xu7Var.p();
                xu7Var.r();
                xu7Var.r();
                xu7Var.r();
                ?? A = xu7Var.A();
                this.c = A;
                this.d = A + 27;
                xu7Var.K(A);
                try {
                    z3 = ja3Var.d(xu7Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int A2 = xu7Var.A();
                        this.f[i] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            } else if (!z) {
                throw av7.d("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r10 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r9.d >= r10) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r9.k(1) != (-1)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(ja3 ja3Var, long j) {
        boolean z;
        gre.f(ja3Var.d == ja3Var.f());
        xu7 xu7Var = this.g;
        xu7Var.K(4);
        while (true) {
            if (j != -1 && ja3Var.d + 4 >= j) {
                break;
            }
            try {
                z = ja3Var.d(xu7Var.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            xu7Var.N(0);
            if (xu7Var.C() == 1332176723) {
                ja3Var.f = 0;
                return true;
            }
            ja3Var.l(1, false);
        }
    }
}
