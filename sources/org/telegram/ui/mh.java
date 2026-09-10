package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.w70 b;

    public /* synthetic */ mh(org.telegram.ui.Components.w70 w70Var, int i10) {
        this.a = i10;
        this.b = w70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.w70 w70Var = this.b;
        switch (i10) {
            case 0:
                w70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.T8;
                w70Var.s();
                break;
        }
    }
}
