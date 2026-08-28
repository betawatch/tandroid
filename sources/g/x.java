package g;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public void c(float f10) {
        a(Float.floatToIntBits(f10));
    }
}
