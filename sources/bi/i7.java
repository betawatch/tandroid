package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q11;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i7 {
    public final float a;
    public final q11 b;
    public final q11 c;

    public i7(float f7, String str, CharSequence charSequence) {
        this.b = new q11(str, 12.0f, null);
        this.c = new q11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
