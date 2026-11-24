// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class g2b {
    public static final Comparator X = Comparator$-CC.comparingInt(new mm(20));
    public TL_stories.TL_storiesStealthMode B;
    public final on7 K;
    public int N;
    public boolean R;
    public wx S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int a;
    public final s2b k;
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
    public final jq3 w;
    public String y;
    public final vf6 b = new vf6();
    public final vf6 c = new vf6();
    public int d = 0;
    public final vf6 e = new vf6();
    public LongSparseIntArray f = new LongSparseIntArray();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final vf6 i = new vf6();
    public final LongSparseIntArray j = new LongSparseIntArray();
    public final vf6 m = new vf6();
    public final vf6 x = new vf6();
    public boolean z = true;
    public boolean A = true;
    public final HashSet C = new HashSet();
    public final HashSet D = new HashSet();
    public final vf6 E = new vf6();
    public final vf6 F = new vf6();
    public final HashMap[] G = new HashMap[5];
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final bz0 J = new bz0(this, 7);
    public final HashSet L = new HashSet();
    public final vf6 M = new vf6();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public g2b(int i) {
        byte b = 0;
        this.o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.a = i;
        s2b s2bVar = new s2b();
        s2bVar.a = i;
        s2bVar.b = ad7.Y(i);
        this.k = s2bVar;
        SharedPreferences sharedPreferences = na7.q1(i).X3;
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
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
        this.B = tL_storiesStealthMode;
        s2b s2bVar2 = this.k;
        s2bVar2.b.a.c(new iya(s2bVar2, new l1b(this, b), (byte) 16));
        this.K = new on7((Object) this, i, (byte) 17);
        this.w = new jq3(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        if (r6 >= (r4 << 2)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if ((r6 * 0.6d) >= r4) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.Document B(int i, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document = storyItem.media.getDocument();
        if (document == null || (arrayList = storyItem.media.alt_documents) == null) {
            return document;
        }
        int size = arrayList.size();
        boolean z = false;
        TLRPC.Document document2 = document;
        int i2 = 0;
        while (i2 < size) {
            TLRPC.Document document3 = arrayList.get(i2);
            i2++;
            TLRPC.Document document4 = document3;
            if (document4 != null && k27.J4(document4)) {
                long j = document4.size;
                if (j > 0 && j < document2.size) {
                    document2 = document4;
                }
            }
        }
        if (document2 != document) {
            double H0 = k27.H0(document);
            double d = document.size << 3;
            if (H0 <= 0.0d) {
                H0 = 15.0d;
            }
            long max = (long) (d / Math.max(1.0d, H0));
            long c = yp3.c();
            if (!a.p() && !a.s()) {
                if (!O(i, document)) {
                    if (!O(i, document2)) {
                        if (F(i, document) != F(i, document2)) {
                            z = F(i, document);
                        }
                    }
                }
                z = true;
            }
            if (!z) {
                return document2;
            }
        }
        return document;
    }

    public static boolean F(int i, TLRPC.Document document) {
        String r = ba4.r(null, document);
        int lastIndexOf = r.lastIndexOf(46);
        if (ba4.G(i).S(r)) {
            return true;
        }
        File z = ba4.z(4);
        if (lastIndexOf > 0) {
            r = r.substring(0, lastIndexOf);
        }
        return new File(z, r.concat(".temp")).exists();
    }

    public static boolean O(int i, TLRPC.Document document) {
        if (!new File(ba4.z(6), ba4.r(null, document)).exists()) {
            ba4.G(i);
            if (!ba4.J(document, null, true, true).exists()) {
                return false;
            }
        }
        return true;
    }

    public static TL_stories.StoryItem e(TL_stories.StoryItem storyItem, TL_stories.StoryItem storyItem2) {
        if (storyItem2 == null) {
            return storyItem;
        }
        if (storyItem == null || !storyItem2.min) {
            return storyItem2;
        }
        storyItem.pinned = storyItem2.pinned;
        storyItem.isPublic = storyItem2.isPublic;
        storyItem.close_friends = storyItem2.close_friends;
        int i = storyItem2.date;
        if (i != 0) {
            storyItem.date = i;
        }
        int i2 = storyItem2.expire_date;
        if (i2 != 0) {
            storyItem.expire_date = i2;
        }
        storyItem.caption = storyItem2.caption;
        storyItem.entities = storyItem2.entities;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia != null) {
            storyItem.media = messageMedia;
        }
        return storyItem;
    }

    public static String j0(List list) {
        if (list == null) {
            return "null";
        }
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i)).id + "@" + ((TL_stories.StoryItem) list.get(i)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public static String k0(ArrayList arrayList) {
        String str = "";
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                if (i > 0) {
                    str = str + ", ";
                }
                TL_stories.StoryItem storyItem = ((k27) arrayList.get(i)).l;
                str = storyItem == null ? str + "null" : str + storyItem.id + "@" + storyItem.dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final u1b A(long j, boolean z) {
        vf6 vf6Var = this.F;
        u1b u1bVar = (u1b) vf6Var.f(j);
        if (u1bVar != null || !z) {
            return u1bVar;
        }
        u1b u1bVar2 = new u1b(this.a, j, this);
        vf6Var.k(u1bVar2, j);
        return u1bVar2;
    }

    public final int C(boolean z) {
        return z ? this.z ? Math.max(1, this.v) : this.h.size() : this.p ? Math.max(1, this.u) : this.g.size();
    }

    public final int D(int i, long j) {
        if (j == 0) {
            return 0;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            peerStories = y(j);
        }
        if (peerStories == null) {
            return 0;
        }
        if (j == y6c.h(this.a).e() && !Utilities.x((Collection) this.b.f(j))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f.get(j, 0));
        boolean z = false;
        for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
            if (peerStories.stories.get(i2).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i == 0 || peerStories.stories.get(i2).id == i) && peerStories.stories.get(i2).id > max) {
                if (peerStories.stories.get(i2).close_friends) {
                    return 2;
                }
                z = true;
            }
        }
        return (!P(j) && z) ? 1 : 0;
    }

    public final ArrayList E(long j) {
        return (ArrayList) this.b.f(j);
    }

    public final boolean G(long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            peerStories = y(j);
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

    public final boolean H() {
        if (I()) {
            ArrayList arrayList = this.g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && cf3.n(((TL_stories.PeerStories) arrayList.get(0)).peer) == y6c.h(this.a).n)) {
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        long j = y6c.h(this.a).n;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        return ((peerStories == null || peerStories.stories.isEmpty()) && Utilities.x((Collection) this.b.f(j))) ? false : true;
    }

    public final boolean J(long j) {
        if (j == 0) {
            return false;
        }
        if (L(j) || P(j)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            peerStories = y(j);
        }
        return (peerStories == null || peerStories.stories.isEmpty()) ? false : true;
    }

    public final boolean K(long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            peerStories = y(j);
        }
        if (peerStories == null) {
            return false;
        }
        if (j == y6c.h(this.a).e() && !Utilities.x((Collection) this.b.f(j))) {
            return true;
        }
        for (int i = 0; i < peerStories.stories.size(); i++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i);
            if (storyItem != null && storyItem.id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean L(long j) {
        ArrayList arrayList = (ArrayList) this.b.f(j);
        HashMap hashMap = (HashMap) this.e.f(j);
        if (arrayList == null || arrayList.isEmpty()) {
            return (hashMap == null || hashMap.isEmpty()) ? false : true;
        }
        return true;
    }

    public final boolean M(TL_stories.StoryView storyView) {
        if (storyView == null) {
            return false;
        }
        long j = storyView.user_id;
        vf6 vf6Var = this.M;
        if (vf6Var.d(j)) {
            return ((Boolean) vf6Var.f(storyView.user_id)).booleanValue();
        }
        if (this.Q == 0) {
            return storyView.blocked_my_stories_from || storyView.blocked;
        }
        return this.L.contains(Long.valueOf(storyView.user_id)) || storyView.blocked_my_stories_from || storyView.blocked;
    }

    public final boolean N(TLRPC.User user) {
        if (user != null) {
            return user.contact || user.id == na7.q1(this.a).k4.c3.f();
        }
        return false;
    }

    public final boolean P(long j) {
        ArrayList arrayList = (ArrayList) this.b.f(j);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return ((f2b) b00.f(1, arrayList)).J;
    }

    public final void Q(long j) {
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Long.valueOf(j));
        fa4.b("StoriesController loadAllStoriesForDialog " + j);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i = this.a;
        tL_stories_getPeerStories.peer = na7.q1(i).h1(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_getPeerStories, new eu2(this, j, (byte) 6));
    }

    public final void R() {
        if (this.P || this.O) {
            return;
        }
        this.P = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.my_stories_from = true;
        tL_contacts_getBlocked.offset = this.L.size();
        tL_contacts_getBlocked.limit = 25;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_getBlocked, new i1b(this, (byte) 2));
    }

    public final void S(boolean z) {
        String str;
        boolean z2;
        if (z) {
            if (this.r) {
                return;
            }
        } else if (this.q) {
            return;
        }
        if (this.n) {
            return;
        }
        boolean z3 = true;
        if (z) {
            this.r = true;
        } else {
            this.q = true;
        }
        TL_stories.TL_stories_getAllStories tL_stories_getAllStories = new TL_stories.TL_stories_getAllStories();
        if (z) {
            str = this.y;
            z2 = this.z;
        } else {
            str = this.o;
            z2 = this.p;
        }
        if (!TextUtils.isEmpty(str)) {
            tL_stories_getAllStories.state = str;
            tL_stories_getAllStories.flags |= 1;
        }
        if (!z2 || TextUtils.isEmpty(str)) {
            z3 = false;
        } else {
            tL_stories_getAllStories.next = true;
        }
        tL_stories_getAllStories.include_hidden = z;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getAllStories, new n1b(this, z, tL_stories_getAllStories, z3));
    }

    public final void T() {
        if (this.U || this.V) {
            return;
        }
        this.U = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new i1b(this, (byte) 1));
    }

    public final void U(final TL_stories.PeerStories peerStories, final boolean z) {
        if (peerStories != null) {
            final long n = cf3.n(peerStories.peer);
            final long j = n * (z ? -1 : 1);
            Long valueOf = Long.valueOf(j);
            HashSet hashSet = this.D;
            if (hashSet.contains(valueOf)) {
                return;
            }
            ArrayList<Integer> arrayList = null;
            for (int i = 0; i < peerStories.stories.size(); i++) {
                if (peerStories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(Integer.valueOf(peerStories.stories.get(i).id));
                }
                if (arrayList != null && arrayList.size() > 14) {
                    break;
                }
            }
            if (arrayList != null) {
                hashSet.add(Long.valueOf(j));
                TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                tL_stories_getStoriesByID.id = arrayList;
                int i2 = this.a;
                tL_stories_getStoriesByID.peer = na7.q1(i2).h1(n);
                ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: j1b
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        gl.c3(new q94(g2b.this, j, z, peerStories, n, tLObject));
                    }
                });
            }
        }
    }

    public final void V() {
        byte b = 1;
        if (this.A) {
            this.n = true;
            l1b l1bVar = new l1b(this, b);
            s2b s2bVar = this.k;
            s2bVar.b.a.c(new iya(s2bVar, l1bVar, (byte) 13));
        } else {
            S(false);
            S(true);
        }
        this.A = false;
    }

    public final void W(int i, long j) {
        gl.c3(new va2((Object) this, j, i, (byte) 7));
    }

    public final boolean X(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z) {
        if (storyItem != null && peerStories != null) {
            long n = cf3.n(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i = this.f.get(n);
            int max = Math.max(peerStories.max_read_id, Math.max(i, storyItem.id));
            int i2 = this.a;
            im7.l0.c(new zl7(im7.n(i2), n, max, (byte) 1));
            peerStories.max_read_id = max;
            this.f.put(n, max);
            if (max > i) {
                if (!z) {
                    this.k.i(max, n);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = na7.q1(i2).h1(n);
                tL_stories_readStories.max_id = storyItem.id;
                ConnectionsManager.getInstance(i2).sendRequest(tL_stories_readStories, null);
                kk7.f(i2).k(kk7.H5, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void Y(long j, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath == null) {
            int i = this.a;
            if (up3.q(i).f()) {
                TLRPC.MessageMedia messageMedia = storyItem.media;
                boolean z = messageMedia != null && k27.J4(messageMedia.getDocument());
                storyItem.dialogId = j;
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                if (z) {
                    TLRPC.PhotoSize w = ba4.w(messageMedia2.getDocument().thumbs, 1000, false, null, false);
                    ba4.G(i).X(B(i, storyItem), storyItem, 0, 1);
                    ba4.G(i).V(gl5.c(w, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
                } else {
                    TLRPC.Photo photo = messageMedia2 == null ? null : messageMedia2.photo;
                    if (photo != null && (arrayList = photo.sizes) != null) {
                        ba4.G(i).V(gl5.i(ba4.w(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), photo), storyItem, "jpg", 0, 1);
                    }
                }
                if (storyItem.media_areas != null) {
                    for (int i2 = 0; i2 < Math.min(2, storyItem.media_areas.size()); i2++) {
                        if (storyItem.media_areas.get(i2) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                            h19 d = h19.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i2)).reaction);
                            if (d.f != null) {
                                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i).r.get(d.f);
                                if (tL_availableReaction != null) {
                                    ba4.G(i).X(tL_availableReaction.select_animation, d, 0, 0);
                                }
                            } else {
                                vl vlVar = new vl(1, i, d.g);
                                vlVar.m = true;
                                vlVar.u();
                            }
                        }
                    }
                }
            }
        }
    }

    public final void Z(TL_stories.PeerStories peerStories) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= peerStories.stories.size()) {
                break;
            }
            if (peerStories.stories.get(i2).id > peerStories.max_read_id) {
                i = i2;
                break;
            }
            i2++;
        }
        if (peerStories.stories.isEmpty()) {
            return;
        }
        long n = cf3.n(peerStories.peer);
        Y(n, peerStories.stories.get(i));
        if (i > 0) {
            Y(n, peerStories.stories.get(i - 1));
        }
        if (i < peerStories.stories.size() - 1) {
            Y(n, peerStories.stories.get(i + 1));
        }
    }

    public final void a(int i, long j, ArrayList arrayList) {
        u1b A = A(j, true);
        A.getClass();
        g2b g2bVar = A.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i2 = A.a;
        tL_updateAlbum.peer = na7.q1(i2).h1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 == null) {
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                storyItem.albums = arrayList3;
                arrayList3.add(Integer.valueOf(i));
            } else if (!arrayList2.contains(Integer.valueOf(i))) {
                storyItem.albums.add(Integer.valueOf(i));
            }
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        y1b z = g2bVar.z(0, i, A.b, false);
        if (z != null) {
            z.D(arrayList, true);
        }
        ArrayList arrayList4 = A.h;
        int size3 = arrayList4.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList4.get(i5);
            i5++;
            y1b z2 = g2bVar.z(0, ((z1b) obj3).a, A.b, false);
            if (z2 != null) {
                z2.E(i, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void a0(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z, boolean z2, boolean z3) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList arrayList2 = this.h;
        ArrayList arrayList3 = this.g;
        if (!z3) {
            if (z) {
                arrayList2.clear();
            } else {
                arrayList3.clear();
            }
        }
        if (w01.a) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tL_stories_allStories.peer_stories.size(); i++) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(cf3.n(tL_stories_allStories.peer_stories.get(i).peer));
            }
            fa4.b("StoriesController cache=" + z2 + " hidden=" + z + " processAllStoriesResponse {" + ((Object) sb) + "}");
        }
        int i2 = this.a;
        na7.q1(i2).b4(tL_stories_allStories.users, z2);
        na7.q1(i2).V3(tL_stories_allStories.chats, z2);
        int currentTime = ConnectionsManager.getInstance(i2).getCurrentTime();
        for (int i3 = 0; i3 < tL_stories_allStories.peer_stories.size(); i3++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i3);
            long n = cf3.n(peerStories.peer);
            int i4 = 0;
            while (true) {
                int size = peerStories.stories.size();
                arrayList = peerStories.stories;
                if (i4 >= size) {
                    break;
                }
                TL_stories.StoryItem storyItem = arrayList.get(i4);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    im7.l0.c(new zl7(im7.n(i2), n, storyItem.id, (byte) 0));
                    peerStories.stories.remove(i4);
                    i4--;
                }
                i4++;
            }
            if (arrayList.isEmpty()) {
                this.i.l(n);
            } else {
                d0(n, peerStories);
                int i5 = 0;
                while (i5 < 2) {
                    ArrayList arrayList4 = i5 == 0 ? arrayList2 : arrayList3;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList4.size()) {
                            break;
                        }
                        if (cf3.n(((TL_stories.PeerStories) arrayList4.get(i6)).peer) == n) {
                            arrayList4.remove(i6);
                            break;
                        }
                        i6++;
                    }
                    i5++;
                }
                if (n > 0) {
                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(n));
                    if (V1 != null) {
                        if (V1.stories_hidden) {
                            d(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            Z(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-n));
                    if (K0 != null) {
                        if (K0.stories_hidden) {
                            d(peerStories);
                        } else {
                            arrayList3.add(peerStories);
                            Z(peerStories);
                        }
                    }
                }
            }
        }
        if (!z2) {
            ArrayList<TL_stories.PeerStories> arrayList5 = tL_stories_allStories.peer_stories;
            jc jcVar = new jc((byte) 10);
            s2b s2bVar = this.k;
            s2bVar.b.a.c(new hw6(s2bVar, arrayList5, z3, z, jcVar, (byte) 6));
        }
        on7 on7Var = this.K;
        gl.r(on7Var);
        on7Var.run();
    }

    public final void b(int i, long j, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        a(i, j, arrayList);
    }

    public final void b0(TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        long n = cf3.n(tL_updateStory.peer);
        if (n == 0) {
            fa4.b("StoriesController can't update story dialogId == 0");
            return;
        }
        byte b = 14;
        s2b s2bVar = this.k;
        if (n > 0) {
            user = na7.q1(this.a).V1(Long.valueOf(n));
            if (user != null && (N(user) || user.self)) {
                s2bVar.b.a.c(new iya(s2bVar, tL_updateStory, b));
            }
        } else {
            s2bVar.b.a.c(new iya(s2bVar, tL_updateStory, b));
            user = null;
        }
        gl.c3(new mx8((Object) this, n, (TLObject) tL_updateStory, (Object) user, (byte) 10));
    }

    public final void c(long j, f2b f2bVar, vf6 vf6Var, boolean z) {
        ArrayList arrayList = (ArrayList) vf6Var.f(j);
        if (z && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = tb4.s(vf6Var, j);
        }
        arrayList.add(f2bVar);
    }

    public final void c0(long j, TL_stories.PeerStories peerStories) {
        d0(j, peerStories);
        byte b = 1;
        s2b s2bVar = this.k;
        int i = this.a;
        if (j <= 0) {
            if (hc2.j0(na7.q1(i).K0(Long.valueOf(-j)))) {
                s2bVar.b.a.c(new r2b(s2bVar, peerStories, b));
            }
        } else {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            if (N(V1) || V1.self) {
                s2bVar.b.a.c(new r2b(s2bVar, peerStories, b));
            }
        }
    }

    public final void d(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long n = cf3.n(peerStories.peer);
        int i = this.a;
        if (n == y6c.h(i).e()) {
            return;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            arrayList = this.h;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (cf3.n(((TL_stories.PeerStories) arrayList.get(i2)).peer) == n) {
                z = true;
            }
            i2++;
        }
        if (!z) {
            arrayList.add(peerStories);
        }
        na7.q1(i).z();
    }

    public final void d0(long j, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        vf6 vf6Var = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) vf6Var.f(j);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i = 0; i < peerStories.stories.size(); i++) {
                if (peerStories.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                    int i2 = peerStories.stories.get(i).id;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i3).id == i2 && (peerStories2.stories.get(i3) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i, peerStories2.stories.get(i3));
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        vf6Var.k(peerStories, j);
    }

    public final void e0(int i, long j, ArrayList arrayList) {
        u1b A = A(j, true);
        A.getClass();
        g2b g2bVar = A.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i2 = A.a;
        tL_updateAlbum.peer = na7.q1(i2).h1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 != null) {
                arrayList2.remove(Integer.valueOf(i));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        y1b z = g2bVar.z(0, i, A.b, false);
        if (z != null) {
            z.A(arrayList);
        }
        ArrayList arrayList3 = A.h;
        int size3 = arrayList3.size();
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            y1b z2 = g2bVar.z(0, ((z1b) obj3).a, A.b, false);
            if (z2 != null) {
                z2.E(i, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void f(TL_stories.PeerStories peerStories) {
        TLRPC.Chat K0;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        ArrayList arrayList2;
        long n = cf3.n(peerStories.peer);
        TLRPC.User user = null;
        int i = this.a;
        if (n > 0) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(n));
            if (V1 == null) {
                fa4.b("StoriesController can't apply story user == null");
                return;
            } else {
                user = V1;
                K0 = null;
            }
        } else {
            K0 = na7.q1(i).K0(Long.valueOf(-n));
            if (K0 == null) {
                fa4.b("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i2 = 0;
        while (true) {
            arrayList = this.g;
            z = true;
            if (i2 >= arrayList.size()) {
                z2 = false;
                break;
            } else {
                if (cf3.n(((TL_stories.PeerStories) arrayList.get(i2)).peer) == n) {
                    arrayList.remove(i2);
                    z2 = true;
                    break;
                }
                i2++;
            }
        }
        int i3 = 0;
        while (true) {
            arrayList2 = this.h;
            if (i3 >= arrayList2.size()) {
                break;
            }
            if (cf3.n(((TL_stories.PeerStories) arrayList2.get(i3)).peer) == n) {
                arrayList2.remove(i3);
                z2 = true;
                break;
            }
            i3++;
        }
        if ((user == null || !user.stories_hidden) && (K0 == null || !K0.stories_hidden)) {
            z = false;
        }
        if (w01.a) {
            fa4.b("StoriesController move user stories to first hidden=" + z + " did=" + n);
        }
        if (z) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z2) {
            Q(n);
        }
        na7.q1(i).z();
    }

    public final void f0(int i, long j, p8c p8cVar) {
        TL_stories.PeerStories x = x(j);
        if (x != null) {
            for (int i2 = 0; i2 < x.stories.size(); i2++) {
                if (x.stories.get(i2).id == i && !(x.stories.get(i2) instanceof TL_stories.TL_storyItemSkipped)) {
                    p8cVar.a(x.stories.get(i2));
                    return;
                }
            }
        }
        long j2 = (i + j) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j2);
        if (storyItem != null) {
            p8cVar.a(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        int i3 = this.a;
        tL_stories_getStoriesByID.peer = na7.q1(i3).h1(j);
        ConnectionsManager.getInstance(i3).sendRequest(tL_stories_getStoriesByID, new p1b(this, j2, p8cVar));
    }

    public final boolean g(long j) {
        TLRPC.Chat K0;
        if (j >= 0 || (K0 = na7.q1(this.a).K0(Long.valueOf(-j))) == null) {
            return false;
        }
        if (K0.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = K0.admin_rights;
        return tL_chatAdminRights != null && tL_chatAdminRights.edit_stories;
    }

    public final void g0(long j, boolean z) {
        LongSparseIntArray longSparseIntArray = this.j;
        if (z) {
            longSparseIntArray.put(j, 1);
        } else {
            longSparseIntArray.delete(j);
        }
    }

    public final boolean h(long j) {
        return y6c.h(this.a).e() == j || g(j);
    }

    public final void h0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i = this.a;
        kk7.f(i).k(kk7.F5, new Object[0]);
        SharedPreferences.Editor edit = na7.q1(i).X3.edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.f(serializedData.toByteArray())).apply();
    }

    public final boolean i(long j) {
        TLRPC.User V1;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i = this.a;
        if (j >= 0) {
            return j > 0 && (V1 = na7.q1(i).V1(Long.valueOf(j))) != null && V1.bot && V1.bot_can_edit;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
        if (K0 == null || !hc2.R(K0)) {
            return false;
        }
        return K0.creator || ((tL_chatAdminRights = K0.admin_rights) != null && tL_chatAdminRights.post_stories);
    }

    public final void i0(long j, TL_stories.StoryItem storyItem, h19 h19Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.id;
        int i = this.a;
        tL_stories_sendReaction.peer = na7.q1(i).h1(j);
        if (h19Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (h19Var.g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = h19Var.g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (h19Var.f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = h19Var.f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        s0(j, storyItem, false);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendReaction, new ce2((byte) 0));
    }

    public final void j(long j, p8c p8cVar, boolean z, wjb wjbVar) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i = this.a;
        tL_stories_canSendStory.peer = na7.q1(i).h1(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_canSendStory, new js0((Object) this, z, j, (Object) p8cVar, (Object) wjbVar, (byte) 4), 1024);
    }

    public final void k(ArrayList arrayList) {
        int i;
        ArrayList<TL_stories.StoryItem> arrayList2;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int size = arrayList.size();
            i = this.a;
            if (i2 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i2);
            long n = cf3.n(peerStories.peer);
            int i3 = 0;
            while (true) {
                int size2 = peerStories.stories.size();
                arrayList2 = peerStories.stories;
                if (i3 >= size2) {
                    break;
                }
                if (x2b.w(i, arrayList2.get(i3))) {
                    peerStories.stories.remove(i3);
                    i3--;
                }
                i3++;
            }
            if (arrayList2.isEmpty() && !L(n)) {
                this.i.l(n);
                arrayList.remove(peerStories);
                z = true;
            }
            i2++;
        }
        if (z) {
            kk7.f(i).k(kk7.x5, new Object[0]);
        }
    }

    public final void l(TL_stories.PeerStories peerStories) {
        if (peerStories == null || peerStories.stories == null) {
            return;
        }
        int i = 0;
        while (i < peerStories.stories.size()) {
            if (x2b.w(this.a, peerStories.stories.get(i))) {
                peerStories.stories.remove(i);
                i--;
            }
            i++;
        }
        peerStories.checkedExpired = true;
    }

    public final void l0(long j, boolean z, boolean z2) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.g;
        if (z) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        byte b = 0;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                peerStories = null;
                break;
            } else {
                if (cf3.n(((TL_stories.PeerStories) arrayList.get(i)).peer) == j) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i);
                    break;
                }
                i++;
            }
        }
        if (peerStories != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    arrayList2.add(0, peerStories);
                    on7 on7Var = this.K;
                    gl.r(on7Var);
                    on7Var.run();
                    break;
                }
                if (cf3.n(((TL_stories.PeerStories) arrayList2.get(i2)).peer) == j) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i3 = this.a;
        kk7.f(i3).k(kk7.x5, new Object[0]);
        na7.q1(i3).z();
        if (z2) {
            if (j >= 0) {
                TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(j));
                V1.stories_hidden = z;
                ad7.Y(i3).j1(Collections.singletonList(V1), null, false, true);
                na7.q1(i3).a4(V1, false, false);
            } else {
                TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j));
                K0.stories_hidden = z;
                ad7.Y(i3).j1(null, Collections.singletonList(K0), false, true);
                na7.q1(i3).T3(K0, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = na7.q1(i3).h1(j);
            tL_stories_togglePeerStoriesHidden.hidden = z;
            ConnectionsManager.getInstance(i3).sendRequest(tL_stories_togglePeerStoriesHidden, new ce2(b));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(TLRPC.TL_error tL_error) {
        boolean z;
        String str;
        int i = this.a;
        if (tL_error != null && (str = tL_error.text) != null) {
            long j = 0;
            z = true;
            if (str.startsWith("STORY_SEND_FLOOD_WEEKLY_")) {
                try {
                    j = Long.parseLong(tL_error.text.substring(24));
                } catch (Exception unused) {
                }
                this.S = new wx(2, 0, j);
            } else if (tL_error.text.startsWith("STORY_SEND_FLOOD_MONTHLY_")) {
                try {
                    j = Long.parseLong(tL_error.text.substring(25));
                } catch (Exception unused2) {
                }
                this.S = new wx(3, 0, j);
            } else if (tL_error.text.equals("STORIES_TOO_MUCH")) {
                this.S = new wx(1, 0, 0L);
            } else if (tL_error.text.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                na7 q1 = na7.q1(i);
                if ("enabled".equals(q1.R3)) {
                    SharedPreferences.Editor edit = q1.X3.edit();
                    q1.R3 = "premium";
                    edit.putString("storiesPosting", "premium").apply();
                    kk7.f(i).k(kk7.a3, new Object[0]);
                }
            }
            if (z) {
                kk7.f(i).k(kk7.c3, new Object[0]);
            }
            return z;
        }
        z = false;
        if (z) {
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0(long j, boolean z, boolean z2) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i = this.a;
        TLRPC.InputPeer h1 = na7.q1(i).h1(j);
        if (h1 instanceof TLRPC.TL_inputPeerEmpty) {
            return;
        }
        this.M.k(Boolean.valueOf(z), j);
        Long valueOf = Long.valueOf(j);
        HashSet hashSet = this.L;
        if (hashSet.contains(valueOf) != z) {
            if (z) {
                hashSet.add(Long.valueOf(j));
                this.N++;
            } else {
                hashSet.remove(Long.valueOf(j));
                this.N--;
            }
        }
        if (z2) {
            if (z) {
                TLRPC.TL_contacts_block tL_contacts_block = new TLRPC.TL_contacts_block();
                tL_contacts_block.my_stories_from = true;
                tL_contacts_block.id = h1;
                tL_contacts_unblock = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock2.my_stories_from = true;
                tL_contacts_unblock2.id = h1;
                tL_contacts_unblock = tL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(i).sendRequest(tL_contacts_unblock, null);
        }
        kk7.f(i).k(kk7.b3, new Object[0]);
    }

    public final wx n() {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i = this.a;
        int f = y6c.h(i).p() ? na7.q1(i).k4.w1.f() : na7.q1(i).k4.v1.f();
        ArrayList arrayList2 = (ArrayList) this.c.f(y6c.h(i).e());
        int size = arrayList2 == null ? 0 : arrayList2.size();
        TL_stories.PeerStories x = x(y6c.h(i).e());
        if (x != null && (arrayList = x.stories) != null) {
            size += arrayList.size();
        }
        if (size >= f) {
            return new wx(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = na7.q1(i).h1(y6c.h(i).e());
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_canSendStory, new i1b(this, (byte) 5), 1024);
        return null;
    }

    public final void n0(long j, List list) {
        ArrayList arrayList;
        StringBuilder o = ug8.o(j, "updateDeletedStoriesInLists ", " storyItems[");
        o.append(list.size());
        o.append("] {");
        o.append(j0(list));
        o.append("}");
        fa4.b(o.toString());
        y1b z = z(0, -1, j, false);
        y1b z2 = z(1, -1, j, false);
        if (z != null) {
            z.A(list);
        }
        if (z2 != null) {
            z2.A(list);
        }
        int i = 0;
        u1b A = A(j, false);
        if (A == null || (arrayList = A.h) == null) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y1b z3 = z(0, ((z1b) obj).a, j, false);
            if (z3 != null) {
                z3.A(list);
            }
        }
    }

    public final void o(int i, long j) {
        String str = "234:" + j + ":" + i;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i2 = this.a;
        tL_stories_getStoriesByID.peer = na7.q1(i2).h1(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(i2).sendRequest(tL_stories_getStoriesByID, new mg((Object) this, i, (Object) str, j, (byte) 7));
    }

    public final void o0(long j, List list, boolean z) {
        TL_stories.PeerStories peerStories;
        boolean z2;
        int i = this.a;
        if (j > 0) {
            TLRPC.UserFull W1 = na7.q1(i).W1(j);
            if (W1 == null) {
                return;
            }
            if (W1.stories == null) {
                if (!z) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                W1.stories = tL_peerStories;
                tL_peerStories.peer = na7.q1(i).w1(j);
                W1.stories.max_read_id = w(j);
            }
            peerStories = W1.stories;
        } else {
            TLRPC.ChatFull L0 = na7.q1(i).L0(-j);
            if (L0 == null) {
                return;
            }
            if (L0.stories == null) {
                if (!z) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                L0.stories = tL_peerStories2;
                tL_peerStories2.peer = na7.q1(i).w1(j);
                L0.stories.max_read_id = w(j);
            }
            peerStories = L0.stories;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= peerStories.stories.size()) {
                    z2 = false;
                    break;
                }
                if (peerStories.stories.get(i3).id == storyItem.id) {
                    boolean z3 = storyItem instanceof TL_stories.TL_storyItemDeleted;
                    ArrayList<TL_stories.StoryItem> arrayList = peerStories.stories;
                    z2 = true;
                    if (z3) {
                        arrayList.remove(i3);
                    } else {
                        TL_stories.StoryItem storyItem2 = arrayList.get(i3);
                        storyItem = e(storyItem2, storyItem);
                        peerStories.stories.set(i3, storyItem);
                        if (storyItem.attachPath == null) {
                            storyItem.attachPath = storyItem2.attachPath;
                        }
                        if (storyItem.firstFramePath == null) {
                            storyItem.firstFramePath = storyItem2.firstFramePath;
                        }
                        b00.p(storyItem.id, new StringBuilder("StoriesController update story for full peer storyId="));
                    }
                } else {
                    i3++;
                }
            }
            if (!z2) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    b00.p(storyItem.id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z) {
                    b00.p(storyItem.id, new StringBuilder("StoriesController add new story for full peer storyId="));
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void p() {
        byte b = 0;
        this.s = false;
        this.y = "";
        this.o = "";
        this.l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        jq3 jq3Var = this.w;
        Objects.requireNonNull(jq3Var);
        gl.c3(new kya((Object) jq3Var, (byte) 4));
        V();
        if (this.s) {
            return;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new i1b(this, b));
    }

    public final void p0(long j, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories == null || (peerStories2 = (TL_stories.PeerStories) this.i.f(j)) == null) {
            return;
        }
        fa4.b("StoriesController update stories from full peer " + j);
        for (int i = 0; i < peerStories2.stories.size(); i++) {
            if (peerStories2.stories.get(i) instanceof TL_stories.TL_storyItemSkipped) {
                int i2 = peerStories2.stories.get(i).id;
                int i3 = 0;
                while (true) {
                    if (i3 >= peerStories.stories.size()) {
                        break;
                    }
                    if (peerStories.stories.get(i3).id == i2 && (peerStories.stories.get(i3) instanceof TL_stories.TL_storyItem)) {
                        peerStories2.stories.set(i, peerStories.stories.get(i3));
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    public final void q(long j, String str, p8c p8cVar) {
        u1b A = A(j, true);
        int i = A.a;
        if (A.i) {
            return;
        }
        A.i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = na7.q1(i).h1(A.b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_createAlbum, new apa(A, p8cVar, (byte) 9));
    }

    public final void q0(long j, List list, boolean z) {
        ArrayList arrayList;
        StringBuilder o = ug8.o(j, "updateStoriesInLists ", " storyItems[");
        o.append(list.size());
        o.append("] {");
        o.append(j0(list));
        o.append("}");
        fa4.b(o.toString());
        y1b z2 = z(0, -1, j, false);
        y1b z3 = z(1, -1, j, false);
        if (z2 != null) {
            z2.D(list, z);
        }
        if (z3 != null) {
            z3.D(list, z);
        }
        ArrayList arrayList2 = this.I;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((t1b) obj).D(list, z);
        }
        u1b A = A(j, false);
        if (A == null || (arrayList = A.h) == null) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            y1b z4 = z(0, ((z1b) obj2).a, j, false);
            if (z4 != null) {
                z4.D(list, z);
            }
        }
    }

    public final void r(ArrayList arrayList, long j) {
        TLRPC.ChatFull L0;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull W1;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i = this.a;
        tL_stories_deleteStories.peer = na7.q1(i).h1(j);
        vf6 vf6Var = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) vf6Var.f(j);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i3).id == storyItem.id) {
                            peerStories2.stories.remove(i3);
                            if (peerStories2.stories.isEmpty()) {
                                vf6Var.l(j);
                            }
                        } else {
                            i3++;
                        }
                    }
                }
                tL_stories_deleteStories.id.add(Integer.valueOf(storyItem.id));
            }
        }
        if (j < 0 ? !((L0 = na7.q1(i).L0(-j)) == null || (peerStories = L0.stories) == null) : !((W1 = na7.q1(i).W1(j)) == null || (peerStories = W1.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i4);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i5 = 0;
                while (true) {
                    if (i5 >= peerStories2.stories.size()) {
                        break;
                    }
                    if (peerStories2.stories.get(i5).id == storyItem2.id) {
                        peerStories2.stories.remove(i5);
                        break;
                    }
                    i5++;
                }
            }
        }
        ConnectionsManager.getInstance(i).sendRequest(tL_stories_deleteStories, new i1b(this, (byte) 3));
        n0(j, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.id;
        s2b s2bVar = this.k;
        s2bVar.b.a.c(new d2b((Object) s2bVar, (Object) arrayList2, j, (byte) 2));
        kk7.f(i).k(kk7.x5, new Object[0]);
    }

    public final void r0(long j, ArrayList arrayList, boolean z, gv1 gv1Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories x = x(j);
        for (int i = 0; i < arrayList.size(); i++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z;
                togglepinned.id.add(Integer.valueOf(storyItem.id));
                if (x != null) {
                    for (int i2 = 0; i2 < x.stories.size(); i2++) {
                        if (x.stories.get(i2).id == storyItem.id) {
                            x.stories.get(i2).pinned = z;
                            this.k.k(j, storyItem);
                        }
                    }
                }
            }
        }
        fa4.b("StoriesController updateStoriesPinned");
        q0(j, arrayList, false);
        o0(j, arrayList, false);
        togglepinned.pinned = z;
        int i3 = this.a;
        togglepinned.peer = na7.q1(i3).h1(j);
        ConnectionsManager.getInstance(i3).sendRequest(togglepinned, new wx9(gv1Var, (byte) 7));
    }

    public final f2b s(long j, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.e.f(j);
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        return (f2b) hashMap.get(Integer.valueOf(storyItem.id));
    }

    public final void s0(long j, TL_stories.StoryItem storyItem, boolean z) {
        String str;
        StringBuilder o = ug8.o(j, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = "null";
        } else {
            str = storyItem.id + "@" + storyItem.dialogId;
        }
        o.append(str);
        fa4.b(o.toString());
        q0(j, Collections.singletonList(storyItem), z);
        this.k.k(j, storyItem);
        o0(j, Collections.singletonList(storyItem), false);
    }

    public final TL_stories.StoryItem t(int i, long j) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j);
        if (peerStories == null) {
            return null;
        }
        for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
            if (peerStories.stories.get(i2).id == i) {
                return peerStories.stories.get(i2);
            }
        }
        return null;
    }

    public final void t0(long j, int i, TLRPC.Reaction reaction) {
        TL_stories.StoryItem t = t(i, j);
        if (t != null) {
            t.sent_reaction = reaction;
            int i2 = t.flags;
            if (reaction != null) {
                t.flags = i2 | 32768;
            } else {
                t.flags = i2 & (-32769);
            }
            s0(j, t, false);
        }
    }

    public final void u(ArrayList arrayList) {
        boolean z;
        TLRPC.User V1;
        int i = 0;
        while (i < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i);
            long n = cf3.n(peerStories.peer);
            if (n <= 0 || (V1 = na7.q1(this.a).V1(Long.valueOf(n))) == null || N(V1)) {
                z = false;
            } else {
                arrayList.remove(i);
                i--;
                z = true;
            }
            int i2 = 0;
            while (i2 < peerStories.stories.size()) {
                if (peerStories.stories.get(i2) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i2);
                    i2--;
                }
                i2++;
            }
            if (!z && peerStories.stories.isEmpty() && !L(n)) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
    }

    public final String v(int i, long j) {
        z1b b;
        u1b A = A(j, false);
        if (A == null || (b = A.b(i)) == null) {
            return null;
        }
        return b.b;
    }

    public final int w(long j) {
        TL_stories.PeerStories x = x(j);
        if (x == null) {
            x = y(j);
        }
        return x != null ? Math.max(x.max_read_id, this.f.get(j, 0)) : this.f.get(j, 0);
    }

    public final TL_stories.PeerStories x(long j) {
        return (TL_stories.PeerStories) this.i.f(j);
    }

    public final TL_stories.PeerStories y(long j) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i = this.a;
        if (j > 0) {
            TLRPC.UserFull W1 = na7.q1(i).W1(j);
            if (W1 != null && (peerStories2 = W1.stories) != null && !peerStories2.checkedExpired) {
                l(peerStories2);
            }
            if (W1 == null) {
                return null;
            }
            return W1.stories;
        }
        TLRPC.ChatFull L0 = na7.q1(i).L0(-j);
        if (L0 != null && (peerStories = L0.stories) != null && !peerStories.checkedExpired) {
            l(peerStories);
        }
        if (L0 == null) {
            return null;
        }
        return L0.stories;
    }

    public final y1b z(int i, int i2, long j, boolean z) {
        byte b = 2;
        if (i == 0 && i2 > 0) {
            Long valueOf = Long.valueOf(j);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            y1b y1bVar = (y1b) hashMap3.get(Integer.valueOf(i2));
            if (y1bVar != null || !z) {
                return y1bVar;
            }
            y1b y1bVar2 = new y1b(this.a, j, i, i2, new l1b(this, b));
            hashMap3.put(Integer.valueOf(i2), y1bVar2);
            return y1bVar2;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i] == null) {
            hashMapArr[i] = new HashMap();
        }
        y1b y1bVar3 = (y1b) hashMapArr[i].get(Long.valueOf(j));
        if (y1bVar3 != null || !z) {
            return y1bVar3;
        }
        if (i == 4) {
            HashMap hashMap4 = hashMapArr[i];
            Long valueOf2 = Long.valueOf(j);
            s1b s1bVar = new s1b(this.a, j, null, new l1b(this, b));
            hashMap4.put(valueOf2, s1bVar);
            return s1bVar;
        }
        HashMap hashMap5 = hashMapArr[i];
        Long valueOf3 = Long.valueOf(j);
        y1b y1bVar4 = new y1b(this.a, j, i, i2, new l1b(this, b));
        hashMap5.put(valueOf3, y1bVar4);
        return y1bVar4;
    }
}
