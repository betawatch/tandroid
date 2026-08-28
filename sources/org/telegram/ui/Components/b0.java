package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b0 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 e;
    public final /* synthetic */ d0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f = d0Var;
        this.e = b6Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y5 y5Var = this.f.h;
        float d = y5Var == null ? 0.0f : y5Var.d(r0.f, false);
        double d9 = d;
        int floor = (int) Math.floor(d9);
        int ceil = (int) Math.ceil(d9);
        float f10 = d - floor;
        RectF rectF = this.a;
        if (floor >= 0 && floor < getChildCount()) {
            View childAt = getChildAt(floor);
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        }
        RectF rectF2 = this.b;
        if (ceil >= 0 && ceil < getChildCount()) {
            View childAt2 = getChildAt(ceil);
            rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
        }
        RectF rectF3 = this.c;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.e));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(r0.d), AndroidUtilities.dp(r0.d), paint);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt3 = getChildAt(i9);
            if (childAt3 instanceof c0) {
                ((c0) childAt3).a(Math.max(0.0f, 1.0f - Math.abs(i9 - d)), false);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z10 = getOrientation() == 0;
        int size = z10 ? View.MeasureSpec.getSize(i9) : View.MeasureSpec.getSize(i10);
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            childAt.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            childAt.measure(z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i9, !z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i10);
            int measuredWidth = z10 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
            i12 = Math.max(i12, measuredWidth);
            i11 += measuredWidth;
        }
        boolean z11 = i11 <= size && ((float) i12) < ((float) size) / ((float) getChildCount());
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt2 = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            childAt2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            if (z11) {
                if (z10) {
                    layoutParams.width = 0;
                } else {
                    layoutParams.height = 0;
                }
                layoutParams.weight = 1.0f;
            } else {
                if (z10) {
                    layoutParams.width = -2;
                } else {
                    layoutParams.height = -2;
                }
                layoutParams.weight = 0.0f;
            }
        }
        super.onMeasure(i9, i10);
    }
}
