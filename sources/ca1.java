// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ca1 extends vg0 {
    public final s93 K;
    public final ey7 L;
    public o64 M;
    public long N;

    public ca1() {
        super(6);
        this.K = new s93(1, 0);
        this.L = new ey7();
    }

    @Override // vg0
    public final void B(long j, long j2) {
        float[] fArr;
        while (!m() && this.N < 100000 + j) {
            s93 s93Var = this.K;
            s93Var.clear();
            ym4 ym4Var = this.c;
            ym4Var.t();
            if (A(ym4Var, s93Var, 0) != -4 || s93Var.isEndOfStream()) {
                return;
            }
            long j3 = s93Var.e;
            this.N = j3;
            boolean z = j3 < this.x;
            if (this.M != null && !z) {
                s93Var.d();
                ByteBuffer byteBuffer = s93Var.c;
                String str = gcc.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    ey7 ey7Var = this.L;
                    ey7Var.L(limit, array);
                    ey7Var.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(ey7Var.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.M.a();
                }
            }
        }
    }

    @Override // vg0, lg8
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.M = (o64) obj;
        }
    }

    @Override // vg0
    public final void q() {
        o64 o64Var = this.M;
        if (o64Var != null) {
            o64Var.c();
        }
    }

    @Override // vg0
    public final void s(long j, boolean z, boolean z2) {
        this.N = Long.MIN_VALUE;
        o64 o64Var = this.M;
        if (o64Var != null) {
            o64Var.c();
        }
    }
}
