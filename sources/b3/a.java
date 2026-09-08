package b3;

import b2.s;
import e2.v;
import h2.h;
import i2.d0;
import i2.f;
import i2.g;
import java.nio.ByteBuffer;
import n4.y;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends f {
    public final h I;
    public final v J;
    public d0 K;
    public long L;

    public a() {
        super(6);
        this.I = new h(1, 0);
        this.J = new v();
    }

    @Override // i2.f
    public final int A(s sVar) {
        return "application/x-camera-motion".equals(sVar.r) ? g.b(4, 0, 0, 0) : g.b(0, 0, 0, 0);
    }

    @Override // i2.f, i2.i1
    public final void d(int i10, Object obj) {
        if (i10 == 8) {
            this.K = (d0) obj;
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
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // i2.f
    public final void q(long j3, boolean z10) {
        this.L = Long.MIN_VALUE;
        d0 d0Var = this.K;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // i2.f
    public final void x(long j3, long j10) {
        float[] fArr;
        while (!k() && this.L < 100000 + j3) {
            h hVar = this.I;
            hVar.clear();
            y yVar = this.c;
            yVar.A();
            if (w(yVar, hVar, 0) != -4 || hVar.isEndOfStream()) {
                return;
            }
            long j11 = hVar.e;
            this.L = j11;
            boolean z10 = j11 < this.w;
            if (this.K != null && !z10) {
                hVar.c();
                ByteBuffer byteBuffer = hVar.c;
                String str = e2.d0.a;
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
                    this.K.a();
                }
            }
        }
    }
}
