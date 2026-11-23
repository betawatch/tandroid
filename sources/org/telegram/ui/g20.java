package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
