package gh;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l7 {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public n7 g;
    public boolean j;
    public boolean k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public int i = -1;

    public l7(int i9, long j10) {
        this.a = i9;
        this.b = j10;
        i();
    }

    public final void a(int i9, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        n7 e10 = e(i9);
        int i10 = 1;
        int i11 = 0;
        long j10 = this.b;
        int i12 = this.a;
        if (e10 != null) {
            e10.l.addAll(0, arrayList);
            e10.n = arrayList.size() + e10.n;
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e10);
            n(i9);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        updatestargiftcollection.collection_id = i9;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i9, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new j7(this, i10));
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
        int i9 = this.a;
        long j10 = this.b;
        n7 n7Var = new n7(i9, j10, false);
        n7Var.c = true;
        n7Var.d = -1;
        n7Var.n = 0;
        n7Var.j = true;
        this.h.put(-1, n7Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i9).sendRequest(createstargiftcollection, new fh.h1(this, tL_starGiftCollection, n7Var, callback, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i10);
            if (i9 == tL_starGiftCollection.collection_id) {
                return tL_starGiftCollection;
            }
            i10++;
        }
    }

    public final ArrayList d() {
        return h() ? this.e : this.f;
    }

    public final n7 e(int i9) {
        return (n7) this.h.get(Integer.valueOf(i9));
    }

    public final int f(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (i9 == ((TL_stars.TL_starGiftCollection) arrayList.get(i10)).collection_id) {
                return i10;
            }
            i10++;
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
        int i9 = this.a;
        long j10 = this.b;
        return j10 >= 0 ? j10 == 0 || j10 == UserConfig.getInstance(i9).getClientUserId() : ChatObject.canUserDoAction(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)), 5);
    }

    public final void i() {
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
        int i9 = this.a;
        getstargiftcollections.peer = MessagesController.getInstance(i9).getInputPeer(this.b);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j10 = MediaDataController.calcHash(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
        }
        getstargiftcollections.hash = j10;
        this.i = ConnectionsManager.getInstance(i9).sendRequest(getstargiftcollections, new j7(this, 0));
    }

    public final void j() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i9 >= arrayList2.size()) {
                return;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i9);
            if (tL_starGiftCollection.gifts_count > 0) {
                arrayList.add(tL_starGiftCollection);
            }
            i9++;
        }
    }

    public final void k(int i9, TL_stars.SavedStarGift savedStarGift) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        n7 e10 = e(i9);
        boolean z10 = false;
        if (e10 != null) {
            ArrayList arrayList2 = e10.l;
            if (!arrayList2.isEmpty()) {
                int i10 = 0;
                while (i10 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        if (v7.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
                            arrayList2.remove(i10);
                            e10.n = Math.max(0, e10.n - 1);
                            i10--;
                            break;
                        }
                        i11++;
                    }
                    i10++;
                }
            }
        }
        n(i9);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i12 = this.a;
        MessagesController messagesController = MessagesController.getInstance(i12);
        long j10 = this.b;
        updatestargiftcollection.peer = messagesController.getInputPeer(j10);
        updatestargiftcollection.collection_id = i9;
        int i13 = 2;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i9, z10);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
            z10 = false;
        }
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new j7(this, i13));
        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e10);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i9, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((n7) it.next()).n(savedStarGift, i9, z10);
        }
        n7 n7Var = this.g;
        if (n7Var != null) {
            n7Var.n(savedStarGift, i9, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((n7) it.next()).o(savedStarGift, z10);
        }
        n7 n7Var = this.g;
        if (n7Var != null) {
            n7Var.o(savedStarGift, z10);
        }
    }

    public final void n(int i9) {
        n7 e10 = e(i9);
        TL_stars.TL_starGiftCollection c10 = c(i9);
        if (e10 != null) {
            ArrayList arrayList = e10.l;
            if (c10 == null) {
                return;
            }
            TL_stars.SavedStarGift savedStarGift = arrayList.isEmpty() ? null : (TL_stars.SavedStarGift) arrayList.get(0);
            if (savedStarGift == null) {
                c10.flags &= -2;
                c10.icon = null;
            } else {
                c10.flags |= 1;
                c10.icon = savedStarGift.gift.getDocument();
            }
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.b), this);
        }
    }
}
