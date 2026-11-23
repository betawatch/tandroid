package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.a70 b;

    public /* synthetic */ kg(org.telegram.ui.Components.a70 a70Var, int i7) {
        this.a = i7;
        this.b = a70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Components.a70 a70Var = this.b;
        switch (i7) {
            case 0:
                a70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Z8;
                a70Var.s();
                break;
        }
    }
}
