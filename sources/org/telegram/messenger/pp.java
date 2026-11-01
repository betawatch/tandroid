package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class pp {
    public final int a;
    public final HashSet b = new HashSet();
    public boolean c;
    public boolean d;

    public pp(int i10) {
        this.a = i10;
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
        getsavedmusicids.hash = 0L;
        ConnectionsManager.getInstance(i10).sendRequest(getsavedmusicids, new v1(this, 5));
    }
}
