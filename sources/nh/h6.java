package nh;

import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class h6 {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ t6 j;

    public h6(int i10, long j10, t6 t6Var) {
        this.j = t6Var;
        this.a = i10;
        this.b = j10;
        this.c = j10 == UserConfig.getInstance(i10).getClientUserId();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.i(this.b)) && this.f && this.h.size() < MessagesController.getInstance(this.a).config.storiesAlbumsLimit.get();
    }

    public final m6 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                return null;
            }
            m6 m6Var = (m6) arrayList.get(i11);
            if (i10 == m6Var.a) {
                return m6Var;
            }
            i11++;
        }
    }

    public final int c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (i10 == ((m6) arrayList.get(i11)).a) {
                return i11;
            }
            i11++;
        }
    }

    public final void d() {
        if (this.e || this.f) {
            return;
        }
        this.e = true;
        boolean z4 = this.d;
        long j10 = this.b;
        int i10 = this.a;
        if (!z4) {
            MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j10, new Consumer() { // from class: nh.g6
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    AndroidUtilities.runOnUIThread(new n4(3, h6.this, (List) obj));
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
        tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new gf.a(this, 13));
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i10 = this.a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i10).getInputPeer(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_reorderAlbums.order.add(Integer.valueOf(((m6) obj).a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z4) {
        int i10 = this.a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j10 = this.b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z4) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
