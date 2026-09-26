package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class z0 extends v00 {
    public final /* synthetic */ a1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var) {
        super(false);
        this.e = a1Var;
    }

    @Override // org.telegram.ui.Components.po0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ed.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.f0.g(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override // org.telegram.ui.Components.v00
    public final float h() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.v00
    public final float i() {
        return 3.0f;
    }

    @Override // org.telegram.ui.Components.v00
    public final float j() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.v00
    public final float k() {
        return this.e.getSpeed();
    }

    @Override // org.telegram.ui.Components.v00
    public final void l(float f7) {
        this.e.d(f7, true);
    }
}
