package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ ie0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.u0.finishFragment();
                break;
            default:
                this.b.u0.finishFragment();
                break;
        }
    }
}
