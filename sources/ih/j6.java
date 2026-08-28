package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j6 {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ v6 j;

    public j6(int i9, long j10, v6 v6Var) {
        this.j = v6Var;
        this.a = i9;
        this.b = j10;
        this.c = j10 == UserConfig.getInstance(i9).getClientUserId();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.i(this.b)) && this.f && this.h.size() < MessagesController.getInstance(this.a).config.storiesAlbumsLimit.get();
    }

    public final o6 b(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return null;
            }
            o6 o6Var = (o6) arrayList.get(i10);
            if (i9 == o6Var.a) {
                return o6Var;
            }
            i10++;
        }
    }

    public final int c(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (i9 == ((o6) arrayList.get(i10)).a) {
                return i10;
            }
            i10++;
        }
    }

    public final void d() {
        if (this.e || this.f) {
            return;
        }
        this.e = true;
        boolean z10 = this.d;
        long j10 = this.b;
        int i9 = this.a;
        if (!z10) {
            MessagesStorage.getInstance(i9).loadStoryAlbumsCache(j10, new Consumer() { // from class: ih.i6
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    AndroidUtilities.runOnUIThread(new h3.g0(18, j6.this, (List) obj));
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
        tL_getAlbums.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        ConnectionsManager.getInstance(i9).sendRequest(tL_getAlbums, new bf.a(this, 13));
    }

    public final void e() {
        TL_stories.TL_reorderAlbums tL_reorderAlbums = new TL_stories.TL_reorderAlbums();
        int i9 = this.a;
        tL_reorderAlbums.peer = MessagesController.getInstance(i9).getInputPeer(this.b);
        tL_reorderAlbums.order = new ArrayList<>();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            tL_reorderAlbums.order.add(Integer.valueOf(((o6) obj).a));
        }
        ConnectionsManager.getInstance(i9).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i9 = this.a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i9);
        ArrayList arrayList = this.h;
        long j10 = this.b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
