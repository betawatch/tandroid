package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
