package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ lu(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ww wwVar = this.b;
                if (wwVar.R3 != null) {
                    wwVar.getMessagesController().k4(0L, wwVar.R3);
                    wwVar.R3 = null;
                    wwVar.X4();
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
                ww.l0(this.b);
                break;
        }
    }
}
