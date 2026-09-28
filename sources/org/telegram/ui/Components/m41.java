package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v41 b;

    public /* synthetic */ m41(v41 v41Var, int i10) {
        this.a = i10;
        this.b = v41Var;
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
                v41 v41Var = this.b;
                CharSequence charSequence = v41Var.c0;
                if (charSequence != null) {
                    v41Var.d0.run(charSequence);
                }
                v41Var.dismiss();
                break;
            default:
                v41.P(this.b, view);
                break;
        }
    }
}
