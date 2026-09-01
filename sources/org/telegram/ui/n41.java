package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r41 b;

    public /* synthetic */ n41(r41 r41Var, int i10) {
        this.a = i10;
        this.b = r41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                r41 r41Var = this.b;
                if (r41Var.V == null) {
                    r41Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
