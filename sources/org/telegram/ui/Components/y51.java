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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y51 extends View {
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
        this.d.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.dg, false));
        ShapeDrawable shapeDrawable = this.a;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eg, false), shapeDrawable);
        } else {
            this.a = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eg, false));
        }
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.eg, false);
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
        int i3 = (int) ((f14 > 0.5f ? 1.0f : f14 / 0.5f) * 255.0f);
        canvas.save();
        float f15 = this.h;
        canvas.scale(f15, f15, this.f, getMeasuredHeight());
        canvas.translate(this.f - (this.c.getWidth() / 2.0f), 0.0f);
        this.a.setBounds(-org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f) + this.c.getWidth(), (int) (org.telegram.messenger.g0.N(4.0f) + this.c.getHeight()));
        drawable.setBounds(org.telegram.ui.Cells.f1.C(2, this.c.getWidth() / 2, drawable), (int) (org.telegram.messenger.g0.N(4.0f) + this.c.getHeight()), org.telegram.ui.Cells.f1.z(2, this.c.getWidth() / 2, drawable), drawable.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(4.0f) + this.c.getHeight())));
        drawable.setAlpha(i3);
        this.a.setAlpha(i3);
        this.d.setAlpha(i3);
        drawable.draw(canvas);
        this.a.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.N(1.0f));
        this.c.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(this.b.getIntrinsicHeight() + org.telegram.messenger.g0.L(4.0f) + this.c.getHeight(), TLObject.FLAG_30));
    }

    public void setCx(float f10) {
        this.f = f10;
        invalidate();
    }

    public void setTime(int i3) {
        long j10 = i3;
        if (j10 != this.e) {
            this.e = j10;
            String g02 = org.telegram.messenger.g0.g0(i3, false, false);
            TextPaint textPaint = this.d;
            this.c = new StaticLayout(g02, textPaint, (int) textPaint.measureText(g02), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        }
    }
}
