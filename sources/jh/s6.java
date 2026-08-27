package jh;

import android.content.SharedPreferences;
import android.text.TextUtils;
import hh.y9;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class s6 {
    public static final Comparator X = Comparator$-CC.comparingInt(new gf.d(8));
    public TL_stories.TL_storiesStealthMode B;
    public final cg.w1 K;
    public int N;
    public boolean R;
    public l6 S;
    public final ArrayList T;
    public boolean U;
    public boolean V;
    public final HashSet W;
    public final int a;
    public final f7 k;
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
    public final lh.a1 w;
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
    public final ag.h J = new ag.h(this, 3);
    public final HashSet L = new HashSet();
    public final a0.h M = new a0.h();
    public boolean O = false;
    public boolean P = false;
    public long Q = 0;

    public s6(int i10) {
        this.o = "";
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        arrayList.add(new TLRPC.TL_inputPeerSelf());
        this.U = false;
        this.V = false;
        this.W = new HashSet();
        this.a = i10;
        f7 f7Var = new f7();
        f7Var.a = i10;
        f7Var.b = MessagesStorage.getInstance(i10);
        this.k = f7Var;
        SharedPreferences mainSettings = MessagesController.getInstance(i10).getMainSettings();
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
        f7 f7Var2 = this.k;
        f7Var2.b.getStorageQueue().postRunnable(new p6(5, f7Var2, new u5(this, 0)));
        this.K = new cg.w1(this, i10, 6);
        this.w = new lh.a1(i10);
    }

    public static String a(ArrayList arrayList) {
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (i10 > 0) {
                    str = str + ", ";
                }
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList.get(i10)).storyItem;
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
        int i10 = storyItem2.date;
        if (i10 != 0) {
            storyItem.date = i10;
        }
        int i11 = storyItem2.expire_date;
        if (i11 != 0) {
            storyItem.expire_date = i11;
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
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                if (i10 > 0) {
                    str = str + ", ";
                }
                str = str + ((TL_stories.StoryItem) list.get(i10)).id + "@" + ((TL_stories.StoryItem) list.get(i10)).dialogId;
            } catch (Exception unused) {
                return "err";
            }
        }
        return str;
    }

    public final j6 A(long j10, int i10, int i11, boolean z10) {
        if (i10 == 0 && i11 > 0) {
            Long valueOf = Long.valueOf(j10);
            HashMap hashMap = this.H;
            HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                hashMap.put(Long.valueOf(j10), hashMap2);
            }
            HashMap hashMap3 = hashMap2;
            j6 j6Var = (j6) hashMap3.get(Integer.valueOf(i11));
            if (j6Var != null || !z10) {
                return j6Var;
            }
            j6 j6Var2 = new j6(this.a, j10, i10, i11, new ag.n0(this, 22));
            hashMap3.put(Integer.valueOf(i11), j6Var2);
            return j6Var2;
        }
        HashMap[] hashMapArr = this.G;
        if (hashMapArr[i10] == null) {
            hashMapArr[i10] = new HashMap();
        }
        j6 j6Var3 = (j6) hashMapArr[i10].get(Long.valueOf(j10));
        if (j6Var3 != null || !z10) {
            return j6Var3;
        }
        if (i10 == 4) {
            HashMap hashMap4 = hashMapArr[i10];
            Long valueOf2 = Long.valueOf(j10);
            b6 b6Var = new b6(this.a, j10, null, new ag.n0(this, 22));
            hashMap4.put(valueOf2, b6Var);
            return b6Var;
        }
        HashMap hashMap5 = hashMapArr[i10];
        Long valueOf3 = Long.valueOf(j10);
        j6 j6Var4 = new j6(this.a, j10, i10, i11, new ag.n0(this, 22));
        hashMap5.put(valueOf3, j6Var4);
        return j6Var4;
    }

    public final f6 B(long j10, boolean z10) {
        a0.h hVar = this.F;
        f6 f6Var = (f6) hVar.f(j10);
        if (f6Var != null || !z10) {
            return f6Var;
        }
        f6 f6Var2 = new f6(this.a, j10, this);
        hVar.k(f6Var2, j10);
        return f6Var2;
    }

    public final int C(boolean z10) {
        return z10 ? this.z ? Math.max(1, this.v) : this.h.size() : this.p ? Math.max(1, this.u) : this.g.size();
    }

    public final int D(int i10, long j10) {
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
        for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
            if (peerStories.stories.get(i11).media instanceof TLRPC.TL_messageMediaVideoStream) {
                return 3;
            }
            if ((i10 == 0 || peerStories.stories.get(i11).id == i10) && peerStories.stories.get(i11).id > max) {
                if (peerStories.stories.get(i11).close_friends) {
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
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            TL_stories.StoryItem storyItem = peerStories.stories.get(i10);
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
        return ((r6) i0.a.i(1, arrayList)).E;
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
        int i10 = this.a;
        tL_stories_getPeerStories.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getPeerStories, new r5(this, j10, 0));
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_contacts_getBlocked, new p5(this, 3));
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
            ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getAllStories, new x5(this, z10, tL_stories_getAllStories, z11));
        }
    }

    public final void R() {
        if (this.U || this.V) {
            return;
        }
        this.U = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getChatsToSend(), new p5(this, 2));
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
        for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
            if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(Integer.valueOf(peerStories.stories.get(i10).id));
            }
            if (arrayList != null && arrayList.size() > 14) {
                break;
            }
        }
        if (arrayList != null) {
            hashSet.add(Long.valueOf(j10));
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.id = arrayList;
            int i11 = this.a;
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(peerDialogId);
            ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: jh.s5
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    AndroidUtilities.runOnUIThread(new w5(s6.this, j10, z10, peerStories, peerDialogId, tLObject));
                }
            });
        }
    }

    public final void T() {
        if (this.A) {
            this.n = true;
            u5 u5Var = new u5(this, 1);
            f7 f7Var = this.k;
            f7Var.b.getStorageQueue().postRunnable(new p6(6, f7Var, u5Var));
        } else {
            Q(false);
            Q(true);
        }
        this.A = false;
    }

    public final void U(int i10, long j10) {
        AndroidUtilities.runOnUIThread(new hh.d9(this, j10, i10, 1));
    }

    public final boolean V(TL_stories.PeerStories peerStories, TL_stories.StoryItem storyItem, boolean z10) {
        if (storyItem != null && peerStories != null) {
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (storyItem.justUploaded) {
                storyItem.justUploaded = false;
            }
            int i10 = this.f.get(peerDialogId);
            int max = Math.max(peerStories.max_read_id, Math.max(i10, storyItem.id));
            int i11 = this.a;
            NotificationsController.getInstance(i11).processReadStories(peerDialogId, max);
            peerStories.max_read_id = max;
            this.f.put(peerDialogId, max);
            if (max > i10) {
                if (!z10) {
                    this.k.i(max, peerDialogId);
                }
                TL_stories.TL_stories_readStories tL_stories_readStories = new TL_stories.TL_stories_readStories();
                tL_stories_readStories.peer = MessagesController.getInstance(i11).getInputPeer(peerDialogId);
                tL_stories_readStories.max_id = storyItem.id;
                ConnectionsManager.getInstance(i11).sendRequest(tL_stories_readStories, null);
                NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
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
        int i10 = this.a;
        if (DownloadController.getInstance(i10).canPreloadStories()) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            boolean z10 = messageMedia != null && MessageObject.isVideoDocument(messageMedia.getDocument());
            storyItem.dialogId = j10;
            if (z10) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(storyItem.media.getDocument().thumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                FileLoader.getInstance(i10).loadFile(storyItem.media.getDocument(), storyItem, 0, 1);
                FileLoader.getInstance(i10).loadFile(ImageLocation.getForDocument(closestPhotoSizeWithSize, storyItem.media.getDocument()), storyItem, "jpg", 0, 1);
            } else {
                TLRPC.MessageMedia messageMedia2 = storyItem.media;
                TLRPC.Photo photo = messageMedia2 == null ? null : messageMedia2.photo;
                if (photo != null && (arrayList = photo.sizes) != null) {
                    FileLoader.getInstance(i10).loadFile(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID), photo), storyItem, "jpg", 0, 1);
                }
            }
            if (storyItem.media_areas != null) {
                for (int i11 = 0; i11 < Math.min(2, storyItem.media_areas.size()); i11++) {
                    if (storyItem.media_areas.get(i11) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                        ig.q0 d = ig.q0.d(((TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i11)).reaction);
                        if (d.f != null) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f);
                            if (tL_availableReaction != null) {
                                FileLoader.getInstance(i10).loadFile(tL_availableReaction.select_animation, d, 0, 0);
                            }
                        } else {
                            org.telegram.ui.Components.k5 k5Var = new org.telegram.ui.Components.k5(1, i10, d.g);
                            k5Var.m = true;
                            k5Var.v();
                        }
                    }
                }
            }
        }
    }

    public final void X(TL_stories.PeerStories peerStories) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= peerStories.stories.size()) {
                break;
            }
            if (peerStories.stories.get(i11).id > peerStories.max_read_id) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (peerStories.stories.isEmpty()) {
            return;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        W(peerDialogId, peerStories.stories.get(i10));
        if (i10 > 0) {
            W(peerDialogId, peerStories.stories.get(i10 - 1));
        }
        if (i10 < peerStories.stories.size() - 1) {
            W(peerDialogId, peerStories.stories.get(i10 + 1));
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
            for (int i10 = 0; i10 < tL_stories_allStories.peer_stories.size(); i10++) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(DialogObject.getPeerDialogId(tL_stories_allStories.peer_stories.get(i10).peer));
            }
            FileLog.d("StoriesController cache=" + z11 + " hidden=" + z10 + " processAllStoriesResponse {" + ((Object) sb2) + "}");
        }
        int i11 = this.a;
        MessagesController.getInstance(i11).putUsers(tL_stories_allStories.users, z11);
        MessagesController.getInstance(i11).putChats(tL_stories_allStories.chats, z11);
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        for (int i12 = 0; i12 < tL_stories_allStories.peer_stories.size(); i12++) {
            TL_stories.PeerStories peerStories = tL_stories_allStories.peer_stories.get(i12);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i13 = 0;
            while (i13 < peerStories.stories.size()) {
                TL_stories.StoryItem storyItem = peerStories.stories.get(i13);
                if ((storyItem instanceof TL_stories.TL_storyItemDeleted) || ((storyItem instanceof TL_stories.TL_storyItem) && currentTime > storyItem.expire_date && !(storyItem.media instanceof TLRPC.TL_messageMediaVideoStream))) {
                    NotificationsController.getInstance(i11).processDeleteStory(peerDialogId, storyItem.id);
                    peerStories.stories.remove(i13);
                    i13--;
                }
                i13++;
            }
            if (peerStories.stories.isEmpty()) {
                this.i.l(peerDialogId);
            } else {
                b0(peerDialogId, peerStories);
                int i14 = 0;
                while (i14 < 2) {
                    ArrayList arrayList3 = i14 == 0 ? arrayList : arrayList2;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList3.size()) {
                            break;
                        }
                        if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList3.get(i15)).peer) == peerDialogId) {
                            arrayList3.remove(i15);
                            break;
                        }
                        i15++;
                    }
                    i14++;
                }
                if (peerDialogId > 0) {
                    TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                    if (user != null) {
                        if (user.stories_hidden) {
                            e(peerStories);
                        } else {
                            arrayList2.add(peerStories);
                            X(peerStories);
                        }
                    }
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerDialogId));
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
            ag.l3 l3Var = new ag.l3(14);
            f7 f7Var = this.k;
            f7Var.b.getStorageQueue().postRunnable(new q5(f7Var, arrayList4, z12, z10, l3Var, 1));
        }
        cg.w1 w1Var = this.K;
        AndroidUtilities.cancelRunOnUIThread(w1Var);
        w1Var.run();
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
        f7 f7Var = this.k;
        if (peerDialogId > 0) {
            user = MessagesController.getInstance(this.a).getUser(Long.valueOf(peerDialogId));
            if (user != null && (M(user) || user.self)) {
                f7Var.b.getStorageQueue().postRunnable(new p6(4, f7Var, tL_updateStory));
            }
        } else {
            f7Var.b.getStorageQueue().postRunnable(new p6(4, f7Var, tL_updateStory));
            user = null;
        }
        AndroidUtilities.runOnUIThread(new hh.e2(this, peerDialogId, tL_updateStory, user, 8));
    }

    public final void a0(long j10, TL_stories.PeerStories peerStories) {
        b0(j10, peerStories);
        f7 f7Var = this.k;
        int i10 = this.a;
        if (j10 <= 0) {
            if (ChatObject.isInChat(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)))) {
                f7Var.b.getStorageQueue().postRunnable(new c7(f7Var, peerStories, 0));
            }
        } else {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (M(user) || user.self) {
                f7Var.b.getStorageQueue().postRunnable(new c7(f7Var, peerStories, 0));
            }
        }
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        f6 B = B(j10, true);
        B.getClass();
        s6 s6Var = B.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.a;
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.add_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            tL_updateAlbum.add_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 == null) {
                ArrayList<Integer> arrayList3 = new ArrayList<>();
                storyItem.albums = arrayList3;
                arrayList3.add(Integer.valueOf(i10));
            } else if (!arrayList2.contains(Integer.valueOf(i10))) {
                storyItem.albums.add(Integer.valueOf(i10));
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        j6 A = s6Var.A(B.b, 0, i10, false);
        if (A != null) {
            A.D(arrayList, true);
        }
        ArrayList arrayList4 = B.h;
        int size3 = arrayList4.size();
        int i14 = 0;
        while (i14 < size3) {
            Object obj3 = arrayList4.get(i14);
            i14++;
            j6 A2 = s6Var.A(B.b, 0, ((k6) obj3).a, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.add_stories, false);
            }
        }
    }

    public final void b0(long j10, TL_stories.PeerStories peerStories) {
        ArrayList<TL_stories.StoryItem> arrayList;
        ArrayList<TL_stories.StoryItem> arrayList2;
        a0.h hVar = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        if (peerStories2 != null && (arrayList = peerStories2.stories) != null && !arrayList.isEmpty() && peerStories != null && (arrayList2 = peerStories.stories) != null && !arrayList2.isEmpty()) {
            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                if (peerStories.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                    int i11 = peerStories.stories.get(i10).id;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i12).id == i11 && (peerStories2.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
                            peerStories.stories.set(i10, peerStories2.stories.get(i12));
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        hVar.k(peerStories, j10);
    }

    public final void c(int i10, long j10, TL_stories.StoryItem storyItem) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        b(i10, j10, arrayList);
    }

    public final void c0(int i10, long j10, ArrayList arrayList) {
        f6 B = B(j10, true);
        B.getClass();
        s6 s6Var = B.j;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i11 = B.a;
        tL_updateAlbum.peer = MessagesController.getInstance(i11).getInputPeer(B.b);
        tL_updateAlbum.album_id = i10;
        tL_updateAlbum.delete_stories = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            tL_updateAlbum.delete_stories.add(Integer.valueOf(((TL_stories.StoryItem) obj).id));
        }
        int size2 = arrayList.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj2;
            ArrayList<Integer> arrayList2 = storyItem.albums;
            if (arrayList2 != null) {
                arrayList2.remove(Integer.valueOf(i10));
                if (storyItem.albums.isEmpty()) {
                    storyItem.albums = null;
                }
            }
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_updateAlbum, null);
        j6 A = s6Var.A(B.b, 0, i10, false);
        if (A != null) {
            A.A(arrayList);
        }
        ArrayList arrayList3 = B.h;
        int size3 = arrayList3.size();
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            j6 A2 = s6Var.A(B.b, 0, ((k6) obj3).a, false);
            if (A2 != null) {
                A2.E(i10, tL_updateAlbum.delete_stories, true);
            }
        }
    }

    public final void d(long j10, r6 r6Var, a0.h hVar, boolean z10) {
        ArrayList arrayList = (ArrayList) hVar.f(j10);
        if (z10 && (arrayList == null || arrayList.isEmpty())) {
            this.d = 0;
        }
        if (arrayList == null) {
            arrayList = org.telegram.messenger.y1.l(j10, hVar);
        }
        arrayList.add(r6Var);
    }

    public final void d0(long j10, int i10, d5.d dVar) {
        TL_stories.PeerStories y10 = y(j10);
        if (y10 != null) {
            for (int i11 = 0; i11 < y10.stories.size(); i11++) {
                if (y10.stories.get(i11).id == i10 && !(y10.stories.get(i11) instanceof TL_stories.TL_storyItemSkipped)) {
                    dVar.accept(y10.stories.get(i11));
                    return;
                }
            }
        }
        long j11 = (i10 + j10) << 12;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.E.f(j11);
        if (storyItem != null) {
            dVar.accept(storyItem);
            return;
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i10));
        int i12 = this.a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesByID, new z5(this, j11, dVar));
    }

    public final void e(TL_stories.PeerStories peerStories) {
        ArrayList arrayList;
        long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
        int i10 = this.a;
        if (peerDialogId == UserConfig.getInstance(i10).getClientUserId()) {
            return;
        }
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            arrayList = this.h;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i11)).peer) == peerDialogId) {
                z10 = true;
            }
            i11++;
        }
        if (!z10) {
            arrayList.add(peerStories);
        }
        MessagesController.getInstance(i10).checkArchiveFolder();
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
        int i10 = this.a;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.stealthModeChanged, new Object[0]);
        SharedPreferences.Editor edit = MessagesController.getInstance(i10).getMainSettings().edit();
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
        int i10 = this.a;
        TLRPC.User user = null;
        if (peerDialogId > 0) {
            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            if (user2 == null) {
                FileLog.d("StoriesController can't apply story user == null");
                return;
            } else {
                user = user2;
                chat = null;
            }
        } else {
            chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat == null) {
                FileLog.d("StoriesController can't apply story chat == null");
                return;
            }
        }
        int i11 = 0;
        while (true) {
            arrayList = this.g;
            z10 = true;
            if (i11 >= arrayList.size()) {
                z11 = false;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i11)).peer) == peerDialogId) {
                    arrayList.remove(i11);
                    z11 = true;
                    break;
                }
                i11++;
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.h;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i12)).peer) == peerDialogId) {
                arrayList2.remove(i12);
                z11 = true;
                break;
            }
            i12++;
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
        MessagesController.getInstance(i10).checkArchiveFolder();
    }

    public final void g0(long j10, TL_stories.StoryItem storyItem, ig.q0 q0Var) {
        if (storyItem == null) {
            return;
        }
        TL_stories.TL_stories_sendReaction tL_stories_sendReaction = new TL_stories.TL_stories_sendReaction();
        tL_stories_sendReaction.story_id = storyItem.id;
        int i10 = this.a;
        tL_stories_sendReaction.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        if (q0Var == null) {
            tL_stories_sendReaction.reaction = new TLRPC.TL_reactionEmpty();
            storyItem.flags &= -32769;
            storyItem.sent_reaction = null;
        } else if (q0Var.g != 0) {
            TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
            tL_reactionCustomEmoji.document_id = q0Var.g;
            tL_stories_sendReaction.reaction = tL_reactionCustomEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionCustomEmoji;
        } else if (q0Var.f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = q0Var.f;
            tL_stories_sendReaction.reaction = tL_reactionEmoji;
            storyItem.flags |= 32768;
            storyItem.sent_reaction = tL_reactionEmoji;
        }
        p0(j10, storyItem, false);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendReaction, new m5(1));
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
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                peerStories = null;
                break;
            } else {
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer) == j10) {
                    peerStories = (TL_stories.PeerStories) arrayList.remove(i10);
                    break;
                }
                i10++;
            }
        }
        if (peerStories != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    arrayList2.add(0, peerStories);
                    cg.w1 w1Var = this.K;
                    AndroidUtilities.cancelRunOnUIThread(w1Var);
                    w1Var.run();
                    break;
                }
                if (DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList2.get(i11)).peer) == j10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        int i12 = this.a;
        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        MessagesController.getInstance(i12).checkArchiveFolder();
        if (z11) {
            if (j10 >= 0) {
                TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(j10));
                user.stories_hidden = z10;
                MessagesStorage.getInstance(i12).putUsersAndChats(Collections.singletonList(user), null, false, true);
                MessagesController.getInstance(i12).putUser(user, false);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-j10));
                chat.stories_hidden = z10;
                MessagesStorage.getInstance(i12).putUsersAndChats(null, Collections.singletonList(chat), false, true);
                MessagesController.getInstance(i12).putChat(chat, false);
            }
            TL_stories.TL_stories_togglePeerStoriesHidden tL_stories_togglePeerStoriesHidden = new TL_stories.TL_stories_togglePeerStoriesHidden();
            tL_stories_togglePeerStoriesHidden.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            tL_stories_togglePeerStoriesHidden.hidden = z10;
            ConnectionsManager.getInstance(i12).sendRequest(tL_stories_togglePeerStoriesHidden, new m5(1));
        }
    }

    public final boolean j(long j10) {
        TLRPC.User user;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        int i10 = this.a;
        if (j10 >= 0) {
            return j10 > 0 && (user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10))) != null && user.bot && user.bot_can_edit;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || !ChatObject.isBoostSupported(chat)) {
            return false;
        }
        return chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_stories);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j0(long j10, boolean z10, boolean z11) {
        TLRPC.TL_contacts_unblock tL_contacts_unblock;
        int i10 = this.a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(j10);
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_unblock, null);
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesBlocklistUpdate, new Object[0]);
    }

    public final void k(long j10, d5.d dVar, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        int i10 = this.a;
        tL_stories_canSendStory.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_canSendStory, new hh.e(this, z10, j10, dVar, c6Var), 1024);
    }

    public final void k0(long j10, List list) {
        ArrayList arrayList;
        StringBuilder q6 = a9.p.q(j10, "updateDeletedStoriesInLists ", " storyItems[");
        q6.append(list.size());
        q6.append("] {");
        q6.append(h0(list));
        q6.append("}");
        FileLog.d(q6.toString());
        j6 A = A(j10, 0, -1, false);
        s6 s6Var = this;
        j6 A2 = s6Var.A(j10, 1, -1, false);
        if (A != null) {
            A.A(list);
        }
        if (A2 != null) {
            A2.A(list);
        }
        int i10 = 0;
        f6 B = B(j10, false);
        if (B == null || (arrayList = B.h) == null) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j6 A3 = s6Var.A(j10, 0, ((k6) obj).a, false);
            if (A3 != null) {
                A3.A(list);
            }
            s6Var = this;
        }
    }

    public final void l(ArrayList arrayList) {
        int i10;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int size = arrayList.size();
            i10 = this.a;
            if (i11 >= size) {
                break;
            }
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i11);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            int i12 = 0;
            while (i12 < peerStories.stories.size()) {
                if (l7.w(i10, peerStories.stories.get(i12))) {
                    peerStories.stories.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (peerStories.stories.isEmpty() && !K(peerDialogId)) {
                this.i.l(peerDialogId);
                arrayList.remove(peerStories);
                z10 = true;
            }
            i11++;
        }
        if (z10) {
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
    }

    public final void l0(long j10, List list, boolean z10) {
        TL_stories.PeerStories peerStories;
        boolean z11;
        int i10 = this.a;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull == null) {
                return;
            }
            if (userFull.stories == null) {
                if (!z10) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                userFull.stories = tL_peerStories;
                tL_peerStories.peer = MessagesController.getInstance(i10).getPeer(j10);
                userFull.stories.max_read_id = x(j10);
            }
            peerStories = userFull.stories;
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
            if (chatFull == null) {
                return;
            }
            if (chatFull.stories == null) {
                if (!z10) {
                    return;
                }
                TL_stories.TL_peerStories tL_peerStories2 = new TL_stories.TL_peerStories();
                chatFull.stories = tL_peerStories2;
                tL_peerStories2.peer = MessagesController.getInstance(i10).getPeer(j10);
                chatFull.stories.max_read_id = x(j10);
            }
            peerStories = chatFull.stories;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= peerStories.stories.size()) {
                    z11 = false;
                    break;
                }
                if (peerStories.stories.get(i12).id == storyItem.id) {
                    z11 = true;
                    if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                        peerStories.stories.remove(i12);
                    } else {
                        TL_stories.StoryItem storyItem2 = peerStories.stories.get(i12);
                        storyItem = f(storyItem2, storyItem);
                        peerStories.stories.set(i12, storyItem);
                        if (storyItem.attachPath == null) {
                            storyItem.attachPath = storyItem2.attachPath;
                        }
                        if (storyItem.firstFramePath == null) {
                            storyItem.firstFramePath = storyItem2.firstFramePath;
                        }
                        i0.a.v(storyItem.id, new StringBuilder("StoriesController update story for full peer storyId="));
                    }
                } else {
                    i12++;
                }
            }
            if (!z11) {
                if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
                    i0.a.v(storyItem.id, new StringBuilder("StoriesController story is not found, but already deleted storyId="));
                } else if (z10) {
                    i0.a.v(storyItem.id, new StringBuilder("StoriesController add new story for full peer storyId="));
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
        int i10 = 0;
        while (i10 < peerStories.stories.size()) {
            if (l7.w(this.a, peerStories.stories.get(i10))) {
                peerStories.stories.remove(i10);
                i10--;
            }
            i10++;
        }
        peerStories.checkedExpired = true;
    }

    public final void m0(long j10, TL_stories.PeerStories peerStories) {
        TL_stories.PeerStories peerStories2;
        if (peerStories == null || (peerStories2 = (TL_stories.PeerStories) this.i.f(j10)) == null) {
            return;
        }
        FileLog.d("StoriesController update stories from full peer " + j10);
        for (int i10 = 0; i10 < peerStories2.stories.size(); i10++) {
            if (peerStories2.stories.get(i10) instanceof TL_stories.TL_storyItemSkipped) {
                int i11 = peerStories2.stories.get(i10).id;
                int i12 = 0;
                while (true) {
                    if (i12 >= peerStories.stories.size()) {
                        break;
                    }
                    if (peerStories.stories.get(i12).id == i11 && (peerStories.stories.get(i12) instanceof TL_stories.TL_storyItem)) {
                        peerStories2.stories.set(i10, peerStories.stories.get(i12));
                        break;
                    }
                    i12++;
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
        int i10 = this.a;
        if (tL_error != null && (str = tL_error.text) != null) {
            long j10 = 0;
            z10 = true;
            if (str.startsWith("STORY_SEND_FLOOD_WEEKLY_")) {
                try {
                    j10 = Long.parseLong(tL_error.text.substring(24));
                } catch (Exception unused) {
                }
                this.S = new l6(2, 0, j10);
            } else if (tL_error.text.startsWith("STORY_SEND_FLOOD_MONTHLY_")) {
                try {
                    j10 = Long.parseLong(tL_error.text.substring(25));
                } catch (Exception unused2) {
                }
                this.S = new l6(3, 0, j10);
            } else if (tL_error.text.equals("STORIES_TOO_MUCH")) {
                this.S = new l6(1, 0, 0L);
            } else if (tL_error.text.equals("PREMIUM_ACCOUNT_REQUIRED")) {
                MessagesController messagesController = MessagesController.getInstance(i10);
                if ("enabled".equals(messagesController.storiesPosting)) {
                    SharedPreferences.Editor edit = messagesController.getMainSettings().edit();
                    messagesController.storiesPosting = "premium";
                    edit.putString("storiesPosting", "premium").apply();
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesEnabledUpdate, new Object[0]);
                }
            }
            if (z10) {
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesLimitUpdate, new Object[0]);
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
        StringBuilder q6 = a9.p.q(j10, "updateStoriesInLists ", " storyItems[");
        q6.append(list.size());
        q6.append("] {");
        q6.append(h0(list));
        q6.append("}");
        FileLog.d(q6.toString());
        j6 A = A(j10, 0, -1, false);
        s6 s6Var = this;
        j6 A2 = s6Var.A(j10, 1, -1, false);
        if (A != null) {
            A.D(list, z10);
        }
        if (A2 != null) {
            A2.D(list, z10);
        }
        ArrayList arrayList2 = s6Var.I;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            ((d6) obj).D(list, z10);
        }
        f6 B = B(j10, false);
        if (B == null || (arrayList = B.h) == null) {
            return;
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            int i12 = i10 + 1;
            j6 A3 = s6Var.A(j10, 0, ((k6) arrayList.get(i10)).a, false);
            if (A3 != null) {
                A3.D(list, z10);
            }
            s6Var = this;
            i10 = i12;
        }
    }

    public final l6 o() {
        ArrayList<TL_stories.StoryItem> arrayList;
        int i10 = this.a;
        int i11 = UserConfig.getInstance(i10).isPremium() ? MessagesController.getInstance(i10).storyExpiringLimitPremium : MessagesController.getInstance(i10).storyExpiringLimitDefault;
        ArrayList arrayList2 = (ArrayList) this.c.f(UserConfig.getInstance(i10).getClientUserId());
        int size = arrayList2 == null ? 0 : arrayList2.size();
        TL_stories.PeerStories y10 = y(UserConfig.getInstance(i10).getClientUserId());
        if (y10 != null && (arrayList = y10.stories) != null) {
            size += arrayList.size();
        }
        if (size >= i11) {
            return new l6(1, 0, 0L);
        }
        if (this.R) {
            return this.S;
        }
        TL_stories.TL_stories_canSendStory tL_stories_canSendStory = new TL_stories.TL_stories_canSendStory();
        tL_stories_canSendStory.peer = MessagesController.getInstance(i10).getInputPeer(UserConfig.getInstance(i10).getClientUserId());
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_canSendStory, new p5(this, 1), 1024);
        return null;
    }

    public final void o0(long j10, ArrayList arrayList, boolean z10, d3 d3Var) {
        TL_stories.togglePinned togglepinned = new TL_stories.togglePinned();
        TL_stories.PeerStories y10 = y(j10);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i10);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                storyItem.pinned = z10;
                togglepinned.id.add(Integer.valueOf(storyItem.id));
                if (y10 != null) {
                    for (int i11 = 0; i11 < y10.stories.size(); i11++) {
                        if (y10.stories.get(i11).id == storyItem.id) {
                            y10.stories.get(i11).pinned = z10;
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
        int i12 = this.a;
        togglepinned.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        ConnectionsManager.getInstance(i12).sendRequest(togglepinned, new hh.w6(1, d3Var));
    }

    public final void p(int i10, long j10) {
        String str = "229:" + j10 + ":" + i10;
        HashSet hashSet = this.W;
        if (hashSet.contains(str) || this.t.contains(str)) {
            return;
        }
        hashSet.add(str);
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        int i11 = this.a;
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_getStoriesByID, new hh.v(this, i10, str, j10, 2));
    }

    public final void p0(long j10, TL_stories.StoryItem storyItem, boolean z10) {
        String str;
        StringBuilder q6 = a9.p.q(j10, "StoriesController updateStoryItem ", " ");
        if (storyItem == null) {
            str = BuildConfig.BETA_URL;
        } else {
            str = storyItem.id + "@" + storyItem.dialogId;
        }
        q6.append(str);
        FileLog.d(q6.toString());
        n0(j10, Collections.singletonList(storyItem), z10);
        this.k.k(j10, storyItem);
        l0(j10, Collections.singletonList(storyItem), false);
    }

    public final void q() {
        this.s = false;
        this.y = "";
        this.o = "";
        this.l.edit().putBoolean("stories_loaded", false).remove("last_stories_state").putBoolean("stories_loaded_hidden", false).remove("last_stories_state_hidden").putBoolean("read_loaded", false).apply();
        lh.a1 a1Var = this.w;
        Objects.requireNonNull(a1Var);
        AndroidUtilities.runOnUIThread(new y9(a1Var, 18));
        T();
        if (this.s) {
            return;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stories.TL_stories_getAllReadPeerStories(), new p5(this, 0));
    }

    public final void q0(long j10, int i10, TLRPC.Reaction reaction) {
        TL_stories.StoryItem u10 = u(i10, j10);
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
        f6 B = B(j10, true);
        int i10 = B.a;
        if (B.i) {
            return;
        }
        B.i = true;
        TL_stories.TL_createAlbum tL_createAlbum = new TL_stories.TL_createAlbum();
        tL_createAlbum.peer = MessagesController.getInstance(i10).getInputPeer(B.b);
        tL_createAlbum.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_createAlbum, new cg.g0(13, B, callback));
    }

    public final void s(long j10, ArrayList arrayList) {
        TLRPC.ChatFull chatFull;
        TL_stories.PeerStories peerStories;
        TLRPC.UserFull userFull;
        TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
        int i10 = this.a;
        TLRPC.InputPeer inputPeer = MessagesController.getInstance(i10).getInputPeer(j10);
        tL_stories_deleteStories.peer = inputPeer;
        if (inputPeer == null) {
            return;
        }
        a0.h hVar = this.i;
        TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) hVar.f(j10);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            if (!(storyItem instanceof TL_stories.TL_storyItemDeleted)) {
                if (peerStories2 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        if (peerStories2.stories.get(i12).id == storyItem.id) {
                            peerStories2.stories.remove(i12);
                            if (peerStories2.stories.isEmpty()) {
                                hVar.l(j10);
                            }
                        } else {
                            i12++;
                        }
                    }
                }
                tL_stories_deleteStories.id.add(Integer.valueOf(storyItem.id));
            }
        }
        if (j10 < 0 ? !((chatFull = MessagesController.getInstance(i10).getChatFull(-j10)) == null || (peerStories = chatFull.stories) == null) : !((userFull = MessagesController.getInstance(i10).getUserFull(j10)) == null || (peerStories = userFull.stories) == null)) {
            peerStories2 = peerStories;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i13);
            if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted) && peerStories2 != null) {
                int i14 = 0;
                while (true) {
                    if (i14 >= peerStories2.stories.size()) {
                        break;
                    }
                    if (peerStories2.stories.get(i14).id == storyItem2.id) {
                        peerStories2.stories.remove(i14);
                        break;
                    }
                    i14++;
                }
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_deleteStories, new p5(this, 4));
        k0(j10, arrayList);
        ArrayList<Integer> arrayList2 = tL_stories_deleteStories.id;
        f7 f7Var = this.k;
        f7Var.b.getStorageQueue().postRunnable(new e5.u(f7Var, arrayList2, j10, 8));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
    }

    public final r6 t(long j10, TL_stories.StoryItem storyItem) {
        HashMap hashMap = (HashMap) this.e.f(j10);
        if (hashMap == null || hashMap.isEmpty()) {
            return null;
        }
        return (r6) hashMap.get(Integer.valueOf(storyItem.id));
    }

    public final TL_stories.StoryItem u(int i10, long j10) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.i.f(j10);
        if (peerStories == null) {
            return null;
        }
        for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
            if (peerStories.stories.get(i11).id == i10) {
                return peerStories.stories.get(i11);
            }
        }
        return null;
    }

    public final void v(ArrayList arrayList) {
        boolean z10;
        TLRPC.User user;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) arrayList.get(i10);
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            if (peerDialogId <= 0 || (user = MessagesController.getInstance(this.a).getUser(Long.valueOf(peerDialogId))) == null || M(user)) {
                z10 = false;
            } else {
                arrayList.remove(i10);
                i10--;
                z10 = true;
            }
            int i11 = 0;
            while (i11 < peerStories.stories.size()) {
                if (peerStories.stories.get(i11) instanceof TL_stories.TL_storyItemDeleted) {
                    peerStories.stories.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (!z10 && peerStories.stories.isEmpty() && !K(peerDialogId)) {
                arrayList.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final String w(int i10, long j10) {
        k6 b10;
        f6 B = B(j10, false);
        if (B == null || (b10 = B.b(i10)) == null) {
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
        int i10 = this.a;
        if (j10 > 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null && (peerStories2 = userFull.stories) != null && !peerStories2.checkedExpired) {
                m(peerStories2);
            }
            if (userFull == null) {
                return null;
            }
            return userFull.stories;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
        if (chatFull != null && (peerStories = chatFull.stories) != null && !peerStories.checkedExpired) {
            m(peerStories);
        }
        if (chatFull == null) {
            return null;
        }
        return chatFull.stories;
    }
}
