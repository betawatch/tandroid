package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b1 extends v00 {
    public final /* synthetic */ c1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var) {
        super(false);
        this.e = c1Var;
    }

    @Override // org.telegram.ui.Components.ho0
    public final CharSequence d() {
        StringBuilder sb = new StringBuilder();
        sb.append(ef.f.a(this.e.getSpeed()));
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
