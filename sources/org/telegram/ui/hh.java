package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.p80 b;

    public /* synthetic */ hh(org.telegram.ui.Components.p80 p80Var, int i10) {
        this.a = i10;
        this.b = p80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.p80 p80Var = this.b;
        switch (i10) {
            case 0:
                p80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                p80Var.s();
                break;
        }
    }
}
