package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l01;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class h5 {
    public final float a;
    public final l01 b;
    public final l01 c;

    public h5(float f10, String str, CharSequence charSequence) {
        this.b = new l01(str, 12.0f, null);
        this.c = new l01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
