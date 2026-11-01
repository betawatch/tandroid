package org.telegram.messenger;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class km implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ km(f1 f1Var, int i10, int i11) {
        this.a = i11;
        this.b = f1Var;
        this.c = i10;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((wp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            case 1:
                ((wp) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                ((pw) this.b).getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
