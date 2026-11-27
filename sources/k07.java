// default package

import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k07 implements NativeLifecycleLock.NativePointerCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaStream b;
    public final /* synthetic */ VideoTrack c;

    public /* synthetic */ k07(MediaStream mediaStream, VideoTrack videoTrack, byte b) {
        this.a = b;
        this.b = mediaStream;
        this.c = videoTrack;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$removeTrack$9;
        Boolean lambda$addPreservedTrack$5;
        Boolean lambda$addTrack$3;
        byte b = this.a;
        VideoTrack videoTrack = this.c;
        MediaStream mediaStream = this.b;
        switch (b) {
            case 0:
                lambda$removeTrack$9 = mediaStream.lambda$removeTrack$9(videoTrack, j);
                return lambda$removeTrack$9;
            case 1:
                lambda$addPreservedTrack$5 = mediaStream.lambda$addPreservedTrack$5(videoTrack, j);
                return lambda$addPreservedTrack$5;
            default:
                lambda$addTrack$3 = mediaStream.lambda$addTrack$3(videoTrack, j);
                return lambda$addTrack$3;
        }
    }
}
