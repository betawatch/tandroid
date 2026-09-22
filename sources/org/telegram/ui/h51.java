package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l51 b;

    public /* synthetic */ h51(l51 l51Var, int i10) {
        this.a = i10;
        this.b = l51Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                l51 l51Var = this.b;
                if (l51Var.Y == null) {
                    l51Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
