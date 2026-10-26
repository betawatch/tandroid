package ch;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
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
