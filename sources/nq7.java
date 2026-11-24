// default package

import java.io.EOFException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nq7 {
    public short a;
    public long b;
    public short c;
    public int d;
    public int e;
    public final int[] f = new int[nm7.d4];
    public final yw7 g = new yw7(nm7.d4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [int, short] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int, short] */
    public final boolean a(vb3 vb3Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = (short) 0;
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = 0;
        yw7 yw7Var = this.g;
        yw7Var.K(27);
        try {
            z2 = vb3Var.d(yw7Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && yw7Var.C() == 1332176723) {
            if (yw7Var.A() == 0) {
                this.a = yw7Var.A();
                this.b = yw7Var.p();
                yw7Var.r();
                yw7Var.r();
                yw7Var.r();
                ?? A = yw7Var.A();
                this.c = A;
                this.d = A + 27;
                yw7Var.K(A);
                try {
                    z3 = vb3Var.d(yw7Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int A2 = yw7Var.A();
                        this.f[i] = A2;
                        this.e += A2;
                    }
                    return true;
                }
            } else if (!z) {
                throw bx7.d("unsupported bit stream revision");
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
    
        if (r9.l(1) != (-1)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(vb3 vb3Var, long j) {
        boolean z;
        jte.f(vb3Var.d == vb3Var.f());
        yw7 yw7Var = this.g;
        yw7Var.K(4);
        while (true) {
            if (j != -1 && vb3Var.d + 4 >= j) {
                break;
            }
            try {
                z = vb3Var.d(yw7Var.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            yw7Var.N(0);
            if (yw7Var.C() == 1332176723) {
                vb3Var.f = 0;
                return true;
            }
            vb3Var.m(1, false);
        }
    }
}
