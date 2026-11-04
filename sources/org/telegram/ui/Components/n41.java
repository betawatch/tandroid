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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class n41 extends View {
    public final TextPaint E;
    public org.telegram.ui.Cells.y F;
    public ValueAnimator G;
    public float H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public CharSequence M;
    public int N;
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
    public Drawable w;
    public StaticLayout x;
    public int y;

    public n41(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.e = new Paint(1);
        this.f = new RectF();
        TextPaint textPaint2 = new TextPaint(1);
        this.E = textPaint2;
        this.H = 1.0f;
        this.N = org.telegram.ui.ActionBar.k6.pf;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
    }

    public final void a(String str, boolean z10) {
        if (this.M == str) {
            return;
        }
        this.M = str;
        this.I = z10;
        this.x = this.s;
        this.w = this.r;
        Typeface o10 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.E;
        textPaint.setTypeface(o10);
        int i3 = 0;
        this.y = (int) Math.ceil(textPaint.measureText((CharSequence) str, 0, str.length()));
        this.r = null;
        this.s = new StaticLayout(str, textPaint, this.y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(str);
        invalidate();
        if (this.x == null && this.w == null) {
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.H = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new m41(i3, this));
        this.G.setDuration(150L);
        this.G.start();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return null;
    }

    public float getTopOffset() {
        return 0.0f;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        StaticLayout staticLayout = this.s;
        int w02 = org.telegram.ui.ActionBar.k6.w0(isEnabled() ? this.N : org.telegram.ui.ActionBar.k6.y6, getResourceProvider());
        int i3 = this.J;
        TextPaint textPaint = this.E;
        if (i3 != w02) {
            this.J = w02;
            textPaint.setColor(w02);
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ge, getResourceProvider());
        int i10 = this.K;
        TextPaint textPaint2 = this.d;
        if (i10 != w03) {
            this.K = w03;
            textPaint2.setColor(w03);
        }
        int w04 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hg, getResourceProvider());
        int i11 = this.L;
        Paint paint = this.e;
        if (i11 != w04) {
            this.L = w04;
            paint.setColor(w04);
        }
        if (getParent() != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
            if (this.n != org.telegram.ui.ActionBar.k6.w0(this.N, getResourceProvider()) || this.F == null) {
                int L = org.telegram.messenger.g0.L(60.0f);
                int w05 = org.telegram.ui.ActionBar.k6.w0(this.N, getResourceProvider());
                this.n = w05;
                org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(L, 0, i0.a.o(w05, 26));
                this.F = j02;
                j02.setCallback(this);
            }
            int L2 = getLeft() + measuredWidth2 <= 0 ? measuredWidth2 - org.telegram.messenger.g0.L(20.0f) : measuredWidth2;
            int i12 = measuredWidth2 + measuredWidth;
            if (i12 > ((View) getParent()).getMeasuredWidth()) {
                i12 += org.telegram.messenger.g0.L(20.0f);
            }
            int i13 = measuredWidth / 2;
            this.F.setBounds(L2, (getMeasuredHeight() / 2) - i13, i12, (getMeasuredHeight() / 2) + i13);
            this.F.draw(canvas);
        }
        if (this.s != null) {
            canvas.save();
            if (this.H == 1.0f || this.x == null) {
                f10 = 6.0f;
                int measuredWidth3 = ((getMeasuredWidth() - this.y) / 2) - (this.h / 2);
                canvas.translate(measuredWidth3 + (this.r != null ? org.telegram.messenger.g0.L(3.0f) + (r5.getIntrinsicWidth() / 2) : 0), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                Drawable drawable = this.r;
                if (drawable != null) {
                    drawable.setBounds((-drawable.getIntrinsicWidth()) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.s.getHeight() - this.r.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.r.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.r.setAlpha(org.telegram.messenger.hs.e4);
                    this.r.draw(canvas);
                }
                this.s.draw(canvas);
            } else {
                int alpha = textPaint.getAlpha();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.x.getWidth()) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                canvas.translate(this.w != null ? org.telegram.messenger.g0.L(3.0f) + (r11.getIntrinsicWidth() / 2) : 0, (this.I ? -1.0f : 1.0f) * org.telegram.messenger.g0.L(18.0f) * this.H);
                Drawable drawable2 = this.w;
                if (drawable2 != null) {
                    f10 = 6.0f;
                    f11 = 1.0f;
                    f12 = 3.0f;
                    drawable2.setBounds((-drawable2.getIntrinsicWidth()) - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.s.getHeight() - this.w.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + ((this.w.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.w.setAlpha((int) ((1.0f - this.H) * alpha));
                    this.w.draw(canvas);
                } else {
                    f10 = 6.0f;
                    f11 = 1.0f;
                    f12 = 3.0f;
                }
                float f13 = alpha;
                textPaint.setAlpha((int) ((f11 - this.H) * f13));
                this.x.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(((getMeasuredWidth() - this.y) / 2) - (this.h / 2), getTopOffset() + ((getMeasuredHeight() - this.s.getHeight()) / 2));
                canvas.translate(this.r != null ? org.telegram.messenger.g0.L(f12) + (r9.getIntrinsicWidth() / 2) : 0, (f11 - this.H) * (this.I ? f11 : -1.0f) * org.telegram.messenger.g0.L(18.0f));
                Drawable drawable3 = this.r;
                if (drawable3 != null) {
                    drawable3.setBounds((-drawable3.getIntrinsicWidth()) - org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11) + ((this.s.getHeight() - this.r.getIntrinsicHeight()) / 2), -org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f11) + ((this.r.getIntrinsicHeight() + this.s.getHeight()) / 2));
                    this.r.setAlpha((int) (this.H * f13));
                    this.r.draw(canvas);
                }
                textPaint.setAlpha((int) (f13 * this.H));
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
        int L3 = org.telegram.messenger.g0.L(f10) + ((((getMeasuredWidth() - ceil) / 2) + ceil) - (this.h / 2));
        float f14 = L3;
        float measuredHeight = (getMeasuredHeight() / 2) - org.telegram.messenger.g0.L(10.0f);
        float f15 = L3 + this.h;
        float L4 = org.telegram.messenger.g0.L(10.0f) + (getMeasuredHeight() / 2);
        RectF rectF = this.f;
        rectF.set(f14, measuredHeight, f15, L4);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), paint);
        canvas.drawText(this.b, rectF.centerX() - (this.c / 2.0f), rectF.top + org.telegram.messenger.g0.L(14.5f), textPaint2);
    }

    public void setCounter(int i3) {
        if (this.a != i3) {
            this.a = i3;
            if (i3 == 0) {
                this.b = null;
                this.h = 0;
            } else {
                this.b = org.telegram.messenger.g0.o0(i3, 0);
                this.c = (int) Math.ceil(this.d.measureText(r3));
                int max = Math.max(org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(12.0f) + this.c);
                if (this.h != max) {
                    this.h = max;
                }
            }
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        Typeface o10 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.E;
        textPaint.setTypeface(o10);
        this.y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.r = null;
        this.s = new StaticLayout(charSequence, textPaint, this.y, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    public void setTextColorKey(int i3) {
        this.N = i3;
        invalidate();
    }

    public void setTextInfo(CharSequence charSequence) {
        TextPaint textPaint = this.E;
        textPaint.setTypeface(null);
        this.y = (int) Math.ceil(textPaint.measureText(charSequence, 0, charSequence.length()));
        this.r = null;
        this.s = new StaticLayout(charSequence, textPaint, this.y + 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        setContentDescription(charSequence);
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        org.telegram.ui.Cells.y yVar = this.F;
        return yVar != null ? yVar == drawable || super.verifyDrawable(drawable) : super.verifyDrawable(drawable);
    }
}
