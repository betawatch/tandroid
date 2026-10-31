package org.telegram.ui;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ku extends View implements org.telegram.ui.ActionBar.k6 {
    public Path a;
    public Paint b;
    public boolean c;

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.a, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(13.0f), TLObject.FLAG_30));
        setTop(this.c);
    }

    public void setTop(boolean z10) {
        Path path = this.a;
        path.rewind();
        this.c = z10;
        if (!z10) {
            float L = org.telegram.messenger.i0.L(8.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, ((-getMeasuredHeight()) * 2) - org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), getMeasuredHeight() - org.telegram.messenger.i0.L(4.0f));
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            return;
        }
        float L2 = org.telegram.messenger.i0.L(14.0f);
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(0.0f, org.telegram.messenger.i0.L(4.0f), getMeasuredWidth(), (getMeasuredHeight() * 2) + org.telegram.messenger.i0.L(4.0f));
        path.addRoundRect(rectF2, L2, L2, Path.Direction.CW);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.b.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
