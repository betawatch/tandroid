package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ju implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ ju(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                uw uwVar = this.b;
                if (uwVar.S3 != null) {
                    uwVar.getMessagesController().k4(0L, uwVar.S3);
                    uwVar.S3 = null;
                    uwVar.X4();
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
                uw.l0(this.b);
                break;
        }
    }
}
