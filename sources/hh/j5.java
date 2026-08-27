package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j5 {
    public final float a;
    public final pz0 b;
    public final pz0 c;

    public j5(float f10, String str, CharSequence charSequence) {
        this.b = new pz0(str, 12.0f, null);
        this.c = new pz0(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
