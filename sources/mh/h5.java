package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h5 {
    public final float a;
    public final k01 b;
    public final k01 c;

    public h5(float f10, String str, CharSequence charSequence) {
        this.b = new k01(str, 12.0f, null);
        this.c = new k01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f10;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
