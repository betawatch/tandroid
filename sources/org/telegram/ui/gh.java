package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.p70 b;

    public /* synthetic */ gh(org.telegram.ui.Components.p70 p70Var, int i10) {
        this.a = i10;
        this.b = p70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.p70 p70Var = this.b;
        switch (i10) {
            case 0:
                p70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Q8;
                p70Var.s();
                break;
        }
    }
}
