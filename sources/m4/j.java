package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.m2;
import e9.x1;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class j {
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final m a;
    public final p1 b;
    public final b2.c1 c;
    public final b2.c1 d;
    public final Bundle e;
    public final Bundle f;
    public final k1 g;
    public final e9.n0 h;
    public final e9.n0 i;
    public final MediaSession.Token j;
    public final e9.n0 k;

    static {
        String str = e2.m0.a;
        l = Integer.toString(0, 36);
        m = Integer.toString(1, 36);
        n = Integer.toString(2, 36);
        o = Integer.toString(9, 36);
        p = Integer.toString(14, 36);
        q = Integer.toString(13, 36);
        r = Integer.toString(3, 36);
        s = Integer.toString(4, 36);
        t = Integer.toString(5, 36);
        u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        w = Integer.toString(7, 36);
        x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        y = Integer.toString(12, 36);
    }

    public j(m mVar, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, p1 p1Var, b2.c1 c1Var, b2.c1 c1Var2, Bundle bundle, Bundle bundle2, k1 k1Var, MediaSession.Token token) {
        this.a = mVar;
        this.h = n0Var;
        this.i = n0Var2;
        this.k = n0Var3;
        this.b = p1Var;
        this.c = c1Var;
        this.d = c1Var2;
        this.e = bundle;
        this.f = bundle2;
        this.g = k1Var;
        this.j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, 1010001300);
        bundle.putBinder(m, this.a.asBinder());
        bundle.putParcelable(n, null);
        e9.n0 n0Var = this.h;
        boolean isEmpty = n0Var.isEmpty();
        String str = o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(n0Var.size());
            int size = n0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = n0Var.get(i11);
                i11++;
                arrayList.add(((d) obj).k(i10));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        e9.n0 n0Var2 = this.i;
        if (!n0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(n0Var2.size());
                int size2 = n0Var2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = n0Var2.get(i12);
                    i12++;
                    arrayList2.add(((d) obj2).k(i10));
                }
                bundle.putParcelableArrayList(p, arrayList2);
            } else {
                x1 g10 = d.g(n0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g10.d);
                e9.l0 listIterator = g10.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((d) listIterator.next()).k(i10));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        e9.n0 n0Var3 = this.k;
        if (!n0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(n0Var3.size());
            int size3 = n0Var3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = n0Var3.get(i13);
                i13++;
                arrayList4.add(((d) obj3).k(i10));
            }
            bundle.putParcelableArrayList(q, arrayList4);
        }
        p1 p1Var = this.b;
        p1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        m2 it = p1Var.a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((o1) it.next()).a());
        }
        bundle2.putParcelableArrayList(p1.b, arrayList5);
        bundle.putBundle(r, bundle2);
        String str2 = s;
        b2.c1 c1Var = this.c;
        bundle.putBundle(str2, c1Var.b());
        String str3 = t;
        b2.c1 c1Var2 = this.d;
        bundle.putBundle(str3, c1Var2.b());
        bundle.putBundle(u, this.e);
        bundle.putBundle(v, this.f);
        bundle.putBundle(w, this.g.e(w7.v.a(c1Var, c1Var2), false, false).f(i10));
        bundle.putInt(x, 9);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(y, token);
        }
        return bundle;
    }
}
