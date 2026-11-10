package bi;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class v9 implements w9 {
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

    public v9(int i7, long j3, boolean z9) {
        this.a = i7;
        this.b = j3;
        if (z9) {
            a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bi.w9
    public final void a() {
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (this.i || this.j) {
            return;
        }
        boolean z9 = this.k == null;
        this.i = true;
        long j3 = this.p;
        int i7 = this.a;
        if (j3 != 0) {
            TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
            getcraftstargifts.gift_id = this.p;
            getcraftstargifts.offset = z9 ? "" : this.k;
            getcraftstargifts.limit = z9 ? 15 : 30;
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
            long j10 = this.b;
            if (j10 == 0) {
                getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                getsavedstargifts2.peer = qp.s1(i7).j1(j10);
            }
            getsavedstargifts2.offset = z9 ? "" : this.k;
            getsavedstargifts2.limit = z9 ? Math.max(qp.s1(i7).K6, 15) : 30;
            getsavedstargifts = getsavedstargifts2;
            if (this.c) {
                getsavedstargifts2.flags |= 64;
                getsavedstargifts2.collection_id = this.d;
                getsavedstargifts = getsavedstargifts2;
            }
        }
        int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(getsavedstargifts, new u9(this, r2, z9, 0));
        this.m = sendRequest;
        int[] iArr = {sendRequest};
    }

    @Override // bi.w9
    public final int b(int i7) {
        if (!k7.K1(this.a, this.b)) {
            return -1;
        }
        int i10 = i7 + 1;
        while (true) {
            ArrayList arrayList = this.l;
            if (i10 >= arrayList.size()) {
                for (int i11 = i7 - 1; i11 >= 0; i11--) {
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

    @Override // bi.w9
    public final int c() {
        return this.n;
    }

    @Override // bi.w9
    public final void d() {
        qs.f(this.a).k(qs.G3, Long.valueOf(this.b), this);
    }

    @Override // bi.w9
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

    public final void g(int i7, boolean z9) {
        int i10 = (i7 & 15) != 0 ? 15 : (i7 & 768) != 0 ? 768 : 0;
        int i11 = this.g;
        int i12 = i7 | ((~i10) & i11);
        if (i11 != i12) {
            this.g = i12;
            if (z9) {
                j(true);
            }
        }
    }

    @Override // bi.w9
    public final Object get(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.l;
        if (i7 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i7);
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
        tL_inputSavedStarGiftChat.peer = qp.s1(this.a).j1(this.b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.l;
            if (i7 >= arrayList2.size()) {
                return arrayList;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i7);
            if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                arrayList.add(savedStarGift);
            }
            i7++;
        }
    }

    @Override // bi.w9
    public final int indexOf(Object obj) {
        return this.l.indexOf(obj);
    }

    public final void j(boolean z9) {
        if (this.m != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m, true);
            this.m = -1;
        }
        this.i = false;
        this.l.clear();
        this.k = null;
        this.j = false;
        if (z9 || this.o) {
            a();
        }
    }

    public final void k(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i7 = this.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z9 = false;
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
                            z9 = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            }
            if (z9) {
                qs.f(i7).k(qs.G3, Long.valueOf(this.b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i7).sendRequest(getsavedstargift, new j0(this, 3));
        }
    }

    public final boolean l(TL_stars.SavedStarGift savedStarGift) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (ea.k((TL_stars.SavedStarGift) arrayList.get(i7), savedStarGift)) {
                arrayList.remove(i7);
                this.n = Math.max(0, this.n - 1);
                qs.f(this.a).k(qs.G3, Long.valueOf(this.b), this);
                return true;
            }
            i7++;
        }
    }

    public final void m(int i7, int i10) {
        ArrayList arrayList = this.l;
        int j3 = Utilities.j(i7, arrayList.size() - 1, 0);
        if (j3 < 0 || j3 >= arrayList.size()) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(j3);
        int j10 = Utilities.j(i10, arrayList.size() - 1, 0);
        if (j10 < 0 || j10 >= arrayList.size()) {
            return;
        }
        arrayList.add(j10, savedStarGift);
    }

    public final void n() {
        boolean z9 = this.c;
        int i7 = 0;
        long j3 = this.b;
        int i10 = this.a;
        if (!z9) {
            TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
            togglestargiftspinnedtotop.peer = qp.s1(i10).j1(j3);
            ArrayList i11 = i();
            int size = i11.size();
            while (i7 < size) {
                Object obj = i11.get(i7);
                i7++;
                togglestargiftspinnedtotop.stargift.add(h((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i10).sendRequest(togglestargiftspinnedtotop, new di.v5(9), 64);
            return;
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = qp.s1(i10).j1(j3);
        updatestargiftcollection.collection_id = this.d;
        updatestargiftcollection.flags |= 8;
        ArrayList arrayList = this.l;
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            updatestargiftcollection.order.add(h((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null, 64);
    }

    public final boolean o(TL_stars.SavedStarGift savedStarGift, boolean z9, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList i7 = i();
            boolean contains = i7.contains(savedStarGift);
            int i10 = this.a;
            if (contains) {
                if (!z9) {
                    i7.remove(savedStarGift);
                    z11 = false;
                    savedStarGift.pinned_to_top = z9;
                    arrayList = this.l;
                    arrayList.removeAll(i7);
                    if (this.e && !this.c) {
                        Collections.sort(arrayList, new a3.c(12));
                    }
                    arrayList.addAll(0, i7);
                    qs.f(i10).k(qs.G3, Long.valueOf(this.b), this);
                    n();
                    return z11;
                }
            } else if (z9) {
                if (i7.size() + 1 <= qp.s1(i10).K6) {
                    z11 = false;
                } else {
                    if (!z10) {
                        return true;
                    }
                    while (i7.size() > 0 && i7.size() + 1 > qp.s1(i10).K6) {
                        ((TL_stars.SavedStarGift) org.telegram.ui.Cells.f1.k(1, i7)).pinned_to_top = false;
                    }
                    z11 = true;
                }
                i7.add(savedStarGift);
                savedStarGift.pinned_to_top = z9;
                arrayList = this.l;
                arrayList.removeAll(i7);
                if (this.e) {
                    Collections.sort(arrayList, new a3.c(12));
                }
                arrayList.addAll(0, i7);
                qs.f(i10).k(qs.G3, Long.valueOf(this.b), this);
                n();
                return z11;
            }
        }
        return false;
    }

    public final void p(TL_stars.SavedStarGift savedStarGift, int i7, boolean z9) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (ea.k(savedStarGift2, savedStarGift)) {
                if (!z9) {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i7));
                } else if (!savedStarGift2.collection_id.contains(Integer.valueOf(i7))) {
                    savedStarGift2.collection_id.add(Integer.valueOf(i7));
                }
            }
        }
    }

    public final void q(TL_stars.SavedStarGift savedStarGift, boolean z9) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        boolean z10 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (ea.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z9) {
                savedStarGift2.unsaved = z9;
                z10 = true;
            }
        }
        if (z10) {
            qs.f(this.a).k(qs.G3, Long.valueOf(this.b), this);
        }
    }
}
