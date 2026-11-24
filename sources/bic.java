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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bic extends View {
    public StaticLayout a;
    public final RectF b;
    public final Paint c;
    public final Paint d;
    public String e;
    public final TextPaint f;
    public int h;
    public boolean n;
    public final Drawable r;
    public final kbc s;

    public bic(Activity activity) {
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
        this.s = new kbc(this, (byte) 17);
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setColor(-1);
        paint.setColor(bm2.o(-1, 229));
        paint2.setColor(bm2.o(-1, kk7.m1));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.r = drawable;
        drawable.setBounds(0, 0, gl.L(24.0f), gl.L(24.0f));
    }

    public final void a() {
        kbc kbcVar = this.s;
        removeCallbacks(kbcVar);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String g0 = gl.g0((int) (sharedInstance.getCallDuration() / 1000), true, false);
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
        postDelayed(kbcVar, 300L);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout = this.a;
        int i = 0;
        int L = staticLayout == null ? 0 : gl.L(21.0f) + staticLayout.getWidth();
        canvas.save();
        canvas.translate((getMeasuredWidth() - L) / 2.0f, 0.0f);
        canvas.save();
        if (this.n) {
            canvas.translate(-gl.L(7.0f), -gl.L(3.0f));
            this.r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - gl.L(11.0f)) / 2.0f);
            while (i < 4) {
                int i2 = i + 1;
                Paint paint = i2 > this.h ? this.d : this.c;
                float f = i;
                float N = gl.N(4.16f) * f;
                float N2 = gl.N(2.75f) * (3 - i);
                float N3 = gl.N(2.75f) + (gl.N(4.16f) * f);
                float L2 = gl.L(11.0f);
                RectF rectF = this.b;
                rectF.set(N, N2, N3, L2);
                canvas.drawRoundRect(rectF, gl.N(0.7f), gl.N(0.7f), paint);
                i = i2;
            }
        }
        canvas.restore();
        if (staticLayout != null) {
            canvas.translate(gl.L(21.0f), 0.0f);
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
            setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(15.0f));
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
