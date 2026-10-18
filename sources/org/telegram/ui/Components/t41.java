package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c51 b;

    public /* synthetic */ t41(c51 c51Var, int i10) {
        this.a = i10;
        this.b = c51Var;
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
                c51 c51Var = this.b;
                CharSequence charSequence = c51Var.c0;
                if (charSequence != null) {
                    c51Var.d0.run(charSequence);
                }
                c51Var.dismiss();
                break;
            default:
                c51.Q(this.b, view);
                break;
        }
    }
}
