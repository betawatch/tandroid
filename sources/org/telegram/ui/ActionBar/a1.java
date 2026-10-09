package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.k10;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a1 extends k10 {
    public final /* synthetic */ b1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var) {
        super(false);
        this.e = b1Var;
    }

    @Override // org.telegram.ui.Components.hp0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hd.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.q.g(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override // org.telegram.ui.Components.k10
    public final float h() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.k10
    public final float i() {
        return 3.0f;
    }

    @Override // org.telegram.ui.Components.k10
    public final float j() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.k10
    public final float k() {
        return this.e.getSpeed();
    }

    @Override // org.telegram.ui.Components.k10
    public final void l(float f7) {
        this.e.d(f7, true);
    }
}
