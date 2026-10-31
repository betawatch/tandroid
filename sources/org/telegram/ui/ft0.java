package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ft0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.z60 b;

    public /* synthetic */ ft0(org.telegram.ui.Components.z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.wb.e();
                this.b.s();
                break;
            default:
                org.telegram.ui.Components.wb.e();
                this.b.s();
                break;
        }
    }
}
