package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;

    public /* synthetic */ f0(b1 b1Var, int i10) {
        this.a = i10;
        this.b = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
