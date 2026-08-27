package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ch implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.b70 b;

    public /* synthetic */ ch(org.telegram.ui.Components.b70 b70Var, int i10) {
        this.a = i10;
        this.b = b70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.b70 b70Var = this.b;
        switch (i10) {
            case 0:
                b70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.P8;
                b70Var.s();
                break;
        }
    }
}
