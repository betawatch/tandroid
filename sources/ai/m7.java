package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class m7 {
    public final float a;
    public final e11 b;
    public final e11 c;

    public m7(float f7, String str, CharSequence charSequence) {
        this.b = new e11(str, 12.0f, null);
        this.c = new e11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
