package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i5 {
    public final float a;
    public final zz0 b;
    public final zz0 c;

    public i5(float f9, String str, CharSequence charSequence) {
        this.b = new zz0(str, 12.0f, null);
        this.c = new zz0(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f9;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
