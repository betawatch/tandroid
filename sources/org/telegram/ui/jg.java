package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.k60 b;

    public /* synthetic */ jg(org.telegram.ui.Components.k60 k60Var, int i7) {
        this.a = i7;
        this.b = k60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Components.k60 k60Var = this.b;
        switch (i7) {
            case 0:
                k60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Y8;
                k60Var.s();
                break;
        }
    }
}
