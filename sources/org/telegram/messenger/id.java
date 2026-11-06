package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd b;

    public /* synthetic */ id(sd sdVar, int i7) {
        this.a = i7;
        this.b = sdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sd sdVar = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = sdVar.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        rd rdVar = new rd();
                        rdVar.a = queryFinalized.longValue(0);
                        rdVar.b = queryFinalized.intValue(1);
                        rdVar.c = queryFinalized.intValue(2);
                        rdVar.d = queryFinalized.intValue(3);
                        rdVar.f = queryFinalized.intValue(5);
                        rdVar.e = sdVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            ij ijVar = new ij(sdVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            rdVar.h = ijVar;
                            yr.e(ijVar.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(rdVar);
                        if (m5.z(rdVar.a)) {
                            if (!arrayList5.contains(Long.valueOf(-rdVar.a))) {
                                arrayList5.add(Long.valueOf(-rdVar.a));
                            }
                        } else if (m5.E(rdVar.a) && !arrayList4.contains(Long.valueOf(rdVar.a))) {
                            arrayList4.add(Long.valueOf(rdVar.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        sdVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    sdVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    g0.h3(new em(sdVar, arrayList2, arrayList3, arrayList, 10));
                    break;
                }
                break;
            case 1:
                sd sdVar2 = this.b;
                sdVar2.I.clear();
                sdVar2.J.b();
                sd.s();
                qs.e().k(qs.D4, new Object[0]);
                break;
            case 2:
                sd sdVar3 = this.b;
                sdVar3.H = 0L;
                sdVar3.F.clear();
                sdVar3.a.b();
                sdVar3.b.clear();
                sdVar3.s = null;
                sdVar3.r(true);
                break;
            case 3:
                this.b.a(true);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                sd sdVar4 = this.b;
                sdVar4.K = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) ((gf.g) sdVar4.M).b).f();
                    sdVar4.p();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                sd sdVar5 = this.b;
                sd f10 = sd.f(sdVar5.getAccountInstance().a);
                sdVar5.getNotificationCenter().b(f10, 1);
                sdVar5.getNotificationCenter().b(f10, 7);
                sdVar5.getNotificationCenter().b(f10, 49);
                break;
            default:
                sd sdVar6 = this.b;
                ArrayList arrayList6 = sdVar6.b;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    rd rdVar2 = (rd) arrayList6.get(i7);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = sdVar6.getMessagesController().j1(rdVar2.a);
                    tL_messages_editMessage.id = rdVar2.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    sdVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(sdVar6, 1));
                }
                arrayList6.clear();
                sdVar6.a.b();
                sdVar6.l(null, 2);
                sdVar6.r(true);
                g0.h3(new id(sdVar6, 1));
                break;
        }
    }
}
