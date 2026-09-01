package oh;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class b4 extends FrameLayout {
    public final a4 a;
    public final jg.c b;
    public final TextView[] c;
    public mj0 d;
    public final d4 e;
    public Paint f;
    public float h;
    public boolean n;
    public boolean r;
    public ValueAnimator s;

    public b4(Context context, d4 d4Var) {
        super(context);
        this.c = new TextView[2];
        this.e = d4Var;
        a4 a4Var = new a4(this, context, 0);
        this.a = a4Var;
        a4Var.setRoundRadius(AndroidUtilities.dp(16.0f));
        addView(a4Var, k7.c6.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        jg.c cVar = new jg.c(context, 1);
        this.b = cVar;
        cVar.setTextSize(14);
        cVar.setTypeface(AndroidUtilities.bold());
        cVar.setMaxLines(1);
        cVar.setEllipsizeByGradient(AndroidUtilities.dp(4.0f));
        cVar.setPivotX(0.0f);
        NotificationCenter.listenEmojiLoading(cVar);
        addView(cVar, k7.c6.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.c[i10] = new TextView(context);
            this.c[i10].setTextSize(1, 12.0f);
            this.c[i10].setMaxLines(1);
            this.c[i10].setSingleLine(true);
            this.c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.c[i10].setTextColor(-1);
            this.c[i10].setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            addView(this.c[i10], k7.c6.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.b.setTextColor(-1);
    }

    public final void b(float f10, Canvas canvas, RectF rectF, boolean z4) {
        float f11;
        boolean z10;
        s6 s6Var;
        d4 d4Var = this.e;
        if ((d4Var == null || d4Var.b == null) && this.h == 0.0f) {
            return;
        }
        if (d4Var == null || (s6Var = d4Var.b) == null || s6Var.F) {
            if (this.n) {
                this.n = false;
                this.r = this.d.f < 0.2f;
            }
            if (!this.r) {
                this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
            }
            f11 = 1.0f;
            z10 = true;
        } else {
            this.h = 1.0f;
            f11 = s6Var.h;
            if (!this.n) {
                this.n = true;
            }
            z10 = false;
        }
        mj0 mj0Var = this.d;
        a4 a4Var = this.a;
        if (mj0Var == null) {
            mj0 mj0Var2 = new mj0(a4Var);
            this.d = mj0Var2;
            mj0Var2.d(null, true, false);
        }
        this.d.q = 0;
        ImageReceiver imageReceiver = a4Var.getImageReceiver();
        float c3 = yh.c(1.0f, this.h, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
        this.d.f((int) (rectF.left - c3), (int) (rectF.top - c3), (int) (rectF.right + c3), (int) (rectF.bottom + c3));
        this.d.e(z10 ? 1.0f : Utilities.clamp(f11, 1.0f, 0.0f), true);
        if (this.r && z10 && this.d.f >= 0.9f) {
            this.h = Utilities.clamp(this.h - ((1000.0f / AndroidUtilities.screenRefreshRate) / 300.0f), 1.0f, 0.0f);
        }
        if (z4) {
            if (f10 != 1.0f) {
                Paint t6 = m7.t(imageReceiver, false);
                t6.setAlpha((int) (this.h * 255.0f));
                mj0 mj0Var3 = this.d;
                mj0Var3.t = t6;
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
            this.f.setAlpha((int) (255.0f * f10 * this.h));
            mj0 mj0Var4 = this.d;
            mj0Var4.t = this.f;
            mj0Var4.a(canvas);
        }
    }

    public final void c(CharSequence charSequence, boolean z4) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.s = null;
        }
        TextView[] textViewArr = this.c;
        if (!z4) {
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
        ofFloat.addUpdateListener(new eg.m1(this, 27));
        this.s.addListener(new dg.l0(this, 20));
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
        textViewArr[0].setBackground(onClickListener == null ? null : org.telegram.ui.ActionBar.k6.f0(822083583, 7, -1));
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
