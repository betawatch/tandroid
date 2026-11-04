package ci;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s8 {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public v8 g;
    public boolean j;
    public boolean k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public int i = -1;

    public s8(int i3, long j10) {
        this.a = i3;
        this.b = j10;
        i();
    }

    public final void a(int i3, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        v8 e10 = e(i3);
        int i10 = 1;
        int i11 = 0;
        long j10 = this.b;
        int i12 = this.a;
        if (e10 != null) {
            e10.l.addAll(0, arrayList);
            e10.n = arrayList.size() + e10.n;
            hs.f(i12).k(hs.G3, Long.valueOf(j10), e10);
            n(i3);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = hp.s1(i12).j1(j10);
        updatestargiftcollection.collection_id = i3;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i3, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = hp.s1(i12).j1(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new q8(this, i10));
    }

    public final void b(String str, u10 u10Var) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.e.add(tL_starGiftCollection);
        j();
        int i3 = this.a;
        long j10 = this.b;
        v8 v8Var = new v8(i3, j10, false);
        v8Var.c = true;
        v8Var.d = -1;
        v8Var.n = 0;
        v8Var.j = true;
        this.h.put(-1, v8Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = hp.s1(i3).j1(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i3).sendRequest(createstargiftcollection, new ai.q1(this, tL_starGiftCollection, v8Var, u10Var, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i10);
            if (i3 == tL_starGiftCollection.collection_id) {
                return tL_starGiftCollection;
            }
            i10++;
        }
    }

    public final ArrayList d() {
        return h() ? this.e : this.f;
    }

    public final v8 e(int i3) {
        return (v8) this.h.get(Integer.valueOf(i3));
    }

    public final int f(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (i3 == ((TL_stars.TL_starGiftCollection) arrayList.get(i10)).collection_id) {
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
        long j10 = this.b;
        int i3 = this.a;
        return j10 >= 0 ? j10 == 0 || j10 == h10.i(i3).e() : org.telegram.messenger.t3.w(5, hp.s1(i3).M0(Long.valueOf(-j10)));
    }

    public final void i() {
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
        int i3 = this.a;
        getstargiftcollections.peer = hp.s1(i3).j1(this.b);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j10 = li.p(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
        }
        getstargiftcollections.hash = j10;
        this.i = ConnectionsManager.getInstance(i3).sendRequest(getstargiftcollections, new q8(this, 0));
    }

    public final void j() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i3 >= arrayList2.size()) {
                return;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i3);
            if (tL_starGiftCollection.gifts_count > 0) {
                arrayList.add(tL_starGiftCollection);
            }
            i3++;
        }
    }

    public final void k(int i3, TL_stars.SavedStarGift savedStarGift) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        v8 e10 = e(i3);
        boolean z12 = true;
        boolean z13 = false;
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
                        if (e9.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
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
        n(i3);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i12 = this.a;
        hp s12 = hp.s1(i12);
        long j10 = this.b;
        updatestargiftcollection.peer = s12.j1(j10);
        updatestargiftcollection.collection_id = i3;
        int i13 = 2;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i3, z13);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                z10 = z12;
                z11 = z13;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = hp.s1(i12).j1(j10);
                z10 = z12;
                z11 = z13;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                z10 = z12;
                z11 = z13;
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
            z12 = z10;
            z13 = z11;
        }
        boolean z14 = z12;
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new q8(this, i13));
        hs f10 = hs.f(i12);
        Object[] objArr = new Object[2];
        objArr[z13 ? 1 : 0] = Long.valueOf(j10);
        objArr[z14 ? 1 : 0] = e10;
        f10.k(hs.G3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i3, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((v8) it.next()).p(savedStarGift, i3, z10);
        }
        v8 v8Var = this.g;
        if (v8Var != null) {
            v8Var.p(savedStarGift, i3, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((v8) it.next()).q(savedStarGift, z10);
        }
        v8 v8Var = this.g;
        if (v8Var != null) {
            v8Var.q(savedStarGift, z10);
        }
    }

    public final void n(int i3) {
        v8 e10 = e(i3);
        TL_stars.TL_starGiftCollection c2 = c(i3);
        if (e10 != null) {
            ArrayList arrayList = e10.l;
            if (c2 == null) {
                return;
            }
            TL_stars.SavedStarGift savedStarGift = arrayList.isEmpty() ? null : (TL_stars.SavedStarGift) arrayList.get(0);
            if (savedStarGift == null) {
                c2.flags &= -2;
                c2.icon = null;
            } else {
                c2.flags |= 1;
                c2.icon = savedStarGift.gift.getDocument();
            }
            hs.f(this.a).k(hs.H3, Long.valueOf(this.b), this);
        }
    }
}
