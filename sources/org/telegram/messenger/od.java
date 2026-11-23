package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ od(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        long j3 = this.b;
        Object obj = this.c;
        int i10 = 0;
        switch (i7) {
            case 0:
                rd rdVar = (rd) obj;
                ArrayList arrayList = rdVar.b;
                a0.h hVar = rdVar.a;
                qd qdVar = (qd) hVar.f(j3);
                hVar.l(j3);
                if (qdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = rdVar.getMessagesController().l1(qdVar.a);
                    tL_messages_editMessage.id = qdVar.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    rdVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(rdVar, i10));
                    arrayList.remove(qdVar);
                    rdVar.l(qdVar, 1);
                    g0.g3(new kd(rdVar, qdVar, i10));
                    if (arrayList.isEmpty()) {
                        rdVar.r(true);
                        break;
                    }
                }
                break;
            case 1:
                ((bi.a5) obj).a(Long.valueOf(j3));
                break;
            default:
                bz bzVar = (bz) obj;
                bzVar.e = SystemClock.elapsedRealtime();
                bzVar.c = false;
                if (j3 == -1) {
                    bzVar.d = false;
                    bzVar.b = 0L;
                } else {
                    bzVar.b = j3;
                    bzVar.d = true;
                }
                ls.e().k(ls.E4, bzVar);
                break;
        }
    }
}
