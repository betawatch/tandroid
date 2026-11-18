package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class fk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ fk(mp mpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i7) {
        this.a = i7;
        this.b = mpVar;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.g3(new fk(this.b, this.c, 1));
                break;
            default:
                mp mpVar = this.b;
                LongSparseIntArray longSparseIntArray = mpVar.H0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
                long B1 = fj.B1(tL_updatePeerBlocked.peer_id);
                if (!tL_updatePeerBlocked.blocked) {
                    longSparseIntArray.delete(B1);
                } else if (longSparseIntArray.indexOfKey(B1) < 0) {
                    longSparseIntArray.put(B1, 1);
                }
                mpVar.getNotificationCenter().k(43, new Object[0]);
                mpVar.R1().m0(B1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                break;
        }
    }
}
