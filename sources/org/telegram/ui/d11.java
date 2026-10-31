package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d11 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i11 b;

    public /* synthetic */ d11(i11 i11Var, int i10) {
        this.a = i10;
        this.b = i11Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                i11 i11Var = this.b;
                if (i11Var.Y == null) {
                    i11Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
