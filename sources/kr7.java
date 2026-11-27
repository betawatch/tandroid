// default package

import java.io.EOFException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class kr7 {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[jn7.d4];
    public final ey7 g = new ey7(jn7.d4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int, short] */
    public final boolean a(cb3 cb3Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        ey7 ey7Var = this.g;
        ey7Var.K(27);
        try {
            z2 = cb3Var.d(ey7Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && ey7Var.C() == 1332176723) {
            if (ey7Var.A() == 0) {
                this.a = ey7Var.A();
                this.b = ey7Var.p();
                ey7Var.r();
                ey7Var.r();
                ey7Var.r();
                ?? A = ey7Var.A();
                this.c = A;
                this.d = A + 27;
                ey7Var.K(A);
                try {
                    z3 = cb3Var.d(ey7Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int A2 = ey7Var.A();
                        this.f[i] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            } else if (!z) {
                throw hy7.d("unsupported bit stream revision");
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
    public final boolean b(cb3 cb3Var, long j) {
        boolean z;
        yve.f(cb3Var.d == cb3Var.e());
        ey7 ey7Var = this.g;
        ey7Var.K(4);
        while (true) {
            if (j != -1 && cb3Var.d + 4 >= j) {
                break;
            }
            try {
                z = cb3Var.d(ey7Var.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            ey7Var.N(0);
            if (ey7Var.C() == 1332176723) {
                cb3Var.f = 0;
                return true;
            }
            cb3Var.l(1, false);
        }
    }
}
