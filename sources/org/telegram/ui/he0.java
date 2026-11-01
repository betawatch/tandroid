package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ he0(le0 le0Var, int i10) {
        this.a = i10;
        this.b = le0Var;
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
