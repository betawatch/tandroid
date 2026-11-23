package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.d2 b;

    public /* synthetic */ j1(org.telegram.ui.Cells.d2 d2Var, int i7) {
        this.a = i7;
        this.b = d2Var;
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
