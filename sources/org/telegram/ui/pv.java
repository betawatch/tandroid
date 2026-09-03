package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ pv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                qy.i0(this.b);
                break;
            case 1:
                qy qyVar = this.b;
                if (qyVar.P3 != null) {
                    qyVar.getMessagesController().removeSuggestion(0L, qyVar.P3);
                    qyVar.P3 = null;
                    qyVar.L4();
                    break;
                }
                break;
            case 2:
                this.b.b4(true);
                break;
            default:
                this.b.b4(true);
                break;
        }
    }
}
