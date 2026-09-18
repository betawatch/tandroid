package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.w70 b;

    public /* synthetic */ gh(org.telegram.ui.Components.w70 w70Var, int i10) {
        this.a = i10;
        this.b = w70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.w70 w70Var = this.b;
        switch (i10) {
            case 0:
                w70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                w70Var.s();
                break;
        }
    }
}
