package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ed;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class z0 extends c10 {
    public final /* synthetic */ a1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var) {
        super(false);
        this.e = a1Var;
    }

    @Override // org.telegram.ui.Components.ep0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ed.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.v0.h(R.string.AccDescrSpeedSlider, sb2);
    }

    @Override // org.telegram.ui.Components.c10
    public final float h() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.c10
    public final float i() {
        return 3.0f;
    }

    @Override // org.telegram.ui.Components.c10
    public final float j() {
        return 0.2f;
    }

    @Override // org.telegram.ui.Components.c10
    public final float k() {
        return this.e.getSpeed();
    }

    @Override // org.telegram.ui.Components.c10
    public final void l(float f7) {
        this.e.e(f7, true);
    }
}
