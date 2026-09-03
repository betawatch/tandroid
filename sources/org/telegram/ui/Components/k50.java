package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k50 extends s50 {
    public final /* synthetic */ y50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(y50 y50Var, Context context) {
        super(y50Var, context);
        this.d = y50Var;
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
