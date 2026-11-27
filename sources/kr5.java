// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kr5 {
    public volatile boolean a;
    public volatile int b;

    public final int a() {
        if (!this.a) {
            synchronized (this) {
                if (!this.a) {
                    this.b = aca.a.getInt("round_video_video_bitrate", 1200000);
                    this.a = true;
                }
            }
        }
        return this.b;
    }
}
