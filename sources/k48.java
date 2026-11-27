// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k48 implements NativeLifecycleLock.NativeRunnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PeerConnection b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ k48(PeerConnection peerConnection, boolean z, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = z;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeRunnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$setAudioRecording$11(z);
                break;
            default:
                peerConnection.lambda$setAudioPlayout$10(z);
                break;
        }
    }
}
