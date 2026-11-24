// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class hu5 extends e69 implements h69 {
    public int F;
    public int H;
    public RecyclerView I;
    public VelocityTracker K;
    public ArrayList L;
    public ArrayList M;
    public lj4 O;
    public fu5 P;
    public Rect R;
    public long S;
    public float d;
    public float e;
    public float f;
    public float h;
    public float n;
    public float r;
    public float s;
    public float w;
    public final eu5 y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public u69 c = null;
    public int x = -1;
    public byte E = 0;
    public final ArrayList G = new ArrayList();
    public final o04 J = new o04(this, 17);
    public View N = null;
    public final cu5 Q = new cu5(this);

    public hu5(eu5 eu5Var) {
        this.y = eu5Var;
    }

    public static boolean o(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // h69
    public final void b(View view) {
        if (view == this.N) {
            this.N = null;
        }
        u69 T = this.I.T(view);
        if (T != null) {
            u69 u69Var = this.c;
            if (u69Var != null && T == u69Var) {
                q(null, 0);
                return;
            }
            l(T, false);
            if (this.a.remove(T.a)) {
                this.y.a(this.I, T);
            }
        }
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        rect.setEmpty();
    }

    @Override // e69
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        u69 u69Var = this.c;
        byte b = this.E;
        eu5 eu5Var = this.y;
        eu5Var.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            du5 du5Var = (du5) arrayList.get(i);
            u69 u69Var2 = du5Var.e;
            float f4 = du5Var.a;
            float f5 = du5Var.c;
            if (f4 == f5) {
                du5Var.r = u69Var2.a.getTranslationX();
            } else {
                du5Var.r = td4.A(f5, f4, du5Var.y, f4);
            }
            float f6 = du5Var.b;
            float f7 = du5Var.d;
            if (f6 == f7) {
                du5Var.s = u69Var2.a.getTranslationY();
            } else {
                du5Var.s = td4.A(f7, f6, du5Var.y, f6);
            }
            int save = canvas.save();
            u69 u69Var3 = du5Var.e;
            float f8 = du5Var.r;
            float f9 = du5Var.s;
            byte b2 = du5Var.f;
            eu5 eu5Var2 = eu5Var;
            eu5Var2.n(canvas, recyclerView, u69Var3, f8, f9, b2, false);
            canvas.restoreToCount(save);
            i++;
            eu5Var = eu5Var2;
        }
        eu5 eu5Var3 = eu5Var;
        if (u69Var != null) {
            int save2 = canvas.save();
            eu5Var3.n(canvas, recyclerView, u69Var, f2, f, b, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // e69
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            n(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        u69 u69Var = this.c;
        this.y.getClass();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            du5 du5Var = (du5) arrayList.get(i);
            int save = canvas.save();
            View view = du5Var.e.a;
            canvas.restoreToCount(save);
        }
        if (u69Var != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            du5 du5Var2 = (du5) arrayList.get(i2);
            if (!du5Var2.x) {
                z = true;
            } else if (!du5Var2.n) {
                arrayList.remove(i2);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void h(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.I;
        if (recyclerView2 != recyclerView) {
            cu5 cu5Var = this.Q;
            if (recyclerView2 != null) {
                recyclerView2.r0(this);
                RecyclerView recyclerView3 = this.I;
                recyclerView3.F.remove(cu5Var);
                if (recyclerView3.G == cu5Var) {
                    recyclerView3.G = null;
                }
                ArrayList arrayList = this.I.Q;
                if (arrayList != null) {
                    arrayList.remove(this);
                }
                ArrayList arrayList2 = this.G;
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.y.a(this.I, ((du5) arrayList2.get(0)).e);
                }
                arrayList2.clear();
                this.N = null;
                VelocityTracker velocityTracker = this.K;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.K = null;
                }
                fu5 fu5Var = this.P;
                if (fu5Var != null) {
                    fu5Var.a = false;
                    this.P = null;
                }
                if (this.O != null) {
                    this.O = null;
                }
            }
            this.I = recyclerView;
            if (recyclerView != null) {
                recyclerView.getResources();
                this.f = gm.L(120.0f);
                this.h = gm.L(800.0f);
                this.H = ViewConfiguration.get(this.I.getContext()).getScaledTouchSlop();
                this.I.i(this);
                this.I.F.add(cu5Var);
                RecyclerView recyclerView4 = this.I;
                ArrayList arrayList3 = recyclerView4.Q;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    recyclerView4.Q = arrayList3;
                }
                arrayList3.add(this);
                this.P = new fu5(this);
                this.O = new lj4(this.I.getContext(), this.P);
            }
        }
    }

    public final int i(u69 u69Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.n > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.K;
        eu5 eu5Var = this.y;
        if (velocityTracker != null && this.x > -1) {
            velocityTracker.computeCurrentVelocity(1000, eu5Var.i(this.h));
            float xVelocity = this.K.getXVelocity(this.x);
            float yVelocity = this.K.getYVelocity(this.x);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= eu5Var.g(this.f) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float h = eu5Var.h() * this.I.getWidth();
        if ((i & i2) == 0 || Math.abs(this.n) <= h) {
            return 0;
        }
        return i2;
    }

    public final void j(int i, int i2, MotionEvent motionEvent) {
        View m;
        if (this.c == null && i == 2 && this.E != 2) {
            eu5 eu5Var = this.y;
            if (!eu5Var.k() || this.I.getScrollState() == 1) {
                return;
            }
            f69 layoutManager = this.I.getLayoutManager();
            int i3 = this.x;
            u69 u69Var = null;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x = motionEvent.getX(findPointerIndex) - this.d;
                float y = motionEvent.getY(findPointerIndex) - this.e;
                float abs = Math.abs(x);
                float abs2 = Math.abs(y);
                float f = this.H;
                if ((abs >= f || abs2 >= f) && ((abs <= abs2 || !layoutManager.d()) && ((abs2 <= abs || !layoutManager.e()) && (m = m(motionEvent)) != null))) {
                    u69Var = this.I.T(m);
                }
            }
            if (u69Var != null) {
                RecyclerView recyclerView = this.I;
                int f2 = eu5Var.f(recyclerView, u69Var);
                WeakHashMap weakHashMap = kfc.a;
                int b = (eu5Var.b(f2, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (b != 0) {
                    float x2 = motionEvent.getX(i2);
                    float y2 = motionEvent.getY(i2);
                    float f3 = x2 - this.d;
                    float f4 = y2 - this.e;
                    float abs3 = Math.abs(f3);
                    float abs4 = Math.abs(f4);
                    float f5 = this.H;
                    if (abs3 >= f5 || abs4 >= f5) {
                        if (abs3 > abs4) {
                            if (f3 < 0.0f && (b & 4) == 0) {
                                return;
                            }
                            if (f3 > 0.0f && (b & 8) == 0) {
                                return;
                            }
                        } else {
                            if (f4 < 0.0f && (b & 1) == 0) {
                                return;
                            }
                            if (f4 > 0.0f && (b & 2) == 0) {
                                return;
                            }
                        }
                        this.r = 0.0f;
                        this.n = 0.0f;
                        this.x = motionEvent.getPointerId(0);
                        q(u69Var, 1);
                    }
                }
            }
        }
    }

    public final int k(u69 u69Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.r > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.K;
        eu5 eu5Var = this.y;
        if (velocityTracker != null && this.x > -1) {
            velocityTracker.computeCurrentVelocity(1000, eu5Var.i(this.h));
            float xVelocity = this.K.getXVelocity(this.x);
            float yVelocity = this.K.getYVelocity(this.x);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= eu5Var.g(this.f) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float h = eu5Var.h() * this.I.getHeight();
        if ((i & i2) == 0 || Math.abs(this.r) <= h) {
            return 0;
        }
        return i2;
    }

    public final void l(u69 u69Var, boolean z) {
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            du5 du5Var = (du5) arrayList.get(size);
            if (du5Var.e == u69Var) {
                du5Var.w |= z;
                if (!du5Var.x) {
                    du5Var.h.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View m(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        u69 u69Var = this.c;
        if (u69Var != null) {
            View view = u69Var.a;
            if (o(view, x, y, this.s + this.n, this.w + this.r)) {
                return view;
            }
        }
        ArrayList arrayList = this.G;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            du5 du5Var = (du5) arrayList.get(size);
            View view2 = du5Var.e.a;
            if (o(view2, x, y, du5Var.r, du5Var.s)) {
                return view2;
            }
        }
        return this.I.E(x, y);
    }

    public final void n(float[] fArr) {
        if ((this.F & 12) != 0) {
            fArr[0] = (this.s + this.n) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.F & 3) != 0) {
            fArr[1] = (this.w + this.r) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void p(u69 u69Var) {
        int bottom;
        int abs;
        int top;
        int abs2;
        int left;
        int abs3;
        int right;
        int abs4;
        View view;
        int i;
        int i2;
        if (this.I.isLayoutRequested() || this.E != 2) {
            return;
        }
        eu5 eu5Var = this.y;
        eu5Var.getClass();
        int i3 = (int) (this.s + this.n);
        int i4 = (int) (this.w + this.r);
        View view2 = u69Var.a;
        if (Math.abs(i4 - view2.getTop()) >= view2.getHeight() * 0.5f || Math.abs(i3 - view2.getLeft()) >= view2.getWidth() * 0.5f) {
            ArrayList arrayList = this.L;
            if (arrayList == null) {
                this.L = new ArrayList();
                this.M = new ArrayList();
            } else {
                arrayList.clear();
                this.M.clear();
            }
            int round = Math.round(this.s + this.n);
            int round2 = Math.round(this.w + this.r);
            int width = view2.getWidth() + round;
            int height = view2.getHeight() + round2;
            int i5 = (round + width) / 2;
            int i6 = (round2 + height) / 2;
            f69 layoutManager = this.I.getLayoutManager();
            int r = layoutManager.r();
            int i7 = 0;
            while (i7 < r) {
                View q = layoutManager.q(i7);
                int i8 = i7;
                if (q != view2 && q.getBottom() >= round2 && q.getTop() <= height && q.getRight() >= round && q.getLeft() <= width) {
                    u69 T = this.I.T(q);
                    int abs5 = Math.abs(i5 - ((q.getRight() + q.getLeft()) / 2));
                    int abs6 = Math.abs(i6 - ((q.getBottom() + q.getTop()) / 2));
                    int i9 = (abs6 * abs6) + (abs5 * abs5);
                    view = view2;
                    int size = this.L.size();
                    i = i3;
                    i2 = i4;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < size) {
                        int i12 = size;
                        if (i9 <= ((Integer) this.M.get(i10)).intValue()) {
                            break;
                        }
                        i11++;
                        i10++;
                        size = i12;
                    }
                    this.L.add(i11, T);
                    this.M.add(i11, Integer.valueOf(i9));
                } else {
                    view = view2;
                    i = i3;
                    i2 = i4;
                }
                i7 = i8 + 1;
                view2 = view;
                i3 = i;
                i4 = i2;
            }
            View view3 = view2;
            int i13 = i3;
            int i14 = i4;
            ArrayList arrayList2 = this.L;
            if (arrayList2.size() != 0) {
                int width2 = view3.getWidth() + i13;
                int height2 = view3.getHeight() + i14;
                int left2 = i13 - view3.getLeft();
                int top2 = i14 - view3.getTop();
                int size2 = arrayList2.size();
                u69 u69Var2 = null;
                int i15 = -1;
                for (int i16 = 0; i16 < size2; i16++) {
                    u69 u69Var3 = (u69) arrayList2.get(i16);
                    if (left2 > 0 && (right = u69Var3.a.getRight() - width2) < 0 && u69Var3.a.getRight() > view3.getRight() && (abs4 = Math.abs(right)) > i15) {
                        u69Var2 = u69Var3;
                        i15 = abs4;
                    }
                    if (left2 < 0 && (left = u69Var3.a.getLeft() - i13) > 0 && u69Var3.a.getLeft() < view3.getLeft() && (abs3 = Math.abs(left)) > i15) {
                        u69Var2 = u69Var3;
                        i15 = abs3;
                    }
                    if (top2 < 0 && (top = u69Var3.a.getTop() - i14) > 0 && u69Var3.a.getTop() < view3.getTop() && (abs2 = Math.abs(top)) > i15) {
                        u69Var2 = u69Var3;
                        i15 = abs2;
                    }
                    if (top2 > 0 && (bottom = u69Var3.a.getBottom() - height2) < 0 && u69Var3.a.getBottom() > view3.getBottom() && (abs = Math.abs(bottom)) > i15) {
                        u69Var2 = u69Var3;
                        i15 = abs;
                    }
                }
                if (u69Var2 == null) {
                    this.L.clear();
                    this.M.clear();
                    return;
                }
                int b = u69Var2.b();
                u69Var.b();
                if (eu5Var.o(this.I, u69Var, u69Var2)) {
                    this.y.p(this.I, u69Var, u69Var2, b, i13, i14);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x009b, code lost:
    
        if (r4 > 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r22v0, types: [byte, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        u69 u69Var2;
        int i2;
        char c;
        int i3;
        ?? r16;
        float f;
        if (u69Var == this.c && i == this.E) {
            return;
        }
        this.S = Long.MIN_VALUE;
        byte b = this.E;
        l(u69Var, true);
        this.E = i;
        if (i == 2) {
            if (u69Var == null) {
                u36.j("Must pass a ViewHolder when dragging");
                return;
            }
            this.N = u69Var.a;
        }
        int i4 = (1 << ((i << 3) + 8)) - 1;
        u69 u69Var3 = this.c;
        eu5 eu5Var = this.y;
        if (u69Var3 != null) {
            View view = u69Var3.a;
            if (view.getParent() != null) {
                boolean r = r();
                if (b == 2) {
                    i3 = 0;
                    r16 = 0;
                } else {
                    if (this.E != 2) {
                        int f2 = eu5Var.f(this.I, u69Var3);
                        RecyclerView recyclerView = this.I;
                        WeakHashMap weakHashMap = kfc.a;
                        int b2 = (eu5Var.b(f2, recyclerView.getLayoutDirection()) & 65280) >> 8;
                        if (b2 != 0) {
                            int i5 = (f2 & 65280) >> 8;
                            c = 0;
                            if (Math.abs(this.n) > Math.abs(this.r)) {
                                i2 = i(u69Var3, b2);
                                if (i2 <= 0) {
                                    i2 = k(u69Var3, b2);
                                } else if ((i5 & i2) == 0) {
                                    i2 = eu5.c(i2, this.I.getLayoutDirection());
                                }
                                i3 = i2;
                                r16 = c;
                            } else {
                                i2 = k(u69Var3, b2);
                                if (i2 <= 0) {
                                    i2 = i(u69Var3, b2);
                                    if (i2 > 0) {
                                        if ((i5 & i2) == 0) {
                                            i2 = eu5.c(i2, this.I.getLayoutDirection());
                                        }
                                    }
                                    i2 = 0;
                                }
                                i3 = i2;
                                r16 = c;
                            }
                        }
                    }
                    i2 = 0;
                    c = 0;
                    i3 = i2;
                    r16 = c;
                }
                VelocityTracker velocityTracker = this.K;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.K = null;
                }
                float f3 = 0.0f;
                if (!r) {
                    if (i3 == 1 || i3 == 2) {
                        f = Math.signum(this.r) * this.I.getHeight();
                    } else if (i3 == 4 || i3 == 8 || i3 == 16 || i3 == 32) {
                        f3 = Math.signum(this.n) * this.I.getWidth();
                        f = 0.0f;
                    }
                    int i6 = b != 2 ? i3 > 0 ? 2 : 4 : 8;
                    float[] fArr = this.b;
                    n(fArr);
                    float f4 = fArr[r16];
                    float f5 = fArr[1];
                    z = r16;
                    du5 du5Var = new du5(this, u69Var3, b, f4, f5, f3, f, i3, u69Var3);
                    long d = eu5Var.d(this.I, i6, f3 - f4, f - f5);
                    ValueAnimator valueAnimator = du5Var.h;
                    valueAnimator.setDuration(d);
                    this.G.add(du5Var);
                    u69Var3.q(z);
                    valueAnimator.start();
                    z2 = true;
                    u69Var2 = null;
                }
                f = 0.0f;
                if (b != 2) {
                }
                float[] fArr2 = this.b;
                n(fArr2);
                float f42 = fArr2[r16];
                float f52 = fArr2[1];
                z = r16;
                du5 du5Var2 = new du5(this, u69Var3, b, f42, f52, f3, f, i3, u69Var3);
                long d2 = eu5Var.d(this.I, i6, f3 - f42, f - f52);
                ValueAnimator valueAnimator2 = du5Var2.h;
                valueAnimator2.setDuration(d2);
                this.G.add(du5Var2);
                u69Var3.q(z);
                valueAnimator2.start();
                z2 = true;
                u69Var2 = null;
            } else {
                z = false;
                if (view == this.N) {
                    u69Var2 = null;
                    this.N = null;
                } else {
                    u69Var2 = null;
                }
                eu5Var.a(this.I, u69Var3);
                z2 = false;
            }
            this.c = u69Var2;
        } else {
            z = false;
            z2 = false;
        }
        if (u69Var != null) {
            View view2 = u69Var.a;
            RecyclerView recyclerView2 = this.I;
            int f6 = eu5Var.f(recyclerView2, u69Var);
            WeakHashMap weakHashMap2 = kfc.a;
            this.F = (eu5Var.b(f6, recyclerView2.getLayoutDirection()) & i4) >> (this.E << 3);
            this.s = view2.getLeft();
            this.w = view2.getTop();
            this.c = u69Var;
            if (i == 2) {
                try {
                    view2.performHapticFeedback(z ? 1 : 0, 2);
                } catch (Exception unused) {
                }
            }
        }
        ViewParent parent = this.I.getParent();
        if (parent != null) {
            if (this.c != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.I.getLayoutManager().f = true;
        }
        eu5Var.q(this.c, this.E);
        this.I.invalidate();
    }

    public boolean r() {
        return false;
    }

    public final void s(u69 u69Var) {
        RecyclerView recyclerView = this.I;
        eu5 eu5Var = this.y;
        int f = eu5Var.f(recyclerView, u69Var);
        WeakHashMap weakHashMap = kfc.a;
        if ((eu5Var.b(f, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (u69Var.a.getParent() != this.I) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.K = VelocityTracker.obtain();
        this.r = 0.0f;
        this.n = 0.0f;
        q(u69Var, 2);
    }

    public final void t(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.n = f;
        this.r = y - this.e;
        if ((i & 4) == 0) {
            f = Math.max(0.0f, f);
            this.n = f;
        }
        if ((i & 8) == 0) {
            this.n = Math.min(0.0f, f);
        }
        if ((i & 1) == 0) {
            this.r = Math.max(0.0f, this.r);
        }
        if ((i & 2) == 0) {
            this.r = Math.min(0.0f, this.r);
        }
    }

    @Override // h69
    public final void c() {
    }
}
