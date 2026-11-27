// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
