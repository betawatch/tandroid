package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yw b;

    public /* synthetic */ nu(yw ywVar, int i7) {
        this.a = i7;
        this.b = ywVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                yw ywVar = this.b;
                if (ywVar.T3 != null) {
                    ywVar.getMessagesController().k4(0L, ywVar.T3);
                    ywVar.T3 = null;
                    ywVar.X4();
                    break;
                }
                break;
            case 1:
                this.b.n4(true);
                break;
            case 2:
                this.b.n4(true);
                break;
            default:
                yw.l0(this.b);
                break;
        }
    }
}
