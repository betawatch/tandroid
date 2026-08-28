package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s2 extends View {
    public StaticLayout a;
    public final RectF b;
    public final Paint c;
    public final Paint d;
    public String e;
    public final TextPaint f;
    public int h;
    public boolean n;
    public final Drawable r;
    public final mh.m2 s;

    public s2(Activity activity) {
        super(activity);
        this.b = new RectF();
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        this.h = 4;
        this.n = false;
        this.s = new mh.m2(this, 12);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(-1);
        paint.setColor(i0.a.k(-1, TLRPC.LAYER));
        paint2.setColor(i0.a.k(-1, 102));
        Drawable drawable = activity.getDrawable(R.drawable.calls_decline);
        this.r = drawable;
        drawable.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
    }

    public final void a() {
        mh.m2 m2Var = this.s;
        removeCallbacks(m2Var);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        String formatLongDuration = AndroidUtilities.formatLongDuration((int) (sharedInstance.getCallDuration() / 1000));
        String str = this.e;
        if (str == null || !str.equals(formatLongDuration)) {
            this.e = formatLongDuration;
            if (this.a == null) {
                requestLayout();
            }
            String str2 = this.e;
            TextPaint textPaint = this.f;
            this.a = new StaticLayout(str2, textPaint, (int) textPaint.measureText(str2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        postDelayed(m2Var, 300L);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout = this.a;
        int i9 = 0;
        int dp = staticLayout == null ? 0 : AndroidUtilities.dp(21.0f) + staticLayout.getWidth();
        canvas.save();
        canvas.translate((getMeasuredWidth() - dp) / 2.0f, 0.0f);
        canvas.save();
        if (this.n) {
            canvas.translate(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(3.0f));
            this.r.draw(canvas);
        } else {
            canvas.translate(0.0f, (getMeasuredHeight() - AndroidUtilities.dp(11.0f)) / 2.0f);
            while (i9 < 4) {
                int i10 = i9 + 1;
                Paint paint = i10 > this.h ? this.d : this.c;
                float f10 = i9;
                float dpf2 = AndroidUtilities.dpf2(4.16f) * f10;
                float dpf22 = AndroidUtilities.dpf2(2.75f) * (3 - i9);
                float dpf23 = AndroidUtilities.dpf2(2.75f) + (AndroidUtilities.dpf2(4.16f) * f10);
                float dp2 = AndroidUtilities.dp(11.0f);
                RectF rectF = this.b;
                rectF.set(dpf2, dpf22, dpf23, dp2);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(0.7f), AndroidUtilities.dpf2(0.7f), paint);
                i9 = i10;
            }
        }
        canvas.restore();
        if (staticLayout != null) {
            canvas.translate(AndroidUtilities.dp(21.0f), 0.0f);
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), staticLayout.getHeight());
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(15.0f));
        }
    }

    public void setSignalBarCount(int i9) {
        this.h = i9;
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        if (getVisibility() != i9) {
            if (i9 == 0) {
                this.e = "00:00";
                String str = this.e;
                TextPaint textPaint = this.f;
                this.a = new StaticLayout(str, textPaint, (int) textPaint.measureText(str), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a();
            } else {
                this.e = null;
                this.a = null;
            }
        }
        super.setVisibility(i9);
    }
}
