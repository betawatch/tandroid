package ch;

import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
