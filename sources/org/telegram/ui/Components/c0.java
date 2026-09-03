package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c0 extends LinearLayout {
    public final RectF a;
    public final RectF b;
    public final RectF c;
    public final Paint d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 e;
    public final /* synthetic */ e0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = e0Var;
        this.e = f6Var;
        this.a = new RectF();
        this.b = new RectF();
        this.c = new RectF();
        this.d = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z5 z5Var = this.f.h;
        float d = z5Var == null ? 0.0f : z5Var.d(r0.f, false);
        double d10 = d;
        int floor = (int) Math.floor(d10);
        int ceil = (int) Math.ceil(d10);
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
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, this.e));
        Paint paint = this.d;
        paint.setColor(l1);
        canvas.drawRoundRect(rectF3, AndroidUtilities.dp(r0.d), AndroidUtilities.dp(r0.d), paint);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof d0) {
                ((d0) childAt3).a(Math.max(0.0f, 1.0f - Math.abs(i10 - d)), false);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4 = getOrientation() == 0;
        int size = z4 ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            childAt.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            childAt.measure(z4 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i10, !z4 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i11);
            int measuredWidth = z4 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
            i13 = Math.max(i13, measuredWidth);
            i12 += measuredWidth;
        }
        boolean z10 = i12 <= size && ((float) i13) < ((float) size) / ((float) getChildCount());
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt2 = getChildAt(i15);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
            childAt2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            if (z10) {
                if (z4) {
                    layoutParams.width = 0;
                } else {
                    layoutParams.height = 0;
                }
                layoutParams.weight = 1.0f;
            } else {
                if (z4) {
                    layoutParams.width = -2;
                } else {
                    layoutParams.height = -2;
                }
                layoutParams.weight = 0.0f;
            }
        }
        super.onMeasure(i10, i11);
    }
}
