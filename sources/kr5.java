// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class kr5 {
    public volatile boolean a;
    public volatile int b;

    public final int a() {
        if (!this.a) {
            synchronized (this) {
                if (!this.a) {
                    this.b = zba.a.getInt("round_video_video_bitrate", 1200000);
                    this.a = true;
                }
            }
        }
        return this.b;
    }
}
