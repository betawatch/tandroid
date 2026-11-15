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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a0 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final Paint e;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 f;
    public final /* synthetic */ FrameLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = c0Var;
        this.f = e6Var;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                u5 u5Var = ((c0) this.h).h;
                float e10 = u5Var == null ? 0.0f : u5Var.e(false, r0.f);
                double d = e10;
                int floor = (int) Math.floor(d);
                int ceil = (int) Math.ceil(d);
                float f10 = e10 - floor;
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
                org.telegram.messenger.g0.Z1(rectF, rectF2, f10, rectF3);
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f));
                Paint paint = this.e;
                paint.setColor(r12);
                canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(r0.d), org.telegram.messenger.g0.L(r0.d), paint);
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt3 = getChildAt(i7);
                    if (childAt3 instanceof b0) {
                        ((b0) childAt3).a(false, Math.max(0.0f, 1.0f - Math.abs(i7 - e10)));
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                org.telegram.ui.Wallet.t5 t5Var = (org.telegram.ui.Wallet.t5) this.h;
                float e11 = t5Var.f.e(false, t5Var.d);
                double d2 = e11;
                int floor2 = (int) Math.floor(d2);
                TextView[] textViewArr = t5Var.c;
                int j3 = Utilities.j(floor2, textViewArr.length, 0);
                int j10 = Utilities.j((int) Math.ceil(d2), textViewArr.length, 0);
                RectF rectF4 = this.b;
                if (j3 >= 0 && j3 < textViewArr.length) {
                    TextView textView = textViewArr[j3];
                    rectF4.set(textView.getX(), textView.getY(), textView.getX() + textView.getWidth(), textView.getY() + textView.getHeight());
                }
                RectF rectF5 = this.c;
                if (j10 >= 0 && j10 < textViewArr.length) {
                    TextView textView2 = textViewArr[j10];
                    rectF5.set(textView2.getX(), textView2.getY(), textView2.getX() + textView2.getWidth(), textView2.getY() + textView2.getHeight());
                }
                RectF rectF6 = this.d;
                org.telegram.messenger.g0.Z1(rectF4, rectF5, e11 - j3, rectF6);
                int r13 = org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.f));
                Paint paint2 = this.e;
                paint2.setColor(r13);
                canvas.drawRoundRect(rectF6, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), paint2);
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                boolean z10 = getOrientation() == 0;
                int size = z10 ? View.MeasureSpec.getSize(i7) : View.MeasureSpec.getSize(i10);
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    childAt.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                    childAt.measure(z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i7, !z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i10);
                    int measuredWidth = z10 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
                    i12 = Math.max(i12, measuredWidth);
                    i11 += measuredWidth;
                }
                boolean z11 = i11 <= size && ((float) i12) < ((float) size) / ((float) getChildCount());
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt2 = getChildAt(i14);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    childAt2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
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
                super.onMeasure(i7, i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(org.telegram.ui.Wallet.t5 t5Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = t5Var;
        this.f = e6Var;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }
}
