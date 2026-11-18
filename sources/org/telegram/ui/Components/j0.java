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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j0 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final Paint e;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 f;
    public final /* synthetic */ FrameLayout h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = l0Var;
        this.f = i6Var;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float e10;
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.h;
                c6 c6Var = l0Var.s;
                float e11 = c6Var == null ? 1.0f : c6Var.e(false, l0Var.h >= 0 ? 1.0f : 0.0f);
                c6 c6Var2 = l0Var.n;
                if (c6Var2 == null) {
                    e10 = 0.0f;
                } else {
                    int i7 = l0Var.h;
                    if (i7 < 0) {
                        i7 = l0Var.r;
                    }
                    e10 = c6Var2.e(false, i7);
                }
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
                int r12 = org.telegram.ui.ActionBar.n6.r1(0.1f * e11, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f));
                Paint paint = this.e;
                paint.setColor(r12);
                if (e11 > 0.0f) {
                    canvas.drawRoundRect(rectF3, org.telegram.messenger.g0.L(l0Var.e), org.telegram.messenger.g0.L(l0Var.e), paint);
                }
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt3 = getChildAt(i10);
                    if (childAt3 instanceof k0) {
                        ((k0) childAt3).b(false, Math.max(0.0f, 1.0f - Math.abs(i10 - e10)) * e11);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                org.telegram.ui.Wallet.i6 i6Var = (org.telegram.ui.Wallet.i6) this.h;
                float e12 = i6Var.f.e(false, i6Var.d);
                double d2 = e12;
                int floor2 = (int) Math.floor(d2);
                TextView[] textViewArr = i6Var.c;
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
                org.telegram.messenger.g0.Z1(rectF4, rectF5, e12 - j3, rectF6);
                int r13 = org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f));
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
                    childAt.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
                    childAt.measure(z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i7, !z10 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i10);
                    int measuredWidth = z10 ? childAt.getMeasuredWidth() : childAt.getMeasuredHeight();
                    i12 = Math.max(i12, measuredWidth);
                    i11 += measuredWidth;
                }
                boolean z11 = i11 <= size && ((float) i12) < ((float) size) / ((float) getChildCount());
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt2 = getChildAt(i14);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                    childAt2.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
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
    public j0(org.telegram.ui.Wallet.i6 i6Var, Context context, org.telegram.ui.ActionBar.i6 i6Var2) {
        super(context);
        this.h = i6Var;
        this.f = i6Var2;
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Paint(1);
    }
}
