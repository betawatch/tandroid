package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p8(k9 k9Var, int i10, int i11) {
        this.a = i11;
        this.b = k9Var;
        this.c = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
