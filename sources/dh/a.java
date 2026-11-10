package dh;

import org.telegram.messenger.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a {
    public boolean a;
    public long b;

    public void a(long j3) {
        this.b = ui.p(this.b, j3);
    }

    public void b(boolean z9) {
        a(z9 ? 1L : 0L);
    }

    public void c(float f10) {
        a(Float.floatToIntBits(f10));
    }
}
