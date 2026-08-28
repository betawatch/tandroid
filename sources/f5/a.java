package f5;

import d5.f0;
import d5.y;
import e2.c;
import h3.e;
import h3.i0;
import h3.t0;
import java.nio.ByteBuffer;
import k3.i;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends e {
    public final i a;
    public final y b;
    public i0 c;
    public long d;

    public a() {
        super(6);
        this.a = new i(1, 0);
        this.b = new y();
    }

    @Override // h3.e, h3.h2
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // h3.e, h3.d2
    public final void handleMessage(int i9, Object obj) {
        if (i9 == 8) {
            this.c = (i0) obj;
        }
    }

    @Override // h3.e
    public final boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // h3.e
    public final boolean isReady() {
        return true;
    }

    @Override // h3.e
    public final void onDisabled() {
        i0 i0Var = this.c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override // h3.e
    public final void onPositionReset(long j10, boolean z10) {
        this.d = Long.MIN_VALUE;
        i0 i0Var = this.c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override // h3.e
    public final void render(long j10, long j11) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.d < 100000 + j10) {
            i iVar = this.a;
            iVar.clear();
            if (readSource(getFormatHolder(), iVar, 0) != -4 || iVar.isEndOfStream()) {
                return;
            }
            this.d = iVar.d;
            if (this.c != null && !iVar.isDecodeOnly()) {
                iVar.d();
                ByteBuffer byteBuffer = iVar.b;
                int i9 = f0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    y yVar = this.b;
                    yVar.A(limit, array);
                    yVar.C(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(yVar.g());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.c.b();
                }
            }
        }
    }

    @Override // h3.h2
    public final int supportsFormat(t0 t0Var) {
        return "application/x-camera-motion".equals(t0Var.B) ? c.b(4, 0, 0) : c.b(0, 0, 0);
    }

    @Override // h3.e
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
    }
}
