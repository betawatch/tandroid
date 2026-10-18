package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
