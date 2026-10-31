package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w extends FrameLayout {
    public boolean D;
    public final /* synthetic */ ActionBarLayout E;
    public final Rect a;
    public boolean b;
    public int c;
    public final Paint d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public LinearGradient r;
    public final Matrix s;
    public Paint w;
    public t3 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.E = actionBarLayout;
        this.a = new Rect();
        this.d = new Paint();
        this.s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i10) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint n02 = t6.n0(i10);
        t3 t3Var = t3.c;
        if (paddingLeft <= 0 || this.x == t3Var) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), n02);
        }
        if (paddingRight > 0 && this.x != t3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), n02);
        }
        if (paddingBottom > 0) {
            if (this.x == t3.a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), n02);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.s1 != null && getParent() == actionBarLayout) {
            actionBarLayout.o(this, actionBarLayout.s1);
        } else {
            WeakHashMap weakHashMap = r0.h0.a;
            r0.x.c(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[Catch: Exception -> 0x0018, TRY_LEAVE, TryCatch #0 {Exception -> 0x0018, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0011, B:13:0x0022, B:22:0x0031, B:24:0x0037, B:33:0x001a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i10;
        try {
            int childCount = getChildCount();
            int i11 = childCount - 1;
            while (true) {
                if (i11 < 0) {
                    i11 = -1;
                    break;
                }
                View childAt = getChildAt(i11);
                if ((childAt instanceof h2) && childAt.getVisibility() == 0) {
                    break;
                } else {
                    i11--;
                }
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2 != null) {
                    if (i11 != -1 && i12 != i11) {
                        i10 = 4;
                        if (childAt2.getImportantForAccessibility() == i10) {
                            childAt2.setImportantForAccessibility(i10);
                        }
                    }
                    i10 = 0;
                    if (childAt2.getImportantForAccessibility() == i10) {
                    }
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i0.c cVar;
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.S0) {
            super.dispatchDraw(canvas);
            return;
        }
        s3 s3Var = actionBarLayout.y;
        boolean z10 = false;
        int color = s3Var != null ? s3Var.getInternalNavbarPaint().getColor() : t6.x0(null, t6.a7, false);
        boolean z11 = true;
        if (this == actionBarLayout.x) {
            org.telegram.ui.Components.t5 t5Var = actionBarLayout.h1;
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.hasSheet()) {
                z10 = true;
            }
            float d = t5Var.d(z10);
            if (d > 0.0f) {
                a(canvas, this.D, t6.r1(d, color));
            }
        } else {
            k2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.s && this.x != t3.a) {
                    int childCount = getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        if (getChildAt(i10) instanceof h2) {
                            break;
                        }
                    }
                }
                z11 = false;
                a(canvas, z11, color);
                if (z11 && this.y && actionBarLayout.v(false) <= 0 && (cVar = actionBarLayout.t1) != null && cVar.d > 0) {
                    super.dispatchDraw(canvas);
                    canvas.drawRect(0.0f, getHeight() - actionBarLayout.t1.d, getWidth(), getHeight(), t6.n0(color));
                    return;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        ActionBarLayout actionBarLayout = this.E;
        boolean z10 = actionBarLayout.h && actionBarLayout.J == null;
        if ((!z10 && !actionBarLayout.a0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.s) {
                    }
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
            if (super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int i10;
        int i11;
        int i12;
        int i13;
        Drawable drawable;
        ArrayList<g2> arrayList;
        ActionBarLayout actionBarLayout = this.E;
        k2 k2Var = !actionBarLayout.U0.isEmpty() ? (k2) sc.e.g(1, actionBarLayout.U0) : null;
        s sVar = actionBarLayout.G;
        if (sVar != null && (arrayList = sVar.sheetsStack) != null && !arrayList.isEmpty()) {
            k2Var = actionBarLayout.G;
        }
        g2 lastSheet = k2Var != null ? k2Var.getLastSheet() : null;
        if (lastSheet != null && lastSheet.j() && lastSheet.d() != view) {
            return true;
        }
        if (view instanceof l) {
            return super.drawChild(canvas, view, j10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt != view && (childAt instanceof l) && childAt.getVisibility() == 0) {
                l lVar = (l) childAt;
                if (lVar.getCastShadows() && lVar.getShadowAlpha() > 0) {
                    i11 = childAt.getMeasuredHeight();
                    i12 = (int) childAt.getY();
                    i10 = lVar.getShadowAlpha();
                }
            } else {
                i14++;
            }
        }
        i10 = 0;
        i11 = 0;
        i12 = 0;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i11 != 0 && (drawable = ActionBarLayout.v1) != null) {
            int alpha = drawable.getAlpha();
            int i15 = i12 + i11;
            ActionBarLayout.v1.setBounds(0, i15, getMeasuredWidth(), ActionBarLayout.v1.getIntrinsicHeight() + i15);
            ActionBarLayout.v1.setAlpha(i10);
            ActionBarLayout.v1.draw(canvas);
            ActionBarLayout.v1.setAlpha(alpha);
        }
        if (this.D && this.y && k2Var != null && k2Var.getListViewForSimpleGlass() == null && (i13 = org.telegram.messenger.i0.n) >= org.telegram.messenger.i0.L(32.0f)) {
            int i16 = (int) (i13 * 1.33f);
            int navigationBarColor = k2Var.getNavigationBarColor();
            if (i16 != this.h || this.n != navigationBarColor || this.w == null) {
                if (this.w == null) {
                    this.w = new Paint(1);
                }
                this.n = navigationBarColor;
                this.h = i16;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i16, new int[]{t6.r1(0.1f, navigationBarColor), t6.r1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.r = linearGradient;
                this.w.setShader(linearGradient);
            }
            Matrix matrix = this.s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i16);
            this.r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i16, getWidth(), getHeight(), this.w);
        }
        return drawChild;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.c != 0) {
            int i10 = t6.d6;
            int x02 = t6.x0(null, i10, false);
            int i11 = this.e;
            Paint paint = this.d;
            if (i11 != x02) {
                int x03 = t6.x0(null, i10, false);
                this.e = x03;
                paint.setColor(x03);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int i15 = 0;
        while (true) {
            if (i15 >= childCount) {
                i14 = 0;
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt instanceof l) {
                i14 = childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i14);
                break;
            }
            i15++;
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof l)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows() || (childAt2 instanceof h2)) {
                    int i17 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i17, layoutParams.topMargin, childAt2.getMeasuredWidth() + i17 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                } else {
                    int i18 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i18, layoutParams.topMargin + i14, childAt2.getMeasuredWidth() + i18 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i14);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        this.b = ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.i0.m : 0)) - org.telegram.messenger.i0.q1(rootView)) - (rect.bottom - rect.top) > 0;
        ActionBarLayout actionBarLayout = this.E;
        Runnable runnable = actionBarLayout.d;
        if (runnable == null || actionBarLayout.s.b || actionBarLayout.w.b) {
            return;
        }
        org.telegram.messenger.i0.r(runnable);
        actionBarLayout.d.run();
        actionBarLayout.d = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        boolean z10 = size2 > size;
        boolean z11 = this.f;
        ActionBarLayout actionBarLayout = this.E;
        if (z11 != z10 && actionBarLayout.x() && (actionBarLayout.h || actionBarLayout.a0)) {
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                org.telegram.messenger.i0.r(runnable);
                actionBarLayout.e = null;
            }
            actionBarLayout.l(true, false);
        }
        this.f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.a);
        i3 i3Var = actionBarLayout.E;
        if (i3Var != null) {
            i3Var.setCurrentAccount(d20.s0);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i12 = 0;
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof l) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                i12 = childAt.getMeasuredHeight();
                break;
            }
            i13++;
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (!(childAt2 instanceof l)) {
                if (childAt2 instanceof h2) {
                    measureChildWithMargins(childAt2, i10, 0, i11, (actionBarLayout.v(false) > 0 || !this.y) ? 0 : actionBarLayout.t1.d);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, this.y ? actionBarLayout.t1.d : 0);
                } else {
                    measureChildWithMargins(childAt2, i10, 0, i11, i12);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        b();
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        b();
    }

    public void setDrawNavigationBar(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i10) {
        this.c = i10;
        invalidate();
    }

    public void setShouldHandleBottomInsets(t3 t3Var) {
        if (this.x != t3Var) {
            this.x = t3Var;
            this.y = t3Var != t3.a;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.E;
            if (actionBarLayout.s1 != null && getParent() == actionBarLayout) {
                actionBarLayout.o(this, actionBarLayout.s1);
            } else if (view != null) {
                WeakHashMap weakHashMap = r0.h0.a;
                r0.x.c(view);
            }
        }
    }
}
