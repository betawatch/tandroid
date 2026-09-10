package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t41 b;

    public /* synthetic */ k41(t41 t41Var, int i10) {
        this.a = i10;
        this.b = t41Var;
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
                t41 t41Var = this.b;
                CharSequence charSequence = t41Var.c0;
                if (charSequence != null) {
                    t41Var.d0.run(charSequence);
                }
                t41Var.dismiss();
                break;
            default:
                t41.P(this.b, view);
                break;
        }
    }
}
