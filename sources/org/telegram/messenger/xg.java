package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ long c;

    public /* synthetic */ xg(ui uiVar, long j10, int i10) {
        this.a = i10;
        this.b = uiVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11 = this.a;
        ui uiVar = this.b;
        long j10 = this.c;
        int i12 = 0;
        switch (i11) {
            case 0:
                a0.h hVar = uiVar.w1;
                ArrayList arrayList = (ArrayList) hVar.f(j10);
                if (arrayList != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i13);
                        int i14 = uiVar.currentAccount;
                        gs a2 = gs.a(j10, jj.c2(i14, message, w3.b0(i14, j10), false));
                        uiVar.x1.remove(a2);
                        uiVar.getNotificationCenter().k(69, null, a2);
                    }
                }
                hVar.l(j10);
                break;
            case 1:
                uiVar.p1.l(j10);
                break;
            case 2:
                final long j11 = this.c;
                final ui uiVar2 = this.b;
                uiVar2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = uiVar2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j11 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i12 = queryFinalized.intValue(0);
                        i10 = queryFinalized.intValue(1);
                    } else {
                        i10 = 0;
                    }
                    queryFinalized.dispose();
                    if (i12 > 0 && uiVar2.getUserConfig().D != 0) {
                        d = i10 - uiVar2.getUserConfig().D;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                final double d10 = d;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.wg
                    @Override // java.lang.Runnable
                    public final void run() {
                        ui uiVar3;
                        long j12;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i15 = 0;
                        while (true) {
                            uiVar3 = ui.this;
                            int size = uiVar3.i1.size();
                            j12 = j11;
                            if (i15 >= size) {
                                tL_topPeer = null;
                                break;
                            }
                            tL_topPeer = (TLRPC.TL_topPeer) uiVar3.i1.get(i15);
                            if (tL_topPeer.peer.user_id == j12) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                        if (tL_topPeer == null) {
                            tL_topPeer = new TLRPC.TL_topPeer();
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_topPeer.peer = tL_peerUser;
                            tL_peerUser.user_id = j12;
                            uiVar3.i1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d10 / uiVar3.getMessagesController().Z2) + tL_topPeer.rating;
                        Collections.sort(uiVar3.i1, new a4.d(24));
                        uiVar3.getMessagesStorage().a.c(new zg(uiVar3, j12, 0, tL_topPeer.rating));
                        uiVar3.getNotificationCenter().k(zs.S0, new Object[0]);
                    }
                });
                break;
            default:
                ui uiVar3 = this.b;
                ArrayList[] arrayListArr = uiVar3.u0;
                arrayListArr[0].remove(Long.valueOf(j10));
                uiVar3.v0[0].remove(Long.valueOf(j10));
                long[] jArr = uiVar3.p0;
                ArrayList[] arrayListArr2 = uiVar3.s0;
                jArr[0] = uiVar3.o(arrayListArr2[0], false);
                uiVar3.getNotificationCenter().k(62, new Object[0]);
                uiVar3.G1(false, arrayListArr2[0], arrayListArr[0], uiVar3.q0[0], jArr[0], uiVar3.r0);
                break;
        }
    }
}
