// default package

import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j48 implements NativeLifecycleLock.NativeRunnable, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativeCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PeerConnection b;
    public final /* synthetic */ MediaStream c;

    public /* synthetic */ j48(PeerConnection peerConnection, MediaStream mediaStream, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = mediaStream;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeCallable
    public final Object call() {
        Boolean lambda$addStream$17;
        lambda$addStream$17 = this.b.lambda$addStream$17(this.c);
        return lambda$addStream$17;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeRunnable
    public final void run() {
        byte b = this.a;
        MediaStream mediaStream = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$removeStream$19(mediaStream);
                break;
            default:
                peerConnection.lambda$dispose$47(mediaStream);
                break;
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$addStream$16;
        lambda$addStream$16 = this.b.lambda$addStream$16(this.c, j);
        return lambda$addStream$16;
    }
}
