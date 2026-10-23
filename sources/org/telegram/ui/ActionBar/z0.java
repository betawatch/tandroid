package org.telegram.ui.ActionBar;

import org.telegram.messenger.R;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ed;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class z0 extends c10 {
    public final /* synthetic */ a1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var) {
        super(false);
        this.e = a1Var;
    }

    @Override // org.telegram.ui.Components.ap0
    public final CharSequence d() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ed.a(this.e.getSpeed()));
        sb2.append("x  ");
        return org.telegram.messenger.g0.g(R.string.AccDescrSpeedSlider, sb2);
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
        this.e.d(f7, true);
    }
}
