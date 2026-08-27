package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class m51 extends View {
    public org.telegram.ui.Cells.z A;
    public ValueAnimator B;
    public float C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public CharSequence H;
    public int I;
    public int a;
    public String b;
    public int c;
    public final TextPaint d;
    public final Paint e;
    public final RectF f;
    public int h;
    public int n;
    public Drawable r;
    public StaticLayout s;
    public Drawable v;
    public StaticLayout w;
    public int x;
    public final TextPaint y;

    public m51(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new Paint(1);
        this.f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.y = textPaint2;
        this.C = 1.0f;
        this.I = org.telegram.ui.ActionBar.g6.Ae;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
    }

    public final void a(String str, boolean z10) {
        if (this.H == str) {
            return;
        }
        this.H = str;
        this.D = z10;
        this.w = this.s;
        this.v = this.r;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.y;
        textPaint.setTypeface(bold);
        int i10 = 0;
        this.x = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
        this.r = null;
        this.s = new StaticLayout(str, textPaint, this.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(str);
        invalidate();
        if (this.w == null && this.v == null) {
            return;
        }
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.C = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        ofFloat.addUpdateListener(new l51(i10, this));
        this.B.setDuration(150L);
        this.B.start();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout = this.s;
        int v02 = org.telegram.ui.ActionBar.g6.v0(isEnabled() ? this.I : org.telegram.ui.ActionBar.g6.y6, getResourceProvider());
        int i10 = this.E;
        TextPaint textPaint = this.y;
        if (i10 != v02) {
            this.E = v02;
            textPaint.setColor(v02);
        }
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, getResourceProvider());
        int i11 = this.F;
        TextPaint textPaint2 = this.d;
        if (i11 != v03) {
            this.F = v03;
            textPaint2.setColor(v03);
        }
        int v04 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.tf, getResourceProvider());
        int i12 = this.G;
        Paint paint = this.e;
        if (i12 != v04) {
            this.G = v04;
            paint.setColor(v04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.n != org.telegram.ui.ActionBar.g6.v0(this.I, getResourceProvider()) || this.A == null) {
                int dp = AndroidUtilities.dp(60.0f);
                int v05 = org.telegram.ui.ActionBar.g6.v0(this.I, getResourceProvider());
                this.n = v05;
                org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(dp, 0, i0.b.k(v05, 26));
                this.A = h02;
                h02.setCallback(this);
            }
            int dp2 = getLeft() + measuredWidth2 <= 0 ? measuredWidth2 - AndroidUtilities.dp(20.0f) : measuredWidth2;
            int i13 = measuredWidth2 + measuredWidth;
            if (i13 > ((View) getParent()).getMeasuredWidth()) {
                i13 += AndroidUtilities.dp(20.0f);
            }
            int i14 = measuredWidth / 2;
            this.A.setBounds(dp2, (getMeasuredHeight() / 2) - i14, i13, (getMeasuredHeight() / 2) + i14);
            this.A.draw(canvas);
        }
        if (this.s != null) {
            canvas.save();
            if (this.C == 1.0f || this.w == null) {
                f10 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.x) / 2) - (this.h / 2);
                canvas.translate(measuredWidth3 + (this.r != null ? AndroidUtilities.dp(3.0f) + (r5.getIntrinsicWidth() / 2) : 0), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                Drawable drawable = this.r;
                if (drawable != null) {
                    drawable.setBounds((-drawable.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.s.getHeight() - this.r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.r.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.r.setAlpha(255);
                    this.r.draw(canvas);
                }
                this.s.draw(canvas);
            } else {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.w.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                canvas.translate(this.v != null ? AndroidUtilities.dp(3.0f) + (r11.getIntrinsicWidth() / 2) : 0, (this.D ? -1.0f : 1.0f) * AndroidUtilities.dp(18.0f) * this.C);
                Drawable drawable2 = this.v;
                if (drawable2 != null) {
                    f10 = 6.0f;
                    f11 = 3.0f;
                    f12 = 1.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.s.getHeight() - this.v.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + ((this.v.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.v.setAlpha((int) ((1.0f - this.C) * alpha));
                    this.v.draw(canvas);
                } else {
                    f10 = 6.0f;
                    f11 = 3.0f;
                    f12 = 1.0f;
                }
                float f13 = alpha;
                textPaint.setAlpha((int) ((f12 - this.C) * f13));
                this.w.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.x) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                canvas.translate(this.r != null ? AndroidUtilities.dp(f11) + (r9.getIntrinsicWidth() / 2) : 0, (f12 - this.C) * (this.D ? 1.0f : -1.0f) * AndroidUtilities.dp(18.0f));
                Drawable drawable3 = this.r;
                if (drawable3 != null) {
                    drawable3.setBounds((-drawable3.getIntrinsicWidth()) - AndroidUtilities.dp(f10), AndroidUtilities.dp(f12) + ((this.s.getHeight() - this.r.getIntrinsicHeight()) / 2), -AndroidUtilities.dp(f10), AndroidUtilities.dp(f12) + ((this.r.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.r.setAlpha((int) (this.C * f13));
                    this.r.draw(canvas);
                }
                textPaint.setAlpha((int) (f13 * this.C));
                this.s.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            canvas.restore();
        } else {
            f10 = 6.0f;
        }
        if (this.b == null || staticLayout == null) {
            return;
        }
        int ceil = (int) Math.ceil(staticLayout.getLineWidth(0));
        int dp3 = AndroidUtilities.dp(f10) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
        float f14 = dp3;
        float measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(10.0f);
        float f15 = dp3 + this.h;
        float dp4 = AndroidUtilities.dp(10.0f) + (getMeasuredHeight() / 2);
        RectF rectF = this.f;
        rectF.set(f14, measuredHeight, f15, dp4);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
        canvas.drawText(this.b, rectF.centerX() - (this.c / 2.0f), rectF.top + AndroidUtilities.dp(14.5f), textPaint2);
    }

    public void setCounter(int i10) {
        if (this.a != i10) {
            this.a = i10;
            if (i10 == 0) {
                this.b = null;
                this.h = 0;
            } else {
                this.b = AndroidUtilities.formatWholeNumber(i10, 0);
                this.c = (int) Math.ceil(this.d.measureText(r3));
                int max = Math.max(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f) + this.c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.y;
        textPaint.setTypeface(bold);
        this.x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.r = null;
        this.s = new StaticLayout(charSequence, textPaint, this.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i10) {
        this.I = i10;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.y;
        textPaint.setTypeface(null);
        this.x = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.r = null;
        this.s = new StaticLayout(charSequence, textPaint, this.x + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        org.telegram.ui.Cells.z zVar = this.A;
        return zVar != null ? zVar == drawable || super.verifyDrawable(drawable) : super.verifyDrawable(drawable);
    }
}
