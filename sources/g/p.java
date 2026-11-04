package g;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class p {
    public Object a;
    public Object b;

    public p(Context context) {
        this.a = context;
    }

    public void c() {
        androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.a;
        if (fVar != null) {
            try {
                ((s) this.b).e.unregisterReceiver(fVar);
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
        if (((a0.l) this.b) == null) {
            this.b = new a0.l(0);
        }
        MenuItem menuItem2 = (MenuItem) ((a0.l) this.b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l.r rVar = new l.r((Context) this.a, aVar);
        ((a0.l) this.b).put(aVar, rVar);
        return rVar;
    }

    public int g(int i3, int i10) {
        int i11 = i(i3);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i3; i14++) {
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

    public int h(int i3, int i10) {
        int i11 = i(i3);
        if (i11 == i10) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
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

    public abstract int i(int i3);

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
        if (((androidx.mediarouter.app.f) this.a) == null) {
            this.a = new androidx.mediarouter.app.f(this, 1);
        }
        ((s) this.b).e.registerReceiver((androidx.mediarouter.app.f) this.a, d);
    }

    public p() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public p(s sVar) {
        this.b = sVar;
    }
}
