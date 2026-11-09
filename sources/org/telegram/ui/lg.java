package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.l60 b;

    public /* synthetic */ lg(org.telegram.ui.Components.l60 l60Var, int i7) {
        this.a = i7;
        this.b = l60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Components.l60 l60Var = this.b;
        switch (i7) {
            case 0:
                l60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Y8;
                l60Var.s();
                break;
        }
    }
}
