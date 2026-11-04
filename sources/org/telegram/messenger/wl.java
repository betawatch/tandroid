package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class wl implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ wl(c1 c1Var, int i3, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = i3;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((hp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                ((hp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                ((vv) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
