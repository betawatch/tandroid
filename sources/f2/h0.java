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
import org.telegram.ui.Components.wk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class h0 extends y0 {
    public int A;
    public int C;
    public RecyclerView D;
    public VelocityTracker F;
    public ArrayList G;
    public ArrayList H;
    public m5.c0 J;
    public e0 K;
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
    public final d0 x;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public q1 c = null;
    public int w = -1;
    public int y = 0;
    public final ArrayList B = new ArrayList();
    public final androidx.activity.i E = new androidx.activity.i(this, 19);
    public View I = null;
    public final a0 L = new a0(this);

    public h0(d0 d0Var) {
        this.x = d0Var;
    }

    public static boolean m(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override // f2.y0
    public final void a(Rect rect, View view, RecyclerView recyclerView, n1 n1Var) {
        rect.setEmpty();
    }

    @Override // f2.y0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        float f11;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f12 = fArr[0];
            f10 = fArr[1];
            f11 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        q1 q1Var = this.c;
        int i9 = this.y;
        d0 d0Var = this.x;
        d0Var.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b0 b0Var = (b0) arrayList.get(i10);
            q1 q1Var2 = b0Var.e;
            float f13 = b0Var.a;
            float f14 = b0Var.c;
            if (f13 == f14) {
                b0Var.r = q1Var2.a.getTranslationX();
            } else {
                b0Var.r = e2.c.z(f14, f13, b0Var.x, f13);
            }
            float f15 = b0Var.b;
            float f16 = b0Var.d;
            if (f15 == f16) {
                b0Var.s = q1Var2.a.getTranslationY();
            } else {
                b0Var.s = e2.c.z(f16, f15, b0Var.x, f15);
            }
            int save = canvas.save();
            d0Var.m(canvas, recyclerView, b0Var.e, b0Var.r, b0Var.s, b0Var.f, false);
            canvas.restoreToCount(save);
        }
        if (q1Var != null) {
            int save2 = canvas.save();
            d0Var.m(canvas, recyclerView, q1Var, f11, f10, i9, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // f2.y0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        q1 q1Var = this.c;
        this.x.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            b0 b0Var = (b0) arrayList.get(i9);
            int save = canvas.save();
            View view = b0Var.e.a;
            canvas.restoreToCount(save);
        }
        if (q1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i10 = size - 1; i10 >= 0; i10--) {
            b0 b0Var2 = (b0) arrayList.get(i10);
            boolean z11 = b0Var2.w;
            if (z11 && !b0Var2.n) {
                arrayList.remove(i10);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void d(wk0 wk0Var) {
        RecyclerView recyclerView = this.D;
        if (recyclerView == wk0Var) {
            return;
        }
        a0 a0Var = this.L;
        if (recyclerView != null) {
            recyclerView.p0(this);
            RecyclerView recyclerView2 = this.D;
            recyclerView2.A.remove(a0Var);
            if (recyclerView2.B == a0Var) {
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
                this.x.a(this.D, ((b0) arrayList2.get(0)).e);
            }
            arrayList2.clear();
            this.I = null;
            VelocityTracker velocityTracker = this.F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.F = null;
            }
            e0 e0Var = this.K;
            if (e0Var != null) {
                e0Var.a = false;
                this.K = null;
            }
            if (this.J != null) {
                this.J = null;
            }
        }
        this.D = wk0Var;
        if (wk0Var != null) {
            wk0Var.getResources();
            this.f = AndroidUtilities.dp(120.0f);
            this.h = AndroidUtilities.dp(800.0f);
            this.C = ViewConfiguration.get(this.D.getContext()).getScaledTouchSlop();
            this.D.i(this);
            this.D.A.add(a0Var);
            RecyclerView recyclerView3 = this.D;
            if (recyclerView3.L == null) {
                recyclerView3.L = new ArrayList();
            }
            recyclerView3.L.add(this);
            this.K = new e0(this);
            this.J = new m5.c0(this.D.getContext(), this.K);
        }
    }

    public final int f(q1 q1Var, int i9) {
        if ((i9 & 12) == 0) {
            return 0;
        }
        int i10 = this.n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.F;
        d0 d0Var = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, d0Var.h(this.h));
            float xVelocity = this.F.getXVelocity(this.w);
            float yVelocity = this.F.getYVelocity(this.w);
            int i11 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i11 & i9) != 0 && i10 == i11 && abs >= d0Var.f(this.f) && abs > Math.abs(yVelocity)) {
                return i11;
            }
        }
        float g10 = d0Var.g() * this.D.getWidth();
        if ((i9 & i10) == 0 || Math.abs(this.n) <= g10) {
            return 0;
        }
        return i10;
    }

    public final void h(int i9, int i10, MotionEvent motionEvent) {
        View k10;
        if (this.c == null && i9 == 2 && this.y != 2) {
            d0 d0Var = this.x;
            if (d0Var.j() && this.D.getScrollState() != 1) {
                z0 layoutManager = this.D.getLayoutManager();
                int i11 = this.w;
                q1 q1Var = null;
                if (i11 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x10 = motionEvent.getX(findPointerIndex) - this.d;
                    float y10 = motionEvent.getY(findPointerIndex) - this.e;
                    float abs = Math.abs(x10);
                    float abs2 = Math.abs(y10);
                    float f10 = this.C;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        q1Var = this.D.T(k10);
                    }
                }
                if (q1Var == null) {
                    return;
                }
                RecyclerView recyclerView = this.D;
                int e10 = d0Var.e(recyclerView, q1Var);
                WeakHashMap weakHashMap = r0.j0.a;
                int b10 = (d0Var.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (b10 == 0) {
                    return;
                }
                float x11 = motionEvent.getX(i10);
                float y11 = motionEvent.getY(i10);
                float f11 = x11 - this.d;
                float f12 = y11 - this.e;
                float abs3 = Math.abs(f11);
                float abs4 = Math.abs(f12);
                float f13 = this.C;
                if (abs3 >= f13 || abs4 >= f13) {
                    if (abs3 > abs4) {
                        if (f11 < 0.0f && (b10 & 4) == 0) {
                            return;
                        }
                        if (f11 > 0.0f && (b10 & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f12 < 0.0f && (b10 & 1) == 0) {
                            return;
                        }
                        if (f12 > 0.0f && (b10 & 2) == 0) {
                            return;
                        }
                    }
                    this.r = 0.0f;
                    this.n = 0.0f;
                    this.w = motionEvent.getPointerId(0);
                    p(q1Var, 1);
                }
            }
        }
    }

    public final int i(q1 q1Var, int i9) {
        if ((i9 & 3) == 0) {
            return 0;
        }
        int i10 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.F;
        d0 d0Var = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, d0Var.h(this.h));
            float xVelocity = this.F.getXVelocity(this.w);
            float yVelocity = this.F.getYVelocity(this.w);
            int i11 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i11 & i9) != 0 && i11 == i10 && abs >= d0Var.f(this.f) && abs > Math.abs(xVelocity)) {
                return i11;
            }
        }
        float g10 = d0Var.g() * this.D.getHeight();
        if ((i9 & i10) == 0 || Math.abs(this.r) <= g10) {
            return 0;
        }
        return i10;
    }

    public final void j(q1 q1Var, boolean z10) {
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) arrayList.get(size);
            if (b0Var.e == q1Var) {
                b0Var.v |= z10;
                if (!b0Var.w) {
                    b0Var.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        q1 q1Var = this.c;
        if (q1Var != null) {
            View view = q1Var.a;
            if (m(view, x10, y10, this.s + this.n, this.v + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b0 b0Var = (b0) arrayList.get(size);
            View view2 = b0Var.e.a;
            if (m(view2, x10, y10, b0Var.r, b0Var.s)) {
                return view2;
            }
        }
        return this.D.E(x10, y10);
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

    public final void n(q1 q1Var) {
        ArrayList arrayList;
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        int i9;
        View view;
        int i10;
        int i11;
        if (!this.D.isLayoutRequested() && this.y == 2) {
            d0 d0Var = this.x;
            d0Var.getClass();
            int i12 = (int) (this.s + this.n);
            int i13 = (int) (this.v + this.r);
            View view2 = q1Var.a;
            if (Math.abs(i13 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i12 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
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
                int i14 = (round + width) / 2;
                int i15 = (round2 + height) / 2;
                z0 layoutManager = this.D.getLayoutManager();
                int r10 = layoutManager.r();
                int i16 = 0;
                while (i16 < r10) {
                    View q10 = layoutManager.q(i16);
                    if (q10 == view2) {
                        i9 = i16;
                    } else {
                        i9 = i16;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            q1 T = this.D.T(q10);
                            int abs5 = Math.abs(i14 - ((q10.getRight() + q10.getLeft()) / 2));
                            int abs6 = Math.abs(i15 - ((q10.getBottom() + q10.getTop()) / 2));
                            int i17 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.G.size();
                            i10 = round;
                            i11 = i12;
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < size) {
                                int i20 = size;
                                if (i17 <= ((Integer) this.H.get(i18)).intValue()) {
                                    break;
                                }
                                i19++;
                                i18++;
                                size = i20;
                            }
                            this.G.add(i19, T);
                            this.H.add(i19, Integer.valueOf(i17));
                            i16 = i9 + 1;
                            view2 = view;
                            round = i10;
                            i12 = i11;
                        }
                    }
                    view = view2;
                    i10 = round;
                    i11 = i12;
                    i16 = i9 + 1;
                    view2 = view;
                    round = i10;
                    i12 = i11;
                }
                View view3 = view2;
                int i21 = i12;
                ArrayList arrayList3 = this.G;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view3.getWidth() + i21;
                int height2 = view3.getHeight() + i13;
                int left2 = i21 - view3.getLeft();
                int top2 = i13 - view3.getTop();
                int size2 = arrayList3.size();
                q1 q1Var2 = null;
                int i22 = -1;
                int i23 = 0;
                while (i23 < size2) {
                    q1 q1Var3 = (q1) arrayList3.get(i23);
                    if (left2 <= 0 || (right = q1Var3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (q1Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i22) {
                            i22 = abs4;
                            q1Var2 = q1Var3;
                        }
                    }
                    if (left2 < 0 && (left = q1Var3.a.getLeft() - i21) > 0 && q1Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i22) {
                        i22 = abs3;
                        q1Var2 = q1Var3;
                    }
                    if (top2 < 0 && (top = q1Var3.a.getTop() - i13) > 0 && q1Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i22) {
                        i22 = abs2;
                        q1Var2 = q1Var3;
                    }
                    if (top2 > 0 && (bottom = q1Var3.a.getBottom() - height2) < 0 && q1Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i22) {
                        i22 = abs;
                        q1Var2 = q1Var3;
                    }
                    i23++;
                    arrayList3 = arrayList;
                }
                if (q1Var2 == null) {
                    this.G.clear();
                    this.H.clear();
                    return;
                }
                int b10 = q1Var2.b();
                q1Var.b();
                if (d0Var.n(this.D, q1Var, q1Var2)) {
                    this.x.o(this.D, q1Var, q1Var2, b10, i21, i13);
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
    public final void p(q1 q1Var, int i9) {
        d0 d0Var;
        boolean z10;
        boolean z11;
        char c10;
        int i10;
        int i11;
        float signum;
        Object[] objArr;
        if (q1Var == this.c && i9 == this.y) {
            return;
        }
        this.N = Long.MIN_VALUE;
        int i12 = this.y;
        j(q1Var, true);
        this.y = i9;
        if (i9 == 2) {
            if (q1Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.I = q1Var.a;
        }
        int i13 = (1 << ((i9 * 8) + 8)) - 1;
        q1 q1Var2 = this.c;
        d0 d0Var2 = this.x;
        if (q1Var2 != null) {
            View view = q1Var2.a;
            if (view.getParent() != null) {
                boolean q10 = q();
                if (i12 == 2) {
                    i11 = 0;
                    c10 = 0;
                } else {
                    if (this.y != 2) {
                        int e10 = d0Var2.e(this.D, q1Var2);
                        RecyclerView recyclerView = this.D;
                        WeakHashMap weakHashMap = r0.j0.a;
                        int b10 = (d0Var2.b(e10, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (b10 != 0) {
                            int i14 = (e10 & 65280) >> 8;
                            c10 = 0;
                            if (Math.abs(this.n) > Math.abs(this.r)) {
                                i10 = f(q1Var2, b10);
                                if (i10 <= 0) {
                                    i10 = i(q1Var2, b10);
                                } else if ((i14 & i10) == 0) {
                                    i10 = d0.c(i10, this.D.getLayoutDirection());
                                }
                                i11 = i10;
                            } else {
                                i10 = i(q1Var2, b10);
                                if (i10 <= 0) {
                                    i10 = f(q1Var2, b10);
                                    if (i10 > 0) {
                                        if ((i14 & i10) == 0) {
                                            i10 = d0.c(i10, this.D.getLayoutDirection());
                                        }
                                    }
                                    i10 = 0;
                                }
                                i11 = i10;
                            }
                        }
                    }
                    i10 = 0;
                    c10 = 0;
                    i11 = i10;
                }
                VelocityTracker velocityTracker = this.F;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.F = null;
                }
                int i15 = 4;
                float f10 = 0.0f;
                if (!q10) {
                    if (i11 == 1 || i11 == 2) {
                        signum = Math.signum(this.r) * this.D.getHeight();
                        objArr = null;
                        if (i12 != 2) {
                            i15 = 8;
                        } else if (i11 > 0) {
                            i15 = 2;
                        }
                        float[] fArr = this.b;
                        l(fArr);
                        int i16 = i15;
                        float f11 = fArr[c10];
                        float f12 = fArr[1];
                        d0Var = d0Var2;
                        z10 = false;
                        b0 b0Var = new b0(this, q1Var2, i12, f11, f12, f10, signum, i11, q1Var2);
                        long d = d0Var.d(this.D, i16, f10 - f11, signum - f12);
                        ValueAnimator valueAnimator = b0Var.h;
                        valueAnimator.setDuration(d);
                        this.B.add(b0Var);
                        q1Var2.q(false);
                        valueAnimator.start();
                        z11 = true;
                    } else if (i11 == 4 || i11 == 8 || i11 == 16 || i11 == 32) {
                        f10 = Math.signum(this.n) * this.D.getWidth();
                    }
                }
                objArr = null;
                signum = 0.0f;
                if (i12 != 2) {
                }
                float[] fArr2 = this.b;
                l(fArr2);
                int i162 = i15;
                float f112 = fArr2[c10];
                float f122 = fArr2[1];
                d0Var = d0Var2;
                z10 = false;
                b0 b0Var2 = new b0(this, q1Var2, i12, f112, f122, f10, signum, i11, q1Var2);
                long d9 = d0Var.d(this.D, i162, f10 - f112, signum - f122);
                ValueAnimator valueAnimator2 = b0Var2.h;
                valueAnimator2.setDuration(d9);
                this.B.add(b0Var2);
                q1Var2.q(false);
                valueAnimator2.start();
                z11 = true;
            } else {
                d0Var = d0Var2;
                z10 = false;
                o(view);
                d0Var.a(this.D, q1Var2);
                z11 = false;
            }
            this.c = null;
        } else {
            d0Var = d0Var2;
            z10 = false;
            z11 = false;
        }
        if (q1Var != null) {
            View view2 = q1Var.a;
            RecyclerView recyclerView2 = this.D;
            int e11 = d0Var.e(recyclerView2, q1Var);
            WeakHashMap weakHashMap2 = r0.j0.a;
            this.A = (d0Var.b(e11, recyclerView2.getLayoutDirection()) & i13) >> (this.y * 8);
            this.s = view2.getLeft();
            this.v = view2.getTop();
            this.c = q1Var;
            if (i9 == 2) {
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
        d0Var.p(this.c, this.y);
        this.D.invalidate();
    }

    public boolean q() {
        return false;
    }

    public final void r(q1 q1Var) {
        RecyclerView recyclerView = this.D;
        d0 d0Var = this.x;
        int e10 = d0Var.e(recyclerView, q1Var);
        WeakHashMap weakHashMap = r0.j0.a;
        if ((d0Var.b(e10, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (q1Var.a.getParent() != this.D) {
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
        p(q1Var, 2);
    }

    public final void s(int i9, int i10, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i10);
        float y10 = motionEvent.getY(i10);
        float f10 = x10 - this.d;
        this.n = f10;
        this.r = y10 - this.e;
        if ((i9 & 4) == 0) {
            this.n = Math.max(0.0f, f10);
        }
        if ((i9 & 8) == 0) {
            this.n = Math.min(0.0f, this.n);
        }
        if ((i9 & 1) == 0) {
            this.r = Math.max(0.0f, this.r);
        }
        if ((i9 & 2) == 0) {
            this.r = Math.min(0.0f, this.r);
        }
    }
}
