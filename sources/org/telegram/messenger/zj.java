package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ zj(hp hpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i3) {
        this.a = i3;
        this.b = hpVar;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new zj(this.b, this.c, 1));
                break;
            default:
                hp hpVar = this.b;
                LongSparseIntArray longSparseIntArray = hpVar.H0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
                long C1 = zi.C1(tL_updatePeerBlocked.peer_id);
                if (!tL_updatePeerBlocked.blocked) {
                    longSparseIntArray.delete(C1);
                } else if (longSparseIntArray.indexOfKey(C1) < 0) {
                    longSparseIntArray.put(C1, 1);
                }
                hpVar.getNotificationCenter().k(43, new Object[0]);
                hpVar.P1().m0(C1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                break;
        }
    }
}
