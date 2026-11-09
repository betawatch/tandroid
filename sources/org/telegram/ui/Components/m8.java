package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m8 extends s8 {
    public final /* synthetic */ l8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(t8 t8Var, Activity activity, l8 l8Var) {
        super(t8Var, activity);
        this.G = l8Var;
    }

    @Override // org.telegram.ui.Components.s8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
