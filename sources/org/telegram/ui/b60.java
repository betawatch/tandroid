package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b60 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ b60(int i3, int i10) {
        this.a = i10;
        this.b = i3;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.bd E0 = org.telegram.messenger.bd.E0();
                int i3 = this.b;
                if (i3 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.xc xcVar = (org.telegram.messenger.xc) ((Map.Entry) it.next()).getValue();
                        if (xcVar.c == i3) {
                            ConnectionsManager.getInstance(xcVar.d).cancelRequest(i3, true);
                            it.remove();
                            xcVar.a();
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.h10.t0).cancelRequest(this.b, true);
                break;
        }
    }
}
