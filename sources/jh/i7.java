package jh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i7 {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public k7 g;
    public boolean j;
    public boolean k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public int i = -1;

    public i7(int i10, long j10) {
        this.a = i10;
        this.b = j10;
        i();
    }

    public final void a(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        k7 e10 = e(i10);
        int i11 = 1;
        int i12 = 0;
        long j10 = this.b;
        int i13 = this.a;
        if (e10 != null) {
            e10.l.addAll(0, arrayList);
            e10.n = arrayList.size() + e10.n;
            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e10);
            n(i10);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i13).getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i10, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i13).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new g7(this, i11));
    }

    public final void b(String str, Utilities.Callback callback) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.e.add(tL_starGiftCollection);
        j();
        int i10 = this.a;
        long j10 = this.b;
        k7 k7Var = new k7(i10, j10, false);
        k7Var.c = true;
        k7Var.d = -1;
        k7Var.n = 0;
        k7Var.j = true;
        this.h.put(-1, k7Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(createstargiftcollection, new ih.c1(this, tL_starGiftCollection, k7Var, callback, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 >= arrayList.size()) {
                return null;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i11);
            if (i10 == tL_starGiftCollection.collection_id) {
                return tL_starGiftCollection;
            }
            i11++;
        }
    }

    public final ArrayList d() {
        return h() ? this.e : this.f;
    }

    public final k7 e(int i10) {
        return (k7) this.h.get(Integer.valueOf(i10));
    }

    public final int f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 >= arrayList.size()) {
                return -1;
            }
            if (i10 == ((TL_stars.TL_starGiftCollection) arrayList.get(i11)).collection_id) {
                return i11;
            }
            i11++;
        }
    }

    public final void g() {
        if (this.i != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.i, true);
            this.i = -1;
        }
        this.c = false;
        this.d = false;
        if (this.j) {
            i();
        }
    }

    public final boolean h() {
        int i10 = this.a;
        long j10 = this.b;
        return j10 >= 0 ? j10 == 0 || j10 == UserConfig.getInstance(i10).getClientUserId() : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final void i() {
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
        int i10 = this.a;
        getstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(this.b);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        long j10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            j10 = MediaDataController.calcHash(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
        }
        getstargiftcollections.hash = j10;
        this.i = ConnectionsManager.getInstance(i10).sendRequest(getstargiftcollections, new g7(this, 0));
    }

    public final void j() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i10);
            if (tL_starGiftCollection.gifts_count > 0) {
                arrayList.add(tL_starGiftCollection);
            }
            i10++;
        }
    }

    public final void k(int i10, TL_stars.SavedStarGift savedStarGift) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        k7 e10 = e(i10);
        boolean z10 = false;
        if (e10 != null) {
            ArrayList arrayList2 = e10.l;
            if (!arrayList2.isEmpty()) {
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        }
                        if (s7.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i12))) {
                            arrayList2.remove(i11);
                            e10.n = Math.max(0, e10.n - 1);
                            i11--;
                            break;
                        }
                        i12++;
                    }
                    i11++;
                }
            }
        }
        n(i10);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i13 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i13);
        long j10 = this.b;
        updatestargiftcollection.peer = messagesController.getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        int i14 = 2;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i15 = 0;
        while (i15 < size) {
            Object obj = arrayList.get(i15);
            i15++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i10, z10);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i13).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
            z10 = false;
        }
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new g7(this, i14));
        NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e10);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((k7) it.next()).n(savedStarGift, i10, z10);
        }
        k7 k7Var = this.g;
        if (k7Var != null) {
            k7Var.n(savedStarGift, i10, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((k7) it.next()).o(savedStarGift, z10);
        }
        k7 k7Var = this.g;
        if (k7Var != null) {
            k7Var.o(savedStarGift, z10);
        }
    }

    public final void n(int i10) {
        k7 e10 = e(i10);
        TL_stars.TL_starGiftCollection c3 = c(i10);
        if (e10 != null) {
            ArrayList arrayList = e10.l;
            if (c3 == null) {
                return;
            }
            TL_stars.SavedStarGift savedStarGift = arrayList.isEmpty() ? null : (TL_stars.SavedStarGift) arrayList.get(0);
            if (savedStarGift == null) {
                c3.flags &= -2;
                c3.icon = null;
            } else {
                c3.flags |= 1;
                c3.icon = savedStarGift.gift.getDocument();
            }
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.b), this);
        }
    }
}
