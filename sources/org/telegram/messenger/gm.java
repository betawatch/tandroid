package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
