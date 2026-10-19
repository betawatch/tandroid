package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class u41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d51 b;

    public /* synthetic */ u41(d51 d51Var, int i10) {
        this.a = i10;
        this.b = d51Var;
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
                d51 d51Var = this.b;
                CharSequence charSequence = d51Var.c0;
                if (charSequence != null) {
                    d51Var.d0.run(charSequence);
                }
                d51Var.dismiss();
                break;
            default:
                d51.Q(this.b, view);
                break;
        }
    }
}
