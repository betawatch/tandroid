package org.telegram.messenger;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp b;
    public final /* synthetic */ TL_update.TL_updatePeerBlocked c;

    public /* synthetic */ tk(wp wpVar, TL_update.TL_updatePeerBlocked tL_updatePeerBlocked, int i10) {
        this.a = i10;
        this.b = wpVar;
        this.c = tL_updatePeerBlocked;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0.g3(new tk(this.b, this.c, 1));
                break;
            default:
                wp wpVar = this.b;
                LongSparseIntArray longSparseIntArray = wpVar.G0;
                TL_update.TL_updatePeerBlocked tL_updatePeerBlocked = this.c;
                long C1 = kj.C1(tL_updatePeerBlocked.peer_id);
                if (!tL_updatePeerBlocked.blocked) {
                    longSparseIntArray.delete(C1);
                } else if (longSparseIntArray.indexOfKey(C1) < 0) {
                    longSparseIntArray.put(C1, 1);
                }
                wpVar.getNotificationCenter().k(43, new Object[0]);
                wpVar.O1().m0(C1, tL_updatePeerBlocked.blocked_my_stories_from, false);
                break;
        }
    }
}
