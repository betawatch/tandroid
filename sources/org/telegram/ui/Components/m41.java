package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
