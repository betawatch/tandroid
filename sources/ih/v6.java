package ih;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v6 {
    public static final Comparator X = Comparator$-CC.comparingInt(new ff.d(8));
    public TL_stories.TL_storiesStealthMode B;
    public final bg.c2 K;
    public int N;
    public boolean R;
    public p6 S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int a;
    public final i7 k;
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
    public final kh.b1 w;
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
    public final bg.l0 J = new bg.l0(this, 2);
    public final HashSet L = new HashSet();
    public final a0.h M = new a0.h();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public v6(int i9) {
        this.o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.a = i9;
        i7 i7Var = new i7();
        i7Var.a = i9;
        i7Var.b = MessagesStorage.getInstance(i9);
        this.k = i7Var;
        SharedPreferences mainSettings = MessagesController.getInstance(i9).getMainSettings();
        this.l = mainSettings;
        this.o = mainSettings.getString("last_stories_state", "");
        this.y = mainSettings.getString("last_stories_state_hidden", "");
        this.v = mainSettings.getInt("total_stores_hidden", 0);
        this.u = mainSettings.getInt("total_stores", 0);
        this.s = mainSettings.getBoolean("read_loaded", false);
        this.t = new HashSet(mainSettings.getStringSet("unsupported_stories_checked", new HashSet()));
        TL_stories.TL_storiesStealthMode tL_storiesStealthMode = null;
        String string = mainSettings.getString("stories_stealth_mode", null);
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                tL_storiesStealthMode = TL_stories.TL_storiesStealthMode.TLdeserialize(serializedData, serializedData.readInt32(true), true);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.B = tL_storiesStealthMode;
        i7 i7Var2 = this.k;
        i7Var2.b.getStorageQueue().postRunnable(new h3.g0(26, i7Var2, new y5(this, 0)));
        this.K = new bg.c2(this, i9, 6);
        this.w = new kh.b1(i9);
    }

    public static String a(ArrayList arrayList) {
        String str = "";
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            try {
                if (i9 > 0) {
                    str = str + ", ";
                }
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList.get(i9)).storyItem;
                str = storyItem == null ? str + BuildConfig.BETA_URL : str + storyItem.id + "@" + storyItem.dialogId;
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
        int i9 = storyItem2.date;
        if (i9 != 0) {
            storyItem.date = i9;
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

    public static String h0(List list) {
        if (list == null) {
            return BuildConfig.BETA_URL;
        }
        String str = "";
        for (int i9 = 0; i9 < list.size(); i9++) {
            try {
                if (i9 > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i9)).id + "@" + ((TL_stories.StoryItem) list.get(i9)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final n6 A(long j10, int i9, int i10, boolean z10) {
        if (i9 == 0 && i10 > 0) {
            Long valueOf = Long.valueOf(j10);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j10), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            n6 n6Var = (n6) hashMap3.get(Integer.valueOf(i10));
            if (n6Var != null || !z10) {
                return n6Var;
            }
            n6 n6Var2 = new n6(this.a, j10, i9, i10, new bg.i(this, 20));
            hashMap3.put(Integer.valueOf(i10), n6Var2);
            return n6Var2;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i9] == null) {
            hashMapArr[i9] = new HashMap();
        }
        n6 n6Var3 = (n6) hashMapArr[i9].get(Long.valueOf(j10));
        if (n6Var3 != null || !z10) {
            return n6Var3;
        }
        if (i9 == 4) {
            HashMap hashMap4 = hashMapArr[i9];
            Long valueOf2 = Long.valueOf(j10);
            f6 f6Var = new f6(this.a, j10, null, new bg.i(this, 20));
            hashMap4.put(valueOf2, f6Var);
            return f6Var;
        }
        HashMap hashMap5 = hashMapArr[i9];
        Long valueOf3 = Long.valueOf(j10);
        n6 n6Var4 = new n6(this.a, j10, i9, i10, new bg.i(this, 20));
        hashMap5.put(valueOf3, n6Var4);
        return n6Var4;
    }

    public final j6 B(long j10, boolean z10) {
        a0.h hVar = this.F;
        j6 j6Var = (j6) hVar.f(j10);
        if (j6Var != null || !z10) {
            return j6Var;
        }
        j6 j6Var2 = new j6(this.a, j10, this);
        hVar.k(j6Var2, j10);
        return j6Var2;
    }

    public final int C(boolean z10) {
        return z10 ? this.z ? Math.max(1, this.v) : this.h.size() : this.p ? Math.max(1, this.u) : this.g.size();
    }

    public final int D(int i9, long j10) {
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
        if (j10 == UserConfig.getInstance(this.a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.b.f(j10))) {
            return 1;
        }
        int max = Math.max(peerStories.max_read_id, this.f.get(j10, 0));
        boolean z10 = false;
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            if (peerStories.stories.get(i10).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i9 == 0 || peerStories.stories.get(i10).id == i9) && peerStories.stories.get(i10).id > max) {
                if (peerStories.stories.get(i10).close_friends) {
                    return 2;
                }
                z10 = true;
            }
        }
        return (!N(j10) && z10) ? 1 : 0;
    }

    public final ArrayList E(long j10) {
        return (ArrayList) this.b.f(j10);
    }

    public final boolean F(long j10) {
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

    public final boolean G() {
        if (H()) {
            ArrayList arrayList = this.g;
            if (arrayList.isEmpty() || (arrayList.size() == 1 && DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer) == UserConfig.getInstance(this.a).clientUserId)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        long j10 = UserConfig.getInstance(this.a).clientUserId;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        return ((peerStories == null || peerStories.stories.isEmpty()) && Utilities.isNullOrEmpty((Collection) this.b.f(j10))) ? false : true;
    }

    public final boolean I(long j10) {
        if (j10 == 0) {
            return false;
        }
        if (K(j10) || N(j10)) {
            return true;
        }
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        return (peerStories == null || peerStories.stories.isEmpty()) ? false : true;
    }

    public final boolean J(long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            peerStories = z(j10);
        }
        if (peerStories == null) {
            return false;
        }
        if (j10 == UserConfig.getInstance(this.a).getClientUserId() && !Utilities.isNullOrEmpty((Collection) this.b.f(j10))) {
            return true;
        }
        for (int i9 = 0; i9 < peerStories.stories.size(); i9++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i9);
            if (storyItem != null && storyItem.id > peerStories.max_read_id) {
                return true;
            }
        }
        return false;
    }

    public final boolean K(long j10) {
        ArrayList arrayList = (ArrayList) this.b.f(j10);
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (arrayList == null || arrayList.isEmpty()) {
            return (hashMap == null || hashMap.isEmpty()) ? false : true;
        }
        return true;
    }

    public final boolean L(TL_stories.StoryView storyView) {
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

    public final boolean M(TLRPC.User user) {
        if (user != null) {
            return user.contact || user.id == MessagesController.getInstance(this.a).storiesChangelogUserId;
        }
        return false;
    }

    public final boolean N(long j10) {
        ArrayList arrayList = (ArrayList) this.b.f(j10);
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return ((u6) j3.r0.j(1, arrayList)).E;
    }

    public final void O(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = this.C;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(Long.valueOf(j10));
        FileLog.d("StoriesController loadAllStoriesForDialog " + j10);
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        int i9 = this.a;
        tL_stories_getPeerStories.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        ConnectionsManager.getInstance(i9).sendRequest(tL_stories_getPeerStories, new v5(this, j10, 0));
    }

    public final void P() {
        if (this.P || this.O) {
            return;
        }
        this.P = true;
        TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = new TLRPC.TL_contacts_getBlocked();
        tL_contacts_getBlocked.my_stories_from = true;
        tL_contacts_getBlocked.offset = this.L.size();
        tL_contacts_getBlocked.limit = 25;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_getBlocked, new t5(this, 3));
    }

    public final void Q(boolean z10) {
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getAllStories, new b6(this, z10, tL_stories_getAllStories, z11));
        }
    }

    public final void R() {
        if (this.U || this.V) {
            return;
        }
        this.U = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new t5(this, 2));
    }

    public final void S(final TL_stories.PeerStories peerStories, final boolean z10) {
        if (peerStories == null) {
            return;
        }
        final long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        final long j10 = peerDialogId * (z10 ? -1 : 1);
        Long valueOf = Long.valueOf(j10);
        HashSet hashSet = this.D;
        if (hashSet.contains(valueOf)) {
            return;
        }
        ArrayList<Integer> arrayList = null;
        for (int i9 = 0; i9 < peerStories.stories.size(); i9++) {
            if (peerStories.stories.get(i9) instanceof TL_stories.TL_storyItemSkipped) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(Integer.valueOf(peerStories.stories.get(i9).id));
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
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i10).getInputPeer(peerDialogId);
            ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: ih.w5
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new a6(v6.this, j10, z10, peerStories, peerDialogId, tLObject));
                }
            });
        }
    }

    public final void T() {
        if (this.A) {
            this.n = true;
            y5 y5Var = new y5(this, 1);
            i7 i7Var = this.k;
            i7Var.b.getStorageQueue().postRunnable(new h3.g0(27, i7Var, y5Var));
        } else {
            Q(false);
            Q(true);
        }
        this.A = false;
    }

    public final void U(int i9, long j10) {
        AndroidUtilities.runOnUIThread(new gh.e9(this, j10, i9, 1));
    }

    public final boolean V(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z10) {
        if (storyItem != null && peerStories != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i9 = this.f.get(peerDialogId);
            int max = Math.max(peerStories.max_read_id, Math.max(i9, storyItem.id));
            int i10 = this.a;
            NotificationsController.getInstance(i10).processReadStories(peerDialogId, max);
            peerStories.max_read_id = max;
            this.f.put(peerDialogId, max);
            if (max > i9) {
                if (!z10) {
                    this.k.i(max, peerDialogId);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = MessagesController.getInstance(i10).getInputPeer(peerDialogId);
                tL_stories_readStories.max_id = storyItem.id;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stories_readStories, null);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
                return true;
            }
        }
        return false;
    }

    public final void W(long j10, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem.attachPath != null) {
            return;
        }
        int i9 = this.a;
        if (DownloadController.getInstance(i9).canPreloadStories()) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            boolean z10 = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
            storyItem.dialogId = j10;
            if (z10) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                FileLoader.getInstance(i9).loadFile(storyItem.media.getDocument(), storyItem, 0, 1);
                FileLoader.getInstance(i9).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
            } else {
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                TLRPC.Photo photo = messageMedia2 == null ? null : messageMedia2.photo;
                if (photo != null && (arrayList = photo.sizes) != null) {
                    FileLoader.getInstance(i9).loadFile(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), photo), storyItem, "jpg", 0, 1);
                }
            }
            if (storyItem.media_areas != null) {
                for (int i10 = 0; i10 < Math.min(2, storyItem.media_areas.size()); i10++) {
                    if (storyItem.media_areas.get(i10) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        hg.r0 d = hg.r0.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i10)).reaction);
                        if (d.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i9).getReactionsMap().get(d.f);
                            if (tL_availableReaction != null) {
                                FileLoader.getInstance(i9).loadFile(tL_availableReaction.select_animation, d, 0, 0);
                            }
                        } else {
                            org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(1, i9, d.g);
                            k5Var.m = true;
                            k5Var.v();
                        }
                    }
                }
            }
        }
    }

    public final void X(TL_stories.PeerStories peerStories) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= peerStories.stories.size()) {
                break;
            }
            if (peerStories.stories.get(i10).id > peerStories.max_read_id) {
                i9 = i10;
                break;
            }
            i10++;
        }
        if (peerStories.stories.isEmpty()) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        W(peerDialogId, peerStories.stories.get(i9));
        if (i9 > 0) {
            W(peerDialogId, peerStories.stories.get(i9 - 1));
        }
        if (i9 < peerStories.stories.size() - 1) {
            W(peerDialogId, peerStories.stories.get(i9 + 1));
        }
    }

    public final void Y(TL_stories.TL_stories_allStories tL_stories_allStories, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.g;
        if (!z12) {
            if (z10) {
                arrayList.clear();
            } else {
                arrayList2.clear();
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder();
            for (int i9 = 0; i9 < tL_stories_allStories.peer_stories.size(); i9++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getPeerDialogId(tL_stories_allStories.peer_stories.get(i9).peer));
            }
            FileLog.d("StoriesController cache=" + z11 + " hidden=" + z10 + " processAllStoriesResponse {" + ((Object) sb2) + "}");
        }
        int i10 = this.a;
        MessagesController.getInstance(i10).putUsers(tL_stories_allStories.users, z11);
        MessagesController.getInstance(i10).putChats(tL_stories_allStories.chats, z11);
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        for (int i11 = 0; i11 < tL_stories_allStories.peer_stories.size(); i11++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i11);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i12);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    NotificationsController.getInstance(i10).processDeleteStory(peerDialogId, storyItem.id);
                    peerStories.stories.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (peerStories.stories.isEmpty()) {
                this.i.l(peerDialogId);
            } else {
                b0(peerDialogId, peerStories);
                int i13 = 0;
                while (i13 < 2) {
                    ArrayList arrayList3 = i13 == 0 ? arrayList : arrayList2;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList3.size()) {
                            break;
                        }
                        if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList3.get(i14)).peer) == peerDialogId) {
                            arrayList3.remove(i14);
                            break;
                        }
                        i14++;
                    }
                    i13++;
                }
                if (peerDialogId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                    if (user != null) {
                        if (user.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList2.add(peerStories);
                            X(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
                    if (chat != null) {
                        if (chat.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList2.add(peerStories);
                            X(peerStories);
                        }
                    }
                }
            }
        }
        if (!z11) {
            ArrayList<TL_stories.PeerStories> arrayList4 = tL_stories_allStories.peer_stories;
            bg.d2 d2Var = new bg.d2(13);
            i7 i7Var = this.k;
            i7Var.b.getStorageQueue().postRunnable(new u5(i7Var, arrayList4, z12, z10, d2Var, 1));
        }
        bg.c2 c2Var = this.K;
        AndroidUtilities.cancelRunOnUIThread(c2Var);
        c2Var.run();
    }

    public final void Z(TL_stories.TL_updateStory tL_updateStory) {
        TLRPC.User user;
        if (tL_updateStory.story == null) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStory.peer);
        if (peerDialogId == 0) {
            FileLog.d("StoriesController can't update story dialogId == 0");
            return;
        }
        i7 i7Var = this.k;
        if (peerDialogId > 0) {
            user = MessagesController.getInstance(this.a).getUser(Long.valueOf(peerDialogId));
            if (user != null && (M(user) || user.self)) {
                i7Var.b.getStorageQueue().postRunnable(new h3.g0(25, i7Var, tL_updateStory));
            }
        } else {
            i7Var.b.getStorageQueue().postRunnable(new h3.g0(25, i7Var, tL_updateStory));
            user = null;
        }
        AndroidUtilities.runOnUIThread(new gh.e2(this, peerDialogId, tL_updateStory, user, 8));
    }

    public final void a0(long j10, TL_stories.PeerStories peerStories) {
        b0(j10, peerStories);
        i7 i7Var = this.k;
        int i9 = this.a;
        if (j10 <= 0) {
            if (ChatObject.isInChat(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)))) {
                i7Var.b.getStorageQueue().postRunnable(new f7(i7Var, peerStories, 0));
            }
        } else {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            if (M(user) || user.self) {
                i7Var.b.getStorageQueue().postRunnable(new f7(i7Var, peerStories, 0));
            }
        }
    }

    public final void b(int i9, long j10, ArrayList arrayList) {
        j6 B = B(j10, true);
        B.getClass();
        v6 v6Var = B.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i10 = B.a;
        tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.b);
        tL_updateAlbum.album_id = i9;
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
                arrayList3.add(Integer.valueOf(i9));
            } else if (!arrayList2.contains(Integer.valueOf(i9))) {
                storyItem.albums.add(Integer.valueOf(i9));
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        n6 A = v6Var.A(B.b, 0, i9, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList4.get(i13);
            i13++;
            n6 A2 = v6Var.A(B.b, 0, ((o6) obj3).a, false);
            if (A2 != null) {
                A2.E(i9, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(long j10, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.h hVar = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i9 = 0; i9 < peerStories.stories.size(); i9++) {
                if (peerStories.stories.get(i9) instanceof TL_stories.TL_storyItemSkipped) {
                    int i10 = peerStories.stories.get(i9).id;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i11).id == i10 && (peerStories2.stories.get(i11) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i9, peerStories2.stories.get(i11));
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        hVar.k(peerStories, j10);
    }

    public final void c(int i9, long j10, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        b(i9, j10, arrayList);
    }

    public final void c0(int i9, long j10, ArrayList arrayList) {
        j6 B = B(j10, true);
        B.getClass();
        v6 v6Var = B.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i10 = B.a;
        tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.b);
        tL_updateAlbum.album_id = i9;
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
                arrayList2.remove(Integer.valueOf(i9));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        n6 A = v6Var.A(B.b, 0, i9, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            n6 A2 = v6Var.A(B.b, 0, ((o6) obj3).a, false);
            if (A2 != null) {
                A2.E(i9, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void d(long j10, u6 u6Var, a0.h hVar, boolean z10) {
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (z10 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.l0.j(j10, hVar);
        }
        arrayList.add(u6Var);
    }

    public final void d0(long j10, int i9, d5.d dVar) {
        TL_stories.PeerStories y10 = y(j10);
        if (y10 != null) {
            for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                if (y10.stories.get(i10).id == i9 && !(y10.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped)) {
                    dVar.accept(y10.stories.get(i10));
                    return;
                }
            }
        }
        long j11 = (i9 + j10) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j11);
        if (storyItem != null) {
            dVar.accept(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i9));
        int i11 = this.a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new d6(this, j11, dVar));
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i9 = this.a;
        if (peerDialogId == UserConfig.getInstance(i9).getClientUserId()) {
            return;
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer) == peerDialogId) {
                z10 = true;
            }
            i10++;
        }
        if (!z10) {
            arrayList.add(peerStories);
        }
        MessagesController.getInstance(i9).checkArchiveFolder();
    }

    public final void e0(long j10, boolean z10) {
        LongSparseIntArray longSparseIntArray = this.j;
        if (z10) {
            longSparseIntArray.put(j10, 1);
        } else {
            longSparseIntArray.delete(j10);
        }
    }

    public final void f0(TL_stories.TL_storiesStealthMode tL_storiesStealthMode) {
        this.B = tL_storiesStealthMode;
        int i9 = this.a;
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stealthModeChanged, new Object[0]);
        SharedPreferences.Editor edit = MessagesController.getInstance(i9).getMainSettings().edit();
        if (tL_storiesStealthMode == null) {
            edit.remove("stories_stealth_mode").apply();
            return;
        }
        SerializedData serializedData = new SerializedData(tL_storiesStealthMode.getObjectSize());
        tL_storiesStealthMode.serializeToStream(serializedData);
        edit.putString("stories_stealth_mode", Utilities.bytesToHex(serializedData.toByteArray())).apply();
    }

    public final void g(TL_stories.PeerStories peerStories) {
        TLRPC.Chat chat;
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        ArrayList arrayList2;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i9 = this.a;
        TLRPC.User user = null;
        if (peerDialogId > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
            if (user2 == null) {
                FileLog.d("StoriesController can't apply story user == null");
                return;
            } else {
                user = user2;
                chat = null;
            }
        } else {
            chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
            if (chat == null) {
                FileLog.d("StoriesController can't apply story chat == null");
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
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer) == peerDialogId) {
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
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i11)).peer) == peerDialogId) {
                arrayList2.remove(i11);
                z11 = true;
                break;
            }
            i11++;
        }
        if ((user == null || !user.stories_hidden) && (chat == null || !chat.stories_hidden)) {
            z10 = false;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("StoriesController move user stories to first hidden=" + z10 + " did=" + peerDialogId);
        }
        if (z10) {
            arrayList2.add(0, peerStories);
        } else {
            arrayList.add(0, peerStories);
        }
        if (!z11) {
            O(peerDialogId);
        }
        MessagesController.getInstance(i9).checkArchiveFolder();
    }

    public final void g0(long j10, TL_stories.StoryItem storyItem, hg.r0 r0Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.id;
        int i9 = this.a;
        tL_stories_sendReaction.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        if (r0Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (r0Var.g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = r0Var.g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (r0Var.f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = r0Var.f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        p0(j10, storyItem, false);
        ConnectionsManager.getInstance(i9).sendRequest(tL_stories_sendReaction, new q5(1));
    }

    public final boolean h(long j10) {
        TLRPC.Chat chat;
        if (j10 >= 0 || (chat = MessagesController.getInstance(this.a).getChat(Long.valueOf(-j10))) == null) {
            return false;
        }
        if (chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        return tL_chatAdminRights != null && tL_chatAdminRights.edit_stories;
    }

    public final boolean i(long j10) {
        return UserConfig.getInstance(this.a).getClientUserId() == j10 || h(j10);
    }

    public final void i0(long j10, boolean z10, boolean z11) {
        TL_stories.PeerStories peerStories;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.g;
        if (z10) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        }
        int i9 = 0;
        while (true) {
            if (i9 >= arrayList.size()) {
                peerStories = null;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i9)).peer) == j10) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i9);
                    break;
                }
                i9++;
            }
        }
        if (peerStories != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList2.size()) {
                    arrayList2.add(0, peerStories);
                    bg.c2 c2Var = this.K;
                    AndroidUtilities.cancelRunOnUIThread(c2Var);
                    c2Var.run();
                    break;
                }
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i10)).peer) == j10) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        int i11 = this.a;
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        MessagesController.getInstance(i11).checkArchiveFolder();
        if (z11) {
            if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(j10));
                user.stories_hidden = z10;
                MessagesStorage.getInstance(i11).putUsersAndChats(Collections.singletonList(user), null, false, true);
                MessagesController.getInstance(i11).putUser(user, false);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-j10));
                chat.stories_hidden = z10;
                MessagesStorage.getInstance(i11).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                MessagesController.getInstance(i11).putChat(chat, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_stories_togglePeerStoriesHidden.hidden = z10;
            ConnectionsManager.getInstance(i11).sendRequest(tL_stories_togglePeerStoriesHidden, new q5(1));
        }
    }

    public final boolean j(long j10) {
        TLRPC.User user;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i9 = this.a;
        if (j10 >= 0) {
            return j10 > 0 && (user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10))) != null && user.bot && user.bot_can_edit;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        if (chat == null || !ChatObject.isBoostSupported(chat)) {
            return false;
        }
        return chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_stories);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(long j10, boolean z10, boolean z11) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i9 = this.a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i9).getInputPeer(j10);
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerEmpty)) {
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
                tL_contacts_block.id = inputPeer;
                tL_contacts_unblock = tL_contacts_block;
            } else {
                TLRPC.TL_contacts_unblock tL_contacts_unblock2 = new TLRPC.TL_contacts_unblock();
                tL_contacts_unblock2.my_stories_from = true;
                tL_contacts_unblock2.id = inputPeer;
                tL_contacts_unblock = tL_contacts_unblock2;
            }
            ConnectionsManager.getInstance(i9).sendRequest(tL_contacts_unblock, null);
        }
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
    }

    public final void k(long j10, d5.d dVar, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i9 = this.a;
        tL_stories_canSendStory.peer = MessagesController.getInstance(i9).getInputPeer(j10);
        ConnectionsManager.getInstance(i9).sendRequest(tL_stories_canSendStory, new gh.e(this, z10, j10, dVar, b6Var), 1024);
    }

    public final void k0(long j10, List list) {
        ArrayList arrayList;
        StringBuilder s10 = aa.d.s(j10, "updateDeletedStoriesInLists ", " storyItems[");
        s10.append(list.size());
        s10.append("] {");
        s10.append(h0(list));
        s10.append("}");
        FileLog.d(s10.toString());
        n6 A = A(j10, 0, -1, false);
        v6 v6Var = this;
        n6 A2 = v6Var.A(j10, 1, -1, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i9 = 0;
        j6 B = B(j10, false);
        if (B == null || (arrayList = B.h) == null) {
            return;
        }
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            n6 A3 = v6Var.A(j10, 0, ((o6) obj).a, false);
            if (A3 != null) {
                A3.A(list);
            }
            v6Var = this;
        }
    }

    public final void l(ArrayList arrayList) {
        int i9;
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            int size = arrayList.size();
            i9 = this.a;
            if (i10 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i10);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i11 = 0;
            while (i11 < peerStories.stories.size()) {
                if (p7.w(i9, peerStories.stories.get(i11))) {
                    peerStories.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (peerStories.stories.isEmpty() && !K(peerDialogId)) {
                this.i.l(peerDialogId);
                arrayList.remove(peerStories);
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    public final void l0(long j10, List list, boolean z10) {
        TL_stories.PeerStories peerStories;
        boolean z11;
        int i9 = this.a;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(j10);
            if (userFull == null) {
                return;
            }
            if (userFull.stories == null) {
                if (!z10) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                userFull.stories = tL_peerStories;
                tL_peerStories.peer = MessagesController.getInstance(i9).getPeer(j10);
                userFull.stories.max_read_id = x(j10);
            }
            peerStories = userFull.stories;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(-j10);
            if (chatFull == null) {
                return;
            }
            if (chatFull.stories == null) {
                if (!z10) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                chatFull.stories = tL_peerStories2;
                tL_peerStories2.peer = MessagesController.getInstance(i9).getPeer(j10);
                chatFull.stories.max_read_id = x(j10);
            }
            peerStories = chatFull.stories;
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
                        org.telegram.messenger.l0.n(storyItem.id, new StringBuilder("StoriesController update story for full peer storyId="));
                    }
                } else {
                    i11++;
                }
            }
            if (!z11) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    org.telegram.messenger.l0.n(storyItem.id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z10) {
                    org.telegram.messenger.l0.n(storyItem.id, new StringBuilder("StoriesController add new story for full peer storyId="));
                    peerStories.stories.add(storyItem);
                    peerStories.checkedExpired = false;
                }
            }
        }
    }

    public final void m(TL_stories.PeerStories peerStories) {
        if (peerStories == null || peerStories.stories == null) {
            return;
        }
        int i9 = 0;
        while (i9 < peerStories.stories.size()) {
            if (p7.w(this.a, peerStories.stories.get(i9))) {
                peerStories.stories.remove(i9);
                i9--;
            }
            i9++;
        }
        peerStories.checkedExpired = true;
    }

    public final void m0(long j10, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories == null || (peerStories2 = (TL_stories.PeerStories) this.i.f(j10)) == null) {
            return;
        }
        FileLog.d("StoriesController update stories from full peer " + j10);
        for (int i9 = 0; i9 < peerStories2.stories.size(); i9++) {
            if (peerStories2.stories.get(i9) instanceof TL_stories.TL_storyItemSkipped) {
                int i10 = peerStories2.stories.get(i9).id;
                int i11 = 0;
                while (true) {
                    if (i11 >= peerStories.stories.size()) {
                        break;
                    }
                    if (peerStories.stories.get(i11).id == i10 && (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItem)) {
                        peerStories2.stories.set(i9, peerStories.stories.get(i11));
                        break;
                    }
                    i11++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(TLRPC.TL_error tL_error) {
        boolean z10;
        String str;
        int i9 = this.a;
        if (tL_error != null && (str = tL_error.text) != null) {
            long j10 = 0;
            z10 = true;
            if (str.startsWith("STORY_SEND_FLOOD_WEEKLY_")) {
                try {
                    j10 = Long.parseLong(tL_error.text.substring(24));
                } catch (Exception unused) {
                }
                this.S = new p6(2, 0, j10);
            } else if (tL_error.text.startsWith("STORY_SEND_FLOOD_MONTHLY_")) {
                try {
                    j10 = Long.parseLong(tL_error.text.substring(25));
                } catch (Exception unused2) {
                }
                this.S = new p6(3, 0, j10);
            } else if (tL_error.text.equals("STORIES_TOO_MUCH")) {
                this.S = new p6(1, 0, 0L);
            } else if (tL_error.text.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                MessagesController messagesController = MessagesController.getInstance(i9);
                if ("enabled".equals(messagesController.storiesPosting)) {
                    SharedPreferences.Editor edit = messagesController.getMainSettings().edit();
                    messagesController.storiesPosting = "premium";
                    edit.putString("storiesPosting", "premium").apply();
                    NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesEnabledUpdate, new Object[0]);
                }
            }
            if (z10) {
                NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
            }
            return z10;
        }
        z10 = false;
        if (z10) {
        }
        return z10;
    }

    public final void n0(long j10, List list, boolean z10) {
        ArrayList arrayList;
        StringBuilder s10 = aa.d.s(j10, "updateStoriesInLists ", " storyItems[");
        s10.append(list.size());
        s10.append("] {");
        s10.append(h0(list));
        s10.append("}");
        FileLog.d(s10.toString());
        n6 A = A(j10, 0, -1, false);
        v6 v6Var = this;
        n6 A2 = v6Var.A(j10, 1, -1, false);
        if (A != null) {
            A.D(list, z10);
        }
        if (A2 != null) {
            A2.D(list, z10);
        }
        ArrayList arrayList2 = v6Var.I;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((h6) obj).D(list, z10);
        }
        j6 B = B(j10, false);
        if (B == null || (arrayList = B.h) == null) {
            return;
        }
        int size2 = arrayList.size();
        while (i9 < size2) {
            int i11 = i9 + 1;
            n6 A3 = v6Var.A(j10, 0, ((o6) arrayList.get(i9)).a, false);
            if (A3 != null) {
                A3.D(list, z10);
            }
            v6Var = this;
            i9 = i11;
        }
    }

    public final p6 o() {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i9 = this.a;
        int i10 = UserConfig.getInstance(i9).isPremium() ? MessagesController.getInstance(i9).storyExpiringLimitPremium : MessagesController.getInstance(i9).storyExpiringLimitDefault;
        ArrayList arrayList2 = (ArrayList) this.c.f(UserConfig.getInstance(i9).getClientUserId());
        int size = arrayList2 == null ? 0 : arrayList2.size();
        TL_stories.PeerStories y10 = y(UserConfig.getInstance(i9).getClientUserId());
        if (y10 != null && (arrayList = y10.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i10) {
            return new p6(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = MessagesController.getInstance(i9).getInputPeer(UserConfig.getInstance(i9).getClientUserId());
        ConnectionsManager.getInstance(i9).sendRequest(tL_stories_canSendStory, new t5(this, 1), 1024);
        return null;
    }

    public final void o0(long j10, ArrayList arrayList, boolean z10, e3 e3Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y10 = y(j10);
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i9);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z10;
                togglepinned.id.add(Integer.valueOf(storyItem.id));
                if (y10 != null) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).id == storyItem.id) {
                            y10.stories.get(i10).pinned = z10;
                            this.k.k(j10, storyItem);
                        }
                    }
                }
            }
        }
        FileLog.d("StoriesController updateStoriesPinned");
        n0(j10, arrayList, false);
        l0(j10, arrayList, false);
        togglepinned.pinned = z10;
        int i11 = this.a;
        togglepinned.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        ConnectionsManager.getInstance(i11).sendRequest(togglepinned, new gh.x6(1, e3Var));
    }

    public final void p(int i9, long j10) {
        String str = "229:" + j10 + ":" + i9;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i10 = this.a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i9));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesByID, new gh.v(this, i9, str, j10, 2));
    }

    public final void p0(long j10, TL_stories.StoryItem storyItem, boolean z10) {
        String str;
        StringBuilder s10 = aa.d.s(j10, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = BuildConfig.BETA_URL;
        } else {
            str = storyItem.id + "@" + storyItem.dialogId;
        }
        s10.append(str);
        FileLog.d(s10.toString());
        n0(j10, Collections.singletonList(storyItem), z10);
        this.k.k(j10, storyItem);
        l0(j10, Collections.singletonList(storyItem), false);
    }

    public final void q() {
        this.s = false;
        this.y = "";
        this.o = "";
        this.l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        kh.b1 b1Var = this.w;
        Objects.requireNonNull(b1Var);
        AndroidUtilities.runOnUIThread(new g(b1Var, 11));
        T();
        if (this.s) {
            return;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new t5(this, 0));
    }

    public final void q0(long j10, int i9, TLRPC.Reaction reaction) {
        TL_stories.StoryItem u10 = u(i9, j10);
        if (u10 != null) {
            u10.sent_reaction = reaction;
            if (reaction != null) {
                u10.flags |= 32768;
            } else {
                u10.flags &= -32769;
            }
            p0(j10, u10, false);
        }
    }

    public final void r(long j10, String str, Utilities.Callback callback) {
        j6 B = B(j10, true);
        int i9 = B.a;
        if (B.i) {
            return;
        }
        B.i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = MessagesController.getInstance(i9).getInputPeer(B.b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i9).sendRequest(tL_createAlbum, new bg.j0(13, B, callback));
    }

    public final void s(long j10, ArrayList arrayList) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i9 = this.a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i9).getInputPeer(j10);
        tL_stories_deleteStories.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
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
        if (j10 < 0 ? !((chatFull = MessagesController.getInstance(i9).getChatFull(-j10)) == null || (peerStories = chatFull.stories) == null) : !((userFull = MessagesController.getInstance(i9).getUserFull(j10)) == null || (peerStories = userFull.stories) == null)) {
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
        ConnectionsManager.getInstance(i9).sendRequest(tL_stories_deleteStories, new t5(this, 4));
        k0(j10, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.id;
        i7 i7Var = this.k;
        i7Var.b.getStorageQueue().postRunnable(new e5.w(i7Var, arrayList2, j10, 8));
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public final u6 t(long j10, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        return (u6) hashMap.get(Integer.valueOf(storyItem.id));
    }

    public final TL_stories.StoryItem u(int i9, long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            return null;
        }
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            if (peerStories.stories.get(i10).id == i9) {
                return peerStories.stories.get(i10);
            }
        }
        return null;
    }

    public final void v(ArrayList arrayList) {
        boolean z10;
        TLRPC.User user;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i9);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (peerDialogId <= 0 || (user = MessagesController.getInstance(this.a).getUser(Long.valueOf(peerDialogId))) == null || M(user)) {
                z10 = false;
            } else {
                arrayList.remove(i9);
                i9--;
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
            if (!z10 && peerStories.stories.isEmpty() && !K(peerDialogId)) {
                arrayList.remove(i9);
                i9--;
            }
            i9++;
        }
    }

    public final String w(int i9, long j10) {
        o6 b10;
        j6 B = B(j10, false);
        if (B == null || (b10 = B.b(i9)) == null) {
            return null;
        }
        return b10.b;
    }

    public final int x(long j10) {
        TL_stories.PeerStories y10 = y(j10);
        if (y10 == null) {
            y10 = z(j10);
        }
        return y10 != null ? Math.max(y10.max_read_id, this.f.get(j10, 0)) : this.f.get(j10, 0);
    }

    public final TL_stories.PeerStories y(long j10) {
        return (TL_stories.PeerStories) this.i.f(j10);
    }

    public final TL_stories.PeerStories z(long j10) {
        TL_stories.PeerStories peerStories;
        TL_stories.PeerStories peerStories2;
        int i9 = this.a;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(j10);
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (userFull == null) {
                return null;
            }
            return userFull.stories;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(-j10);
        if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (chatFull == null) {
            return null;
        }
        return chatFull.stories;
    }
}
