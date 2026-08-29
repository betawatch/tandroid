package h5;

import f5.d0;
import f5.w;
import j3.e;
import j3.i0;
import j3.t0;
import java.nio.ByteBuffer;
import m3.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends e {
    public final i a;
    public final w b;
    public i0 c;
    public long d;

    public a() {
        super(6);
        this.a = new i(1, 0);
        this.b = new w();
    }

    @Override // j3.e, j3.h2
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // j3.e, j3.d2
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 8) {
            this.c = (i0) obj;
        }
    }

    @Override // j3.e
    public final boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // j3.e
    public final boolean isReady() {
        return true;
    }

    @Override // j3.e
    public final void onDisabled() {
        i0 i0Var = this.c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override // j3.e
    public final void onPositionReset(long j10, boolean z10) {
        this.d = Long.MIN_VALUE;
        i0 i0Var = this.c;
        if (i0Var != null) {
            i0Var.c();
        }
    }

    @Override // j3.e
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
                iVar.c();
                ByteBuffer byteBuffer = iVar.b;
                int i10 = d0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    w wVar = this.b;
                    wVar.A(limit, array);
                    wVar.C(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i11 = 0; i11 < 3; i11++) {
                        fArr2[i11] = Float.intBitsToFloat(wVar.g());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.c.b();
                }
            }
        }
    }

    @Override // j3.h2
    public final int supportsFormat(t0 t0Var) {
        return "application/x-camera-motion".equals(t0Var.B) ? com.google.android.recaptcha.internal.a.b(4, 0, 0) : com.google.android.recaptcha.internal.a.b(0, 0, 0);
    }

    @Override // j3.e
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
    }
}
