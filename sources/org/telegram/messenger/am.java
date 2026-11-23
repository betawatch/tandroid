package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class am implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ am(c1 c1Var, int i7, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((mp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                ((mp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                ((xv) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
