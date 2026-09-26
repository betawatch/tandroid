package ah;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;
    public long b;

    public void a(long j3) {
        this.b = MediaDataController.calcHash(this.b, j3);
    }

    public void b(boolean z10) {
        a(z10 ? 1L : 0L);
    }

    public void c(float f7) {
        a(Float.floatToIntBits(f7));
    }
}
