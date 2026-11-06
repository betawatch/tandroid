package e3;

import e2.u;
import h2.m0;
import h2.x;
import java.nio.ByteBuffer;
import jg.g;
import k2.h;
import l2.b;
import l2.d0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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

    @Override // l2.b
    public final int C(u uVar) {
        return "application/x-camera-motion".equals(uVar.s) ? g.b(4, 0, 0, 0) : g.b(0, 0, 0, 0);
    }

    @Override // l2.b, l2.m1
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.K = (d0) obj;
        }
    }

    @Override // l2.b
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // l2.b
    public final boolean l() {
        return k();
    }

    @Override // l2.b
    public final boolean m() {
        return true;
    }

    @Override // l2.b
    public final void n() {
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    @Override // l2.b
    public final void p(long j3, boolean z9, boolean z10) {
        this.L = Long.MIN_VALUE;
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        float[] fArr;
        while (!k() && this.L < 100000 + j3) {
            h hVar = this.I;
            hVar.clear();
            wf.b bVar = this.c;
            bVar.A();
            if (w(bVar, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            long j11 = hVar.e;
            this.L = j11;
            boolean z9 = j11 < this.x;
            if (this.K != null && !z9) {
                hVar.c();
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
                    for (int i7 = 0; i7 < 3; i7++) {
                        fArr2[i7] = Float.intBitsToFloat(xVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.K.a();
                }
            }
        }
    }
}
