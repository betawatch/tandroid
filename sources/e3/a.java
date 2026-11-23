package e3;

import e2.u;
import h2.l0;
import h2.x;
import i5.c;
import java.nio.ByteBuffer;
import jb.m;
import k2.h;
import l2.b;
import l2.b0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a extends b {
    public final h J;
    public final x K;
    public b0 L;
    public long M;

    public a() {
        super(6);
        this.J = new h(1, 0);
        this.K = new x();
    }

    @Override // l2.b
    public final int C(u uVar) {
        return "application/x-camera-motion".equals(uVar.s) ? c.a(4, 0, 0, 0) : c.a(0, 0, 0, 0);
    }

    @Override // l2.b, l2.j1
    public final void c(int i7, Object obj) {
        if (i7 == 8) {
            this.L = (b0) obj;
        }
    }

    @Override // l2.b
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // l2.b
    public final boolean k() {
        return j();
    }

    @Override // l2.b
    public final boolean m() {
        return true;
    }

    @Override // l2.b
    public final void n() {
        b0 b0Var = this.L;
        if (b0Var != null) {
            b0Var.d();
        }
    }

    @Override // l2.b
    public final void p(long j3, boolean z10, boolean z11) {
        this.M = Long.MIN_VALUE;
        b0 b0Var = this.L;
        if (b0Var != null) {
            b0Var.d();
        }
    }

    @Override // l2.b
    public final void x(long j3, long j10) {
        float[] fArr;
        while (!j() && this.M < 100000 + j3) {
            h hVar = this.J;
            hVar.clear();
            m mVar = this.c;
            mVar.T();
            if (w(mVar, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            long j11 = hVar.e;
            this.M = j11;
            boolean z10 = j11 < this.x;
            if (this.L != null && !z10) {
                hVar.c();
                ByteBuffer byteBuffer = hVar.c;
                String str = l0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    x xVar = this.K;
                    xVar.L(limit, array);
                    xVar.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i7 = 0; i7 < 3; i7++) {
                        fArr2[i7] = Float.intBitsToFloat(xVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.L.b();
                }
            }
        }
    }
}
