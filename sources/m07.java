// default package

import org.webrtc.AudioTrack;
import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m07 implements NativeLifecycleLock.NativePointerCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaStream b;
    public final /* synthetic */ AudioTrack c;

    public /* synthetic */ m07(MediaStream mediaStream, AudioTrack audioTrack, byte b) {
        this.a = b;
        this.b = mediaStream;
        this.c = audioTrack;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$addTrack$1;
        Boolean lambda$removeTrack$7;
        byte b = this.a;
        AudioTrack audioTrack = this.c;
        MediaStream mediaStream = this.b;
        switch (b) {
            case 0:
                lambda$addTrack$1 = mediaStream.lambda$addTrack$1(audioTrack, j);
                return lambda$addTrack$1;
            default:
                lambda$removeTrack$7 = mediaStream.lambda$removeTrack$7(audioTrack, j);
                return lambda$removeTrack$7;
        }
    }
}
