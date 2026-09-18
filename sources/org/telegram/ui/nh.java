package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.n70 b;

    public /* synthetic */ nh(org.telegram.ui.Components.n70 n70Var, int i10) {
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
                Drawable[] drawableArr = PhotoViewer.U8;
                n70Var.s();
                break;
        }
    }
}
