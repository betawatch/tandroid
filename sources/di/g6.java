package di;

import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g6 {
    public final float a;
    public final vy0 b;
    public final vy0 c;

    public g6(float f10, String str, CharSequence charSequence) {
        this.b = new vy0(str, 12.0f, null);
        this.c = new vy0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
