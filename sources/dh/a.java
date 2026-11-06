package dh;

import org.telegram.messenger.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
