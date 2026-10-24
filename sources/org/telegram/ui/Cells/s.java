package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.st;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class s extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
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
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false);
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        textView.setTextColor(i0.a.f(f7, x02, org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
        Paint paint = this.a;
        paint.setColor(i0.a.f(f7, i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.M6, false), 63), org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
        paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(AndroidUtilities.lerp(0.5f, 2.0f, f7))));
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
        duration.setInterpolator(st.e);
        duration.addUpdateListener(new r(this, 0));
        duration.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Paint paint = this.a;
        float strokeWidth = paint.getStrokeWidth();
        RectF rectF = AndroidUtilities.rectTmp;
        q qVar = this.c;
        rectF.set(qVar.getLeft() + strokeWidth, qVar.getTop() + strokeWidth, qVar.getRight() - strokeWidth, qVar.getBottom() - strokeWidth);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.b);
        super.draw(canvas);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            if (!this.f || this.d == null) {
                return;
            }
            a(this.e);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
