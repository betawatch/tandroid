package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r5 extends View {
    public final Paint a;
    public final Paint b;
    public final StaticLayout c;
    public final float d;
    public final float e;
    public final int f;
    public final int h;
    public final boolean n;
    public final org.telegram.ui.Components.v5 r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final /* synthetic */ s5 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(s5 s5Var, Context context, String str, boolean z9) {
        super(context);
        CharSequence upperCase;
        this.y = s5Var;
        TextPaint textPaint = new TextPaint(1);
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        this.r = new org.telegram.ui.Components.v5(this, 0L, 220L, wq.h);
        this.s = true;
        this.n = z9;
        paint.setColor(-15098625);
        paint2.setColor(1610612736);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        if (z9) {
            SpannableString spannableString = new SpannableString(">");
            Drawable mutate = getResources().getDrawable(R.drawable.attach_arrow_right).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            mutate.setBounds(0, 0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
            spannableString.setSpan(new ImageSpan(mutate, 2), 0, spannableString.length(), 33);
            upperCase = id.a0 ? new SpannableStringBuilder(spannableString).append((CharSequence) "\u2009").append((CharSequence) str.toUpperCase()) : new SpannableStringBuilder(str.toUpperCase()).append((CharSequence) "\u2009").append((CharSequence) spannableString);
        } else {
            upperCase = str.toUpperCase();
        }
        StaticLayout staticLayout = new StaticLayout(upperCase, textPaint, org.telegram.messenger.g0.L(180.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.c = staticLayout;
        this.d = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        float lineWidth = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.e = lineWidth;
        int L = org.telegram.messenger.g0.L(48.0f) + ((int) lineWidth);
        this.f = L;
        if (!z9) {
            this.f = Math.max(org.telegram.messenger.g0.L(80.0f), L);
        }
        this.h = org.telegram.messenger.g0.L(40.0f);
        setOnClickListener(new ah.d(this, 24));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isPressed()) {
            float f10 = this.w;
            if (f10 != 1.0f) {
                float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.r) / 80.0f) + f10;
                this.w = min;
                this.w = Utilities.i(min, 1.0f, 0.0f);
                invalidate();
            }
        }
        float e10 = this.r.e(false, this.s ? 1.0f : 0.5f);
        int saveCount = canvas.getSaveCount();
        if (e10 < 1.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (e10 * 255.0f), 31);
        }
        float f11 = ((1.0f - this.w) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(f11, f11, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.drawRect(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(4.0f), getWidth() - org.telegram.messenger.g0.L(25.0f), getHeight() - org.telegram.messenger.g0.L(4.0f), this.b);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(4.0f), getWidth() - org.telegram.messenger.g0.L(10.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f), this.a);
        canvas.save();
        float L = (((this.f - this.e) / 2.0f) + org.telegram.messenger.g0.L(this.n ? 3.0f : 0.0f)) - this.d;
        int height = getHeight();
        StaticLayout staticLayout = this.c;
        canvas.translate(L, (height - staticLayout.getHeight()) / 2.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(saveCount);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.h, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setPressed(boolean z9) {
        ValueAnimator valueAnimator;
        if (isPressed() != z9) {
            super.setPressed(z9);
            invalidate();
            if (z9 && (valueAnimator = this.x) != null) {
                valueAnimator.removeAllListeners();
                this.x.cancel();
            }
            if (z9) {
                return;
            }
            float f10 = this.w;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new v3(this, 2));
                this.x.addListener(new bi.t5(this, 22));
                org.telegram.messenger.camera.q.i(1.5f, this.x);
                this.x.setDuration(350L);
                this.x.start();
            }
        }
    }
}
