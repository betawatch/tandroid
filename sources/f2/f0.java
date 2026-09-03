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
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class f0 extends v0 {
    public int B;
    public int D;
    public RecyclerView E;
    public VelocityTracker G;
    public ArrayList H;
    public ArrayList I;
    public org.telegram.ui.Cells.f1 K;
    public c0 L;
    public Rect N;
    public long O;
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
    public m1 c = null;
    public int w = -1;
    public int y = 0;
    public final ArrayList C = new ArrayList();
    public final androidx.activity.i F = new androidx.activity.i(this, 18);
    public View J = null;
    public final y M = new y(this);

    public f0(b0 b0Var) {
        this.x = b0Var;
    }

    public static boolean m(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    @Override // f2.v0
    public final void a(Rect rect, View view, RecyclerView recyclerView, j1 j1Var) {
        rect.setEmpty();
    }

    @Override // f2.v0
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
        m1 m1Var = this.c;
        int i10 = this.y;
        b0 b0Var = this.x;
        b0Var.getClass();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            z zVar = (z) arrayList.get(i11);
            m1 m1Var2 = zVar.e;
            float f13 = zVar.a;
            float f14 = zVar.c;
            if (f13 == f14) {
                zVar.r = m1Var2.a.getTranslationX();
            } else {
                zVar.r = e2.c.w(f14, f13, zVar.x, f13);
            }
            float f15 = zVar.b;
            float f16 = zVar.d;
            if (f15 == f16) {
                zVar.s = m1Var2.a.getTranslationY();
            } else {
                zVar.s = e2.c.w(f16, f15, zVar.x, f15);
            }
            int save = canvas.save();
            b0Var.m(canvas, recyclerView, zVar.e, zVar.r, zVar.s, zVar.f, false);
            canvas.restoreToCount(save);
        }
        if (m1Var != null) {
            int save2 = canvas.save();
            b0Var.m(canvas, recyclerView, m1Var, f11, f10, i10, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // f2.v0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        boolean z4 = false;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
        }
        m1 m1Var = this.c;
        this.x.getClass();
        ArrayList arrayList = this.C;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            int save = canvas.save();
            View view = zVar.e.a;
            canvas.restoreToCount(save);
        }
        if (m1Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i11 = size - 1; i11 >= 0; i11--) {
            z zVar2 = (z) arrayList.get(i11);
            boolean z10 = zVar2.w;
            if (z10 && !zVar2.n) {
                arrayList.remove(i11);
            } else if (!z10) {
                z4 = true;
            }
        }
        if (z4) {
            recyclerView.invalidate();
        }
    }

    public final void d(sl0 sl0Var) {
        RecyclerView recyclerView = this.E;
        if (recyclerView == sl0Var) {
            return;
        }
        y yVar = this.M;
        if (recyclerView != null) {
            recyclerView.p0(this);
            RecyclerView recyclerView2 = this.E;
            recyclerView2.B.remove(yVar);
            if (recyclerView2.C == yVar) {
                recyclerView2.C = null;
            }
            ArrayList arrayList = this.E.M;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            ArrayList arrayList2 = this.C;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.x.a(this.E, ((z) arrayList2.get(0)).e);
            }
            arrayList2.clear();
            this.J = null;
            VelocityTracker velocityTracker = this.G;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.G = null;
            }
            c0 c0Var = this.L;
            if (c0Var != null) {
                c0Var.a = false;
                this.L = null;
            }
            if (this.K != null) {
                this.K = null;
            }
        }
        this.E = sl0Var;
        if (sl0Var != null) {
            sl0Var.getResources();
            this.f = AndroidUtilities.dp(120.0f);
            this.h = AndroidUtilities.dp(800.0f);
            this.D = ViewConfiguration.get(this.E.getContext()).getScaledTouchSlop();
            this.E.i(this);
            this.E.B.add(yVar);
            RecyclerView recyclerView3 = this.E;
            if (recyclerView3.M == null) {
                recyclerView3.M = new ArrayList();
            }
            recyclerView3.M.add(this);
            this.L = new c0(this);
            this.K = new org.telegram.ui.Cells.f1(this.E.getContext(), this.L);
        }
    }

    public final int f(m1 m1Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = this.n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.G;
        b0 b0Var = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, b0Var.h(this.h));
            float xVelocity = this.G.getXVelocity(this.w);
            float yVelocity = this.G.getYVelocity(this.w);
            int i12 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i12 & i10) != 0 && i11 == i12 && abs >= b0Var.f(this.f) && abs > Math.abs(yVelocity)) {
                return i12;
            }
        }
        float g10 = b0Var.g() * this.E.getWidth();
        if ((i10 & i11) == 0 || Math.abs(this.n) <= g10) {
            return 0;
        }
        return i11;
    }

    public final void h(int i10, int i11, MotionEvent motionEvent) {
        View k10;
        if (this.c == null && i10 == 2 && this.y != 2) {
            b0 b0Var = this.x;
            if (b0Var.j() && this.E.getScrollState() != 1) {
                w0 layoutManager = this.E.getLayoutManager();
                int i12 = this.w;
                m1 m1Var = null;
                if (i12 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i12);
                    float x10 = motionEvent.getX(findPointerIndex) - this.d;
                    float y10 = motionEvent.getY(findPointerIndex) - this.e;
                    float abs = Math.abs(x10);
                    float abs2 = Math.abs(y10);
                    float f10 = this.D;
                    if ((abs >= f10 || abs2 >= f10) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (k10 = k(motionEvent)) != null))) {
                        m1Var = this.E.T(k10);
                    }
                }
                if (m1Var == null) {
                    return;
                }
                RecyclerView recyclerView = this.E;
                int e6 = b0Var.e(recyclerView, m1Var);
                WeakHashMap weakHashMap = r0.j0.a;
                int b10 = (b0Var.b(e6, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (b10 == 0) {
                    return;
                }
                float x11 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                float f11 = x11 - this.d;
                float f12 = y11 - this.e;
                float abs3 = Math.abs(f11);
                float abs4 = Math.abs(f12);
                float f13 = this.D;
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
                    p(m1Var, 1);
                }
            }
        }
    }

    public final int i(m1 m1Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.G;
        b0 b0Var = this.x;
        if (velocityTracker != null && this.w > -1) {
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, b0Var.h(this.h));
            float xVelocity = this.G.getXVelocity(this.w);
            float yVelocity = this.G.getYVelocity(this.w);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && abs >= b0Var.f(this.f) && abs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float g10 = b0Var.g() * this.E.getHeight();
        if ((i10 & i11) == 0 || Math.abs(this.r) <= g10) {
            return 0;
        }
        return i11;
    }

    public final void j(m1 m1Var, boolean z4) {
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            if (zVar.e == m1Var) {
                zVar.v |= z4;
                if (!zVar.w) {
                    zVar.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View k(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        m1 m1Var = this.c;
        if (m1Var != null) {
            View view = m1Var.a;
            if (m(view, x10, y10, this.s + this.n, this.v + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            z zVar = (z) arrayList.get(size);
            View view2 = zVar.e.a;
            if (m(view2, x10, y10, zVar.r, zVar.s)) {
                return view2;
            }
        }
        return this.E.E(x10, y10);
    }

    public final void l(float[] fArr) {
        if ((this.B & 12) != 0) {
            fArr[0] = (this.s + this.n) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.B & 3) != 0) {
            fArr[1] = (this.v + this.r) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void n(m1 m1Var) {
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
        if (!this.E.isLayoutRequested() && this.y == 2) {
            b0 b0Var = this.x;
            b0Var.getClass();
            int i13 = (int) (this.s + this.n);
            int i14 = (int) (this.v + this.r);
            View view2 = m1Var.a;
            if (Math.abs(i14 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i13 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.H;
                if (arrayList2 == null) {
                    this.H = new ArrayList();
                    this.I = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.I.clear();
                }
                int round = Math.round(this.s + this.n);
                int round2 = Math.round(this.v + this.r);
                int width = view2.getWidth() + round;
                int height = view2.getHeight() + round2;
                int i15 = (round + width) / 2;
                int i16 = (round2 + height) / 2;
                w0 layoutManager = this.E.getLayoutManager();
                int r10 = layoutManager.r();
                int i17 = 0;
                while (i17 < r10) {
                    View q10 = layoutManager.q(i17);
                    if (q10 == view2) {
                        i10 = i17;
                    } else {
                        i10 = i17;
                        if (q10.getBottom() >= round2 && q10.getTop() <= height && q10.getRight() >= round && q10.getLeft() <= width) {
                            m1 T = this.E.T(q10);
                            int abs5 = Math.abs(i15 - ((q10.getRight() + q10.getLeft()) / 2));
                            int abs6 = Math.abs(i16 - ((q10.getBottom() + q10.getTop()) / 2));
                            int i18 = (abs6 * abs6) + (abs5 * abs5);
                            view = view2;
                            int size = this.H.size();
                            i11 = round;
                            i12 = i13;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < size) {
                                int i21 = size;
                                if (i18 <= ((Integer) this.I.get(i19)).intValue()) {
                                    break;
                                }
                                i20++;
                                i19++;
                                size = i21;
                            }
                            this.H.add(i20, T);
                            this.I.add(i20, Integer.valueOf(i18));
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
                ArrayList arrayList3 = this.H;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view3.getWidth() + i22;
                int height2 = view3.getHeight() + i14;
                int left2 = i22 - view3.getLeft();
                int top2 = i14 - view3.getTop();
                int size2 = arrayList3.size();
                m1 m1Var2 = null;
                int i23 = -1;
                int i24 = 0;
                while (i24 < size2) {
                    m1 m1Var3 = (m1) arrayList3.get(i24);
                    if (left2 <= 0 || (right = m1Var3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (m1Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i23) {
                            i23 = abs4;
                            m1Var2 = m1Var3;
                        }
                    }
                    if (left2 < 0 && (left = m1Var3.a.getLeft() - i22) > 0 && m1Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i23) {
                        i23 = abs3;
                        m1Var2 = m1Var3;
                    }
                    if (top2 < 0 && (top = m1Var3.a.getTop() - i14) > 0 && m1Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i23) {
                        i23 = abs2;
                        m1Var2 = m1Var3;
                    }
                    if (top2 > 0 && (bottom = m1Var3.a.getBottom() - height2) < 0 && m1Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i23) {
                        i23 = abs;
                        m1Var2 = m1Var3;
                    }
                    i24++;
                    arrayList3 = arrayList;
                }
                if (m1Var2 == null) {
                    this.H.clear();
                    this.I.clear();
                    return;
                }
                int b10 = m1Var2.b();
                m1Var.b();
                if (b0Var.n(this.E, m1Var, m1Var2)) {
                    this.x.o(this.E, m1Var, m1Var2, b10, i22, i14);
                }
            }
        }
    }

    public final void o(View view) {
        if (view == this.J) {
            this.J = null;
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
    public final void p(m1 m1Var, int i10) {
        b0 b0Var;
        boolean z4;
        boolean z10;
        char c3;
        int i11;
        int i12;
        float signum;
        Object[] objArr;
        if (m1Var == this.c && i10 == this.y) {
            return;
        }
        this.O = Long.MIN_VALUE;
        int i13 = this.y;
        j(m1Var, true);
        this.y = i10;
        if (i10 == 2) {
            if (m1Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.J = m1Var.a;
        }
        int i14 = (1 << ((i10 * 8) + 8)) - 1;
        m1 m1Var2 = this.c;
        b0 b0Var2 = this.x;
        if (m1Var2 != null) {
            View view = m1Var2.a;
            if (view.getParent() != null) {
                boolean q10 = q();
                if (i13 == 2) {
                    i12 = 0;
                    c3 = 0;
                } else {
                    if (this.y != 2) {
                        int e6 = b0Var2.e(this.E, m1Var2);
                        RecyclerView recyclerView = this.E;
                        WeakHashMap weakHashMap = r0.j0.a;
                        int b10 = (b0Var2.b(e6, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (b10 != 0) {
                            int i15 = (e6 & 65280) >> 8;
                            c3 = 0;
                            if (Math.abs(this.n) > Math.abs(this.r)) {
                                i11 = f(m1Var2, b10);
                                if (i11 <= 0) {
                                    i11 = i(m1Var2, b10);
                                } else if ((i15 & i11) == 0) {
                                    i11 = b0.c(i11, this.E.getLayoutDirection());
                                }
                                i12 = i11;
                            } else {
                                i11 = i(m1Var2, b10);
                                if (i11 <= 0) {
                                    i11 = f(m1Var2, b10);
                                    if (i11 > 0) {
                                        if ((i15 & i11) == 0) {
                                            i11 = b0.c(i11, this.E.getLayoutDirection());
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
                VelocityTracker velocityTracker = this.G;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.G = null;
                }
                int i16 = 4;
                float f10 = 0.0f;
                if (!q10) {
                    if (i12 == 1 || i12 == 2) {
                        signum = Math.signum(this.r) * this.E.getHeight();
                        objArr = null;
                        if (i13 != 2) {
                            i16 = 8;
                        } else if (i12 > 0) {
                            i16 = 2;
                        }
                        float[] fArr = this.b;
                        l(fArr);
                        int i17 = i16;
                        float f11 = fArr[c3];
                        float f12 = fArr[1];
                        b0Var = b0Var2;
                        z4 = false;
                        z zVar = new z(this, m1Var2, i13, f11, f12, f10, signum, i12, m1Var2);
                        long d = b0Var.d(this.E, i17, f10 - f11, signum - f12);
                        ValueAnimator valueAnimator = zVar.h;
                        valueAnimator.setDuration(d);
                        this.C.add(zVar);
                        m1Var2.q(false);
                        valueAnimator.start();
                        z10 = true;
                    } else if (i12 == 4 || i12 == 8 || i12 == 16 || i12 == 32) {
                        f10 = Math.signum(this.n) * this.E.getWidth();
                    }
                }
                objArr = null;
                signum = 0.0f;
                if (i13 != 2) {
                }
                float[] fArr2 = this.b;
                l(fArr2);
                int i172 = i16;
                float f112 = fArr2[c3];
                float f122 = fArr2[1];
                b0Var = b0Var2;
                z4 = false;
                z zVar2 = new z(this, m1Var2, i13, f112, f122, f10, signum, i12, m1Var2);
                long d10 = b0Var.d(this.E, i172, f10 - f112, signum - f122);
                ValueAnimator valueAnimator2 = zVar2.h;
                valueAnimator2.setDuration(d10);
                this.C.add(zVar2);
                m1Var2.q(false);
                valueAnimator2.start();
                z10 = true;
            } else {
                b0Var = b0Var2;
                z4 = false;
                o(view);
                b0Var.a(this.E, m1Var2);
                z10 = false;
            }
            this.c = null;
        } else {
            b0Var = b0Var2;
            z4 = false;
            z10 = false;
        }
        if (m1Var != null) {
            View view2 = m1Var.a;
            RecyclerView recyclerView2 = this.E;
            int e10 = b0Var.e(recyclerView2, m1Var);
            WeakHashMap weakHashMap2 = r0.j0.a;
            this.B = (b0Var.b(e10, recyclerView2.getLayoutDirection()) & i14) >> (this.y * 8);
            this.s = view2.getLeft();
            this.v = view2.getTop();
            this.c = m1Var;
            if (i10 == 2) {
                try {
                    view2.performHapticFeedback(z4 ? 1 : 0, 2);
                } catch (Exception unused) {
                }
            }
        }
        ViewParent parent = this.E.getParent();
        if (parent != null) {
            if (this.c != null) {
                z4 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z4);
        }
        if (!z10) {
            this.E.getLayoutManager().f = true;
        }
        b0Var.p(this.c, this.y);
        this.E.invalidate();
    }

    public boolean q() {
        return false;
    }

    public final void r(m1 m1Var) {
        RecyclerView recyclerView = this.E;
        b0 b0Var = this.x;
        int e6 = b0Var.e(recyclerView, m1Var);
        WeakHashMap weakHashMap = r0.j0.a;
        if ((b0Var.b(e6, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (m1Var.a.getParent() != this.E) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.G = VelocityTracker.obtain();
        this.r = 0.0f;
        this.n = 0.0f;
        p(m1Var, 2);
    }

    public final void s(int i10, int i11, MotionEvent motionEvent) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.d;
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
