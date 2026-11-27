// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnectionFactory;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ml0 implements nl0, b86, xx6, ot2, NativeLifecycleLock.NativePointerCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ ml0(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override // ot2
    public final void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((og8) obj).J(this.b, this.c);
                break;
            default:
                ((og8) obj).s0(this.b, this.c);
                break;
        }
    }

    @Override // xx6
    public final void b(ww6 ww6Var, int i) {
        ww6Var.c(i, this.b, this.c);
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$startAecDump$10;
        lambda$startAecDump$10 = PeerConnectionFactory.lambda$startAecDump$10(this.b, this.c, j);
        return lambda$startAecDump$10;
    }

    @Override // b86
    public final void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((bg8) obj).M(this.b, this.c);
                break;
            default:
                ((bg8) obj).M(this.b, this.c);
                break;
        }
    }

    @Override // nl0
    public final int l(vnb vnbVar, boolean z) {
        return z ? this.b : this.c;
    }
}
