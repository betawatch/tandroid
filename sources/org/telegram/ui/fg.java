package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.f60 b;

    public /* synthetic */ fg(org.telegram.ui.Components.f60 f60Var, int i3) {
        this.a = i3;
        this.b = f60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        org.telegram.ui.Components.f60 f60Var = this.b;
        switch (i3) {
            case 0:
                f60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.V8;
                f60Var.s();
                break;
        }
    }
}
