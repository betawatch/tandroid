package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class w31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f41 b;

    public /* synthetic */ w31(f41 f41Var, int i10) {
        this.a = i10;
        this.b = f41Var;
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
                f41 f41Var = this.b;
                CharSequence charSequence = f41Var.c0;
                if (charSequence != null) {
                    f41Var.d0.run(charSequence);
                }
                f41Var.dismiss();
                break;
            default:
                f41.P(this.b, view);
                break;
        }
    }
}
