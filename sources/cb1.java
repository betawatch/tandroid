// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cb1 extends uh0 {
    public final la3 K;
    public final yw7 L;
    public d74 M;
    public long N;

    public cb1() {
        super(6);
        this.K = new la3(1, 0);
        this.L = new yw7();
    }

    @Override // uh0
    public final void B(long j, long j2) {
        float[] fArr;
        while (!m() && this.N < 100000 + j) {
            la3 la3Var = this.K;
            la3Var.clear();
            mj4 mj4Var = this.c;
            mj4Var.i();
            if (A(mj4Var, la3Var, 0) != -4 || la3Var.isEndOfStream()) {
                return;
            }
            long j3 = la3Var.e;
            this.N = j3;
            boolean z = j3 < this.x;
            if (this.M != null && !z) {
                la3Var.d();
                ByteBuffer byteBuffer = la3Var.c;
                String str = hac.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    yw7 yw7Var = this.L;
                    yw7Var.L(limit, array);
                    yw7Var.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(yw7Var.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.M.a();
                }
            }
        }
    }

    @Override // uh0, ze8
    public final void d(int i, Object obj) {
        if (i == 8) {
            this.M = (d74) obj;
        }
    }

    @Override // uh0
    public final void q() {
        d74 d74Var = this.M;
        if (d74Var != null) {
            d74Var.b();
        }
    }

    @Override // uh0
    public final void s(long j, boolean z, boolean z2) {
        this.N = Long.MIN_VALUE;
        d74 d74Var = this.M;
        if (d74Var != null) {
            d74Var.b();
        }
    }
}
