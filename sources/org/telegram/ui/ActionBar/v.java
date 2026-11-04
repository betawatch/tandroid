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
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v extends FrameLayout {
    public boolean E;
    public final /* synthetic */ ActionBarLayout F;
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
    public m3 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.F = actionBarLayout;
        this.a = new Rect();
        this.d = new Paint();
        this.s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z10, int i3) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint n02 = k6.n0(i3);
        m3 m3Var = m3.c;
        if (paddingLeft <= 0 || this.x == m3Var) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), n02);
        }
        if (paddingRight > 0 && this.x != m3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), n02);
        }
        if (paddingBottom > 0) {
            if (this.x == m3.a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), n02);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.t1 != null && getParent() == actionBarLayout) {
            actionBarLayout.o(this, actionBarLayout.t1);
        } else {
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[Catch: Exception -> 0x0018, TRY_LEAVE, TryCatch #0 {Exception -> 0x0018, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0011, B:13:0x0022, B:22:0x0031, B:24:0x0037, B:33:0x001a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i3;
        try {
            int childCount = getChildCount();
            int i10 = childCount - 1;
            while (true) {
                if (i10 < 0) {
                    i10 = -1;
                    break;
                }
                View childAt = getChildAt(i10);
                if ((childAt instanceof a2) && childAt.getVisibility() == 0) {
                    break;
                } else {
                    i10--;
                }
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt2 = getChildAt(i11);
                if (childAt2 != null) {
                    if (i10 != -1 && i11 != i10) {
                        i3 = 4;
                        if (childAt2.getImportantForAccessibility() == i3) {
                            childAt2.setImportantForAccessibility(i3);
                        }
                    }
                    i3 = 0;
                    if (childAt2.getImportantForAccessibility() == i3) {
                    }
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i0.b bVar;
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.T0) {
            super.dispatchDraw(canvas);
            return;
        }
        l3 l3Var = actionBarLayout.y;
        boolean z10 = false;
        int color = l3Var != null ? l3Var.getInternalNavbarPaint().getColor() : k6.x0(null, k6.a7, false);
        boolean z11 = true;
        if (this == actionBarLayout.x) {
            org.telegram.ui.Components.u5 u5Var = actionBarLayout.i1;
            r rVar = actionBarLayout.H;
            if (rVar != null && rVar.hasSheet()) {
                z10 = true;
            }
            float d = u5Var.d(z10);
            if (d > 0.0f) {
                a(canvas, this.E, k6.r1(d, color));
            }
        } else {
            d2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.s && this.x != m3.a) {
                    int childCount = getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        if (getChildAt(i3) instanceof a2) {
                            break;
                        }
                    }
                }
                z11 = false;
                a(canvas, z11, color);
                if (z11 && this.y && actionBarLayout.w(false) <= 0 && (bVar = actionBarLayout.u1) != null && bVar.d > 0) {
                    super.dispatchDraw(canvas);
                    canvas.drawRect(0.0f, getHeight() - actionBarLayout.u1.d, getWidth(), getHeight(), k6.n0(color));
                    return;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        ActionBarLayout actionBarLayout = this.F;
        boolean z10 = actionBarLayout.h && actionBarLayout.K == null;
        if ((!z10 && !actionBarLayout.b0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z10) {
                try {
                    if (this != actionBarLayout.s) {
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
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
        int i3;
        int i10;
        int i11;
        int i12;
        Drawable drawable;
        ArrayList<z1> arrayList;
        ActionBarLayout actionBarLayout = this.F;
        d2 d2Var = !actionBarLayout.V0.isEmpty() ? (d2) t4.c.d(1, actionBarLayout.V0) : null;
        r rVar = actionBarLayout.H;
        if (rVar != null && (arrayList = rVar.sheetsStack) != null && !arrayList.isEmpty()) {
            d2Var = actionBarLayout.H;
        }
        z1 lastSheet = d2Var != null ? d2Var.getLastSheet() : null;
        if (lastSheet != null && lastSheet.j() && lastSheet.d() != view) {
            return true;
        }
        if (view instanceof k) {
            return super.drawChild(canvas, view, j10);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt != view && (childAt instanceof k) && childAt.getVisibility() == 0) {
                k kVar = (k) childAt;
                if (kVar.getCastShadows() && kVar.getShadowAlpha() > 0) {
                    i10 = childAt.getMeasuredHeight();
                    i11 = (int) childAt.getY();
                    i3 = kVar.getShadowAlpha();
                }
            } else {
                i13++;
            }
        }
        i3 = 0;
        i10 = 0;
        i11 = 0;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0 && (drawable = ActionBarLayout.w1) != null) {
            int alpha = drawable.getAlpha();
            int i14 = i11 + i10;
            ActionBarLayout.w1.setBounds(0, i14, getMeasuredWidth(), ActionBarLayout.w1.getIntrinsicHeight() + i14);
            ActionBarLayout.w1.setAlpha(i3);
            ActionBarLayout.w1.draw(canvas);
            ActionBarLayout.w1.setAlpha(alpha);
        }
        if (!actionBarLayout.T0 && this.E && this.y && d2Var != null && d2Var.getListViewForSimpleGlass() == null && (i12 = org.telegram.messenger.g0.n) >= org.telegram.messenger.g0.L(32.0f)) {
            int i15 = (int) (i12 * 1.33f);
            int navigationBarColor = d2Var.getNavigationBarColor();
            if (i15 != this.h || this.n != navigationBarColor || this.w == null) {
                if (this.w == null) {
                    this.w = new Paint(1);
                }
                this.n = navigationBarColor;
                this.h = i15;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i15, new int[]{k6.r1(0.1f, navigationBarColor), k6.r1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.r = linearGradient;
                this.w.setShader(linearGradient);
            }
            Matrix matrix = this.s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i15);
            this.r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i15, getWidth(), getHeight(), this.w);
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
            int i3 = k6.d6;
            int x02 = k6.x0(null, i3, false);
            int i10 = this.e;
            Paint paint = this.d;
            if (i10 != x02) {
                int x03 = k6.x0(null, i3, false);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                i13 = 0;
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt instanceof k) {
                i13 = childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i13);
                break;
            }
            i14++;
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (!(childAt2 instanceof k)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows() || (childAt2 instanceof a2)) {
                    int i16 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i16, layoutParams.topMargin, childAt2.getMeasuredWidth() + i16 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                } else {
                    int i17 = layoutParams.leftMargin;
                    childAt2.layout(paddingLeft + i17, layoutParams.topMargin + i13, childAt2.getMeasuredWidth() + i17 + paddingLeft, childAt2.getMeasuredHeight() + layoutParams.topMargin + i13);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        this.b = ((rootView.getHeight() - (rect.top != 0 ? org.telegram.messenger.g0.m : 0)) - org.telegram.messenger.g0.q1(rootView)) - (rect.bottom - rect.top) > 0;
        ActionBarLayout actionBarLayout = this.F;
        Runnable runnable = actionBarLayout.d;
        if (runnable == null || actionBarLayout.s.b || actionBarLayout.w.b) {
            return;
        }
        org.telegram.messenger.g0.r(runnable);
        actionBarLayout.d.run();
        actionBarLayout.d = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        boolean z10 = size2 > size;
        boolean z11 = this.f;
        ActionBarLayout actionBarLayout = this.F;
        if (z11 != z10 && actionBarLayout.y()) {
            actionBarLayout.v();
        }
        this.f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.a);
        b3 b3Var = actionBarLayout.F;
        if (b3Var != null) {
            b3Var.setCurrentAccount(h10.t0);
        }
        int i12 = 0;
        while (true) {
            if (i12 >= childCount) {
                i11 = 0;
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof k) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                i11 = childAt.getMeasuredHeight();
                break;
            }
            i12++;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (!(childAt2 instanceof k)) {
                if (childAt2 instanceof a2) {
                    measureChildWithMargins(childAt2, i3, 0, i10, (actionBarLayout.w(false) > 0 || !this.y) ? 0 : actionBarLayout.u1.d);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i3, 0, i10, this.y ? actionBarLayout.u1.d : 0);
                } else {
                    measureChildWithMargins(childAt2, i3, 0, i10, i11);
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
        if (this.E != z10) {
            this.E = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i3) {
        this.c = i3;
        invalidate();
    }

    public void setShouldHandleBottomInsets(m3 m3Var) {
        if (this.x != m3Var) {
            this.x = m3Var;
            this.y = m3Var != m3.a;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.F;
            if (actionBarLayout.t1 != null && getParent() == actionBarLayout) {
                actionBarLayout.o(this, actionBarLayout.t1);
            } else if (view != null) {
                WeakHashMap weakHashMap = r0.i0.a;
                r0.y.c(view);
            }
        }
    }
}
