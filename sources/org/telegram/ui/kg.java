package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.y60 b;

    public /* synthetic */ kg(org.telegram.ui.Components.y60 y60Var, int i7) {
        this.a = i7;
        this.b = y60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Components.y60 y60Var = this.b;
        switch (i7) {
            case 0:
                y60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Z8;
                y60Var.s();
                break;
        }
    }
}
