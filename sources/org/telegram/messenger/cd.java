package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class cd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ld b;

    public /* synthetic */ cd(ld ldVar, int i3) {
        this.a = i3;
        this.b = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ld ldVar = this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    SQLiteCursor queryFinalized = ldVar.getMessagesStorage().b.queryFinalized("SELECT uid, mid, date, period, message, proximity FROM sharing_locations WHERE 1", new Object[0]);
                    while (queryFinalized.next()) {
                        kd kdVar = new kd();
                        kdVar.a = queryFinalized.longValue(0);
                        kdVar.b = queryFinalized.intValue(1);
                        kdVar.c = queryFinalized.intValue(2);
                        kdVar.d = queryFinalized.intValue(3);
                        kdVar.f = queryFinalized.intValue(5);
                        kdVar.e = ldVar.currentAccount;
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(4);
                        if (byteBufferValue != null) {
                            zi ziVar = new zi(ldVar.currentAccount, TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false), false, false);
                            kdVar.h = ziVar;
                            qr.e(ziVar.k, arrayList4, arrayList5, null);
                            byteBufferValue.reuse();
                        }
                        arrayList.add(kdVar);
                        if (m5.z(kdVar.a)) {
                            if (!arrayList5.contains(Long.valueOf(-kdVar.a))) {
                                arrayList5.add(Long.valueOf(-kdVar.a));
                            }
                        } else if (m5.E(kdVar.a) && !arrayList4.contains(Long.valueOf(kdVar.a))) {
                            arrayList4.add(Long.valueOf(kdVar.a));
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        ldVar.getMessagesStorage().Q(TextUtils.join(",", arrayList5), arrayList3);
                    }
                    ldVar.getMessagesStorage().n0(arrayList4, arrayList2, false);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    g0.h3(new ul(ldVar, arrayList2, arrayList3, arrayList, 10));
                    break;
                }
                break;
            case 1:
                ld ldVar2 = this.b;
                ldVar2.J.clear();
                ldVar2.K.b();
                ld.s();
                hs.e().k(hs.D4, new Object[0]);
                break;
            case 2:
                ld ldVar3 = this.b;
                ldVar3.I = 0L;
                ldVar3.G.clear();
                ldVar3.a.b();
                ldVar3.b.clear();
                ldVar3.s = null;
                ldVar3.r(true);
                break;
            case 3:
                this.b.a(true);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                ld ldVar4 = this.b;
                ldVar4.L = bool;
                try {
                    ((com.google.android.gms.common.api.internal.d0) ((gi.v5) ldVar4.N).b).g();
                    ldVar4.p();
                    break;
                } catch (Throwable unused) {
                    return;
                }
            case 5:
                ld ldVar5 = this.b;
                ld f10 = ld.f(ldVar5.getAccountInstance().a);
                ldVar5.getNotificationCenter().b(f10, 1);
                ldVar5.getNotificationCenter().b(f10, 7);
                ldVar5.getNotificationCenter().b(f10, 49);
                break;
            default:
                ld ldVar6 = this.b;
                ArrayList arrayList6 = ldVar6.b;
                for (int i3 = 0; i3 < arrayList6.size(); i3++) {
                    kd kdVar2 = (kd) arrayList6.get(i3);
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = ldVar6.getMessagesController().j1(kdVar2.a);
                    tL_messages_editMessage.id = kdVar2.b;
                    tL_messages_editMessage.flags |= TLObject.FLAG_14;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    ldVar6.getConnectionsManager().sendRequest(tL_messages_editMessage, new dd(ldVar6, 1));
                }
                arrayList6.clear();
                ldVar6.a.b();
                ldVar6.l(null, 2);
                ldVar6.r(true);
                g0.h3(new cd(ldVar6, 1));
                break;
        }
    }
}
