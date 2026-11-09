package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.ks;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class s extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int h = 0;
    public Paint a;
    public Paint b;
    public q c;
    public TextView d;
    public float e;
    public boolean f;

    public final void a(float f10) {
        this.e = f10;
        this.f = true;
        TextView textView = this.d;
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G6, false);
        int i7 = org.telegram.ui.ActionBar.l6.I6;
        textView.setTextColor(i0.a.f(f10, x02, org.telegram.ui.ActionBar.l6.x0(null, i7, false)));
        Paint paint = this.a;
        paint.setColor(i0.a.f(f10, i0.a.o(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.M6, false), 63), org.telegram.ui.ActionBar.l6.x0(null, i7, false)));
        paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(0.5f, 2.0f, f10))));
        invalidate();
    }

    public final void b(boolean z9, boolean z10) {
        float f10 = z9 ? 1.0f : 0.0f;
        float f11 = this.e;
        if (f10 == f11 && z10) {
            return;
        }
        if (!z10) {
            a(f10);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f11, f10).setDuration(250L);
        duration.setInterpolator(ks.e);
        duration.addUpdateListener(new r(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = org.telegram.messenger.g0.P;
        q qVar = this.c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), this.b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            if (!this.f || this.d == null) {
                return;
            }
            a(this.e);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
