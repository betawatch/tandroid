package org.telegram.ui;

import android.content.DialogInterface;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.messenger.gd E0 = org.telegram.messenger.gd.E0();
                int i7 = this.b;
                if (i7 != 0) {
                    Iterator it = E0.T.entrySet().iterator();
                    while (it.hasNext()) {
                        org.telegram.messenger.bd bdVar = (org.telegram.messenger.bd) ((Map.Entry) it.next()).getValue();
                        if (bdVar.c == i7) {
                            ConnectionsManager.getInstance(bdVar.d).cancelRequest(i7, true);
                            it.remove();
                            bdVar.a();
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                ConnectionsManager.getInstance(org.telegram.messenger.j10.t0).cancelRequest(this.b, true);
                break;
        }
    }
}
