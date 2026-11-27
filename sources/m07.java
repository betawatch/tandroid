// default package

import org.webrtc.AudioTrack;
import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
