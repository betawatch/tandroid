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
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f4 extends FrameLayout {
    public final d4 a;
    public final e4 b;
    public final TextView[] c;
    public eh0 d;
    public final h4 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public f4(Context context, h4 h4Var) {
        super(context);
        this.c = new TextView[2];
        this.e = h4Var;
        d4 d4Var = new d4(0, context, this);
        this.a = d4Var;
        d4Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        addView(d4Var, ha.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        e4 e4Var = new e4(context, 0);
        this.b = e4Var;
        e4Var.setTextSize(14);
        e4Var.setTypeface(org.telegram.messenger.g0.o());
        e4Var.setMaxLines(1);
        e4Var.setEllipsizeByGradient(org.telegram.messenger.g0.L(4.0f));
        e4Var.setPivotX(0.0f);
        qs.i(e4Var);
        addView(e4Var, ha.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
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
        y6 y6Var;
        h4 h4Var = this.e;
        if ((h4Var == null || h4Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (h4Var == null || (y6Var = h4Var.b) == null || y6Var.I) {
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
            f11 = y6Var.h;
            if (!this.n) {
                this.n = true;
            }
            z10 = false;
        }
        eh0 eh0Var = this.d;
        d4 d4Var = this.a;
        if (eh0Var == null) {
            eh0 eh0Var2 = new eh0(d4Var);
            this.d = eh0Var2;
            eh0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = d4Var.getImageReceiver();
        float v = com.google.android.recaptcha.internal.a.v(1.0f, this.h, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
        this.d.f((int) (rectF.left - v), (int) (rectF.top - v), (int) (rectF.right + v), (int) (rectF.bottom + v));
        this.d.e(true, z10 ? 1.0f : Utilities.i(f11, 1.0f, 0.0f));
        if (this.r && z10 && this.d.f >= 0.9f) {
            this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.r) / 300.0f), 1.0f, 0.0f);
        }
        if (z9) {
            if (f10 != 1.0f) {
                Paint t6 = s7.t(imageReceiver, false);
                t6.setAlpha((int) (this.h * 255.0f));
                eh0 eh0Var3 = this.d;
                eh0Var3.t = t6;
                eh0Var3.a(canvas);
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
            eh0 eh0Var4 = this.d;
            eh0Var4.t = this.f;
            eh0Var4.a(canvas);
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
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.l6.h0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
