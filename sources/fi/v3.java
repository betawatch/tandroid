package fi;

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
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qh0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class v3 extends FrameLayout {
    public final t3 a;
    public final u3 b;
    public final TextView[] c;
    public qh0 d;
    public final x3 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public v3(Context context, x3 x3Var) {
        super(context);
        this.c = new TextView[2];
        this.e = x3Var;
        t3 t3Var = new t3(0, context, this);
        this.a = t3Var;
        t3Var.setRoundRadius(org.telegram.messenger.g0.L(16.0f));
        addView(t3Var, ma.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        u3 u3Var = new u3(context, 0);
        this.b = u3Var;
        u3Var.setTextSize(14);
        u3Var.setTypeface(org.telegram.messenger.g0.o());
        u3Var.setMaxLines(1);
        u3Var.setEllipsizeByGradient(org.telegram.messenger.g0.L(4.0f));
        u3Var.setPivotX(0.0f);
        ks.i(u3Var);
        addView(u3Var, ma.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            this.c[i7] = new TextView(context);
            this.c[i7].setTextSize(1, 12.0f);
            this.c[i7].setMaxLines(1);
            this.c[i7].setSingleLine(true);
            this.c[i7].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i7].setTextColor(-1);
            this.c[i7].setPadding(org.telegram.messenger.g0.L(3.0f), 0, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(1.0f));
            addView(this.c[i7], ma.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f11;
        o6 o6Var;
        x3 x3Var = this.e;
        if ((x3Var == null || x3Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (x3Var == null || (o6Var = x3Var.b) == null || o6Var.J) {
            if (this.n) {
                this.n = false;
                this.r = this.d.f < 0.2f;
            }
            if (!this.r) {
                this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.r) / 300.0f), 1.0f, 0.0f);
            }
            z11 = true;
            f11 = 1.0f;
        } else {
            this.h = 1.0f;
            f11 = o6Var.h;
            if (!this.n) {
                this.n = true;
            }
            z11 = false;
        }
        qh0 qh0Var = this.d;
        t3 t3Var = this.a;
        if (qh0Var == null) {
            qh0 qh0Var2 = new qh0(t3Var);
            this.d = qh0Var2;
            qh0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = t3Var.getImageReceiver();
        float t6 = com.google.android.gms.internal.vision.e2.t(1.0f, this.h, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(3.0f));
        this.d.f((int) (rectF.left - t6), (int) (rectF.top - t6), (int) (rectF.right + t6), (int) (rectF.bottom + t6));
        this.d.e(true, z11 ? 1.0f : Utilities.i(f11, 1.0f, 0.0f));
        if (this.r && z11 && this.d.f >= 0.9f) {
            this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.g0.r) / 300.0f), 1.0f, 0.0f);
        }
        if (z10) {
            if (f10 != 1.0f) {
                Paint t10 = i7.t(imageReceiver, false);
                t10.setAlpha((int) (this.h * 255.0f));
                qh0 qh0Var3 = this.d;
                qh0Var3.t = t10;
                qh0Var3.a(canvas);
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
            qh0 qh0Var4 = this.d;
            qh0Var4.t = this.f;
            qh0Var4.a(canvas);
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        TextView[] textViewArr = this.c;
        if (!z10) {
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
        ofFloat.addUpdateListener(new ah.g(this, 19));
        this.s.addListener(new ai.j0(this, 12));
        this.s.setInterpolator(lr.h);
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
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.n6.h0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
