// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bkc extends View {
    public StaticLayout a;
    public final RectF b;
    public final Paint c;
    public final Paint d;
    public String e;
    public final TextPaint f;
    public int h;
    public boolean n;
    public final Drawable r;
    public final f8c s;

    public bkc(Activity activity) {
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
        this.s = new f8c(this, (byte) 25);
        textPaint.setTextSize(gm.L(15.0f));
        textPaint.setColor(-1);
        paint.setColor(on2.p(-1, nm7.F3));
        paint2.setColor(on2.p(-1, nm7.m1));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.r = drawable;
        drawable.setBounds(0, 0, gm.L(24.0f), gm.L(24.0f));
    }

    public final void a() {
        f8c f8cVar = this.s;
        removeCallbacks(f8cVar);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String g0 = gm.g0((int) (sharedInstance.getCallDuration() / 1000), true, false);
        String str = this.e;
        if (str == null || !str.equals(g0)) {
            this.e = g0;
            if (this.a == null) {
                requestLayout();
            }
            String str2 = this.e;
            TextPaint textPaint = this.f;
            this.a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(f8cVar, 300L);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout = this.a;
        int i = 0;
        int L = staticLayout == null ? 0 : gm.L(21.0f) + staticLayout.getWidth();
        canvas.save();
        canvas.translate((getMeasuredWidth() - L) / 2.0f, 0.0f);
        canvas.save();
        if (this.n) {
            canvas.translate(-gm.L(7.0f), -gm.L(3.0f));
            this.r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - gm.L(11.0f)) / 2.0f);
            while (i < 4) {
                int i2 = i + 1;
                Paint paint = i2 > this.h ? this.d : this.c;
                float f = i;
                float N = gm.N(4.16f) * f;
                float N2 = gm.N(2.75f) * (3 - i);
                float N3 = gm.N(2.75f) + (gm.N(4.16f) * f);
                float L2 = gm.L(11.0f);
                RectF rectF = this.b;
                rectF.set(N, N2, N3, L2);
                canvas.drawRoundRect(rectF, gm.N(0.7f), gm.N(0.7f), paint);
                i = i2;
            }
        }
        canvas.restore();
        if (staticLayout != null) {
            canvas.translate(gm.L(21.0f), 0.0f);
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(15.0f));
        }
    }

    public void setSignalBarCount(int i) {
        this.h = i;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (getVisibility() != i) {
            if (i == 0) {
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
        super.setVisibility(i);
    }
}
