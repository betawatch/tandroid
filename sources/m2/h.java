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
import b7.r;
import f2.a0;
import f2.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import kh.a2;
import lh.m5;
import nh.d4;
import nh.n5;
import nh.q7;
import nh.y8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import r0.b0;
import r0.j0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class h extends ViewGroup {
    public static final r q0;
    public static final a0 r0;
    public int B;
    public float C;
    public float D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public final int L;
    public int M;
    public final int N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public VelocityTracker T;
    public final int U;
    public final int V;
    public final int W;
    public int a;
    public final int a0;
    public final ArrayList b;
    public boolean b0;
    public final d c;
    public EdgeEffect c0;
    public final Rect d;
    public EdgeEffect d0;
    public a e;
    public boolean e0;
    public int f;
    public boolean f0;
    public int g0;
    public int h;
    public ArrayList h0;
    public f i0;
    public m5 j0;
    public int k0;
    public int l0;
    public ArrayList m0;
    public Parcelable n;
    public final b n0;
    public int o0;
    public Scroller r;
    public boolean s;
    public h1.a v;
    public int w;
    public Drawable x;
    public int y;
    public static final int[] p0 = {R.attr.layout_gravity};
    public static final r s0 = new r(5);

    static {
        int i10 = 4;
        q0 = new r(i10);
        r0 = new a0(i10);
    }

    public h(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new d();
        this.d = new Rect();
        this.h = -1;
        this.n = null;
        this.C = -3.4028235E38f;
        this.D = Float.MAX_VALUE;
        this.I = 1;
        this.S = -1;
        this.e0 = true;
        this.n0 = new b(this, 0);
        this.o0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.r = new Scroller(context2, r0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.N = viewConfiguration.getScaledPagingTouchSlop();
        this.U = (int) (400.0f * f10);
        this.V = viewConfiguration.getScaledMaximumFlingVelocity();
        this.c0 = new EdgeEffect(context2);
        this.d0 = new EdgeEffect(context2);
        this.W = (int) (25.0f * f10);
        this.a0 = (int) (2.0f * f10);
        this.L = (int) (f10 * 16.0f);
        j0.k(this, new m1(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        b0.j(this, new f7.b(this));
    }

    public static boolean d(int i10, int i11, int i12, View view, boolean z4) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && d(i10, i14 - childAt.getLeft(), i13 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z4 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z4) {
        if (this.G != z4) {
            this.G = z4;
        }
    }

    public final d a(int i10, int i11) {
        d dVar = new d();
        dVar.b = i10;
        dVar.a = this.e.e(this, i10);
        this.e.getClass();
        dVar.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i11 < 0 || i11 >= arrayList.size()) {
            arrayList.add(dVar);
            return dVar;
        }
        arrayList.add(i11, dVar);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i10, int i11) {
        d k10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        d k10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        e eVar = (e) layoutParams;
        boolean z4 = eVar.a | (view.getClass().getAnnotation(c.class) != null);
        eVar.a = z4;
        if (!this.F) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z4) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            eVar.d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public final void b(f fVar) {
        if (this.h0 == null) {
            this.h0 = new ArrayList();
        }
        this.h0.add(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i10) {
        View findNextFocus;
        boolean z4;
        int i11;
        boolean requestFocus;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
            boolean z10 = true;
            z4 = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.d;
                if (i10 == 17) {
                    int i12 = j(findNextFocus, rect).left;
                    int i13 = j(findFocus, rect).left;
                    if (findFocus == null || i12 < i13) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i14 = this.f;
                        if (i14 > 0) {
                            x(i14 - 1, true);
                            z4 = z10;
                        }
                        z10 = false;
                        z4 = z10;
                    }
                } else if (i10 == 66) {
                    requestFocus = (findFocus == null || j(findNextFocus, rect).left > j(findFocus, rect).left) ? findNextFocus.requestFocus() : p();
                }
                z4 = requestFocus;
            } else if (i10 != 17 || i10 == 1) {
                i11 = this.f;
                if (i11 > 0) {
                    x(i11 - 1, true);
                    z4 = z10;
                }
                z10 = false;
                z4 = z10;
            } else if (i10 == 66 || i10 == 2) {
                z4 = p();
            }
            if (z4) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
            }
            return z4;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        boolean z102 = true;
        z4 = false;
        if (findNextFocus == null) {
        }
        if (i10 != 17) {
        }
        i11 = this.f;
        if (i11 > 0) {
        }
        z102 = false;
        z4 = z102;
        if (z4) {
        }
        return z4;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.C)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.D));
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
        WeakHashMap weakHashMap = j0.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z4;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z4 = keyEvent.hasModifiers(2) ? p() : c(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z4 = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z4 = c(1);
                        }
                    }
                    if (!z4) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i10 = this.f;
                        if (i10 > 0) {
                            x(i10 - 1, true);
                            z4 = true;
                        }
                    } else {
                        z4 = c(17);
                    }
                    if (!z4) {
                    }
                }
            }
            z4 = false;
            if (!z4) {
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
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
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
        boolean z4 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.e) != null && aVar.b() > 1)) {
            if (!this.c0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.C * width);
                this.c0.setSize(height, width);
                z4 = this.c0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.d0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.D + 1.0f)) * width2);
                this.d0.setSize(height2, width2);
                z4 |= this.d0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.c0.finish();
            this.d0.finish();
        }
        if (z4) {
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

    public final void e(boolean z4) {
        boolean z10 = this.o0 == 2;
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
        this.H = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                break;
            }
            d dVar = (d) arrayList.get(i10);
            if (dVar.c) {
                dVar.c = false;
                z10 = true;
            }
            i10++;
        }
        if (z10) {
            b bVar = this.n0;
            if (!z4) {
                bVar.run();
            } else {
                WeakHashMap weakHashMap = j0.a;
                postOnAnimation(bVar);
            }
        }
    }

    public final void f() {
        int b10 = this.e.b();
        this.a = b10;
        ArrayList arrayList = this.b;
        boolean z4 = arrayList.size() < (this.I * 2) + 1 && arrayList.size() < b10;
        int i10 = this.f;
        int i11 = 0;
        boolean z10 = false;
        while (i11 < arrayList.size()) {
            d dVar = (d) arrayList.get(i11);
            int c3 = this.e.c(dVar.a);
            if (c3 != -1) {
                if (c3 == -2) {
                    arrayList.remove(i11);
                    i11--;
                    if (!z10) {
                        this.e.getClass();
                        z10 = true;
                    }
                    this.e.a(this, dVar.a);
                    int i12 = this.f;
                    if (i12 == dVar.b) {
                        i10 = Math.max(0, Math.min(i12, b10 - 1));
                    }
                } else {
                    int i13 = dVar.b;
                    if (i13 != c3) {
                        if (i13 == this.f) {
                            i10 = c3;
                        }
                        dVar.b = c3;
                    }
                }
                z4 = true;
            }
            i11++;
        }
        if (z10) {
            this.e.getClass();
        }
        Collections.sort(arrayList, q0);
        if (z4) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                e eVar = (e) getChildAt(i14).getLayoutParams();
                if (!eVar.a) {
                    eVar.c = 0.0f;
                }
            }
            y(i10, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i10, int i11, float f10, int i12) {
        if (Math.abs(i12) <= this.W || Math.abs(i11) <= this.U) {
            i10 += (int) (f10 + (i10 >= this.f ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            return Math.max(((d) arrayList.get(0)).b, Math.min(i10, ((d) a2.i(1, arrayList)).b));
        }
        return i10;
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
    public final int getChildDrawingOrder(int i10, int i11) {
        if (this.l0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((e) ((View) this.m0.get(i11)).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.I;
    }

    public int getPageMargin() {
        return this.w;
    }

    public final void h(int i10) {
        f fVar = this.i0;
        if (fVar != null) {
            fVar.a(i10);
        }
        ArrayList arrayList = this.h0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = (f) this.h0.get(i11);
                if (fVar2 != null) {
                    fVar2.a(i10);
                }
            }
        }
    }

    public final void i() {
        if (!this.b0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.e != null) {
            VelocityTracker velocityTracker = this.T;
            velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.V);
            int xVelocity = (int) velocityTracker.getXVelocity(this.S);
            this.H = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            d l10 = l();
            y(g(l10.b, xVelocity, ((scrollX / clientWidth) - l10.e) / l10.d, (int) (this.O - this.Q)), xVelocity, true, true);
        }
        this.J = false;
        this.K = false;
        VelocityTracker velocityTracker2 = this.T;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.T = null;
        }
        this.b0 = false;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return null;
            }
            d dVar = (d) arrayList.get(i10);
            if (this.e.f(view, dVar.a)) {
                return dVar;
            }
            i10++;
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
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.w / clientWidth : 0.0f;
        d dVar2 = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z4 = true;
        while (true) {
            ArrayList arrayList = this.b;
            if (i12 >= arrayList.size()) {
                break;
            }
            d dVar3 = (d) arrayList.get(i12);
            if (z4 || dVar3.b == (i10 = i11 + 1)) {
                dVar = dVar3;
            } else {
                float f13 = f10 + f12 + f11;
                d dVar4 = this.c;
                dVar4.e = f13;
                dVar4.b = i10;
                this.e.getClass();
                dVar4.d = 1.0f;
                i12--;
                dVar = dVar4;
            }
            f10 = dVar.e;
            float f14 = dVar.d + f10 + f11;
            if (!z4 && scrollX < f10) {
                break;
            }
            if (scrollX < f14 || i12 == arrayList.size() - 1) {
                break;
            }
            int i13 = dVar.b;
            float f15 = dVar.d;
            i12++;
            d dVar5 = dVar;
            i11 = i13;
            f12 = f15;
            dVar2 = dVar5;
            z4 = false;
        }
        return dVar;
    }

    public final d m(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i11 >= arrayList.size()) {
                return null;
            }
            d dVar = (d) arrayList.get(i11);
            if (dVar.b == i10) {
                return dVar;
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(float f10, int i10, int i11) {
        int max;
        int i12;
        int left;
        if (this.g0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a) {
                    int i14 = eVar.b & 7;
                    if (i14 != 1) {
                        if (i14 == 3) {
                            i12 = childAt.getWidth() + paddingLeft;
                        } else if (i14 != 5) {
                            i12 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i12;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = max;
                    i12 = paddingLeft;
                    paddingLeft = i15;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i12;
                }
            }
        }
        f fVar = this.i0;
        if (fVar != null) {
            fVar.b(f10, i10, i11);
        }
        ArrayList arrayList = this.h0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                f fVar2 = (f) this.h0.get(i16);
                if (fVar2 != null) {
                    fVar2.b(f10, i10, i11);
                }
            }
        }
        if (this.j0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = getChildAt(i17);
                if (!((e) childAt2.getLayoutParams()).a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    y8 y8Var = (y8) this.j0.b;
                    q7 q7Var = (q7) childAt2;
                    if (Math.abs(left2) >= 1.0f) {
                        q7Var.a(false);
                        AndroidUtilities.runOnUIThread(new n5(q7Var, 6), 16L);
                    } else {
                        if (!q7Var.d) {
                            q7Var.a(true);
                            if (y8Var.u0 != null) {
                                d4 d4Var = q7Var.a;
                                long j10 = q7Var.b;
                                ArrayList arrayList2 = q7Var.c;
                                d4Var.y1 = j10;
                                d4Var.w1 = arrayList2;
                                d4Var.o0(-1);
                            } else {
                                q7Var.a.U0(-1, q7Var.b);
                            }
                        }
                        q7Var.a.setOffset(left2);
                        childAt2.setCameraDistance(childAt2.getWidth() * 15);
                        childAt2.setPivotX(left2 < 0.0f ? childAt2.getWidth() : 0.0f);
                        childAt2.setPivotY(childAt2.getHeight() * 0.5f);
                        childAt2.setRotationY(left2 * 90.0f);
                    }
                }
            }
        }
        this.f0 = true;
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.S) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.O = motionEvent.getX(i10);
            this.S = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.T;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.n0);
        Scroller scroller = this.r;
        if (scroller != null && !scroller.isFinished()) {
            this.r.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        ArrayList arrayList;
        int i11;
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
        int i12 = 0;
        d dVar = (d) arrayList2.get(0);
        float f12 = dVar.e;
        int size = arrayList2.size();
        int i13 = dVar.b;
        int i14 = ((d) arrayList2.get(size - 1)).b;
        while (i13 < i14) {
            while (true) {
                i10 = dVar.b;
                if (i13 <= i10 || i12 >= size) {
                    break;
                }
                i12++;
                dVar = (d) arrayList2.get(i12);
            }
            if (i13 == i10) {
                float f13 = dVar.e;
                float f14 = dVar.d;
                f10 = (f13 + f14) * width;
                f12 = f13 + f14 + f11;
            } else {
                this.e.getClass();
                f10 = (f12 + 1.0f) * width;
                f12 = 1.0f + f11 + f12;
            }
            if (this.w + f10 > scrollX) {
                arrayList = arrayList2;
                i11 = scrollX;
                this.x.setBounds(Math.round(f10), this.y, Math.round(this.w + f10), this.B);
                this.x.draw(canvas);
            } else {
                arrayList = arrayList2;
                i11 = scrollX;
            }
            if (f10 > i11 + r3) {
                return;
            }
            i13++;
            arrayList2 = arrayList;
            scrollX = i11;
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
            if (this.J) {
                return true;
            }
            if (this.K) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.Q = x10;
            this.O = x10;
            float y10 = motionEvent.getY();
            this.R = y10;
            this.P = y10;
            this.S = motionEvent.getPointerId(0);
            this.K = false;
            this.s = true;
            this.r.computeScrollOffset();
            if (this.o0 != 2 || Math.abs(this.r.getFinalX() - this.r.getCurrX()) <= this.a0) {
                e(false);
                this.J = false;
            } else {
                this.r.abortAnimation();
                this.H = false;
                s();
                this.J = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.S;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.O;
                float abs = Math.abs(f10);
                float y11 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y11 - this.R);
                if (f10 != 0.0f) {
                    float f11 = this.O;
                    if ((f11 >= this.M || f10 <= 0.0f) && ((f11 <= getWidth() - this.M || f10 >= 0.0f) && d((int) f10, (int) x11, (int) y11, this, false))) {
                        this.O = x11;
                        this.P = y11;
                        this.K = true;
                        return false;
                    }
                }
                int i11 = this.N;
                float f12 = i11;
                if (abs > f12 && abs * 0.5f > abs2) {
                    this.J = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f13 = this.Q;
                    float f14 = i11;
                    this.O = f10 > 0.0f ? f13 + f14 : f13 - f14;
                    this.P = y11;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f12) {
                    this.K = true;
                }
                if (this.J && r(x11)) {
                    WeakHashMap weakHashMap = j0.a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            o(motionEvent);
        }
        if (this.T == null) {
            this.T = VelocityTracker.obtain();
        }
        this.T.addMovement(motionEvent);
        return this.J;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        d k10;
        int max;
        int i14;
        int max2;
        int i15;
        int childCount = getChildCount();
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a) {
                    int i20 = eVar.b;
                    int i21 = i20 & 7;
                    int i22 = i20 & 112;
                    if (i21 != 1) {
                        if (i21 == 3) {
                            i14 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i21 != 5) {
                            i14 = paddingLeft;
                        } else {
                            max = (i16 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i22 == 16) {
                            if (i22 == 48) {
                                i15 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i22 != 80) {
                                i15 = paddingTop;
                            } else {
                                max2 = (i17 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i23 = paddingLeft + scrollX;
                            childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, childAt.getMeasuredHeight() + paddingTop);
                            i18++;
                            paddingTop = i15;
                            paddingLeft = i14;
                        } else {
                            max2 = Math.max((i17 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i24 = max2;
                        i15 = paddingTop;
                        paddingTop = i24;
                        int i232 = paddingLeft + scrollX;
                        childAt.layout(i232, paddingTop, childAt.getMeasuredWidth() + i232, childAt.getMeasuredHeight() + paddingTop);
                        i18++;
                        paddingTop = i15;
                        paddingLeft = i14;
                    } else {
                        max = Math.max((i16 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i25 = max;
                    i14 = paddingLeft;
                    paddingLeft = i25;
                    if (i22 == 16) {
                    }
                    int i242 = max2;
                    i15 = paddingTop;
                    paddingTop = i242;
                    int i2322 = paddingLeft + scrollX;
                    childAt.layout(i2322, paddingTop, childAt.getMeasuredWidth() + i2322, childAt.getMeasuredHeight() + paddingTop);
                    i18++;
                    paddingTop = i15;
                    paddingLeft = i14;
                }
            }
        }
        int i26 = (i16 - paddingLeft) - paddingRight;
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt2 = getChildAt(i27);
            if (childAt2.getVisibility() != 8) {
                e eVar2 = (e) childAt2.getLayoutParams();
                if (!eVar2.a && (k10 = k(childAt2)) != null) {
                    float f10 = i26;
                    int i28 = ((int) (k10.e * f10)) + paddingLeft;
                    if (eVar2.d) {
                        eVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * eVar2.c), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((i17 - paddingTop) - paddingBottom, TLObject.FLAG_30));
                    }
                    childAt2.layout(i28, paddingTop, childAt2.getMeasuredWidth() + i28, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.y = paddingTop;
        this.B = i17 - paddingBottom;
        this.g0 = i18;
        if (this.e0) {
            z10 = false;
            w(this.f, 0, false, false);
        } else {
            z10 = false;
        }
        this.e0 = z10;
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
    public void onMeasure(int i10, int i11) {
        e eVar;
        e eVar2;
        int i12;
        int i13;
        int i14;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.M = Math.min(measuredWidth / 10, this.L);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            boolean z4 = true;
            int i16 = TLObject.FLAG_30;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8 && (eVar2 = (e) childAt.getLayoutParams()) != null && eVar2.a) {
                int i17 = eVar2.b;
                int i18 = i17 & 7;
                int i19 = i17 & 112;
                boolean z10 = i19 == 48 || i19 == 80;
                if (i18 != 3 && i18 != 5) {
                    z4 = false;
                }
                int i20 = TLObject.FLAG_31;
                if (z10) {
                    i20 = TLObject.FLAG_30;
                } else if (z4) {
                    i12 = TLObject.FLAG_30;
                    i13 = ((ViewGroup.LayoutParams) eVar2).width;
                    if (i13 != -2) {
                        i20 = TLObject.FLAG_30;
                    }
                    i13 = paddingLeft;
                    i14 = ((ViewGroup.LayoutParams) eVar2).height;
                    if (i14 != -2) {
                        i16 = i12;
                    }
                    i14 = measuredHeight;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i20), View.MeasureSpec.makeMeasureSpec(i14, i16));
                    if (!z10) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z4) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i12 = TLObject.FLAG_31;
                i13 = ((ViewGroup.LayoutParams) eVar2).width;
                if (i13 != -2) {
                }
                i13 = paddingLeft;
                i14 = ((ViewGroup.LayoutParams) eVar2).height;
                if (i14 != -2) {
                }
                i14 = measuredHeight;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, i20), View.MeasureSpec.makeMeasureSpec(i14, i16));
                if (!z10) {
                }
            }
            i15++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, TLObject.FLAG_30);
        this.E = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        this.F = true;
        s();
        this.F = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((eVar = (e) childAt2.getLayoutParams()) == null || !eVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * eVar.c), TLObject.FLAG_30), this.E);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        d k10;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (k10 = k(childAt)) != null && k10.b == this.f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a);
        if (this.e != null) {
            y(gVar.c, 0, false, true);
        } else {
            this.h = gVar.c;
            this.n = gVar.d;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.c = this.f;
        if (this.e != null) {
            gVar.d = null;
        }
        return gVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.w;
            u(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (!this.b0) {
            boolean z4 = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.b() == 0) {
                return false;
            }
            if (this.T == null) {
                this.T = VelocityTracker.obtain();
            }
            this.T.addMovement(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.r.abortAnimation();
                this.H = false;
                s();
                float x10 = motionEvent.getX();
                this.Q = x10;
                this.O = x10;
                float y10 = motionEvent.getY();
                this.R = y10;
                this.P = y10;
                this.S = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.J) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.S);
                        if (findPointerIndex == -1) {
                            z4 = v();
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x11 - this.O);
                            float y11 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y11 - this.P);
                            int i10 = this.N;
                            if (abs > i10 && abs > abs2) {
                                this.J = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f10 = this.Q;
                                this.O = x11 - f10 > 0.0f ? f10 + i10 : f10 - i10;
                                this.P = y11;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.J) {
                        z4 = r(motionEvent.getX(motionEvent.findPointerIndex(this.S)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.O = motionEvent.getX(actionIndex);
                        this.S = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        o(motionEvent);
                        this.O = motionEvent.getX(motionEvent.findPointerIndex(this.S));
                    }
                } else if (this.J) {
                    w(this.f, 0, true, false);
                    z4 = v();
                }
            } else if (this.J) {
                VelocityTracker velocityTracker = this.T;
                velocityTracker.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT, this.V);
                int xVelocity = (int) velocityTracker.getXVelocity(this.S);
                this.H = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                d l10 = l();
                float f11 = clientWidth;
                y(g(l10.b, xVelocity, ((scrollX / f11) - l10.e) / (l10.d + (this.w / f11)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.S)) - this.Q)), xVelocity, true, true);
                z4 = v();
            }
            if (z4) {
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

    public final boolean q(int i10) {
        if (this.b.size() == 0) {
            if (!this.e0) {
                this.f0 = false;
                n(0.0f, 0, 0);
                if (!this.f0) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        d l10 = l();
        int clientWidth = getClientWidth();
        int i11 = this.w;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = l10.b;
        float f11 = ((i10 / f10) - l10.e) / (l10.d + (i11 / f10));
        this.f0 = false;
        n(f11, i13, (int) (i12 * f11));
        if (this.f0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean r(float f10) {
        boolean z4;
        boolean z10;
        float f11 = this.O - f10;
        this.O = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.C * clientWidth;
        float f13 = this.D * clientWidth;
        ArrayList arrayList = this.b;
        boolean z11 = false;
        d dVar = (d) arrayList.get(0);
        d dVar2 = (d) a2.i(1, arrayList);
        if (dVar.b != 0) {
            f12 = dVar.e * clientWidth;
            z4 = false;
        } else {
            z4 = true;
        }
        if (dVar2.b != this.e.b() - 1) {
            f13 = dVar2.e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (scrollX < f12) {
            if (z4) {
                this.c0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z11 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z10) {
                this.d0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z11 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.O = (scrollX - i10) + this.O;
        scrollTo(i10, getScrollY());
        q(i10);
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.F) {
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
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = (d) arrayList.get(i10);
                a aVar3 = this.e;
                int i11 = dVar.b;
                aVar3.a(this, dVar.a);
            }
            this.e.getClass();
            arrayList.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((e) getChildAt(i12).getLayoutParams()).a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
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
            this.H = false;
            boolean z4 = this.e0;
            this.e0 = true;
            this.a = this.e.b();
            if (this.h >= 0) {
                this.e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.n = null;
                return;
            }
            if (z4) {
                requestLayout();
            } else {
                s();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.H = false;
        y(i10, 0, !this.e0, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.I) {
            this.I = i10;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.i0 = fVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.w;
        this.w = i10;
        int width = getWidth();
        u(width, width, i10, i11);
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

    public void setScrollState(int i10) {
        if (this.o0 == i10) {
            return;
        }
        this.o0 = i10;
        if (this.j0 != null) {
            boolean z4 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z4 ? this.k0 : 0, null);
            }
        }
        f fVar = this.i0;
        if (fVar != null) {
            fVar.c(i10);
        }
        ArrayList arrayList = this.h0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                f fVar2 = (f) this.h0.get(i12);
                if (fVar2 != null) {
                    fVar2.c(i10);
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
    public final void t(int i10) {
        d dVar;
        String hexString;
        ArrayList arrayList;
        d dVar2;
        float f10;
        d dVar3;
        d k10;
        int i11;
        int i12;
        d dVar4;
        d dVar5;
        d dVar6;
        int i13 = this.f;
        if (i13 != i10) {
            dVar = m(i13);
            this.f = i10;
        } else {
            dVar = null;
        }
        if (this.e == null) {
            z();
            return;
        }
        if (this.H) {
            z();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.e.getClass();
        int i14 = this.I;
        int max = Math.max(0, this.f - i14);
        int b10 = this.e.b();
        int min = Math.min(b10 - 1, this.f + i14);
        if (b10 != this.a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
            a2.w(sb, this.a, ", found: ", b10, " Pager id: ");
            sb.append(hexString);
            sb.append(" Pager class: ");
            sb.append(getClass());
            sb.append(" Problematic adapter: ");
            sb.append(this.e.getClass());
            throw new IllegalStateException(sb.toString());
        }
        int i15 = 0;
        while (true) {
            arrayList = this.b;
            if (i15 >= arrayList.size()) {
                break;
            }
            dVar2 = (d) arrayList.get(i15);
            int i16 = dVar2.b;
            int i17 = this.f;
            if (i16 < i17) {
                i15++;
            }
        }
        if (dVar2 == null && b10 > 0) {
            dVar2 = a(this.f, i15);
        }
        if (dVar2 != null) {
            int i18 = i15 - 1;
            d dVar7 = i18 >= 0 ? (d) arrayList.get(i18) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - dVar2.d);
            float f11 = 0.0f;
            for (int i19 = this.f - 1; i19 >= 0; i19--) {
                if (f11 >= paddingLeft && i19 < max) {
                    if (dVar7 == null) {
                        break;
                    }
                    if (i19 == dVar7.b && !dVar7.c) {
                        arrayList.remove(i18);
                        this.e.a(this, dVar7.a);
                        i18--;
                        i15--;
                        if (i18 >= 0) {
                            dVar6 = (d) arrayList.get(i18);
                            dVar7 = dVar6;
                        }
                        dVar6 = null;
                        dVar7 = dVar6;
                    }
                } else if (dVar7 == null || i19 != dVar7.b) {
                    f11 += a(i19, i18 + 1).d;
                    i15++;
                    if (i18 >= 0) {
                        dVar6 = (d) arrayList.get(i18);
                        dVar7 = dVar6;
                    }
                    dVar6 = null;
                    dVar7 = dVar6;
                } else {
                    f11 += dVar7.d;
                    i18--;
                    if (i18 >= 0) {
                        dVar6 = (d) arrayList.get(i18);
                        dVar7 = dVar6;
                    }
                    dVar6 = null;
                    dVar7 = dVar6;
                }
            }
            f10 = 0.0f;
            float f12 = dVar2.d;
            int i20 = i15 + 1;
            if (f12 < 2.0f) {
                d dVar8 = i20 < arrayList.size() ? (d) arrayList.get(i20) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i21 = i20;
                for (int i22 = this.f + 1; i22 < b10; i22++) {
                    if (f12 >= paddingRight && i22 > min) {
                        if (dVar8 == null) {
                            break;
                        }
                        if (i22 == dVar8.b && !dVar8.c) {
                            arrayList.remove(i21);
                            this.e.a(this, dVar8.a);
                            if (i21 < arrayList.size()) {
                                dVar8 = (d) arrayList.get(i21);
                            }
                            dVar8 = null;
                        }
                    } else if (dVar8 == null || i22 != dVar8.b) {
                        d a2 = a(i22, i21);
                        i21++;
                        f12 += a2.d;
                        if (i21 < arrayList.size()) {
                            dVar8 = (d) arrayList.get(i21);
                        }
                        dVar8 = null;
                    } else {
                        f12 += dVar8.d;
                        i21++;
                        if (i21 < arrayList.size()) {
                            dVar8 = (d) arrayList.get(i21);
                        }
                        dVar8 = null;
                    }
                }
            }
            int b11 = this.e.b();
            int clientWidth2 = getClientWidth();
            float f13 = clientWidth2 > 0 ? this.w / clientWidth2 : 0.0f;
            if (dVar != null) {
                int i23 = dVar.b;
                int i24 = dVar2.b;
                if (i23 < i24) {
                    float f14 = dVar.e + dVar.d + f13;
                    int i25 = i23 + 1;
                    int i26 = 0;
                    while (i25 <= dVar2.b && i26 < arrayList.size()) {
                        Object obj = arrayList.get(i26);
                        while (true) {
                            dVar5 = (d) obj;
                            if (i25 <= dVar5.b || i26 >= arrayList.size() - 1) {
                                break;
                            }
                            i26++;
                            obj = arrayList.get(i26);
                        }
                        while (i25 < dVar5.b) {
                            this.e.getClass();
                            f14 += 1.0f + f13;
                            i25++;
                        }
                        dVar5.e = f14;
                        f14 += dVar5.d + f13;
                        i25++;
                    }
                } else if (i23 > i24) {
                    int size = arrayList.size() - 1;
                    float f15 = dVar.e;
                    while (true) {
                        i23--;
                        if (i23 < dVar2.b || size < 0) {
                            break;
                        }
                        Object obj2 = arrayList.get(size);
                        while (true) {
                            dVar4 = (d) obj2;
                            if (i23 >= dVar4.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i23 > dVar4.b) {
                            this.e.getClass();
                            f15 -= 1.0f + f13;
                            i23--;
                        }
                        f15 -= dVar4.d + f13;
                        dVar4.e = f15;
                    }
                }
            }
            int size2 = arrayList.size();
            float f16 = dVar2.e;
            int i27 = dVar2.b;
            int i28 = i27 - 1;
            this.C = i27 == 0 ? f16 : -3.4028235E38f;
            int i29 = b11 - 1;
            this.D = i27 == i29 ? (dVar2.d + f16) - 1.0f : Float.MAX_VALUE;
            int i30 = i15 - 1;
            while (i30 >= 0) {
                d dVar9 = (d) arrayList.get(i30);
                while (true) {
                    i12 = dVar9.b;
                    if (i28 <= i12) {
                        break;
                    }
                    i28--;
                    this.e.getClass();
                    f16 -= 1.0f + f13;
                }
                f16 -= dVar9.d + f13;
                dVar9.e = f16;
                if (i12 == 0) {
                    this.C = f16;
                }
                i30--;
                i28--;
            }
            float f17 = dVar2.e + dVar2.d + f13;
            int i31 = dVar2.b;
            while (true) {
                i31++;
                if (i20 >= size2) {
                    break;
                }
                d dVar10 = (d) arrayList.get(i20);
                while (true) {
                    i11 = dVar10.b;
                    if (i31 >= i11) {
                        break;
                    }
                    i31++;
                    this.e.getClass();
                    f17 += 1.0f + f13;
                }
                if (i11 == i29) {
                    this.D = (dVar10.d + f17) - 1.0f;
                }
                dVar10.e = f17;
                f17 += dVar10.d + f13;
                i20++;
            }
            this.e.h(this.f);
        } else {
            f10 = 0.0f;
        }
        this.e.getClass();
        int childCount = getChildCount();
        for (int i32 = 0; i32 < childCount; i32++) {
            View childAt = getChildAt(i32);
            e eVar = (e) childAt.getLayoutParams();
            eVar.f = i32;
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
                for (int i33 = 0; i33 < getChildCount(); i33++) {
                    View childAt2 = getChildAt(i33);
                    d k11 = k(childAt2);
                    if (k11 != null && k11.b == this.f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public final void u(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.b.isEmpty()) {
            if (!this.r.isFinished()) {
                this.r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        d m9 = m(this.f);
        int min = (int) ((m9 != null ? Math.min(m9.e, this.D) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            e(false);
            scrollTo(min, getScrollY());
        }
    }

    public final boolean v() {
        this.S = -1;
        this.J = false;
        this.K = false;
        VelocityTracker velocityTracker = this.T;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.T = null;
        }
        this.c0.onRelease();
        this.d0.onRelease();
        return this.c0.isFinished() || this.d0.isFinished();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.x;
    }

    public final void w(int i10, int i11, boolean z4, boolean z10) {
        int scrollX;
        int abs;
        d m9 = m(i10);
        int max = m9 != null ? (int) (Math.max(this.C, Math.min(m9.e, this.D)) * getClientWidth()) : 0;
        if (!z4) {
            if (z10) {
                h(i10);
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
            int i12 = scrollX;
            int scrollY = getScrollY();
            int i13 = max - i12;
            int i14 = 0 - scrollY;
            if (i13 == 0 && i14 == 0) {
                e(false);
                s();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i15 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i15;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int abs2 = Math.abs(i11);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.e.getClass();
                    abs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.w)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.s = false;
                this.r.startScroll(i12, scrollY, i13, i14, min);
                WeakHashMap weakHashMap = j0.a;
                postInvalidateOnAnimation();
            }
        }
        if (z10) {
            h(i10);
        }
    }

    public void x(int i10, boolean z4) {
        this.H = false;
        y(i10, 0, z4, false);
    }

    public final void y(int i10, int i11, boolean z4, boolean z10) {
        a aVar = this.e;
        if (aVar == null || aVar.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z10 && this.f == i10 && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.e.b()) {
            i10 = this.e.b() - 1;
        }
        int i12 = this.I;
        int i13 = this.f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ((d) arrayList.get(i14)).c = true;
            }
        }
        boolean z11 = this.f != i10;
        if (!this.e0) {
            t(i10);
            w(i10, i11, z4, z11);
        } else {
            this.f = i10;
            if (z11) {
                h(i10);
            }
            requestLayout();
        }
    }

    public final void z() {
        if (this.l0 != 0) {
            ArrayList arrayList = this.m0;
            if (arrayList == null) {
                this.m0 = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.m0.add(getChildAt(i10));
            }
            Collections.sort(this.m0, s0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e eVar = new e(context, attributeSet);
        eVar.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p0);
        eVar.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return eVar;
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getDrawable(i10));
    }
}
