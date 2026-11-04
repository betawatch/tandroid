package ci;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v8 implements w8 {
    public final int a;
    public final long b;
    public int d;
    public Boolean h;
    public boolean i;
    public boolean j;
    public String k;
    public int n;
    public boolean o;
    public ArrayList q;
    public boolean c = false;
    public boolean e = true;
    public boolean f = false;
    public int g = 783;
    public final ArrayList l = new ArrayList();
    public int m = -1;
    public long p = 0;

    public v8(int i3, long j10, boolean z10) {
        this.a = i3;
        this.b = j10;
        if (z10) {
            a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.w8
    public final void a() {
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (this.i || this.j) {
            return;
        }
        boolean z10 = this.k == null;
        this.i = true;
        long j10 = this.p;
        int i3 = this.a;
        if (j10 != 0) {
            TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
            getcraftstargifts.gift_id = this.p;
            getcraftstargifts.offset = z10 ? "" : this.k;
            getcraftstargifts.limit = z10 ? 15 : 30;
            getsavedstargifts = getcraftstargifts;
        } else {
            TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
            getsavedstargifts2.sort_by_value = !this.e;
            getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.g, 2);
            getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.g, 4);
            getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.g, 1);
            getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.g, 8);
            getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.g, 256);
            getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.g, 512);
            getsavedstargifts2.peer_color_available = this.f;
            long j11 = this.b;
            if (j11 == 0) {
                getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                getsavedstargifts2.peer = hp.s1(i3).j1(j11);
            }
            getsavedstargifts2.offset = z10 ? "" : this.k;
            getsavedstargifts2.limit = z10 ? Math.max(hp.s1(i3).K6, 15) : 30;
            getsavedstargifts = getsavedstargifts2;
            if (this.c) {
                getsavedstargifts2.flags |= 64;
                getsavedstargifts2.collection_id = this.d;
                getsavedstargifts = getsavedstargifts2;
            }
        }
        int sendRequest = ConnectionsManager.getInstance(i3).sendRequest(getsavedstargifts, new t8(this, r2, z10, 0));
        this.m = sendRequest;
        int[] iArr = {sendRequest};
    }

    @Override // ci.w8
    public final int b(int i3) {
        if (!l6.L1(this.a, this.b)) {
            return -1;
        }
        int i10 = i3 + 1;
        while (true) {
            ArrayList arrayList = this.l;
            if (i10 >= arrayList.size()) {
                for (int i11 = i3 - 1; i11 >= 0; i11--) {
                    if (((TL_stars.SavedStarGift) arrayList.get(i11)).can_upgrade) {
                        return i11;
                    }
                }
                return -1;
            }
            if (((TL_stars.SavedStarGift) arrayList.get(i10)).can_upgrade) {
                return i10;
            }
            i10++;
        }
    }

    @Override // ci.w8
    public final int c() {
        return this.n;
    }

    @Override // ci.w8
    public final void d() {
        hs.f(this.a).k(hs.G3, Long.valueOf(this.b), this);
    }

    @Override // ci.w8
    public final int e() {
        return this.l.size();
    }

    public final void f() {
        if (this.m != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m, true);
            this.m = -1;
        }
        this.i = false;
    }

    public final void g(int i3, boolean z10) {
        int i10 = (i3 & 15) != 0 ? 15 : (i3 & 768) != 0 ? 768 : 0;
        int i11 = this.g;
        int i12 = i3 | ((~i10) & i11);
        if (i11 != i12) {
            this.g = i12;
            if (z10) {
                j(true);
            }
        }
    }

    @Override // ci.w8
    public final Object get(int i3) {
        if (i3 < 0) {
            return null;
        }
        ArrayList arrayList = this.l;
        if (i3 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i3);
    }

    public final TL_stars.InputSavedStarGift h(TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null) {
            return null;
        }
        if ((savedStarGift.flags & 8) != 0) {
            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
            tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
        tL_inputSavedStarGiftChat.peer = hp.s1(this.a).j1(this.b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.l;
            if (i3 >= arrayList2.size()) {
                return arrayList;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i3);
            if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                arrayList.add(savedStarGift);
            }
            i3++;
        }
    }

    @Override // ci.w8
    public final int indexOf(Object obj) {
        return this.l.indexOf(obj);
    }

    public final void j(boolean z10) {
        if (this.m != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m, true);
            this.m = -1;
        }
        this.i = false;
        this.l.clear();
        this.k = null;
        this.j = false;
        if (z10 || this.o) {
            a();
        }
    }

    public final void k(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i3 = this.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.l;
                    if (i11 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i11)).gift;
                        if (starGift3 != null && starGift3.id == starGift2.id) {
                            arrayList2.remove(i11);
                            this.n = Math.max(0, this.n - 1);
                            z10 = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            }
            if (z10) {
                hs.f(i3).k(hs.G3, Long.valueOf(this.b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i3).sendRequest(getsavedstargift, new d0(this, 3));
        }
    }

    public final boolean l(TL_stars.SavedStarGift savedStarGift) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i3 >= arrayList.size()) {
                return false;
            }
            if (e9.k((TL_stars.SavedStarGift) arrayList.get(i3), savedStarGift)) {
                arrayList.remove(i3);
                this.n = Math.max(0, this.n - 1);
                hs.f(this.a).k(hs.G3, Long.valueOf(this.b), this);
                return true;
            }
            i3++;
        }
    }

    public final void m(int i3, int i10) {
        ArrayList arrayList = this.l;
        int j10 = Utilities.j(i3, arrayList.size() - 1, 0);
        if (j10 < 0 || j10 >= arrayList.size()) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(j10);
        int j11 = Utilities.j(i10, arrayList.size() - 1, 0);
        if (j11 < 0 || j11 >= arrayList.size()) {
            return;
        }
        arrayList.add(j11, savedStarGift);
    }

    public final void n() {
        boolean z10 = this.c;
        int i3 = 0;
        long j10 = this.b;
        int i10 = this.a;
        if (!z10) {
            TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
            togglestargiftspinnedtotop.peer = hp.s1(i10).j1(j10);
            ArrayList i11 = i();
            int size = i11.size();
            while (i3 < size) {
                Object obj = i11.get(i3);
                i3++;
                togglestargiftspinnedtotop.stargift.add(h((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i10).sendRequest(togglestargiftspinnedtotop, new ei.u5(9), 64);
            return;
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = hp.s1(i10).j1(j10);
        updatestargiftcollection.collection_id = this.d;
        updatestargiftcollection.flags |= 8;
        ArrayList arrayList = this.l;
        int size2 = arrayList.size();
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            updatestargiftcollection.order.add(h((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null, 64);
    }

    public final boolean o(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList i3 = i();
            boolean contains = i3.contains(savedStarGift);
            int i10 = this.a;
            if (contains) {
                if (!z10) {
                    i3.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.l;
                    arrayList.removeAll(i3);
                    if (this.e && !this.c) {
                        Collections.sort(arrayList, new a3.u(3));
                    }
                    arrayList.addAll(0, i3);
                    hs.f(i10).k(hs.G3, Long.valueOf(this.b), this);
                    n();
                    return z12;
                }
            } else if (z10) {
                if (i3.size() + 1 <= hp.s1(i10).K6) {
                    z12 = false;
                } else {
                    if (!z11) {
                        return true;
                    }
                    while (i3.size() > 0 && i3.size() + 1 > hp.s1(i10).K6) {
                        ((TL_stars.SavedStarGift) org.telegram.ui.Cells.f1.o(1, i3)).pinned_to_top = false;
                    }
                    z12 = true;
                }
                i3.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.l;
                arrayList.removeAll(i3);
                if (this.e) {
                    Collections.sort(arrayList, new a3.u(3));
                }
                arrayList.addAll(0, i3);
                hs.f(i10).k(hs.G3, Long.valueOf(this.b), this);
                n();
                return z12;
            }
        }
        return false;
    }

    public final void p(TL_stars.SavedStarGift savedStarGift, int i3, boolean z10) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (e9.k(savedStarGift2, savedStarGift)) {
                if (!z10) {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i3));
                } else if (!savedStarGift2.collection_id.contains(Integer.valueOf(i3))) {
                    savedStarGift2.collection_id.add(Integer.valueOf(i3));
                }
            }
        }
    }

    public final void q(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        boolean z11 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (e9.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            hs.f(this.a).k(hs.G3, Long.valueOf(this.b), this);
        }
    }
}
