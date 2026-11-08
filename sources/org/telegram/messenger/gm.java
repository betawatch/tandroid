package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class gm implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ gm(c1 c1Var, int i7, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((qp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                ((qp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                ((dw) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
