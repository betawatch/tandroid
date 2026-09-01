package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.q70 b;

    public /* synthetic */ eh(org.telegram.ui.Components.q70 q70Var, int i10) {
        this.a = i10;
        this.b = q70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.q70 q70Var = this.b;
        switch (i10) {
            case 0:
                q70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Q8;
                q70Var.s();
                break;
        }
    }
}
