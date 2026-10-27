package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.l80 b;

    public /* synthetic */ dh(org.telegram.ui.Components.l80 l80Var, int i10) {
        this.a = i10;
        this.b = l80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.l80 l80Var = this.b;
        switch (i10) {
            case 0:
                l80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                l80Var.s();
                break;
        }
    }
}
