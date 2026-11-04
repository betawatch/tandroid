package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class qg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ long c;

    public /* synthetic */ qg(li liVar, long j10, int i3) {
        this.a = i3;
        this.b = liVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i10 = this.a;
        li liVar = this.b;
        long j10 = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                a0.h hVar = liVar.x1;
                ArrayList arrayList = (ArrayList) hVar.f(j10);
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                        int i13 = liVar.currentAccount;
                        pr a10 = pr.a(j10, zi.c2(i13, message, t3.b0(i13, j10), false));
                        liVar.y1.remove(a10);
                        liVar.getNotificationCenter().k(69, null, a10);
                    }
                }
                hVar.l(j10);
                break;
            case 1:
                liVar.q1.l(j10);
                break;
            case 2:
                final long j11 = this.c;
                final li liVar2 = this.b;
                liVar2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = liVar2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j11 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i11 = queryFinalized.intValue(0);
                        i3 = queryFinalized.intValue(1);
                    } else {
                        i3 = 0;
                    }
                    queryFinalized.dispose();
                    if (i11 > 0 && liVar2.getUserConfig().E != 0) {
                        d = i3 - liVar2.getUserConfig().E;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                final double d10 = d;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.pg
                    @Override // java.lang.Runnable
                    public final void run() {
                        li liVar3;
                        long j12;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i14 = 0;
                        while (true) {
                            liVar3 = li.this;
                            int size = liVar3.j1.size();
                            j12 = j11;
                            if (i14 >= size) {
                                tL_topPeer = null;
                                break;
                            }
                            tL_topPeer = (TLRPC.TL_topPeer) liVar3.j1.get(i14);
                            if (tL_topPeer.peer.user_id == j12) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        if (tL_topPeer == null) {
                            tL_topPeer = new TLRPC.TL_topPeer();
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_topPeer.peer = tL_peerUser;
                            tL_peerUser.user_id = j12;
                            liVar3.j1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d10 / liVar3.getMessagesController().a3) + tL_topPeer.rating;
                        Collections.sort(liVar3.j1, new o0.a(12));
                        liVar3.getMessagesStorage().a.c(new sg(liVar3, j12, 0, tL_topPeer.rating));
                        liVar3.getNotificationCenter().k(hs.S0, new Object[0]);
                    }
                });
                break;
            default:
                li liVar3 = this.b;
                ArrayList[] arrayListArr = liVar3.v0;
                arrayListArr[0].remove(Long.valueOf(j10));
                liVar3.w0[0].remove(Long.valueOf(j10));
                long[] jArr = liVar3.q0;
                ArrayList[] arrayListArr2 = liVar3.t0;
                jArr[0] = liVar3.o(arrayListArr2[0], false);
                liVar3.getNotificationCenter().k(62, new Object[0]);
                liVar3.G1(false, arrayListArr2[0], arrayListArr[0], liVar3.r0[0], jArr[0], liVar3.s0);
                break;
        }
    }
}
