package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nd b;

    public /* synthetic */ ed(nd ndVar, int i10) {
        this.a = i10;
        this.b = ndVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nd ndVar = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = ndVar.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        md mdVar = new md();
                        mdVar.a = queryFinalized.longValue(0);
                        mdVar.b = queryFinalized.intValue(1);
                        mdVar.c = queryFinalized.intValue(2);
                        mdVar.d = queryFinalized.intValue(3);
                        mdVar.f = queryFinalized.intValue(5);
                        mdVar.e = ndVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            jj jjVar = new jj(ndVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            mdVar.h = jjVar;
                            hs.e(jjVar.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(mdVar);
                        if (o5.z(mdVar.a)) {
                            if (!arrayList5.contains(Long.valueOf(-mdVar.a))) {
                                arrayList5.add(Long.valueOf(-mdVar.a));
                            }
                        } else if (o5.E(mdVar.a) && !arrayList4.contains(Long.valueOf(mdVar.a))) {
                            arrayList4.add(Long.valueOf(mdVar.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        ndVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    ndVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (!arrayList.isEmpty()) {
                    i0.g3(new ul(ndVar, arrayList2, arrayList3, arrayList, 10));
                    break;
                }
                break;
            case 1:
                nd ndVar2 = this.b;
                ndVar2.I.clear();
                ndVar2.J.b();
                nd.s();
                zs.e().k(zs.D4, new Object[0]);
                break;
            case 2:
                nd ndVar3 = this.b;
                ndVar3.H = 0L;
                ndVar3.F.clear();
                ndVar3.a.b();
                ndVar3.b.clear();
                ndVar3.s = null;
                ndVar3.r(true);
                break;
            case 3:
                this.b.a(true);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                nd ndVar4 = this.b;
                ndVar4.K = bool;
                try {
                    ((com.google.android.gms.common.api.internal.h0) ndVar4.M).a.e();
                    ndVar4.p();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                nd ndVar5 = this.b;
                nd f7 = nd.f(ndVar5.getAccountInstance().a);
                ndVar5.getNotificationCenter().b(f7, 1);
                ndVar5.getNotificationCenter().b(f7, 7);
                ndVar5.getNotificationCenter().b(f7, 49);
                break;
            default:
                nd ndVar6 = this.b;
                ArrayList arrayList6 = ndVar6.b;
                for (int i10 = 0; i10 < arrayList6.size(); i10++) {
                    md mdVar2 = (md) arrayList6.get(i10);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = ndVar6.getMessagesController().i1(mdVar2.a);
                    tL_messages_editMessage.id = mdVar2.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    ndVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new fd(ndVar6, 1));
                }
                arrayList6.clear();
                ndVar6.a.b();
                ndVar6.l(null, 2);
                ndVar6.r(true);
                i0.g3(new ed(ndVar6, 1));
                break;
        }
    }
}
