package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class hd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd b;

    public /* synthetic */ hd(qd qdVar, int i7) {
        this.a = i7;
        this.b = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qd qdVar = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = qdVar.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        pd pdVar = new pd();
                        pdVar.a = queryFinalized.longValue(0);
                        pdVar.b = queryFinalized.intValue(1);
                        pdVar.c = queryFinalized.intValue(2);
                        pdVar.d = queryFinalized.intValue(3);
                        pdVar.f = queryFinalized.intValue(5);
                        pdVar.e = qdVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            fj fjVar = new fj(qdVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            pdVar.h = fjVar;
                            tr.e(fjVar.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(pdVar);
                        if (n5.z(pdVar.a)) {
                            if (!arrayList5.contains(Long.valueOf(-pdVar.a))) {
                                arrayList5.add(Long.valueOf(-pdVar.a));
                            }
                        } else if (n5.E(pdVar.a) && !arrayList4.contains(Long.valueOf(pdVar.a))) {
                            arrayList4.add(Long.valueOf(pdVar.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        qdVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    qdVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    g0.g3(new tl(qdVar, arrayList2, arrayList3, arrayList, 10));
                    break;
                }
                break;
            case 1:
                qd qdVar2 = this.b;
                qdVar2.J.clear();
                qdVar2.K.b();
                qd.s();
                ks.e().k(ks.G4, new Object[0]);
                break;
            case 2:
                qd qdVar3 = this.b;
                qdVar3.I = 0L;
                qdVar3.G.clear();
                qdVar3.a.b();
                qdVar3.b.clear();
                qdVar3.s = null;
                qdVar3.r(true);
                break;
            case 3:
                this.b.a(true);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                qd qdVar4 = this.b;
                qdVar4.L = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) qdVar4.N).a.e();
                    qdVar4.p();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                qd qdVar5 = this.b;
                qd f10 = qd.f(qdVar5.getAccountInstance().a);
                qdVar5.getNotificationCenter().b(f10, 1);
                qdVar5.getNotificationCenter().b(f10, 7);
                qdVar5.getNotificationCenter().b(f10, 49);
                break;
            default:
                qd qdVar6 = this.b;
                ArrayList arrayList6 = qdVar6.b;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    pd pdVar2 = (pd) arrayList6.get(i7);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = qdVar6.getMessagesController().l1(pdVar2.a);
                    tL_messages_editMessage.id = pdVar2.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    qdVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new id(qdVar6, 1));
                }
                arrayList6.clear();
                qdVar6.a.b();
                qdVar6.l(null, 2);
                qdVar6.r(true);
                g0.g3(new hd(qdVar6, 1));
                break;
        }
    }
}
