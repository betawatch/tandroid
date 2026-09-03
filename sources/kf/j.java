package kf;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j implements Choreographer.FrameCallback {
    public static j s;
    public final Choreographer a;
    public final LinkedHashSet b;
    public final SparseArray c;
    public final be.b d;
    public final be.b e;
    public final be.b f;
    public long h;
    public long n;
    public int r;

    public j() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new LinkedHashSet();
        this.c = new SparseArray();
        this.d = new be.b(true);
        this.e = new be.b(true);
        this.f = new be.b(true);
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }

    public static j d() {
        c();
        if (s == null) {
            s = new j();
        }
        return s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        f(runnable);
        e(max).e.add(runnable);
    }

    public final void b(i iVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        g(iVar);
        e(max).d.add(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[LOOP:2: B:24:0x0067->B:26:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[LOOP:3: B:29:0x007d->B:31:0x0083, LOOP_END] */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void doFrame(long j10) {
        int i10;
        be.b bVar;
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
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    h hVar = (h) sparseArray.valueAt(i10);
                    int i11 = hVar.b;
                    if (i11 > 0) {
                        i10 = this.r % i11 != 0 ? i10 + 1 : 0;
                        bVar = hVar.f;
                        if (bVar != null) {
                            hVar.f = null;
                            Iterator it3 = bVar.iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                        }
                        it = hVar.d.iterator();
                        while (it.hasNext()) {
                            ((i) it.next()).doFrame(j10);
                        }
                        it2 = hVar.e.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                    } else {
                        long j13 = hVar.c + 16666666;
                        hVar.c = j13;
                        long j14 = hVar.a;
                        if (j13 >= j14) {
                            hVar.c = j13 % j14;
                            bVar = hVar.f;
                            if (bVar != null) {
                            }
                            it = hVar.d.iterator();
                            while (it.hasNext()) {
                            }
                            it2 = hVar.e.iterator();
                            while (it2.hasNext()) {
                            }
                        }
                    }
                }
                LinkedHashSet linkedHashSet = this.b;
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    ((i) it4.next()).doFrame(j10);
                }
                be.b bVar2 = this.f;
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((View) it5.next()).invalidate();
                }
                be.b bVar3 = this.d;
                Iterator it6 = bVar3.iterator();
                while (it6.hasNext()) {
                    ((Drawable) it6.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                linkedHashSet.clear();
                if (this.r % 2 == 0) {
                    be.b bVar4 = this.e;
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

    public final h e(int i10) {
        SparseArray sparseArray = this.c;
        h hVar = (h) sparseArray.get(i10);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(1000000000 / i10, 60 % i10 == 0 ? 60 / i10 : 0);
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size() || ((h) sparseArray.valueAt(i10)).e.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void g(i iVar) {
        c();
        if (iVar == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size() || ((h) sparseArray.valueAt(i10)).d.remove(iVar)) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            be.b bVar = ((h) sparseArray.valueAt(i10)).f;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }
}
