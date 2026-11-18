package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class r8 extends x8 {
    public final /* synthetic */ q8 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(y8 y8Var, Activity activity, q8 q8Var) {
        super(y8Var, activity);
        this.H = q8Var;
    }

    @Override // org.telegram.ui.Components.x8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
