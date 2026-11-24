// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hp5 {
    public volatile boolean a;
    public volatile int b;

    public final int a() {
        if (!this.a) {
            synchronized (this) {
                if (!this.a) {
                    this.b = j8a.a.getInt("round_video_video_bitrate", 1200000);
                    this.a = true;
                }
            }
        }
        return this.b;
    }
}
