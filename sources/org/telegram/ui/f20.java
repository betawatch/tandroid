package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f20 extends View {
    public final /* synthetic */ e40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f20(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = e40Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.V0();
        }
    }
}
