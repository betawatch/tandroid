package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx b;

    public /* synthetic */ nv(zx zxVar, int i10) {
        this.a = i10;
        this.b = zxVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                zx zxVar = this.b;
                if (zxVar.R3 != null) {
                    zxVar.getMessagesController().h4(0L, zxVar.R3);
                    zxVar.R3 = null;
                    zxVar.X4();
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
                zx.l0(this.b);
                break;
        }
    }
}
