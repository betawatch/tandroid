package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.n70 b;

    public /* synthetic */ mh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.a = i10;
        this.b = n70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.n70 n70Var = this.b;
        switch (i10) {
            case 0:
                n70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.T8;
                n70Var.s();
                break;
        }
    }
}
