package cg;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements Choreographer.FrameCallback {
    public static final long[] r;
    public static j s;
    public final Choreographer a;
    public final SparseArray b;
    public final ue.b c;
    public final ue.b d;
    public final ue.b e;
    public long f;
    public long h;
    public int n;

    static {
        int i3;
        boolean z10;
        long j10;
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
            long j11 = 0;
            for (int i17 = 0; i17 < i10; i17 += i16) {
                j11 |= 1 << i17;
            }
            int i18 = i12 - i14;
            int abs = Math.abs(i18);
            int i19 = 0;
            while (i19 < abs) {
                int i20 = (((i19 * 2) + 1) * 60) / (abs * 2);
                int i21 = 0;
                while (true) {
                    i3 = i10;
                    if (i21 < i10) {
                        int i22 = 0;
                        while (i22 < i13) {
                            int i23 = ((i20 + (i22 == 0 ? i21 : -i21)) + 60) % 60;
                            long j12 = 1 << i23;
                            if (i18 <= 0) {
                                if ((j11 & j12) != 0) {
                                    j10 = (~j12) & j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i22++;
                                i13 = 2;
                            } else {
                                if ((j11 & j12) == 0 && (i16 % 2 != 0 || i23 % 2 != 0)) {
                                    j10 = j12 | j11;
                                    j11 = j10;
                                    z10 = true;
                                    break;
                                }
                                i22++;
                                i13 = 2;
                            }
                        }
                        z10 = false;
                        if (z10) {
                            break;
                        }
                        i21++;
                        i10 = i3;
                        i13 = 2;
                    }
                }
                i19++;
                i10 = i3;
                i13 = 2;
            }
            jArr[i11] = j11;
            i11 = i12;
        }
        r = jArr;
    }

    public j() {
        Choreographer choreographer = Choreographer.getInstance();
        this.a = choreographer;
        this.b = new SparseArray();
        this.c = new ue.b();
        this.d = new ue.b();
        this.e = new ue.b();
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

    public final void a(int i3, Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int max = Math.max(1, Math.min(i3, 60));
        f(runnable);
        e(max).c.add(runnable);
    }

    public final void b(s5 s5Var, int i3) {
        c();
        int max = Math.max(1, Math.min(i3, 60));
        g(s5Var);
        e(max).b.add(s5Var);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        long j11 = this.h;
        long j12 = 0;
        if (j11 == 0) {
            this.h = j10;
        } else {
            long j13 = (j10 - j11) + this.f;
            this.f = j13;
            this.h = j10;
            if (j13 >= 16666666) {
                this.f = j13 % 16666666;
                ue.b bVar = this.d;
                ue.b bVar2 = this.c;
                ue.b bVar3 = this.e;
                SparseArray sparseArray = this.b;
                long j14 = 1 << this.n;
                int i3 = 0;
                while (i3 < sparseArray.size()) {
                    i iVar = (i) sparseArray.valueAt(i3);
                    if ((iVar.a & j14) != j12) {
                        ue.b bVar4 = iVar.d;
                        if (bVar4 != null) {
                            iVar.d = null;
                            Iterator it = bVar4.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                        Iterator it2 = iVar.b.iterator();
                        while (it2.hasNext()) {
                            s5 s5Var = (s5) it2.next();
                            int i10 = s5Var.a;
                            Object obj = s5Var.b;
                            switch (i10) {
                                case 0:
                                    t5 t5Var = (t5) obj;
                                    int i11 = t5Var.R0 + 1;
                                    t5Var.R0 = i11;
                                    if (i11 > 10) {
                                        t5Var.S0 = true;
                                    }
                                    t5Var.i();
                                    if (!t5Var.V0) {
                                        break;
                                    } else {
                                        t5Var.U0 = true;
                                        t5Var.t();
                                        break;
                                    }
                                case 1:
                                    Field field = EditTextBoldCursor.z1;
                                    ((EditTextBoldCursor) obj).invalidate();
                                    break;
                                default:
                                    ch0.g((ch0) obj);
                                    break;
                            }
                        }
                        Iterator it3 = iVar.c.iterator();
                        while (it3.hasNext()) {
                            ((Runnable) it3.next()).run();
                        }
                    }
                    i3++;
                    j12 = 0;
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

    public final i e(int i3) {
        int max = Math.max(1, Math.min(i3, 60));
        SparseArray sparseArray = this.b;
        i iVar = (i) sparseArray.get(max);
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(r[max - 1]);
        sparseArray.put(max, iVar2);
        return iVar2;
    }

    public final void f(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i3 >= sparseArray.size() || ((i) sparseArray.valueAt(i3)).c.remove(runnable)) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void g(s5 s5Var) {
        c();
        if (s5Var == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i3 >= sparseArray.size() || ((i) sparseArray.valueAt(i3)).b.remove(s5Var)) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void h(Runnable runnable) {
        c();
        if (runnable == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ue.b bVar = ((i) sparseArray.valueAt(i3)).d;
            if (bVar != null && bVar.remove(runnable)) {
                return;
            } else {
                i3++;
            }
        }
    }
}
