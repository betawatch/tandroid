package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o61 implements View.OnClickListener {
    public final /* synthetic */ x61 a;

    public o61(x61 x61Var) {
        this.a = x61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.ri0 ri0Var = this.a.d;
        if (ri0Var.b() || ri0Var.getAnimatedDrawable() == null) {
            return;
        }
        ri0Var.getAnimatedDrawable().K(40);
        ri0Var.d();
    }
}
