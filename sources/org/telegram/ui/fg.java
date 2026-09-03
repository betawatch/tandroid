package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ fg(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                zn.B0(this.b);
                break;
            case 1:
                this.b.g8(false, true, 0.0f);
                break;
            case 2:
                this.b.g8(false, true, 0.0f);
                break;
            case 3:
                this.b.g8(false, true, 0.0f);
                break;
            case 4:
                this.b.g8(false, true, 0.0f);
                break;
            case 5:
                this.b.g8(false, true, 0.0f);
                break;
            case 6:
                this.b.g8(false, true, 0.0f);
                break;
            case 7:
                this.b.Db = null;
                break;
            default:
                fk fkVar = this.b.U1;
                if (fkVar != null) {
                    fkVar.c(false);
                    break;
                }
                break;
        }
    }
}
