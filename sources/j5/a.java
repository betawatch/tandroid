package j5;

import e2.c;
import f7.b;
import h5.w;
import j3.d0;
import j3.e;
import j3.n0;
import java.nio.ByteBuffer;
import n3.i;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends e {
    public final i B;
    public final w C;
    public d0 D;
    public long E;

    public a() {
        super(6);
        this.B = new i(1, 0);
        this.C = new w();
    }

    @Override // j3.e, j3.b2
    public final void b(int i10, Object obj) {
        if (i10 == 8) {
            this.D = (d0) obj;
        }
    }

    @Override // j3.e
    public final String g() {
        return "CameraMotionRenderer";
    }

    @Override // j3.e
    public final boolean i() {
        return h();
    }

    @Override // j3.e
    public final boolean j() {
        return true;
    }

    @Override // j3.e
    public final void k() {
        d0 d0Var = this.D;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    @Override // j3.e
    public final void m(long j10, boolean z4) {
        this.E = Long.MIN_VALUE;
        d0 d0Var = this.D;
        if (d0Var != null) {
            d0Var.d();
        }
    }

    @Override // j3.e
    public final void t(long j10, long j11) {
        float[] fArr;
        while (!h() && this.E < 100000 + j10) {
            i iVar = this.B;
            iVar.c();
            b bVar = this.c;
            bVar.l();
            if (s(bVar, iVar, 0) != -4 || iVar.e(4)) {
                return;
            }
            this.E = iVar.f;
            if (this.D != null && !iVar.e(TLObject.FLAG_31)) {
                iVar.l();
                ByteBuffer byteBuffer = iVar.d;
                int i10 = h5.d0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    w wVar = this.C;
                    wVar.D(limit, array);
                    wVar.F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(wVar.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.D.c();
                }
            }
        }
    }

    @Override // j3.e
    public final int x(n0 n0Var) {
        return "application/x-camera-motion".equals(n0Var.C) ? c.b(4, 0, 0) : c.b(0, 0, 0);
    }

    @Override // j3.e
    public final void r(n0[] n0VarArr, long j10, long j11) {
    }
}
