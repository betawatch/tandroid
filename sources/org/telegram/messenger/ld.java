package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ld(Object obj, long j10, int i10) {
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
                od odVar = (od) obj;
                ArrayList arrayList = odVar.b;
                a0.h hVar = odVar.a;
                nd ndVar = (nd) hVar.f(j10);
                hVar.l(j10);
                if (ndVar != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = odVar.getMessagesController().i1(ndVar.a);
                    tL_messages_editMessage.id = ndVar.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    odVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new gd(odVar, i11));
                    arrayList.remove(ndVar);
                    odVar.l(ndVar, 1);
                    i0.g3(new hd(odVar, ndVar, i11));
                    if (arrayList.isEmpty()) {
                        odVar.r(true);
                        break;
                    }
                }
                break;
            default:
                tz tzVar = (tz) obj;
                tzVar.e = SystemClock.elapsedRealtime();
                tzVar.c = false;
                if (j10 == -1) {
                    tzVar.d = false;
                    tzVar.b = 0L;
                } else {
                    tzVar.b = j10;
                    tzVar.d = true;
                }
                at.e().k(at.B4, tzVar);
                break;
        }
    }
}
