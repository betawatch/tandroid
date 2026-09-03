package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class v71 extends View {
    public ShapeDrawable a;
    public Drawable b;
    public StaticLayout c;
    public TextPaint d;
    public long e;
    public float f;
    public float h;
    public boolean n;

    public final void a(boolean z4) {
        this.n = z4;
        invalidate();
    }

    public final void b() {
        this.d.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.pf, false));
        int dp = AndroidUtilities.dp(5.0f);
        int i10 = org.telegram.ui.ActionBar.j6.qf;
        this.a = org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.b;
        if (this.c == null) {
            return;
        }
        if (this.n) {
            float f10 = this.h;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.12f;
                this.h = f11;
                if (f11 > 1.0f) {
                    this.h = 1.0f;
                }
                invalidate();
            }
        } else {
            float f12 = this.h;
            if (f12 != 0.0f) {
                float f13 = f12 - 0.12f;
                this.h = f13;
                if (f13 < 0.0f) {
                    this.h = 0.0f;
                }
                invalidate();
            }
            if (this.h == 0.0f) {
                return;
            }
        }
        float f14 = this.h;
        int i10 = (int) ((f14 > 0.5f ? 1.0f : f14 / 0.5f) * 255.0f);
        canvas.save();
        float f15 = this.h;
        canvas.scale(f15, f15, this.f, getMeasuredHeight());
        canvas.translate(this.f - (this.c.getWidth() / 2.0f), 0.0f);
        this.a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.c.getHeight()));
        drawable.setBounds(org.telegram.ui.b.u(2, this.c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.c.getHeight()), org.telegram.ui.b.A(2, this.c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.c.getHeight())));
        drawable.setAlpha(i10);
        this.a.setAlpha(i10);
        this.d.setAlpha(i10);
        drawable.draw(canvas);
        this.a.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dpf2(1.0f));
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.b.getIntrinsicHeight() + AndroidUtilities.dp(4.0f) + this.c.getHeight(), TLObject.FLAG_30));
    }

    public void setCx(float f10) {
        this.f = f10;
        invalidate();
    }

    public void setTime(int i10) {
        long j10 = i10;
        if (j10 != this.e) {
            this.e = j10;
            String formatShortDuration = AndroidUtilities.formatShortDuration(i10);
            TextPaint textPaint = this.d;
            this.c = new StaticLayout(formatShortDuration, textPaint, (int) textPaint.measureText(formatShortDuration), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
