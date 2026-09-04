package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class gc extends FrameLayout {
    public final e6 a;
    public final e6 b;
    public final Paint c;
    public final RectF d;
    public final long e;
    public final /* synthetic */ hc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(hc hcVar, Activity activity) {
        super(activity);
        this.f = hcVar;
        pr prVar = pr.h;
        this.a = new e6(this, 320L, prVar);
        this.b = new e6(this, 320L, prVar);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(AndroidUtilities.dp(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.e = System.currentTimeMillis();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        hc hcVar = this.f;
        float d = this.a.d(hcVar.a, false);
        float e7 = this.b.e(hcVar.a >= 1.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float dpf2 = width - AndroidUtilities.dpf2(13.0f);
        float dpf22 = height - AndroidUtilities.dpf2(13.0f);
        float dpf23 = AndroidUtilities.dpf2(13.0f) + width;
        float dpf24 = AndroidUtilities.dpf2(13.0f) + height;
        RectF rectF = this.d;
        rectF.set(dpf2, dpf22, dpf23, dpf24);
        float currentTimeMillis = ((System.currentTimeMillis() - this.e) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i10 = 0; i10 < 4; i10++) {
            u1.a aVar = sp.h;
            aVar.getInterpolation((currentTimeMillis - (i10 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (r8 + 667)) / 667.0f) * 250.0f;
        }
        int l1 = org.telegram.ui.ActionBar.j6.l1((1.0f - e7) * 1.0f, -1);
        Paint paint = this.c;
        paint.setColor(l1);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, d) * (-360.0f), false, paint);
        if (d < 1.0f && e7 < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
