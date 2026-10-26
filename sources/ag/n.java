package ag;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n implements Choreographer.FrameCallback {
    public static final long[] r;
    public static n s;
    public final Choreographer a;
    public final SparseArray b;
    public final se.b c;
    public final se.b d;
    public final se.b e;
    public long f;
    public long h;
    public int n;

    static {
        int i10;
        boolean z10;
        long j10;
        int i11 = 60;
        long[] jArr = new long[60];
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            int i14 = 2;
            int i15 = 1;
            for (int i16 = 2; i16 <= i11; i16++) {
                if (i11 % i16 == 0 && Math.abs(i16 - i13) < Math.abs(i15 - i13)) {
                    i15 = i16;
                }
            }
            int i17 = i11 / i15;
            long j11 = 0;
            for (int i18 = 0; i18 < i11; i18 += i17) {
                j11 |= 1 << i18;
            }
            int i19 = i13 - i15;
            int abs = Math.abs(i19);
            int i20 = 0;
            while (i20 < abs) {
                int i21 = (((i20 * 2) + 1) * 60) / (abs * 2);
                int i22 = 0;
                while (true) {
                    i10 = i11;
                    if (i22 < i11) {
                        int i23 = 0;
                        while (i23 < i14) {
                            int i24 = ((i21 + (i23 == 0 ? i22 : -i22)) + 60) % 60;
                            long j12 = 1 << i24;
                            if (i19 <= 0) {
                                if ((j11 & j12) != 0) {
                                    j10 = (~j12) & j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i23++;
                                i14 = 2;
                            } else {
                                if ((j11 & j12) == 0 && (i17 % 2 != 0 || i24 % 2 != 0)) {
                                    j10 = j12 | j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i23++;
                                i14 = 2;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            break;
                        }
                        i22++;
                        i11 = i10;
                        i14 = 2;
                    }
                }
                i20++;
                i11 = i10;
                i14 = 2;
            }
            jArr[i12] = j11;
            i12 = i13;
        }
        r = jArr;
    }

    public n() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new SparseArray();
        this.c = new se.b();
        this.d = new se.b();
        this.e = new se.b();
        choreographer.postFrameCallback(this);
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Choreographer60FpsContent must be used on the main thread");
        }
    }

    public static n d() {
        c();
        if (s == null) {
            s = new n();
        }
        return s;
    }

    public final void a(int i10, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i10, 60));
        g(runnable);
        e(max).c.add(runnable);
    }

    public final void b(m mVar, int i10) {
        c();
        int max = Math.max(1, Math.min(i10, 60));
        f(mVar);
        e(max).b.add(mVar);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        long j11 = this.h;
        if (j11 == 0) {
            this.h = j10;
        } else {
            long j12 = (j10 - j11) + this.f;
            this.f = j12;
            this.h = j10;
            if (j12 >= 16666666) {
                this.f = j12 % 16666666;
                long j13 = 1 << this.n;
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.b;
                    if (i10 >= sparseArray.size()) {
                        break;
                    }
                    l lVar = (l) sparseArray.valueAt(i10);
                    if ((lVar.a & j13) != 0) {
                        se.b bVar = lVar.d;
                        if (bVar != null) {
                            lVar.d = null;
                            Iterator it = bVar.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = lVar.b.iterator();
                        while (it2.hasNext()) {
                            ((m) it2.next()).doFrame(j10);
                        }
                        Iterator it3 = lVar.c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i10++;
                }
                se.b bVar2 = this.e;
                Iterator it4 = bVar2.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                se.b bVar3 = this.c;
                Iterator it5 = bVar3.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar2.clear();
                bVar3.clear();
                if (this.n % 2 == 0) {
                    se.b bVar4 = this.d;
                    Iterator it6 = bVar4.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar4.clear();
                }
                int i11 = this.n + 1;
                this.n = i11;
                if (i11 == 60) {
                    this.n = 0;
                }
            }
        }
        this.a.postFrameCallback(this);
    }

    public final l e(int i10) {
        int max = Math.max(1, Math.min(i10, 60));
        SparseArray sparseArray = this.b;
        l lVar = (l) sparseArray.get(max);
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(r[max - 1]);
        sparseArray.put(max, lVar2);
        return lVar2;
    }

    public final void f(m mVar) {
        c();
        if (mVar == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size() || ((l) sparseArray.valueAt(i10)).b.remove(mVar)) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void g(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size() || ((l) sparseArray.valueAt(i10)).c.remove(runnable)) {
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
            SparseArray sparseArray = this.b;
            if (i10 >= sparseArray.size()) {
                return;
            }
            se.b bVar = ((l) sparseArray.valueAt(i10)).d;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i10++;
            }
        }
    }
}
