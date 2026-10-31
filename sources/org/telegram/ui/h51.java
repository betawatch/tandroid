package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 c;

    public /* synthetic */ h51(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this.a = i10;
        this.b = context;
        this.c = p6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new rh.y7(this.b, this.c).show();
                break;
            case 1:
                new rh.y7(this.b, this.c).show();
                break;
            default:
                new rh.y7(this.b, this.c).show();
                break;
        }
    }
}
