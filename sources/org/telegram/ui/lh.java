package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.l80 b;

    public /* synthetic */ lh(org.telegram.ui.Components.l80 l80Var, int i10) {
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
