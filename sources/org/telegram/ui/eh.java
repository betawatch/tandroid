package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.a80 b;

    public /* synthetic */ eh(org.telegram.ui.Components.a80 a80Var, int i10) {
        this.a = i10;
        this.b = a80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.a80 a80Var = this.b;
        switch (i10) {
            case 0:
                a80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                a80Var.s();
                break;
        }
    }
}
