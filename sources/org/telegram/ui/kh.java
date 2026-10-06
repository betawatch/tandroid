package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.b80 b;

    public /* synthetic */ kh(org.telegram.ui.Components.b80 b80Var, int i10) {
        this.a = i10;
        this.b = b80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.b80 b80Var = this.b;
        switch (i10) {
            case 0:
                b80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                b80Var.s();
                break;
        }
    }
}
