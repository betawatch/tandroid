package m2;

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
import f2.c0;
import f2.r1;
import gh.i3;
import ih.c9;
import ih.i4;
import ih.t7;
import j3.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import r0.b0;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class g extends ViewGroup {
    public static final int[] o0 = {R.attr.layout_gravity};
    public static final d2.a p0 = new d2.a(3);
    public static final c0 q0;
    public static final d2.a r0;
    public int A;
    public float B;
    public float C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public final int K;
    public int L;
    public final int M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public int R;
    public VelocityTracker S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public int a;
    public boolean a0;
    public final ArrayList b;
    public EdgeEffect b0;
    public final c c;
    public EdgeEffect c0;
    public final Rect d;
    public boolean d0;
    public a e;
    public boolean e0;
    public int f;
    public int f0;
    public ArrayList g0;
    public int h;
    public e h0;
    public i3 i0;
    public int j0;
    public int k0;
    public ArrayList l0;
    public final m.i3 m0;
    public Parcelable n;
    public int n0;
    public Scroller r;
    public boolean s;
    public h1.a v;
    public int w;
    public Drawable x;
    public int y;

    static {
        int i9 = 4;
        q0 = new c0(i9);
        r0 = new d2.a(i9);
    }

    public g(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new c();
        this.d = new Rect();
        this.h = -1;
        this.n = null;
        this.B = -3.4028235E38f;
        this.C = Float.MAX_VALUE;
        this.H = 1;
        this.R = -1;
        this.d0 = true;
        this.m0 = new m.i3(this, 1);
        this.n0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.r = new Scroller(context2, q0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.M = viewConfiguration.getScaledPagingTouchSlop();
        this.T = (int) (400.0f * f10);
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.b0 = new EdgeEffect(context2);
        this.c0 = new EdgeEffect(context2);
        this.V = (int) (25.0f * f10);
        this.W = (int) (2.0f * f10);
        this.K = (int) (f10 * 16.0f);
        j0.k(this, new r1(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        b0.j(this, new g5.b(this));
    }

    public static boolean d(int i9, int i10, int i11, View view, boolean z10) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && d(i9, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i9);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
        }
    }

    public final c a(int i9, int i10) {
        c cVar = new c();
        cVar.b = i9;
        cVar.a = this.e.e(this, i9);
        this.e.getClass();
        cVar.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i10 < 0 || i10 >= arrayList.size()) {
            arrayList.add(cVar);
            return cVar;
        }
        arrayList.add(i10, cVar);
        return cVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i9, int i10) {
        c k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                    childAt.addFocusables(arrayList, i9, i10);
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
        c k10;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        d dVar = (d) layoutParams;
        boolean z10 = dVar.a | (view.getClass().getAnnotation(b.class) != null);
        dVar.a = z10;
        if (!this.E) {
            super.addView(view, i9, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            dVar.d = true;
            addViewInLayout(view, i9, layoutParams);
        }
    }

    public final void b(e eVar) {
        if (this.g0 == null) {
            this.g0 = new ArrayList();
        }
        this.g0.add(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i9) {
        View findNextFocus;
        boolean z10;
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
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i9);
            boolean z11 = true;
            z10 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.d;
                if (i9 == 17) {
                    int i11 = j(findNextFocus, rect).left;
                    int i12 = j(findFocus, rect).left;
                    if (findFocus == null || i11 < i12) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i13 = this.f;
                        if (i13 > 0) {
                            x(i13 - 1, true);
                            z10 = z11;
                        }
                        z11 = false;
                        z10 = z11;
                    }
                } else if (i9 == 66) {
                    requestFocus = (findFocus == null || j(findNextFocus, rect).left > j(findFocus, rect).left) ? findNextFocus.requestFocus() : p();
                }
                z10 = requestFocus;
            } else if (i9 != 17 || i9 == 1) {
                i10 = this.f;
                if (i10 > 0) {
                    x(i10 - 1, true);
                    z10 = z11;
                }
                z11 = false;
                z10 = z11;
            } else if (i9 == 66 || i9 == 2) {
                z10 = p();
            }
            if (z10) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i9));
            }
            return z10;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i9);
        boolean z112 = true;
        z10 = false;
        if (findNextFocus == null) {
        }
        if (i9 != 17) {
        }
        i10 = this.f;
        if (i10 > 0) {
        }
        z112 = false;
        z10 = z112;
        if (z10) {
        }
        return z10;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i9 < 0 ? scrollX > ((int) (((float) clientWidth) * this.B)) : i9 > 0 && scrollX < ((int) (((float) clientWidth) * this.C));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
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
        WeakHashMap weakHashMap = j0.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z10 = keyEvent.hasModifiers(2) ? p() : c(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z10 = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z10 = c(1);
                        }
                    }
                    if (!z10) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i9 = this.f;
                        if (i9 > 0) {
                            x(i9 - 1, true);
                            z10 = true;
                        }
                    } else {
                        z10 = c(17);
                    }
                    if (!z10) {
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        c k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
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
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.e) != null && aVar.b() > 1)) {
            if (!this.b0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.B * width);
                this.b0.setSize(height, width);
                z10 = this.b0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.c0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.C + 1.0f)) * width2);
                this.c0.setSize(height2, width2);
                z10 |= this.c0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.b0.finish();
            this.c0.finish();
        }
        if (z10) {
            WeakHashMap weakHashMap = j0.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.x;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z10) {
        boolean z11 = this.n0 == 2;
        if (z11) {
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
        this.G = false;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 >= arrayList.size()) {
                break;
            }
            c cVar = (c) arrayList.get(i9);
            if (cVar.c) {
                cVar.c = false;
                z11 = true;
            }
            i9++;
        }
        if (z11) {
            m.i3 i3Var = this.m0;
            if (!z10) {
                i3Var.run();
            } else {
                WeakHashMap weakHashMap = j0.a;
                postOnAnimation(i3Var);
            }
        }
    }

    public final void f() {
        int b10 = this.e.b();
        this.a = b10;
        ArrayList arrayList = this.b;
        boolean z10 = arrayList.size() < (this.H * 2) + 1 && arrayList.size() < b10;
        int i9 = this.f;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < arrayList.size()) {
            c cVar = (c) arrayList.get(i10);
            int c10 = this.e.c(cVar.a);
            if (c10 != -1) {
                if (c10 == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z11) {
                        this.e.getClass();
                        z11 = true;
                    }
                    this.e.a(this, cVar.a);
                    int i11 = this.f;
                    if (i11 == cVar.b) {
                        i9 = Math.max(0, Math.min(i11, b10 - 1));
                    }
                } else {
                    int i12 = cVar.b;
                    if (i12 != c10) {
                        if (i12 == this.f) {
                            i9 = c10;
                        }
                        cVar.b = c10;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.e.getClass();
        }
        Collections.sort(arrayList, p0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                d dVar = (d) getChildAt(i13).getLayoutParams();
                if (!dVar.a) {
                    dVar.c = 0.0f;
                }
            }
            y(i9, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i9, int i10, float f10, int i11) {
        if (Math.abs(i11) <= this.V || Math.abs(i10) <= this.T) {
            i9 += (int) (f10 + (i9 >= this.f ? 0.4f : 0.6f));
        } else if (i10 <= 0) {
            i9++;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            return Math.max(((c) arrayList.get(0)).b, Math.min(i9, ((c) r0.j(1, arrayList)).b));
        }
        return i9;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        d dVar = new d(-1, -1);
        dVar.c = 0.0f;
        return dVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i9, int i10) {
        if (this.k0 == 2) {
            i10 = (i9 - 1) - i10;
        }
        return ((d) ((View) this.l0.get(i10)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.H;
    }

    public int getPageMargin() {
        return this.w;
    }

    public final void h(int i9) {
        e eVar = this.h0;
        if (eVar != null) {
            eVar.b(i9);
        }
        ArrayList arrayList = this.g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar2 = (e) this.g0.get(i10);
                if (eVar2 != null) {
                    eVar2.b(i9);
                }
            }
        }
    }

    public final void i() {
        if (!this.a0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.e != null) {
            VelocityTracker velocityTracker = this.S;
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.U);
            int xVelocity = (int) velocityTracker.getXVelocity(this.R);
            this.G = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            c l10 = l();
            y(g(l10.b, xVelocity, ((scrollX / clientWidth) - l10.e) / l10.d, (int) (this.N - this.P)), xVelocity, true, true);
        }
        this.I = false;
        this.J = false;
        VelocityTracker velocityTracker2 = this.S;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.S = null;
        }
        this.a0 = false;
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

    public final c k(View view) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i9 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i9);
            if (this.e.f(view, cVar.a)) {
                return cVar;
            }
            i9++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c l() {
        c cVar;
        int i9;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.w / clientWidth : 0.0f;
        c cVar2 = null;
        float f12 = 0.0f;
        int i10 = -1;
        int i11 = 0;
        boolean z10 = true;
        while (true) {
            ArrayList arrayList = this.b;
            if (i11 >= arrayList.size()) {
                break;
            }
            c cVar3 = (c) arrayList.get(i11);
            if (z10 || cVar3.b == (i9 = i10 + 1)) {
                cVar = cVar3;
            } else {
                float f13 = f10 + f12 + f11;
                c cVar4 = this.c;
                cVar4.e = f13;
                cVar4.b = i9;
                this.e.getClass();
                cVar4.d = 1.0f;
                i11--;
                cVar = cVar4;
            }
            f10 = cVar.e;
            float f14 = cVar.d + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f14 || i11 == arrayList.size() - 1) {
                break;
            }
            int i12 = cVar.b;
            float f15 = cVar.d;
            i11++;
            c cVar5 = cVar;
            i10 = i12;
            f12 = f15;
            cVar2 = cVar5;
            z10 = false;
        }
        return cVar;
    }

    public final c m(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar.b == i9) {
                return cVar;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(float f10, int i9, int i10) {
        int max;
        int i11;
        int left;
        if (this.f0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a) {
                    int i13 = dVar.b & 7;
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
        e eVar = this.h0;
        if (eVar != null) {
            eVar.c(f10, i9, i10);
        }
        ArrayList arrayList = this.g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                e eVar2 = (e) this.g0.get(i15);
                if (eVar2 != null) {
                    eVar2.c(f10, i9, i10);
                }
            }
        }
        if (this.i0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!((d) childAt2.getLayoutParams()).a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    c9 c9Var = (c9) this.i0.b;
                    t7 t7Var = (t7) childAt2;
                    if (Math.abs(left2) >= 1.0f) {
                        t7Var.a(false);
                        AndroidUtilities.runOnUIThread(new ih.g(t7Var, 15), 16L);
                    } else {
                        if (!t7Var.d) {
                            t7Var.a(true);
                            if (c9Var.t0 != null) {
                                i4 i4Var = t7Var.a;
                                long j10 = t7Var.b;
                                ArrayList arrayList2 = t7Var.c;
                                i4Var.x1 = j10;
                                i4Var.v1 = arrayList2;
                                i4Var.o0(-1);
                            } else {
                                t7Var.a.U0(-1, t7Var.b);
                            }
                        }
                        t7Var.a.setOffset(left2);
                        childAt2.setCameraDistance(childAt2.getWidth() * 15);
                        childAt2.setPivotX(left2 < 0.0f ? childAt2.getWidth() : 0.0f);
                        childAt2.setPivotY(childAt2.getHeight() * 0.5f);
                        childAt2.setRotationY(left2 * 90.0f);
                    }
                }
            }
        }
        this.e0 = true;
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.R) {
            int i9 = actionIndex == 0 ? 1 : 0;
            this.N = motionEvent.getX(i9);
            this.R = motionEvent.getPointerId(i9);
            VelocityTracker velocityTracker = this.S;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.m0);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        float f10;
        ArrayList arrayList;
        int i10;
        super.onDraw(canvas);
        if (this.w <= 0 || this.x == null) {
            return;
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2.size() <= 0 || this.e == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f11 = this.w / width;
        int i11 = 0;
        c cVar = (c) arrayList2.get(0);
        float f12 = cVar.e;
        int size = arrayList2.size();
        int i12 = cVar.b;
        int i13 = ((c) arrayList2.get(size - 1)).b;
        while (i12 < i13) {
            while (true) {
                i9 = cVar.b;
                if (i12 <= i9 || i11 >= size) {
                    break;
                }
                i11++;
                cVar = (c) arrayList2.get(i11);
            }
            if (i12 == i9) {
                float f13 = cVar.e;
                float f14 = cVar.d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                this.e.getClass();
                f10 = (f12 + 1.0f) * width;
                f12 = 1.0f + f11 + f12;
            }
            if (this.w + f10 > scrollX) {
                arrayList = arrayList2;
                i10 = scrollX;
                this.x.setBounds(Math.round(f10), this.y, Math.round(this.w + f10), this.A);
                this.x.draw(canvas);
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
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            v();
            return false;
        }
        if (action != 0) {
            if (this.I) {
                return true;
            }
            if (this.J) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.P = x10;
            this.N = x10;
            float y10 = motionEvent.getY();
            this.Q = y10;
            this.O = y10;
            this.R = motionEvent.getPointerId(0);
            this.J = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.n0 != 2 || Math.abs(this.r.getFinalX() - this.r.getCurrX()) <= this.W) {
                e(false);
                this.I = false;
            } else {
                this.r.abortAnimation();
                this.G = false;
                s();
                this.I = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i9 = this.R;
            if (i9 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i9);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.N;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.Q);
                if (f10 != 0.0f) {
                    float f11 = this.N;
                    if ((f11 >= this.L || f10 <= 0.0f) && ((f11 <= getWidth() - this.L || f10 >= 0.0f) && d((int) f10, (int) x11, (int) y11, this, false))) {
                        this.N = x11;
                        this.O = y11;
                        this.J = true;
                        return false;
                    }
                }
                int i10 = this.M;
                float f12 = i10;
                if (abs > f12 && abs * 0.5f > abs2) {
                    this.I = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.P;
                    float f14 = i10;
                    this.N = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.O = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f12) {
                    this.J = true;
                }
                if (this.I && r(x11)) {
                    WeakHashMap weakHashMap = j0.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            o(motionEvent);
        }
        if (this.S == null) {
            this.S = VelocityTracker.obtain();
        }
        this.S.addMovement(motionEvent);
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        c k10;
        int max;
        int i13;
        int max2;
        int i14;
        int childCount = getChildCount();
        int i15 = i11 - i9;
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
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a) {
                    int i19 = dVar.b;
                    int i20 = i19 & 7;
                    int i21 = i19 & 112;
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
                d dVar2 = (d) childAt2.getLayoutParams();
                if (!dVar2.a && (k10 = k(childAt2)) != null) {
                    float f10 = i25;
                    int i27 = ((int) (k10.e * f10)) + paddingLeft;
                    if (dVar2.d) {
                        dVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * dVar2.c), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((i16 - paddingTop) - paddingBottom, TLObject.FLAG_30));
                    }
                    childAt2.layout(i27, paddingTop, childAt2.getMeasuredWidth() + i27, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.y = paddingTop;
        this.A = i16 - paddingBottom;
        this.f0 = i17;
        if (this.d0) {
            z11 = false;
            w(this.f, 0, false, false);
        } else {
            z11 = false;
        }
        this.d0 = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r10 != (-1)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r3 != (-1)) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i9, int i10) {
        d dVar;
        d dVar2;
        int i11;
        int i12;
        int i13;
        setMeasuredDimension(View.getDefaultSize(0, i9), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.L = Math.min(measuredWidth / 10, this.K);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            int i15 = TLObject.FLAG_30;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (dVar2 = (d) childAt.getLayoutParams()) != null && dVar2.a) {
                int i16 = dVar2.b;
                int i17 = i16 & 7;
                int i18 = i16 & 112;
                boolean z11 = i18 == 48 || i18 == 80;
                if (i17 != 3 && i17 != 5) {
                    z10 = false;
                }
                int i19 = TLObject.FLAG_31;
                if (z11) {
                    i19 = TLObject.FLAG_30;
                } else if (z10) {
                    i11 = TLObject.FLAG_30;
                    i12 = ((ViewGroup.LayoutParams) dVar2).width;
                    if (i12 != -2) {
                        i19 = TLObject.FLAG_30;
                    }
                    i12 = paddingLeft;
                    i13 = ((ViewGroup.LayoutParams) dVar2).height;
                    if (i13 != -2) {
                        i15 = i11;
                    }
                    i13 = measuredHeight;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i19), View.MeasureSpec.makeMeasureSpec(i13, i15));
                    if (!z11) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z10) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i11 = TLObject.FLAG_31;
                i12 = ((ViewGroup.LayoutParams) dVar2).width;
                if (i12 != -2) {
                }
                i12 = paddingLeft;
                i13 = ((ViewGroup.LayoutParams) dVar2).height;
                if (i13 != -2) {
                }
                i13 = measuredHeight;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, i19), View.MeasureSpec.makeMeasureSpec(i13, i15));
                if (!z11) {
                }
            }
            i14++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        this.D = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        this.E = true;
        s();
        this.E = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((dVar = (d) childAt2.getLayoutParams()) == null || !dVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * dVar.c), TLObject.FLAG_30), this.D);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i9, Rect rect) {
        int i10;
        int i11;
        int i12;
        c k10;
        int childCount = getChildCount();
        if ((i9 & 2) != 0) {
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
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f && childAt.requestFocus(i9, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a);
        if (this.e != null) {
            y(fVar.c, 0, false, true);
        } else {
            this.h = fVar.c;
            this.n = fVar.d;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.c = this.f;
        if (this.e != null) {
            fVar.d = null;
        }
        return fVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11) {
            int i13 = this.w;
            u(i9, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.a0) {
            boolean z10 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            this.S.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.r.abortAnimation();
                this.G = false;
                s();
                float x10 = motionEvent.getX();
                this.P = x10;
                this.N = x10;
                float y10 = motionEvent.getY();
                this.Q = y10;
                this.O = y10;
                this.R = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.I) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.R);
                        if (findPointerIndex == -1) {
                            z10 = v();
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x11 - this.N);
                            float y11 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y11 - this.O);
                            int i9 = this.M;
                            if (abs > i9 && abs > abs2) {
                                this.I = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f10 = this.P;
                                this.N = x11 - f10 > 0.0f ? f10 + i9 : f10 - i9;
                                this.O = y11;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.I) {
                        z10 = r(motionEvent.getX(motionEvent.findPointerIndex(this.R)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.N = motionEvent.getX(actionIndex);
                        this.R = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        o(motionEvent);
                        this.N = motionEvent.getX(motionEvent.findPointerIndex(this.R));
                    }
                } else if (this.I) {
                    w(this.f, 0, true, false);
                    z10 = v();
                }
            } else if (this.I) {
                VelocityTracker velocityTracker = this.S;
                velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.U);
                int xVelocity = (int) velocityTracker.getXVelocity(this.R);
                this.G = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                c l10 = l();
                float f11 = clientWidth;
                y(g(l10.b, xVelocity, ((scrollX / f11) - l10.e) / (l10.d + (this.w / f11)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.R)) - this.P)), xVelocity, true, true);
                z10 = v();
            }
            if (z10) {
                WeakHashMap weakHashMap = j0.a;
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

    public final boolean q(int i9) {
        if (this.b.size() == 0) {
            if (!this.d0) {
                this.e0 = false;
                n(0.0f, 0, 0);
                if (!this.e0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        c l10 = l();
        int clientWidth = getClientWidth();
        int i10 = this.w;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = l10.b;
        float f11 = ((i9 / f10) - l10.e) / (l10.d + (i10 / f10));
        this.e0 = false;
        n(f11, i12, (int) (i11 * f11));
        if (this.e0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.N - f10;
        this.N = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.B * clientWidth;
        float f13 = this.C * clientWidth;
        ArrayList arrayList = this.b;
        boolean z12 = false;
        c cVar = (c) arrayList.get(0);
        c cVar2 = (c) r0.j(1, arrayList);
        if (cVar.b != 0) {
            f12 = cVar.e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (cVar2.b != this.e.b() - 1) {
            f13 = cVar2.e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.b0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.c0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i9 = (int) scrollX;
        this.N = (scrollX - i9) + this.N;
        scrollTo(i9, getScrollY());
        q(i9);
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.E) {
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
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                c cVar = (c) arrayList.get(i9);
                a aVar3 = this.e;
                int i10 = cVar.b;
                aVar3.a(this, cVar.a);
            }
            this.e.getClass();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((d) getChildAt(i11).getLayoutParams()).a) {
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
            if (this.v == null) {
                this.v = new h1.a(this, 2);
            }
            this.e.i(this.v);
            this.G = false;
            boolean z10 = this.d0;
            this.d0 = true;
            this.a = this.e.b();
            if (this.h >= 0) {
                this.e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.n = null;
                return;
            }
            if (z10) {
                requestLayout();
            } else {
                s();
            }
        }
    }

    public void setCurrentItem(int i9) {
        this.G = false;
        y(i9, 0, !this.d0, false);
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i9 + " too small; defaulting to 1");
            i9 = 1;
        }
        if (i9 != this.H) {
            this.H = i9;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(e eVar) {
        this.h0 = eVar;
    }

    public void setPageMargin(int i9) {
        int i10 = this.w;
        this.w = i9;
        int width = getWidth();
        u(width, width, i9, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.x = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i9) {
        if (this.n0 == i9) {
            return;
        }
        this.n0 = i9;
        if (this.i0 != null) {
            boolean z10 = i9 != 0;
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).setLayerType(z10 ? this.j0 : 0, null);
            }
        }
        e eVar = this.h0;
        if (eVar != null) {
            eVar.d(i9);
        }
        ArrayList arrayList = this.g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.g0.get(i11);
                if (eVar2 != null) {
                    eVar2.d(i9);
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
    public final void t(int i9) {
        c cVar;
        String hexString;
        ArrayList arrayList;
        c cVar2;
        float f10;
        c cVar3;
        c k10;
        int i10;
        int i11;
        c cVar4;
        c cVar5;
        c cVar6;
        int i12 = this.f;
        if (i12 != i9) {
            cVar = m(i12);
            this.f = i9;
        } else {
            cVar = null;
        }
        if (this.e == null) {
            z();
            return;
        }
        if (this.G) {
            z();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.getClass();
        int i13 = this.H;
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
            r0.y(sb2, this.a, ", found: ", b10, " Pager id: ");
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
            cVar2 = (c) arrayList.get(i14);
            int i15 = cVar2.b;
            int i16 = this.f;
            if (i15 < i16) {
                i14++;
            }
        }
        if (cVar2 == null && b10 > 0) {
            cVar2 = a(this.f, i14);
        }
        if (cVar2 != null) {
            int i17 = i14 - 1;
            c cVar7 = i17 >= 0 ? (c) arrayList.get(i17) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - cVar2.d);
            float f11 = 0.0f;
            for (int i18 = this.f - 1; i18 >= 0; i18--) {
                if (f11 >= paddingLeft && i18 < max) {
                    if (cVar7 == null) {
                        break;
                    }
                    if (i18 == cVar7.b && !cVar7.c) {
                        arrayList.remove(i17);
                        this.e.a(this, cVar7.a);
                        i17--;
                        i14--;
                        if (i17 >= 0) {
                            cVar6 = (c) arrayList.get(i17);
                            cVar7 = cVar6;
                        }
                        cVar6 = null;
                        cVar7 = cVar6;
                    }
                } else if (cVar7 == null || i18 != cVar7.b) {
                    f11 += a(i18, i17 + 1).d;
                    i14++;
                    if (i17 >= 0) {
                        cVar6 = (c) arrayList.get(i17);
                        cVar7 = cVar6;
                    }
                    cVar6 = null;
                    cVar7 = cVar6;
                } else {
                    f11 += cVar7.d;
                    i17--;
                    if (i17 >= 0) {
                        cVar6 = (c) arrayList.get(i17);
                        cVar7 = cVar6;
                    }
                    cVar6 = null;
                    cVar7 = cVar6;
                }
            }
            f10 = 0.0f;
            float f12 = cVar2.d;
            int i19 = i14 + 1;
            if (f12 < 2.0f) {
                c cVar8 = i19 < arrayList.size() ? (c) arrayList.get(i19) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i20 = i19;
                for (int i21 = this.f + 1; i21 < b10; i21++) {
                    if (f12 >= paddingRight && i21 > min) {
                        if (cVar8 == null) {
                            break;
                        }
                        if (i21 == cVar8.b && !cVar8.c) {
                            arrayList.remove(i20);
                            this.e.a(this, cVar8.a);
                            if (i20 < arrayList.size()) {
                                cVar8 = (c) arrayList.get(i20);
                            }
                            cVar8 = null;
                        }
                    } else if (cVar8 == null || i21 != cVar8.b) {
                        c a2 = a(i21, i20);
                        i20++;
                        f12 += a2.d;
                        if (i20 < arrayList.size()) {
                            cVar8 = (c) arrayList.get(i20);
                        }
                        cVar8 = null;
                    } else {
                        f12 += cVar8.d;
                        i20++;
                        if (i20 < arrayList.size()) {
                            cVar8 = (c) arrayList.get(i20);
                        }
                        cVar8 = null;
                    }
                }
            }
            int b11 = this.e.b();
            int clientWidth2 = getClientWidth();
            float f13 = clientWidth2 > 0 ? this.w / clientWidth2 : 0.0f;
            if (cVar != null) {
                int i22 = cVar.b;
                int i23 = cVar2.b;
                if (i22 < i23) {
                    float f14 = cVar.e + cVar.d + f13;
                    int i24 = i22 + 1;
                    int i25 = 0;
                    while (i24 <= cVar2.b && i25 < arrayList.size()) {
                        Object obj = arrayList.get(i25);
                        while (true) {
                            cVar5 = (c) obj;
                            if (i24 <= cVar5.b || i25 >= arrayList.size() - 1) {
                                break;
                            }
                            i25++;
                            obj = arrayList.get(i25);
                        }
                        while (i24 < cVar5.b) {
                            this.e.getClass();
                            f14 += 1.0f + f13;
                            i24++;
                        }
                        cVar5.e = f14;
                        f14 += cVar5.d + f13;
                        i24++;
                    }
                } else if (i22 > i23) {
                    int size = arrayList.size() - 1;
                    float f15 = cVar.e;
                    while (true) {
                        i22--;
                        if (i22 < cVar2.b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            cVar4 = (c) obj2;
                            if (i22 >= cVar4.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i22 > cVar4.b) {
                            this.e.getClass();
                            f15 -= 1.0f + f13;
                            i22--;
                        }
                        f15 -= cVar4.d + f13;
                        cVar4.e = f15;
                    }
                }
            }
            int size2 = arrayList.size();
            float f16 = cVar2.e;
            int i26 = cVar2.b;
            int i27 = i26 - 1;
            this.B = i26 == 0 ? f16 : -3.4028235E38f;
            int i28 = b11 - 1;
            this.C = i26 == i28 ? (cVar2.d + f16) - 1.0f : Float.MAX_VALUE;
            int i29 = i14 - 1;
            while (i29 >= 0) {
                c cVar9 = (c) arrayList.get(i29);
                while (true) {
                    i11 = cVar9.b;
                    if (i27 <= i11) {
                        break;
                    }
                    i27--;
                    this.e.getClass();
                    f16 -= 1.0f + f13;
                }
                f16 -= cVar9.d + f13;
                cVar9.e = f16;
                if (i11 == 0) {
                    this.B = f16;
                }
                i29--;
                i27--;
            }
            float f17 = cVar2.e + cVar2.d + f13;
            int i30 = cVar2.b;
            while (true) {
                i30++;
                if (i19 >= size2) {
                    break;
                }
                c cVar10 = (c) arrayList.get(i19);
                while (true) {
                    i10 = cVar10.b;
                    if (i30 >= i10) {
                        break;
                    }
                    i30++;
                    this.e.getClass();
                    f17 += 1.0f + f13;
                }
                if (i10 == i28) {
                    this.C = (cVar10.d + f17) - 1.0f;
                }
                cVar10.e = f17;
                f17 += cVar10.d + f13;
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
            d dVar = (d) childAt.getLayoutParams();
            dVar.f = i31;
            if (!dVar.a && dVar.c == f10 && (k10 = k(childAt)) != null) {
                dVar.c = k10.d;
                dVar.e = k10.b;
            }
        }
        z();
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        cVar3 = k(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            cVar3 = null;
            if (cVar3 == null || cVar3.b != this.f) {
                for (int i32 = 0; i32 < getChildCount(); i32++) {
                    View childAt2 = getChildAt(i32);
                    c k11 = k(childAt2);
                    if (k11 != null && k11.b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void u(int i9, int i10, int i11, int i12) {
        if (i10 > 0 && !this.b.isEmpty()) {
            if (!this.r.isFinished()) {
                this.r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i9 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        c m10 = m(this.f);
        int min = (int) ((m10 != null ? Math.min(m10.e, this.C) : 0.0f) * ((i9 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    public final boolean v() {
        this.R = -1;
        this.I = false;
        this.J = false;
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.S = null;
        }
        this.b0.onRelease();
        this.c0.onRelease();
        return this.b0.isFinished() || this.c0.isFinished();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
    }

    public final void w(int i9, int i10, boolean z10, boolean z11) {
        int scrollX;
        int abs;
        c m10 = m(i9);
        int max = m10 != null ? (int) (Math.max(this.B, Math.min(m10.e, this.C)) * getClientWidth()) : 0;
        if (!z10) {
            if (z11) {
                h(i9);
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
                    abs = (int) (((Math.abs(i12) / ((f10 * 1.0f) + this.w)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.s = false;
                this.r.startScroll(i11, scrollY, i12, i13, min);
                WeakHashMap weakHashMap = j0.a;
                postInvalidateOnAnimation();
            }
        }
        if (z11) {
            h(i9);
        }
    }

    public void x(int i9, boolean z10) {
        this.G = false;
        y(i9, 0, z10, false);
    }

    public final void y(int i9, int i10, boolean z10, boolean z11) {
        a aVar = this.e;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z11 && this.f == i9 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i9 < 0) {
            i9 = 0;
        } else if (i9 >= this.e.b()) {
            i9 = this.e.b() - 1;
        }
        int i11 = this.H;
        int i12 = this.f;
        if (i9 > i12 + i11 || i9 < i12 - i11) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((c) arrayList.get(i13)).c = true;
            }
        }
        boolean z12 = this.f != i9;
        if (!this.d0) {
            t(i9);
            w(i9, i10, z10, z12);
        } else {
            this.f = i9;
            if (z12) {
                h(i9);
            }
            requestLayout();
        }
    }

    public final void z() {
        if (this.k0 != 0) {
            ArrayList arrayList = this.l0;
            if (arrayList == null) {
                this.l0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.l0.add(getChildAt(i9));
            }
            Collections.sort(this.l0, r0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d dVar = new d(context, attributeSet);
        dVar.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0);
        dVar.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return dVar;
    }

    public void setPageMarginDrawable(int i9) {
        setPageMarginDrawable(getContext().getDrawable(i9));
    }
}
