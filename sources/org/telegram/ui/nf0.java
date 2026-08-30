package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf0 b;

    public /* synthetic */ nf0(rf0 rf0Var, int i10) {
        this.a = i10;
        this.b = rf0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.p0.finishFragment();
                break;
            default:
                this.b.p0.finishFragment();
                break;
        }
    }
}
