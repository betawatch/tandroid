package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.w5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z1 extends View {
    public StaticLayout a;
    public final RectF b;
    public final Paint c;
    public final Paint d;
    public String e;
    public final TextPaint f;
    public int h;
    public boolean n;
    public final Drawable r;
    public final w5 s;

    public z1(Activity activity) {
        super(activity);
        this.b = new RectF();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.h = 4;
        this.n = false;
        this.s = new w5(this, 10);
        textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.b.o(-1, zs.F3));
        paint2.setColor(i0.b.o(-1, zs.n1));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.r = drawable;
        drawable.setBounds(0, 0, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
    }

    public final void a() {
        w5 w5Var = this.s;
        removeCallbacks(w5Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String g02 = org.telegram.messenger.i0.g0((int) (sharedInstance.getCallDuration() / 1000), true, false);
        String str = this.e;
        if (str == null || !str.equals(g02)) {
            this.e = g02;
            if (this.a == null) {
                requestLayout();
            }
            String str2 = this.e;
            TextPaint textPaint = this.f;
            this.a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(w5Var, 300L);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout = this.a;
        int i10 = 0;
        int L = staticLayout == null ? 0 : org.telegram.messenger.i0.L(21.0f) + staticLayout.getWidth();
        canvas.save();
        canvas.translate((getMeasuredWidth() - L) / 2.0f, 0.0f);
        canvas.save();
        if (this.n) {
            canvas.translate(-org.telegram.messenger.i0.L(7.0f), -org.telegram.messenger.i0.L(3.0f));
            this.r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - org.telegram.messenger.i0.L(11.0f)) / 2.0f);
            while (i10 < 4) {
                int i11 = i10 + 1;
                Paint paint = i11 > this.h ? this.d : this.c;
                float f7 = i10;
                float N = org.telegram.messenger.i0.N(4.16f) * f7;
                float N2 = org.telegram.messenger.i0.N(2.75f) * (3 - i10);
                float N3 = org.telegram.messenger.i0.N(2.75f) + (org.telegram.messenger.i0.N(4.16f) * f7);
                float L2 = org.telegram.messenger.i0.L(11.0f);
                RectF rectF = this.b;
                rectF.set(N, N2, N3, L2);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(0.7f), org.telegram.messenger.i0.N(0.7f), paint);
                i10 = i11;
            }
        }
        canvas.restore();
        if (staticLayout != null) {
            canvas.translate(org.telegram.messenger.i0.L(21.0f), 0.0f);
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(15.0f));
        }
    }

    public void setSignalBarCount(int i10) {
        this.h = i10;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (getVisibility() != i10) {
            if (i10 == 0) {
                this.e = "00:00";
                String str = this.e;
                TextPaint textPaint = this.f;
                this.a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.e = null;
                this.a = null;
            }
        }
        super.setVisibility(i10);
    }
}
