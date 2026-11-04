package b5;

import a3.o;
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
import ei.j4;
import ei.w7;
import ei.x;
import ei.z5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import k2.p1;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import p4.q;
import r0.a0;
import r0.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class l extends ViewGroup {
    public static final b u0;
    public static final c v0;
    public int E;
    public int F;
    public float G;
    public float H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public final int P;
    public int Q;
    public final int R;
    public float S;
    public float T;
    public float U;
    public float V;
    public int W;
    public int a;
    public VelocityTracker a0;
    public final ArrayList b;
    public final int b0;
    public final e c;
    public final int c0;
    public final Rect d;
    public final int d0;
    public a e;
    public final int e0;
    public int f;
    public boolean f0;
    public EdgeEffect g0;
    public int h;
    public EdgeEffect h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public ArrayList l0;
    public h m0;
    public Parcelable n;
    public a1.c n0;
    public int o0;
    public int p0;
    public ArrayList q0;
    public Scroller r;
    public final o r0;
    public boolean s;
    public int s0;
    public i w;
    public int x;
    public Drawable y;
    public static final int[] t0 = {R.attr.layout_gravity};
    public static final b w0 = new b(1);

    static {
        int i3 = 0;
        u0 = new b(i3);
        v0 = new c(i3);
    }

    public l(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new e();
        this.d = new Rect();
        this.h = -1;
        this.n = null;
        this.G = -3.4028235E38f;
        this.H = Float.MAX_VALUE;
        this.M = 1;
        this.W = -1;
        this.i0 = true;
        this.r0 = new o(this, 9);
        this.s0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.r = new Scroller(context2, v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.R = viewConfiguration.getScaledPagingTouchSlop();
        this.b0 = (int) (400.0f * f10);
        this.c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g0 = new EdgeEffect(context2);
        this.h0 = new EdgeEffect(context2);
        this.d0 = (int) (25.0f * f10);
        this.e0 = (int) (2.0f * f10);
        this.P = (int) (f10 * 16.0f);
        i0.j(this, new g(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        q qVar = new q();
        qVar.b = this;
        qVar.a = new Rect();
        a0.i(this, qVar);
    }

    public static boolean d(int i3, int i10, int i11, View view, boolean z10) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && d(i3, i13 - childAt.getLeft(), i12 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i3);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
        }
    }

    public final e a(int i3, int i10) {
        e eVar = new e();
        eVar.b = i3;
        eVar.a = this.e.e(this, i3);
        this.e.getClass();
        eVar.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i10 < 0 || i10 >= arrayList.size()) {
            arrayList.add(eVar);
            return eVar;
        }
        arrayList.add(i10, eVar);
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i10) {
        e k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                    childAt.addFocusables(arrayList, i3, i10);
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
        e k10;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        f fVar = (f) layoutParams;
        boolean z10 = fVar.a | (view.getClass().getAnnotation(d.class) != null);
        fVar.a = z10;
        if (!this.J) {
            super.addView(view, i3, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            fVar.d = true;
            addViewInLayout(view, i3, layoutParams);
        }
    }

    public final void b(h hVar) {
        if (this.l0 == null) {
            this.l0 = new ArrayList();
        }
        this.l0.add(hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i3) {
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
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
            boolean z11 = true;
            z10 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.d;
                if (i3 == 17) {
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
                } else if (i3 == 66) {
                    requestFocus = (findFocus == null || j(findNextFocus, rect).left > j(findFocus, rect).left) ? findNextFocus.requestFocus() : p();
                }
                z10 = requestFocus;
            } else if (i3 != 17 || i3 == 1) {
                i10 = this.f;
                if (i10 > 0) {
                    x(i10 - 1, true);
                    z10 = z11;
                }
                z11 = false;
                z10 = z11;
            } else if (i3 == 66 || i3 == 2) {
                z10 = p();
            }
            if (z10) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i3));
            }
            return z10;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        boolean z112 = true;
        z10 = false;
        if (findNextFocus == null) {
        }
        if (i3 != 17) {
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
    public final boolean canScrollHorizontally(int i3) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i3 < 0 ? scrollX > ((int) (((float) clientWidth) * this.G)) : i3 > 0 && scrollX < ((int) (((float) clientWidth) * this.H));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
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
                        int i3 = this.f;
                        if (i3 > 0) {
                            x(i3 - 1, true);
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
        e k10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
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
            if (!this.g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.G * width);
                this.g0.setSize(height, width);
                z10 = this.g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.H + 1.0f)) * width2);
                this.h0.setSize(height2, width2);
                z10 |= this.h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.g0.finish();
            this.h0.finish();
        }
        if (z10) {
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

    public final void e(boolean z10) {
        boolean z11 = this.s0 == 2;
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
        this.L = false;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                break;
            }
            e eVar = (e) arrayList.get(i3);
            if (eVar.c) {
                eVar.c = false;
                z11 = true;
            }
            i3++;
        }
        if (z11) {
            o oVar = this.r0;
            if (!z10) {
                oVar.run();
            } else {
                WeakHashMap weakHashMap = i0.a;
                postOnAnimation(oVar);
            }
        }
    }

    public final void f() {
        int b10 = this.e.b();
        this.a = b10;
        ArrayList arrayList = this.b;
        boolean z10 = arrayList.size() < (this.M * 2) + 1 && arrayList.size() < b10;
        int i3 = this.f;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < arrayList.size()) {
            e eVar = (e) arrayList.get(i10);
            int c2 = this.e.c(eVar.a);
            if (c2 != -1) {
                if (c2 == -2) {
                    arrayList.remove(i10);
                    i10--;
                    if (!z11) {
                        this.e.getClass();
                        z11 = true;
                    }
                    this.e.a(this, eVar.a);
                    int i11 = this.f;
                    if (i11 == eVar.b) {
                        i3 = Math.max(0, Math.min(i11, b10 - 1));
                    }
                } else {
                    int i12 = eVar.b;
                    if (i12 != c2) {
                        if (i12 == this.f) {
                            i3 = c2;
                        }
                        eVar.b = c2;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.e.getClass();
        }
        Collections.sort(arrayList, u0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                f fVar = (f) getChildAt(i13).getLayoutParams();
                if (!fVar.a) {
                    fVar.c = 0.0f;
                }
            }
            y(i3, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i3, int i10, float f10, int i11) {
        if (Math.abs(i11) <= this.d0 || Math.abs(i10) <= this.b0) {
            i3 += (int) (f10 + (i3 >= this.f ? 0.4f : 0.6f));
        } else if (i10 <= 0) {
            i3++;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            return Math.max(((e) arrayList.get(0)).b, Math.min(i3, ((e) p1.h(1, arrayList)).b));
        }
        return i3;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        f fVar = new f(-1, -1);
        fVar.c = 0.0f;
        return fVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i10) {
        if (this.p0 == 2) {
            i10 = (i3 - 1) - i10;
        }
        return ((f) ((View) this.q0.get(i10)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.M;
    }

    public int getPageMargin() {
        return this.x;
    }

    public final void h(int i3) {
        h hVar = this.m0;
        if (hVar != null) {
            hVar.a(i3);
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar2 = (h) this.l0.get(i10);
                if (hVar2 != null) {
                    hVar2.a(i3);
                }
            }
        }
    }

    public final void i() {
        if (!this.f0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.e != null) {
            VelocityTracker velocityTracker = this.a0;
            velocityTracker.computeCurrentVelocity(1000, this.c0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.W);
            this.L = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e l10 = l();
            y(g(l10.b, xVelocity, ((scrollX / clientWidth) - l10.e) / l10.d, (int) (this.S - this.U)), xVelocity, true, true);
        }
        this.N = false;
        this.O = false;
        VelocityTracker velocityTracker2 = this.a0;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.a0 = null;
        }
        this.f0 = false;
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

    public final e k(View view) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                return null;
            }
            e eVar = (e) arrayList.get(i3);
            if (this.e.f(view, eVar.a)) {
                return eVar;
            }
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e l() {
        e eVar;
        int i3;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.x / clientWidth : 0.0f;
        int i10 = 0;
        boolean z10 = true;
        e eVar2 = null;
        int i11 = -1;
        float f12 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                break;
            }
            e eVar3 = (e) arrayList.get(i10);
            if (z10 || eVar3.b == (i3 = i11 + 1)) {
                eVar = eVar3;
            } else {
                float f13 = f10 + f12 + f11;
                e eVar4 = this.c;
                eVar4.e = f13;
                eVar4.b = i3;
                this.e.getClass();
                eVar4.d = 1.0f;
                i10--;
                eVar = eVar4;
            }
            f10 = eVar.e;
            float f14 = eVar.d + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f14 || i10 == arrayList.size() - 1) {
                break;
            }
            int i12 = eVar.b;
            float f15 = eVar.d;
            i10++;
            e eVar5 = eVar;
            i11 = i12;
            f12 = f15;
            eVar2 = eVar5;
            z10 = false;
        }
        return eVar;
    }

    public final e m(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            e eVar = (e) arrayList.get(i10);
            if (eVar.b == i3) {
                return eVar;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(float f10, int i3, int i10) {
        int max;
        int i11;
        int left;
        if (this.k0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a) {
                    int i13 = fVar.b & 7;
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
        h hVar = this.m0;
        if (hVar != null) {
            hVar.b(f10, i3, i10);
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                h hVar2 = (h) this.l0.get(i15);
                if (hVar2 != null) {
                    hVar2.b(f10, i3, i10);
                }
            }
        }
        if (this.n0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!((f) childAt2.getLayoutParams()).a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    x xVar = (x) this.n0.b;
                    w7 w7Var = (w7) childAt2;
                    if (Math.abs(left2) >= 1.0f) {
                        w7Var.a(false);
                        g0.i3(new z5(w7Var, 5), 16L);
                    } else {
                        if (!w7Var.d) {
                            w7Var.a(true);
                            if (xVar.y0 != null) {
                                j4 j4Var = w7Var.a;
                                long j10 = w7Var.b;
                                ArrayList arrayList2 = w7Var.c;
                                j4Var.l1 = j10;
                                j4Var.j1 = arrayList2;
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
        this.j0 = true;
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.W) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getX(i3);
            this.W = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.a0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.r0);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
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
        e eVar = (e) arrayList2.get(0);
        float f12 = eVar.e;
        int size = arrayList2.size();
        int i12 = eVar.b;
        int i13 = ((e) arrayList2.get(size - 1)).b;
        while (i12 < i13) {
            while (true) {
                i3 = eVar.b;
                if (i12 <= i3 || i11 >= size) {
                    break;
                }
                i11++;
                eVar = (e) arrayList2.get(i11);
            }
            if (i12 == i3) {
                float f13 = eVar.e;
                float f14 = eVar.d;
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
                this.y.setBounds(Math.round(f10), this.E, Math.round(this.x + f10), this.F);
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
        int action = motionEvent.getAction() & hs.e4;
        if (action == 3 || action == 1) {
            v();
            return false;
        }
        if (action != 0) {
            if (this.N) {
                return true;
            }
            if (this.O) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.U = x10;
            this.S = x10;
            float y9 = motionEvent.getY();
            this.V = y9;
            this.T = y9;
            this.W = motionEvent.getPointerId(0);
            this.O = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.s0 != 2 || Math.abs(this.r.getFinalX() - this.r.getCurrX()) <= this.e0) {
                e(false);
                this.N = false;
            } else {
                this.r.abortAnimation();
                this.L = false;
                s();
                this.N = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i3 = this.W;
            if (i3 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i3);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.S;
                float abs = Math.abs(f10);
                float y10 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y10 - this.V);
                if (f10 != 0.0f) {
                    float f11 = this.S;
                    if ((f11 >= this.Q || f10 <= 0.0f) && ((f11 <= getWidth() - this.Q || f10 >= 0.0f) && d((int) f10, (int) x11, (int) y10, this, false))) {
                        this.S = x11;
                        this.T = y10;
                        this.O = true;
                        return false;
                    }
                }
                int i10 = this.R;
                float f12 = i10;
                if (abs > f12 && abs * 0.5f > abs2) {
                    this.N = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.U;
                    float f14 = i10;
                    this.S = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.T = y10;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f12) {
                    this.O = true;
                }
                if (this.N && r(x11)) {
                    WeakHashMap weakHashMap = i0.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            o(motionEvent);
        }
        if (this.a0 == null) {
            this.a0 = VelocityTracker.obtain();
        }
        this.a0.addMovement(motionEvent);
        return this.N;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11;
        e k10;
        int max;
        int i13;
        int max2;
        int i14;
        int childCount = getChildCount();
        int i15 = i11 - i3;
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
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a) {
                    int i19 = fVar.b;
                    int i20 = i19 & 7;
                    int i21 = i19 & hs.x1;
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
                f fVar2 = (f) childAt2.getLayoutParams();
                if (!fVar2.a && (k10 = k(childAt2)) != null) {
                    float f10 = i25;
                    int i27 = ((int) (k10.e * f10)) + paddingLeft;
                    if (fVar2.d) {
                        fVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * fVar2.c), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((i16 - paddingTop) - paddingBottom, TLObject.FLAG_30));
                    }
                    childAt2.layout(i27, paddingTop, childAt2.getMeasuredWidth() + i27, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.E = paddingTop;
        this.F = i16 - paddingBottom;
        this.k0 = i17;
        if (this.i0) {
            z11 = false;
            w(this.f, 0, false, false);
        } else {
            z11 = false;
        }
        this.i0 = z11;
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
    public void onMeasure(int i3, int i10) {
        f fVar;
        f fVar2;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i3), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.Q = Math.min(measuredWidth / 10, this.P);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            int i13 = TLObject.FLAG_30;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.a) {
                int i14 = fVar2.b;
                int i15 = i14 & 7;
                int i16 = i14 & hs.x1;
                boolean z11 = i16 == 48 || i16 == 80;
                if (i15 != 3 && i15 != 5) {
                    z10 = false;
                }
                int i17 = TLObject.FLAG_31;
                if (z11) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else {
                    i11 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i18 != -2) {
                    i17 = 1073741824;
                }
                i18 = paddingLeft;
                int i19 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i19 == -2) {
                    i13 = i11;
                }
                i19 = measuredHeight;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        this.I = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        this.J = true;
        s();
        this.J = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.c), TLObject.FLAG_30), this.I);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        int i10;
        int i11;
        int i12;
        e k10;
        int childCount = getChildCount();
        if ((i3 & 2) != 0) {
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
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f && childAt.requestFocus(i3, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.a);
        if (this.e != null) {
            y(kVar.c, 0, false, true);
        } else {
            this.h = kVar.c;
            this.n = kVar.d;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.c = this.f;
        if (this.e != null) {
            kVar.d = null;
        }
        return kVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 != i11) {
            int i13 = this.x;
            u(i3, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.f0) {
            boolean z10 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.a0 == null) {
                this.a0 = VelocityTracker.obtain();
            }
            this.a0.addMovement(motionEvent);
            int action = motionEvent.getAction() & hs.e4;
            if (action == 0) {
                this.r.abortAnimation();
                this.L = false;
                s();
                float x10 = motionEvent.getX();
                this.U = x10;
                this.S = x10;
                float y9 = motionEvent.getY();
                this.V = y9;
                this.T = y9;
                this.W = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.N) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.W);
                        if (findPointerIndex == -1) {
                            z10 = v();
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x11 - this.S);
                            float y10 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y10 - this.T);
                            int i3 = this.R;
                            if (abs > i3 && abs > abs2) {
                                this.N = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f10 = this.U;
                                this.S = x11 - f10 > 0.0f ? f10 + i3 : f10 - i3;
                                this.T = y10;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.N) {
                        z10 = r(motionEvent.getX(motionEvent.findPointerIndex(this.W)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.S = motionEvent.getX(actionIndex);
                        this.W = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        o(motionEvent);
                        this.S = motionEvent.getX(motionEvent.findPointerIndex(this.W));
                    }
                } else if (this.N) {
                    w(this.f, 0, true, false);
                    z10 = v();
                }
            } else if (this.N) {
                VelocityTracker velocityTracker = this.a0;
                velocityTracker.computeCurrentVelocity(1000, this.c0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.W);
                this.L = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                e l10 = l();
                float f11 = clientWidth;
                y(g(l10.b, xVelocity, ((scrollX / f11) - l10.e) / (l10.d + (this.x / f11)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.W)) - this.U)), xVelocity, true, true);
                z10 = v();
            }
            if (z10) {
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

    public final boolean q(int i3) {
        if (this.b.size() == 0) {
            if (!this.i0) {
                this.j0 = false;
                n(0.0f, 0, 0);
                if (!this.j0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        e l10 = l();
        int clientWidth = getClientWidth();
        int i10 = this.x;
        int i11 = clientWidth + i10;
        float f10 = clientWidth;
        int i12 = l10.b;
        float f11 = ((i3 / f10) - l10.e) / (l10.d + (i10 / f10));
        this.j0 = false;
        n(f11, i12, (int) (i11 * f11));
        if (this.j0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.S - f10;
        this.S = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.G * clientWidth;
        float f13 = this.H * clientWidth;
        ArrayList arrayList = this.b;
        boolean z12 = false;
        e eVar = (e) arrayList.get(0);
        e eVar2 = (e) p1.h(1, arrayList);
        if (eVar.b != 0) {
            f12 = eVar.e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.b != this.e.b() - 1) {
            f13 = eVar2.e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.g0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.h0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i3 = (int) scrollX;
        this.S = (scrollX - i3) + this.S;
        scrollTo(i3, getScrollY());
        q(i3);
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.J) {
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
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                e eVar = (e) arrayList.get(i3);
                a aVar3 = this.e;
                int i10 = eVar.b;
                aVar3.a(this, eVar.a);
            }
            this.e.getClass();
            arrayList.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((f) getChildAt(i11).getLayoutParams()).a) {
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
                this.w = new i(this, 0);
            }
            this.e.i(this.w);
            this.L = false;
            boolean z10 = this.i0;
            this.i0 = true;
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

    public void setCurrentItem(int i3) {
        this.L = false;
        y(i3, 0, !this.i0, false);
    }

    public void setOffscreenPageLimit(int i3) {
        if (i3 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i3 + " too small; defaulting to 1");
            i3 = 1;
        }
        if (i3 != this.M) {
            this.M = i3;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.m0 = hVar;
    }

    public void setPageMargin(int i3) {
        int i10 = this.x;
        this.x = i3;
        int width = getWidth();
        u(width, width, i3, i10);
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

    public void setScrollState(int i3) {
        if (this.s0 == i3) {
            return;
        }
        this.s0 = i3;
        if (this.n0 != null) {
            boolean z10 = i3 != 0;
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).setLayerType(z10 ? this.o0 : 0, null);
            }
        }
        h hVar = this.m0;
        if (hVar != null) {
            hVar.c(i3);
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar2 = (h) this.l0.get(i11);
                if (hVar2 != null) {
                    hVar2.c(i3);
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
    public final void t(int i3) {
        e eVar;
        String hexString;
        ArrayList arrayList;
        e eVar2;
        float f10;
        e eVar3;
        e k10;
        int i10;
        int i11;
        e eVar4;
        e eVar5;
        e eVar6;
        int i12 = this.f;
        if (i12 != i3) {
            eVar = m(i12);
            this.f = i3;
        } else {
            eVar = null;
        }
        if (this.e == null) {
            z();
            return;
        }
        if (this.L) {
            z();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.getClass();
        int i13 = this.M;
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
            com.google.android.recaptcha.internal.a.r(sb2, this.a, ", found: ", b10, " Pager id: ");
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
            eVar2 = (e) arrayList.get(i14);
            int i15 = eVar2.b;
            int i16 = this.f;
            if (i15 < i16) {
                i14++;
            }
        }
        if (eVar2 == null && b10 > 0) {
            eVar2 = a(this.f, i14);
        }
        if (eVar2 != null) {
            int i17 = i14 - 1;
            e eVar7 = i17 >= 0 ? (e) arrayList.get(i17) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - eVar2.d);
            float f11 = 0.0f;
            for (int i18 = this.f - 1; i18 >= 0; i18--) {
                if (f11 >= paddingLeft && i18 < max) {
                    if (eVar7 == null) {
                        break;
                    }
                    if (i18 == eVar7.b && !eVar7.c) {
                        arrayList.remove(i17);
                        this.e.a(this, eVar7.a);
                        i17--;
                        i14--;
                        if (i17 >= 0) {
                            eVar6 = (e) arrayList.get(i17);
                            eVar7 = eVar6;
                        }
                        eVar6 = null;
                        eVar7 = eVar6;
                    }
                } else if (eVar7 == null || i18 != eVar7.b) {
                    f11 += a(i18, i17 + 1).d;
                    i14++;
                    if (i17 >= 0) {
                        eVar6 = (e) arrayList.get(i17);
                        eVar7 = eVar6;
                    }
                    eVar6 = null;
                    eVar7 = eVar6;
                } else {
                    f11 += eVar7.d;
                    i17--;
                    if (i17 >= 0) {
                        eVar6 = (e) arrayList.get(i17);
                        eVar7 = eVar6;
                    }
                    eVar6 = null;
                    eVar7 = eVar6;
                }
            }
            f10 = 0.0f;
            float f12 = eVar2.d;
            int i19 = i14 + 1;
            if (f12 < 2.0f) {
                e eVar8 = i19 < arrayList.size() ? (e) arrayList.get(i19) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i20 = i19;
                for (int i21 = this.f + 1; i21 < b10; i21++) {
                    if (f12 >= paddingRight && i21 > min) {
                        if (eVar8 == null) {
                            break;
                        }
                        if (i21 == eVar8.b && !eVar8.c) {
                            arrayList.remove(i20);
                            this.e.a(this, eVar8.a);
                            if (i20 < arrayList.size()) {
                                eVar8 = (e) arrayList.get(i20);
                            }
                            eVar8 = null;
                        }
                    } else if (eVar8 == null || i21 != eVar8.b) {
                        e a10 = a(i21, i20);
                        i20++;
                        f12 += a10.d;
                        if (i20 < arrayList.size()) {
                            eVar8 = (e) arrayList.get(i20);
                        }
                        eVar8 = null;
                    } else {
                        f12 += eVar8.d;
                        i20++;
                        if (i20 < arrayList.size()) {
                            eVar8 = (e) arrayList.get(i20);
                        }
                        eVar8 = null;
                    }
                }
            }
            int b11 = this.e.b();
            int clientWidth2 = getClientWidth();
            float f13 = clientWidth2 > 0 ? this.x / clientWidth2 : 0.0f;
            if (eVar != null) {
                int i22 = eVar.b;
                int i23 = eVar2.b;
                if (i22 < i23) {
                    float f14 = eVar.e + eVar.d + f13;
                    int i24 = i22 + 1;
                    int i25 = 0;
                    while (i24 <= eVar2.b && i25 < arrayList.size()) {
                        Object obj = arrayList.get(i25);
                        while (true) {
                            eVar5 = (e) obj;
                            if (i24 <= eVar5.b || i25 >= arrayList.size() - 1) {
                                break;
                            }
                            i25++;
                            obj = arrayList.get(i25);
                        }
                        while (i24 < eVar5.b) {
                            this.e.getClass();
                            f14 += 1.0f + f13;
                            i24++;
                        }
                        eVar5.e = f14;
                        f14 += eVar5.d + f13;
                        i24++;
                    }
                } else if (i22 > i23) {
                    int size = arrayList.size() - 1;
                    float f15 = eVar.e;
                    while (true) {
                        i22--;
                        if (i22 < eVar2.b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            eVar4 = (e) obj2;
                            if (i22 >= eVar4.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i22 > eVar4.b) {
                            this.e.getClass();
                            f15 -= 1.0f + f13;
                            i22--;
                        }
                        f15 -= eVar4.d + f13;
                        eVar4.e = f15;
                    }
                }
            }
            int size2 = arrayList.size();
            float f16 = eVar2.e;
            int i26 = eVar2.b;
            int i27 = i26 - 1;
            this.G = i26 == 0 ? f16 : -3.4028235E38f;
            int i28 = b11 - 1;
            this.H = i26 == i28 ? (eVar2.d + f16) - 1.0f : Float.MAX_VALUE;
            int i29 = i14 - 1;
            while (i29 >= 0) {
                e eVar9 = (e) arrayList.get(i29);
                while (true) {
                    i11 = eVar9.b;
                    if (i27 <= i11) {
                        break;
                    }
                    i27--;
                    this.e.getClass();
                    f16 -= 1.0f + f13;
                }
                f16 -= eVar9.d + f13;
                eVar9.e = f16;
                if (i11 == 0) {
                    this.G = f16;
                }
                i29--;
                i27--;
            }
            float f17 = eVar2.e + eVar2.d + f13;
            int i30 = eVar2.b;
            while (true) {
                i30++;
                if (i19 >= size2) {
                    break;
                }
                e eVar10 = (e) arrayList.get(i19);
                while (true) {
                    i10 = eVar10.b;
                    if (i30 >= i10) {
                        break;
                    }
                    i30++;
                    this.e.getClass();
                    f17 += 1.0f + f13;
                }
                if (i10 == i28) {
                    this.H = (eVar10.d + f17) - 1.0f;
                }
                eVar10.e = f17;
                f17 += eVar10.d + f13;
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
            f fVar = (f) childAt.getLayoutParams();
            fVar.f = i31;
            if (!fVar.a && fVar.c == f10 && (k10 = k(childAt)) != null) {
                fVar.c = k10.d;
                fVar.e = k10.b;
            }
        }
        z();
        if (hasFocus()) {
            View findFocus = findFocus();
            if (findFocus != null) {
                while (true) {
                    Object parent = findFocus.getParent();
                    if (parent == this) {
                        eVar3 = k(findFocus);
                        break;
                    } else if (parent == null || !(parent instanceof View)) {
                        break;
                    } else {
                        findFocus = (View) parent;
                    }
                }
            }
            eVar3 = null;
            if (eVar3 == null || eVar3.b != this.f) {
                for (int i32 = 0; i32 < getChildCount(); i32++) {
                    View childAt2 = getChildAt(i32);
                    e k11 = k(childAt2);
                    if (k11 != null && k11.b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void u(int i3, int i10, int i11, int i12) {
        if (i10 > 0 && !this.b.isEmpty()) {
            if (!this.r.isFinished()) {
                this.r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i3 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
                return;
            }
        }
        e m10 = m(this.f);
        int min = (int) ((m10 != null ? Math.min(m10.e, this.H) : 0.0f) * ((i3 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    public final boolean v() {
        this.W = -1;
        this.N = false;
        this.O = false;
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.a0 = null;
        }
        this.g0.onRelease();
        this.h0.onRelease();
        return this.g0.isFinished() || this.h0.isFinished();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.y;
    }

    public final void w(int i3, int i10, boolean z10, boolean z11) {
        int scrollX;
        int abs;
        e m10 = m(i3);
        int max = m10 != null ? (int) (Math.max(this.G, Math.min(m10.e, this.H)) * getClientWidth()) : 0;
        if (!z10) {
            if (z11) {
                h(i3);
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
        if (z11) {
            h(i3);
        }
    }

    public void x(int i3, boolean z10) {
        this.L = false;
        y(i3, 0, z10, false);
    }

    public final void y(int i3, int i10, boolean z10, boolean z11) {
        a aVar = this.e;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z11 && this.f == i3 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= this.e.b()) {
            i3 = this.e.b() - 1;
        }
        int i11 = this.M;
        int i12 = this.f;
        if (i3 > i12 + i11 || i3 < i12 - i11) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((e) arrayList.get(i13)).c = true;
            }
        }
        boolean z12 = this.f != i3;
        if (!this.i0) {
            t(i3);
            w(i3, i10, z10, z12);
        } else {
            this.f = i3;
            if (z12) {
                h(i3);
            }
            requestLayout();
        }
    }

    public final void z() {
        if (this.p0 != 0) {
            ArrayList arrayList = this.q0;
            if (arrayList == null) {
                this.q0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                this.q0.add(getChildAt(i3));
            }
            Collections.sort(this.q0, w0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        f fVar = new f(context, attributeSet);
        fVar.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0);
        fVar.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return fVar;
    }

    public void setPageMarginDrawable(int i3) {
        setPageMarginDrawable(getContext().getDrawable(i3));
    }
}
