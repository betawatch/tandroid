package f2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class x {
    public Object a;
    public Object b;

    public x(Context context) {
        this.a = context;
    }

    public void c() {
        androidx.mediarouter.app.h hVar = (androidx.mediarouter.app.h) this.a;
        if (hVar != null) {
            try {
                ((g.q) this.b).e.unregisterReceiver(hVar);
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

    public int g(int i9, int i10) {
        int i11 = i(i9);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i9; i14++) {
            int i15 = i(i14);
            i12 += i15;
            if (i12 == i10) {
                i13++;
                i12 = 0;
            } else if (i12 > i10) {
                i13++;
                i12 = i15;
            }
        }
        return i12 + i11 > i10 ? i13 + 1 : i13;
    }

    public int h(int i9, int i10) {
        int i11 = i(i9);
        if (i11 == i10) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = i(i13);
            i12 += i14;
            if (i12 == i10) {
                i12 = 0;
            } else if (i12 > i10) {
                i12 = i14;
            }
        }
        if (i11 + i12 <= i10) {
            return i12;
        }
        return 0;
    }

    public abstract int i(int i9);

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
        if (((androidx.mediarouter.app.h) this.a) == null) {
            this.a = new androidx.mediarouter.app.h(this, 4);
        }
        ((g.q) this.b).e.registerReceiver((androidx.mediarouter.app.h) this.a, d);
    }

    public x() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public x(g.q qVar) {
        this.b = qVar;
    }
}
