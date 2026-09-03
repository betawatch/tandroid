package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
