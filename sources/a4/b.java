package a4;

import android.os.HandlerThread;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p8.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i10, int i11) {
        this.a = i11;
        this.b = i10;
    }

    @Override // p8.i
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(c.j(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(c.j(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
