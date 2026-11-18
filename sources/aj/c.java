package aj;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class c {
    public volatile boolean a;
    public volatile int b;

    public final int a() {
        if (!this.a) {
            synchronized (this) {
                try {
                    if (!this.a) {
                        this.b = d.a.getInt("round_video_video_bitrate", 1200000);
                        this.a = true;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }
}
