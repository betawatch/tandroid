package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.q00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b1 extends q00 {
    public final /* synthetic */ c1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var) {
        super(false);
        this.e = c1Var;
    }

    @Override // org.telegram.ui.Components.xn0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cf.f.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.x3.i(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override // org.telegram.ui.Components.q00
    public final float h() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.q00
    public final float i() {
        return 3.0f;
    }

    @Override // org.telegram.ui.Components.q00
    public final float j() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.q00
    public final float k() {
        return this.e.getSpeed();
    }

    @Override // org.telegram.ui.Components.q00
    public final void l(float f9) {
        this.e.d(f9, true);
    }
}
