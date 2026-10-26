package b3;

import c3.h0;
import e2.n0;
import e2.x;
import h2.h;
import i2.b;
import i2.e0;
import java.nio.ByteBuffer;
import n4.s;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a extends b {
    public final h I;
    public final x J;
    public e0 K;
    public long L;

    public a() {
        super(6);
        this.I = new h(1, 0);
        this.J = new x();
    }

    @Override // i2.b
    public final int C(b2.x xVar) {
        return "application/x-camera-motion".equals(xVar.s) ? h0.c(4, 0, 0, 0) : h0.c(0, 0, 0, 0);
    }

    @Override // i2.b, i2.m1
    public final void c(int i10, Object obj) {
        if (i10 == 8) {
            this.K = (e0) obj;
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
        e0 e0Var = this.K;
        if (e0Var != null) {
            e0Var.d();
        }
    }

    @Override // i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.L = Long.MIN_VALUE;
        e0 e0Var = this.K;
        if (e0Var != null) {
            e0Var.d();
        }
    }

    @Override // i2.b
    public final void x(long j10, long j11) {
        float[] fArr;
        while (!k() && this.L < 100000 + j10) {
            h hVar = this.I;
            hVar.clear();
            s sVar = this.c;
            sVar.d();
            if (w(sVar, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            long j12 = hVar.e;
            this.L = j12;
            boolean z10 = j12 < this.w;
            if (this.K != null && !z10) {
                hVar.d();
                ByteBuffer byteBuffer = hVar.c;
                String str = n0.a;
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
