package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class a51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e51 b;

    public /* synthetic */ a51(e51 e51Var, int i10) {
        this.a = i10;
        this.b = e51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e51 e51Var = this.b;
                if (e51Var.Y == null) {
                    e51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
