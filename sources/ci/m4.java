package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class m4 extends FrameLayout {
    public final k4 a;
    public final l4 b;
    public final TextView[] c;
    public yj0 d;
    public final o4 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public m4(Context context, o4 o4Var) {
        super(context);
        this.c = new TextView[2];
        this.e = o4Var;
        k4 k4Var = new k4(this, context, 0);
        this.a = k4Var;
        k4Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(k4Var, w7.z5.a(32.0f, 12.0f, 2.0f, 0.0f, 0.0f, 32, 0));
        setClipChildren(false);
        l4 l4Var = new l4(context, 0);
        this.b = l4Var;
        l4Var.setTextSize(14);
        l4Var.setTypeface(AndroidUtilities.bold());
        l4Var.setMaxLines(1);
        l4Var.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        l4Var.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(l4Var);
        addView(l4Var, w7.z5.a(-2.0f, 54.0f, 0.0f, 86.0f, 0.0f, -2, 0));
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new TextView(context);
            this.c[i10].setTextSize(1, 12.0f);
            this.c[i10].setMaxLines(1);
            this.c[i10].setSingleLine(true);
            this.c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i10].setTextColor(-1);
            this.c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.c[i10], w7.z5.a(-2.0f, 51.0f, 18.0f, 83.0f, 0.0f, -2, 0));
        }
        this.b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f10;
        h7 h7Var;
        o4 o4Var = this.e;
        if ((o4Var == null || o4Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (o4Var == null || (h7Var = o4Var.b) == null || h7Var.I) {
            if (this.n) {
                this.n = false;
                this.r = this.d.f < 0.2f;
            }
            if (!this.r) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            z11 = true;
            f10 = 1.0f;
        } else {
            this.h = 1.0f;
            f10 = h7Var.h;
            if (!this.n) {
                this.n = true;
            }
            z11 = false;
        }
        yj0 yj0Var = this.d;
        k4 k4Var = this.a;
        if (yj0Var == null) {
            yj0 yj0Var2 = new yj0(k4Var);
            this.d = yj0Var2;
            yj0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = k4Var.getImageReceiver();
        float D = com.google.android.gms.internal.cast.a6.D(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        this.d.f((int) (rectF.left - D), (int) (rectF.top - D), (int) (rectF.right + D), (int) (rectF.bottom + D));
        this.d.e(z11 ? 1.0f : Utilities.clamp(f10, 1.0f, 0.0f), true);
        if (this.r && z11 && this.d.f >= 0.9f) {
            this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
        }
        if (z10) {
            if (f7 != 1.0f) {
                Paint t10 = d8.t(imageReceiver, false);
                t10.setAlpha((int) (this.h * 255.0f));
                yj0 yj0Var3 = this.d;
                yj0Var3.t = t10;
                yj0Var3.a(canvas);
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
            yj0 yj0Var4 = this.d;
            yj0Var4.t = this.f;
            yj0Var4.a(canvas);
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
        textViewArr[0].setTranslationY(-AndroidUtilities.dp(4.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 16));
        this.s.addListener(new ah.b(this, 10));
        this.s.setInterpolator(bs.h);
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
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.h6.g0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
