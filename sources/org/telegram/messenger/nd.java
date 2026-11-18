package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nd(Object obj, long j3, int i7) {
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
                qd qdVar = (qd) obj;
                ArrayList arrayList = qdVar.b;
                a0.h hVar = qdVar.a;
                pd pdVar = (pd) hVar.f(j3);
                hVar.l(j3);
                if (pdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = qdVar.getMessagesController().l1(pdVar.a);
                    tL_messages_editMessage.id = pdVar.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    qdVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new id(qdVar, i10));
                    arrayList.remove(pdVar);
                    qdVar.l(pdVar, 1);
                    g0.g3(new jd(qdVar, pdVar, i10));
                    if (arrayList.isEmpty()) {
                        qdVar.r(true);
                        break;
                    }
                }
                break;
            case 1:
                ((bi.x4) obj).a(Long.valueOf(j3));
                break;
            default:
                az azVar = (az) obj;
                azVar.e = SystemClock.elapsedRealtime();
                azVar.c = false;
                if (j3 == -1) {
                    azVar.d = false;
                    azVar.b = 0L;
                } else {
                    azVar.b = j3;
                    azVar.d = true;
                }
                ks.e().k(ks.E4, azVar);
                break;
        }
    }
}
