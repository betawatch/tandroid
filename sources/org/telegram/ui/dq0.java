package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.zk0 d;
    public int e;
    public final /* synthetic */ fq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(fq0 fq0Var, Context context) {
        super(context);
        this.f = fq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        dq0 dq0Var;
        super.setTranslationX(f10);
        fq0 fq0Var = this.f;
        dq0[] dq0VarArr = fq0Var.n;
        if (fq0Var.s && (dq0Var = dq0VarArr[0]) == this) {
            fq0Var.h.j(Math.abs(dq0Var.getTranslationX()) / dq0VarArr[0].getMeasuredWidth(), dq0VarArr[1].e);
        }
    }
}
