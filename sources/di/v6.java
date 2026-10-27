package di;

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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class v6 {
    public final int a;
    public final long b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public boolean i;
    public final /* synthetic */ h7 j;

    public v6(int i10, long j10, h7 h7Var) {
        this.j = h7Var;
        this.a = i10;
        this.b = j10;
        this.c = j10 == UserConfig.getInstance(i10).getClientUserId();
        d();
    }

    public final boolean a() {
        return (this.c || this.j.i(this.b)) && this.f && this.h.size() < MessagesController.getInstance(this.a).config.storiesAlbumsLimit.get();
    }

    public final a7 b(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i11 >= arrayList.size()) {
                return null;
            }
            a7 a7Var = (a7) arrayList.get(i11);
            if (i10 == a7Var.a) {
                return a7Var;
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
            if (i10 == ((a7) arrayList.get(i11)).a) {
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
        boolean z10 = this.d;
        long j10 = this.b;
        int i10 = this.a;
        if (!z10) {
            MessagesStorage.getInstance(i10).loadStoryAlbumsCache(j10, new Consumer() { // from class: di.u6
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void x(Object obj) {
                    AndroidUtilities.runOnUIThread(new b4(4, v6.this, (List) obj));
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$-CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
        tL_getAlbums.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_getAlbums, new bi.i0(this, 7));
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
            tL_reorderAlbums.order.add(Integer.valueOf(((a7) obj).a));
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_reorderAlbums, null);
    }

    public final void f(boolean z10) {
        int i10 = this.a;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
        ArrayList arrayList = this.h;
        long j10 = this.b;
        messagesStorage.saveStoryAlbumsCache(j10, arrayList);
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyAlbumsCollectionsUpdate, Long.valueOf(j10), this);
        }
    }
}
