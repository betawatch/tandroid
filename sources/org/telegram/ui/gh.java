package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
