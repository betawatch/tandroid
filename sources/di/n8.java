package di;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class n8 {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public p8 g;
    public boolean j;
    public boolean k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public int i = -1;

    public n8(int i7, long j3) {
        this.a = i7;
        this.b = j3;
        i();
    }

    public final void a(int i7, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        p8 e10 = e(i7);
        int i10 = 1;
        int i11 = 0;
        long j3 = this.b;
        int i12 = this.a;
        if (e10 != null) {
            e10.l.addAll(0, arrayList);
            e10.n = arrayList.size() + e10.n;
            ls.f(i12).k(ls.I3, Long.valueOf(j3), e10);
            n(i7);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = np.u1(i12).l1(j3);
        updatestargiftcollection.collection_id = i7;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i7, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = np.u1(i12).l1(j3);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new l8(this, i10));
    }

    public final void b(String str, y10 y10Var) {
        if (this.k) {
            return;
        }
        this.k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.e.add(tL_starGiftCollection);
        j();
        int i7 = this.a;
        long j3 = this.b;
        p8 p8Var = new p8(i7, j3, false);
        p8Var.c = true;
        p8Var.d = -1;
        p8Var.n = 0;
        p8Var.j = true;
        this.h.put(-1, p8Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = np.u1(i7).l1(j3);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i7).sendRequest(createstargiftcollection, new bi.k2(this, tL_starGiftCollection, p8Var, y10Var, 5));
    }

    public final TL_stars.TL_starGiftCollection c(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i10);
            if (i7 == tL_starGiftCollection.collection_id) {
                return tL_starGiftCollection;
            }
            i10++;
        }
    }

    public final ArrayList d() {
        return h() ? this.e : this.f;
    }

    public final p8 e(int i7) {
        return (p8) this.h.get(Integer.valueOf(i7));
    }

    public final int f(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            if (i7 == ((TL_stars.TL_starGiftCollection) arrayList.get(i10)).collection_id) {
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
        long j3 = this.b;
        int i7 = this.a;
        return j3 >= 0 ? j3 == 0 || j3 == k10.i(i7).e() : org.telegram.messenger.v3.w(5, np.u1(i7).O0(Long.valueOf(-j3)));
    }

    public final void i() {
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
        int i7 = this.a;
        getstargiftcollections.peer = np.u1(i7).l1(this.b);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        long j3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j3 = si.r(j3, ((TL_stars.TL_starGiftCollection) obj).hash);
        }
        getstargiftcollections.hash = j3;
        this.i = ConnectionsManager.getInstance(i7).sendRequest(getstargiftcollections, new l8(this, 0));
    }

    public final void j() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= arrayList2.size()) {
                return;
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i7);
            if (tL_starGiftCollection.gifts_count > 0) {
                arrayList.add(tL_starGiftCollection);
            }
            i7++;
        }
    }

    public final void k(int i7, TL_stars.SavedStarGift savedStarGift) {
        boolean z10;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        p8 e10 = e(i7);
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
                        if (y8.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
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
        n(i7);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i12 = this.a;
        np u12 = np.u1(i12);
        long j3 = this.b;
        updatestargiftcollection.peer = u12.l1(j3);
        updatestargiftcollection.collection_id = i7;
        int i13 = 2;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i7, z13);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                z10 = z12;
                z11 = z13;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = np.u1(i12).l1(j3);
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
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new l8(this, i13));
        ls f10 = ls.f(i12);
        Object[] objArr = new Object[2];
        objArr[z13 ? 1 : 0] = Long.valueOf(j3);
        objArr[z14 ? 1 : 0] = e10;
        f10.k(ls.I3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i7, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((p8) it.next()).r(savedStarGift, i7, z10);
        }
        p8 p8Var = this.g;
        if (p8Var != null) {
            p8Var.r(savedStarGift, i7, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((p8) it.next()).s(savedStarGift, z10);
        }
        p8 p8Var = this.g;
        if (p8Var != null) {
            p8Var.s(savedStarGift, z10);
        }
    }

    public final void n(int i7) {
        p8 e10 = e(i7);
        TL_stars.TL_starGiftCollection c10 = c(i7);
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
            ls.f(this.a).k(ls.J3, Long.valueOf(this.b), this);
        }
    }
}
