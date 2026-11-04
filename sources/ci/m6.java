package ci;

import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m6 {
    public final float a;
    public final ly0 b;
    public final ly0 c;

    public m6(float f10, String str, CharSequence charSequence) {
        this.b = new ly0(str, 12.0f, null);
        this.c = new ly0(charSequence, 12.0f, org.telegram.messenger.g0.o());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.i(), this.c.i());
    }
}
