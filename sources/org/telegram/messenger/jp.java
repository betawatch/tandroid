package org.telegram.messenger;

import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class jp {
    public final int a;
    public final HashSet b = new HashSet();
    public boolean c;
    public boolean d;

    public jp(int i7) {
        this.a = i7;
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_account.getSavedMusicIds getsavedmusicids = new TL_account.getSavedMusicIds();
        getsavedmusicids.hash = 0L;
        ConnectionsManager.getInstance(i7).sendRequest(getsavedmusicids, new s1(this, 5));
    }
}
