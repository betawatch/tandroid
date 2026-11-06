package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                org.telegram.messenger.hd E0 = org.telegram.messenger.hd.E0();
                int i7 = this.b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.dd ddVar = (org.telegram.messenger.dd) ((Map.Entry) it.next()).getValue();
                        if (ddVar.c == i7) {
                            ConnectionsManager.getInstance(ddVar.d).cancelRequest(i7, true);
                            it.remove();
                            ddVar.a();
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
