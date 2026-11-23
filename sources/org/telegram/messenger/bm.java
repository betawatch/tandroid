package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class bm implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ bm(c1 c1Var, int i7, int i10) {
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
                ((yv) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
