package g;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
