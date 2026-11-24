// default package

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class lq6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ long c;

    public /* synthetic */ lq6(hs6 hs6Var, long j, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        hs6 hs6Var = this.b;
        long j = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                vh6 vh6Var = hs6Var.z1;
                ArrayList arrayList = (ArrayList) vh6Var.f(j);
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i3);
                        int i4 = hs6Var.currentAccount;
                        bf7 a = bf7.a(j, k47.b2(i4, message, sd2.b0(i4, j), false));
                        hs6Var.A1.remove(a);
                        hs6Var.getNotificationCenter().k(70, null, a);
                    }
                }
                vh6Var.l(j);
                break;
            case 1:
                hs6Var.q1.l(j);
                break;
            case 2:
                final long j2 = this.c;
                final hs6 hs6Var2 = this.b;
                hs6Var2.getClass();
                double d = 0.0d;
                try {
                    SQLiteDatabase sQLiteDatabase = hs6Var2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT MAX(mid), MAX(date) FROM messages_v2 WHERE uid = " + j2 + " AND out = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        i2 = queryFinalized.intValue(0);
                        i = queryFinalized.intValue(1);
                    } else {
                        i = 0;
                    }
                    queryFinalized.dispose();
                    if (i2 > 0 && hs6Var2.getUserConfig().E != 0) {
                        d = i - hs6Var2.getUserConfig().E;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                final double d2 = d;
                gm.c3(new Runnable() { // from class: kq6
                    @Override // java.lang.Runnable
                    public final void run() {
                        hs6 hs6Var3;
                        long j3;
                        TLRPC.TL_topPeer tL_topPeer;
                        int i5 = 0;
                        while (true) {
                            hs6Var3 = hs6.this;
                            int size = hs6Var3.j1.size();
                            j3 = j2;
                            if (i5 >= size) {
                                tL_topPeer = null;
                                break;
                            }
                            tL_topPeer = (TLRPC.TL_topPeer) hs6Var3.j1.get(i5);
                            if (tL_topPeer.peer.user_id == j3) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (tL_topPeer == null) {
                            tL_topPeer = new TLRPC.TL_topPeer();
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_topPeer.peer = tL_peerUser;
                            tL_peerUser.user_id = j3;
                            hs6Var3.j1.add(tL_topPeer);
                        }
                        tL_topPeer.rating = Math.exp(d2 / hs6Var3.getMessagesController().S2) + tL_topPeer.rating;
                        Collections.sort(hs6Var3.j1, new tk6((byte) 6));
                        hs6Var3.getMessagesStorage().a.c(new pq6(hs6Var3, j3, 0, tL_topPeer.rating));
                        hs6Var3.getNotificationCenter().k(nm7.S0, new Object[0]);
                    }
                });
                break;
            default:
                hs6 hs6Var3 = this.b;
                ArrayList[] arrayListArr = hs6Var3.v0;
                arrayListArr[0].remove(Long.valueOf(j));
                hs6Var3.w0[0].remove(Long.valueOf(j));
                long[] jArr = hs6Var3.q0;
                ArrayList[] arrayListArr2 = hs6Var3.t0;
                jArr[0] = hs6Var3.q(arrayListArr2[0], false);
                hs6Var3.getNotificationCenter().k(63, new Object[0]);
                hs6Var3.J1(false, arrayListArr2[0], arrayListArr[0], hs6Var3.r0[0], jArr[0], hs6Var3.s0);
                break;
        }
    }
}
