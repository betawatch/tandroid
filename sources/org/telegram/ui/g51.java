package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
