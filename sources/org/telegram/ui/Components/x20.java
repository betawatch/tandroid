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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x20 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final org.telegram.ui.ActionBar.e6 a;
    public final u5 b;
    public final u5 c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public x20(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, b8.mf.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        final int i3 = 0;
        u5 u5Var = new u5(new Runnable(this) { // from class: org.telegram.ui.Components.w20
            public final /* synthetic */ x20 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        x20 x20Var = this.b;
                        x20Var.invalidate();
                        LinearLayout linearLayout2 = x20Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        break;
                    default:
                        x20 x20Var2 = this.b;
                        x20Var2.invalidate();
                        LinearLayout linearLayout3 = x20Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        break;
                }
            }
        });
        this.b = u5Var;
        u5Var.g = 180L;
        final int i10 = 1;
        u5 u5Var2 = new u5(new Runnable(this) { // from class: org.telegram.ui.Components.w20
            public final /* synthetic */ x20 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        x20 x20Var = this.b;
                        x20Var.invalidate();
                        LinearLayout linearLayout2 = x20Var.d;
                        linearLayout2.invalidate();
                        for (int i102 = 0; i102 < linearLayout2.getChildCount(); i102++) {
                            linearLayout2.getChildAt(i102).invalidate();
                        }
                        break;
                    default:
                        x20 x20Var2 = this.b;
                        x20Var2.invalidate();
                        LinearLayout linearLayout3 = x20Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        break;
                }
            }
        });
        this.c = u5Var2;
        u5Var2.g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i3, boolean z10) {
        this.n = i3;
        LinearLayout linearLayout = this.d;
        boolean z11 = !z10;
        this.b.e(z11, linearLayout.getChildAt(i3).getLeft());
        this.c.e(z11, linearLayout.getChildAt(i3).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.kr krVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i3);
            ai.x2 x2Var = new ai.x2(getContext(), 19);
            x2Var.setDrawingCacheEnabled(false);
            x2Var.setOnClickListener(new ai.h3(this, i3, krVar, 12));
            x2Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
            LinearLayout.LayoutParams o10 = b8.mf.o(-2, -2);
            if (i3 < arrayList.size() - 1) {
                o10.rightMargin = org.telegram.messenger.g0.L(4.0f);
            }
            x2Var.b = new ly0(charSequence, this.f);
            linearLayout.addView(x2Var, o10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float c2 = this.b.c();
        float c10 = this.c.c();
        float measuredHeight = getMeasuredHeight();
        RectF rectF = w;
        rectF.set(c2, 0.0f, c10, measuredHeight);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        int r12 = z10 ? org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var)) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var) & 520093695;
        Paint paint = this.e;
        paint.setColor(r12);
        canvas.drawPath(path, paint);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var);
        TextPaint textPaint = this.f;
        textPaint.setColor(w02);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y8, e6Var));
        canvas.save();
        canvas.clipPath(path);
        for (int i3 = 0; i3 < linearLayout.getChildCount(); i3++) {
            View childAt = linearLayout.getChildAt(i3);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        a(this.n, false);
    }

    public void setAccent(boolean z10) {
        this.h = z10;
    }
}
