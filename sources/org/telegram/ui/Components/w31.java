package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
