package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int h = 0;
    public Paint a;
    public Paint b;
    public q c;
    public TextView d;
    public float e;
    public boolean f;

    public final void a(float f7) {
        this.e = f7;
        this.f = true;
        TextView textView = this.d;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false);
        int i10 = org.telegram.ui.ActionBar.t6.I6;
        textView.setTextColor(i0.b.f(f7, x02, org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
        Paint paint = this.a;
        paint.setColor(i0.b.f(f7, i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.M6, false), 63), org.telegram.ui.ActionBar.t6.x0(null, i10, false)));
        paint.setStrokeWidth(Math.max(2, org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(0.5f, 2.0f, f7))));
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        float f7 = z10 ? 1.0f : 0.0f;
        float f10 = this.e;
        if (f7 == f10 && z11) {
            return;
        }
        if (!z11) {
            a(f7);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f7).setDuration(250L);
        duration.setInterpolator(vs.e);
        duration.addUpdateListener(new r(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = org.telegram.messenger.i0.P;
        q qVar = this.c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), this.b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), paint);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            if (!this.f || this.d == null) {
                return;
            }
            a(this.e);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
