package d3;

import d2.v;
import g2.n0;
import g2.y;
import j2.h;
import java.nio.ByteBuffer;
import k2.b;
import k2.d0;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends b {
    public final h J;
    public final y K;
    public d0 L;
    public long M;

    public a() {
        super(6);
        this.J = new h(1, 0);
        this.K = new y();
    }

    @Override // k2.b
    public final int C(v vVar) {
        return "application/x-camera-motion".equals(vVar.s) ? p1.a(4, 0, 0, 0) : p1.a(0, 0, 0, 0);
    }

    @Override // k2.b, k2.l1
    public final void d(int i3, Object obj) {
        if (i3 == 8) {
            this.L = (d0) obj;
        }
    }

    @Override // k2.b
    public final String j() {
        return "CameraMotionRenderer";
    }

    @Override // k2.b
    public final boolean l() {
        return k();
    }

    @Override // k2.b
    public final boolean m() {
        return true;
    }

    @Override // k2.b
    public final void n() {
        d0 d0Var = this.L;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override // k2.b
    public final void p(long j10, boolean z10, boolean z11) {
        this.M = Long.MIN_VALUE;
        d0 d0Var = this.L;
        if (d0Var != null) {
            d0Var.c();
        }
    }

    @Override // k2.b
    public final void x(long j10, long j11) {
        float[] fArr;
        while (!k() && this.M < 100000 + j10) {
            h hVar = this.J;
            hVar.clear();
            tf.b bVar = this.c;
            bVar.q();
            if (w(bVar, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            long j12 = hVar.e;
            this.M = j12;
            boolean z10 = j12 < this.x;
            if (this.L != null && !z10) {
                hVar.c();
                ByteBuffer byteBuffer = hVar.c;
                String str = n0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    y yVar = this.K;
                    yVar.L(limit, array);
                    yVar.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i3 = 0; i3 < 3; i3++) {
                        fArr2[i3] = Float.intBitsToFloat(yVar.o());
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
