package ai;

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
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class a6 extends FrameLayout {
    public final y5 a;
    public final z5 b;
    public final TextView[] c;
    public mj0 d;
    public final c6 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public a6(Context context, c6 c6Var) {
        super(context);
        this.c = new TextView[2];
        this.e = c6Var;
        y5 y5Var = new y5(this, context, 0);
        this.a = y5Var;
        y5Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(y5Var, w7.y5.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        z5 z5Var = new z5(context, 0);
        this.b = z5Var;
        z5Var.setTextSize(14);
        z5Var.setTypeface(AndroidUtilities.bold());
        z5Var.setMaxLines(1);
        z5Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        z5Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(z5Var);
        addView(z5Var, w7.y5.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new TextView(context);
            this.c[i10].setTextSize(1, 12.0f);
            this.c[i10].setMaxLines(1);
            this.c[i10].setSingleLine(true);
            this.c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i10].setTextColor(-1);
            this.c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.c[i10], w7.y5.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        float f10;
        boolean z11;
        k9 k9Var;
        c6 c6Var = this.e;
        if ((c6Var == null || c6Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (c6Var == null || (k9Var = c6Var.b) == null || k9Var.I) {
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
            f10 = k9Var.h;
            if (!this.n) {
                this.n = true;
            }
            z11 = false;
        }
        mj0 mj0Var = this.d;
        y5 y5Var = this.a;
        if (mj0Var == null) {
            mj0 mj0Var2 = new mj0(y5Var);
            this.d = mj0Var2;
            mj0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = y5Var.getImageReceiver();
        float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        this.d.f((int) (rectF.left - b10), (int) (rectF.top - b10), (int) (rectF.right + b10), (int) (rectF.bottom + b10));
        this.d.e(z11 ? 1.0f : Utilities.clamp(f10, 1.0f, 0.0f), true);
        if (this.r && z11 && this.d.f >= 0.9f) {
            this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
        }
        if (z10) {
            if (f7 != 1.0f) {
                Paint t10 = ia.t(imageReceiver, false);
                t10.setAlpha((int) (this.h * 255.0f));
                mj0 mj0Var3 = this.d;
                mj0Var3.t = t10;
                mj0Var3.a(canvas);
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
            mj0 mj0Var4 = this.d;
            mj0Var4.t = this.f;
            mj0Var4.a(canvas);
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
        ofFloat.addUpdateListener(new a(this, i10));
        this.s.addListener(new b(this, 5));
        this.s.setInterpolator(rr.h);
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
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.h6.f0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
