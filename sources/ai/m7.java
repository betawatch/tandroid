package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class m7 {
    public final float a;
    public final i11 b;
    public final i11 c;

    public m7(float f7, String str, CharSequence charSequence) {
        this.b = new i11(str, 12.0f, null);
        this.c = new i11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
