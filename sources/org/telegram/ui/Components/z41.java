package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i51 b;

    public /* synthetic */ z41(i51 i51Var, int i10) {
        this.a = i10;
        this.b = i51Var;
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
                i51 i51Var = this.b;
                CharSequence charSequence = i51Var.c0;
                if (charSequence != null) {
                    i51Var.d0.run(charSequence);
                }
                i51Var.dismiss();
                break;
            default:
                i51.Q(this.b, view);
                break;
        }
    }
}
