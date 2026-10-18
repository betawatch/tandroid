package b3;

import b2.w;
import e2.m0;
import e2.x;
import h2.h;
import i2.b;
import i2.c0;
import i2.d;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a extends b {
    public final h I;
    public final x J;
    public c0 K;
    public long L;

    public a() {
        super(6);
        this.I = new h(1, 0);
        this.J = new x();
    }

    @Override // i2.b
    public final int C(w wVar) {
        return "application/x-camera-motion".equals(wVar.s) ? d.c(4, 0, 0, 0) : d.c(0, 0, 0, 0);
    }

    @Override // i2.b, i2.k1
    public final void c(int i10, Object obj) {
        if (i10 == 8) {
            this.K = (c0) obj;
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
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.d();
        }
    }

    @Override // i2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.L = Long.MIN_VALUE;
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.d();
        }
    }

    @Override // i2.b
    public final void x(long j10, long j11) {
        float[] fArr;
        while (!k() && this.L < 100000 + j10) {
            h hVar = this.I;
            hVar.clear();
            qf.b bVar = this.c;
            bVar.z();
            if (w(bVar, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            long j12 = hVar.e;
            this.L = j12;
            boolean z10 = j12 < this.w;
            if (this.K != null && !z10) {
                hVar.f();
                ByteBuffer byteBuffer = hVar.c;
                String str = m0.a;
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
