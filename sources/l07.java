// default package

import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l07 implements NativeLifecycleLock.NativePointerCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MediaStream b;
    public final /* synthetic */ long c;
    public final /* synthetic */ VideoTrack d;

    public /* synthetic */ l07(MediaStream mediaStream, long j, VideoTrack videoTrack, byte b) {
        this.a = b;
        this.b = mediaStream;
        this.c = j;
        this.d = videoTrack;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$addTrack$2;
        Boolean lambda$addPreservedTrack$4;
        switch (this.a) {
            case 0:
                lambda$addTrack$2 = this.b.lambda$addTrack$2(this.c, this.d, j);
                return lambda$addTrack$2;
            default:
                lambda$addPreservedTrack$4 = this.b.lambda$addPreservedTrack$4(this.c, this.d, j);
                return lambda$addPreservedTrack$4;
        }
    }
}
