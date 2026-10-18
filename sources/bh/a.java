package bh;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;
    public long b;

    public void a(long j10) {
        this.b = MediaDataController.calcHash(this.b, j10);
    }

    public void b(boolean z10) {
        a(z10 ? 1L : 0L);
    }

    public void c(float f7) {
        a(Float.floatToIntBits(f7));
    }
}
