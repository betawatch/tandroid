package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b40 extends View {
    public final /* synthetic */ d60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = d60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.S0();
        }
    }
}
