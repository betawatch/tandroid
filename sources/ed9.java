// default package

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ed9 implements bxa {
    public boolean A;
    public int B;
    public final int a;
    public final ArrayList b;
    public String c;
    public final pcc d;
    public final ArrayList e;
    public int f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public long j;
    public final HashSet k;
    public final HashSet l;
    public final HashSet m;
    public final HashMap n;
    public final HashMap o;
    public final HashMap p;
    public dd9 q;
    public String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public ed9(int i, long j, pcc pccVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.e = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new HashSet();
        this.l = new HashSet();
        this.m = new HashSet();
        this.n = new HashMap();
        this.o = new HashMap();
        this.p = new HashMap();
        this.q = dd9.a;
        this.A = false;
        this.B = -1;
        this.a = i;
        arrayList.add(Long.valueOf(j));
        this.d = pccVar;
        j();
        for (int size = nd9.c0.size() - 1; size >= 0; size--) {
            ArrayList arrayList2 = nd9.c0;
            if (((WeakReference) arrayList2.get(size)).get() == null) {
                arrayList2.remove(size);
            }
        }
        nd9.c0.add(new WeakReference(this));
    }

    @Override // bxa
    public final void a() {
        o(false);
    }

    @Override // bxa
    public final int b(int i) {
        return -1;
    }

    @Override // bxa
    public final int c() {
        return this.f;
    }

    @Override // bxa
    public final int e() {
        return this.e.size();
    }

    public final boolean f() {
        return (this.y || this.w || l() || !uc7.s1(this.a).l4.s.f || !uc7.s1(this.a).l4.v0.f) ? false : true;
    }

    public final boolean g() {
        return !"hidden".equals(hr.a(uc7.s1(this.a).l4.u));
    }

    @Override // bxa
    public final Object get(int i) {
        return this.e.get(i);
    }

    public final boolean h() {
        hr hrVar = uc7.s1(this.a).l4;
        return hrVar.v0.f && !"hidden".equals(hr.a(hrVar.v));
    }

    public final void i() {
        if (this.B >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.B, true);
            this.B = -1;
        }
        this.z = false;
    }

    @Override // bxa
    public final int indexOf(Object obj) {
        return this.e.indexOf(obj);
    }

    public final void j() {
        hr hrVar = uc7.s1(this.a).l4;
        this.s = "default".equals(hr.a(hrVar.u));
        this.t = "default".equals(hr.a(hrVar.v)) && h();
        boolean f = f();
        this.u = f;
        if (this.s || this.t || f) {
            return;
        }
        this.s = g();
        this.t = h();
    }

    public final void k(ArrayList arrayList, boolean z) {
        int i = 0;
        if (z) {
            HashSet hashSet = this.k;
            if (!hashSet.isEmpty()) {
                ArrayList arrayList2 = this.g;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                    if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.id))) {
                        TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                        stargiftattributeidmodel.document_id = stargiftattributemodel.document.id;
                        arrayList.add(stargiftattributeidmodel);
                    }
                }
            }
        }
        HashSet hashSet2 = this.l;
        if (!hashSet2.isEmpty()) {
            ArrayList arrayList3 = this.h;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj2;
                if (!hashSet2.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                    TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                    stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                    arrayList.add(stargiftattributeidbackdrop);
                }
            }
        }
        HashSet hashSet3 = this.m;
        if (hashSet3.isEmpty()) {
            return;
        }
        ArrayList arrayList4 = this.i;
        int size3 = arrayList4.size();
        while (i < size3) {
            Object obj3 = arrayList4.get(i);
            i++;
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
            if (!hashSet3.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                arrayList.add(stargiftattributeidpattern);
            }
        }
    }

    public final boolean l() {
        return this.b.size() > 1 || !TextUtils.isEmpty(this.c);
    }

    public final boolean m() {
        return (!this.s || this.t || this.u) ? false : true;
    }

    public final void n() {
        if (l()) {
            if (this.s && g()) {
                return;
            }
            if (this.t && h()) {
                return;
            }
            this.s = g();
            this.t = h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x01a3, code lost:
    
        if (r14.m.isEmpty() == false) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(boolean z) {
        TL_stars.getResaleStarGifts getresalestargifts;
        if (this.z) {
            return;
        }
        if (z || !this.A) {
            if (!this.y && !this.x && ((!this.s || !g()) && ((!this.t || !h()) && (!this.u || !f())))) {
                boolean z2 = this.A;
                ArrayList arrayList = this.e;
                boolean z3 = (z2 && arrayList.isEmpty() && this.f == 0) ? false : true;
                this.A = true;
                this.r = null;
                arrayList.clear();
                this.f = 0;
                this.v = 0;
                this.n.clear();
                this.o.clear();
                this.p.clear();
                if (!z3 || this.d == null) {
                    return;
                }
                hl.c3(new v59(this, (byte) 3));
                return;
            }
            this.z = true;
            String str = this.r;
            if (str == null) {
                str = "";
            }
            boolean l = l();
            ArrayList arrayList2 = this.i;
            ArrayList arrayList3 = this.h;
            ArrayList arrayList4 = this.g;
            dd9 dd9Var = dd9.a;
            dd9 dd9Var2 = dd9.c;
            ArrayList arrayList5 = this.b;
            if (!l || this.y || this.x) {
                TL_stars.getResaleStarGifts getresalestargifts2 = new TL_stars.getResaleStarGifts();
                getresalestargifts2.gift_id = ((Long) arrayList5.get(0)).longValue();
                getresalestargifts2.offset = str;
                getresalestargifts2.limit = 15;
                boolean z4 = this.y;
                getresalestargifts2.for_craft = z4;
                if (!z4 && !this.x) {
                    getresalestargifts2.stars_only = this.s && g();
                    getresalestargifts2.ton_only = this.t && h();
                    getresalestargifts2.fragment_only = this.u && f();
                }
                dd9 dd9Var3 = this.q;
                getresalestargifts2.sort_by_num = dd9Var3 == dd9Var2;
                getresalestargifts2.sort_by_price = dd9Var3 == dd9Var;
                long j = this.j;
                if (j != 0) {
                    getresalestargifts2.flags |= 1;
                    getresalestargifts2.attributes_hash = j;
                } else if (arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                    getresalestargifts2.flags |= 1;
                    getresalestargifts2.attributes_hash = 0L;
                }
                if (this.k.isEmpty() && this.l.isEmpty()) {
                    getresalestargifts = getresalestargifts2;
                }
                getresalestargifts2.flags |= 8;
                k(getresalestargifts2.attributes, true);
                getresalestargifts = getresalestargifts2;
            } else {
                TL_stars.getResaleStarGiftsMerged getresalestargiftsmerged = new TL_stars.getResaleStarGiftsMerged();
                getresalestargiftsmerged.gift_ids.addAll(arrayList5);
                getresalestargiftsmerged.query = this.c;
                getresalestargiftsmerged.offset = str;
                getresalestargiftsmerged.limit = 15;
                getresalestargiftsmerged.stars_only = this.s && g();
                getresalestargiftsmerged.ton_only = this.t && h();
                dd9 dd9Var4 = this.q;
                getresalestargiftsmerged.sort_by_num = dd9Var4 == dd9Var2;
                getresalestargiftsmerged.sort_by_price = dd9Var4 == dd9Var;
                long j2 = this.j;
                if (j2 != 0) {
                    getresalestargiftsmerged.flags |= 1;
                    getresalestargiftsmerged.attributes_hash = j2;
                } else if (arrayList4.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
                    getresalestargiftsmerged.flags |= 1;
                    getresalestargiftsmerged.attributes_hash = 0L;
                }
                k(getresalestargiftsmerged.attributes, !(arrayList5.size() > 1));
                getresalestargifts = getresalestargiftsmerged;
            }
            this.B = ConnectionsManager.getInstance(this.a).sendRequest(getresalestargifts, new pl7(this, str, (byte) 17));
        }
    }

    public final void p() {
        i();
        this.r = null;
        this.e.clear();
        o(true);
        pcc pccVar = this.d;
        if (pccVar != null) {
            pccVar.a(Boolean.TRUE);
        }
    }

    public final void q(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ArrayList arrayList;
        String str;
        int i = 0;
        while (true) {
            arrayList = this.e;
            if (i >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i);
            if (tL_starGiftUnique2 == tL_starGiftUnique || ((str = tL_starGiftUnique2.slug) != null && str.equals(tL_starGiftUnique.slug))) {
                break;
            } else {
                i++;
            }
        }
        arrayList.remove(i);
        int i2 = this.f;
        if (i2 > 0) {
            this.f = i2 - 1;
        }
        pcc pccVar = this.d;
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
        }
    }

    public final void r(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        boolean z5 = z && g();
        boolean z6 = z2 && h();
        if (z3 && f()) {
            z4 = true;
        }
        if (z5 || z6 || z4) {
            if (this.s == z5 && this.t == z6 && this.u == z4) {
                return;
            }
            this.s = z5;
            this.t = z6;
            this.u = z4;
            p();
        }
    }

    public final void s(String str) {
        String trim = str == null ? null : str.trim();
        String str2 = TextUtils.isEmpty(trim) ? null : trim;
        if (TextUtils.equals(this.c, str2)) {
            return;
        }
        this.c = str2;
        n();
        p();
    }

    public final void t(dd9 dd9Var) {
        if (this.q != dd9Var) {
            this.q = dd9Var;
            p();
        }
    }

    @Override // bxa
    public final void d() {
    }
}
