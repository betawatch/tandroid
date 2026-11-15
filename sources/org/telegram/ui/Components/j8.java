package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
