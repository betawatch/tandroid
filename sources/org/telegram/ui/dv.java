package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                cy.Y(this.b);
                break;
            case 1:
                cy cyVar = this.b;
                if (cyVar.S3 != null) {
                    cyVar.getMessagesController().removeSuggestion(0L, cyVar.S3);
                    cyVar.S3 = null;
                    cyVar.J4();
                    break;
                }
                break;
            case 2:
                this.b.Z3(true);
                break;
            default:
                this.b.Z3(true);
                break;
        }
    }
}
