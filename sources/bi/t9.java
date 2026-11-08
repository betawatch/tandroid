package bi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class t9 {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public v9 g;
    public boolean j;
    public boolean k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final HashMap h = new HashMap();
    public int i = -1;

    public t9(int i7, long j3) {
        this.a = i7;
        this.b = j3;
        i();
    }

    public final void a(int i7, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        v9 e10 = e(i7);
        int i10 = 1;
        int i11 = 0;
        long j3 = this.b;
        int i12 = this.a;
        if (e10 != null) {
            e10.l.addAll(0, arrayList);
            e10.n = arrayList.size() + e10.n;
            qs.f(i12).k(qs.G3, Long.valueOf(j3), e10);
            n(i7);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = qp.s1(i12).j1(j3);
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
                tL_inputSavedStarGiftChat.peer = qp.s1(i12).j1(j3);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new r9(this, i10));
    }

    public final void b(String str, c20 c20Var) {
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
        v9 v9Var = new v9(i7, j3, false);
        v9Var.c = true;
        v9Var.d = -1;
        v9Var.n = 0;
        v9Var.j = true;
        this.h.put(-1, v9Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = qp.s1(i7).j1(j3);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i7).sendRequest(createstargiftcollection, new g2(this, tL_starGiftCollection, v9Var, c20Var, 4));
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

    public final v9 e(int i7) {
        return (v9) this.h.get(Integer.valueOf(i7));
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
        return j3 >= 0 ? j3 == 0 || j3 == p10.i(i7).e() : org.telegram.messenger.t3.w(5, qp.s1(i7).M0(Long.valueOf(-j3)));
    }

    public final void i() {
        if (this.c || this.d) {
            return;
        }
        this.c = true;
        TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
        int i7 = this.a;
        getstargiftcollections.peer = qp.s1(i7).j1(this.b);
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        long j3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j3 = ui.p(j3, ((TL_stars.TL_starGiftCollection) obj).hash);
        }
        getstargiftcollections.hash = j3;
        this.i = ConnectionsManager.getInstance(i7).sendRequest(getstargiftcollections, new r9(this, 0));
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
        boolean z9;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        v9 e10 = e(i7);
        boolean z11 = true;
        boolean z12 = false;
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
                        if (ea.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i11))) {
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
        qp s12 = qp.s1(i12);
        long j3 = this.b;
        updatestargiftcollection.peer = s12.j1(j3);
        updatestargiftcollection.collection_id = i7;
        int i13 = 2;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i7, z12);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                z9 = z11;
                z10 = z12;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = qp.s1(i12).j1(j3);
                z9 = z11;
                z10 = z12;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                z9 = z11;
                z10 = z12;
                org.telegram.messenger.a8.l("can't convert gift to inputgift to add into the collection");
            }
            z11 = z9;
            z12 = z10;
        }
        boolean z13 = z11;
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new r9(this, i13));
        qs f10 = qs.f(i12);
        Object[] objArr = new Object[2];
        objArr[z12 ? 1 : 0] = Long.valueOf(j3);
        objArr[z13 ? 1 : 0] = e10;
        f10.k(qs.G3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i7, boolean z9) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((v9) it.next()).p(savedStarGift, i7, z9);
        }
        v9 v9Var = this.g;
        if (v9Var != null) {
            v9Var.p(savedStarGift, i7, z9);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z9) {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((v9) it.next()).q(savedStarGift, z9);
        }
        v9 v9Var = this.g;
        if (v9Var != null) {
            v9Var.q(savedStarGift, z9);
        }
    }

    public final void n(int i7) {
        v9 e10 = e(i7);
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
            qs.f(this.a).k(qs.H3, Long.valueOf(this.b), this);
        }
    }
}
