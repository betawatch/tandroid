package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
