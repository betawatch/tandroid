package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.ui.Components.ks;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        int i3 = org.telegram.ui.ActionBar.k6.I6;
        textView.setTextColor(i0.a.f(f10, x02, org.telegram.ui.ActionBar.k6.x0(null, i3, false)));
        Paint paint = this.a;
        paint.setColor(i0.a.f(f10, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.M6, false), 63), org.telegram.ui.ActionBar.k6.x0(null, i3, false)));
        paint.setStrokeWidth(Math.max(2, org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(0.5f, 2.0f, f10))));
        invalidate();
    }

    public final void b(boolean z10, boolean z11) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = this.e;
        if (f10 == f11 && z11) {
            return;
        }
        if (!z11) {
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

    @Override // org.telegram.ui.ActionBar.z5
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

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
