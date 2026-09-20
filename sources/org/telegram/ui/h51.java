package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l51 b;

    public /* synthetic */ h51(l51 l51Var, int i10) {
        this.a = i10;
        this.b = l51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l51 l51Var = this.b;
                if (l51Var.Y == null) {
                    l51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
