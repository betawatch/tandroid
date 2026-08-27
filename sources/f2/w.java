package f2;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseIntArray;
import android.view.MenuItem;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class w {
    public Object a;
    public Object b;

    public w(Context context) {
        this.a = context;
    }

    public void c() {
        androidx.mediarouter.app.f fVar = (androidx.mediarouter.app.f) this.a;
        if (fVar != null) {
            try {
                ((g.r) this.b).e.unregisterReceiver(fVar);
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
        l.s sVar = new l.s((Context) this.a, aVar);
        ((a0.k) this.b).put(aVar, sVar);
        return sVar;
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
        if (((androidx.mediarouter.app.f) this.a) == null) {
            this.a = new androidx.mediarouter.app.f(this, 4);
        }
        ((g.r) this.b).e.registerReceiver((androidx.mediarouter.app.f) this.a, d);
    }

    public w() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }

    public w(g.r rVar) {
        this.b = rVar;
    }
}
