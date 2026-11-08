package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class u30 extends c40 {
    public final /* synthetic */ o40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(o40 o40Var, Context context) {
        super(o40Var, context);
        this.d = o40Var;
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
