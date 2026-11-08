package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class e4 extends FrameLayout {
    public final c4 a;
    public final d4 b;
    public final TextView[] c;
    public dh0 d;
    public final g4 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public e4(Context context, g4 g4Var) {
        super(context);
        this.c = new TextView[2];
        this.e = g4Var;
        c4 c4Var = new c4(0, context, this);
        this.a = c4Var;
        c4Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        addView(c4Var, ha.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        d4 d4Var = new d4(context, 0);
        this.b = d4Var;
        d4Var.setTextSize(14);
        d4Var.setTypeface(org.telegram.messenger.g0.o());
        d4Var.setMaxLines(1);
        d4Var.setEllipsizeByGradient(org.telegram.messenger.g0.L(4.0f));
        d4Var.setPivotX(0.0f);
        qs.i(d4Var);
        addView(d4Var, ha.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            this.c[i7] = new TextView(context);
            this.c[i7].setTextSize(1, 12.0f);
            this.c[i7].setMaxLines(1);
            this.c[i7].setSingleLine(true);
            this.c[i7].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i7].setTextColor(-1);
            this.c[i7].setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.0f));
            addView(this.c[i7], ha.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z9) {
        boolean z10;
        float f11;
        x6 x6Var;
        g4 g4Var = this.e;
        if ((g4Var == null || g4Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (g4Var == null || (x6Var = g4Var.b) == null || x6Var.I) {
            if (this.n) {
                this.n = false;
                this.r = this.d.f < 0.2f;
            }
            if (!this.r) {
                this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.r) / 300.0f), 1.0f, 0.0f);
            }
            z10 = true;
            f11 = 1.0f;
        } else {
            this.h = 1.0f;
            f11 = x6Var.h;
            if (!this.n) {
                this.n = true;
            }
            z10 = false;
        }
        dh0 dh0Var = this.d;
        c4 c4Var = this.a;
        if (dh0Var == null) {
            dh0 dh0Var2 = new dh0(c4Var);
            this.d = dh0Var2;
            dh0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = c4Var.getImageReceiver();
        float v = com.google.android.recaptcha.internal.a.v(1.0f, this.h, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
        this.d.f((int) (rectF.left - v), (int) (rectF.top - v), (int) (rectF.right + v), (int) (rectF.bottom + v));
        this.d.e(true, z10 ? 1.0f : Utilities.i(f11, 1.0f, 0.0f));
        if (this.r && z10 && this.d.f >= 0.9f) {
            this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.r) / 300.0f), 1.0f, 0.0f);
        }
        if (z9) {
            if (f10 != 1.0f) {
                Paint t6 = r7.t(imageReceiver, false);
                t6.setAlpha((int) (this.h * 255.0f));
                dh0 dh0Var3 = this.d;
                dh0Var3.t = t6;
                dh0Var3.a(canvas);
            }
            if (this.f == null) {
                Paint paint = new Paint(1);
                this.f = paint;
                paint.setColor(-1);
                this.f.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                this.f.setStyle(Paint.Style.STROKE);
                this.f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f.setAlpha((int) (255.0f * f10 * this.h));
            dh0 dh0Var4 = this.d;
            dh0Var4.t = this.f;
            dh0Var4.a(canvas);
        }
    }

    public final void c(CharSequence charSequence, boolean z9) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        TextView[] textViewArr = this.c;
        if (!z9) {
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(1.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[1].setVisibility(8);
            textViewArr[1].setAlpha(0.0f);
            return;
        }
        textViewArr[1].setOnClickListener(null);
        textViewArr[1].setText(textViewArr[0].getText());
        textViewArr[1].setVisibility(0);
        textViewArr[1].setAlpha(1.0f);
        textViewArr[1].setTranslationY(0.0f);
        textViewArr[0].setText(charSequence);
        textViewArr[0].setVisibility(0);
        textViewArr[0].setAlpha(0.0f);
        textViewArr[0].setTranslationY(-org.telegram.messenger.g0.L(4.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 18));
        this.s.addListener(new bi.t5(this, 10));
        this.s.setInterpolator(xq.h);
        this.s.setDuration(340L);
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOnSubtitleClick(View.OnClickListener onClickListener) {
        TextView[] textViewArr = this.c;
        textViewArr[0].setOnClickListener(onClickListener);
        textViewArr[0].setClickable(onClickListener != null);
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.k6.h0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
