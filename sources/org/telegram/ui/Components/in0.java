package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class in0 extends ScrollView {
    public final org.telegram.ui.ActionBar.b6 a;
    public final LinearLayout b;
    public final float c;
    public final float[] d;
    public final float[] e;
    public final ArrayList f;
    public final ArrayList h;
    public final Path n;

    public in0(Context context, LinearLayout linearLayout, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.c = AndroidUtilities.dp(16.0f);
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new Path();
        this.a = b6Var;
        this.b = linearLayout;
        setWillNotDraw(false);
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(z10 ? 12.0f : 4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.d = new float[]{AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0.0f, 0.0f, 0.0f, 0.0f};
        this.e = new float[]{0.0f, 0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f)};
    }

    public static boolean e(View view) {
        return (Objects.equals(view.getTag(), -33024) || (view instanceof org.telegram.ui.Cells.b9) || (view instanceof org.telegram.ui.Cells.z6) || (view instanceof org.telegram.ui.i10)) ? false : true;
    }

    public final void a(Canvas canvas, View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewParent parent = view.getParent();
        float f10 = 0.0f;
        LinearLayout linearLayout = this.b;
        float f11 = (parent == linearLayout || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0.0f : ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (view2.getParent() != linearLayout && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            f10 = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(c(view) + linearLayout.getX(), Math.max(getScrollY() - AndroidUtilities.dp(16.0f), (d(view) + linearLayout.getY()) - f11), c(view) + linearLayout.getX() + view.getWidth(), Math.min(getScrollY() + AndroidUtilities.dp(16.0f) + getHeight(), d(view2) + linearLayout.getY() + view2.getHeight() + f10));
        if (rectF.bottom < rectF.top) {
            return;
        }
        wk0.N0(canvas, rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), view.getAlpha(), this.a);
    }

    public final void b(ViewGroup viewGroup, float f10, float f11) {
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof LinearLayout) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getOrientation() == 1) {
                        float x10 = childAt.getX() + f10;
                        LinearLayout linearLayout2 = this.b;
                        if (x10 <= linearLayout2.getPaddingLeft() && childAt.getX() + f10 + childAt.getWidth() >= linearLayout2.getWidth() - linearLayout2.getPaddingRight()) {
                            b(linearLayout, childAt.getX() + f10, childAt.getY() + f11);
                        }
                    }
                }
                this.h.add(childAt);
            }
        }
    }

    public final float c(View view) {
        if (view == this.b || !(view.getParent() instanceof View)) {
            return view.getX();
        }
        return view.getX() + c((View) view.getParent());
    }

    public final float d(View view) {
        if (view == this.b || !(view.getParent() instanceof View)) {
            return view.getY();
        }
        return view.getY() + d((View) view.getParent());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.h;
        arrayList.clear();
        b(this.b, 0.0f, 0.0f);
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            View view = null;
            View view2 = null;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                View view3 = (View) obj;
                if (!e(view3)) {
                    break;
                }
                if (view != null && Math.abs(view2.getAlpha() - view3.getAlpha()) > 0.1f) {
                    a(canvas, view, view2);
                    view = null;
                }
                if (view == null) {
                    view = view3;
                }
                view2 = view3;
            }
            a(canvas, view, view2);
            super.dispatchDraw(canvas);
            return;
            a(canvas, view, view2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            ((Runnable) obj).run();
        }
        invalidate();
        this.b.invalidate();
    }
}
