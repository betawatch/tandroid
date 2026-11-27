// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class n48 implements NativeLifecycleLock.NativeRunnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PeerConnection b;
    public final /* synthetic */ SdpObserver c;
    public final /* synthetic */ SessionDescription d;

    public /* synthetic */ n48(PeerConnection peerConnection, SdpObserver sdpObserver, SessionDescription sessionDescription, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = sdpObserver;
        this.d = sessionDescription;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeRunnable
    public final void run() {
        byte b = this.a;
        SessionDescription sessionDescription = this.d;
        SdpObserver sdpObserver = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$setLocalDescription$7(sdpObserver, sessionDescription);
                break;
            default:
                peerConnection.lambda$setRemoteDescription$8(sdpObserver, sessionDescription);
                break;
        }
    }
}
