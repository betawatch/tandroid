package ff;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k implements Choreographer.FrameCallback {
    public static k s;
    public final Choreographer a;
    public final LinkedHashSet b;
    public final SparseArray c;
    public final xd.b d;
    public final xd.b e;
    public final xd.b f;
    public long h;
    public long n;
    public int r;

    public k() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new LinkedHashSet();
        this.c = new SparseArray();
        this.d = new xd.b(true);
        this.e = new xd.b(true);
        this.f = new xd.b(true);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }

    public static k d() {
        c();
        if (s == null) {
            s = new k();
        }
        return s;
    }

    public final void a(int i9, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i9, 60));
        g(runnable);
        e(max).e.add(runnable);
    }

    public final void b(j jVar, int i9) {
        c();
        int max = Math.max(1, Math.min(i9, 60));
        f(jVar);
        e(max).d.add(jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[LOOP:2: B:24:0x0067->B:26:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[LOOP:3: B:29:0x007d->B:31:0x0083, LOOP_END] */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doFrame(long j10) {
        int i9;
        xd.b bVar;
        Iterator it;
        Iterator it2;
        long j11 = this.n;
        if (j11 == 0) {
            this.n = j10;
        } else {
            long j12 = (j10 - j11) + this.h;
            this.h = j12;
            this.n = j10;
            if (j12 >= 16666666) {
                this.h = j12 % 16666666;
                while (true) {
                    SparseArray sparseArray = this.c;
                    if (i9 >= sparseArray.size()) {
                        break;
                    }
                    i iVar = (i) sparseArray.valueAt(i9);
                    int i10 = iVar.b;
                    if (i10 > 0) {
                        i9 = this.r % i10 != 0 ? i9 + 1 : 0;
                        bVar = iVar.f;
                        if (bVar != null) {
                            iVar.f = null;
                            Iterator it3 = bVar.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                        }
                        it = iVar.d.iterator();
                        while (it.hasNext()) {
                            ((j) it.next()).doFrame(j10);
                        }
                        it2 = iVar.e.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                    } else {
                        long j13 = iVar.c + 16666666;
                        iVar.c = j13;
                        long j14 = iVar.a;
                        if (j13 >= j14) {
                            iVar.c = j13 % j14;
                            bVar = iVar.f;
                            if (bVar != null) {
                            }
                            it = iVar.d.iterator();
                            while (it.hasNext()) {
                            }
                            it2 = iVar.e.iterator();
                            while (it2.hasNext()) {
                            }
                        }
                    }
                }
                LinkedHashSet linkedHashSet = this.b;
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    ((j) it4.next()).doFrame(j10);
                }
                xd.b bVar2 = this.f;
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((View) it5.next()).invalidate();
                }
                xd.b bVar3 = this.d;
                Iterator it6 = bVar3.iterator();
                while (it6.hasNext()) {
                    ((Drawable) it6.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                linkedHashSet.clear();
                if (this.r % 2 == 0) {
                    xd.b bVar4 = this.e;
                    Iterator it7 = bVar4.iterator();
                    while (it7.hasNext()) {
                        ((Drawable) it7.next()).invalidateSelf();
                    }
                    bVar4.clear();
                }
                this.r++;
            }
        }
        this.a.postFrameCallback(this);
    }

    public final i e(int i9) {
        SparseArray sparseArray = this.c;
        i iVar = (i) sparseArray.get(i9);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(1000000000 / i9, 60 % i9 == 0 ? 60 / i9 : 0);
        sparseArray.put(i9, iVar2);
        return iVar2;
    }

    public final void f(j jVar) {
        c();
        if (jVar == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i9 >= sparseArray.size() || ((i) sparseArray.valueAt(i9)).d.remove(jVar)) {
                return;
            } else {
                i9++;
            }
        }
    }

    public final void g(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i9 >= sparseArray.size() || ((i) sparseArray.valueAt(i9)).e.remove(runnable)) {
                return;
            } else {
                i9++;
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i9 >= sparseArray.size()) {
                return;
            }
            xd.b bVar = ((i) sparseArray.valueAt(i9)).f;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i9++;
            }
        }
    }
}
