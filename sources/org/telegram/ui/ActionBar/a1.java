package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class a1 extends u00 {
    public final /* synthetic */ b1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var) {
        super(false);
        this.e = b1Var;
    }

    @Override // org.telegram.ui.Components.co0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fd.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.w1.h(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override // org.telegram.ui.Components.u00
    public final float h() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.u00
    public final float i() {
        return 3.0f;
    }

    @Override // org.telegram.ui.Components.u00
    public final float j() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.u00
    public final float k() {
        return this.e.getSpeed();
    }

    @Override // org.telegram.ui.Components.u00
    public final void l(float f7) {
        this.e.d(f7, true);
    }
}
