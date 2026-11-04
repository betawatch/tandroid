package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ez0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iz0 b;

    public /* synthetic */ ez0(iz0 iz0Var, int i3) {
        this.a = i3;
        this.b = iz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                iz0 iz0Var = this.b;
                if (iz0Var.Z == null) {
                    iz0Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
