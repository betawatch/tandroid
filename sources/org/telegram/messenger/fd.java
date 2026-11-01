package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class fd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od b;

    public /* synthetic */ fd(od odVar, int i10) {
        this.a = i10;
        this.b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                od odVar = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = odVar.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        nd ndVar = new nd();
                        ndVar.a = queryFinalized.longValue(0);
                        ndVar.b = queryFinalized.intValue(1);
                        ndVar.c = queryFinalized.intValue(2);
                        ndVar.d = queryFinalized.intValue(3);
                        ndVar.f = queryFinalized.intValue(5);
                        ndVar.e = odVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            kj kjVar = new kj(odVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            ndVar.h = kjVar;
                            is.e(kjVar.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(ndVar);
                        if (o5.z(ndVar.a)) {
                            if (!arrayList5.contains(Long.valueOf(-ndVar.a))) {
                                arrayList5.add(Long.valueOf(-ndVar.a));
                            }
                        } else if (o5.E(ndVar.a) && !arrayList4.contains(Long.valueOf(ndVar.a))) {
                            arrayList4.add(Long.valueOf(ndVar.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        odVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    odVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (!arrayList.isEmpty()) {
                    i0.g3(new vl(odVar, arrayList2, arrayList3, arrayList, 10));
                    break;
                }
                break;
            case 1:
                od odVar2 = this.b;
                odVar2.I.clear();
                odVar2.J.b();
                od.s();
                at.e().k(at.D4, new Object[0]);
                break;
            case 2:
                od odVar3 = this.b;
                odVar3.H = 0L;
                odVar3.F.clear();
                odVar3.a.b();
                odVar3.b.clear();
                odVar3.s = null;
                odVar3.r(true);
                break;
            case 3:
                this.b.a(true);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                od odVar4 = this.b;
                odVar4.K = bool;
                try {
                    ((com.google.android.gms.common.api.internal.h0) odVar4.M).a.e();
                    odVar4.p();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                od odVar5 = this.b;
                od f7 = od.f(odVar5.getAccountInstance().a);
                odVar5.getNotificationCenter().b(f7, 1);
                odVar5.getNotificationCenter().b(f7, 7);
                odVar5.getNotificationCenter().b(f7, 49);
                break;
            default:
                od odVar6 = this.b;
                ArrayList arrayList6 = odVar6.b;
                for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                    nd ndVar2 = (nd) arrayList6.get(i10);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = odVar6.getMessagesController().i1(ndVar2.a);
                    tL_messages_editMessage.id = ndVar2.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    odVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new gd(odVar6, 1));
                }
                arrayList6.clear();
                odVar6.a.b();
                odVar6.l(null, 2);
                odVar6.r(true);
                i0.g3(new fd(odVar6, 1));
                break;
        }
    }
}
