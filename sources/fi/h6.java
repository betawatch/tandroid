package fi;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public class h6 {
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
    public final l4 x;
    public g6 y;
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
    public final e6 q = new e6(this, 0);
    public int s = -1;
    public int A = -1;

    public h6(int i7, long j3, int i10, int i11, w10 w10Var) {
        this.c = i7;
        this.d = j3;
        this.e = i10;
        this.f = i11;
        this.x = new l4(5, this, w10Var);
        if (i10 != 0 || i11 <= 0) {
            this.k = new TreeSet(Comparator$-CC.reverseOrder());
            this.l = new TreeSet(Comparator$-CC.reverseOrder());
        } else {
            this.k = new LinkedHashSet();
            this.l = new LinkedHashSet();
        }
        s();
    }

    public static long b(fj fjVar) {
        if (fjVar == null) {
            return 0L;
        }
        long j3 = fjVar.k.date;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3 * 1000);
        return (calendar.get(2) * 100) + (calendar.get(1) * 10000) + calendar.get(5);
    }

    public static boolean e(fj fjVar, boolean z10, boolean z11) {
        if (fjVar == null || !fjVar.x4()) {
            return false;
        }
        if (z10 && fj.S3(fjVar.k)) {
            return true;
        }
        return (z11 && fj.L4(fjVar.k)) || (fjVar.l.media instanceof TLRPC.TL_messageMediaUnsupported);
    }

    public static void v(AbstractSet abstractSet, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
        sb2.append(p6.k0(list));
        p5.c.s("}", sb2);
        if (list == null) {
            return;
        }
        boolean z10 = false;
        for (int i7 = 0; i7 < list.size(); i7++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) list.get(i7);
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
            int i7 = this.c;
            tL_updateAlbum.peer = mp.u1(i7).l1(this.d);
            tL_updateAlbum.album_id = this.f;
            tL_updateAlbum.order = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(i7).sendRequest(tL_updateAlbum, null);
        }
    }

    public void C(ArrayList arrayList, boolean z10) {
        if (this.f > 0) {
            B(arrayList, z10);
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i7 = this.c;
        int i10 = mp.u1(i7).Q5;
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
            tL_togglePinnedToTop.peer = mp.u1(i7).l1(this.d);
            ConnectionsManager.getInstance(i7).sendRequest(tL_togglePinnedToTop, new l5(3));
        }
    }

    public final void D(List list, boolean z10) {
        int i7;
        fj fjVar;
        TL_stories.StoryItem storyItem;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        int i10 = this.e;
        sb2.append(i10);
        sb2.append("{");
        sb2.append(this.d);
        sb2.append("} updateStories {");
        sb2.append(p6.k0(list));
        p5.c.s("}", sb2);
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            int size = list.size();
            i7 = this.f;
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
                if (i7 > 0) {
                    ArrayList<Integer> arrayList2 = storyItem2.albums;
                    z13 = arrayList2 != null && arrayList2.contains(Integer.valueOf(i7));
                }
                if (storyItem2 instanceof TL_stories.TL_storyItemDeleted) {
                    z13 = false;
                }
                HashMap hashMap = this.j;
                if (z12 != z13) {
                    if (!z13) {
                        i5.c.t(storyItem2.id, new StringBuilder("StoriesList remove story "));
                        u(storyItem2.id, true);
                        int i12 = this.s;
                        if (i12 != -1) {
                            this.s = i12 - 1;
                        }
                    } else if (this.r) {
                        org.telegram.messenger.a8.b("StoriesList put story " + storyItem2.id);
                        t(y(storyItem2), false);
                        arrayList.add(Integer.valueOf(storyItem2.id));
                        int i13 = this.s;
                        if (i13 != -1) {
                            this.s = i13 + 1;
                        }
                    } else if (!this.u) {
                        org.telegram.messenger.a8.b("StoriesList cannot put story " + storyItem2.id + " -> reload");
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
                        p(Utilities.j(size2, 50, 10), true);
                    }
                } else if (z12 && z13 && ((fjVar = (fj) hashMap.get(Integer.valueOf(storyItem2.id))) == null || z10 || (storyItem = fjVar.l) == null || (storyItem != storyItem2 && (storyItem.id != storyItem2.id || storyItem.media != storyItem2.media || !TextUtils.equals(storyItem.caption, storyItem2.caption))))) {
                    i5.c.t(storyItem2.id, new StringBuilder("StoriesList update story "));
                    hashMap.put(Integer.valueOf(storyItem2.id), y(storyItem2));
                }
                z11 = true;
            }
            i11++;
        }
        if (i7 > 0 && !arrayList.isEmpty()) {
            B(arrayList, false);
        }
        if (z11) {
            d(true);
            x();
        }
    }

    public final void E(int i7, ArrayList arrayList, boolean z10) {
        TL_stories.StoryItem storyItem;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            num.getClass();
            fj fjVar = (fj) this.j.get(num);
            if (fjVar != null && (storyItem = fjVar.l) != null) {
                HashSet hashSet = storyItem.albums != null ? new HashSet(storyItem.albums) : new HashSet();
                Integer valueOf = Integer.valueOf(i7);
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

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009f, code lost:
    
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
        int i7 = this.f;
        int i10 = this.e;
        if (i10 == 0 && i7 <= 0) {
            int size = arrayList3.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList3.get(i11);
                i11++;
                Integer num = (Integer) obj;
                num.getClass();
                fj fjVar = (fj) hashMap.get(num);
                if (e(fjVar, z10, z11)) {
                    arrayList2.add(fjVar);
                }
            }
        }
        int i12 = Integer.MAX_VALUE;
        for (Integer num2 : this.l) {
            int intValue = num2.intValue();
            fj fjVar2 = (fj) hashMap.get(num2);
            if (i10 != 0 || i7 > 0 || !arrayList3.contains(num2)) {
                if (e(fjVar2, z10, z11)) {
                    arrayList2.add(fjVar2);
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
                if (i10 != 0 || i7 > 0 || !arrayList3.contains(num3)) {
                    fj fjVar3 = (fj) hashMap.get(num3);
                    if (e(fjVar3, z10, z11)) {
                        arrayList2.add(fjVar3);
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
            e6 e6Var = this.q;
            org.telegram.messenger.g0.r(e6Var);
            org.telegram.messenger.g0.g3(e6Var);
        }
    }

    public fj f(int i7) {
        return (fj) this.j.get(Integer.valueOf(i7));
    }

    public int g() {
        boolean z10 = this.o;
        ArrayList arrayList = this.i;
        return (z10 && this.n) ? this.s < 0 ? arrayList.size() : Math.max(arrayList.size(), this.s) : arrayList.size();
    }

    public ArrayList h() {
        HashMap hashMap = this.h;
        ArrayList arrayList = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList, new a3.c(25));
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        int i10 = this.e;
        if (i10 == 0 && this.f > 0) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.i;
            int size = arrayList4.size();
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                arrayList3.add(Integer.valueOf(((fj) obj).l.id));
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
        tr a02 = tr.a0(this.c);
        a02.a.c(new f6(this, a02, 1));
    }

    public boolean k() {
        return this.t || this.u;
    }

    public boolean l() {
        return this.l.isEmpty() && a();
    }

    public final boolean m(int i7) {
        if (this.e != 0 || this.f > 0) {
            return false;
        }
        return this.g.contains(Integer.valueOf(i7));
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
        int i7 = this.a;
        this.a = i7 + 1;
        this.b.add(Integer.valueOf(i7));
        l4 l4Var = this.x;
        if (l4Var != null) {
            org.telegram.messenger.g0.r(l4Var);
        }
        return i7;
    }

    public final void p(int i7, boolean z10) {
        q(i7, Collections.EMPTY_LIST, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean q(int i7, List list, boolean z10) {
        int n10;
        TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive;
        int i10;
        if (this.u || ((this.r || this.w || !a()) && !z10)) {
            return false;
        }
        if (this.t) {
            this.y = new g6(this, z10, i7, list);
            return false;
        }
        int i11 = this.e;
        long j3 = this.d;
        int i12 = this.c;
        if (i11 == 0 && (i10 = this.f) > 0) {
            TL_stories.TL_stories_getAlbumStories tL_stories_getAlbumStories = new TL_stories.TL_stories_getAlbumStories();
            tL_stories_getAlbumStories.album_id = i10;
            tL_stories_getAlbumStories.peer = mp.u1(i12).l1(j3);
            n10 = this.l.size();
            tL_stories_getAlbumStories.offset = n10;
            tL_stories_getAlbumStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getAlbumStories;
        } else if (i11 == 0) {
            TL_stories.TL_stories_getPinnedStories tL_stories_getPinnedStories = new TL_stories.TL_stories_getPinnedStories();
            tL_stories_getPinnedStories.peer = mp.u1(i12).l1(j3);
            n10 = n();
            tL_stories_getPinnedStories.offset_id = n10;
            tL_stories_getPinnedStories.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getPinnedStories;
        } else if (i11 == 2) {
            TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
            tL_stories_getStoriesByID.peer = mp.u1(i12).l1(j3);
            tL_stories_getStoriesByID.id.addAll(list);
            n10 = -1;
            tL_stories_getStoriesArchive = tL_stories_getStoriesByID;
        } else {
            TL_stories.TL_stories_getStoriesArchive tL_stories_getStoriesArchive2 = new TL_stories.TL_stories_getStoriesArchive();
            tL_stories_getStoriesArchive2.peer = mp.u1(i12).l1(j3);
            n10 = n();
            tL_stories_getStoriesArchive2.offset_id = n10;
            tL_stories_getStoriesArchive2.limit = i7;
            tL_stories_getStoriesArchive = tL_stories_getStoriesArchive2;
        }
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(i11);
        sb2.append("{");
        sb2.append(j3);
        p5.c.s("} load", sb2);
        this.u = true;
        this.A = ConnectionsManager.getInstance(i12).sendRequest(tL_stories_getStoriesArchive, new di.w1(this, n10, 4));
        return true;
    }

    public boolean r(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        HashSet hashSet = this.m;
        if (hashSet.contains(valueOf)) {
            return false;
        }
        hashSet.add(Integer.valueOf(i7));
        x();
        TL_stories.TL_stories_incrementStoryViews tL_stories_incrementStoryViews = new TL_stories.TL_stories_incrementStoryViews();
        int i10 = this.c;
        tL_stories_incrementStoryViews.peer = mp.u1(i10).l1(this.d);
        tL_stories_incrementStoryViews.id.add(Integer.valueOf(i7));
        ConnectionsManager.getInstance(i10).sendRequest(tL_stories_incrementStoryViews, new l5(9));
        ks.f(i10).k(ks.I5, new Object[0]);
        return true;
    }

    public void s() {
        if (this.t || this.u || this.w) {
            return;
        }
        this.t = true;
        tr a02 = tr.a0(this.c);
        a02.a.c(new f6(this, a02, 0));
    }

    public final void t(fj fjVar, boolean z10) {
        if (fjVar == null) {
            return;
        }
        this.j.put(Integer.valueOf(fjVar.e1()), fjVar);
        (z10 ? this.k : this.l).add(Integer.valueOf(fjVar.e1()));
        long b10 = b(fjVar);
        Long valueOf = Long.valueOf(b10);
        HashMap hashMap = this.h;
        TreeSet treeSet = (TreeSet) hashMap.get(valueOf);
        if (treeSet == null) {
            Long valueOf2 = Long.valueOf(b10);
            TreeSet treeSet2 = new TreeSet(Comparator$-CC.reverseOrder());
            hashMap.put(valueOf2, treeSet2);
            treeSet = treeSet2;
        }
        treeSet.add(Integer.valueOf(fjVar.e1()));
    }

    public final void u(int i7, boolean z10) {
        fj fjVar = (fj) this.j.remove(Integer.valueOf(i7));
        if (z10) {
            this.k.remove(Integer.valueOf(i7));
        }
        this.l.remove(Integer.valueOf(i7));
        this.g.remove(Integer.valueOf(i7));
        if (fjVar != null) {
            long b10 = b(fjVar);
            Long valueOf = Long.valueOf(b10);
            HashMap hashMap = this.h;
            Collection collection = (Collection) hashMap.get(valueOf);
            if (collection != null) {
                collection.remove(Integer.valueOf(i7));
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
        tr a02 = tr.a0(this.c);
        a02.a.c(new ai.j(this, arrayList, a02, arrayList2, 19));
    }

    public final fj y(TL_stories.StoryItem storyItem) {
        storyItem.dialogId = this.d;
        storyItem.messageId = storyItem.id;
        fj fjVar = new fj(this.c, storyItem);
        fjVar.r0(false);
        return fjVar;
    }

    public final void z(int i7) {
        l4 l4Var;
        Integer valueOf = Integer.valueOf(i7);
        ArrayList arrayList = this.b;
        arrayList.remove(valueOf);
        if (!arrayList.isEmpty() || (l4Var = this.x) == null) {
            return;
        }
        org.telegram.messenger.g0.r(l4Var);
        org.telegram.messenger.g0.h3(l4Var, 300000L);
    }
}
