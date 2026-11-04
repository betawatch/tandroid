package o4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import b8.xe;
import g9.g2;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final o1 b;
    public final d2.a1 c;
    public final d2.a1 d;
    public final Bundle e;
    public final Bundle f;
    public final j1 g;
    public final g9.i0 h;
    public final g9.i0 i;
    public final MediaSession.Token j;
    public final g9.i0 k;

    static {
        String str = g2.n0.a;
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

    public j(m mVar, g9.i0 i0Var, g9.i0 i0Var2, g9.i0 i0Var3, o1 o1Var, d2.a1 a1Var, d2.a1 a1Var2, Bundle bundle, Bundle bundle2, j1 j1Var, MediaSession.Token token) {
        this.a = mVar;
        this.h = i0Var;
        this.i = i0Var2;
        this.k = i0Var3;
        this.b = o1Var;
        this.c = a1Var;
        this.d = a1Var2;
        this.e = bundle;
        this.f = bundle2;
        this.g = j1Var;
        this.j = token;
    }

    public final Bundle a(int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, 1010001300);
        bundle.putBinder(m, this.a.asBinder());
        bundle.putParcelable(n, null);
        g9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i0Var.get(i10);
                i10++;
                arrayList.add(((d) obj).k(i3));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        g9.i0 i0Var2 = this.i;
        if (!i0Var2.isEmpty()) {
            if (i3 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                int size2 = i0Var2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = i0Var2.get(i11);
                    i11++;
                    arrayList2.add(((d) obj2).k(i3));
                }
                bundle.putParcelableArrayList(p, arrayList2);
            } else {
                g9.s1 g7 = d.g(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g7.d);
                g9.g0 listIterator = g7.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((d) listIterator.next()).k(i3));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        g9.i0 i0Var3 = this.k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i3));
            }
            bundle.putParcelableArrayList(q, arrayList4);
        }
        o1 o1Var = this.b;
        o1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        g2 it = o1Var.a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((n1) it.next()).a());
        }
        bundle2.putParcelableArrayList(o1.b, arrayList5);
        bundle.putBundle(r, bundle2);
        String str2 = s;
        d2.a1 a1Var = this.c;
        bundle.putBundle(str2, a1Var.b());
        String str3 = t;
        d2.a1 a1Var2 = this.d;
        bundle.putBundle(str3, a1Var2.b());
        bundle.putBundle(u, this.e);
        bundle.putBundle(v, this.f);
        bundle.putBundle(w, this.g.e(xe.a(a1Var, a1Var2), false, false).f(i3));
        bundle.putInt(x, 9);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(y, token);
        }
        return bundle;
    }
}
