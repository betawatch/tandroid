package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si b;
    public final /* synthetic */ long c;

    public /* synthetic */ xg(si siVar, long j3, int i7) {
        this.a = i7;
        this.b = siVar;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10 = this.a;
        si siVar = this.b;
        long j3 = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                a0.h hVar = siVar.z1;
                ArrayList arrayList = (ArrayList) hVar.f(j3);
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                        int i13 = siVar.currentAccount;
                        tr a10 = tr.a(j3, gj.b2(i13, message, v3.b0(i13, j3), false));
                        siVar.A1.remove(a10);
                        siVar.getNotificationCenter().k(69, null, a10);
                    }
                }
                hVar.l(j3);
                break;
            case 1:
                siVar.q1.l(j3);
                break;
            case 2:
                final long j10 = this.c;
                final si siVar2 = this.b;
                siVar2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = siVar2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j10 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i11 = queryFinalized.intValue(0);
                        i7 = queryFinalized.intValue(1);
                    } else {
                        i7 = 0;
                    }
                    queryFinalized.dispose();
                    if (i11 > 0 && siVar2.getUserConfig().E != 0) {
                        d = i7 - siVar2.getUserConfig().E;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                final double d2 = d;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.wg
                    @Override // java.lang.Runnable
                    public final void run() {
                        si siVar3;
                        long j11;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i14 = 0;
                        while (true) {
                            siVar3 = si.this;
                            int size = siVar3.j1.size();
                            j11 = j10;
                            if (i14 >= size) {
                                tL_topPeer = null;
                                break;
                            }
                            tL_topPeer = (TLRPC.TL_topPeer) siVar3.j1.get(i14);
                            if (tL_topPeer.peer.user_id == j11) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        if (tL_topPeer == null) {
                            tL_topPeer = new TLRPC.TL_topPeer();
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_topPeer.peer = tL_peerUser;
                            tL_peerUser.user_id = j11;
                            siVar3.j1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d2 / siVar3.getMessagesController().c3) + tL_topPeer.rating;
                        Collections.sort(siVar3.j1, new jg.w(21));
                        siVar3.getMessagesStorage().a.c(new ch(siVar3, j11, 0, tL_topPeer.rating));
                        siVar3.getNotificationCenter().k(ls.S0, new Object[0]);
                    }
                });
                break;
            default:
                si siVar3 = this.b;
                ArrayList[] arrayListArr = siVar3.v0;
                arrayListArr[0].remove(Long.valueOf(j3));
                siVar3.w0[0].remove(Long.valueOf(j3));
                long[] jArr = siVar3.q0;
                ArrayList[] arrayListArr2 = siVar3.t0;
                jArr[0] = siVar3.q(arrayListArr2[0], false);
                siVar3.getNotificationCenter().k(62, new Object[0]);
                siVar3.L1(false, arrayListArr2[0], arrayListArr[0], siVar3.r0[0], jArr[0], siVar3.s0);
                break;
        }
    }
}
