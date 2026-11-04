package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ id(Object obj, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        long j10 = this.b;
        Object obj = this.c;
        int i10 = 0;
        switch (i3) {
            case 0:
                ld ldVar = (ld) obj;
                ArrayList arrayList = ldVar.b;
                a0.h hVar = ldVar.a;
                kd kdVar = (kd) hVar.f(j10);
                hVar.l(j10);
                if (kdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = ldVar.getMessagesController().j1(kdVar.a);
                    tL_messages_editMessage.id = kdVar.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    ldVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new dd(ldVar, i10));
                    arrayList.remove(kdVar);
                    ldVar.l(kdVar, 1);
                    g0.h3(new ed(ldVar, kdVar, i10));
                    if (arrayList.isEmpty()) {
                        ldVar.r(true);
                        break;
                    }
                }
                break;
            default:
                zy zyVar = (zy) obj;
                zyVar.e = SystemClock.elapsedRealtime();
                zyVar.c = false;
                if (j10 == -1) {
                    zyVar.d = false;
                    zyVar.b = 0L;
                } else {
                    zyVar.b = j10;
                    zyVar.d = true;
                }
                hs.e().k(hs.B4, zyVar);
                break;
        }
    }
}
