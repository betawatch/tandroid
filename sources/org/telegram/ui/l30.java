package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l30 extends View {
    public final /* synthetic */ o50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = o50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.S0();
        }
    }
}
