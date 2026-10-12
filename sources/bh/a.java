package bh;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
