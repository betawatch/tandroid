package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.a70 b;

    public /* synthetic */ kg(org.telegram.ui.Components.a70 a70Var, int i7) {
        this.a = i7;
        this.b = a70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Components.a70 a70Var = this.b;
        switch (i7) {
            case 0:
                a70Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Z8;
                a70Var.s();
                break;
        }
    }
}
