package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class g51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k51 b;

    public /* synthetic */ g51(k51 k51Var, int i10) {
        this.a = i10;
        this.b = k51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                k51 k51Var = this.b;
                if (k51Var.Y == null) {
                    k51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
