package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.v00;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a1 extends v00 {
    public final /* synthetic */ b1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var) {
        super(false);
        this.e = b1Var;
    }

    @Override // org.telegram.ui.Components.co0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ed.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.z0.h(R.string.AccDescrSpeedSlider, sb2);
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
