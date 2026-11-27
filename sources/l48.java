// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStatsCollectorCallback;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l48 implements NativeLifecycleLock.NativePointerRunnable, NativeLifecycleLock.NativeRunnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PeerConnection b;
    public final /* synthetic */ RTCStatsCollectorCallback c;

    public /* synthetic */ l48(PeerConnection peerConnection, RTCStatsCollectorCallback rTCStatsCollectorCallback, byte b) {
        this.a = b;
        this.b = peerConnection;
        this.c = rTCStatsCollectorCallback;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        byte b = this.a;
        RTCStatsCollectorCallback rTCStatsCollectorCallback = this.c;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                peerConnection.lambda$getStats$36(rTCStatsCollectorCallback, j);
                break;
            default:
                peerConnection.lambda$getStats$34(rTCStatsCollectorCallback, j);
                break;
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeRunnable
    public final void run() {
        this.b.lambda$getStats$33(this.c);
    }
}
