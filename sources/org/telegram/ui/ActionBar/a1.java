package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.i00;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a1 extends i00 {
    public final /* synthetic */ b1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var) {
        super(false);
        this.e = b1Var;
    }

    @Override // org.telegram.ui.Components.nn0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(af.g.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.y1.i(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override // org.telegram.ui.Components.i00
    public final float h() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.i00
    public final float i() {
        return 3.0f;
    }

    @Override // org.telegram.ui.Components.i00
    public final float j() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.i00
    public final float k() {
        return this.e.getSpeed();
    }

    @Override // org.telegram.ui.Components.i00
    public final void l(float f10) {
        this.e.d(f10, true);
    }
}
