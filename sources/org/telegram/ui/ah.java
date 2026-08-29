package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.j70 b;

    public /* synthetic */ ah(org.telegram.ui.Components.j70 j70Var, int i10) {
        this.a = i10;
        this.b = j70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.j70 j70Var = this.b;
        switch (i10) {
            case 0:
                j70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.P8;
                j70Var.s();
                break;
        }
    }
}
