package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class dm implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ dm(c1 c1Var, int i7, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((np) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                ((np) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                ((bw) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
