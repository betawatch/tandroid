package ei;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.ls;
import org.telegram.messenger.qr;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z6 {
    public static final Comparator X = Comparator$-CC.comparingInt(new cg.d(8));
    public TL_stories.TL_storiesStealthMode B;
    public final cg.l0 K;
    public int N;
    public boolean R;
    public t6 S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int a;
    public final m7 k;
    public final SharedPreferences l;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final HashSet t;
    public int u;
    public int v;
    public final gi.z0 w;
    public String y;
    public final a0.h b = new a0.h();
    public final a0.h c = new a0.h();
    public int d = 0;
    public final a0.h e = new a0.h();
    public LongSparseIntArray f = new LongSparseIntArray();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final a0.h i = new a0.h();
    public final LongSparseIntArray j = new LongSparseIntArray();
    public final a0.h m = new a0.h();
    public final a0.h x = new a0.h();
    public boolean z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final a0.h E = new a0.h();
    public final a0.h F = new a0.h();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final ci.y4 J = new ci.y4(this, 1);
    public final HashSet L = new HashSet();
    public final a0.h M = new a0.h();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public z6(int i3) {
        this.o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.a = i3;
        m7 m7Var = new m7();
        m7Var.a = i3;
        m7Var.b = qr.a0(i3);
        this.k = m7Var;
        SharedPreferences sharedPreferences = hp.s1(i3).e7;
        this.l = sharedPreferences;
        this.o = sharedPreferences.getString("last_stories_state", "");
        this.y = sharedPreferences.getString("last_stories_state_hidden", "");
        this.v = sharedPreferences.getInt("total_stores_hidden", 0);
        this.u = sharedPreferences.getInt("total_stores", 0);
        this.s = sharedPreferences.getBoolean("read_loaded", false);
        this.t = new HashSet(sharedPreferences.getStringSet("unsupported_stories_checked", new HashSet()));
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = null;
        String string = sharedPreferences.getString("stories_stealth_mode", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                tL_storiesStealthMode = TL_stories.TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.B = tL_storiesStealthMode;
        m7 m7Var2 = this.k;
        m7Var2.b.a.c(new b0(20, m7Var2, new y5(this, 1)));
        this.K = new cg.l0(this, i3, 4);
        this.w = new gi.z0(i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        if (r6 >= (r4 * 4)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if ((r6 * 0.6d) >= r4) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.Document C(int i3, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document = storyItem.media.getDocument();
        if (document == null || (arrayList = storyItem.media.alt_documents) == null) {
            return document;
        }
        int size = arrayList.size();
        boolean z10 = false;
        TLRPC.Document document2 = document;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Document document3 = arrayList.get(i10);
            i10++;
            TLRPC.Document document4 = document3;
            if (document4 != null && zi.L4(document4)) {
                long j10 = document4.size;
                if (j10 > 0 && j10 < document2.size) {
                    document2 = document4;
                }
            }
        }
        if (document2 != document) {
            double H0 = zi.H0(document);
            double d = document.size * 8;
            if (H0 <= 0.0d) {
                H0 = 15.0d;
            }
            long max = (long) (d / Math.max(1.0d, H0));
            long e10 = org.telegram.messenger.b6.e();
            if (!org.telegram.messenger.t0.p() && !org.telegram.messenger.t0.t()) {
                if (!P(i3, document)) {
                    if (!P(i3, document2)) {
                        if (G(i3, document) != G(i3, document2)) {
                            z10 = G(i3, document);
                        }
                    }
                }
                z10 = true;
            }
            if (!z10) {
                return document2;
            }
        }
        return document;
    }

    public static boolean G(int i3, TLRPC.Document document) {
        String r5 = org.telegram.messenger.w7.r(null, document);
        int lastIndexOf = r5.lastIndexOf(46);
        if (org.telegram.messenger.w7.G(i3).T(r5)) {
            return true;
        }
        File z10 = org.telegram.messenger.w7.z(4);
        StringBuilder sb2 = new StringBuilder();
        if (lastIndexOf > 0) {
            r5 = r5.substring(0, lastIndexOf);
        }
        return new File(z10, a1.g.s(sb2, r5, ".temp")).exists();
    }

    public static boolean P(int i3, TLRPC.Document document) {
        if (!new File(org.telegram.messenger.w7.z(6), org.telegram.messenger.w7.r(null, document)).exists()) {
            org.telegram.messenger.w7.G(i3);
            if (!org.telegram.messenger.w7.K(document, null, true, true).exists()) {
                return false;
            }
        }
        return true;
    }

    public static String a(ArrayList arrayList) {
        String str = "";
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            try {
                if (i3 > 0) {
                    str = str + ", ";
                }
                TL_stories.StoryItem storyItem = ((zi) arrayList.get(i3)).l;
                str = storyItem == null ? str + "null" : str + storyItem.id + "@" + storyItem.dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public static TL_stories.StoryItem f(TL_stories.StoryItem storyItem, TL_stories.StoryItem storyItem2) {
        if (storyItem2 == null) {
            return storyItem;
        }
        if (storyItem == null || !storyItem2.min) {
            return storyItem2;
        }
        storyItem.pinned = storyItem2.pinned;
        storyItem.isPublic = storyItem2.isPublic;
        storyItem.close_friends = storyItem2.close_friends;
        int i3 = storyItem2.date;
        if (i3 != 0) {
            storyItem.date = i3;
        }
        int i10 = storyItem2.expire_date;
        if (i10 != 0) {
            storyItem.expire_date = i10;
        }
        storyItem.caption = storyItem2.caption;
        storyItem.entities = storyItem2.entities;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia != null) {
            storyItem.media = messageMedia;
        }
        return storyItem;
    }

    public static String k0(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i3 = 0; i3 < list.size(); i3++) {
            try {
                if (i3 > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i3)).id + "@" + ((TL_stories.StoryItem) list.get(i3)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final r6 A(int i3, int i10, long j10, boolean z10) {
        if (i3 == 0 && i10 > 0) {
            Long valueOf = Long.valueOf(j10);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j10), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            r6 r6Var = (r6) hashMap3.get(Integer.valueOf(i10));
            if (r6Var != null || !z10) {
                return r6Var;
            }
            r6 r6Var2 = new r6(this.a, j10, i3, i10, new y5(this, 0));
            hashMap3.put(Integer.valueOf(i10), r6Var2);
            return r6Var2;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i3] == null) {
            hashMapArr[i3] = new HashMap();
        }
        r6 r6Var3 = (r6) hashMapArr[i3].get(Long.valueOf(j10));
        if (r6Var3 != null || !z10) {
            return r6Var3;
        }
        if (i3 == 4) {
            HashMap hashMap4 = hashMapArr[i3];
            Long valueOf2 = Long.valueOf(j10);
            k6 k6Var = new k6(this.a, j10, null, new y5(this, 0));
            hashMap4.put(valueOf2, k6Var);
            return k6Var;
        }
        HashMap hashMap5 = hashMapArr[i3];
        Long valueOf3 = Long.valueOf(j10);
        r6 r6Var4 = new r6(this.a, j10, i3, i10, new y5(this, 0));
        hashMap5.put(valueOf3, r6Var4);
        return r6Var4;
    }

    public final n6 B(long j10, boolean z10) {
        a0.h hVar = this.F;
        n6 n6Var = (n6) hVar.f(j10);
        if (n6Var != null || !z10) {
            return n6Var;
        }
        n6 n6Var2 = new n6(this.a, j10, this);
        hVar.k(n6Var2, j10);
        return n6Var2;
    }

    public final int D(boolean z10) {
        return z10 ? this.z ? Math.max(1, this.v) : this.h.size() : this.p ? Math.max(1, this.u) : this.g.size();
    }

    public final int E(int i3, long j10) {
        if (j10 == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j10 == h10.i(this.a).e() && !Utilities.x((Collection) this.b.f(j10))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f.get(j10, 0));
        boolean z10 = false;
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            if (peerStories.stories.get(i10).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i3 == 0 || peerStories.stories.get(i10).id == i3) && peerStories.stories.get(i10).id > max) {
                if (peerStories.stories.get(i10).close_friends) {
                    return 2;
                }
                z10 = true;
            }
        }
        return (!Q(j10) && z10) ? 1 : 0;
    }

    public final ArrayList F(long j10) {
        return (ArrayList) this.b.f(j10);
    }

    public final boolean H(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return false;
        }
        for (int size = peerStories.stories.size() - 1; size >= 0; size--) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(size);
            if (storyItem != null && (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream)) {
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        if (J()) {
            ArrayList arrayList = this.g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer) == h10.i(this.a).n)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J() {
        long j10 = h10.i(this.a).n;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        return ((peerStories == null || peerStories.stories.isEmpty()) && Utilities.x((Collection) this.b.f(j10))) ? false : true;
    }

    public final boolean K(long j10) {
        if (j10 == 0) {
            return false;
        }
        if (M(j10) || Q(j10)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        return (peerStories == null || peerStories.stories.isEmpty()) ? false : true;
    }

    public final boolean L(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return false;
        }
        if (j10 == h10.i(this.a).e() && !Utilities.x((Collection) this.b.f(j10))) {
            return true;
        }
        for (int i3 = 0; i3 < peerStories.stories.size(); i3++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i3);
            if (storyItem != null && storyItem.id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean M(long j10) {
        ArrayList arrayList = (ArrayList) this.b.f(j10);
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (arrayList == null || arrayList.isEmpty()) {
            return (hashMap == null || hashMap.isEmpty()) ? false : true;
        }
        return true;
    }

    public final boolean N(TL_stories.StoryView storyView) {
        if (storyView == null) {
            return false;
        }
        long j10 = storyView.user_id;
        a0.h hVar = this.M;
        if (hVar.d(j10)) {
            return ((Boolean) hVar.f(storyView.user_id)).booleanValue();
        }
        if (this.Q == 0) {
            return storyView.blocked_my_stories_from || storyView.blocked;
        }
        return this.L.contains(Long.valueOf(storyView.user_id)) || storyView.blocked_my_stories_from || storyView.blocked;
    }

    public final boolean O(TLRPC.User user) {
        if (user != null) {
            return user.contact || user.id == hp.s1(this.a).m0;
        }
        return false;
    }

    public final boolean Q(long j10) {
        ArrayList arrayList = (ArrayList) this.b.f(j10);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return ((y6) k2.p1.h(1, arrayList)).J;
    }

    public final void R(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Long.valueOf(j10));
        org.telegram.messenger.a8.b("StoriesController loadAllStoriesForDialog " + j10);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i3 = this.a;
        tL_stories_getPeerStories.peer = hp.s1(i3).j1(j10);
        ConnectionsManager.getInstance(i3).sendRequest(tL_stories_getPeerStories, new c6(this, j10, 0));
    }

    public final void S() {
        if (this.P || this.O) {
            return;
        }
        this.P = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.my_stories_from = true;
        tL_contacts_getBlocked.offset = this.L.size();
        tL_contacts_getBlocked.limit = 25;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_getBlocked, new x5(this, 2));
    }

    public final void T(boolean z10) {
        if (z10 && this.r) {
            return;
        }
        if ((z10 || !this.q) && !this.n) {
            boolean z11 = true;
            if (z10) {
                this.r = true;
            } else {
                this.q = true;
            }
            TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
            String str = z10 ? this.y : this.o;
            boolean z12 = z10 ? this.z : this.p;
            if (!TextUtils.isEmpty(str)) {
                tL_stories_getAllStories.state = str;
                tL_stories_getAllStories.flags |= 1;
            }
            if (!z12 || TextUtils.isEmpty(str)) {
                z11 = false;
            } else {
                tL_stories_getAllStories.next = true;
            }
            tL_stories_getAllStories.include_hidden = z10;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getAllStories, new g6(this, z10, tL_stories_getAllStories, z11));
        }
    }

    public final void U() {
        if (this.U || this.V) {
            return;
        }
        this.U = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new x5(this, 1));
    }

    public final void V(final TL_stories.PeerStories peerStories, final boolean z10) {
        if (peerStories == null) {
            return;
        }
        final long o10 = org.telegram.messenger.m5.o(peerStories.peer);
        final long j10 = o10 * (z10 ? -1 : 1);
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = this.D;
        if (hashSet.contains(valueOf)) {
            return;
        }
        ArrayList<Integer> arrayList = null;
        for (int i3 = 0; i3 < peerStories.stories.size(); i3++) {
            if (peerStories.stories.get(i3) instanceof TL_stories.TL_storyItemSkipped) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(Integer.valueOf(peerStories.stories.get(i3).id));
            }
            if (arrayList != null && arrayList.size() > 14) {
                break;
            }
        }
        if (arrayList != null) {
            hashSet.add(Long.valueOf(j10));
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.id = arrayList;
            int i10 = this.a;
            tL_stories_getStoriesByID.peer = hp.s1(i10).j1(o10);
            ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: ei.b6
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    org.telegram.messenger.g0.h3(new e6(z6.this, j10, z10, peerStories, o10, tLObject));
                }
            });
        }
    }

    public final void W() {
        if (this.A) {
            this.n = true;
            y5 y5Var = new y5(this, 2);
            m7 m7Var = this.k;
            m7Var.b.a.c(new b0(17, m7Var, y5Var));
        } else {
            T(false);
            T(true);
        }
        this.A = false;
    }

    public final void X(int i3, long j10) {
        org.telegram.messenger.g0.h3(new ci.i9(this, j10, i3, 1));
    }

    public final boolean Y(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z10) {
        if (storyItem != null && peerStories != null) {
            long o10 = org.telegram.messenger.m5.o(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i3 = this.f.get(o10);
            int max = Math.max(peerStories.max_read_id, Math.max(i3, storyItem.id));
            int i10 = this.a;
            us.l0.c(new ls(us.t(i10), o10, max, 1));
            peerStories.max_read_id = max;
            this.f.put(o10, max);
            if (max > i3) {
                if (!z10) {
                    this.k.i(max, o10);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = hp.s1(i10).j1(o10);
                tL_stories_readStories.max_id = storyItem.id;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stories_readStories, null);
                hs.f(i10).k(hs.F5, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void Z(long j10, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath != null) {
            return;
        }
        int i3 = this.a;
        if (org.telegram.messenger.z5.q(i3).f()) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            boolean z10 = messageMedia != null && zi.L4(messageMedia.getDocument());
            storyItem.dialogId = j10;
            if (z10) {
                TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(storyItem.media.getDocument().thumbs, 1000, false, null, false);
                org.telegram.messenger.w7.G(i3).X(C(i3, storyItem), storyItem, 0, 1);
                org.telegram.messenger.w7.G(i3).W(ac.c(w10, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
            } else {
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                TLRPC.Photo photo = messageMedia2 == null ? null : messageMedia2.photo;
                if (photo != null && (arrayList = photo.sizes) != null) {
                    org.telegram.messenger.w7.G(i3).W(ac.i(org.telegram.messenger.w7.w(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), photo), storyItem, "jpg", 0, 1);
                }
            }
            if (storyItem.media_areas != null) {
                for (int i10 = 0; i10 < Math.min(2, storyItem.media_areas.size()); i10++) {
                    if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        dh.n0 d = dh.n0.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)).reaction);
                        if (d.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(i3).r.get(d.f);
                            if (tL_availableReaction != null) {
                                org.telegram.messenger.w7.G(i3).X(tL_availableReaction.select_animation, d, 0, 0);
                            }
                        } else {
                            org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(1, i3, d.g);
                            g5Var.m = true;
                            g5Var.u();
                        }
                    }
                }
            }
        }
    }

    public final void a0(TL_stories.PeerStories peerStories) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= peerStories.stories.size()) {
                break;
            }
            if (peerStories.stories.get(i10).id > peerStories.max_read_id) {
                i3 = i10;
                break;
            }
            i10++;
        }
        if (peerStories.stories.isEmpty()) {
            return;
        }
        long o10 = org.telegram.messenger.m5.o(peerStories.peer);
        Z(o10, peerStories.stories.get(i3));
        if (i3 > 0) {
            Z(o10, peerStories.stories.get(i3 - 1));
        }
        if (i3 < peerStories.stories.size() - 1) {
            Z(o10, peerStories.stories.get(i3 + 1));
        }
    }

    public final void b(int i3, long j10, ArrayList arrayList) {
        n6 B = B(j10, true);
        B.getClass();
        z6 z6Var = B.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i10 = B.a;
        tL_updateAlbum.peer = hp.s1(i10).j1(B.b);
        tL_updateAlbum.album_id = i3;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 == null) {
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                storyItem.albums = arrayList3;
                arrayList3.add(Integer.valueOf(i3));
            } else if (!arrayList2.contains(Integer.valueOf(i3))) {
                storyItem.albums.add(Integer.valueOf(i3));
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        r6 A = z6Var.A(0, i3, B.b, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList4.get(i13);
            i13++;
            r6 A2 = z6Var.A(0, ((s6) obj3).a, B.b, false);
            if (A2 != null) {
                A2.E(i3, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.g;
        if (!z12) {
            if (z10) {
                arrayList.clear();
            } else {
                arrayList2.clear();
            }
        }
        if (org.telegram.messenger.r2.a) {
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < tL_stories_allStories.peer_stories.size(); i3++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(org.telegram.messenger.m5.o(tL_stories_allStories.peer_stories.get(i3).peer));
            }
            org.telegram.messenger.a8.b("StoriesController cache=" + z11 + " hidden=" + z10 + " processAllStoriesResponse {" + ((Object) sb2) + "}");
        }
        int i10 = this.a;
        hp.s1(i10).Y3(tL_stories_allStories.users, z11);
        hp.s1(i10).S3(tL_stories_allStories.chats, z11);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        for (int i11 = 0; i11 < tL_stories_allStories.peer_stories.size(); i11++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i11);
            long o10 = org.telegram.messenger.m5.o(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i12);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    us.l0.c(new ls(us.t(i10), o10, storyItem.id, 0));
                    peerStories.stories.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (peerStories.stories.isEmpty()) {
                this.i.l(o10);
            } else {
                e0(o10, peerStories);
                int i13 = 0;
                while (i13 < 2) {
                    ArrayList arrayList3 = i13 == 0 ? arrayList : arrayList2;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList3.size()) {
                            break;
                        }
                        if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList3.get(i14)).peer) == o10) {
                            arrayList3.remove(i14);
                            break;
                        }
                        i14++;
                    }
                    i13++;
                }
                if (o10 > 0) {
                    TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(o10));
                    if (a22 != null) {
                        if (a22.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList2.add(peerStories);
                            a0(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat M0 = hp.s1(i10).M0(Long.valueOf(-o10));
                    if (M0 != null) {
                        if (M0.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList2.add(peerStories);
                            a0(peerStories);
                        }
                    }
                }
            }
        }
        if (!z11) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            ai.y1 y1Var = new ai.y1(13);
            m7 m7Var = this.k;
            m7Var.b.a.c(new a6(m7Var, arrayList4, z12, z10, y1Var, 1));
        }
        cg.l0 l0Var = this.K;
        org.telegram.messenger.g0.r(l0Var);
        l0Var.run();
    }

    public final void c(int i3, long j10, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        b(i3, j10, arrayList);
    }

    public final void c0(TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        long o10 = org.telegram.messenger.m5.o(tL_updateStory.peer);
        if (o10 == 0) {
            org.telegram.messenger.a8.b("StoriesController can't update story dialogId == 0");
            return;
        }
        m7 m7Var = this.k;
        if (o10 > 0) {
            user = hp.s1(this.a).a2(Long.valueOf(o10));
            if (user != null && (O(user) || user.self)) {
                m7Var.b.a.c(new b0(18, m7Var, tL_updateStory));
            }
        } else {
            m7Var.b.a.c(new b0(18, m7Var, tL_updateStory));
            user = null;
        }
        org.telegram.messenger.g0.h3(new ci.l2(this, o10, tL_updateStory, user, 8));
    }

    public final void d(long j10, y6 y6Var, a0.h hVar, boolean z10) {
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (z10 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.k5.j(hVar, j10);
        }
        arrayList.add(y6Var);
    }

    public final void d0(long j10, TL_stories.PeerStories peerStories) {
        e0(j10, peerStories);
        m7 m7Var = this.k;
        int i3 = this.a;
        if (j10 <= 0) {
            if (org.telegram.messenger.t3.j0(hp.s1(i3).M0(Long.valueOf(-j10)))) {
                m7Var.b.a.c(new k7(m7Var, peerStories, 1));
            }
        } else {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            if (O(a22) || a22.self) {
                m7Var.b.a.c(new k7(m7Var, peerStories, 1));
            }
        }
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long o10 = org.telegram.messenger.m5.o(peerStories.peer);
        int i3 = this.a;
        if (o10 == h10.i(i3).e()) {
            return;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer) == o10) {
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            arrayList.add(peerStories);
        }
        hp.s1(i3).D();
    }

    public final void e0(long j10, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.h hVar = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i3 = 0; i3 < peerStories.stories.size(); i3++) {
                if (peerStories.stories.get(i3) instanceof TL_stories.TL_storyItemSkipped) {
                    int i10 = peerStories.stories.get(i3).id;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i11).id == i10 && (peerStories2.stories.get(i11) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i3, peerStories2.stories.get(i11));
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        hVar.k(peerStories, j10);
    }

    public final void f0(int i3, long j10, ArrayList arrayList) {
        n6 B = B(j10, true);
        B.getClass();
        z6 z6Var = B.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i10 = B.a;
        tL_updateAlbum.peer = hp.s1(i10).j1(B.b);
        tL_updateAlbum.album_id = i3;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 != null) {
                arrayList2.remove(Integer.valueOf(i3));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        r6 A = z6Var.A(0, i3, B.b, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            r6 A2 = z6Var.A(0, ((s6) obj3).a, B.b, false);
            if (A2 != null) {
                A2.E(i3, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void g(TL_stories.PeerStories peerStories) {
        TLRPC.Chat M0;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        ArrayList arrayList2;
        long o10 = org.telegram.messenger.m5.o(peerStories.peer);
        int i3 = this.a;
        TLRPC.User user = null;
        if (o10 > 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(o10));
            if (a22 == null) {
                org.telegram.messenger.a8.b("StoriesController can't apply story user == null");
                return;
            } else {
                user = a22;
                M0 = null;
            }
        } else {
            M0 = hp.s1(i3).M0(Long.valueOf(-o10));
            if (M0 == null) {
                org.telegram.messenger.a8.b("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i10 = 0;
        while (true) {
            arrayList = this.g;
            z10 = true;
            if (i10 >= arrayList.size()) {
                z11 = false;
                break;
            } else {
                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer) == o10) {
                    arrayList.remove(i10);
                    z11 = true;
                    break;
                }
                i10++;
            }
        }
        int i11 = 0;
        while (true) {
            arrayList2 = this.h;
            if (i11 >= arrayList2.size()) {
                break;
            }
            if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i11)).peer) == o10) {
                arrayList2.remove(i11);
                z11 = true;
                break;
            }
            i11++;
        }
        if ((user == null || !user.stories_hidden) && (M0 == null || !M0.stories_hidden)) {
            z10 = false;
        }
        if (org.telegram.messenger.r2.a) {
            org.telegram.messenger.a8.b("StoriesController move user stories to first hidden=" + z10 + " did=" + o10);
        }
        if (z10) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z11) {
            R(o10);
        }
        hp.s1(i3).D();
    }

    public final void g0(int i3, long j10, u10 u10Var) {
        TL_stories.PeerStories y9 = y(j10);
        if (y9 != null) {
            for (int i10 = 0; i10 < y9.stories.size(); i10++) {
                if (y9.stories.get(i10).id == i3 && !(y9.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped)) {
                    u10Var.a(y9.stories.get(i10));
                    return;
                }
            }
        }
        long j11 = (i3 + j10) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j11);
        if (storyItem != null) {
            u10Var.a(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i3));
        int i11 = this.a;
        tL_stories_getStoriesByID.peer = hp.s1(i11).j1(j10);
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new i6(this, j11, u10Var));
    }

    public final boolean h(long j10) {
        TLRPC.Chat M0;
        if (j10 >= 0 || (M0 = hp.s1(this.a).M0(Long.valueOf(-j10))) == null) {
            return false;
        }
        if (M0.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = M0.admin_rights;
        return tL_chatAdminRights != null && tL_chatAdminRights.edit_stories;
    }

    public final void h0(long j10, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.j;
        if (z10) {
            longSparseIntArray.put(j10, 1);
        } else {
            longSparseIntArray.delete(j10);
        }
    }

    public final boolean i(long j10) {
        return h10.i(this.a).e() == j10 || h(j10);
    }

    public final void i0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i3 = this.a;
        hs.f(i3).k(hs.D5, new Object[0]);
        SharedPreferences.Editor edit = hp.s1(i3).e7.edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.f(serializedData.toByteArray())).apply();
    }

    public final boolean j(long j10) {
        TLRPC.User a22;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i3 = this.a;
        if (j10 >= 0) {
            return j10 > 0 && (a22 = hp.s1(i3).a2(Long.valueOf(j10))) != null && a22.bot && a22.bot_can_edit;
        }
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
        if (M0 == null || !org.telegram.messenger.t3.R(M0)) {
            return false;
        }
        return M0.creator || ((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_stories);
    }

    public final void j0(long j10, TL_stories.StoryItem storyItem, dh.n0 n0Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.id;
        int i3 = this.a;
        tL_stories_sendReaction.peer = hp.s1(i3).j1(j10);
        if (n0Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (n0Var.g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = n0Var.g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (n0Var.f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = n0Var.f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        s0(j10, storyItem, false);
        ConnectionsManager.getInstance(i3).sendRequest(tL_stories_sendReaction, new u5(1));
    }

    public final void k(long j10, u10 u10Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i3 = this.a;
        tL_stories_canSendStory.peer = hp.s1(i3).j1(j10);
        ConnectionsManager.getInstance(i3).sendRequest(tL_stories_canSendStory, new ci.j(this, z10, j10, u10Var, e6Var), 1024);
    }

    public final void l(ArrayList arrayList) {
        int i3;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int size = arrayList.size();
            i3 = this.a;
            if (i10 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i10);
            long o10 = org.telegram.messenger.m5.o(peerStories.peer);
            int i11 = 0;
            while (i11 < peerStories.stories.size()) {
                if (s7.w(i3, peerStories.stories.get(i11))) {
                    peerStories.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (peerStories.stories.isEmpty() && !M(o10)) {
                this.i.l(o10);
                arrayList.remove(peerStories);
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            hs.f(i3).k(hs.v5, new Object[0]);
        }
    }

    public final void l0(long j10, boolean z10, boolean z11) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.g;
        if (z10) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                peerStories = null;
                break;
            } else {
                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i3)).peer) == j10) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i3);
                    break;
                }
                i3++;
            }
        }
        if (peerStories != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList2.size()) {
                    arrayList2.add(0, peerStories);
                    cg.l0 l0Var = this.K;
                    org.telegram.messenger.g0.r(l0Var);
                    l0Var.run();
                    break;
                }
                if (org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList2.get(i10)).peer) == j10) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        int i11 = this.a;
        hs.f(i11).k(hs.v5, new Object[0]);
        hp.s1(i11).D();
        if (z11) {
            if (j10 >= 0) {
                TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(j10));
                a22.stories_hidden = z10;
                qr.a0(i11).m1(Collections.singletonList(a22), null, false, true);
                hp.s1(i11).X3(a22, false, false);
            } else {
                TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(-j10));
                M0.stories_hidden = z10;
                qr.a0(i11).m1(null, Collections.singletonList(M0), false, true);
                hp.s1(i11).Q3(M0, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = hp.s1(i11).j1(j10);
            tL_stories_togglePeerStoriesHidden.hidden = z10;
            ConnectionsManager.getInstance(i11).sendRequest(tL_stories_togglePeerStoriesHidden, new u5(1));
        }
    }

    public final void m(TL_stories.PeerStories peerStories) {
        if (peerStories == null || peerStories.stories == null) {
            return;
        }
        int i3 = 0;
        while (i3 < peerStories.stories.size()) {
            if (s7.w(this.a, peerStories.stories.get(i3))) {
                peerStories.stories.remove(i3);
                i3--;
            }
            i3++;
        }
        peerStories.checkedExpired = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(long j10, boolean z10, boolean z11) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i3 = this.a;
        TLRPC.InputPeer j12 = hp.s1(i3).j1(j10);
        if (j12 instanceof TLRPC.TL_inputPeerEmpty) {
            return;
        }
        this.M.k(Boolean.valueOf(z10), j10);
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = this.L;
        if (hashSet.contains(valueOf) != z10) {
            if (z10) {
                hashSet.add(Long.valueOf(j10));
                this.N++;
            } else {
                hashSet.remove(Long.valueOf(j10));
                this.N--;
            }
        }
        if (z11) {
            if (z10) {
                TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                tL_contacts_block.my_stories_from = true;
                tL_contacts_block.id = j12;
                tL_contacts_unblock = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock2.my_stories_from = true;
                tL_contacts_unblock2.id = j12;
                tL_contacts_unblock = tL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(i3).sendRequest(tL_contacts_unblock, null);
        }
        hs.f(i3).k(hs.a3, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(TLRPC.TL_error tL_error) {
        boolean z10;
        String str;
        int i3 = this.a;
        if (tL_error != null && (str = tL_error.text) != null) {
            long j10 = 0;
            z10 = true;
            if (str.startsWith("STORY_SEND_FLOOD_WEEKLY_")) {
                try {
                    j10 = Long.parseLong(tL_error.text.substring(24));
                } catch (Exception unused) {
                }
                this.S = new t6(2, 0, j10);
            } else if (tL_error.text.startsWith("STORY_SEND_FLOOD_MONTHLY_")) {
                try {
                    j10 = Long.parseLong(tL_error.text.substring(25));
                } catch (Exception unused2) {
                }
                this.S = new t6(3, 0, j10);
            } else if (tL_error.text.equals("STORIES_TOO_MUCH")) {
                this.S = new t6(1, 0, 0L);
            } else if (tL_error.text.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                hp s12 = hp.s1(i3);
                if ("enabled".equals(s12.B6)) {
                    SharedPreferences.Editor edit = s12.e7.edit();
                    s12.B6 = "premium";
                    edit.putString("storiesPosting", "premium").apply();
                    hs.f(i3).k(hs.Z2, new Object[0]);
                }
            }
            if (z10) {
                hs.f(i3).k(hs.b3, new Object[0]);
            }
            return z10;
        }
        z10 = false;
        if (z10) {
        }
        return z10;
    }

    public final void n0(long j10, List list) {
        ArrayList arrayList;
        StringBuilder t10 = a1.g.t(j10, "updateDeletedStoriesInLists ", " storyItems[");
        t10.append(list.size());
        t10.append("] {");
        t10.append(k0(list));
        t10.append("}");
        org.telegram.messenger.a8.b(t10.toString());
        r6 A = A(0, -1, j10, false);
        z6 z6Var = this;
        r6 A2 = z6Var.A(1, -1, j10, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i3 = 0;
        n6 B = B(j10, false);
        if (B == null || (arrayList = B.h) == null) {
            return;
        }
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            r6 A3 = z6Var.A(0, ((s6) obj).a, j10, false);
            if (A3 != null) {
                A3.A(list);
            }
            z6Var = this;
        }
    }

    public final t6 o() {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i3 = this.a;
        int i10 = h10.i(i3).q() ? hp.s1(i3).j5 : hp.s1(i3).i5;
        ArrayList arrayList2 = (ArrayList) this.c.f(h10.i(i3).e());
        int size = arrayList2 == null ? 0 : arrayList2.size();
        TL_stories.PeerStories y9 = y(h10.i(i3).e());
        if (y9 != null && (arrayList = y9.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i10) {
            return new t6(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = hp.s1(i3).j1(h10.i(i3).e());
        ConnectionsManager.getInstance(i3).sendRequest(tL_stories_canSendStory, new x5(this, 5), 1024);
        return null;
    }

    public final void o0(long j10, List list, boolean z10) {
        TL_stories.PeerStories peerStories;
        boolean z11;
        int i3 = this.a;
        if (j10 > 0) {
            TLRPC.UserFull b22 = hp.s1(i3).b2(j10);
            if (b22 == null) {
                return;
            }
            if (b22.stories == null) {
                if (!z10) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                b22.stories = tL_peerStories;
                tL_peerStories.peer = hp.s1(i3).z1(j10);
                b22.stories.max_read_id = x(j10);
            }
            peerStories = b22.stories;
        } else {
            TLRPC.ChatFull N0 = hp.s1(i3).N0(-j10);
            if (N0 == null) {
                return;
            }
            if (N0.stories == null) {
                if (!z10) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                N0.stories = tL_peerStories2;
                tL_peerStories2.peer = hp.s1(i3).z1(j10);
                N0.stories.max_read_id = x(j10);
            }
            peerStories = N0.stories;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= peerStories.stories.size()) {
                    z11 = false;
                    break;
                }
                if (peerStories.stories.get(i11).id == storyItem.id) {
                    z11 = true;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        peerStories.stories.remove(i11);
                    } else {
                        TL_stories.StoryItem storyItem2 = peerStories.stories.get(i11);
                        storyItem = f(storyItem2, storyItem);
                        peerStories.stories.set(i11, storyItem);
                        if (storyItem.attachPath == null) {
                            storyItem.attachPath = storyItem2.attachPath;
                        }
                        if (storyItem.firstFramePath == null) {
                            storyItem.firstFramePath = storyItem2.firstFramePath;
                        }
                        k2.p1.q(storyItem.id, new StringBuilder("StoriesController update story for full peer storyId="));
                    }
                } else {
                    i11++;
                }
            }
            if (!z11) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    k2.p1.q(storyItem.id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z10) {
                    k2.p1.q(storyItem.id, new StringBuilder("StoriesController add new story for full peer storyId="));
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void p(int i3, long j10) {
        String str = "233:" + j10 + ":" + i3;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i10 = this.a;
        tL_stories_getStoriesByID.peer = hp.s1(i10).j1(j10);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i3));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new ci.x(this, i3, str, j10));
    }

    public final void p0(long j10, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories == null || (peerStories2 = (TL_stories.PeerStories) this.i.f(j10)) == null) {
            return;
        }
        org.telegram.messenger.a8.b("StoriesController update stories from full peer " + j10);
        for (int i3 = 0; i3 < peerStories2.stories.size(); i3++) {
            if (peerStories2.stories.get(i3) instanceof TL_stories.TL_storyItemSkipped) {
                int i10 = peerStories2.stories.get(i3).id;
                int i11 = 0;
                while (true) {
                    if (i11 >= peerStories.stories.size()) {
                        break;
                    }
                    if (peerStories.stories.get(i11).id == i10 && (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItem)) {
                        peerStories2.stories.set(i3, peerStories.stories.get(i11));
                        break;
                    }
                    i11++;
                }
            }
        }
    }

    public final void q() {
        this.s = false;
        this.y = "";
        this.o = "";
        this.l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        gi.z0 z0Var = this.w;
        Objects.requireNonNull(z0Var);
        org.telegram.messenger.g0.h3(new z5(z0Var, 0));
        W();
        if (this.s) {
            return;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new x5(this, 0));
    }

    public final void q0(long j10, List list, boolean z10) {
        ArrayList arrayList;
        StringBuilder t10 = a1.g.t(j10, "updateStoriesInLists ", " storyItems[");
        t10.append(list.size());
        t10.append("] {");
        t10.append(k0(list));
        t10.append("}");
        org.telegram.messenger.a8.b(t10.toString());
        r6 A = A(0, -1, j10, false);
        z6 z6Var = this;
        r6 A2 = z6Var.A(1, -1, j10, false);
        if (A != null) {
            A.D(list, z10);
        }
        if (A2 != null) {
            A2.D(list, z10);
        }
        ArrayList arrayList2 = z6Var.I;
        int size = arrayList2.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((l6) obj).D(list, z10);
        }
        n6 B = B(j10, false);
        if (B == null || (arrayList = B.h) == null) {
            return;
        }
        int size2 = arrayList.size();
        while (i3 < size2) {
            int i11 = i3 + 1;
            r6 A3 = z6Var.A(0, ((s6) arrayList.get(i3)).a, j10, false);
            if (A3 != null) {
                A3.D(list, z10);
            }
            z6Var = this;
            i3 = i11;
        }
    }

    public final void r(long j10, String str, u10 u10Var) {
        n6 B = B(j10, true);
        int i3 = B.a;
        if (B.i) {
            return;
        }
        B.i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = hp.s1(i3).j1(B.b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i3).sendRequest(tL_createAlbum, new ai.f3(13, B, u10Var));
    }

    public final void r0(long j10, ArrayList arrayList, boolean z10, g3 g3Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y9 = y(j10);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i3);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z10;
                togglepinned.id.add(Integer.valueOf(storyItem.id));
                if (y9 != null) {
                    for (int i10 = 0; i10 < y9.stories.size(); i10++) {
                        if (y9.stories.get(i10).id == storyItem.id) {
                            y9.stories.get(i10).pinned = z10;
                            this.k.k(j10, storyItem);
                        }
                    }
                }
            }
        }
        org.telegram.messenger.a8.b("StoriesController updateStoriesPinned");
        q0(j10, arrayList, false);
        o0(j10, arrayList, false);
        togglepinned.pinned = z10;
        int i11 = this.a;
        togglepinned.peer = hp.s1(i11).j1(j10);
        ConnectionsManager.getInstance(i11).sendRequest(togglepinned, new ci.e8(g3Var, 1));
    }

    public final void s(ArrayList arrayList, long j10) {
        TLRPC.ChatFull N0;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull b22;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i3 = this.a;
        tL_stories_deleteStories.peer = hp.s1(i3).j1(j10);
        a0.h hVar = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i11).id == storyItem.id) {
                            peerStories2.stories.remove(i11);
                            if (peerStories2.stories.isEmpty()) {
                                hVar.l(j10);
                            }
                        } else {
                            i11++;
                        }
                    }
                }
                tL_stories_deleteStories.id.add(Integer.valueOf(storyItem.id));
            }
        }
        if (j10 < 0 ? !((N0 = hp.s1(i3).N0(-j10)) == null || (peerStories = N0.stories) == null) : !((b22 = hp.s1(i3).b2(j10)) == null || (peerStories = b22.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i12);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= peerStories2.stories.size()) {
                        break;
                    }
                    if (peerStories2.stories.get(i13).id == storyItem2.id) {
                        peerStories2.stories.remove(i13);
                        break;
                    }
                    i13++;
                }
            }
        }
        ConnectionsManager.getInstance(i3).sendRequest(tL_stories_deleteStories, new x5(this, 3));
        n0(j10, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.id;
        m7 m7Var = this.k;
        m7Var.b.a.c(new ai.r1(m7Var, arrayList2, j10, 9));
        hs.f(i3).k(hs.v5, new Object[0]);
    }

    public final void s0(long j10, TL_stories.StoryItem storyItem, boolean z10) {
        String str;
        StringBuilder t10 = a1.g.t(j10, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.id + "@" + storyItem.dialogId;
        }
        t10.append(str);
        org.telegram.messenger.a8.b(t10.toString());
        q0(j10, Collections.singletonList(storyItem), z10);
        this.k.k(j10, storyItem);
        o0(j10, Collections.singletonList(storyItem), false);
    }

    public final y6 t(long j10, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        return (y6) hashMap.get(Integer.valueOf(storyItem.id));
    }

    public final void t0(long j10, int i3, TLRPC.Reaction reaction) {
        TL_stories.StoryItem u10 = u(i3, j10);
        if (u10 != null) {
            u10.sent_reaction = reaction;
            if (reaction != null) {
                u10.flags |= 32768;
            } else {
                u10.flags &= -32769;
            }
            s0(j10, u10, false);
        }
    }

    public final TL_stories.StoryItem u(int i3, long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            return null;
        }
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            if (peerStories.stories.get(i10).id == i3) {
                return peerStories.stories.get(i10);
            }
        }
        return null;
    }

    public final void v(ArrayList arrayList) {
        boolean z10;
        TLRPC.User a22;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i3);
            long o10 = org.telegram.messenger.m5.o(peerStories.peer);
            if (o10 <= 0 || (a22 = hp.s1(this.a).a2(Long.valueOf(o10))) == null || O(a22)) {
                z10 = false;
            } else {
                arrayList.remove(i3);
                i3--;
                z10 = true;
            }
            int i10 = 0;
            while (i10 < peerStories.stories.size()) {
                if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i10);
                    i10--;
                }
                i10++;
            }
            if (!z10 && peerStories.stories.isEmpty() && !M(o10)) {
                arrayList.remove(i3);
                i3--;
            }
            i3++;
        }
    }

    public final String w(int i3, long j10) {
        s6 b10;
        n6 B = B(j10, false);
        if (B == null || (b10 = B.b(i3)) == null) {
            return null;
        }
        return b10.b;
    }

    public final int x(long j10) {
        TL_stories.PeerStories y9 = y(j10);
        if (y9 == null) {
            y9 = z(j10);
        }
        return y9 != null ? Math.max(y9.max_read_id, this.f.get(j10, 0)) : this.f.get(j10, 0);
    }

    public final TL_stories.PeerStories y(long j10) {
        return (TL_stories.PeerStories) this.i.f(j10);
    }

    public final TL_stories.PeerStories z(long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i3 = this.a;
        if (j10 > 0) {
            TLRPC.UserFull b22 = hp.s1(i3).b2(j10);
            if (b22 != null && (peerStories2 = b22.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (b22 == null) {
                return null;
            }
            return b22.stories;
        }
        TLRPC.ChatFull N0 = hp.s1(i3).N0(-j10);
        if (N0 != null && (peerStories = N0.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (N0 == null) {
            return null;
        }
        return N0.stories;
    }
}
