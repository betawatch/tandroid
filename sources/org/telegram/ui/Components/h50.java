package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h50 extends p50 {
    public final /* synthetic */ c60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(c60 c60Var, Context context) {
        super(c60Var, context);
        this.d = c60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f7) {
        super.setRotationY(f7);
        this.d.invalidate();
    }
}
