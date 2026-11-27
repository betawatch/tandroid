// default package

import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.RTCStatsCollectorCallback;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
