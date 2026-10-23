package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.tf1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class n8 extends FrameLayout {
    public final View a;
    public final EditTextBoldCursor b;
    public final View c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final w3 e;
    public final w3 f;
    public final Paint h;
    public final TextPaint n;
    public final RectF r;
    public ValueAnimator s;
    public float v;
    public float w;
    public boolean x;
    public boolean y;

    public n8(Context context, View view, org.telegram.ui.ActionBar.d6 d6Var, w3 w3Var, w3 w3Var2, w3 w3Var3) {
        super(context);
        this.h = new Paint(1);
        this.n = new TextPaint(1);
        this.r = new RectF();
        this.w = 1.0f;
        this.a = view;
        this.d = d6Var;
        this.e = w3Var;
        this.f = w3Var3;
        setWillNotDraw(false);
        addView(view, w7.z5.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, d6Var));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.WalletSearchGifts));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new l8(this, 0));
        editTextBoldCursor.addTextChangedListener(new m8(w3Var2));
        addView(editTextBoldCursor, w7.z5.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.c = view2;
        view2.setContentDescription(LocaleController.getString(R.string.Search));
        view2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.i6, d6Var), 1, -1));
        view2.setOnClickListener(new t2(this, 5));
        addView(view2, w7.z5.e(40, 40, 53));
    }

    public static float c(float f7, float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (f11 - f7) / (f10 - f7)));
        return com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (this.x) {
            this.y = true;
            EditTextBoldCursor editTextBoldCursor = this.b;
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
        }
    }

    public final void b(boolean z10) {
        if (this.x == z10) {
            return;
        }
        this.x = z10;
        this.y = false;
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setEnabled(z10);
        editTextBoldCursor.setVisibility(0);
        this.c.setContentDescription(LocaleController.getString(z10 ? R.string.Close : R.string.Search));
        if (!z10) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.e.run(Boolean.valueOf(z10));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, z10 ? 1.0f : 0.0f);
        this.s = ofFloat;
        ofFloat.setDuration(z10 ? 380L : 300L);
        this.s.setInterpolator(bs.h);
        this.a.setVisibility(0);
        this.s.addUpdateListener(new b3(this, 7));
        this.s.addListener(new tf1(this, 8));
        this.s.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            this.s = null;
            valueAnimator.cancel();
        }
        float f7 = this.x ? 1.0f : 0.0f;
        this.v = f7;
        this.f.run(Float.valueOf(f7));
        float f10 = this.x ? 0.0f : 1.0f;
        View view = this.a;
        view.setAlpha(f10);
        view.setScaleX(this.x ? 0.94f : 1.0f);
        view.setVisibility(this.x ? 4 : 0);
        float f11 = this.x ? 1.0f : 0.0f;
        EditTextBoldCursor editTextBoldCursor = this.b;
        editTextBoldCursor.setAlpha(f11);
        editTextBoldCursor.setTranslationX(0.0f);
        editTextBoldCursor.setVisibility(this.x ? 0 : 4);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        super.onDraw(canvas);
        float max = Math.max(this.w, this.v);
        if (max <= 0.0f) {
            return;
        }
        if (max < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), Math.round(max * 255.0f));
            float f7 = (max * 0.2f) + 0.8f;
            float dp = AndroidUtilities.dp(40.0f) / 2.0f;
            canvas2.scale(f7, f7, getWidth() - dp, dp);
        } else {
            canvas2 = canvas;
        }
        float dp2 = AndroidUtilities.dp(40.0f);
        float f10 = dp2 / 2.0f;
        float width = getWidth() - f10;
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.h;
        paint.setStyle(style);
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        org.telegram.ui.ActionBar.d6 d6Var = this.d;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        float width2 = (1.0f - this.v) * (getWidth() - dp2);
        float width3 = getWidth();
        RectF rectF = this.r;
        rectF.set(width2, 0.0f, width3, dp2);
        canvas2.drawRoundRect(rectF, f10, f10, paint);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        float c10 = c(0.08f, 0.85f, this.v);
        float f11 = 1.0f - c10;
        float dp3 = AndroidUtilities.dp(6.0f) * f11;
        if (dp3 > 0.3f) {
            canvas2.drawCircle(width - (AndroidUtilities.dp(1.5f) * f11), f10 - (AndroidUtilities.dp(1.5f) * f11), dp3, paint);
        }
        float dp4 = (AndroidUtilities.dp(2.6f) * f11) - (AndroidUtilities.dp(5.0f) * c10);
        float dp5 = (AndroidUtilities.dp(5.0f) * c10) + (AndroidUtilities.dp(6.5f) * f11);
        canvas2.drawLine(width + dp4, dp4 + f10, width + dp5, dp5 + f10, paint);
        float dp6 = AndroidUtilities.dp(5.0f) * c10;
        if (dp6 > 0.3f) {
            float f12 = width + dp6;
            float f13 = f10 - dp6;
            float f14 = width - dp6;
            float f15 = f10 + dp6;
            canvas3 = canvas;
            canvas3.drawLine(f12, f13, f14, f15, paint);
        } else {
            canvas3 = canvas;
        }
        paint.setAlpha(Math.round(c(0.3f, 0.9f, this.v) * 255.0f));
        float b10 = ((1.0f - this.v) * org.telegram.messenger.g0.b(80.0f, getWidth(), 0)) + AndroidUtilities.dp(22.0f);
        canvas3.drawCircle(b10 - AndroidUtilities.dp(1.0f), f10 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), paint);
        canvas3.drawLine(AndroidUtilities.dp(3.0f) + b10, AndroidUtilities.dp(3.0f) + f10, b10 + AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f) + f10, paint);
        paint.setAlpha(255);
        if (max < 1.0f) {
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float dp = AndroidUtilities.dp(14.0f);
        TextPaint textPaint = this.n;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        int dp2 = AndroidUtilities.dp(62.0f) + ((int) Math.ceil(textPaint.measureText(LocaleController.getString(R.string.WalletTransactions)))) + ((int) Math.ceil(textPaint.measureText(LocaleController.getString(R.string.WalletCollectibles))));
        int size = View.MeasureSpec.getSize(i10);
        int min = Math.min(dp2, Math.max(0, size - AndroidUtilities.dp(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - AndroidUtilities.dp(48.0f)) - min));
        super.onMeasure(i10, i11);
    }
}
