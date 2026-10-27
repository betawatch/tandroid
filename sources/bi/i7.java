package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class i7 {
    public final float a;
    public final r11 b;
    public final r11 c;

    public i7(float f7, String str, CharSequence charSequence) {
        this.b = new r11(str, 12.0f, null);
        this.c = new r11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
