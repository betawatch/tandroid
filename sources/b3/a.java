package b3;

import b2.s;
import e2.d0;
import e2.v;
import h2.h;
import hc.b;
import i2.c0;
import i2.f;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a extends f {
    public final h I;
    public final v J;
    public c0 K;
    public long L;

    public a() {
        super(6);
        this.I = new h(1, 0);
        this.J = new v();
    }

    @Override // i2.f
    public final int A(s sVar) {
        return "application/x-camera-motion".equals(sVar.r) ? b.c(4, 0, 0, 0) : b.c(0, 0, 0, 0);
    }

    @Override // i2.f, i2.h1
    public final void c(int i10, Object obj) {
        if (i10 == 8) {
            this.K = (c0) obj;
        }
    }

    @Override // i2.f
    public final String j() {
        return "CameraMotionRenderer";
    }

    @Override // i2.f
    public final boolean l() {
        return k();
    }

    @Override // i2.f
    public final boolean m() {
        return true;
    }

    @Override // i2.f
    public final void o() {
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.d();
        }
    }

    @Override // i2.f
    public final void q(long j3, boolean z10) {
        this.L = Long.MIN_VALUE;
        c0 c0Var = this.K;
        if (c0Var != null) {
            c0Var.d();
        }
    }

    @Override // i2.f
    public final void x(long j3, long j10) {
        float[] fArr;
        while (!k() && this.L < 100000 + j3) {
            h hVar = this.I;
            hVar.clear();
            of.b bVar = this.c;
            bVar.F();
            if (w(bVar, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            long j11 = hVar.e;
            this.L = j11;
            boolean z10 = j11 < this.w;
            if (this.K != null && !z10) {
                hVar.c();
                ByteBuffer byteBuffer = hVar.c;
                String str = d0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    v vVar = this.J;
                    vVar.H(limit, array);
                    vVar.J(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(vVar.l());
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
