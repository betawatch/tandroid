package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class n41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w41 b;

    public /* synthetic */ n41(w41 w41Var, int i10) {
        this.a = i10;
        this.b = w41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.dismiss();
                break;
            case 3:
                w41 w41Var = this.b;
                CharSequence charSequence = w41Var.c0;
                if (charSequence != null) {
                    w41Var.d0.run(charSequence);
                }
                w41Var.dismiss();
                break;
            default:
                w41.P(this.b, view);
                break;
        }
    }
}
