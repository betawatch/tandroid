package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                sd sdVar = (sd) obj;
                ArrayList arrayList = sdVar.b;
                a0.h hVar = sdVar.a;
                rd rdVar = (rd) hVar.f(j3);
                hVar.l(j3);
                if (rdVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = sdVar.getMessagesController().j1(rdVar.a);
                    tL_messages_editMessage.id = rdVar.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    sdVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(sdVar, i10));
                    arrayList.remove(rdVar);
                    sdVar.l(rdVar, 1);
                    g0.h3(new kd(sdVar, rdVar, i10));
                    if (arrayList.isEmpty()) {
                        sdVar.r(true);
                        break;
                    }
                }
                break;
            default:
                hz hzVar = (hz) obj;
                hzVar.e = SystemClock.elapsedRealtime();
                hzVar.c = false;
                if (j3 == -1) {
                    hzVar.d = false;
                    hzVar.b = 0L;
                } else {
                    hzVar.b = j3;
                    hzVar.d = true;
                }
                qs.e().k(qs.B4, hzVar);
                break;
        }
    }
}
