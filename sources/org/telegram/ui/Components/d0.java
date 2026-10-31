package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d0 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final Paint e;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 f;
    public final /* synthetic */ FrameLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = f0Var;
        this.f = p6Var;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                t5 t5Var = ((f0) this.h).h;
                float e = t5Var == null ? 0.0f : t5Var.e(false, r0.f);
                double d = e;
                int floor = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                float f7 = e - floor;
                RectF rectF = this.b;
                if (floor >= 0 && floor < getChildCount()) {
                    View childAt = getChildAt(floor);
                    rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                }
                RectF rectF2 = this.c;
                if (ceil >= 0 && ceil < getChildCount()) {
                    View childAt2 = getChildAt(ceil);
                    rectF2.set(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom());
                }
                RectF rectF3 = this.d;
                org.telegram.messenger.i0.Z1(rectF, rectF2, f7, rectF3);
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f));
                Paint paint = this.e;
                paint.setColor(r12);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.i0.L(r0.d), org.telegram.messenger.i0.L(r0.d), paint);
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt3 = getChildAt(i10);
                    if (childAt3 instanceof e0) {
                        ((e0) childAt3).a(false, Math.max(0.0f, 1.0f - Math.abs(i10 - e)));
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                org.telegram.ui.Wallet.v5 v5Var = (org.telegram.ui.Wallet.v5) this.h;
                float e7 = v5Var.f.e(false, v5Var.d);
                double d10 = e7;
                int floor2 = (int) Math.floor(d10);
                TextView[] textViewArr = v5Var.c;
                int j10 = Utilities.j(floor2, textViewArr.length, 0);
                int j11 = Utilities.j((int) Math.ceil(d10), textViewArr.length, 0);
                RectF rectF4 = this.b;
                if (j10 >= 0 && j10 < textViewArr.length) {
                    TextView textView = textViewArr[j10];
                    rectF4.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
                }
                RectF rectF5 = this.c;
                if (j11 >= 0 && j11 < textViewArr.length) {
                    TextView textView2 = textViewArr[j11];
                    rectF5.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
                }
                RectF rectF6 = this.d;
                org.telegram.messenger.i0.Z1(rectF4, rectF5, e7 - j10, rectF6);
                int r13 = org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.f));
                Paint paint2 = this.e;
                paint2.setColor(r13);
                canvas.drawRoundRect(rectF6, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f), paint2);
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                boolean z10 = getOrientation() == 0;
                int size = z10 ? View.MeasureSpec.getSize(i10) : View.MeasureSpec.getSize(i11);
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt = getChildAt(i14);
                    childAt.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                    childAt.measure(z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i10, !z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i11);
                    int measuredWidth = z10 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
                    i13 = Math.max(i13, measuredWidth);
                    i12 += measuredWidth;
                }
                boolean z11 = i12 <= size && ((float) i13) < ((float) size) / ((float) getChildCount());
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt2 = getChildAt(i15);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    childAt2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
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
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(org.telegram.ui.Wallet.v5 v5Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = v5Var;
        this.f = p6Var;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }
}
