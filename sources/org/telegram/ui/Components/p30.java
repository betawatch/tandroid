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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p30 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final org.telegram.ui.ActionBar.h6 a;
    public final d6 b;
    public final d6 c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public p30(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = h6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ma.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        final int i7 = 0;
        d6 d6Var = new d6(new Runnable(this) { // from class: org.telegram.ui.Components.o30
            public final /* synthetic */ p30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        p30 p30Var = this.b;
                        p30Var.invalidate();
                        LinearLayout linearLayout2 = p30Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        break;
                    default:
                        p30 p30Var2 = this.b;
                        p30Var2.invalidate();
                        LinearLayout linearLayout3 = p30Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        break;
                }
            }
        });
        this.b = d6Var;
        d6Var.g = 180L;
        final int i10 = 1;
        d6 d6Var2 = new d6(new Runnable(this) { // from class: org.telegram.ui.Components.o30
            public final /* synthetic */ p30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        p30 p30Var = this.b;
                        p30Var.invalidate();
                        LinearLayout linearLayout2 = p30Var.d;
                        linearLayout2.invalidate();
                        for (int i102 = 0; i102 < linearLayout2.getChildCount(); i102++) {
                            linearLayout2.getChildAt(i102).invalidate();
                        }
                        break;
                    default:
                        p30 p30Var2 = this.b;
                        p30Var2.invalidate();
                        LinearLayout linearLayout3 = p30Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        break;
                }
            }
        });
        this.c = d6Var2;
        d6Var2.g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i7, boolean z10) {
        this.n = i7;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.b.e(z11, linearLayout.getChildAt(i7).getLeft());
        this.c.e(z11, linearLayout.getChildAt(i7).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.or orVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i7);
            bi.m3 m3Var = new bi.m3(getContext(), 19);
            m3Var.setDrawingCacheEnabled(false);
            m3Var.setOnClickListener(new bi.h5(this, i7, orVar, 13));
            m3Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
            LinearLayout.LayoutParams o4 = c8.ma.o(-2, -2);
            if (i7 < arrayList.size() - 1) {
                o4.rightMargin = org.telegram.messenger.g0.L(4.0f);
            }
            m3Var.b = new xy0(charSequence, this.f);
            linearLayout.addView(m3Var, o4);
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
        float L = org.telegram.messenger.g0.L(13.0f);
        float L2 = org.telegram.messenger.g0.L(13.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, L, L2, direction);
        path.close();
        Path path2 = this.s;
        path2.rewind();
        LinearLayout linearLayout = this.d;
        path2.addRect(0.0f, 0.0f, linearLayout.getMeasuredWidth(), getMeasuredHeight(), direction);
        path2.addRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), Path.Direction.CCW);
        path2.close();
        boolean z10 = this.h;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        int r12 = z10 ? org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var)) : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var) & 520093695;
        Paint paint = this.e;
        paint.setColor(r12);
        canvas.drawPath(path, paint);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.y6, h6Var);
        TextPaint textPaint = this.f;
        textPaint.setColor(w02);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var) : org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Y8, h6Var));
        canvas.save();
        canvas.clipPath(path);
        for (int i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
            View childAt = linearLayout.getChildAt(i7);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        a(this.n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
