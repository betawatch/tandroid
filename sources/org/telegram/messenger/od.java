package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                    tL_messages_editMessage.peer = rdVar.getMessagesController().j1(qdVar.a);
                    tL_messages_editMessage.id = qdVar.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    rdVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(rdVar, i10));
                    arrayList.remove(qdVar);
                    rdVar.l(qdVar, 1);
                    g0.h3(new kd(rdVar, qdVar, i10));
                    if (arrayList.isEmpty()) {
                        rdVar.r(true);
                        break;
                    }
                }
                break;
            default:
                fz fzVar = (fz) obj;
                fzVar.e = SystemClock.elapsedRealtime();
                fzVar.c = false;
                if (j3 == -1) {
                    fzVar.d = false;
                    fzVar.b = 0L;
                } else {
                    fzVar.b = j3;
                    fzVar.d = true;
                }
                ns.e().k(ns.B4, fzVar);
                break;
        }
    }
}
