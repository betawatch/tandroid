// default package

import org.webrtc.MediaConstraints;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m48 implements NativeLifecycleLock.NativeRunnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PeerConnection b;
    public final /* synthetic */ SdpObserver c;
    public final /* synthetic */ MediaConstraints d;

    public /* synthetic */ m48(PeerConnection peerConnection, SdpObserver sdpObserver, MediaConstraints mediaConstraints, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = sdpObserver;
        this.d = mediaConstraints;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeRunnable
    public final void run() {
        byte b = this.a;
        MediaConstraints mediaConstraints = this.d;
        SdpObserver sdpObserver = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$createOffer$4(sdpObserver, mediaConstraints);
                break;
            default:
                peerConnection.lambda$createAnswer$5(sdpObserver, mediaConstraints);
                break;
        }
    }
}
