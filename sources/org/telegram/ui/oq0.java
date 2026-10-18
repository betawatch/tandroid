package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class oq0 extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.im0 d;
    public int e;
    public final /* synthetic */ qq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq0(qq0 qq0Var, Context context) {
        super(context);
        this.f = qq0Var;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        oq0 oq0Var;
        super.setTranslationX(f7);
        qq0 qq0Var = this.f;
        oq0[] oq0VarArr = qq0Var.n;
        if (qq0Var.s && (oq0Var = oq0VarArr[0]) == this) {
            qq0Var.h.j(Math.abs(oq0Var.getTranslationX()) / oq0VarArr[0].getMeasuredWidth(), oq0VarArr[1].e);
        }
    }
}
