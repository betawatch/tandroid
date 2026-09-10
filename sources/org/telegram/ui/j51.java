package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class j51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n51 b;

    public /* synthetic */ j51(n51 n51Var, int i10) {
        this.a = i10;
        this.b = n51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                n51 n51Var = this.b;
                if (n51Var.Y == null) {
                    n51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
