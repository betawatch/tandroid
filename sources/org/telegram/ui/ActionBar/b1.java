package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.dd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b1 extends d10 {
    public final /* synthetic */ c1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var) {
        super(false);
        this.e = c1Var;
    }

    @Override // org.telegram.ui.Components.jp0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(dd.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.t.h(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override // org.telegram.ui.Components.d10
    public final float h() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.d10
    public final float i() {
        return 3.0f;
    }

    @Override // org.telegram.ui.Components.d10
    public final float j() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.d10
    public final float k() {
        return this.e.getSpeed();
    }

    @Override // org.telegram.ui.Components.d10
    public final void l(float f7) {
        this.e.e(f7, true);
    }
}
