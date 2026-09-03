package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b1 extends v00 {
    public final /* synthetic */ c1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var) {
        super(false);
        this.e = c1Var;
    }

    @Override // org.telegram.ui.Components.go0
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(df.f.a(this.e.getSpeed()));
        sb.append("x  ");
        return org.telegram.messenger.y3.h(R.string.AccDescrSpeedSlider, sb);
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
    public final void l(float f10) {
        this.e.d(f10, true);
    }
}
