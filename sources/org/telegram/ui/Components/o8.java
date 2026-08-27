package org.telegram.ui.Components;

import android.app.Activity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o8 extends u8 {
    public final /* synthetic */ n8 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(v8 v8Var, Activity activity, n8 n8Var) {
        super(v8Var, activity);
        this.C = n8Var;
    }

    @Override // org.telegram.ui.Components.u8, android.view.View
    public final void invalidate() {
        super.invalidate();
        this.C.invalidate();
    }
}
