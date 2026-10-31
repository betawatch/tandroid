package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b3 extends View implements k6 {
    public final /* synthetic */ d3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(d3 d3Var, Context context) {
        super(context);
        this.a = d3Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.n);
        setTranslationY(org.telegram.messenger.i0.n);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        d3 d3Var = this.a;
        Paint paint = d3Var.d;
        try {
            n3 n3Var = d3Var.a;
            if (n3Var == null) {
                return;
            }
            int e = n3Var.e(t6.x0(null, t6.a7, false));
            if (paint.getColor() != e) {
                paint.setColor(e);
                invalidate();
                org.telegram.messenger.i0.t3(d3Var, e, true, null);
                org.telegram.messenger.i0.m3(d3Var, org.telegram.messenger.i0.B(e) >= 0.721f);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
