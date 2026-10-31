package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class sk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ sk(vp vpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0.g3(new sk(this.b, this.c, 1));
                break;
            default:
                vp vpVar = this.b;
                LongSparseIntArray longSparseIntArray = vpVar.G0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
                long C1 = jj.C1(tL_updatePeerBlocked.peer_id);
                if (!tL_updatePeerBlocked.blocked) {
                    longSparseIntArray.delete(C1);
                } else if (longSparseIntArray.indexOfKey(C1) < 0) {
                    longSparseIntArray.put(C1, 1);
                }
                vpVar.getNotificationCenter().k(43, new Object[0]);
                vpVar.O1().m0(C1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                break;
        }
    }
}
