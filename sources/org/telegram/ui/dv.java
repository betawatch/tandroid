package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ dv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                cy.h0(this.b);
                break;
            case 1:
                cy cyVar = this.b;
                if (cyVar.S3 != null) {
                    cyVar.getMessagesController().removeSuggestion(0L, cyVar.S3);
                    cyVar.S3 = null;
                    cyVar.T4();
                    break;
                }
                break;
            case 2:
                this.b.j4(true);
                break;
            default:
                this.b.j4(true);
                break;
        }
    }
}
