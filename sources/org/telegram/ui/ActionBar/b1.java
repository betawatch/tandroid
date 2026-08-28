package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b1 extends f00 {
    public final /* synthetic */ c1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var) {
        super(false);
        this.e = c1Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(vc.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.l0.h(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override // org.telegram.ui.Components.f00
    public final float h() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.f00
    public final float i() {
        return 3.0f;
    }

    @Override // org.telegram.ui.Components.f00
    public final float j() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.f00
    public final float k() {
        return this.e.getSpeed();
    }

    @Override // org.telegram.ui.Components.f00
    public final void l(float f10) {
        this.e.d(f10, true);
    }
}
