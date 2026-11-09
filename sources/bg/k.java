package bg;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.v5;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class k implements Choreographer.FrameCallback {
    public static final long[] r;
    public static k s;
    public final Choreographer a;
    public final SparseArray b;
    public final xe.b c;
    public final xe.b d;
    public final xe.b e;
    public long f;
    public long h;
    public int n;

    static {
        int i7;
        boolean z9;
        long j3;
        int i10 = 60;
        long[] jArr = new long[60];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int i13 = 2;
            int i14 = 1;
            for (int i15 = 2; i15 <= i10; i15++) {
                if (i10 % i15 == 0 && Math.abs(i15 - i12) < Math.abs(i14 - i12)) {
                    i14 = i15;
                }
            }
            int i16 = i10 / i14;
            long j10 = 0;
            for (int i17 = 0; i17 < i10; i17 += i16) {
                j10 |= 1 << i17;
            }
            int i18 = i12 - i14;
            int abs = Math.abs(i18);
            int i19 = 0;
            while (i19 < abs) {
                int i20 = (((i19 * 2) + 1) * 60) / (abs * 2);
                int i21 = 0;
                while (true) {
                    i7 = i10;
                    if (i21 < i10) {
                        int i22 = 0;
                        while (i22 < i13) {
                            int i23 = ((i20 + (i22 == 0 ? i21 : -i21)) + 60) % 60;
                            long j11 = 1 << i23;
                            if (i18 <= 0) {
                                if ((j10 & j11) != 0) {
                                    j3 = (~j11) & j10;
                                    j10 = j3;
                                    z9 = true;
                                    break;
                                }
                                i22++;
                                i13 = 2;
                            } else {
                                if ((j10 & j11) == 0 && (i16 % 2 != 0 || i23 % 2 != 0)) {
                                    j3 = j11 | j10;
                                    j10 = j3;
                                    z9 = true;
                                    break;
                                }
                                i22++;
                                i13 = 2;
                            }
                        }
                        z9 = false;
                        if (z9) {
                            break;
                        }
                        i21++;
                        i10 = i7;
                        i13 = 2;
                    }
                }
                i19++;
                i10 = i7;
                i13 = 2;
            }
            jArr[i11] = j10;
            i11 = i12;
        }
        r = jArr;
    }

    public k() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new SparseArray();
        this.c = new xe.b();
        this.d = new xe.b();
        this.e = new xe.b();
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

    public final void a(int i7, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i7, 60));
        f(runnable);
        e(max).c.add(runnable);
    }

    public final void b(u5 u5Var, int i7) {
        c();
        int max = Math.max(1, Math.min(i7, 60));
        g(u5Var);
        e(max).b.add(u5Var);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        long j10 = this.h;
        long j11 = 0;
        if (j10 == 0) {
            this.h = j3;
        } else {
            long j12 = (j3 - j10) + this.f;
            this.f = j12;
            this.h = j3;
            if (j12 >= 16666666) {
                this.f = j12 % 16666666;
                xe.b bVar = this.d;
                xe.b bVar2 = this.c;
                xe.b bVar3 = this.e;
                SparseArray sparseArray = this.b;
                long j13 = 1 << this.n;
                int i7 = 0;
                while (i7 < sparseArray.size()) {
                    j jVar = (j) sparseArray.valueAt(i7);
                    if ((jVar.a & j13) != j11) {
                        xe.b bVar4 = jVar.d;
                        if (bVar4 != null) {
                            jVar.d = null;
                            Iterator it = bVar4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = jVar.b.iterator();
                        while (it2.hasNext()) {
                            u5 u5Var = (u5) it2.next();
                            int i10 = u5Var.a;
                            Object obj = u5Var.b;
                            switch (i10) {
                                case 0:
                                    v5 v5Var = (v5) obj;
                                    int i11 = v5Var.Q0 + 1;
                                    v5Var.Q0 = i11;
                                    if (i11 > 10) {
                                        v5Var.R0 = true;
                                    }
                                    v5Var.i();
                                    if (!v5Var.U0) {
                                        break;
                                    } else {
                                        v5Var.T0 = true;
                                        v5Var.t();
                                        break;
                                    }
                                case 1:
                                    Field field = EditTextBoldCursor.y1;
                                    ((EditTextBoldCursor) obj).invalidate();
                                    break;
                                default:
                                    ah0.g((ah0) obj);
                                    break;
                            }
                        }
                        Iterator it3 = jVar.c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i7++;
                    j11 = 0;
                }
                Iterator it4 = bVar3.iterator();
                while (it4.hasNext()) {
                    ((View) it4.next()).invalidate();
                }
                Iterator it5 = bVar2.iterator();
                while (it5.hasNext()) {
                    ((Drawable) it5.next()).invalidateSelf();
                }
                bVar3.clear();
                bVar2.clear();
                if (this.n % 2 == 0) {
                    Iterator it6 = bVar.iterator();
                    while (it6.hasNext()) {
                        ((Drawable) it6.next()).invalidateSelf();
                    }
                    bVar.clear();
                }
                int i12 = this.n + 1;
                this.n = i12;
                if (i12 == 60) {
                    this.n = 0;
                }
            }
        }
        this.a.postFrameCallback(this);
    }

    public final j e(int i7) {
        int max = Math.max(1, Math.min(i7, 60));
        SparseArray sparseArray = this.b;
        j jVar = (j) sparseArray.get(max);
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(r[max - 1]);
        sparseArray.put(max, jVar2);
        return jVar2;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i7 >= sparseArray.size() || ((j) sparseArray.valueAt(i7)).c.remove(runnable)) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void g(u5 u5Var) {
        c();
        if (u5Var == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i7 >= sparseArray.size() || ((j) sparseArray.valueAt(i7)).b.remove(u5Var)) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i7 >= sparseArray.size()) {
                return;
            }
            xe.b bVar = ((j) sparseArray.valueAt(i7)).d;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i7++;
            }
        }
    }
}
