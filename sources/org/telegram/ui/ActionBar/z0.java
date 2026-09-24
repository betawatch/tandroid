package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        sb2.append(fd.a(this.e.getSpeed()));
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
