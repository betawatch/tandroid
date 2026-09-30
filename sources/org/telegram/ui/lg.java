package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                wn wnVar = (wn) this.b;
                wnVar.b9 = true;
                wnVar.Z8 = 0;
                wnVar.pb = 0;
                wnVar.N4 = 0;
                wnVar.r9();
                wnVar.Nb(false);
                break;
            case 1:
                ro roVar = (ro) this.b;
                roVar.M0 = false;
                roVar.b = null;
                roVar.N0 = false;
                break;
            case 2:
                ((rp) this.b).n = null;
                break;
            default:
                zb0 zb0Var = (zb0) this.b;
                if (zb0Var.h >= 0) {
                    ConnectionsManager.getInstance(zb0Var.b).cancelRequest(zb0Var.h, true);
                    zb0Var.h = -1;
                    break;
                }
                break;
        }
    }
}
