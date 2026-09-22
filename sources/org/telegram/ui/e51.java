package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
