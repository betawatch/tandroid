package g;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
