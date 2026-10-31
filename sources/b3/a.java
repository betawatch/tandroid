package b3;

import e2.l0;
import e2.x;
import h2.h;
import i2.b;
import i2.d0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends b {
    public final h I;
    public final x J;
    public d0 K;
    public long L;

    public a() {
        super(6);
        this.I = new h(1, 0);
        this.J = new x();
    }

    @Override // i2.b
    public final int C(b2.x xVar) {
        return "application/x-camera-motion".equals(xVar.s) ? i0.a.a(4, 0, 0, 0) : i0.a.a(0, 0, 0, 0);
    }

    @Override // i2.b, i2.o1
    public final void d(int i10, Object obj) {
        if (i10 == 8) {
            this.K = (d0) obj;
        }
    }

    @Override // i2.b
    public final String j() {
        return "CameraMotionRenderer";
    }

    @Override // i2.b
    public final boolean l() {
        return k();
    }

    @Override // i2.b
    public final boolean m() {
        return true;
    }

    @Override // i2.b
    public final void n() {
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override // i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.L = Long.MIN_VALUE;
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override // i2.b
    public final void x(long j10, long j11) {
        float[] fArr;
        while (!k() && this.L < 100000 + j10) {
            h hVar = this.I;
            hVar.clear();
            hf.b bVar = this.c;
            bVar.L();
            if (w(bVar, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            long j12 = hVar.e;
            this.L = j12;
            boolean z10 = j12 < this.x;
            if (this.K != null && !z10) {
                hVar.d();
                ByteBuffer byteBuffer = hVar.c;
                String str = l0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    x xVar = this.J;
                    xVar.L(limit, array);
                    xVar.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(xVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.K.b();
                }
            }
        }
    }
}
