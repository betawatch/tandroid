package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i51 b;

    public /* synthetic */ e51(i51 i51Var, int i10) {
        this.a = i10;
        this.b = i51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i51 i51Var = this.b;
                if (i51Var.Y == null) {
                    i51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
