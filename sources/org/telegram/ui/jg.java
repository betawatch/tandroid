package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.k60 b;

    public /* synthetic */ jg(org.telegram.ui.Components.k60 k60Var, int i7) {
        this.a = i7;
        this.b = k60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Components.k60 k60Var = this.b;
        switch (i7) {
            case 0:
                k60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Y8;
                k60Var.s();
                break;
        }
    }
}
