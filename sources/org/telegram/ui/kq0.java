package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.tl0 d;
    public int e;
    public final /* synthetic */ mq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(mq0 mq0Var, Context context) {
        super(context);
        this.f = mq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        kq0 kq0Var;
        super.setTranslationX(f10);
        mq0 mq0Var = this.f;
        kq0[] kq0VarArr = mq0Var.n;
        if (mq0Var.s && (kq0Var = kq0VarArr[0]) == this) {
            mq0Var.h.j(Math.abs(kq0Var.getTranslationX()) / kq0VarArr[0].getMeasuredWidth(), kq0VarArr[1].e);
        }
    }
}
