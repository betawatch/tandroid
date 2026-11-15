package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j8 extends p8 {
    public final /* synthetic */ i8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(q8 q8Var, Activity activity, i8 i8Var) {
        super(q8Var, activity);
        this.H = i8Var;
    }

    @Override // org.telegram.ui.Components.p8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
