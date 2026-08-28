package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l5 {
    public final float a;
    public final nz0 b;
    public final nz0 c;

    public l5(float f10, String str, CharSequence charSequence) {
        this.b = new nz0(str, 12.0f, null);
        this.c = new nz0(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
