package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gs {
    public final int a;
    public final ds b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public String g;
    public final ArrayList h = new ArrayList();
    public boolean i = false;

    public gs(int i9, ds dsVar) {
        this.a = i9;
        this.b = dsVar;
    }

    public final void a() {
        if (this.c || this.e) {
            return;
        }
        this.c = true;
        boolean z10 = this.d;
        int i9 = this.a;
        if (!z10) {
            fs fsVar = new fs(this, 0);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
            messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.video.e(this, messagesStorage, fsVar, 19));
            return;
        }
        TL_bots.getPopularAppBots getpopularappbots = new TL_bots.getPopularAppBots();
        getpopularappbots.limit = 20;
        String str = this.g;
        if (str == null) {
            str = "";
        }
        getpopularappbots.offset = str;
        ConnectionsManager.getInstance(i9).sendRequest(getpopularappbots, new w1(this, 3));
    }
}
