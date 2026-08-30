package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l41 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p41 b;

    public /* synthetic */ l41(p41 p41Var, int i10) {
        this.a = i10;
        this.b = p41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                p41 p41Var = this.b;
                if (p41Var.V == null) {
                    p41Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
