package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kd(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.b;
        Object obj = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                nd ndVar = (nd) obj;
                ArrayList arrayList = ndVar.b;
                a0.h hVar = ndVar.a;
                md mdVar = (md) hVar.f(j10);
                hVar.l(j10);
                if (mdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = ndVar.getMessagesController().i1(mdVar.a);
                    tL_messages_editMessage.id = mdVar.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    ndVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new fd(ndVar, i11));
                    arrayList.remove(mdVar);
                    ndVar.l(mdVar, 1);
                    i0.g3(new gd(ndVar, mdVar, i11));
                    if (arrayList.isEmpty()) {
                        ndVar.r(true);
                        break;
                    }
                }
                break;
            default:
                sz szVar = (sz) obj;
                szVar.e = SystemClock.elapsedRealtime();
                szVar.c = false;
                if (j10 == -1) {
                    szVar.d = false;
                    szVar.b = 0L;
                } else {
                    szVar.b = j10;
                    szVar.d = true;
                }
                zs.e().k(zs.B4, szVar);
                break;
        }
    }
}
