package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b30 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ b30(k60 k60Var, int i10) {
        this.a = i10;
        this.b = k60Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (this.b.x0 && (U instanceof bo)) {
                    ((bo) U).T9(true, true);
                    break;
                }
                break;
            case 1:
                this.b.dismiss();
                break;
            case 2:
                this.b.E1 = null;
                break;
            default:
                this.b.r0 = null;
                break;
        }
    }
}
