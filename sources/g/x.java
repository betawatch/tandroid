package g;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x {
    public long a;
    public boolean b;

    public void a(long j10) {
        this.a = MediaDataController.calcHash(this.a, j10);
    }

    public void b(boolean z10) {
        a(z10 ? 1L : 0L);
    }

    public void c(float f9) {
        a(Float.floatToIntBits(f9));
    }
}
