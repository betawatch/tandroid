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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b extends FrameLayout {
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
    public jt3 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.F = actionBarLayout;
        this.a = new Rect();
        this.d = new Paint();
        this.s = new Matrix();
        setWillNotDraw(false);
    }

    public final void a(Canvas canvas, boolean z, int i) {
        Canvas canvas2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        Paint l0 = aob.l0(i);
        jt3 jt3Var = jt3.c;
        if (paddingLeft <= 0 || this.x == jt3Var) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), l0);
        }
        if (paddingRight > 0 && this.x != jt3Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), l0);
        }
        if (paddingBottom > 0) {
            if (this.x == jt3.a || z) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), l0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.t1 != null && getParent() == actionBarLayout) {
            actionBarLayout.m(this, actionBarLayout.t1);
        } else {
            WeakHashMap weakHashMap = ihc.a;
            ygc.c(this);
        }
    }

    public final void b() {
        try {
            int childCount = getChildCount();
            int i = childCount - 1;
            while (true) {
                if (i < 0) {
                    i = -1;
                    break;
                }
                View childAt = getChildAt(i);
                if ((childAt instanceof sw) && childAt.getVisibility() == 0) {
                    break;
                } else {
                    i--;
                }
            }
            int i2 = 0;
            while (i2 < childCount) {
                View childAt2 = getChildAt(i2);
                if (childAt2 != null) {
                    int i3 = (i == -1 || i2 == i) ? 0 : 4;
                    if (childAt2.getImportantForAccessibility() != i3) {
                        childAt2.setImportantForAccessibility(i3);
                    }
                }
                i2++;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        mq5 mq5Var;
        ActionBarLayout actionBarLayout = this.F;
        if (actionBarLayout.T0) {
            super.dispatchDraw(canvas);
            return;
        }
        dr3 dr3Var = actionBarLayout.y;
        boolean z = false;
        int color = dr3Var != null ? dr3Var.getInternalNavbarPaint().getColor() : aob.w0(null, aob.a7, false);
        boolean z2 = true;
        if (this == actionBarLayout.x) {
            mm mmVar = actionBarLayout.i1;
            l6 l6Var = actionBarLayout.H;
            if (l6Var != null && l6Var.hasSheet()) {
                z = true;
            }
            float d = mmVar.d(z);
            if (d > 0.0f) {
                a(canvas, this.E, aob.p1(d, color));
            }
        } else {
            e lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.s && this.x != jt3.a) {
                    int childCount = getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        if (getChildAt(i) instanceof sw) {
                            break;
                        }
                    }
                }
                z2 = false;
                a(canvas, z2, color);
                if (z2 && this.y && actionBarLayout.u(false) <= 0 && (mq5Var = actionBarLayout.u1) != null && mq5Var.d > 0) {
                    super.dispatchDraw(canvas);
                    canvas.drawRect(0.0f, getHeight() - actionBarLayout.u1.d, getWidth(), getHeight(), aob.l0(color));
                    return;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (r6 != r0.s) goto L18;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        ActionBarLayout actionBarLayout = this.F;
        boolean z = actionBarLayout.h && actionBarLayout.K == null;
        if ((!z && !actionBarLayout.b0) || (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5)) {
            if (z) {
                try {
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            if (super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable;
        ArrayList<ag0> arrayList;
        ActionBarLayout actionBarLayout = this.F;
        e eVar = !actionBarLayout.V0.isEmpty() ? (e) bp1.m(1, actionBarLayout.V0) : null;
        l6 l6Var = actionBarLayout.H;
        if (l6Var != null && (arrayList = l6Var.sheetsStack) != null && !arrayList.isEmpty()) {
            eVar = actionBarLayout.H;
        }
        ag0 lastSheet = eVar != null ? eVar.getLastSheet() : null;
        if (lastSheet != null && lastSheet.h() && lastSheet.d() != view) {
            return true;
        }
        if (view instanceof a) {
            return super.drawChild(canvas, view, j);
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt != view && (childAt instanceof a) && childAt.getVisibility() == 0) {
                a aVar = (a) childAt;
                if (aVar.getCastShadows() && aVar.getShadowAlpha() > 0) {
                    i2 = childAt.getMeasuredHeight();
                    i3 = (int) childAt.getY();
                    i = aVar.getShadowAlpha();
                }
            } else {
                i5++;
            }
        }
        i = 0;
        i2 = 0;
        i3 = 0;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i2 != 0 && (drawable = ActionBarLayout.w1) != null) {
            int alpha = drawable.getAlpha();
            int i6 = i3 + i2;
            ActionBarLayout.w1.setBounds(0, i6, getMeasuredWidth(), ActionBarLayout.w1.getIntrinsicHeight() + i6);
            ActionBarLayout.w1.setAlpha(i);
            ActionBarLayout.w1.draw(canvas);
            ActionBarLayout.w1.setAlpha(alpha);
        }
        if (!actionBarLayout.T0 && this.E && this.y && eVar != null && eVar.getListViewForSimpleGlass() == null && (i4 = hl.n) >= hl.L(32.0f)) {
            int i7 = (int) (i4 * 1.33f);
            int navigationBarColor = eVar.getNavigationBarColor();
            if (i7 != this.h || this.n != navigationBarColor || this.w == null) {
                if (this.w == null) {
                    this.w = new Paint(1);
                }
                this.n = navigationBarColor;
                this.h = i7;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i7, new int[]{aob.p1(0.1f, navigationBarColor), aob.p1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.r = linearGradient;
                this.w.setShader(linearGradient);
            }
            Matrix matrix = this.s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i7);
            this.r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i7, getWidth(), getHeight(), this.w);
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
            int i = aob.d6;
            int w0 = aob.w0(null, i, false);
            int i2 = this.e;
            Paint paint = this.d;
            if (i2 != w0) {
                int w02 = aob.w0(null, i, false);
                this.e = w02;
                paint.setColor(w02);
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, (getMeasuredHeight() - this.c) - 3, getMeasuredWidth(), getMeasuredHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                i5 = 0;
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt instanceof a) {
                i5 = childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i5);
                break;
            }
            i6++;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = getChildAt(i7);
            if (!(childAt2 instanceof a)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows() || (childAt2 instanceof sw)) {
                    int i8 = layoutParams.leftMargin + paddingLeft;
                    childAt2.layout(i8, layoutParams.topMargin, childAt2.getMeasuredWidth() + i8, childAt2.getMeasuredHeight() + layoutParams.topMargin);
                } else {
                    int i9 = layoutParams.leftMargin + paddingLeft;
                    childAt2.layout(i9, layoutParams.topMargin + i5, childAt2.getMeasuredWidth() + i9, childAt2.getMeasuredHeight() + layoutParams.topMargin + i5);
                }
            }
        }
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        this.b = ((rootView.getHeight() - (rect.top != 0 ? hl.m : 0)) - hl.o1(rootView)) - (rect.bottom - rect.top) > 0;
        ActionBarLayout actionBarLayout = this.F;
        Runnable runnable = actionBarLayout.d;
        if (runnable == null || actionBarLayout.s.b || actionBarLayout.w.b) {
            return;
        }
        hl.r(runnable);
        actionBarLayout.d.run();
        actionBarLayout.d = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        boolean z = size2 > size;
        boolean z2 = this.f;
        ActionBarLayout actionBarLayout = this.F;
        if (z2 != z && actionBarLayout.w()) {
            actionBarLayout.t();
        }
        this.f = z;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.a);
        yx0 yx0Var = actionBarLayout.F;
        if (yx0Var != null) {
            yx0Var.setCurrentAccount(yac.t0);
        }
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                i3 = 0;
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt instanceof a) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                i3 = childAt.getMeasuredHeight();
                break;
            }
            i4++;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            if (!(childAt2 instanceof a)) {
                if (childAt2 instanceof sw) {
                    measureChildWithMargins(childAt2, i, 0, i2, (actionBarLayout.u(false) > 0 || !this.y) ? 0 : actionBarLayout.u1.d);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i, 0, i2, this.y ? actionBarLayout.u1.d : 0);
                } else {
                    measureChildWithMargins(childAt2, i, 0, i2, i3);
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

    public void setDrawNavigationBar(boolean z) {
        if (this.E != z) {
            this.E = z;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i) {
        this.c = i;
        invalidate();
    }

    public void setShouldHandleBottomInsets(jt3 jt3Var) {
        if (this.x != jt3Var) {
            this.x = jt3Var;
            this.y = jt3Var != jt3.a;
            View view = (View) getParent();
            ActionBarLayout actionBarLayout = this.F;
            if (actionBarLayout.t1 != null && getParent() == actionBarLayout) {
                actionBarLayout.m(this, actionBarLayout.t1);
            } else if (view != null) {
                WeakHashMap weakHashMap = ihc.a;
                ygc.c(view);
            }
        }
    }
}
