package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f40 extends View {
    public final /* synthetic */ j60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = j60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
