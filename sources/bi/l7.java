package bi;

import org.telegram.ui.Components.my0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l7 {
    public final float a;
    public final my0 b;
    public final my0 c;

    public l7(float f10, String str, CharSequence charSequence) {
        this.b = new my0(str, 12.0f, null);
        this.c = new my0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
