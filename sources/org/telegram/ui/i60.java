package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class i60 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ i60(int i7, int i10) {
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
                        org.telegram.messenger.cd cdVar = (org.telegram.messenger.cd) ((Map.Entry) it.next()).getValue();
                        if (cdVar.c == i7) {
                            ConnectionsManager.getInstance(cdVar.d).cancelRequest(i7, true);
                            it.remove();
                            cdVar.a();
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.k10.t0).cancelRequest(this.b, true);
                break;
        }
    }
}
