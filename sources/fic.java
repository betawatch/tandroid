// default package

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class fic extends ViewGroup {
    public static final int[] t0 = {R.attr.layout_gravity};
    public static final nu6 u0 = new nu6(10);
    public static final if3 v0 = new if3(5);
    public static final nu6 w0 = new nu6(11);
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
    public final bic c;
    public final int c0;
    public final Rect d;
    public final int d0;
    public vu7 e;
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
    public dic m0;
    public Parcelable n;
    public hja n0;
    public byte o0;
    public byte p0;
    public ArrayList q0;
    public Scroller r;
    public final bva r0;
    public boolean s;
    public int s0;
    public u43 w;
    public int x;
    public Drawable y;

    public fic(Context context) {
        super(context);
        this.b = new ArrayList();
        this.c = new bic();
        this.d = new Rect();
        this.h = -1;
        this.n = null;
        this.G = -3.4028235E38f;
        this.H = Float.MAX_VALUE;
        this.M = 1;
        this.W = -1;
        this.i0 = true;
        this.r0 = new bva((Object) this, (byte) 11);
        this.s0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.r = new Scroller(context2, v0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.R = viewConfiguration.getScaledPagingTouchSlop();
        this.b0 = (int) (400.0f * f);
        this.c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g0 = new EdgeEffect(context2);
        this.h0 = new EdgeEffect(context2);
        this.d0 = (int) (25.0f * f);
        this.e0 = (int) (2.0f * f);
        this.P = (int) (f * 16.0f);
        ihc.l(this, new g89(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        ahc.i(this, new zhc(this));
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.K != z) {
            this.K = z;
        }
    }

    public final bic a(int i, int i2) {
        bic bicVar = new bic();
        bicVar.b = i;
        bicVar.a = this.e.e(this, i);
        this.e.getClass();
        bicVar.d = 1.0f;
        ArrayList arrayList = this.b;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(bicVar);
            return bicVar;
        }
        arrayList.add(i2, bicVar);
        return bicVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        bic k;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (k = k(childAt)) != null && k.b == this.f) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        bic k;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (k = k(childAt)) != null && k.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        cic cicVar = (cic) layoutParams;
        boolean z = cicVar.a | (view.getClass().getAnnotation(aic.class) != null);
        cicVar.a = z;
        if (!this.J) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            grb.i("Cannot add pager decor view during layout");
        } else {
            cicVar.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public final void b(dic dicVar) {
        ArrayList arrayList = this.l0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.l0 = arrayList;
        }
        arrayList.add(dicVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(int i) {
        View findNextFocus;
        boolean z;
        int i2;
        boolean requestFocus;
        View findFocus = findFocus();
        if (findFocus != this) {
            if (findFocus != null) {
                for (ViewParent parent = findFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    if (parent == this) {
                        break;
                    }
                }
                StringBuilder sb = new StringBuilder(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
            boolean z2 = true;
            z = false;
            if (findNextFocus == null && findNextFocus != findFocus) {
                Rect rect = this.d;
                if (i == 17) {
                    int i3 = j(findNextFocus, rect).left;
                    int i4 = j(findFocus, rect).left;
                    if (findFocus == null || i3 < i4) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        int i5 = this.f;
                        if (i5 > 0) {
                            x(i5 - 1, true);
                            z = z2;
                        }
                        z2 = false;
                        z = z2;
                    }
                } else if (i == 66) {
                    requestFocus = (findFocus == null || j(findNextFocus, rect).left > j(findFocus, rect).left) ? findNextFocus.requestFocus() : p();
                }
                z = requestFocus;
            } else if (i != 17 || i == 1) {
                i2 = this.f;
                if (i2 > 0) {
                    x(i2 - 1, true);
                    z = z2;
                }
                z2 = false;
                z = z2;
            } else if (i == 66 || i == 2) {
                z = p();
            }
            if (z) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
            }
            return z;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        boolean z22 = true;
        z = false;
        if (findNextFocus == null) {
        }
        if (i != 17) {
        }
        i2 = this.f;
        if (i2 > 0) {
        }
        z22 = false;
        z = z22;
        if (z) {
        }
        return z;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.G)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.H));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof cic) && super.checkLayoutParams(layoutParams);
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
        WeakHashMap weakHashMap = ihc.a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode == 22) {
                        z = keyEvent.hasModifiers(2) ? p() : c(66);
                    } else if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            z = c(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            z = c(1);
                        }
                    }
                    if (!z) {
                        return false;
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i = this.f;
                        if (i > 0) {
                            x(i - 1, true);
                            z = true;
                        }
                    } else {
                        z = c(17);
                    }
                    if (!z) {
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        bic k;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (k = k(childAt)) != null && k.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        vu7 vu7Var;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (vu7Var = this.e) != null && vu7Var.b() > 1)) {
            if (!this.g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.G * width);
                this.g0.setSize(height, width);
                z = this.g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.H + 1.0f)) * width2);
                this.h0.setSize(height2, width2);
                z |= this.h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.g0.finish();
            this.h0.finish();
        }
        if (z) {
            WeakHashMap weakHashMap = ihc.a;
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

    public final void e(boolean z) {
        boolean z2 = this.s0 == 2;
        if (z2) {
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
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            bic bicVar = (bic) arrayList.get(i);
            if (bicVar.c) {
                bicVar.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            bva bvaVar = this.r0;
            if (!z) {
                bvaVar.run();
            } else {
                WeakHashMap weakHashMap = ihc.a;
                postOnAnimation(bvaVar);
            }
        }
    }

    public final void f() {
        int b = this.e.b();
        this.a = b;
        ArrayList arrayList = this.b;
        boolean z = arrayList.size() < (this.M << 1) + 1 && arrayList.size() < b;
        int i = this.f;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < arrayList.size()) {
            bic bicVar = (bic) arrayList.get(i2);
            int c = this.e.c(bicVar.a);
            if (c != -1) {
                if (c == -2) {
                    arrayList.remove(i2);
                    i2--;
                    if (!z2) {
                        this.e.getClass();
                        z2 = true;
                    }
                    this.e.a(this, bicVar.a);
                    int i3 = this.f;
                    if (i3 == bicVar.b) {
                        i = Math.max(0, Math.min(i3, b - 1));
                    }
                } else {
                    int i4 = bicVar.b;
                    if (i4 != c) {
                        if (i4 == this.f) {
                            i = c;
                        }
                        bicVar.b = c;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.e.getClass();
        }
        Collections.sort(arrayList, u0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                cic cicVar = (cic) getChildAt(i5).getLayoutParams();
                if (!cicVar.a) {
                    cicVar.c = 0.0f;
                }
            }
            y(i, 0, false, true);
            requestLayout();
        }
    }

    public final int g(int i, int i2, float f, int i3) {
        if (Math.abs(i3) <= this.d0 || Math.abs(i2) <= this.b0) {
            i += (int) (f + (i >= this.f ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() > 0) {
            return Math.max(((bic) arrayList.get(0)).b, Math.min(i, ((bic) c00.g(1, arrayList)).b));
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        cic cicVar = new cic(-1, -1);
        cicVar.c = 0.0f;
        return cicVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        cic cicVar = new cic(context, attributeSet);
        cicVar.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0);
        cicVar.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return cicVar;
    }

    public vu7 getAdapter() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.p0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((cic) ((View) this.q0.get(i2)).getLayoutParams()).f;
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

    public final void h(int i) {
        dic dicVar = this.m0;
        if (dicVar != null) {
            dicVar.a(i);
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                dic dicVar2 = (dic) this.l0.get(i2);
                if (dicVar2 != null) {
                    dicVar2.a(i);
                }
            }
        }
    }

    public final void i() {
        if (!this.f0) {
            grb.i("No fake drag in progress. Call beginFakeDrag first.");
            return;
        }
        if (this.e != null) {
            VelocityTracker velocityTracker = this.a0;
            velocityTracker.computeCurrentVelocity(1000, this.c0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.W);
            this.L = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            bic l = l();
            y(g(l.b, xVelocity, ((scrollX / clientWidth) - l.e) / l.d, (int) (this.S - this.U)), xVelocity, true, true);
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

    public final bic k(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return null;
            }
            bic bicVar = (bic) arrayList.get(i);
            if (this.e.f(view, bicVar.a)) {
                return bicVar;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bic l() {
        float f;
        float f2;
        bic bicVar;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = getScrollX() / clientWidth;
            f2 = this.x / clientWidth;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        int i2 = 0;
        boolean z = true;
        bic bicVar2 = null;
        int i3 = -1;
        float f4 = 0.0f;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                break;
            }
            bic bicVar3 = (bic) arrayList.get(i2);
            if (z || bicVar3.b == (i = i3 + 1)) {
                bicVar = bicVar3;
            } else {
                float f5 = f3 + f4 + f2;
                bic bicVar4 = this.c;
                bicVar4.e = f5;
                bicVar4.b = i;
                this.e.getClass();
                bicVar4.d = 1.0f;
                i2--;
                bicVar = bicVar4;
            }
            f3 = bicVar.e;
            float f6 = bicVar.d + f3 + f2;
            if (!z && f < f3) {
                break;
            }
            if (f < f6 || i2 == arrayList.size() - 1) {
                break;
            }
            int i4 = bicVar.b;
            float f7 = bicVar.d;
            i2++;
            bic bicVar5 = bicVar;
            i3 = i4;
            f4 = f7;
            bicVar2 = bicVar5;
            z = false;
        }
        return bicVar;
    }

    public final bic m(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            bic bicVar = (bic) arrayList.get(i2);
            if (bicVar.b == i) {
                return bicVar;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(float f, int i, int i2) {
        int max;
        int i3;
        int left;
        if (this.k0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                cic cicVar = (cic) childAt.getLayoutParams();
                if (cicVar.a) {
                    int i5 = cicVar.b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            i3 = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            i3 = paddingLeft;
                        } else {
                            max = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i3;
                    } else {
                        max = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = max;
                    i3 = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i3;
                }
            }
        }
        dic dicVar = this.m0;
        if (dicVar != null) {
            dicVar.b(f, i, i2);
        }
        ArrayList arrayList = this.l0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                dic dicVar2 = (dic) this.l0.get(i7);
                if (dicVar2 != null) {
                    dicVar2.b(f, i, i2);
                }
            }
        }
        if (this.n0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((cic) childAt2.getLayoutParams()).a) {
                    float left2 = (childAt2.getLeft() - scrollX2) / getClientWidth();
                    acb acbVar = (acb) this.n0.b;
                    w6b w6bVar = (w6b) childAt2;
                    if (Math.abs(left2) >= 1.0f) {
                        w6bVar.a(false);
                        hl.d3(new uoa((Object) w6bVar, (byte) 26), 16L);
                    } else {
                        if (!w6bVar.d) {
                            w6bVar.a(true);
                            ArrayList arrayList2 = acbVar.y0;
                            o68 o68Var = w6bVar.a;
                            long j = w6bVar.b;
                            if (arrayList2 != null) {
                                ArrayList arrayList3 = w6bVar.c;
                                o68Var.l1 = j;
                                o68Var.j1 = arrayList3;
                                o68Var.e0(-1);
                            } else {
                                o68Var.P0(-1, j);
                            }
                        }
                        w6bVar.a.setOffset(left2);
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
            int i = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getX(i);
            this.W = motionEvent.getPointerId(i);
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
        int i;
        float f;
        ArrayList arrayList;
        int i2;
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
        float f2 = this.x / width;
        int i3 = 0;
        bic bicVar = (bic) arrayList2.get(0);
        float f3 = bicVar.e;
        int size = arrayList2.size();
        int i4 = bicVar.b;
        int i5 = ((bic) arrayList2.get(size - 1)).b;
        while (i4 < i5) {
            while (true) {
                i = bicVar.b;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                bicVar = (bic) arrayList2.get(i3);
            }
            if (i4 == i) {
                float f4 = bicVar.e;
                float f5 = bicVar.d;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                this.e.getClass();
                f = (f3 + 1.0f) * width;
                f3 = 1.0f + f2 + f3;
            }
            if (this.x + f > scrollX) {
                arrayList = arrayList2;
                i2 = scrollX;
                this.y.setBounds(Math.round(f), this.E, Math.round(this.x + f), this.F);
                this.y.draw(canvas);
            } else {
                arrayList = arrayList2;
                i2 = scrollX;
            }
            if (f > i2 + r3) {
                return;
            }
            i4++;
            arrayList2 = arrayList;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & jn7.d4;
        if (action == 3 || action == 1) {
            v();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.U = x;
            this.S = x;
            float y = motionEvent.getY();
            this.V = y;
            this.T = y;
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
        } else {
            if (this.N) {
                return true;
            }
            if (this.O) {
                return false;
            }
            if (action == 2) {
                int i = this.W;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.S;
                    float abs = Math.abs(f);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.V);
                    if (f != 0.0f) {
                        float f2 = this.S;
                        if ((f2 >= this.Q || f <= 0.0f) && ((f2 <= getWidth() - this.Q || f >= 0.0f) && d((int) f, (int) x2, (int) y2, this, false))) {
                            this.S = x2;
                            this.T = y2;
                            this.O = true;
                            return false;
                        }
                    }
                    int i2 = this.R;
                    float f3 = i2;
                    if (abs > f3 && abs * 0.5f > abs2) {
                        this.N = true;
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        setScrollState(1);
                        float f4 = this.U;
                        float f5 = i2;
                        this.S = f > 0.0f ? f4 + f5 : f4 - f5;
                        this.T = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > f3) {
                        this.O = true;
                    }
                    if (this.N && r(x2)) {
                        WeakHashMap weakHashMap = ihc.a;
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                o(motionEvent);
            }
        }
        VelocityTracker velocityTracker = this.a0;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.a0 = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        return this.N;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        bic k;
        int max;
        int i5;
        int max2;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                cic cicVar = (cic) childAt.getLayoutParams();
                if (cicVar.a) {
                    int i11 = cicVar.b;
                    int i12 = i11 & 7;
                    int i13 = i11 & jn7.w1;
                    if (i12 != 1) {
                        if (i12 == 3) {
                            i5 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i12 != 5) {
                            i5 = paddingLeft;
                        } else {
                            max = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i13 == 16) {
                            if (i13 == 48) {
                                i6 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i13 != 80) {
                                i6 = paddingTop;
                            } else {
                                max2 = (i8 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i14 = paddingLeft + scrollX;
                            childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                            i9++;
                            paddingTop = i6;
                            paddingLeft = i5;
                        } else {
                            max2 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i15 = max2;
                        i6 = paddingTop;
                        paddingTop = i15;
                        int i142 = paddingLeft + scrollX;
                        childAt.layout(i142, paddingTop, childAt.getMeasuredWidth() + i142, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = i6;
                        paddingLeft = i5;
                    } else {
                        max = Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = max;
                    i5 = paddingLeft;
                    paddingLeft = i16;
                    if (i13 == 16) {
                    }
                    int i152 = max2;
                    i6 = paddingTop;
                    paddingTop = i152;
                    int i1422 = paddingLeft + scrollX;
                    childAt.layout(i1422, paddingTop, childAt.getMeasuredWidth() + i1422, childAt.getMeasuredHeight() + paddingTop);
                    i9++;
                    paddingTop = i6;
                    paddingLeft = i5;
                }
            }
        }
        int i17 = (i7 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                cic cicVar2 = (cic) childAt2.getLayoutParams();
                if (!cicVar2.a && (k = k(childAt2)) != null) {
                    float f = i17;
                    int i19 = ((int) (k.e * f)) + paddingLeft;
                    if (cicVar2.d) {
                        cicVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * cicVar2.c), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((i8 - paddingTop) - paddingBottom, TLObject.FLAG_30));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.E = paddingTop;
        this.F = i8 - paddingBottom;
        this.k0 = i9;
        if (this.i0) {
            z2 = false;
            w(this.f, 0, false, false);
        } else {
            z2 = false;
        }
        this.i0 = z2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        cic cicVar;
        cic cicVar2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.Q = Math.min(measuredWidth / 10, this.P);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = TLObject.FLAG_30;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (cicVar2 = (cic) childAt.getLayoutParams()) != null && cicVar2.a) {
                int i6 = cicVar2.b;
                int i7 = i6 & 7;
                int i8 = i6 & jn7.w1;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = TLObject.FLAG_31;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) cicVar2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) cicVar2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.I = View.MeasureSpec.makeMeasureSpec(measuredHeight, TLObject.FLAG_30);
        this.J = true;
        s();
        this.J = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((cicVar = (cic) childAt2.getLayoutParams()) == null || !cicVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * cicVar.c), TLObject.FLAG_30), this.I);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        bic k;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (k = k(childAt)) != null && k.b == this.f && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof eic)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        eic eicVar = (eic) parcelable;
        super.onRestoreInstanceState(eicVar.a);
        if (this.e != null) {
            y(eicVar.c, 0, false, true);
        } else {
            this.h = eicVar.c;
            this.n = eicVar.d;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        eic eicVar = new eic(super.onSaveInstanceState());
        eicVar.c = this.f;
        if (this.e != null) {
            eicVar.d = null;
        }
        return eicVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.x;
            u(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        vu7 vu7Var;
        if (!this.f0) {
            boolean z = false;
            if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (vu7Var = this.e) == null || vu7Var.b() == 0) {
                return false;
            }
            VelocityTracker velocityTracker = this.a0;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.a0 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            int action = motionEvent.getAction() & jn7.d4;
            if (action == 0) {
                this.r.abortAnimation();
                this.L = false;
                s();
                float x = motionEvent.getX();
                this.U = x;
                this.S = x;
                float y = motionEvent.getY();
                this.V = y;
                this.T = y;
                this.W = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.N) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.W);
                        if (findPointerIndex == -1) {
                            z = v();
                        } else {
                            float x2 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x2 - this.S);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y2 - this.T);
                            int i = this.R;
                            if (abs > i && abs > abs2) {
                                this.N = true;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                                float f = this.U;
                                this.S = x2 - f > 0.0f ? f + i : f - i;
                                this.T = y2;
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
                        z = r(motionEvent.getX(motionEvent.findPointerIndex(this.W)));
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
                    z = v();
                }
            } else if (this.N) {
                VelocityTracker velocityTracker2 = this.a0;
                velocityTracker2.computeCurrentVelocity(1000, this.c0);
                int xVelocity = (int) velocityTracker2.getXVelocity(this.W);
                this.L = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                bic l = l();
                float f2 = clientWidth;
                y(g(l.b, xVelocity, ((scrollX / f2) - l.e) / (l.d + (this.x / f2)), (int) (motionEvent.getX(motionEvent.findPointerIndex(this.W)) - this.U)), xVelocity, true, true);
                z = v();
            }
            if (z) {
                WeakHashMap weakHashMap = ihc.a;
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    public final boolean p() {
        vu7 vu7Var = this.e;
        if (vu7Var == null || this.f >= vu7Var.b() - 1) {
            return false;
        }
        x(this.f + 1, true);
        return true;
    }

    public final boolean q(int i) {
        if (this.b.size() == 0) {
            if (!this.i0) {
                this.j0 = false;
                n(0.0f, 0, 0);
                if (!this.j0) {
                    grb.i("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        bic l = l();
        int clientWidth = getClientWidth();
        int i2 = this.x;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = l.b;
        float f2 = ((i / f) - l.e) / (l.d + (i2 / f));
        this.j0 = false;
        n(f2, i4, (int) (i3 * f2));
        if (this.j0) {
            return true;
        }
        grb.i("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final boolean r(float f) {
        boolean z;
        boolean z2;
        float f2 = this.S - f;
        this.S = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.G * clientWidth;
        float f4 = this.H * clientWidth;
        ArrayList arrayList = this.b;
        boolean z3 = false;
        bic bicVar = (bic) arrayList.get(0);
        bic bicVar2 = (bic) c00.g(1, arrayList);
        if (bicVar.b != 0) {
            f3 = bicVar.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (bicVar2.b != this.e.b() - 1) {
            f4 = bicVar2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.g0.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.h0.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.S = (scrollX - i) + this.S;
        scrollTo(i, getScrollY());
        q(i);
        return z3;
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

    public void setAdapter(vu7 vu7Var) {
        ArrayList arrayList = this.b;
        vu7 vu7Var2 = this.e;
        if (vu7Var2 != null) {
            synchronized (vu7Var2) {
                vu7Var2.b = null;
            }
            this.e.getClass();
            for (int i = 0; i < arrayList.size(); i++) {
                bic bicVar = (bic) arrayList.get(i);
                vu7 vu7Var3 = this.e;
                int i2 = bicVar.b;
                vu7Var3.a(this, bicVar.a);
            }
            this.e.getClass();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((cic) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f = 0;
            scrollTo(0, 0);
        }
        this.e = vu7Var;
        this.a = 0;
        if (vu7Var != null) {
            u43 u43Var = this.w;
            if (u43Var == null) {
                u43Var = new u43(this, (byte) 3);
                this.w = u43Var;
            }
            this.e.i(u43Var);
            this.L = false;
            boolean z = this.i0;
            this.i0 = true;
            this.a = this.e.b();
            if (this.h >= 0) {
                this.e.getClass();
                y(this.h, 0, false, true);
                this.h = -1;
                this.n = null;
                return;
            }
            if (z) {
                requestLayout();
            } else {
                s();
            }
        }
    }

    public void setCurrentItem(int i) {
        this.L = false;
        y(i, 0, !this.i0, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.M) {
            this.M = i;
            s();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(dic dicVar) {
        this.m0 = dicVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.x;
        this.x = i;
        int width = getWidth();
        u(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.y = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            if (this.n0 != null) {
                boolean z = i != 0;
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    getChildAt(i2).setLayerType(z ? this.o0 : (byte) 0, null);
                }
            }
            dic dicVar = this.m0;
            if (dicVar != null) {
                dicVar.c(i);
            }
            ArrayList arrayList = this.l0;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    dic dicVar2 = (dic) this.l0.get(i3);
                    if (dicVar2 != null) {
                        dicVar2.c(i);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r10 == r11) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i) {
        bic bicVar;
        String hexString;
        ArrayList arrayList;
        bic bicVar2;
        float f;
        bic bicVar3;
        bic k;
        int i2;
        int i3;
        bic bicVar4;
        bic bicVar5;
        bic bicVar6;
        int i4 = this.f;
        if (i4 != i) {
            bicVar = m(i4);
            this.f = i;
        } else {
            bicVar = null;
        }
        if (this.e == null) {
            z();
            return;
        }
        if (this.L) {
            z();
            return;
        }
        if (getWindowToken() != null) {
            this.e.getClass();
            int i5 = this.M;
            int max = Math.max(0, this.f - i5);
            int b = this.e.b();
            int min = Math.min(b - 1, this.f + i5);
            if (b != this.a) {
                try {
                    hexString = getResources().getResourceName(getId());
                } catch (Resources.NotFoundException unused) {
                    hexString = Integer.toHexString(getId());
                }
                StringBuilder sb = new StringBuilder("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
                bs2.w(sb, this.a, ", found: ", b, " Pager id: ");
                sb.append(hexString);
                sb.append(" Pager class: ");
                sb.append(getClass());
                sb.append(" Problematic adapter: ");
                grb.k(sb, this.e.getClass());
                return;
            }
            int i6 = 0;
            while (true) {
                arrayList = this.b;
                if (i6 >= arrayList.size()) {
                    break;
                }
                bicVar2 = (bic) arrayList.get(i6);
                int i7 = bicVar2.b;
                int i8 = this.f;
                if (i7 < i8) {
                    i6++;
                }
            }
            bicVar2 = null;
            if (bicVar2 == null && b > 0) {
                bicVar2 = a(this.f, i6);
            }
            if (bicVar2 != null) {
                int i9 = i6 - 1;
                bic bicVar7 = i9 >= 0 ? (bic) arrayList.get(i9) : null;
                int clientWidth = getClientWidth();
                float paddingLeft = clientWidth <= 0 ? 0.0f : (getPaddingLeft() / clientWidth) + (2.0f - bicVar2.d);
                float f2 = 0.0f;
                for (int i10 = this.f - 1; i10 >= 0; i10--) {
                    if (f2 >= paddingLeft && i10 < max) {
                        if (bicVar7 == null) {
                            break;
                        }
                        if (i10 == bicVar7.b && !bicVar7.c) {
                            arrayList.remove(i9);
                            this.e.a(this, bicVar7.a);
                            i9--;
                            i6--;
                            if (i9 >= 0) {
                                bicVar6 = (bic) arrayList.get(i9);
                                bicVar7 = bicVar6;
                            }
                            bicVar6 = null;
                            bicVar7 = bicVar6;
                        }
                    } else if (bicVar7 == null || i10 != bicVar7.b) {
                        f2 += a(i10, i9 + 1).d;
                        i6++;
                        if (i9 >= 0) {
                            bicVar6 = (bic) arrayList.get(i9);
                            bicVar7 = bicVar6;
                        }
                        bicVar6 = null;
                        bicVar7 = bicVar6;
                    } else {
                        f2 += bicVar7.d;
                        i9--;
                        if (i9 >= 0) {
                            bicVar6 = (bic) arrayList.get(i9);
                            bicVar7 = bicVar6;
                        }
                        bicVar6 = null;
                        bicVar7 = bicVar6;
                    }
                }
                f = 0.0f;
                float f3 = bicVar2.d;
                int i11 = i6 + 1;
                if (f3 < 2.0f) {
                    bic bicVar8 = i11 < arrayList.size() ? (bic) arrayList.get(i11) : null;
                    float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                    int i12 = i11;
                    for (int i13 = this.f + 1; i13 < b; i13++) {
                        if (f3 >= paddingRight && i13 > min) {
                            if (bicVar8 == null) {
                                break;
                            }
                            if (i13 == bicVar8.b && !bicVar8.c) {
                                arrayList.remove(i12);
                                this.e.a(this, bicVar8.a);
                                if (i12 < arrayList.size()) {
                                    bicVar8 = (bic) arrayList.get(i12);
                                }
                                bicVar8 = null;
                            }
                        } else if (bicVar8 == null || i13 != bicVar8.b) {
                            bic a = a(i13, i12);
                            i12++;
                            f3 += a.d;
                            if (i12 < arrayList.size()) {
                                bicVar8 = (bic) arrayList.get(i12);
                            }
                            bicVar8 = null;
                        } else {
                            f3 += bicVar8.d;
                            i12++;
                            if (i12 < arrayList.size()) {
                                bicVar8 = (bic) arrayList.get(i12);
                            }
                            bicVar8 = null;
                        }
                    }
                }
                int b2 = this.e.b();
                int clientWidth2 = getClientWidth();
                float f4 = clientWidth2 > 0 ? this.x / clientWidth2 : 0.0f;
                if (bicVar != null) {
                    int i14 = bicVar.b;
                    int i15 = bicVar2.b;
                    if (i14 < i15) {
                        float f5 = bicVar.e + bicVar.d + f4;
                        int i16 = i14 + 1;
                        int i17 = 0;
                        while (i16 <= bicVar2.b && i17 < arrayList.size()) {
                            Object obj = arrayList.get(i17);
                            while (true) {
                                bicVar5 = (bic) obj;
                                if (i16 <= bicVar5.b || i17 >= arrayList.size() - 1) {
                                    break;
                                }
                                i17++;
                                obj = arrayList.get(i17);
                            }
                            while (i16 < bicVar5.b) {
                                this.e.getClass();
                                f5 += 1.0f + f4;
                                i16++;
                            }
                            bicVar5.e = f5;
                            f5 += bicVar5.d + f4;
                            i16++;
                        }
                    } else if (i14 > i15) {
                        int size = arrayList.size() - 1;
                        float f6 = bicVar.e;
                        while (true) {
                            i14--;
                            if (i14 < bicVar2.b || size < 0) {
                                break;
                            }
                            Object obj2 = arrayList.get(size);
                            while (true) {
                                bicVar4 = (bic) obj2;
                                if (i14 >= bicVar4.b || size <= 0) {
                                    break;
                                }
                                size--;
                                obj2 = arrayList.get(size);
                            }
                            while (i14 > bicVar4.b) {
                                this.e.getClass();
                                f6 -= 1.0f + f4;
                                i14--;
                            }
                            f6 -= bicVar4.d + f4;
                            bicVar4.e = f6;
                        }
                    }
                }
                int size2 = arrayList.size();
                float f7 = bicVar2.e;
                int i18 = bicVar2.b;
                int i19 = i18 - 1;
                this.G = i18 == 0 ? f7 : -3.4028235E38f;
                int i20 = b2 - 1;
                this.H = i18 == i20 ? (bicVar2.d + f7) - 1.0f : Float.MAX_VALUE;
                int i21 = i6 - 1;
                while (i21 >= 0) {
                    bic bicVar9 = (bic) arrayList.get(i21);
                    while (true) {
                        i3 = bicVar9.b;
                        if (i19 <= i3) {
                            break;
                        }
                        i19--;
                        this.e.getClass();
                        f7 -= 1.0f + f4;
                    }
                    f7 -= bicVar9.d + f4;
                    bicVar9.e = f7;
                    if (i3 == 0) {
                        this.G = f7;
                    }
                    i21--;
                    i19--;
                }
                float f8 = bicVar2.e + bicVar2.d + f4;
                int i22 = bicVar2.b;
                while (true) {
                    i22++;
                    if (i11 >= size2) {
                        break;
                    }
                    bic bicVar10 = (bic) arrayList.get(i11);
                    while (true) {
                        i2 = bicVar10.b;
                        if (i22 >= i2) {
                            break;
                        }
                        i22++;
                        this.e.getClass();
                        f8 += 1.0f + f4;
                    }
                    if (i2 == i20) {
                        this.H = (bicVar10.d + f8) - 1.0f;
                    }
                    bicVar10.e = f8;
                    f8 += bicVar10.d + f4;
                    i11++;
                }
                this.e.h(this.f);
            } else {
                f = 0.0f;
            }
            this.e.getClass();
            int childCount = getChildCount();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt = getChildAt(i23);
                cic cicVar = (cic) childAt.getLayoutParams();
                cicVar.f = i23;
                if (!cicVar.a && cicVar.c == f && (k = k(childAt)) != null) {
                    cicVar.c = k.d;
                    cicVar.e = k.b;
                }
            }
            z();
            if (hasFocus()) {
                View findFocus = findFocus();
                if (findFocus != null) {
                    while (true) {
                        Object parent = findFocus.getParent();
                        if (parent == this) {
                            bicVar3 = k(findFocus);
                            break;
                        } else if (parent == null || !(parent instanceof View)) {
                            break;
                        } else {
                            findFocus = (View) parent;
                        }
                    }
                }
                bicVar3 = null;
                if (bicVar3 == null || bicVar3.b != this.f) {
                    for (int i24 = 0; i24 < getChildCount(); i24++) {
                        View childAt2 = getChildAt(i24);
                        bic k2 = k(childAt2);
                        if (k2 != null && k2.b == this.f && childAt2.requestFocus(2)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void u(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.b.isEmpty()) {
            if (!this.r.isFinished()) {
                this.r.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        bic m = m(this.f);
        int min = (int) ((m != null ? Math.min(m.e, this.H) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
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

    public final void w(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int abs;
        bic m = m(i);
        int max = m != null ? (int) (Math.max(this.G, Math.min(m.e, this.H)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                h(i);
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
                boolean z3 = this.s;
                Scroller scroller2 = this.r;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.r.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = max - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                e(false);
                s();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) << 2;
                } else {
                    this.e.getClass();
                    abs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.x)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.s = false;
                this.r.startScroll(i3, scrollY, i4, i5, min);
                WeakHashMap weakHashMap = ihc.a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            h(i);
        }
    }

    public void x(int i, boolean z) {
        this.L = false;
        y(i, 0, z, false);
    }

    public final void y(int i, int i2, boolean z, boolean z2) {
        vu7 vu7Var = this.e;
        if (vu7Var == null || vu7Var.b() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.b;
        if (!z2 && this.f == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.e.b()) {
            i = this.e.b() - 1;
        }
        int i3 = this.M;
        int i4 = this.f;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((bic) arrayList.get(i5)).c = true;
            }
        }
        boolean z3 = this.f != i;
        if (!this.i0) {
            t(i);
            w(i, i2, z, z3);
        } else {
            this.f = i;
            if (z3) {
                h(i);
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
            for (int i = 0; i < childCount; i++) {
                this.q0.add(getChildAt(i));
            }
            Collections.sort(this.q0, w0);
        }
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }
}
