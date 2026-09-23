package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.o70 b;

    public /* synthetic */ jh(org.telegram.ui.Components.o70 o70Var, int i10) {
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
                Drawable[] drawableArr = PhotoViewer.U8;
                o70Var.s();
                break;
        }
    }
}
