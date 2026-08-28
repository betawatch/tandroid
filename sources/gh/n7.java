package gh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n7 implements o7 {
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

    public n7(int i9, long j10, boolean z10) {
        this.a = i9;
        this.b = j10;
        if (z10) {
            a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gh.o7
    public final void a() {
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (this.i || this.j) {
            return;
        }
        boolean z10 = this.k == null;
        this.i = true;
        long j10 = this.p;
        int i9 = this.a;
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
                getsavedstargifts2.peer = MessagesController.getInstance(i9).getInputPeer(j11);
            }
            getsavedstargifts2.offset = z10 ? "" : this.k;
            getsavedstargifts2.limit = z10 ? Math.max(MessagesController.getInstance(i9).stargiftsPinnedToTopLimit, 15) : 30;
            getsavedstargifts = getsavedstargifts2;
            if (this.c) {
                getsavedstargifts2.flags |= 64;
                getsavedstargifts2.collection_id = this.d;
                getsavedstargifts = getsavedstargifts2;
            }
        }
        int sendRequest = ConnectionsManager.getInstance(i9).sendRequest(getsavedstargifts, new m7(this, r2, z10, 0));
        this.m = sendRequest;
        int[] iArr = {sendRequest};
    }

    @Override // gh.o7
    public final int b(int i9) {
        if (!k5.O1(this.a, this.b)) {
            return -1;
        }
        int i10 = i9 + 1;
        while (true) {
            ArrayList arrayList = this.l;
            if (i10 >= arrayList.size()) {
                for (int i11 = i9 - 1; i11 >= 0; i11--) {
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

    @Override // gh.o7
    public final int c() {
        return this.n;
    }

    @Override // gh.o7
    public final void d() {
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
    }

    @Override // gh.o7
    public final int e() {
        return this.l.size();
    }

    public final void f(int i9, boolean z10) {
        int i10 = (i9 & 15) != 0 ? 15 : (i9 & 768) != 0 ? 768 : 0;
        int i11 = this.g;
        int i12 = i9 | ((~i10) & i11);
        if (i11 != i12) {
            this.g = i12;
            if (z10) {
                i(true);
            }
        }
    }

    public final TL_stars.InputSavedStarGift g(TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null) {
            return null;
        }
        if ((savedStarGift.flags & 8) != 0) {
            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
            tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
        tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.a).getInputPeer(this.b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    @Override // gh.o7
    public final Object get(int i9) {
        if (i9 < 0) {
            return null;
        }
        ArrayList arrayList = this.l;
        if (i9 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i9);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.l;
            if (i9 >= arrayList2.size()) {
                return arrayList;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i9);
            if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                arrayList.add(savedStarGift);
            }
            i9++;
        }
    }

    public final void i(boolean z10) {
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

    @Override // gh.o7
    public final int indexOf(Object obj) {
        return this.l.indexOf(obj);
    }

    public final void j(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i9 = this.a;
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
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i9).sendRequest(getsavedstargift, new bf.a(this, 9));
        }
    }

    public final void k(int i9, int i10) {
        ArrayList arrayList = this.l;
        int clamp = Utilities.clamp(i9, arrayList.size() - 1, 0);
        if (clamp < 0 || clamp >= arrayList.size()) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(clamp);
        int clamp2 = Utilities.clamp(i10, arrayList.size() - 1, 0);
        if (clamp2 < 0 || clamp2 >= arrayList.size()) {
            return;
        }
        arrayList.add(clamp2, savedStarGift);
    }

    public final void l() {
        boolean z10 = this.c;
        int i9 = 0;
        long j10 = this.b;
        int i10 = this.a;
        if (!z10) {
            TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
            togglestargiftspinnedtotop.peer = MessagesController.getInstance(i10).getInputPeer(j10);
            ArrayList h = h();
            int size = h.size();
            while (i9 < size) {
                Object obj = h.get(i9);
                i9++;
                togglestargiftspinnedtotop.stargift.add(g((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i10).sendRequest(togglestargiftspinnedtotop, new ih.q5(5), 64);
            return;
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        updatestargiftcollection.collection_id = this.d;
        updatestargiftcollection.flags |= 8;
        ArrayList arrayList = this.l;
        int size2 = arrayList.size();
        while (i9 < size2) {
            Object obj2 = arrayList.get(i9);
            i9++;
            updatestargiftcollection.order.add(g((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i10).sendRequest(updatestargiftcollection, null, 64);
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList h = h();
            boolean contains = h.contains(savedStarGift);
            int i9 = this.a;
            if (contains) {
                if (!z10) {
                    h.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.l;
                    arrayList.removeAll(h);
                    if (this.e && !this.c) {
                        Collections.sort(arrayList, new a5.e(17));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
                    l();
                    return z12;
                }
            } else if (z10) {
                if (h.size() + 1 <= MessagesController.getInstance(i9).stargiftsPinnedToTopLimit) {
                    z12 = false;
                } else {
                    if (!z11) {
                        return true;
                    }
                    while (h.size() > 0 && h.size() + 1 > MessagesController.getInstance(i9).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) e2.c.k(1, h)).pinned_to_top = false;
                    }
                    z12 = true;
                }
                h.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.l;
                arrayList.removeAll(h);
                if (this.e) {
                    Collections.sort(arrayList, new a5.e(17));
                }
                arrayList.addAll(0, h);
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
                l();
                return z12;
            }
        }
        return false;
    }

    public final void n(TL_stars.SavedStarGift savedStarGift, int i9, boolean z10) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (v7.k(savedStarGift2, savedStarGift)) {
                if (!z10) {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i9));
                } else if (!savedStarGift2.collection_id.contains(Integer.valueOf(i9))) {
                    savedStarGift2.collection_id.add(Integer.valueOf(i9));
                }
            }
        }
    }

    public final void o(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        boolean z11 = false;
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (v7.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
        }
    }
}
