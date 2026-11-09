package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g20 extends View {
    public final /* synthetic */ e40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = e40Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.U0();
        }
    }
}
