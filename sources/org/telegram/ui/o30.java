package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o30 extends View {
    public final /* synthetic */ s50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = s50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.S0();
        }
    }
}
