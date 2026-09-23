package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ nv(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ry.i0(this.b);
                break;
            case 1:
                ry ryVar = this.b;
                if (ryVar.R3 != null) {
                    ryVar.getMessagesController().removeSuggestion(0L, ryVar.R3);
                    ryVar.R3 = null;
                    ryVar.L4();
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
