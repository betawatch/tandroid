package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.y70 b;

    public /* synthetic */ dh(org.telegram.ui.Components.y70 y70Var, int i10) {
        this.a = i10;
        this.b = y70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.y70 y70Var = this.b;
        switch (i10) {
            case 0:
                y70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                y70Var.s();
                break;
        }
    }
}
