package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ mv(qy qyVar, int i10) {
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
                if (qyVar.R3 != null) {
                    qyVar.getMessagesController().removeSuggestion(0L, qyVar.R3);
                    qyVar.R3 = null;
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
