package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.m80 b;

    public /* synthetic */ lh(org.telegram.ui.Components.m80 m80Var, int i10) {
        this.a = i10;
        this.b = m80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.m80 m80Var = this.b;
        switch (i10) {
            case 0:
                m80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                m80Var.s();
                break;
        }
    }
}
