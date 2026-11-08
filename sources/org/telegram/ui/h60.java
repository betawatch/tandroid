package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ h60(int i7, int i10) {
        this.a = i10;
        this.b = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.id E0 = org.telegram.messenger.id.E0();
                int i7 = this.b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.ed edVar = (org.telegram.messenger.ed) ((Map.Entry) it.next()).getValue();
                        if (edVar.c == i7) {
                            ConnectionsManager.getInstance(edVar.d).cancelRequest(i7, true);
                            it.remove();
                            edVar.a();
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).cancelRequest(this.b, true);
                break;
        }
    }
}
