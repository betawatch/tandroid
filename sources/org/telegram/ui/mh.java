package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.n70 b;

    public /* synthetic */ mh(org.telegram.ui.Components.n70 n70Var, int i10) {
        this.a = i10;
        this.b = n70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.n70 n70Var = this.b;
        switch (i10) {
            case 0:
                n70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.T8;
                n70Var.s();
                break;
        }
    }
}
