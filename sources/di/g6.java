package di;

import org.telegram.ui.Components.wy0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g6 {
    public final float a;
    public final wy0 b;
    public final wy0 c;

    public g6(float f10, String str, CharSequence charSequence) {
        this.b = new wy0(str, 12.0f, null);
        this.c = new wy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
