package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
