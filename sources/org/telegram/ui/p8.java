package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
