package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class gk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ gk(np npVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i7) {
        this.a = i7;
        this.b = npVar;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.g3(new gk(this.b, this.c, 1));
                break;
            default:
                np npVar = this.b;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
                long B1 = gj.B1(tL_updatePeerBlocked.peer_id);
                if (!tL_updatePeerBlocked.blocked) {
                    longSparseIntArray.delete(B1);
                } else if (longSparseIntArray.indexOfKey(B1) < 0) {
                    longSparseIntArray.put(B1, 1);
                }
                npVar.getNotificationCenter().k(43, new Object[0]);
                npVar.R1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                break;
        }
    }
}
