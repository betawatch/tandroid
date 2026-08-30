package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.o70 b;

    public /* synthetic */ eh(org.telegram.ui.Components.o70 o70Var, int i10) {
        this.a = i10;
        this.b = o70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.o70 o70Var = this.b;
        switch (i10) {
            case 0:
                o70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Q8;
                o70Var.s();
                break;
        }
    }
}
