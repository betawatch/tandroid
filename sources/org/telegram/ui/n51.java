package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r51 b;

    public /* synthetic */ n51(r51 r51Var, int i10) {
        this.a = i10;
        this.b = r51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r51 r51Var = this.b;
                if (r51Var.Y == null) {
                    r51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
