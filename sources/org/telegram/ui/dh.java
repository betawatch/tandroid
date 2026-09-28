package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.a80 b;

    public /* synthetic */ dh(org.telegram.ui.Components.a80 a80Var, int i10) {
        this.a = i10;
        this.b = a80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.a80 a80Var = this.b;
        switch (i10) {
            case 0:
                a80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                a80Var.s();
                break;
        }
    }
}
