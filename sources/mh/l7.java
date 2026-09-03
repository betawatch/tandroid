package mh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l7 implements m7 {
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

    public l7(int i10, long j10, boolean z4) {
        this.a = i10;
        this.b = j10;
        if (z4) {
            a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mh.m7
    public final void a() {
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (this.i || this.j) {
            return;
        }
        boolean z4 = this.k == null;
        this.i = true;
        long j10 = this.p;
        int i10 = this.a;
        if (j10 != 0) {
            TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
            getcraftstargifts.gift_id = this.p;
            getcraftstargifts.offset = z4 ? "" : this.k;
            getcraftstargifts.limit = z4 ? 15 : 30;
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
                getsavedstargifts2.peer = MessagesController.getInstance(i10).getInputPeer(j11);
            }
            getsavedstargifts2.offset = z4 ? "" : this.k;
            getsavedstargifts2.limit = z4 ? Math.max(MessagesController.getInstance(i10).stargiftsPinnedToTopLimit, 15) : 30;
            getsavedstargifts = getsavedstargifts2;
            if (this.c) {
                getsavedstargifts2.flags |= 64;
                getsavedstargifts2.collection_id = this.d;
                getsavedstargifts = getsavedstargifts2;
            }
        }
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getsavedstargifts, new k7(this, r2, z4, 0));
        this.m = sendRequest;
        int[] iArr = {sendRequest};
    }

    @Override // mh.m7
    public final int b(int i10) {
        if (!g5.O1(this.a, this.b)) {
            return -1;
        }
        int i11 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.l;
            if (i11 >= arrayList.size()) {
                for (int i12 = i10 - 1; i12 >= 0; i12--) {
                    if (((TL_stars.SavedStarGift) arrayList.get(i12)).can_upgrade) {
                        return i12;
                    }
                }
                return -1;
            }
            if (((TL_stars.SavedStarGift) arrayList.get(i11)).can_upgrade) {
                return i11;
            }
            i11++;
        }
    }

    @Override // mh.m7
    public final int c() {
        return this.n;
    }

    @Override // mh.m7
    public final void d() {
        NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
    }

    @Override // mh.m7
    public final int e() {
        return this.l.size();
    }

    public final void f(int i10, boolean z4) {
        int i11 = (i10 & 15) != 0 ? 15 : (i10 & 768) != 0 ? 768 : 0;
        int i12 = this.g;
        int i13 = i10 | ((~i11) & i12);
        if (i12 != i13) {
            this.g = i13;
            if (z4) {
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

    @Override // mh.m7
    public final Object get(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.l;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return arrayList.get(i10);
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.l;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i10);
            if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                arrayList.add(savedStarGift);
            }
            i10++;
        }
    }

    public final void i(boolean z4) {
        if (this.m != -1) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m, true);
            this.m = -1;
        }
        this.i = false;
        this.l.clear();
        this.k = null;
        this.j = false;
        if (z4 || this.o) {
            a();
        }
    }

    @Override // mh.m7
    public final int indexOf(Object obj) {
        return this.l.indexOf(obj);
    }

    public final void j(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i10 = this.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z4 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.l;
                    if (i12 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                        if (starGift3 != null && starGift3.id == starGift2.id) {
                            arrayList2.remove(i12);
                            this.n = Math.max(0, this.n - 1);
                            z4 = true;
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
            }
            if (z4) {
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i10).sendRequest(getsavedstargift, new gf.a(this, 9));
        }
    }

    public final void k(int i10, int i11) {
        ArrayList arrayList = this.l;
        int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
        if (clamp < 0 || clamp >= arrayList.size()) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(clamp);
        int clamp2 = Utilities.clamp(i11, arrayList.size() - 1, 0);
        if (clamp2 < 0 || clamp2 >= arrayList.size()) {
            return;
        }
        arrayList.add(clamp2, savedStarGift);
    }

    public final void l() {
        boolean z4 = this.c;
        int i10 = 0;
        long j10 = this.b;
        int i11 = this.a;
        if (!z4) {
            TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
            togglestargiftspinnedtotop.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            ArrayList h = h();
            int size = h.size();
            while (i10 < size) {
                Object obj = h.get(i10);
                i10++;
                togglestargiftspinnedtotop.stargift.add(g((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i11).sendRequest(togglestargiftspinnedtotop, new oh.p5(4), 64);
            return;
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        updatestargiftcollection.collection_id = this.d;
        updatestargiftcollection.flags |= 8;
        ArrayList arrayList = this.l;
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            updatestargiftcollection.order.add(g((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null, 64);
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift, boolean z4, boolean z10) {
        boolean z11;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList h = h();
            boolean contains = h.contains(savedStarGift);
            int i10 = this.a;
            if (contains) {
                if (!z4) {
                    h.remove(savedStarGift);
                    z11 = false;
                    savedStarGift.pinned_to_top = z4;
                    arrayList = this.l;
                    arrayList.removeAll(h);
                    if (this.e && !this.c) {
                        Collections.sort(arrayList, new e5.f(18));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
                    l();
                    return z11;
                }
            } else if (z4) {
                if (h.size() + 1 <= MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                    z11 = false;
                } else {
                    if (!z10) {
                        return true;
                    }
                    while (h.size() > 0 && h.size() + 1 > MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) e2.c.g(1, h)).pinned_to_top = false;
                    }
                    z11 = true;
                }
                h.add(savedStarGift);
                savedStarGift.pinned_to_top = z4;
                arrayList = this.l;
                arrayList.removeAll(h);
                if (this.e) {
                    Collections.sort(arrayList, new e5.f(18));
                }
                arrayList.addAll(0, h);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
                l();
                return z11;
            }
        }
        return false;
    }

    public final void n(TL_stars.SavedStarGift savedStarGift, int i10, boolean z4) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (t7.k(savedStarGift2, savedStarGift)) {
                if (!z4) {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i10));
                } else if (!savedStarGift2.collection_id.contains(Integer.valueOf(i10))) {
                    savedStarGift2.collection_id.add(Integer.valueOf(i10));
                }
            }
        }
    }

    public final void o(TL_stars.SavedStarGift savedStarGift, boolean z4) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (t7.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z4) {
                savedStarGift2.unsaved = z4;
                z10 = true;
            }
        }
        if (z10) {
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.b), this);
        }
    }
}
