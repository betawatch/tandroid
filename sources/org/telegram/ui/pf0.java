package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;

    public /* synthetic */ pf0(tf0 tf0Var, int i10) {
        this.a = i10;
        this.b = tf0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.s0.finishFragment();
                break;
            default:
                this.b.s0.finishFragment();
                break;
        }
    }
}
