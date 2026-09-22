package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.n70 b;

    public /* synthetic */ lh(org.telegram.ui.Components.n70 n70Var, int i10) {
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
