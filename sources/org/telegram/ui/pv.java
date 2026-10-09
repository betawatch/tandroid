package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ pv(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ty.h0(this.b);
                break;
            case 1:
                ty tyVar = this.b;
                if (tyVar.R3 != null) {
                    tyVar.getMessagesController().removeSuggestion(0L, tyVar.R3);
                    tyVar.R3 = null;
                    tyVar.I4();
                    break;
                }
                break;
            case 2:
                this.b.Y3(true);
                break;
            default:
                this.b.Y3(true);
                break;
        }
    }
}
