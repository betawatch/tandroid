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
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class f0 extends w0 {
    public int A;
    public int C;
    public RecyclerView D;
    public VelocityTracker F;
    public ArrayList G;
    public ArrayList H;
    public m5.o J;
    public d0 K;
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
    public final c0 x;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public o1 c = null;
    public int w = -1;
    public int y = 0;
    public final ArrayList B = new ArrayList();
    public final a8.b E = new a8.b(this, 18);
    public View I = null;
    public final z L = new z(this);

    public f0(c0 c0Var) {
        this.x = c0Var;
    }

    public static boolean m(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override // f2.w0
    public final void a(Rect rect, View view, RecyclerView recyclerView, l1 l1Var) {
        rect.setEmpty();
    }

    @Override // f2.w0
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
        o1 o1Var = this.c;
        int i10 = this.y;
        c0 c0Var = this.x;
        c0Var.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = (a0) arrayList.get(i11);
            o1 o1Var2 = a0Var.e;
            float f13 = a0Var.a;
            float f14 = a0Var.c;
            if (f13 == f14) {
                a0Var.r = o1Var2.a.getTranslationX();
            } else {
                a0Var.r = com.google.android.recaptcha.internal.a.z(f14, f13, a0Var.x, f13);
            }
            float f15 = a0Var.b;
            float f16 = a0Var.d;
            if (f15 == f16) {
                a0Var.s = o1Var2.a.getTranslationY();
            } else {
                a0Var.s = com.google.android.recaptcha.internal.a.z(f16, f15, a0Var.x, f15);
            }
            int save = canvas.save();
            c0Var.m(canvas, recyclerView, a0Var.e, a0Var.r, a0Var.s, a0Var.f, false);
            canvas.restoreToCount(save);
        }
        if (o1Var != null) {
            int save2 = canvas.save();
            c0Var.m(canvas, recyclerView, o1Var, f11, f10, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // f2.w0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z10 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        o1 o1Var = this.c;
        this.x.getClass();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = (a0) arrayList.get(i10);
            int save = canvas.save();
            View view = a0Var.e.a;
            canvas.restoreToCount(save);
        }
        if (o1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            a0 a0Var2 = (a0) arrayList.get(i11);
            boolean z11 = a0Var2.w;
            if (z11 && !a0Var2.n) {
                arrayList.remove(i11);
            } else if (!z11) {
                z10 = true;
            }
        }
        if (z10) {
            recyclerView.invalidate();
        }
    }

    public final void d(zk0 zk0Var) {
        RecyclerView recyclerView = this.D;
        if (recyclerView == zk0Var) {
            return;
        }
        z zVar = this.L;
        if (recyclerView != null) {
            recyclerView.p0(this);
            RecyclerView recyclerView2 = this.D;
            recyclerView2.A.remove(zVar);
            if (recyclerView2.B == zVar) {
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
                this.x.a(this.D, ((a0) arrayList2.get(0)).e);
            }
            arrayList2.clear();
            this.I = null;
            VelocityTracker velocityTracker = this.F;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.F = null;
            }
            d0 d0Var = this.K;
            if (d0Var != null) {
                d0Var.a = false;
                this.K = null;
            }
            if (this.J != null) {
                this.J = null;
            }
        }
        this.D = zk0Var;
        if (zk0Var != null) {
            zk0Var.getResources();
            this.f = AndroidUtilities.dp(120.0f);
            this.h = AndroidUtilities.dp(800.0f);
            this.C = ViewConfiguration.get(this.D.getContext()).getScaledTouchSlop();
            this.D.i(this);
            this.D.A.add(zVar);
            RecyclerView recyclerView3 = this.D;
            if (recyclerView3.L == null) {
                recyclerView3.L = new ArrayList();
            }
            recyclerView3.L.add(this);
            this.K = new d0(this);
            this.J = new m5.o(this.D.getContext(), this.K);
        }
    }

    public final int f(o1 o1Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.F;
        c0 c0Var = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, c0Var.h(this.h));
            float xVelocity = this.F.getXVelocity(this.w);
            float yVelocity = this.F.getYVelocity(this.w);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && abs >= c0Var.f(this.f) && abs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float g10 = c0Var.g() * this.D.getWidth();
        if ((i10 & i11) == 0 || Math.abs(this.n) <= g10) {
            return 0;
        }
        return i11;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.c == null && i10 == 2 && this.y != 2) {
            c0 c0Var = this.x;
            if (c0Var.j() && this.D.getScrollState() != 1) {
                x0 layoutManager = this.D.getLayoutManager();
                int i12 = this.w;
                o1 o1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float x8 = motionEvent.getX(findPointerIndex) - this.d;
                    float y10 = motionEvent.getY(findPointerIndex) - this.e;
                    float abs = Math.abs(x8);
                    float abs2 = Math.abs(y10);
                    float f10 = this.C;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        o1Var = this.D.T(k10);
                    }
                }
                if (o1Var == null) {
                    return;
                }
                RecyclerView recyclerView = this.D;
                int e9 = c0Var.e(recyclerView, o1Var);
                WeakHashMap weakHashMap = r0.j0.a;
                int b10 = (c0Var.b(e9, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (b10 == 0) {
                    return;
                }
                float x10 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                float f11 = x10 - this.d;
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
                    p(o1Var, 1);
                }
            }
        }
    }

    public final int i(o1 o1Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.F;
        c0 c0Var = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, c0Var.h(this.h));
            float xVelocity = this.F.getXVelocity(this.w);
            float yVelocity = this.F.getYVelocity(this.w);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && abs >= c0Var.f(this.f) && abs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float g10 = c0Var.g() * this.D.getHeight();
        if ((i10 & i11) == 0 || Math.abs(this.r) <= g10) {
            return 0;
        }
        return i11;
    }

    public final void j(o1 o1Var, boolean z10) {
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList.get(size);
            if (a0Var.e == o1Var) {
                a0Var.v |= z10;
                if (!a0Var.w) {
                    a0Var.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        o1 o1Var = this.c;
        if (o1Var != null) {
            View view = o1Var.a;
            if (m(view, x8, y10, this.s + this.n, this.v + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.B;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList.get(size);
            View view2 = a0Var.e.a;
            if (m(view2, x8, y10, a0Var.r, a0Var.s)) {
                return view2;
            }
        }
        return this.D.E(x8, y10);
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

    public final void n(o1 o1Var) {
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
            c0 c0Var = this.x;
            c0Var.getClass();
            int i13 = (int) (this.s + this.n);
            int i14 = (int) (this.v + this.r);
            View view2 = o1Var.a;
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
                x0 layoutManager = this.D.getLayoutManager();
                int r10 = layoutManager.r();
                int i17 = 0;
                while (i17 < r10) {
                    View q6 = layoutManager.q(i17);
                    if (q6 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q6.getBottom() >= round2 && q6.getTop() <= height && q6.getRight() >= round && q6.getLeft() <= width) {
                            o1 T = this.D.T(q6);
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
                o1 o1Var2 = null;
                int i23 = -1;
                int i24 = 0;
                while (i24 < size2) {
                    o1 o1Var3 = (o1) arrayList3.get(i24);
                    if (left2 <= 0 || (right = o1Var3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (o1Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                            i23 = abs4;
                            o1Var2 = o1Var3;
                        }
                    }
                    if (left2 < 0 && (left = o1Var3.a.getLeft() - i22) > 0 && o1Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                        i23 = abs3;
                        o1Var2 = o1Var3;
                    }
                    if (top2 < 0 && (top = o1Var3.a.getTop() - i14) > 0 && o1Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                        i23 = abs2;
                        o1Var2 = o1Var3;
                    }
                    if (top2 > 0 && (bottom = o1Var3.a.getBottom() - height2) < 0 && o1Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                        i23 = abs;
                        o1Var2 = o1Var3;
                    }
                    i24++;
                    arrayList3 = arrayList;
                }
                if (o1Var2 == null) {
                    this.G.clear();
                    this.H.clear();
                    return;
                }
                int b10 = o1Var2.b();
                o1Var.b();
                if (c0Var.n(this.D, o1Var, o1Var2)) {
                    this.x.o(this.D, o1Var, o1Var2, b10, i22, i14);
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
    public final void p(o1 o1Var, int i10) {
        c0 c0Var;
        boolean z10;
        boolean z11;
        char c10;
        int i11;
        int i12;
        float signum;
        Object[] objArr;
        if (o1Var == this.c && i10 == this.y) {
            return;
        }
        this.N = Long.MIN_VALUE;
        int i13 = this.y;
        j(o1Var, true);
        this.y = i10;
        if (i10 == 2) {
            if (o1Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.I = o1Var.a;
        }
        int i14 = (1 << ((i10 * 8) + 8)) - 1;
        o1 o1Var2 = this.c;
        c0 c0Var2 = this.x;
        if (o1Var2 != null) {
            View view = o1Var2.a;
            if (view.getParent() != null) {
                boolean q6 = q();
                if (i13 == 2) {
                    i12 = 0;
                    c10 = 0;
                } else {
                    if (this.y != 2) {
                        int e9 = c0Var2.e(this.D, o1Var2);
                        RecyclerView recyclerView = this.D;
                        WeakHashMap weakHashMap = r0.j0.a;
                        int b10 = (c0Var2.b(e9, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (b10 != 0) {
                            int i15 = (e9 & 65280) >> 8;
                            c10 = 0;
                            if (Math.abs(this.n) > Math.abs(this.r)) {
                                i11 = f(o1Var2, b10);
                                if (i11 <= 0) {
                                    i11 = i(o1Var2, b10);
                                } else if ((i15 & i11) == 0) {
                                    i11 = c0.c(i11, this.D.getLayoutDirection());
                                }
                                i12 = i11;
                            } else {
                                i11 = i(o1Var2, b10);
                                if (i11 <= 0) {
                                    i11 = f(o1Var2, b10);
                                    if (i11 > 0) {
                                        if ((i15 & i11) == 0) {
                                            i11 = c0.c(i11, this.D.getLayoutDirection());
                                        }
                                    }
                                    i11 = 0;
                                }
                                i12 = i11;
                            }
                        }
                    }
                    i11 = 0;
                    c10 = 0;
                    i12 = i11;
                }
                VelocityTracker velocityTracker = this.F;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.F = null;
                }
                int i16 = 4;
                float f10 = 0.0f;
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
                        float f11 = fArr[c10];
                        float f12 = fArr[1];
                        c0Var = c0Var2;
                        z10 = false;
                        a0 a0Var = new a0(this, o1Var2, i13, f11, f12, f10, signum, i12, o1Var2);
                        long d = c0Var.d(this.D, i17, f10 - f11, signum - f12);
                        ValueAnimator valueAnimator = a0Var.h;
                        valueAnimator.setDuration(d);
                        this.B.add(a0Var);
                        o1Var2.q(false);
                        valueAnimator.start();
                        z11 = true;
                    } else if (i12 == 4 || i12 == 8 || i12 == 16 || i12 == 32) {
                        f10 = Math.signum(this.n) * this.D.getWidth();
                    }
                }
                objArr = null;
                signum = 0.0f;
                if (i13 != 2) {
                }
                float[] fArr2 = this.b;
                l(fArr2);
                int i172 = i16;
                float f112 = fArr2[c10];
                float f122 = fArr2[1];
                c0Var = c0Var2;
                z10 = false;
                a0 a0Var2 = new a0(this, o1Var2, i13, f112, f122, f10, signum, i12, o1Var2);
                long d10 = c0Var.d(this.D, i172, f10 - f112, signum - f122);
                ValueAnimator valueAnimator2 = a0Var2.h;
                valueAnimator2.setDuration(d10);
                this.B.add(a0Var2);
                o1Var2.q(false);
                valueAnimator2.start();
                z11 = true;
            } else {
                c0Var = c0Var2;
                z10 = false;
                o(view);
                c0Var.a(this.D, o1Var2);
                z11 = false;
            }
            this.c = null;
        } else {
            c0Var = c0Var2;
            z10 = false;
            z11 = false;
        }
        if (o1Var != null) {
            View view2 = o1Var.a;
            RecyclerView recyclerView2 = this.D;
            int e10 = c0Var.e(recyclerView2, o1Var);
            WeakHashMap weakHashMap2 = r0.j0.a;
            this.A = (c0Var.b(e10, recyclerView2.getLayoutDirection()) & i14) >> (this.y * 8);
            this.s = view2.getLeft();
            this.v = view2.getTop();
            this.c = o1Var;
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
        c0Var.p(this.c, this.y);
        this.D.invalidate();
    }

    public boolean q() {
        return false;
    }

    public final void r(o1 o1Var) {
        RecyclerView recyclerView = this.D;
        c0 c0Var = this.x;
        int e9 = c0Var.e(recyclerView, o1Var);
        WeakHashMap weakHashMap = r0.j0.a;
        if ((c0Var.b(e9, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (o1Var.a.getParent() != this.D) {
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
        p(o1Var, 2);
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x8 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x8 - this.d;
        this.n = f10;
        this.r = y10 - this.e;
        if ((i10 & 4) == 0) {
            this.n = Math.max(0.0f, f10);
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
