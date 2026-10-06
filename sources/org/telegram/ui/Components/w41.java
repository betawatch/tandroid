package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class w41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f51 b;

    public /* synthetic */ w41(f51 f51Var, int i10) {
        this.a = i10;
        this.b = f51Var;
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
                f51 f51Var = this.b;
                CharSequence charSequence = f51Var.c0;
                if (charSequence != null) {
                    f51Var.d0.run(charSequence);
                }
                f51Var.dismiss();
                break;
            default:
                f51.N(this.b, view);
                break;
        }
    }
}
