package lh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import mh.m7;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b5 implements m7 {
    public final int a;
    public final long b;
    public final Utilities.Callback c;
    public int e;
    public long i;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final ArrayList d = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public final HashSet l = new HashSet();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public final HashMap o = new HashMap();
    public a5 p = a5.b;
    public boolean u = false;
    public int v = -1;

    public b5(long j10, int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = j10;
        this.c = callback;
    }

    @Override // mh.m7
    public final void a() {
        g(false);
    }

    @Override // mh.m7
    public final int b(int i10) {
        return -1;
    }

    @Override // mh.m7
    public final int c() {
        return this.e;
    }

    @Override // mh.m7
    public final int e() {
        return this.d.size();
    }

    public final void f() {
        if (this.v >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.v, true);
            this.v = -1;
        }
        this.t = false;
    }

    public final void g(boolean z4) {
        if (this.t) {
            return;
        }
        if (z4 || !this.u) {
            this.t = true;
            TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
            getresalestargifts.gift_id = this.b;
            String str = this.q;
            if (str == null) {
                str = "";
            }
            getresalestargifts.offset = str;
            getresalestargifts.limit = 15;
            getresalestargifts.for_craft = this.s;
            getresalestargifts.stars_only = this.r;
            a5 a5Var = this.p;
            int i10 = 0;
            if (a5Var == a5.d) {
                getresalestargifts.sort_by_num = true;
                getresalestargifts.sort_by_price = false;
            } else if (a5Var == a5.c) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = false;
            } else if (a5Var == a5.b) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = true;
            }
            long j10 = this.i;
            ArrayList arrayList = this.h;
            ArrayList arrayList2 = this.g;
            ArrayList arrayList3 = this.f;
            if (j10 != 0) {
                getresalestargifts.flags = 1 | getresalestargifts.flags;
                getresalestargifts.attributes_hash = j10;
            } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                getresalestargifts.flags = 1 | getresalestargifts.flags;
                getresalestargifts.attributes_hash = 0L;
            }
            HashSet hashSet = this.j;
            boolean isEmpty = hashSet.isEmpty();
            HashSet hashSet2 = this.l;
            HashSet hashSet3 = this.k;
            if (!isEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                getresalestargifts.flags |= 8;
                if (!hashSet.isEmpty()) {
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                        if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.id))) {
                            TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                            stargiftattributeidmodel.document_id = stargiftattributemodel.document.id;
                            getresalestargifts.attributes.add(stargiftattributeidmodel);
                        }
                    }
                }
                if (!hashSet3.isEmpty()) {
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj2;
                        if (!hashSet3.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                            TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                            stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                            getresalestargifts.attributes.add(stargiftattributeidbackdrop);
                        }
                    }
                }
                if (!hashSet2.isEmpty()) {
                    int size3 = arrayList.size();
                    while (i10 < size3) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                        if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                            TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                            stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                            getresalestargifts.attributes.add(stargiftattributeidpattern);
                        }
                    }
                }
            }
            this.v = ConnectionsManager.getInstance(this.a).sendRequest(getresalestargifts, new eg.b3(4, this, getresalestargifts));
        }
    }

    @Override // mh.m7
    public final Object get(int i10) {
        return this.d.get(i10);
    }

    public final void h() {
        f();
        this.q = null;
        this.d.clear();
        g(true);
        Utilities.Callback callback = this.c;
        if (callback != null) {
            callback.run(Boolean.TRUE);
        }
    }

    public final void i(a5 a5Var) {
        if (this.p != a5Var) {
            this.p = a5Var;
            h();
        }
    }

    @Override // mh.m7
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // mh.m7
    public final void d() {
    }
}
