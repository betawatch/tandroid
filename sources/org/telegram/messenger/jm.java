package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class jm implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ jm(f1 f1Var, int i10, int i11) {
        this.a = i11;
        this.b = f1Var;
        this.c = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((vp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                ((vp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                ((ow) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
