package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
