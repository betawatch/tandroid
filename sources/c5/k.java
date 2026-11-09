package c5;

import a8.ra;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import bi.ab;
import bi.sd;
import di.j4;
import di.r4;
import di.w;
import di.w7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import q4.q;
import r0.a0;
import r0.i0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class k extends ViewGroup {
    public static final int[] s0 = {R.attr.layout_gravity};
    public static final b t0 = new b(0);
    public static final sd u0;
    public static final b v0;
    public int D;
    public int E;
    public float F;
    public float G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public final int O;
    public int P;
    public final int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public int V;
    public VelocityTracker W;
    public int a;
    public final int a0;
    public final ArrayList b;
    public final int b0;
    public final d c;
    public final int c0;
    public final Rect d;
    public final int d0;
    public a e;
    public boolean e0;
    public int f;
    public EdgeEffect f0;
    public EdgeEffect g0;
    public int h;
    public boolean h0;
    public boolean i0;
    public int j0;
    public ArrayList k0;
    public g l0;
    public r4 m0;
    public Parcelable n;
    public int n0;
    public int o0;
    public ArrayList p0;
    public final ra q0;
    public Scroller r;
    public int r0;
    public boolean s;
    public h w;
    public int x;
    public Drawable y;

    static {
        int i7 = 1;
        u0 = new sd(i7);
        v0 = new b(i7);
    }

    public k(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new d();
        this.d = new Rect();
        this.h = -1;
        this.n = null;
        this.F = -3.4028235E38f;
        this.G = Float.MAX_VALUE;
        this.L = 1;
        this.V = -1;
        this.h0 = true;
        this.q0 = new ra(this, 13);
        this.r0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.r = new Scroller(context2, u0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.Q = viewConfiguration.getScaledPagingTouchSlop();
        this.a0 = (int) (400.0f * f10);
        this.b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f0 = new EdgeEffect(context2);
        this.g0 = new EdgeEffect(context2);
        this.c0 = (int) (25.0f * f10);
        this.d0 = (int) (2.0f * f10);
        this.O = (int) (f10 * 16.0f);
        i0.j(this, new f(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        a0.i(this, new q(this));
    }

    public static boolean d(int i7, int i10, int i11, View view, boolean z9) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && d(i7, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z9 && view.canScrollHorizontally(-i7);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z9) {
        if (this.J != z9) {
            this.J = z9;
        }
    }

    public final d a(int i7, int i10) {
        d dVar = new d();
        dVar.b = i7;
        dVar.a = this.e.e(this, i7);
        this.e.getClass();
        dVar.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i10 < 0 || i10 >= arrayList.size()) {
            arrayList.add(dVar);
            return dVar;
        }
        arrayList.add(i10, dVar);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i7, int i10) {
        d k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                    childAt.addFocusables(arrayList, i7, i10);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        d k10;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        e eVar = (e) layoutParams;
        boolean z9 = eVar.a | (view.getClass().getAnnotation(c.class) != null);
        eVar.a = z9;
        if (!this.I) {
            super.addView(view, i7, layoutParams);
        } else {
            if (z9) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            eVar.d = true;
            addViewInLayout(view, i7, layoutParams);
        }
    }

    public final void b(g gVar) {
        if (this.k0 == null) {
            this.k0 = new ArrayList();
        }
        this.k0.add(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i7) {
        View findNextFocus;
        boolean z9;
        int i10;
        boolean requestFocus;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
            boolean z10 = true;
            z9 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.d;
                if (i7 == 17) {
                    int i11 = j(findNextFocus, rect).left;
                    int i12 = j(findFocus, rect).left;
                    if (findFocus == null || i11 < i12) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i13 = this.f;
                        if (i13 > 0) {
                            x(i13 - 1, true);
                            z9 = z10;
                        }
                        z10 = false;
                        z9 = z10;
                    }
                } else if (i7 == 66) {
                    requestFocus = (findFocus == null || j(findNextFocus, rect).left > j(findFocus, rect).left) ? findNextFocus.requestFocus() : p();
                }
                z9 = requestFocus;
            } else if (i7 != 17 || i7 == 1) {
                i10 = this.f;
                if (i10 > 0) {
                    x(i10 - 1, true);
                    z9 = z10;
                }
                z10 = false;
                z9 = z10;
            } else if (i7 == 66 || i7 == 2) {
                z9 = p();
            }
            if (z9) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i7));
            }
            return z9;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        boolean z102 = true;
        z9 = false;
        if (findNextFocus == null) {
        }
        if (i7 != 17) {
        }
        i10 = this.f;
        if (i10 > 0) {
        }
        z102 = false;
        z9 = z102;
        if (z9) {
        }
        return z9;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i7 < 0 ? scrollX > ((int) (((float) clientWidth) * this.F)) : i7 > 0 && scrollX < ((int) (((float) clientWidth) * this.G));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.s = true;
        if (this.r.isFinished() || !this.r.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.r.getCurrX();
        int currY = this.r.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!q(currX)) {
                this.r.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = i0.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z9 = keyEvent.hasModifiers(2) ? p() : c(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z9 = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z9 = c(1);
                        }
                    }
                    if (!z9) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i7 = this.f;
                        if (i7 > 0) {
                            x(i7 - 1, true);
                            z9 = true;
                        }
                    } else {
                        z9 = c(17);
                    }
                    if (!z9) {
                    }
                }
            }
            z9 = false;
            if (!z9) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z9 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.e) != null && aVar.b() > 1)) {
            if (!this.f0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.F * width);
                this.f0.setSize(height, width);
                z9 = this.f0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.g0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.G + 1.0f)) * width2);
                this.g0.setSize(height2, width2);
                z9 |= this.g0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f0.finish();
            this.g0.finish();
        }
        if (z9) {
            WeakHashMap weakHashMap = i0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.y;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z9) {
        boolean z10 = this.r0 == 2;
        if (z10) {
            setScrollingCacheEnabled(false);
            if (!this.r.isFinished()) {
                this.r.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.r.getCurrX();
                int currY = this.r.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        q(currX);
                    }
                }
            }
        }
        this.K = false;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i7);
            if (dVar.c) {
                dVar.c = false;
                z10 = true;
            }
            i7++;
        }
        if (z10) {
            ra raVar = this.q0;
            if (!z9) {
                raVar.run();
            } else {
                WeakHashMap weakHashMap = i0.a;
                postOnAnimation(raVar);
            }
        }
    }

    public final void f() {
        int b10 = this.e.b();
        this.a = b10;
        ArrayList arrayList = this.b;
        boolean z9 = arrayList.size() < (this.L * 2) + 1 && arrayList.size() < b10;
        int i7 = this.f;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < arrayList.size()) {
            d dVar = (d) arrayList.get(i10);
            int c10 = this.e.c(dVar.a);
            if (c10 != -1) {
                if (c10 == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z10) {
                        this.e.getClass();
                        z10 = true;
                    }
                    this.e.a(this, dVar.a);
                    int i11 = this.f;
                    if (i11 == dVar.b) {
                        i7 = Math.max(0, Math.min(i11, b10 - 1));
                    }
                } else {
                    int i12 = dVar.b;
                    if (i12 != c10) {
                        if (i12 == this.f) {
                            i7 = c10;
                        }
                        dVar.b = c10;
                    }
                }
                z9 = true;
            }
            i10++;
        }
        if (z10) {
            this.e.getClass();
        }
        Collections.sort(arrayList, t0);
        if (z9) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                e eVar = (e) getChildAt(i13).getLayoutParams();
                if (!eVar.a) {
                    eVar.c = 0.0f;
                }
            }
            y(i7, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i7, int i10, float f10, int i11) {
        if (Math.abs(i11) <= this.c0 || Math.abs(i10) <= this.a0) {
            i7 += (int) (f10 + (i7 >= this.f ? 0.4f : 0.6f));
        } else if (i10 <= 0) {
            i7++;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            return Math.max(((d) arrayList.get(0)).b, Math.min(i7, ((d) jg.g.i(1, arrayList)).b));
        }
        return i7;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        e eVar = new e(-1, -1);
        eVar.c = 0.0f;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i10) {
        if (this.o0 == 2) {
            i10 = (i7 - 1) - i10;
        }
        return ((e) ((View) this.p0.get(i10)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.L;
    }

    public int getPageMargin() {
        return this.x;
    }

    public final void h(int i7) {
        g gVar = this.l0;
        if (gVar != null) {
            gVar.a(i7);
        }
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                g gVar2 = (g) this.k0.get(i10);
                if (gVar2 != null) {
                    gVar2.a(i7);
                }
            }
        }
    }

    public final void i() {
        if (!this.e0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.e != null) {
            VelocityTracker velocityTracker = this.W;
            velocityTracker.computeCurrentVelocity(1000, this.b0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.V);
            this.K = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            d l10 = l();
            y(g(l10.b, xVelocity, ((scrollX / clientWidth) - l10.e) / l10.d, (int) (this.R - this.T)), xVelocity, true, true);
        }
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker2 = this.W;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.W = null;
        }
        this.e0 = false;
    }

    public final Rect j(View view, Rect rect) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final d k(View view) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i7 >= arrayList.size()) {
                return null;
            }
            d dVar = (d) arrayList.get(i7);
            if (this.e.f(view, dVar.a)) {
                return dVar;
            }
            i7++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d l() {
        d dVar;
        int i7;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.x / clientWidth : 0.0f;
        int i10 = 0;
        boolean z9 = true;
        d dVar2 = null;
        int i11 = -1;
        float f12 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                break;
            }
            d dVar3 = (d) arrayList.get(i10);
            if (z9 || dVar3.b == (i7 = i11 + 1)) {
                dVar = dVar3;
            } else {
                float f13 = f10 + f12 + f11;
                d dVar4 = this.c;
                dVar4.e = f13;
                dVar4.b = i7;
                this.e.getClass();
                dVar4.d = 1.0f;
                i10--;
                dVar = dVar4;
            }
            f10 = dVar.e;
            float f14 = dVar.d + f10 + f11;
            if (!z9 && scrollX < f10) {
                break;
            }
            if (scrollX < f14 || i10 == arrayList.size() - 1) {
                break;
            }
            int i12 = dVar.b;
            float f15 = dVar.d;
            i10++;
            d dVar5 = dVar;
            i11 = i12;
            f12 = f15;
            dVar2 = dVar5;
            z9 = false;
        }
        return dVar;
    }

    public final d m(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            d dVar = (d) arrayList.get(i10);
            if (dVar.b == i7) {
                return dVar;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(float f10, int i7, int i10) {
        int max;
        int i11;
        int left;
        if (this.j0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a) {
                    int i13 = eVar.b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            i11 = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            i11 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i11;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = max;
                    i11 = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i11;
                }
            }
        }
        g gVar = this.l0;
        if (gVar != null) {
            gVar.b(f10, i7, i10);
        }
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                g gVar2 = (g) this.k0.get(i15);
                if (gVar2 != null) {
                    gVar2.b(f10, i7, i10);
                }
            }
        }
        if (this.m0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!((e) childAt2.getLayoutParams()).a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    w wVar = (w) this.m0.b;
                    w7 w7Var = (w7) childAt2;
                    if (Math.abs(left2) >= 1.0f) {
                        w7Var.a(false);
                        g0.i3(new ab(w7Var, 29), 16L);
                    } else {
                        if (!w7Var.d) {
                            w7Var.a(true);
                            if (wVar.x0 != null) {
                                j4 j4Var = w7Var.a;
                                long j3 = w7Var.b;
                                ArrayList arrayList2 = w7Var.c;
                                j4Var.k1 = j3;
                                j4Var.i1 = arrayList2;
                                j4Var.m0(-1);
                            } else {
                                w7Var.a.S0(-1, w7Var.b);
                            }
                        }
                        w7Var.a.setOffset(left2);
                        childAt2.setCameraDistance(childAt2.getWidth() * 15);
                        childAt2.setPivotX(left2 < 0.0f ? childAt2.getWidth() : 0.0f);
                        childAt2.setPivotY(childAt2.getHeight() * 0.5f);
                        childAt2.setRotationY(left2 * 90.0f);
                    }
                }
            }
        }
        this.i0 = true;
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.V) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.R = motionEvent.getX(i7);
            this.V = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.W;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.q0);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        ArrayList arrayList;
        int i10;
        super.onDraw(canvas);
        if (this.x <= 0 || this.y == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.x / width;
        int i11 = 0;
        d dVar = (d) arrayList2.get(0);
        float f12 = dVar.e;
        int size = arrayList2.size();
        int i12 = dVar.b;
        int i13 = ((d) arrayList2.get(size - 1)).b;
        while (i12 < i13) {
            while (true) {
                i7 = dVar.b;
                if (i12 <= i7 || i11 >= size) {
                    break;
                }
                i11++;
                dVar = (d) arrayList2.get(i11);
            }
            if (i12 == i7) {
                float f13 = dVar.e;
                float f14 = dVar.d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                this.e.getClass();
                f10 = (f12 + 1.0f) * width;
                f12 = 1.0f + f11 + f12;
            }
            if (this.x + f10 > scrollX) {
                arrayList = arrayList2;
                i10 = scrollX;
                this.y.setBounds(Math.round(f10), this.D, Math.round(this.x + f10), this.E);
                this.y.draw(canvas);
            } else {
                arrayList = arrayList2;
                i10 = scrollX;
            }
            if (f10 > i10 + r3) {
                return;
            }
            i12++;
            arrayList2 = arrayList;
            scrollX = i10;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & qs.e4;
        if (action == 3 || action == 1) {
            v();
            return false;
        }
        if (action != 0) {
            if (this.M) {
                return true;
            }
            if (this.N) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.T = x10;
            this.R = x10;
            float y10 = motionEvent.getY();
            this.U = y10;
            this.S = y10;
            this.V = motionEvent.getPointerId(0);
            this.N = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.r0 != 2 || Math.abs(this.r.getFinalX() - this.r.getCurrX()) <= this.d0) {
                e(false);
                this.M = false;
            } else {
                this.r.abortAnimation();
                this.K = false;
                s();
                this.M = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i7 = this.V;
            if (i7 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i7);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.R;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.U);
                if (f10 != 0.0f) {
                    float f11 = this.R;
                    if ((f11 >= this.P || f10 <= 0.0f) && ((f11 <= getWidth() - this.P || f10 >= 0.0f) && d((int) f10, (int) x11, (int) y11, this, false))) {
                        this.R = x11;
                        this.S = y11;
                        this.N = true;
                        return false;
                    }
                }
                int i10 = this.Q;
                float f12 = i10;
                if (abs > f12 && abs * 0.5f > abs2) {
                    this.M = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.T;
                    float f14 = i10;
                    this.R = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.S = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f12) {
                    this.N = true;
                }
                if (this.M && r(x11)) {
                    WeakHashMap weakHashMap = i0.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            o(motionEvent);
        }
        if (this.W == null) {
            this.W = VelocityTracker.obtain();
        }
        this.W.addMovement(motionEvent);
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10;
        d k10;
        int max;
        int i13;
        int max2;
        int i14;
        int childCount = getChildCount();
        int i15 = i11 - i7;
        int i16 = i12 - i10;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a) {
                    int i19 = eVar.b;
                    int i20 = i19 & 7;
                    int i21 = i19 & qs.x1;
                    if (i20 != 1) {
                        if (i20 == 3) {
                            i13 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i20 != 5) {
                            i13 = paddingLeft;
                        } else {
                            max = (i15 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i21 == 16) {
                            if (i21 == 48) {
                                i14 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i21 != 80) {
                                i14 = paddingTop;
                            } else {
                                max2 = (i16 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i22 = paddingLeft + scrollX;
                            childAt.layout(i22, paddingTop, childAt.getMeasuredWidth() + i22, childAt.getMeasuredHeight() + paddingTop);
                            i17++;
                            paddingTop = i14;
                            paddingLeft = i13;
                        } else {
                            max2 = Math.max((i16 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i23 = max2;
                        i14 = paddingTop;
                        paddingTop = i23;
                        int i222 = paddingLeft + scrollX;
                        childAt.layout(i222, paddingTop, childAt.getMeasuredWidth() + i222, childAt.getMeasuredHeight() + paddingTop);
                        i17++;
                        paddingTop = i14;
                        paddingLeft = i13;
                    } else {
                        max = Math.max((i15 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = max;
                    i13 = paddingLeft;
                    paddingLeft = i24;
                    if (i21 == 16) {
                    }
                    int i232 = max2;
                    i14 = paddingTop;
                    paddingTop = i232;
                    int i2222 = paddingLeft + scrollX;
                    childAt.layout(i2222, paddingTop, childAt.getMeasuredWidth() + i2222, childAt.getMeasuredHeight() + paddingTop);
                    i17++;
                    paddingTop = i14;
                    paddingLeft = i13;
                }
            }
        }
        int i25 = (i15 - paddingLeft) - paddingRight;
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt2 = getChildAt(i26);
            if (childAt2.getVisibility() != 8) {
                e eVar2 = (e) childAt2.getLayoutParams();
                if (!eVar2.a && (k10 = k(childAt2)) != null) {
                    float f10 = i25;
                    int i27 = ((int) (k10.e * f10)) + paddingLeft;
                    if (eVar2.d) {
                        eVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * eVar2.c), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((i16 - paddingTop) - paddingBottom, TLObject.FLAG_30));
                    }
                    childAt2.layout(i27, paddingTop, childAt2.getMeasuredWidth() + i27, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.D = paddingTop;
        this.E = i16 - paddingBottom;
        this.j0 = i17;
        if (this.h0) {
            z10 = false;
            w(this.f, 0, false, false);
        } else {
            z10 = false;
        }
        this.h0 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        if (r10 != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r3 != (-1)) goto L42;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i7, int i10) {
        e eVar;
        e eVar2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i7), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.P = Math.min(measuredWidth / 10, this.O);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z9 = true;
            int i13 = TLObject.FLAG_30;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (eVar2 = (e) childAt.getLayoutParams()) != null && eVar2.a) {
                int i14 = eVar2.b;
                int i15 = i14 & 7;
                int i16 = i14 & qs.x1;
                boolean z10 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z9 = false;
                }
                int i17 = TLObject.FLAG_31;
                if (z10) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z9 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) eVar2).width;
                if (i18 != -2) {
                    i17 = 1073741824;
                }
                i18 = paddingLeft;
                int i19 = ((ViewGroup.LayoutParams) eVar2).height;
                if (i19 == -2) {
                    i13 = i11;
                }
                i19 = measuredHeight;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z10) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z9) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        this.H = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        this.I = true;
        s();
        this.I = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * eVar.c), TLObject.FLAG_30), this.H);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i7, Rect rect) {
        int i10;
        int i11;
        int i12;
        d k10;
        int childCount = getChildCount();
        if ((i7 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f && childAt.requestFocus(i7, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.a);
        if (this.e != null) {
            y(jVar.c, 0, false, true);
        } else {
            this.h = jVar.c;
            this.n = jVar.d;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.c = this.f;
        if (this.e != null) {
            jVar.d = null;
        }
        return jVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (i7 != i11) {
            int i13 = this.x;
            u(i7, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.e0) {
            boolean z9 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.W == null) {
                this.W = VelocityTracker.obtain();
            }
            this.W.addMovement(motionEvent);
            int action = motionEvent.getAction() & qs.e4;
            if (action == 0) {
                this.r.abortAnimation();
                this.K = false;
                s();
                float x10 = motionEvent.getX();
                this.T = x10;
                this.R = x10;
                float y10 = motionEvent.getY();
                this.U = y10;
                this.S = y10;
                this.V = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.M) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.V);
                        if (findPointerIndex == -1) {
                            z9 = v();
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x11 - this.R);
                            float y11 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y11 - this.S);
                            int i7 = this.Q;
                            if (abs > i7 && abs > abs2) {
                                this.M = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f10 = this.T;
                                this.R = x11 - f10 > 0.0f ? f10 + i7 : f10 - i7;
                                this.S = y11;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.M) {
                        z9 = r(motionEvent.getX(motionEvent.findPointerIndex(this.V)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.R = motionEvent.getX(actionIndex);
                        this.V = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        o(motionEvent);
                        this.R = motionEvent.getX(motionEvent.findPointerIndex(this.V));
                    }
                } else if (this.M) {
                    w(this.f, 0, true, false);
                    z9 = v();
                }
            } else if (this.M) {
                VelocityTracker velocityTracker = this.W;
                velocityTracker.computeCurrentVelocity(1000, this.b0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.V);
                this.K = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                d l10 = l();
                float f11 = clientWidth;
                y(g(l10.b, xVelocity, ((scrollX / f11) - l10.e) / (l10.d + (this.x / f11)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.V)) - this.T)), xVelocity, true, true);
                z9 = v();
            }
            if (z9) {
                WeakHashMap weakHashMap = i0.a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        a aVar = this.e;
        if (aVar == null || this.f >= aVar.b() - 1) {
            return false;
        }
        x(this.f + 1, true);
        return true;
    }

    public final boolean q(int i7) {
        if (this.b.size() == 0) {
            if (!this.h0) {
                this.i0 = false;
                n(0.0f, 0, 0);
                if (!this.i0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        d l10 = l();
        int clientWidth = getClientWidth();
        int i10 = this.x;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = l10.b;
        float f11 = ((i7 / f10) - l10.e) / (l10.d + (i10 / f10));
        this.i0 = false;
        n(f11, i12, (int) (i11 * f11));
        if (this.i0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z9;
        boolean z10;
        float f11 = this.R - f10;
        this.R = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.F * clientWidth;
        float f13 = this.G * clientWidth;
        ArrayList arrayList = this.b;
        boolean z11 = false;
        d dVar = (d) arrayList.get(0);
        d dVar2 = (d) jg.g.i(1, arrayList);
        if (dVar.b != 0) {
            f12 = dVar.e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (dVar2.b != this.e.b() - 1) {
            f13 = dVar2.e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z9) {
                this.f0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.g0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i7 = (int) scrollX;
        this.R = (scrollX - i7) + this.R;
        scrollTo(i7, getScrollY());
        q(i7);
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s() {
        t(this.f);
    }

    public void setAdapter(a aVar) {
        ArrayList arrayList = this.b;
        a aVar2 = this.e;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.b = null;
            }
            this.e.getClass();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                d dVar = (d) arrayList.get(i7);
                a aVar3 = this.e;
                int i10 = dVar.b;
                aVar3.a(this, dVar.a);
            }
            this.e.getClass();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((e) getChildAt(i11).getLayoutParams()).a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f = 0;
            scrollTo(0, 0);
        }
        this.e = aVar;
        this.a = 0;
        if (aVar != null) {
            if (this.w == null) {
                this.w = new h(this, 0);
            }
            this.e.i(this.w);
            this.K = false;
            boolean z9 = this.h0;
            this.h0 = true;
            this.a = this.e.b();
            if (this.h >= 0) {
                this.e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.n = null;
                return;
            }
            if (z9) {
                requestLayout();
            } else {
                s();
            }
        }
    }

    public void setCurrentItem(int i7) {
        this.K = false;
        y(i7, 0, !this.h0, false);
    }

    public void setOffscreenPageLimit(int i7) {
        if (i7 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i7 + " too small; defaulting to 1");
            i7 = 1;
        }
        if (i7 != this.L) {
            this.L = i7;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(g gVar) {
        this.l0 = gVar;
    }

    public void setPageMargin(int i7) {
        int i10 = this.x;
        this.x = i7;
        int width = getWidth();
        u(width, width, i7, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.y = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i7) {
        if (this.r0 == i7) {
            return;
        }
        this.r0 = i7;
        if (this.m0 != null) {
            boolean z9 = i7 != 0;
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).setLayerType(z9 ? this.n0 : 0, null);
            }
        }
        g gVar = this.l0;
        if (gVar != null) {
            gVar.c(i7);
        }
        ArrayList arrayList = this.k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar2 = (g) this.k0.get(i11);
                if (gVar2 != null) {
                    gVar2.c(i7);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r10 == r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r9 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i7) {
        d dVar;
        String hexString;
        ArrayList arrayList;
        d dVar2;
        float f10;
        d dVar3;
        d k10;
        int i10;
        int i11;
        d dVar4;
        d dVar5;
        d dVar6;
        int i12 = this.f;
        if (i12 != i7) {
            dVar = m(i12);
            this.f = i7;
        } else {
            dVar = null;
        }
        if (this.e == null) {
            z();
            return;
        }
        if (this.K) {
            z();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.getClass();
        int i13 = this.L;
        int max = Math.max(0, this.f - i13);
        int b10 = this.e.b();
        int min = Math.min(b10 - 1, this.f + i13);
        if (b10 != this.a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb2 = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            jg.g.x(sb2, this.a, ", found: ", b10, " Pager id: ");
            sb2.append(hexString);
            sb2.append(" Pager class: ");
            sb2.append(getClass());
            sb2.append(" Problematic adapter: ");
            sb2.append(this.e.getClass());
            throw new IllegalStateException(sb2.toString());
        }
        int i14 = 0;
        while (true) {
            arrayList = this.b;
            if (i14 >= arrayList.size()) {
                break;
            }
            dVar2 = (d) arrayList.get(i14);
            int i15 = dVar2.b;
            int i16 = this.f;
            if (i15 < i16) {
                i14++;
            }
        }
        if (dVar2 == null && b10 > 0) {
            dVar2 = a(this.f, i14);
        }
        if (dVar2 != null) {
            int i17 = i14 - 1;
            d dVar7 = i17 >= 0 ? (d) arrayList.get(i17) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - dVar2.d);
            float f11 = 0.0f;
            for (int i18 = this.f - 1; i18 >= 0; i18--) {
                if (f11 >= paddingLeft && i18 < max) {
                    if (dVar7 == null) {
                        break;
                    }
                    if (i18 == dVar7.b && !dVar7.c) {
                        arrayList.remove(i17);
                        this.e.a(this, dVar7.a);
                        i17--;
                        i14--;
                        if (i17 >= 0) {
                            dVar6 = (d) arrayList.get(i17);
                            dVar7 = dVar6;
                        }
                        dVar6 = null;
                        dVar7 = dVar6;
                    }
                } else if (dVar7 == null || i18 != dVar7.b) {
                    f11 += a(i18, i17 + 1).d;
                    i14++;
                    if (i17 >= 0) {
                        dVar6 = (d) arrayList.get(i17);
                        dVar7 = dVar6;
                    }
                    dVar6 = null;
                    dVar7 = dVar6;
                } else {
                    f11 += dVar7.d;
                    i17--;
                    if (i17 >= 0) {
                        dVar6 = (d) arrayList.get(i17);
                        dVar7 = dVar6;
                    }
                    dVar6 = null;
                    dVar7 = dVar6;
                }
            }
            f10 = 0.0f;
            float f12 = dVar2.d;
            int i19 = i14 + 1;
            if (f12 < 2.0f) {
                d dVar8 = i19 < arrayList.size() ? (d) arrayList.get(i19) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i20 = i19;
                for (int i21 = this.f + 1; i21 < b10; i21++) {
                    if (f12 >= paddingRight && i21 > min) {
                        if (dVar8 == null) {
                            break;
                        }
                        if (i21 == dVar8.b && !dVar8.c) {
                            arrayList.remove(i20);
                            this.e.a(this, dVar8.a);
                            if (i20 < arrayList.size()) {
                                dVar8 = (d) arrayList.get(i20);
                            }
                            dVar8 = null;
                        }
                    } else if (dVar8 == null || i21 != dVar8.b) {
                        d a10 = a(i21, i20);
                        i20++;
                        f12 += a10.d;
                        if (i20 < arrayList.size()) {
                            dVar8 = (d) arrayList.get(i20);
                        }
                        dVar8 = null;
                    } else {
                        f12 += dVar8.d;
                        i20++;
                        if (i20 < arrayList.size()) {
                            dVar8 = (d) arrayList.get(i20);
                        }
                        dVar8 = null;
                    }
                }
            }
            int b11 = this.e.b();
            int clientWidth2 = getClientWidth();
            float f13 = clientWidth2 > 0 ? this.x / clientWidth2 : 0.0f;
            if (dVar != null) {
                int i22 = dVar.b;
                int i23 = dVar2.b;
                if (i22 < i23) {
                    float f14 = dVar.e + dVar.d + f13;
                    int i24 = i22 + 1;
                    int i25 = 0;
                    while (i24 <= dVar2.b && i25 < arrayList.size()) {
                        Object obj = arrayList.get(i25);
                        while (true) {
                            dVar5 = (d) obj;
                            if (i24 <= dVar5.b || i25 >= arrayList.size() - 1) {
                                break;
                            }
                            i25++;
                            obj = arrayList.get(i25);
                        }
                        while (i24 < dVar5.b) {
                            this.e.getClass();
                            f14 += 1.0f + f13;
                            i24++;
                        }
                        dVar5.e = f14;
                        f14 += dVar5.d + f13;
                        i24++;
                    }
                } else if (i22 > i23) {
                    int size = arrayList.size() - 1;
                    float f15 = dVar.e;
                    while (true) {
                        i22--;
                        if (i22 < dVar2.b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            dVar4 = (d) obj2;
                            if (i22 >= dVar4.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i22 > dVar4.b) {
                            this.e.getClass();
                            f15 -= 1.0f + f13;
                            i22--;
                        }
                        f15 -= dVar4.d + f13;
                        dVar4.e = f15;
                    }
                }
            }
            int size2 = arrayList.size();
            float f16 = dVar2.e;
            int i26 = dVar2.b;
            int i27 = i26 - 1;
            this.F = i26 == 0 ? f16 : -3.4028235E38f;
            int i28 = b11 - 1;
            this.G = i26 == i28 ? (dVar2.d + f16) - 1.0f : Float.MAX_VALUE;
            int i29 = i14 - 1;
            while (i29 >= 0) {
                d dVar9 = (d) arrayList.get(i29);
                while (true) {
                    i11 = dVar9.b;
                    if (i27 <= i11) {
                        break;
                    }
                    i27--;
                    this.e.getClass();
                    f16 -= 1.0f + f13;
                }
                f16 -= dVar9.d + f13;
                dVar9.e = f16;
                if (i11 == 0) {
                    this.F = f16;
                }
                i29--;
                i27--;
            }
            float f17 = dVar2.e + dVar2.d + f13;
            int i30 = dVar2.b;
            while (true) {
                i30++;
                if (i19 >= size2) {
                    break;
                }
                d dVar10 = (d) arrayList.get(i19);
                while (true) {
                    i10 = dVar10.b;
                    if (i30 >= i10) {
                        break;
                    }
                    i30++;
                    this.e.getClass();
                    f17 += 1.0f + f13;
                }
                if (i10 == i28) {
                    this.G = (dVar10.d + f17) - 1.0f;
                }
                dVar10.e = f17;
                f17 += dVar10.d + f13;
                i19++;
            }
            this.e.h(this.f);
        } else {
            f10 = 0.0f;
        }
        this.e.getClass();
        int childCount = getChildCount();
        for (int i31 = 0; i31 < childCount; i31++) {
            View childAt = getChildAt(i31);
            e eVar = (e) childAt.getLayoutParams();
            eVar.f = i31;
            if (!eVar.a && eVar.c == f10 && (k10 = k(childAt)) != null) {
                eVar.c = k10.d;
                eVar.e = k10.b;
            }
        }
        z();
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        dVar3 = k(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            dVar3 = null;
            if (dVar3 == null || dVar3.b != this.f) {
                for (int i32 = 0; i32 < getChildCount(); i32++) {
                    View childAt2 = getChildAt(i32);
                    d k11 = k(childAt2);
                    if (k11 != null && k11.b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void u(int i7, int i10, int i11, int i12) {
        if (i10 > 0 && !this.b.isEmpty()) {
            if (!this.r.isFinished()) {
                this.r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i7 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        d m10 = m(this.f);
        int min = (int) ((m10 != null ? Math.min(m10.e, this.G) : 0.0f) * ((i7 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    public final boolean v() {
        this.V = -1;
        this.M = false;
        this.N = false;
        VelocityTracker velocityTracker = this.W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.W = null;
        }
        this.f0.onRelease();
        this.g0.onRelease();
        return this.f0.isFinished() || this.g0.isFinished();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }

    public final void w(int i7, int i10, boolean z9, boolean z10) {
        int scrollX;
        int abs;
        d m10 = m(i7);
        int max = m10 != null ? (int) (Math.max(this.F, Math.min(m10.e, this.G)) * getClientWidth()) : 0;
        if (!z9) {
            if (z10) {
                h(i7);
            }
            e(false);
            scrollTo(max, 0);
            q(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.r;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.s ? this.r.getCurrX() : this.r.getStartX();
                this.r.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i11 = scrollX;
            int scrollY = getScrollY();
            int i12 = max - i11;
            int i13 = 0 - scrollY;
            if (i12 == 0 && i13 == 0) {
                e(false);
                s();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i14 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i14;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i12) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int abs2 = Math.abs(i10);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.e.getClass();
                    abs = (int) (((Math.abs(i12) / ((f10 * 1.0f) + this.x)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.s = false;
                this.r.startScroll(i11, scrollY, i12, i13, min);
                WeakHashMap weakHashMap = i0.a;
                postInvalidateOnAnimation();
            }
        }
        if (z10) {
            h(i7);
        }
    }

    public void x(int i7, boolean z9) {
        this.K = false;
        y(i7, 0, z9, false);
    }

    public final void y(int i7, int i10, boolean z9, boolean z10) {
        a aVar = this.e;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z10 && this.f == i7 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 >= this.e.b()) {
            i7 = this.e.b() - 1;
        }
        int i11 = this.L;
        int i12 = this.f;
        if (i7 > i12 + i11 || i7 < i12 - i11) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((d) arrayList.get(i13)).c = true;
            }
        }
        boolean z11 = this.f != i7;
        if (!this.h0) {
            t(i7);
            w(i7, i10, z9, z11);
        } else {
            this.f = i7;
            if (z11) {
                h(i7);
            }
            requestLayout();
        }
    }

    public final void z() {
        if (this.o0 != 0) {
            ArrayList arrayList = this.p0;
            if (arrayList == null) {
                this.p0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                this.p0.add(getChildAt(i7));
            }
            Collections.sort(this.p0, v0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0);
        eVar.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return eVar;
    }

    public void setPageMarginDrawable(int i7) {
        setPageMarginDrawable(getContext().getDrawable(i7));
    }
}
