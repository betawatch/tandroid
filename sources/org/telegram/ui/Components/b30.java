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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b30 extends HorizontalScrollView {
    public static final RectF w = new RectF();
    public final org.telegram.ui.ActionBar.f6 a;
    public final w5 b;
    public final w5 c;
    public final LinearLayout d;
    public final Paint e;
    public final TextPaint f;
    public boolean h;
    public int n;
    public final Path r;
    public final Path s;

    public b30(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.r = new Path();
        this.s = new Path();
        this.a = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayerType(0, null);
        linearLayout.setOrientation(0);
        addView(linearLayout, c8.ha.x(-1, -1, 8388611));
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        final int i7 = 0;
        w5 w5Var = new w5(new Runnable(this) { // from class: org.telegram.ui.Components.a30
            public final /* synthetic */ b30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        b30 b30Var = this.b;
                        b30Var.invalidate();
                        LinearLayout linearLayout2 = b30Var.d;
                        linearLayout2.invalidate();
                        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
                            linearLayout2.getChildAt(i10).invalidate();
                        }
                        break;
                    default:
                        b30 b30Var2 = this.b;
                        b30Var2.invalidate();
                        LinearLayout linearLayout3 = b30Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        break;
                }
            }
        });
        this.b = w5Var;
        w5Var.g = 180L;
        final int i10 = 1;
        w5 w5Var2 = new w5(new Runnable(this) { // from class: org.telegram.ui.Components.a30
            public final /* synthetic */ b30 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        b30 b30Var = this.b;
                        b30Var.invalidate();
                        LinearLayout linearLayout2 = b30Var.d;
                        linearLayout2.invalidate();
                        for (int i102 = 0; i102 < linearLayout2.getChildCount(); i102++) {
                            linearLayout2.getChildAt(i102).invalidate();
                        }
                        break;
                    default:
                        b30 b30Var2 = this.b;
                        b30Var2.invalidate();
                        LinearLayout linearLayout3 = b30Var2.d;
                        linearLayout3.invalidate();
                        for (int i11 = 0; i11 < linearLayout3.getChildCount(); i11++) {
                            linearLayout3.getChildAt(i11).invalidate();
                        }
                        break;
                }
            }
        });
        this.c = w5Var2;
        w5Var2.g = 180L;
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
    }

    public final void a(int i7, boolean z9) {
        this.n = i7;
        LinearLayout linearLayout = this.d;
        boolean z10 = !z9;
        this.b.e(z10, linearLayout.getChildAt(i7).getLeft());
        this.c.e(z10, linearLayout.getChildAt(i7).getRight());
    }

    public final void b(ArrayList arrayList, org.telegram.messenger.sr srVar) {
        LinearLayout linearLayout = this.d;
        linearLayout.removeAllViews();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            CharSequence charSequence = (CharSequence) arrayList.get(i7);
            bi.ec ecVar = new bi.ec(getContext());
            ecVar.setDrawingCacheEnabled(false);
            ecVar.setOnClickListener(new bi.la(this, i7, srVar, 10));
            ecVar.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
            LinearLayout.LayoutParams o4 = c8.ha.o(-2, -2);
            if (i7 < arrayList.size() - 1) {
                o4.rightMargin = org.telegram.messenger.g0.L(4.0f);
            }
            ecVar.b = new ly0(charSequence, this.f);
            linearLayout.addView(ecVar, o4);
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
        boolean z9 = this.h;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int r12 = z9 ? org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var)) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, f6Var) & 520093695;
        Paint paint = this.e;
        paint.setColor(r12);
        canvas.drawPath(path, paint);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, f6Var);
        TextPaint textPaint = this.f;
        textPaint.setColor(w02);
        canvas.save();
        canvas.clipPath(path2);
        super.dispatchDraw(canvas);
        canvas.restore();
        textPaint.setColor(this.h ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var) : org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Y8, f6Var));
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a(this.n, false);
    }

    public void setAccent(boolean z9) {
        this.h = z9;
    }
}
