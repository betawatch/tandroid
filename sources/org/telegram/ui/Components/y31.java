package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y31 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h41 b;

    public /* synthetic */ y31(h41 h41Var, int i10) {
        this.a = i10;
        this.b = h41Var;
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
                h41 h41Var = this.b;
                CharSequence charSequence = h41Var.Z;
                if (charSequence != null) {
                    h41Var.a0.run(charSequence);
                }
                h41Var.dismiss();
                break;
            default:
                h41.P(this.b, view);
                break;
        }
    }
}
