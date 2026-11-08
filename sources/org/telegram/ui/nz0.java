package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz0 b;

    public /* synthetic */ nz0(rz0 rz0Var, int i7) {
        this.a = i7;
        this.b = rz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                rz0 rz0Var = this.b;
                if (rz0Var.Y == null) {
                    rz0Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
