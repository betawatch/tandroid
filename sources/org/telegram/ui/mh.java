package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
