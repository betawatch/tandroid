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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w extends FrameLayout {
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
    public Paint v;
    public a4 w;
    public boolean x;
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
        Paint l02 = j6.l0(i10);
        a4 a4Var = a4.c;
        if (paddingLeft <= 0 || this.w == a4Var) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, paddingLeft + 1, getHeight(), l02);
        }
        if (paddingRight > 0 && this.w != a4Var) {
            canvas2.drawRect(getWidth() - (paddingRight + 1), 0.0f, getWidth(), getHeight(), l02);
        }
        if (paddingBottom > 0) {
            if (this.w == a4.a || z10) {
                canvas2.drawRect(0.0f, getHeight() - (paddingBottom + 1), getWidth(), getHeight(), l02);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(this);
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
                if ((childAt instanceof k2) && childAt.getVisibility() == 0) {
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.E;
        if (actionBarLayout.M0) {
            super.dispatchDraw(canvas);
            return;
        }
        z3 z3Var = actionBarLayout.x;
        boolean z10 = false;
        int color = z3Var != null ? z3Var.getInternalNavbarPaint().getColor() : j6.w0(null, j6.a7, false);
        if (this == actionBarLayout.w) {
            org.telegram.ui.Components.e6 e6Var = actionBarLayout.b1;
            s sVar = actionBarLayout.G;
            if (sVar != null && sVar.hasSheet()) {
                z10 = true;
            }
            float e7 = e6Var.e(z10);
            if (e7 > 0.0f) {
                a(canvas, this.y, j6.l1(e7, color));
            }
        } else {
            n2 lastFragment = actionBarLayout.getLastFragment();
            if (lastFragment != null && !lastFragment.inPreviewMode) {
                if (this == actionBarLayout.s && this.w != a4.a) {
                    int childCount = getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        if (getChildAt(i10) instanceof k2) {
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                }
                a(canvas, z10, color);
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
                    FileLog.e(th2);
                }
            }
            if (super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        int i10;
        int i11;
        int i12;
        int i13;
        Drawable drawable;
        ArrayList<j2> arrayList;
        ActionBarLayout actionBarLayout = this.E;
        n2 n2Var = !actionBarLayout.O0.isEmpty() ? (n2) p6.g(1, actionBarLayout.O0) : null;
        s sVar = actionBarLayout.G;
        if (sVar != null && (arrayList = sVar.sheetsStack) != null && !arrayList.isEmpty()) {
            n2Var = actionBarLayout.G;
        }
        j2 lastSheet = n2Var != null ? n2Var.getLastSheet() : null;
        if (lastSheet != null && lastSheet.isFullyVisible() && lastSheet.getWindowView() != view) {
            return true;
        }
        if (view instanceof k) {
            return super.drawChild(canvas, view, j3);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt != view && (childAt instanceof k) && childAt.getVisibility() == 0) {
                k kVar = (k) childAt;
                if (kVar.getCastShadows() && kVar.getShadowAlpha() > 0) {
                    i11 = childAt.getMeasuredHeight();
                    i12 = (int) childAt.getY();
                    i10 = kVar.getShadowAlpha();
                }
            } else {
                i14++;
            }
        }
        i10 = 0;
        i11 = 0;
        i12 = 0;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (i11 != 0 && (drawable = ActionBarLayout.p1) != null) {
            int alpha = drawable.getAlpha();
            int i15 = i12 + i11;
            ActionBarLayout.p1.setBounds(0, i15, getMeasuredWidth(), ActionBarLayout.p1.getIntrinsicHeight() + i15);
            ActionBarLayout.p1.setAlpha(i10);
            ActionBarLayout.p1.draw(canvas);
            ActionBarLayout.p1.setAlpha(alpha);
        }
        if (this.y && this.x && n2Var != null && (i13 = AndroidUtilities.navigationBarHeight) >= AndroidUtilities.dp(32.0f)) {
            int i16 = (int) (i13 * 1.33f);
            int navigationBarColor = n2Var.getNavigationBarColor();
            if (i16 != this.h || this.n != navigationBarColor || this.v == null) {
                if (this.v == null) {
                    this.v = new Paint(1);
                }
                this.n = navigationBarColor;
                this.h = i16;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i16, new int[]{j6.l1(0.1f, navigationBarColor), j6.l1(1.0f, navigationBarColor)}, new float[]{0.0f, 0.88f}, Shader.TileMode.CLAMP);
                this.r = linearGradient;
                this.v.setShader(linearGradient);
            }
            Matrix matrix = this.s;
            matrix.reset();
            matrix.postTranslate(0.0f, getHeight() - i16);
            this.r.setLocalMatrix(matrix);
            canvas.drawRect(0.0f, getHeight() - i16, getWidth(), getHeight(), this.v);
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
            int i10 = j6.d6;
            int w02 = j6.w0(null, i10, false);
            int i11 = this.e;
            Paint paint = this.d;
            if (i11 != w02) {
                int w03 = j6.w0(null, i10, false);
                this.e = w03;
                paint.setColor(w03);
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
            if (childAt instanceof k) {
                i14 = childAt.getMeasuredHeight();
                childAt.layout(paddingLeft, 0, childAt.getMeasuredWidth() + paddingLeft, i14);
                break;
            }
            i15++;
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (!(childAt2 instanceof k)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
                if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows() || (childAt2 instanceof k2)) {
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
        this.b = ((rootView.getHeight() - (rect.top != 0 ? AndroidUtilities.statusBarHeight : 0)) - AndroidUtilities.getViewInset(rootView)) - (rect.bottom - rect.top) > 0;
        ActionBarLayout actionBarLayout = this.E;
        Runnable runnable = actionBarLayout.d;
        if (runnable == null || actionBarLayout.s.b || actionBarLayout.v.b) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(runnable);
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
        if (z11 != z10 && actionBarLayout.y() && (actionBarLayout.h || actionBarLayout.a0)) {
            Runnable runnable = actionBarLayout.e;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                actionBarLayout.e = null;
            }
            actionBarLayout.l(true, false);
        }
        this.f = z10;
        int childCount = getChildCount();
        getWindowVisibleDisplayFrame(this.a);
        o3 o3Var = actionBarLayout.E;
        if (o3Var != null) {
            o3Var.setCurrentAccount(UserConfig.selectedAccount);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                i12 = 0;
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt instanceof k) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, 0));
                i12 = childAt.getMeasuredHeight();
                break;
            }
            i13++;
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            if (!(childAt2 instanceof k)) {
                if (childAt2 instanceof k2) {
                    measureChildWithMargins(childAt2, i10, 0, i11, (actionBarLayout.v(false) > 0 || !this.x) ? 0 : actionBarLayout.n1.d);
                } else if (childAt2.getTag(R.id.sheet_attached_to_fragment_tag) != null || childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i10, 0, i11, this.x ? actionBarLayout.n1.d : 0);
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
        if (this.y != z10) {
            this.y = z10;
            invalidate();
        }
    }

    public void setFragmentPanTranslationOffset(int i10) {
        this.c = i10;
        invalidate();
    }

    public void setShouldHandleBottomInsets(a4 a4Var) {
        if (this.w != a4Var) {
            this.w = a4Var;
            this.x = a4Var != a4.a;
            View view = (View) getParent();
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c(view);
        }
    }
}
