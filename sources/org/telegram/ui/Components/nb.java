package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class nb extends FrameLayout {
    public final u5 a;
    public final u5 b;
    public final Paint c;
    public final RectF d;
    public final long e;
    public final /* synthetic */ ob f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(ob obVar, Activity activity) {
        super(activity);
        this.f = obVar;
        er erVar = er.h;
        this.a = new u5(this, 320L, erVar);
        this.b = new u5(this, 320L, erVar);
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(268435455);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.d = new RectF();
        this.e = System.currentTimeMillis();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ob obVar = this.f;
        float e10 = this.a.e(false, obVar.a);
        float d = this.b.d(obVar.a >= 1.0f);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float N = width - org.telegram.messenger.g0.N(13.0f);
        float N2 = height - org.telegram.messenger.g0.N(13.0f);
        float N3 = org.telegram.messenger.g0.N(13.0f) + width;
        float N4 = org.telegram.messenger.g0.N(13.0f) + height;
        RectF rectF = this.d;
        rectF.set(N, N2, N3, N4);
        float currentTimeMillis = ((System.currentTimeMillis() - this.e) * 0.45f) % 5400.0f;
        float max = Math.max(0.0f, ((1520.0f * currentTimeMillis) / 5400.0f) - 20.0f);
        for (int i7 = 0; i7 < 4; i7++) {
            x1.a aVar = lp.h;
            aVar.getInterpolation((currentTimeMillis - (i7 * 1350)) / 667.0f);
            max += aVar.getInterpolation((currentTimeMillis - (r8 + 667)) / 667.0f) * 250.0f;
        }
        int r12 = org.telegram.ui.ActionBar.j6.r1((1.0f - d) * 1.0f, -1);
        Paint paint = this.c;
        paint.setColor(r12);
        canvas.drawArc(rectF, (-90.0f) - max, Math.max(0.02f, e10) * (-360.0f), false, paint);
        if (e10 < 1.0f && d < 1.0f) {
            invalidate();
        }
        super.onDraw(canvas);
    }
}
