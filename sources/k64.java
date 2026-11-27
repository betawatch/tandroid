// default package

import android.os.Bundle;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class k64 implements b86, nu4, ot2, NativeLifecycleLock.NativePointerCallable, rs4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ k64(byte b, boolean z) {
        this.a = b;
        this.b = z;
    }

    @Override // ot2
    public final void accept(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        og8 og8Var = (og8) obj;
        switch (b) {
            case 3:
                og8Var.V(z);
                break;
            case 4:
                og8Var.o0(z);
                break;
            default:
                og8Var.v(z);
                break;
        }
    }

    @Override // rs4
    public final v21 b(d31 d31Var) {
        return d31Var.k(this.b);
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$setEnabled$3;
        lambda$setEnabled$3 = MediaStreamTrack.lambda$setEnabled$3(this.b, j);
        return lambda$setEnabled$3;
    }

    @Override // nu4
    public final Object h(Object obj) {
        Bundle l = bs2.l("afterSignup", this.b);
        fj6 fj6Var = new fj6();
        fj6Var.s0(l);
        return fj6Var;
    }

    @Override // b86
    public final void invoke(Object obj) {
        byte b = this.a;
        boolean z = this.b;
        bg8 bg8Var = (bg8) obj;
        switch (b) {
            case 0:
                bg8Var.v(z);
                break;
            default:
                bg8Var.h(z);
                break;
        }
    }
}
