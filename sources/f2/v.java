package f2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class v {
    public Object a;
    public Object b;

    public v(Context context) {
        this.a = context;
    }

    public void c() {
        af.c cVar = (af.c) this.a;
        if (cVar != null) {
            try {
                ((g.q) this.b).e.unregisterReceiver(cVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof l0.a)) {
            return menuItem;
        }
        l0.a aVar = (l0.a) menuItem;
        if (((a0.k) this.b) == null) {
            this.b = new a0.k(0);
        }
        MenuItem menuItem2 = (MenuItem) ((a0.k) this.b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l.r rVar = new l.r((Context) this.a, aVar);
        ((a0.k) this.b).put(aVar, rVar);
        return rVar;
    }

    public int g(int i10, int i11) {
        int i12 = i(i10);
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = i(i15);
            i13 += i16;
            if (i13 == i11) {
                i14++;
                i13 = 0;
            } else if (i13 > i11) {
                i14++;
                i13 = i16;
            }
        }
        return i13 + i12 > i11 ? i14 + 1 : i14;
    }

    public int h(int i10, int i11) {
        int i12 = i(i10);
        if (i12 == i11) {
            return 0;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i(i14);
            i13 += i15;
            if (i13 == i11) {
                i13 = 0;
            } else if (i13 > i11) {
                i13 = i15;
            }
        }
        if (i12 + i13 <= i11) {
            return i13;
        }
        return 0;
    }

    public abstract int i(int i10);

    public void j() {
        ((SparseIntArray) this.a).clear();
    }

    public abstract void k();

    public void l() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((af.c) this.a) == null) {
            this.a = new af.c(this, 5);
        }
        ((g.q) this.b).e.registerReceiver((af.c) this.a, d);
    }

    public v() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public v(g.q qVar) {
        this.b = qVar;
    }
}
