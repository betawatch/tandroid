package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class g20 extends View {
    public final /* synthetic */ f40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g20(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = f40Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.V0();
        }
    }
}
