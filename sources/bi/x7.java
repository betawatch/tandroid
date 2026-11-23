package bi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class x7 implements di.q8 {
    public final int a;
    public final long b;
    public final y10 c;
    public int e;
    public long i;
    public String q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
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
    public w7 p = w7.a;
    public boolean z = false;
    public int A = -1;

    public x7(int i7, long j3, y10 y10Var) {
        this.a = i7;
        this.b = j3;
        this.c = y10Var;
        j();
        for (int size = j8.U.size() - 1; size >= 0; size--) {
            ArrayList arrayList = j8.U;
            if (((WeakReference) arrayList.get(size)).get() == null) {
                arrayList.remove(size);
            }
        }
        j8.U.add(new WeakReference(this));
    }

    @Override // di.q8
    public final void a() {
        l(false);
    }

    @Override // di.q8
    public final int b(int i7) {
        return -1;
    }

    @Override // di.q8
    public final int c() {
        return this.e;
    }

    @Override // di.q8
    public final int e() {
        return this.d.size();
    }

    public final boolean f() {
        if (this.x || this.v) {
            return false;
        }
        int i7 = this.a;
        return ((org.telegram.messenger.h0) np.u1(i7).A7.t.b).c && ((org.telegram.messenger.h0) np.u1(i7).A7.p0.b).c;
    }

    public final boolean g() {
        return !"hidden".equals(org.telegram.messenger.p0.i(np.u1(this.a).A7.v));
    }

    @Override // di.q8
    public final Object get(int i7) {
        return this.d.get(i7);
    }

    public final boolean h() {
        return !"hidden".equals(org.telegram.messenger.p0.i(np.u1(this.a).A7.w));
    }

    public final void i() {
        if (this.A >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.A, true);
            this.A = -1;
        }
        this.y = false;
    }

    @Override // di.q8
    public final int indexOf(Object obj) {
        return this.d.indexOf(obj);
    }

    public final void j() {
        org.telegram.messenger.p0 p0Var = np.u1(this.a).A7;
        this.r = "default".equals(org.telegram.messenger.p0.i(p0Var.v));
        this.s = "default".equals(org.telegram.messenger.p0.i(p0Var.w));
        boolean f10 = f();
        this.t = f10;
        if (this.r || this.s || f10) {
            return;
        }
        this.r = g();
        this.s = h();
    }

    public final boolean k() {
        return (!this.r || this.s || this.t) ? false : true;
    }

    public final void l(boolean z10) {
        if (this.y) {
            return;
        }
        if (z10 || !this.z) {
            int i7 = 0;
            if (!this.x && !this.w && ((!this.r || !g()) && ((!this.s || !h()) && (!this.t || !f())))) {
                boolean z11 = this.z;
                ArrayList arrayList = this.d;
                boolean z12 = (z11 && arrayList.isEmpty() && this.e == 0) ? false : true;
                this.z = true;
                this.q = null;
                arrayList.clear();
                this.e = 0;
                this.u = 0;
                this.m.clear();
                this.n.clear();
                this.o.clear();
                if (!z12 || this.c == null) {
                    return;
                }
                org.telegram.messenger.g0.g3(new a3.f(this, 28));
                return;
            }
            this.y = true;
            TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
            getresalestargifts.gift_id = this.b;
            String str = this.q;
            if (str == null) {
                str = "";
            }
            getresalestargifts.offset = str;
            getresalestargifts.limit = 15;
            boolean z13 = this.x;
            getresalestargifts.for_craft = z13;
            if (!z13 && !this.w) {
                getresalestargifts.stars_only = this.r && g();
                getresalestargifts.ton_only = this.s && h();
                getresalestargifts.fragment_only = this.t && f();
            }
            w7 w7Var = this.p;
            if (w7Var == w7.c) {
                getresalestargifts.sort_by_num = true;
                getresalestargifts.sort_by_price = false;
            } else if (w7Var == w7.b) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = false;
            } else if (w7Var == w7.a) {
                getresalestargifts.sort_by_num = false;
                getresalestargifts.sort_by_price = true;
            }
            long j3 = this.i;
            ArrayList arrayList2 = this.h;
            ArrayList arrayList3 = this.g;
            ArrayList arrayList4 = this.f;
            if (j3 != 0) {
                getresalestargifts.flags = 1 | getresalestargifts.flags;
                getresalestargifts.attributes_hash = j3;
            } else if (arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
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
                    int size = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                        if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.id))) {
                            TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                            stargiftattributeidmodel.document_id = stargiftattributemodel.document.id;
                            getresalestargifts.attributes.add(stargiftattributeidmodel);
                        }
                    }
                }
                if (!hashSet3.isEmpty()) {
                    int size2 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = arrayList3.get(i11);
                        i11++;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj2;
                        if (!hashSet3.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                            TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                            stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                            getresalestargifts.attributes.add(stargiftattributeidbackdrop);
                        }
                    }
                }
                if (!hashSet2.isEmpty()) {
                    int size3 = arrayList2.size();
                    while (i7 < size3) {
                        Object obj3 = arrayList2.get(i7);
                        i7++;
                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                        if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                            TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                            stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                            getresalestargifts.attributes.add(stargiftattributeidpattern);
                        }
                    }
                }
            }
            this.A = ConnectionsManager.getInstance(this.a).sendRequest(getresalestargifts, new o1(2, this, getresalestargifts));
        }
    }

    public final void m() {
        i();
        this.q = null;
        this.d.clear();
        l(true);
        y10 y10Var = this.c;
        if (y10Var != null) {
            y10Var.a(Boolean.TRUE);
        }
    }

    public final void n(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ArrayList arrayList;
        String str;
        int i7 = 0;
        while (true) {
            arrayList = this.d;
            if (i7 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i7);
            if (tL_starGiftUnique2 == tL_starGiftUnique || ((str = tL_starGiftUnique2.slug) != null && str.equals(tL_starGiftUnique.slug))) {
                break;
            } else {
                i7++;
            }
        }
        arrayList.remove(i7);
        int i10 = this.e;
        if (i10 > 0) {
            this.e = i10 - 1;
        }
        y10 y10Var = this.c;
        if (y10Var != null) {
            y10Var.a(Boolean.FALSE);
        }
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        boolean z14 = z10 && g();
        boolean z15 = z11 && h();
        if (z12 && f()) {
            z13 = true;
        }
        if (z14 || z15 || z13) {
            if (this.r == z14 && this.s == z15 && this.t == z13) {
                return;
            }
            this.r = z14;
            this.s = z15;
            this.t = z13;
            m();
        }
    }

    public final void p(w7 w7Var) {
        if (this.p != w7Var) {
            this.p = w7Var;
            m();
        }
    }

    @Override // di.q8
    public final void d() {
    }
}
