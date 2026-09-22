package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class f40 extends View {
    public final /* synthetic */ i60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = i60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
