package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.v70 b;

    public /* synthetic */ hh(org.telegram.ui.Components.v70 v70Var, int i10) {
        this.a = i10;
        this.b = v70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.v70 v70Var = this.b;
        switch (i10) {
            case 0:
                v70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                v70Var.s();
                break;
        }
    }
}
