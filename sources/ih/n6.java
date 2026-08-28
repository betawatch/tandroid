package ih;

import android.text.TextUtils;
import j$.util.Comparator$-CC;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class n6 {
    public static HashMap B;
    public final int c;
    public final long d;
    public final int e;
    public final int f;
    public final AbstractSet k;
    public final AbstractSet l;
    public boolean r;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final h3.g0 x;
    public m6 y;
    public boolean z;
    public int a = 0;
    public final ArrayList b = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList i = new ArrayList();
    public final HashMap j = new HashMap();
    public final HashSet m = new HashSet();
    public boolean n = true;
    public boolean o = true;
    public final ArrayList p = new ArrayList();
    public final k6 q = new k6(this, 0);
    public int s = -1;
    public int A = -1;

    public n6(int i9, long j10, int i10, int i11, Utilities.Callback callback) {
        this.c = i9;
        this.d = j10;
        this.e = i10;
        this.f = i11;
        this.x = new h3.g0(20, this, callback);
        if (i10 != 0 || i11 <= 0) {
            this.k = new TreeSet(Comparator$-CC.reverseOrder());
            this.l = new TreeSet(Comparator$-CC.reverseOrder());
        } else {
            this.k = new LinkedHashSet();
            this.l = new LinkedHashSet();
        }
        s();
    }

    public static long b(MessageObject messageObject) {
        if (messageObject == null) {
            return 0L;
        }
        long j10 = messageObject.messageOwner.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject == null || !messageObject.isStory()) {
            return false;
        }
        if (z10 && messageObject.isPhoto()) {
            return true;
        }
        return (z11 && messageObject.isVideo()) || (messageObject.storyItem.media instanceof TLRPC.TL_messageMediaUnsupported);
    }

    public static void v(AbstractSet abstractSet, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Integer num = (Integer) obj;
            if (abstractSet.contains(num)) {
                linkedHashSet.add(num);
            }
        }
        Iterator it = abstractSet.iterator();
        while (it.hasNext()) {
            Integer num2 = (Integer) it.next();
            if (!linkedHashSet.contains(num2)) {
                linkedHashSet.add(num2);
            }
        }
        abstractSet.clear();
        abstractSet.addAll(linkedHashSet);
    }

    public final void A(List list) {
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(this.e);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateDeletedStories {");
        sb2.append(v6.h0(list));
        j3.r0.x("}", sb2);
        if (list == null) {
            return;
        }
        boolean z10 = false;
        for (int i9 = 0; i9 < list.size(); i9++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i9);
            if (storyItem != null) {
                Integer valueOf = Integer.valueOf(storyItem.id);
                AbstractSet abstractSet = this.l;
                boolean contains = abstractSet.contains(valueOf);
                AbstractSet abstractSet2 = this.k;
                if (contains || abstractSet2.contains(Integer.valueOf(storyItem.id))) {
                    abstractSet.remove(Integer.valueOf(storyItem.id));
                    abstractSet2.remove(Integer.valueOf(storyItem.id));
                    int i10 = this.s;
                    if (i10 != -1) {
                        this.s = i10 - 1;
                    }
                    z10 = true;
                }
                u(storyItem.id, true);
            }
        }
        if (z10) {
            d(true);
            x();
        }
    }

    public final void B(ArrayList arrayList, boolean z10) {
        v(this.k, arrayList);
        v(this.l, arrayList);
        d(false);
        if (z10) {
            TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
            int i9 = this.c;
            tL_updateAlbum.peer = MessagesController.getInstance(i9).getInputPeer(this.d);
            tL_updateAlbum.album_id = this.f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i9).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i9 = this.c;
        int i10 = MessagesController.getInstance(i9).storiesPinnedToTopCountMax;
        if (arrayList2.size() > i10) {
            arrayList2.subList(i10, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList3.size() && arrayList3.get(i11) == arrayList2.get(i11); i11++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = MessagesController.getInstance(i9).getInputPeer(this.d);
            ConnectionsManager.getInstance(i9).sendRequest(tL_togglePinnedToTop, new q5(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i9;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i10 = this.e;
        sb2.append(i10);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(v6.h0(list));
        j3.r0.x("}", sb2);
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int size = list.size();
            i9 = this.f;
            if (i11 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i11);
            if (storyItem2 != null) {
                Integer valueOf = Integer.valueOf(storyItem2.id);
                AbstractSet abstractSet = this.l;
                boolean contains = abstractSet.contains(valueOf);
                AbstractSet abstractSet2 = this.k;
                boolean z12 = contains || abstractSet2.contains(Integer.valueOf(storyItem2.id));
                boolean z13 = i10 == 1 || storyItem2.pinned;
                if (i9 > 0) {
                    ArrayList<Integer> arrayList2 = storyItem2.albums;
                    z13 = arrayList2 != null && arrayList2.contains(Integer.valueOf(i9));
                }
                if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                    z13 = false;
                }
                HashMap hashMap = this.j;
                if (z12 != z13) {
                    if (!z13) {
                        org.telegram.messenger.l0.n(storyItem2.id, new StringBuilder("StoriesList remove story "));
                        u(storyItem2.id, true);
                        int i12 = this.s;
                        if (i12 != -1) {
                            this.s = i12 - 1;
                        }
                    } else if (this.r) {
                        FileLog.d("StoriesList put story " + storyItem2.id);
                        t(y(storyItem2), false);
                        arrayList.add(Integer.valueOf(storyItem2.id));
                        int i13 = this.s;
                        if (i13 != -1) {
                            this.s = i13 + 1;
                        }
                    } else if (!this.u) {
                        FileLog.d("StoriesList cannot put story " + storyItem2.id + " -> reload");
                        if (this.A != -1) {
                            ConnectionsManager.getInstance(this.c).cancelRequest(this.A, true);
                            this.A = -1;
                        }
                        w();
                        int size2 = this.i.size();
                        hashMap.clear();
                        abstractSet.clear();
                        abstractSet2.clear();
                        j();
                        this.r = false;
                        this.w = false;
                        p(Utilities.clamp(size2, 50, 10), true);
                    }
                } else if (z12 && z13 && ((messageObject = (MessageObject) hashMap.get(Integer.valueOf(storyItem2.id))) == null || z10 || (storyItem = messageObject.storyItem) == null || (storyItem != storyItem2 && (storyItem.id != storyItem2.id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                    org.telegram.messenger.l0.n(storyItem2.id, new StringBuilder("StoriesList update story "));
                    hashMap.put(Integer.valueOf(storyItem2.id), y(storyItem2));
                }
                z11 = true;
            }
            i11++;
        }
        if (i9 > 0 && !arrayList.isEmpty()) {
            B(arrayList, false);
        }
        if (z11) {
            d(true);
            x();
        }
    }

    public final void E(int i9, ArrayList arrayList, boolean z10) {
        TL_stories.StoryItem storyItem;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            num.getClass();
            MessageObject messageObject = (MessageObject) this.j.get(num);
            if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                Integer valueOf = Integer.valueOf(i9);
                boolean remove = z10 ? hashSet.remove(valueOf) : hashSet.add(valueOf);
                storyItem.albums = !hashSet.isEmpty() ? new ArrayList<>(hashSet) : null;
                z11 |= remove;
            }
        }
        if (z11) {
            d(true);
            x();
        }
    }

    public final boolean a() {
        Long l10;
        return B == null || (l10 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f))))) == null || System.currentTimeMillis() - l10.longValue() > 120000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:
    
        if (r9 >= r7) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ArrayList arrayList, boolean z10, boolean z11) {
        ArrayList arrayList2 = this.p;
        arrayList2.clear();
        HashMap hashMap = this.j;
        ArrayList arrayList3 = this.g;
        int i9 = this.f;
        int i10 = this.e;
        if (i10 == 0 && i9 <= 0) {
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                Integer num = (Integer) obj;
                num.getClass();
                MessageObject messageObject = (MessageObject) hashMap.get(num);
                if (e(messageObject, z10, z11)) {
                    arrayList2.add(messageObject);
                }
            }
        }
        int i12 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (Integer num2 : this.l) {
            int intValue = num2.intValue();
            MessageObject messageObject2 = (MessageObject) hashMap.get(num2);
            if (i10 != 0 || i9 > 0 || !arrayList3.contains(num2)) {
                if (e(messageObject2, z10, z11)) {
                    arrayList2.add(messageObject2);
                }
                if (intValue < i12) {
                    i12 = intValue;
                }
            }
        }
        if (!this.r) {
            Iterator it = this.k.iterator();
            while (it.hasNext() && (this.s == -1 || arrayList2.size() < this.s)) {
                Integer num3 = (Integer) it.next();
                int intValue2 = num3.intValue();
                if (i10 != 0 || i9 > 0 || !arrayList3.contains(num3)) {
                    MessageObject messageObject3 = (MessageObject) hashMap.get(num3);
                    if (e(messageObject3, z10, z11)) {
                        arrayList2.add(messageObject3);
                    }
                }
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
    }

    public final void d(boolean z10) {
        c(this.i, this.n, this.o);
        if (z10) {
            k6 k6Var = this.q;
            AndroidUtilities.cancelRunOnUIThread(k6Var);
            AndroidUtilities.runOnUIThread(k6Var);
        }
    }

    public MessageObject f(int i9) {
        return (MessageObject) this.j.get(Integer.valueOf(i9));
    }

    public int g() {
        boolean z10 = this.o;
        ArrayList arrayList = this.i;
        return (z10 && this.n) ? this.s < 0 ? arrayList.size() : Math.max(arrayList.size(), this.s) : arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a5.e(28));
        ArrayList arrayList2 = new ArrayList();
        int i9 = 0;
        int i10 = this.e;
        if (i10 == 0 && this.f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.i;
            int size = arrayList4.size();
            while (i9 < size) {
                Object obj = arrayList4.get(i9);
                i9++;
                arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.g;
        if (i10 == 0 && !arrayList5.isEmpty()) {
            arrayList2.add(new ArrayList(arrayList5));
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList.get(i11);
            i11++;
            TreeSet treeSet = (TreeSet) hashMap.get((Long) obj2);
            if (treeSet != null) {
                ArrayList arrayList6 = new ArrayList(treeSet);
                if (i10 == 0 && !arrayList5.isEmpty()) {
                    int size3 = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayList5.get(i12);
                        i12++;
                        Integer num = (Integer) obj3;
                        num.intValue();
                        arrayList6.remove(num);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    arrayList2.add(arrayList6);
                }
            }
        }
        return arrayList2;
    }

    public int i() {
        return this.l.size();
    }

    public void j() {
        if (this.t) {
            this.v = true;
            return;
        }
        w();
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.c);
        messagesStorage.getStorageQueue().postRunnable(new l6(this, messagesStorage, 1));
    }

    public boolean k() {
        return this.t || this.u;
    }

    public boolean l() {
        return this.l.isEmpty() && a();
    }

    public final boolean m(int i9) {
        if (this.e != 0 || this.f > 0) {
            return false;
        }
        return this.g.contains(Integer.valueOf(i9));
    }

    public final int n() {
        AbstractSet abstractSet = this.l;
        if (abstractSet.isEmpty()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList(abstractSet);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
            int intValue = num.intValue();
            if (!this.g.contains(num)) {
                return intValue;
            }
        }
        return -1;
    }

    public final int o() {
        int i9 = this.a;
        this.a = i9 + 1;
        this.b.add(Integer.valueOf(i9));
        h3.g0 g0Var = this.x;
        if (g0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(g0Var);
        }
        return i9;
    }

    public final void p(int i9, boolean z10) {
        q(i9, Collections.EMPTY_LIST, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean q(int i9, List list, boolean z10) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i10;
        if (this.u || ((this.r || this.w || !a()) && !z10)) {
            return false;
        }
        if (this.t) {
            this.y = new m6(this, z10, i9, list);
            return false;
        }
        int i11 = this.e;
        long j10 = this.d;
        int i12 = this.c;
        if (i11 == 0 && (i10 = this.f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i10;
            tL_stories_getAlbumStories.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            n10 = this.l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i9;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i11 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i9;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i11 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            tL_stories_getStoriesByID.id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = MessagesController.getInstance(i12).getInputPeer(j10);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i9;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i11);
        sb2.append("{");
        sb2.append(j10);
        j3.r0.x("} load", sb2);
        this.u = true;
        this.A = ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesArchive, new gh.u1(this, n10, 3));
        return true;
    }

    public boolean r(int i9) {
        Integer valueOf = Integer.valueOf(i9);
        HashSet hashSet = this.m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i9));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i10 = this.c;
        tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
        tL_stories_incrementStoryViews.id.add(Integer.valueOf(i9));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_incrementStoryViews, new q5(5));
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
        return true;
    }

    public void s() {
        if (this.t || this.u || this.w) {
            return;
        }
        this.t = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.c);
        messagesStorage.getStorageQueue().postRunnable(new l6(this, messagesStorage, 0));
    }

    public final void t(MessageObject messageObject, boolean z10) {
        if (messageObject == null) {
            return;
        }
        this.j.put(Integer.valueOf(messageObject.getId()), messageObject);
        (z10 ? this.k : this.l).add(Integer.valueOf(messageObject.getId()));
        long b10 = b(messageObject);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$-CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(messageObject.getId()));
    }

    public final void u(int i9, boolean z10) {
        MessageObject messageObject = (MessageObject) this.j.remove(Integer.valueOf(i9));
        if (z10) {
            this.k.remove(Integer.valueOf(i9));
        }
        this.l.remove(Integer.valueOf(i9));
        this.g.remove(Integer.valueOf(i9));
        if (messageObject != null) {
            long b10 = b(messageObject);
            Long valueOf = Long.valueOf(b10);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i9));
                if (collection.isEmpty()) {
                    hashMap.remove(Long.valueOf(b10));
                }
            }
        }
    }

    public final void w() {
        HashMap hashMap = B;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f))));
        }
    }

    public void x() {
        if (this.z) {
            return;
        }
        this.z = true;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.g);
        c(arrayList, true, true);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.c);
        messagesStorage.getStorageQueue().postRunnable(new androidx.car.app.utils.c(this, arrayList, messagesStorage, arrayList2, 13));
    }

    public final MessageObject y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.id;
        MessageObject messageObject = new MessageObject(this.c, storyItem);
        messageObject.generateThumbs(false);
        return messageObject;
    }

    public final void z(int i9) {
        h3.g0 g0Var;
        Integer valueOf = Integer.valueOf(i9);
        ArrayList arrayList = this.b;
        arrayList.remove(valueOf);
        if (!arrayList.isEmpty() || (g0Var = this.x) == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(g0Var);
        AndroidUtilities.runOnUIThread(g0Var, 300000L);
    }
}
