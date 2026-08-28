package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.x60 b;

    public /* synthetic */ ah(org.telegram.ui.Components.x60 x60Var, int i9) {
        this.a = i9;
        this.b = x60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9 = this.a;
        org.telegram.ui.Components.x60 x60Var = this.b;
        switch (i9) {
            case 0:
                x60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.P8;
                x60Var.s();
                break;
        }
    }
}
