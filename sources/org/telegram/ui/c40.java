package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c40 extends View {
    public final /* synthetic */ f60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = f60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
