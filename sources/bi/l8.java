package bi;

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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public class l8 {
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
    public final a1.e x;
    public j8 y;
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
    public final g8 q = new g8(this, 0);
    public int s = -1;
    public int A = -1;

    public l8(int i10, long j3, int i11, int i12, Utilities.Callback callback) {
        this.c = i10;
        this.d = j3;
        this.e = i11;
        this.f = i12;
        this.x = new a1.e(27, this, callback);
        if (i11 != 0 || i12 <= 0) {
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
        long j3 = messageObject.messageOwner.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3 * 1000);
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
        sb2.append(u8.h0(list));
        com.google.android.gms.internal.vision.e2.t("}", sb2);
        if (list == null) {
            return;
        }
        boolean z10 = false;
        for (int i10 = 0; i10 < list.size(); i10++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i10);
            if (storyItem != null) {
                Integer valueOf = Integer.valueOf(storyItem.id);
                AbstractSet abstractSet = this.l;
                boolean contains = abstractSet.contains(valueOf);
                AbstractSet abstractSet2 = this.k;
                if (contains || abstractSet2.contains(Integer.valueOf(storyItem.id))) {
                    abstractSet.remove(Integer.valueOf(storyItem.id));
                    abstractSet2.remove(Integer.valueOf(storyItem.id));
                    int i11 = this.s;
                    if (i11 != -1) {
                        this.s = i11 - 1;
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
            int i10 = this.c;
            tL_updateAlbum.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            tL_updateAlbum.album_id = this.f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i10).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i10 = this.c;
        int i11 = MessagesController.getInstance(i10).storiesPinnedToTopCountMax;
        if (arrayList2.size() > i11) {
            arrayList2.subList(i11, arrayList2.size()).clear();
        }
        ArrayList arrayList3 = this.g;
        if (arrayList3.size() == arrayList2.size()) {
            for (int i12 = 0; i12 < arrayList3.size() && arrayList3.get(i12) == arrayList2.get(i12); i12++) {
            }
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        d(false);
        if (z10) {
            TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
            tL_togglePinnedToTop.id.addAll(arrayList3);
            tL_togglePinnedToTop.peer = MessagesController.getInstance(i10).getInputPeer(this.d);
            ConnectionsManager.getInstance(i10).sendRequest(tL_togglePinnedToTop, new c7(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i10;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i11 = this.e;
        sb2.append(i11);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(u8.h0(list));
        com.google.android.gms.internal.vision.e2.t("}", sb2);
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        boolean z11 = false;
        while (true) {
            int size = list.size();
            i10 = this.f;
            if (i12 >= size) {
                break;
            }
            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) list.get(i12);
            if (storyItem2 != null) {
                Integer valueOf = Integer.valueOf(storyItem2.id);
                AbstractSet abstractSet = this.l;
                boolean contains = abstractSet.contains(valueOf);
                AbstractSet abstractSet2 = this.k;
                boolean z12 = contains || abstractSet2.contains(Integer.valueOf(storyItem2.id));
                boolean z13 = i11 == 1 || storyItem2.pinned;
                if (i10 > 0) {
                    ArrayList<Integer> arrayList2 = storyItem2.albums;
                    z13 = arrayList2 != null && arrayList2.contains(Integer.valueOf(i10));
                }
                if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                    z13 = false;
                }
                HashMap hashMap = this.j;
                if (z12 != z13) {
                    if (!z13) {
                        i2.g.o(storyItem2.id, new StringBuilder("StoriesList remove story "));
                        u(storyItem2.id, true);
                        int i13 = this.s;
                        if (i13 != -1) {
                            this.s = i13 - 1;
                        }
                    } else if (this.r) {
                        FileLog.d("StoriesList put story " + storyItem2.id);
                        t(y(storyItem2), false);
                        arrayList.add(Integer.valueOf(storyItem2.id));
                        int i14 = this.s;
                        if (i14 != -1) {
                            this.s = i14 + 1;
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
                    i2.g.o(storyItem2.id, new StringBuilder("StoriesList update story "));
                    hashMap.put(Integer.valueOf(storyItem2.id), y(storyItem2));
                }
                z11 = true;
            }
            i12++;
        }
        if (i10 > 0 && !arrayList.isEmpty()) {
            B(arrayList, false);
        }
        if (z11) {
            d(true);
            x();
        }
    }

    public final void E(int i10, ArrayList arrayList, boolean z10) {
        TL_stories.StoryItem storyItem;
        int size = arrayList.size();
        boolean z11 = false;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            num.getClass();
            MessageObject messageObject = (MessageObject) this.j.get(num);
            if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                Integer valueOf = Integer.valueOf(i10);
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
        Long l4;
        return B == null || (l4 = (Long) B.get(Integer.valueOf(Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.e), Long.valueOf(this.d), Integer.valueOf(this.f))))) == null || System.currentTimeMillis() - l4.longValue() > 120000;
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
        int i10 = this.f;
        int i11 = this.e;
        if (i11 == 0 && i10 <= 0) {
            int size = arrayList3.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList3.get(i12);
                i12++;
                Integer num = (Integer) obj;
                num.getClass();
                MessageObject messageObject = (MessageObject) hashMap.get(num);
                if (e(messageObject, z10, z11)) {
                    arrayList2.add(messageObject);
                }
            }
        }
        int i13 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (Integer num2 : this.l) {
            int intValue = num2.intValue();
            MessageObject messageObject2 = (MessageObject) hashMap.get(num2);
            if (i11 != 0 || i10 > 0 || !arrayList3.contains(num2)) {
                if (e(messageObject2, z10, z11)) {
                    arrayList2.add(messageObject2);
                }
                if (intValue < i13) {
                    i13 = intValue;
                }
            }
        }
        if (!this.r) {
            Iterator it = this.k.iterator();
            while (it.hasNext() && (this.s == -1 || arrayList2.size() < this.s)) {
                Integer num3 = (Integer) it.next();
                int intValue2 = num3.intValue();
                if (i11 != 0 || i10 > 0 || !arrayList3.contains(num3)) {
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
            g8 g8Var = this.q;
            AndroidUtilities.cancelRunOnUIThread(g8Var);
            AndroidUtilities.runOnUIThread(g8Var);
        }
    }

    public MessageObject f(int i10) {
        return (MessageObject) this.j.get(Integer.valueOf(i10));
    }

    public int g() {
        boolean z10 = this.o;
        ArrayList arrayList = this.i;
        return (z10 && this.n) ? this.s < 0 ? arrayList.size() : Math.max(arrayList.size(), this.s) : arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a4.e(11));
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        int i11 = this.e;
        if (i11 == 0 && this.f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.i;
            int size = arrayList4.size();
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                arrayList3.add(Integer.valueOf(((MessageObject) obj).storyItem.id));
            }
            arrayList2.add(arrayList3);
            return arrayList2;
        }
        ArrayList arrayList5 = this.g;
        if (i11 == 0 && !arrayList5.isEmpty()) {
            arrayList2.add(new ArrayList(arrayList5));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            TreeSet treeSet = (TreeSet) hashMap.get((Long) obj2);
            if (treeSet != null) {
                ArrayList arrayList6 = new ArrayList(treeSet);
                if (i11 == 0 && !arrayList5.isEmpty()) {
                    int size3 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size3) {
                        Object obj3 = arrayList5.get(i13);
                        i13++;
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
        messagesStorage.getStorageQueue().postRunnable(new i8(this, messagesStorage, 1));
    }

    public boolean k() {
        return this.t || this.u;
    }

    public boolean l() {
        return this.l.isEmpty() && a();
    }

    public final boolean m(int i10) {
        if (this.e != 0 || this.f > 0) {
            return false;
        }
        return this.g.contains(Integer.valueOf(i10));
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
        int i10 = this.a;
        this.a = i10 + 1;
        this.b.add(Integer.valueOf(i10));
        a1.e eVar = this.x;
        if (eVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eVar);
        }
        return i10;
    }

    public final void p(int i10, boolean z10) {
        q(i10, Collections.EMPTY_LIST, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean q(int i10, List list, boolean z10) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i11;
        if (this.u || ((this.r || this.w || !a()) && !z10)) {
            return false;
        }
        if (this.t) {
            this.y = new j8(this, z10, i10, list);
            return false;
        }
        int i12 = this.e;
        long j3 = this.d;
        int i13 = this.c;
        if (i12 == 0 && (i11 = this.f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i11;
            tL_stories_getAlbumStories.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = this.l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i12 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i12 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            tL_stories_getStoriesByID.id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = MessagesController.getInstance(i13).getInputPeer(j3);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i10;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i12);
        sb2.append("{");
        sb2.append(j3);
        com.google.android.gms.internal.vision.e2.t("} load", sb2);
        this.u = true;
        this.A = ConnectionsManager.getInstance(i13).sendRequest(tL_stories_getStoriesArchive, new p7(this, n10, 1));
        return true;
    }

    public boolean r(int i10) {
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i10));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i11 = this.c;
        tL_stories_incrementStoryViews.peer = MessagesController.getInstance(i11).getInputPeer(this.d);
        tL_stories_incrementStoryViews.id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(i11).sendRequest(tL_stories_incrementStoryViews, new c7(8));
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesReadUpdated, new Object[0]);
        return true;
    }

    public void s() {
        if (this.t || this.u || this.w) {
            return;
        }
        this.t = true;
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.c);
        messagesStorage.getStorageQueue().postRunnable(new i8(this, messagesStorage, 0));
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

    public final void u(int i10, boolean z10) {
        MessageObject messageObject = (MessageObject) this.j.remove(Integer.valueOf(i10));
        if (z10) {
            this.k.remove(Integer.valueOf(i10));
        }
        this.l.remove(Integer.valueOf(i10));
        this.g.remove(Integer.valueOf(i10));
        if (messageObject != null) {
            long b10 = b(messageObject);
            Long valueOf = Long.valueOf(b10);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i10));
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
        messagesStorage.getStorageQueue().postRunnable(new androidx.car.app.utils.b(this, arrayList, messagesStorage, arrayList2, 4));
    }

    public final MessageObject y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.id;
        MessageObject messageObject = new MessageObject(this.c, storyItem);
        messageObject.generateThumbs(false);
        return messageObject;
    }

    public final void z(int i10) {
        a1.e eVar;
        Integer valueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.b;
        arrayList.remove(valueOf);
        if (!arrayList.isEmpty() || (eVar = this.x) == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(eVar);
        AndroidUtilities.runOnUIThread(eVar, 300000L);
    }
}
