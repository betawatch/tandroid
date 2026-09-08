package bi;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class k5 extends FrameLayout {
    public final i5 a;
    public final j5 b;
    public final TextView[] c;
    public bj0 d;
    public final m5 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public k5(Context context, m5 m5Var) {
        super(context);
        this.c = new TextView[2];
        this.e = m5Var;
        i5 i5Var = new i5(this, context, 0);
        this.a = i5Var;
        i5Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(i5Var, w7.x5.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        j5 j5Var = new j5(context, 0);
        this.b = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setMaxLines(1);
        j5Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        j5Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(j5Var);
        addView(j5Var, w7.x5.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new TextView(context);
            this.c[i10].setTextSize(1, 12.0f);
            this.c[i10].setMaxLines(1);
            this.c[i10].setSingleLine(true);
            this.c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i10].setTextColor(-1);
            this.c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.c[i10], w7.x5.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        float f10;
        boolean z11;
        t8 t8Var;
        m5 m5Var = this.e;
        if ((m5Var == null || m5Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (m5Var == null || (t8Var = m5Var.b) == null || t8Var.I) {
            if (this.n) {
                this.n = false;
                this.r = this.d.f < 0.2f;
            }
            if (!this.r) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            f10 = 1.0f;
            z11 = true;
        } else {
            this.h = 1.0f;
            f10 = t8Var.h;
            if (!this.n) {
                this.n = true;
            }
            z11 = false;
        }
        bj0 bj0Var = this.d;
        i5 i5Var = this.a;
        if (bj0Var == null) {
            bj0 bj0Var2 = new bj0(i5Var);
            this.d = bj0Var2;
            bj0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = i5Var.getImageReceiver();
        float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        this.d.f((int) (rectF.left - b10), (int) (rectF.top - b10), (int) (rectF.right + b10), (int) (rectF.bottom + b10));
        this.d.e(z11 ? 1.0f : Utilities.clamp(f10, 1.0f, 0.0f), true);
        if (this.r && z11 && this.d.f >= 0.9f) {
            this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
        }
        if (z10) {
            if (f7 != 1.0f) {
                Paint t10 = p9.t(imageReceiver, false);
                t10.setAlpha((int) (this.h * 255.0f));
                bj0 bj0Var3 = this.d;
                bj0Var3.t = t10;
                bj0Var3.a(canvas);
            }
            if (this.f == null) {
                Paint paint = new Paint(1);
                this.f = paint;
                paint.setColor(-1);
                this.f.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.f.setStyle(Paint.Style.STROKE);
                this.f.setStrokeCap(Paint.Cap.ROUND);
            }
            this.f.setAlpha((int) (255.0f * f7 * this.h));
            bj0 bj0Var4 = this.d;
            bj0Var4.t = this.f;
            bj0Var4.a(canvas);
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        int i10 = 8;
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
        textViewArr[0].setTranslationY(-AndroidUtilities.dp(4.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ah.d0(this, 9));
        this.s.addListener(new ah.b(this, i10));
        this.s.setInterpolator(pr.h);
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
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.j6.f0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
