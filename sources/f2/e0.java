package f2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class e0 extends v0 {
    public int A;
    public int C;
    public RecyclerView D;
    public VelocityTracker F;
    public ArrayList G;
    public ArrayList H;
    public o4.g J;
    public c0 K;
    public Rect M;
    public long N;
    public float d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float v;
    public final b0 x;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public n1 c = null;
    public int w = -1;
    public int y = 0;
    public final ArrayList B = new ArrayList();
    public final ag.q1 E = new ag.q1(this, 22);
    public View I = null;
    public final y L = new y(this);

    public e0(b0 b0Var) {
        this.x = b0Var;
    }

    public static boolean m(View view, float f9, float f10, float f11, float f12) {
        return f9 >= f11 && f9 <= f11 + ((float) view.getWidth()) && f10 >= f12 && f10 <= f12 + ((float) view.getHeight());
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, k1 k1Var) {
        rect.setEmpty();
    }

    @Override // f2.v0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f9;
        float f10;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f11 = fArr[0];
            f9 = fArr[1];
            f10 = f11;
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        n1 n1Var = this.c;
        int i10 = this.y;
        b0 b0Var = this.x;
        b0Var.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = (z) arrayList.get(i11);
            n1 n1Var2 = zVar.e;
            float f12 = zVar.a;
            float f13 = zVar.c;
            if (f12 == f13) {
                zVar.r = n1Var2.a.getTranslationX();
            } else {
                zVar.r = com.google.android.recaptcha.internal.a.z(f13, f12, zVar.x, f12);
            }
            float f14 = zVar.b;
            float f15 = zVar.d;
            if (f14 == f15) {
                zVar.s = n1Var2.a.getTranslationY();
            } else {
                zVar.s = com.google.android.recaptcha.internal.a.z(f15, f14, zVar.x, f14);
            }
            int save = canvas.save();
            b0Var.m(canvas, recyclerView, zVar.e, zVar.r, zVar.s, zVar.f, false);
            canvas.restoreToCount(save);
        }
        if (n1Var != null) {
            int save2 = canvas.save();
            b0Var.m(canvas, recyclerView, n1Var, f10, f9, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // f2.v0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f9 = fArr[0];
            float f10 = fArr[1];
        }
        n1 n1Var = this.c;
        this.x.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            int save = canvas.save();
            View view = zVar.e.a;
            canvas.restoreToCount(save);
        }
        if (n1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            z zVar2 = (z) arrayList.get(i11);
            boolean z11 = zVar2.w;
            if (z11 && !zVar2.n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void d(jl0 jl0Var) {
        RecyclerView recyclerView = this.D;
        if (recyclerView == jl0Var) {
            return;
        }
        y yVar = this.L;
        if (recyclerView != null) {
            recyclerView.p0(this);
            RecyclerView recyclerView2 = this.D;
            recyclerView2.A.remove(yVar);
            if (recyclerView2.B == yVar) {
                recyclerView2.B = null;
            }
            ArrayList arrayList = this.D.L;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.B;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.x.a(this.D, ((z) arrayList2.get(0)).e);
            }
            arrayList2.clear();
            this.I = null;
            VelocityTracker velocityTracker = this.F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.F = null;
            }
            c0 c0Var = this.K;
            if (c0Var != null) {
                c0Var.a = false;
                this.K = null;
            }
            if (this.J != null) {
                this.J = null;
            }
        }
        this.D = jl0Var;
        if (jl0Var != null) {
            jl0Var.getResources();
            this.f = AndroidUtilities.dp(120.0f);
            this.h = AndroidUtilities.dp(800.0f);
            this.C = ViewConfiguration.get(this.D.getContext()).getScaledTouchSlop();
            this.D.i(this);
            this.D.A.add(yVar);
            RecyclerView recyclerView3 = this.D;
            if (recyclerView3.L == null) {
                recyclerView3.L = new ArrayList();
            }
            recyclerView3.L.add(this);
            this.K = new c0(this);
            this.J = new o4.g(this.D.getContext(), this.K);
        }
    }

    public final int f(n1 n1Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.F;
        b0 b0Var = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, b0Var.h(this.h));
            float xVelocity = this.F.getXVelocity(this.w);
            float yVelocity = this.F.getYVelocity(this.w);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && abs >= b0Var.f(this.f) && abs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float g10 = b0Var.g() * this.D.getWidth();
        if ((i10 & i11) == 0 || Math.abs(this.n) <= g10) {
            return 0;
        }
        return i11;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k9;
        if (this.c == null && i10 == 2 && this.y != 2) {
            b0 b0Var = this.x;
            if (b0Var.j() && this.D.getScrollState() != 1) {
                w0 layoutManager = this.D.getLayoutManager();
                int i12 = this.w;
                n1 n1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float x4 = motionEvent.getX(findPointerIndex) - this.d;
                    float y8 = motionEvent.getY(findPointerIndex) - this.e;
                    float abs = Math.abs(x4);
                    float abs2 = Math.abs(y8);
                    float f9 = this.C;
                    if ((abs >= f9 || abs2 >= f9) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k9 = k(motionEvent)) != null))) {
                        n1Var = this.D.T(k9);
                    }
                }
                if (n1Var == null) {
                    return;
                }
                RecyclerView recyclerView = this.D;
                int e10 = b0Var.e(recyclerView, n1Var);
                WeakHashMap weakHashMap = r0.j0.a;
                int b10 = (b0Var.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (b10 == 0) {
                    return;
                }
                float x10 = motionEvent.getX(i11);
                float y10 = motionEvent.getY(i11);
                float f10 = x10 - this.d;
                float f11 = y10 - this.e;
                float abs3 = Math.abs(f10);
                float abs4 = Math.abs(f11);
                float f12 = this.C;
                if (abs3 >= f12 || abs4 >= f12) {
                    if (abs3 > abs4) {
                        if (f10 < 0.0f && (b10 & 4) == 0) {
                            return;
                        }
                        if (f10 > 0.0f && (b10 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f11 < 0.0f && (b10 & 1) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (b10 & 2) == 0) {
                            return;
                        }
                    }
                    this.r = 0.0f;
                    this.n = 0.0f;
                    this.w = motionEvent.getPointerId(0);
                    p(n1Var, 1);
                }
            }
        }
    }

    public final int i(n1 n1Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.F;
        b0 b0Var = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, b0Var.h(this.h));
            float xVelocity = this.F.getXVelocity(this.w);
            float yVelocity = this.F.getYVelocity(this.w);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && abs >= b0Var.f(this.f) && abs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float g10 = b0Var.g() * this.D.getHeight();
        if ((i10 & i11) == 0 || Math.abs(this.r) <= g10) {
            return 0;
        }
        return i11;
    }

    public final void j(n1 n1Var, boolean z10) {
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            if (zVar.e == n1Var) {
                zVar.v |= z10;
                if (!zVar.w) {
                    zVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        n1 n1Var = this.c;
        if (n1Var != null) {
            View view = n1Var.a;
            if (m(view, x4, y8, this.s + this.n, this.v + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            View view2 = zVar.e.a;
            if (m(view2, x4, y8, zVar.r, zVar.s)) {
                return view2;
            }
        }
        return this.D.E(x4, y8);
    }

    public final void l(float[] fArr) {
        if ((this.A & 12) != 0) {
            fArr[0] = (this.s + this.n) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.A & 3) != 0) {
            fArr[1] = (this.v + this.r) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void n(n1 n1Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i10;
        View view;
        int i11;
        int i12;
        if (!this.D.isLayoutRequested() && this.y == 2) {
            b0 b0Var = this.x;
            b0Var.getClass();
            int i13 = (int) (this.s + this.n);
            int i14 = (int) (this.v + this.r);
            View view2 = n1Var.a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.G;
                if (arrayList2 == null) {
                    this.G = new ArrayList();
                    this.H = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.H.clear();
                }
                int round = Math.round(this.s + this.n);
                int round2 = Math.round(this.v + this.r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                w0 layoutManager = this.D.getLayoutManager();
                int r6 = layoutManager.r();
                int i17 = 0;
                while (i17 < r6) {
                    View q6 = layoutManager.q(i17);
                    if (q6 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q6.getBottom() >= round2 && q6.getTop() <= height && q6.getRight() >= round && q6.getLeft() <= width) {
                            n1 T = this.D.T(q6);
                            int abs5 = Math.abs(i15 - ((q6.getRight() + q6.getLeft()) / 2));
                            int abs6 = Math.abs(i16 - ((q6.getBottom() + q6.getTop()) / 2));
                            int i18 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.G.size();
                            i11 = round;
                            i12 = i13;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < size) {
                                int i21 = size;
                                if (i18 <= ((Integer) this.H.get(i19)).intValue()) {
                                    break;
                                }
                                i20++;
                                i19++;
                                size = i21;
                            }
                            this.G.add(i20, T);
                            this.H.add(i20, Integer.valueOf(i18));
                            i17 = i10 + 1;
                            view2 = view;
                            round = i11;
                            i13 = i12;
                        }
                    }
                    view = view2;
                    i11 = round;
                    i12 = i13;
                    i17 = i10 + 1;
                    view2 = view;
                    round = i11;
                    i13 = i12;
                }
                View view3 = view2;
                int i22 = i13;
                ArrayList arrayList3 = this.G;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view3.getWidth() + i22;
                int height2 = view3.getHeight() + i14;
                int left2 = i22 - view3.getLeft();
                int top2 = i14 - view3.getTop();
                int size2 = arrayList3.size();
                n1 n1Var2 = null;
                int i23 = -1;
                int i24 = 0;
                while (i24 < size2) {
                    n1 n1Var3 = (n1) arrayList3.get(i24);
                    if (left2 <= 0 || (right = n1Var3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (n1Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                            i23 = abs4;
                            n1Var2 = n1Var3;
                        }
                    }
                    if (left2 < 0 && (left = n1Var3.a.getLeft() - i22) > 0 && n1Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                        i23 = abs3;
                        n1Var2 = n1Var3;
                    }
                    if (top2 < 0 && (top = n1Var3.a.getTop() - i14) > 0 && n1Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                        i23 = abs2;
                        n1Var2 = n1Var3;
                    }
                    if (top2 > 0 && (bottom = n1Var3.a.getBottom() - height2) < 0 && n1Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                        i23 = abs;
                        n1Var2 = n1Var3;
                    }
                    i24++;
                    arrayList3 = arrayList;
                }
                if (n1Var2 == null) {
                    this.G.clear();
                    this.H.clear();
                    return;
                }
                int b10 = n1Var2.b();
                n1Var.b();
                if (b0Var.n(this.D, n1Var, n1Var2)) {
                    this.x.o(this.D, n1Var, n1Var2, b10, i22, i14);
                }
            }
        }
    }

    public final void o(View view) {
        if (view == this.I) {
            this.I = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x009e, code lost:
    
        if (r4 > 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(n1 n1Var, int i10) {
        b0 b0Var;
        boolean z10;
        boolean z11;
        char c3;
        int i11;
        int i12;
        float signum;
        Object[] objArr;
        if (n1Var == this.c && i10 == this.y) {
            return;
        }
        this.N = Long.MIN_VALUE;
        int i13 = this.y;
        j(n1Var, true);
        this.y = i10;
        if (i10 == 2) {
            if (n1Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.I = n1Var.a;
        }
        int i14 = (1 << ((i10 * 8) + 8)) - 1;
        n1 n1Var2 = this.c;
        b0 b0Var2 = this.x;
        if (n1Var2 != null) {
            View view = n1Var2.a;
            if (view.getParent() != null) {
                boolean q6 = q();
                if (i13 == 2) {
                    i12 = 0;
                    c3 = 0;
                } else {
                    if (this.y != 2) {
                        int e10 = b0Var2.e(this.D, n1Var2);
                        RecyclerView recyclerView = this.D;
                        WeakHashMap weakHashMap = r0.j0.a;
                        int b10 = (b0Var2.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (b10 != 0) {
                            int i15 = (e10 & 65280) >> 8;
                            c3 = 0;
                            if (Math.abs(this.n) > Math.abs(this.r)) {
                                i11 = f(n1Var2, b10);
                                if (i11 <= 0) {
                                    i11 = i(n1Var2, b10);
                                } else if ((i15 & i11) == 0) {
                                    i11 = b0.c(i11, this.D.getLayoutDirection());
                                }
                                i12 = i11;
                            } else {
                                i11 = i(n1Var2, b10);
                                if (i11 <= 0) {
                                    i11 = f(n1Var2, b10);
                                    if (i11 > 0) {
                                        if ((i15 & i11) == 0) {
                                            i11 = b0.c(i11, this.D.getLayoutDirection());
                                        }
                                    }
                                    i11 = 0;
                                }
                                i12 = i11;
                            }
                        }
                    }
                    i11 = 0;
                    c3 = 0;
                    i12 = i11;
                }
                VelocityTracker velocityTracker = this.F;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.F = null;
                }
                int i16 = 4;
                float f9 = 0.0f;
                if (!q6) {
                    if (i12 == 1 || i12 == 2) {
                        signum = Math.signum(this.r) * this.D.getHeight();
                        objArr = null;
                        if (i13 != 2) {
                            i16 = 8;
                        } else if (i12 > 0) {
                            i16 = 2;
                        }
                        float[] fArr = this.b;
                        l(fArr);
                        int i17 = i16;
                        float f10 = fArr[c3];
                        float f11 = fArr[1];
                        b0Var = b0Var2;
                        z10 = false;
                        z zVar = new z(this, n1Var2, i13, f10, f11, f9, signum, i12, n1Var2);
                        long d = b0Var.d(this.D, i17, f9 - f10, signum - f11);
                        ValueAnimator valueAnimator = zVar.h;
                        valueAnimator.setDuration(d);
                        this.B.add(zVar);
                        n1Var2.q(false);
                        valueAnimator.start();
                        z11 = true;
                    } else if (i12 == 4 || i12 == 8 || i12 == 16 || i12 == 32) {
                        f9 = Math.signum(this.n) * this.D.getWidth();
                    }
                }
                objArr = null;
                signum = 0.0f;
                if (i13 != 2) {
                }
                float[] fArr2 = this.b;
                l(fArr2);
                int i172 = i16;
                float f102 = fArr2[c3];
                float f112 = fArr2[1];
                b0Var = b0Var2;
                z10 = false;
                z zVar2 = new z(this, n1Var2, i13, f102, f112, f9, signum, i12, n1Var2);
                long d10 = b0Var.d(this.D, i172, f9 - f102, signum - f112);
                ValueAnimator valueAnimator2 = zVar2.h;
                valueAnimator2.setDuration(d10);
                this.B.add(zVar2);
                n1Var2.q(false);
                valueAnimator2.start();
                z11 = true;
            } else {
                b0Var = b0Var2;
                z10 = false;
                o(view);
                b0Var.a(this.D, n1Var2);
                z11 = false;
            }
            this.c = null;
        } else {
            b0Var = b0Var2;
            z10 = false;
            z11 = false;
        }
        if (n1Var != null) {
            View view2 = n1Var.a;
            RecyclerView recyclerView2 = this.D;
            int e11 = b0Var.e(recyclerView2, n1Var);
            WeakHashMap weakHashMap2 = r0.j0.a;
            this.A = (b0Var.b(e11, recyclerView2.getLayoutDirection()) & i14) >> (this.y * 8);
            this.s = view2.getLeft();
            this.v = view2.getTop();
            this.c = n1Var;
            if (i10 == 2) {
                try {
                    view2.performHapticFeedback(z10 ? 1 : 0, 2);
                } catch (Exception unused) {
                }
            }
        }
        ViewParent parent = this.D.getParent();
        if (parent != null) {
            if (this.c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.D.getLayoutManager().f = true;
        }
        b0Var.p(this.c, this.y);
        this.D.invalidate();
    }

    public boolean q() {
        return false;
    }

    public final void r(n1 n1Var) {
        RecyclerView recyclerView = this.D;
        b0 b0Var = this.x;
        int e10 = b0Var.e(recyclerView, n1Var);
        WeakHashMap weakHashMap = r0.j0.a;
        if ((b0Var.b(e10, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (n1Var.a.getParent() != this.D) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.F;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.F = VelocityTracker.obtain();
        this.r = 0.0f;
        this.n = 0.0f;
        p(n1Var, 2);
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x4 = motionEvent.getX(i11);
        float y8 = motionEvent.getY(i11);
        float f9 = x4 - this.d;
        this.n = f9;
        this.r = y8 - this.e;
        if ((i10 & 4) == 0) {
            this.n = Math.max(0.0f, f9);
        }
        if ((i10 & 8) == 0) {
            this.n = Math.min(0.0f, this.n);
        }
        if ((i10 & 1) == 0) {
            this.r = Math.max(0.0f, this.r);
        }
        if ((i10 & 2) == 0) {
            this.r = Math.min(0.0f, this.r);
        }
    }
}
