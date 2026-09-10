package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g {
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
    public final j a;
    public final o1 b;
    public final b2.x0 c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f;
    public final j1 g;
    public final e9.i0 h;
    public final e9.i0 i;
    public final MediaSession.Token j;
    public final e9.i0 k;

    static {
        String str = e2.d0.a;
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

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, o1 o1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, j1 j1Var, MediaSession.Token token) {
        this.a = jVar;
        this.h = i0Var;
        this.i = i0Var2;
        this.k = i0Var3;
        this.b = o1Var;
        this.c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f = bundle2;
        this.g = j1Var;
        this.j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, 1008001300);
        bundle.putBinder(m, this.a.asBinder());
        bundle.putParcelable(n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            Iterator<E> it = i0Var.iterator();
            if (it.hasNext()) {
                a4.a.y(it.next());
                throw null;
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        e9.i0 i0Var2 = this.i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (it2.hasNext()) {
                    a4.a.y(it2.next());
                    throw null;
                }
                bundle.putParcelableArrayList(p, arrayList2);
            } else {
                e9.a1 a2 = a.a(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(a2.d);
                e9.g0 listIterator = a2.listIterator(0);
                if (listIterator.hasNext()) {
                    a4.a.y(listIterator.next());
                    throw null;
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        e9.i0 i0Var3 = this.k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (it3.hasNext()) {
                a4.a.y(it3.next());
                throw null;
            }
            bundle.putParcelableArrayList(q, arrayList4);
        }
        o1 o1Var = this.b;
        o1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = o1Var.a.iterator();
        while (it4.hasNext()) {
            n1 n1Var = (n1) it4.next();
            n1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(n1.f, n1Var.a);
            bundle3.putString(n1.g, n1Var.b);
            bundle3.putBundle(n1.h, n1Var.c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(o1.b, arrayList5);
        bundle.putBundle(r, bundle2);
        String str2 = s;
        b2.x0 x0Var = this.c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(u, this.e);
        bundle.putBundle(v, this.f);
        bundle.putBundle(w, this.g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(x, 5);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(y, token);
        }
        return bundle;
    }
}
