package org.telegram.ui.Components;

import android.content.DialogInterface;
import org.telegram.messenger.AccountInstance;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AccountInstance b;
    public final /* synthetic */ int c;

    public /* synthetic */ a80(AccountInstance accountInstance, int i10, int i11) {
        this.a = i11;
        this.b = accountInstance;
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
