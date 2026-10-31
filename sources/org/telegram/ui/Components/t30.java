package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t30 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final org.telegram.ui.ActionBar.p6 a;
    public final t5 b;
    public final t5 c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public t30(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = p6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, w7.b6.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        final int i10 = 0;
        t5 t5Var = new t5(new Runnable(this) { // from class: org.telegram.ui.Components.s30
            public final /* synthetic */ t30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        t30 t30Var = this.b;
                        t30Var.invalidate();
                        LinearLayout linearLayout2 = t30Var.d;
                        linearLayout2.invalidate();
                        for (int i11 = 0; i11 < linearLayout2.getChildCount(); i11++) {
                            linearLayout2.getChildAt(i11).invalidate();
                        }
                        break;
                    default:
                        t30 t30Var2 = this.b;
                        t30Var2.invalidate();
                        LinearLayout linearLayout3 = t30Var2.d;
                        linearLayout3.invalidate();
                        for (int i12 = 0; i12 < linearLayout3.getChildCount(); i12++) {
                            linearLayout3.getChildAt(i12).invalidate();
                        }
                        break;
                }
            }
        });
        this.b = t5Var;
        t5Var.g = 180L;
        final int i11 = 1;
        t5 t5Var2 = new t5(new Runnable(this) { // from class: org.telegram.ui.Components.s30
            public final /* synthetic */ t30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        t30 t30Var = this.b;
                        t30Var.invalidate();
                        LinearLayout linearLayout2 = t30Var.d;
                        linearLayout2.invalidate();
                        for (int i112 = 0; i112 < linearLayout2.getChildCount(); i112++) {
                            linearLayout2.getChildAt(i112).invalidate();
                        }
                        break;
                    default:
                        t30 t30Var2 = this.b;
                        t30Var2.invalidate();
                        LinearLayout linearLayout3 = t30Var2.d;
                        linearLayout3.invalidate();
                        for (int i12 = 0; i12 < linearLayout3.getChildCount(); i12++) {
                            linearLayout3.getChildAt(i12).invalidate();
                        }
                        break;
                }
            }
        });
        this.c = t5Var2;
        t5Var2.g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i10, boolean z10) {
        this.n = i10;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.b.e(z11, linearLayout.getChildAt(i10).getLeft());
        this.c.e(z11, linearLayout.getChildAt(i10).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.bs bsVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i10);
            bi.t0 t0Var = new bi.t0(getContext());
            t0Var.setDrawingCacheEnabled(false);
            t0Var.setOnClickListener(new jg.w1(this, i10, bsVar, 10));
            t0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f));
            LinearLayout.LayoutParams o10 = w7.b6.o(-2, -2);
            if (i10 < arrayList.size() - 1) {
                o10.rightMargin = org.telegram.messenger.i0.L(4.0f);
            }
            t0Var.b = new qz0(charSequence, this.f);
            linearLayout.addView(t0Var, o10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float c10 = this.b.c();
        float c11 = this.c.c();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = w;
        rectF.set(c10, 0.0f, c11, measuredHeight);
        Path path = this.r;
        path.rewind();
        float L = org.telegram.messenger.i0.L(13.0f);
        float L2 = org.telegram.messenger.i0.L(13.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, L, L2, direction);
        path.close();
        Path path2 = this.s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        int r12 = z10 ? org.telegram.ui.ActionBar.t6.r1(0.1f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var)) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var) & 520093695;
        Paint paint = this.e;
        paint.setColor(r12);
        canvas.drawPath(path, paint);
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var);
        TextPaint textPaint = this.f;
        textPaint.setColor(w02);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var) : org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Y8, p6Var));
        canvas.save();
        canvas.clipPath(path);
        for (int i10 = 0; i10 < linearLayout.getChildCount(); i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (rectF.right >= childAt.getLeft() && rectF.left <= childAt.getRight()) {
                canvas.save();
                canvas.translate(childAt.getLeft(), childAt.getTop());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a(this.n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
