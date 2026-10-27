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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class g91 extends View {
    public ShapeDrawable a;
    public Drawable b;
    public StaticLayout c;
    public TextPaint d;
    public long e;
    public float f;
    public float h;
    public boolean n;
    public int r;

    public final void a(boolean z10) {
        this.n = z10;
        invalidate();
    }

    public final void b() {
        Drawable drawable = this.b;
        this.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.pf, false));
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.qf, false), shapeDrawable);
        } else {
            this.a = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.qf, false));
        }
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.qf, false);
        if (x02 != this.r || drawable.getColorFilter() == null) {
            this.r = x02;
            drawable.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.b;
        if (this.c == null) {
            return;
        }
        if (this.n) {
            float f7 = this.h;
            if (f7 != 1.0f) {
                float f10 = f7 + 0.12f;
                this.h = f10;
                if (f10 > 1.0f) {
                    this.h = 1.0f;
                }
                invalidate();
            }
        } else {
            float f11 = this.h;
            if (f11 != 0.0f) {
                float f12 = f11 - 0.12f;
                this.h = f12;
                if (f12 < 0.0f) {
                    this.h = 0.0f;
                }
                invalidate();
            }
            if (this.h == 0.0f) {
                return;
            }
        }
        float f13 = this.h;
        int i10 = (int) ((f13 > 0.5f ? 1.0f : f13 / 0.5f) * 255.0f);
        canvas.save();
        float f14 = this.h;
        canvas.scale(f14, f14, this.f, getMeasuredHeight());
        canvas.translate(this.f - (this.c.getWidth() / 2.0f), 0.0f);
        this.a.setBounds(-AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f) + this.c.getWidth(), (int) (AndroidUtilities.dpf2(4.0f) + this.c.getHeight()));
        drawable.setBounds(org.telegram.ui.d3.x(2, this.c.getWidth() / 2, drawable), (int) (AndroidUtilities.dpf2(4.0f) + this.c.getHeight()), org.telegram.ui.d3.C(2, this.c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(4.0f) + this.c.getHeight())));
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

    public void setCx(float f7) {
        this.f = f7;
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
