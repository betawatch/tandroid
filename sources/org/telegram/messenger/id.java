package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd b;

    public /* synthetic */ id(rd rdVar, int i7) {
        this.a = i7;
        this.b = rdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rd rdVar = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = rdVar.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        qd qdVar = new qd();
                        qdVar.a = queryFinalized.longValue(0);
                        qdVar.b = queryFinalized.intValue(1);
                        qdVar.c = queryFinalized.intValue(2);
                        qdVar.d = queryFinalized.intValue(3);
                        qdVar.f = queryFinalized.intValue(5);
                        qdVar.e = rdVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            gj gjVar = new gj(rdVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            qdVar.h = gjVar;
                            ur.e(gjVar.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(qdVar);
                        if (n5.z(qdVar.a)) {
                            if (!arrayList5.contains(Long.valueOf(-qdVar.a))) {
                                arrayList5.add(Long.valueOf(-qdVar.a));
                            }
                        } else if (n5.E(qdVar.a) && !arrayList4.contains(Long.valueOf(qdVar.a))) {
                            arrayList4.add(Long.valueOf(qdVar.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        rdVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    rdVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    g0.g3(new ul(rdVar, arrayList2, arrayList3, arrayList, 10));
                    break;
                }
                break;
            case 1:
                rd rdVar2 = this.b;
                rdVar2.J.clear();
                rdVar2.K.b();
                rd.s();
                ls.e().k(ls.G4, new Object[0]);
                break;
            case 2:
                rd rdVar3 = this.b;
                rdVar3.I = 0L;
                rdVar3.G.clear();
                rdVar3.a.b();
                rdVar3.b.clear();
                rdVar3.s = null;
                rdVar3.r(true);
                break;
            case 3:
                this.b.a(true);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                rd rdVar4 = this.b;
                rdVar4.L = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) rdVar4.N).a.e();
                    rdVar4.p();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                rd rdVar5 = this.b;
                rd f10 = rd.f(rdVar5.getAccountInstance().a);
                rdVar5.getNotificationCenter().b(f10, 1);
                rdVar5.getNotificationCenter().b(f10, 7);
                rdVar5.getNotificationCenter().b(f10, 49);
                break;
            default:
                rd rdVar6 = this.b;
                ArrayList arrayList6 = rdVar6.b;
                for (int i7 = 0; i7 < arrayList6.size(); i7++) {
                    qd qdVar2 = (qd) arrayList6.get(i7);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = rdVar6.getMessagesController().l1(qdVar2.a);
                    tL_messages_editMessage.id = qdVar2.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    rdVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new jd(rdVar6, 1));
                }
                arrayList6.clear();
                rdVar6.a.b();
                rdVar6.l(null, 2);
                rdVar6.r(true);
                g0.g3(new id(rdVar6, 1));
                break;
        }
    }
}
