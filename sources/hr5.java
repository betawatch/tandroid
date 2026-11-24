// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hr5 {
    public volatile boolean a;
    public volatile int b;

    public final int a() {
        if (!this.a) {
            synchronized (this) {
                if (!this.a) {
                    this.b = jaa.a.getInt("round_video_video_bitrate", 1200000);
                    this.a = true;
                }
            }
        }
        return this.b;
    }
}
