package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v40 extends d50 {
    public final /* synthetic */ k50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v40(k50 k50Var, Context context) {
        super(k50Var, context);
        this.d = k50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f10) {
        super.setRotationY(f10);
        this.d.invalidate();
    }
}
