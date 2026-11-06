package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class jk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qp b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ jk(qp qpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i7) {
        this.a = i7;
        this.b = qpVar;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new jk(this.b, this.c, 1));
                break;
            default:
                qp qpVar = this.b;
                LongSparseIntArray longSparseIntArray = qpVar.G0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
                long C1 = ij.C1(tL_updatePeerBlocked.peer_id);
                if (!tL_updatePeerBlocked.blocked) {
                    longSparseIntArray.delete(C1);
                } else if (longSparseIntArray.indexOfKey(C1) < 0) {
                    longSparseIntArray.put(C1, 1);
                }
                qpVar.getNotificationCenter().k(43, new Object[0]);
                qpVar.P1().m0(C1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                break;
        }
    }
}
