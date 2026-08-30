package g;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class x {
    public long a;
    public boolean b;

    public void a(long j10) {
        this.a = MediaDataController.calcHash(this.a, j10);
    }

    public void b(boolean z4) {
        a(z4 ? 1L : 0L);
    }

    public void c(float f10) {
        a(Float.floatToIntBits(f10));
    }
}
