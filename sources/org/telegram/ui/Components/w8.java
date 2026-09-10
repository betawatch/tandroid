package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class w8 extends c9 {
    public final /* synthetic */ v8 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(d9 d9Var, Activity activity, v8 v8Var) {
        super(d9Var, activity);
        this.G = v8Var;
    }

    @Override // org.telegram.ui.Components.c9, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
