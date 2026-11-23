package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.x60 b;

    public /* synthetic */ kg(org.telegram.ui.Components.x60 x60Var, int i7) {
        this.a = i7;
        this.b = x60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Components.x60 x60Var = this.b;
        switch (i7) {
            case 0:
                x60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.f9;
                x60Var.s();
                break;
        }
    }
}
