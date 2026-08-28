package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q40 extends y40 {
    public final /* synthetic */ f50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(f50 f50Var, Context context) {
        super(f50Var, context);
        this.d = f50Var;
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
