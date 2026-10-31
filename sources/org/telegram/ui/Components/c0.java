package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.q20 b;
    public final /* synthetic */ int c;

    public /* synthetic */ c0(int i10, int i11, org.telegram.messenger.q20 q20Var) {
        this.a = i11;
        this.b = q20Var;
        this.c = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.a(Integer.valueOf(this.c));
                break;
            default:
                org.telegram.messenger.q20 q20Var = this.b;
                if (q20Var != null) {
                    q20Var.a(Integer.valueOf(this.c));
                    break;
                }
                break;
        }
    }
}
