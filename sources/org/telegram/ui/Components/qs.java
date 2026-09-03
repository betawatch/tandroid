package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qs {
    public final int a;
    public final ns b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public String g;
    public final ArrayList h = new ArrayList();
    public boolean i = false;

    public qs(int i10, ns nsVar) {
        this.a = i10;
        this.b = nsVar;
    }

    public final void a() {
        if (this.c || this.e) {
            return;
        }
        this.c = true;
        boolean z4 = this.d;
        int i10 = this.a;
        if (!z4) {
            ps psVar = new ps(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new jp(this, messagesStorage, psVar, 1));
            return;
        }
        TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
        getpopularappbots.limit = 20;
        String str = this.g;
        if (str == null) {
            str = "";
        }
        getpopularappbots.offset = str;
        ConnectionsManager.getInstance(i10).sendRequest(getpopularappbots, new y1(this, 3));
    }
}
