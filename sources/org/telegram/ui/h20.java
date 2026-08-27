package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h20 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;

    public /* synthetic */ h20(s50 s50Var, int i10) {
        this.a = i10;
        this.b = s50Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (this.b.t0 && (U instanceof rn)) {
                    ((rn) U).T9(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.A1 = null;
                break;
            default:
                this.b.n0 = null;
                break;
        }
    }
}
