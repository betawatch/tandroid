package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fh implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.z60 b;

    public /* synthetic */ fh(org.telegram.ui.Components.z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.z60 z60Var = this.b;
        switch (i10) {
            case 0:
                z60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                z60Var.s();
                break;
        }
    }
}
