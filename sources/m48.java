// default package

import org.webrtc.MediaConstraints;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
