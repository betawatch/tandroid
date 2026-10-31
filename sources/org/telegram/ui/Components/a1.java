package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2 b;

    public /* synthetic */ a1(org.telegram.ui.Cells.c2 c2Var, int i10) {
        this.a = i10;
        this.b = c2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.c(!r3.b(), true);
                break;
            default:
                this.b.c(!r3.b(), true);
                break;
        }
    }
}
