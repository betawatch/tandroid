package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class l7 {
    public final float a;
    public final d11 b;
    public final d11 c;

    public l7(float f7, String str, CharSequence charSequence) {
        this.b = new d11(str, 12.0f, null);
        this.c = new d11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
