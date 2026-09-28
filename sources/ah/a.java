package ah;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
