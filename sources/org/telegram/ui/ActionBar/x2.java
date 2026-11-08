package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class x2 extends View implements a6 {
    public final /* synthetic */ z2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(z2 z2Var, Context context) {
        super(context);
        this.a = z2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.n);
        setTranslationY(org.telegram.messenger.g0.n);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        z2 z2Var = this.a;
        Paint paint = z2Var.d;
        try {
            h3 h3Var = z2Var.a;
            if (h3Var == null) {
                return;
            }
            int e10 = h3Var.e(k6.x0(null, k6.a7, false));
            if (paint.getColor() != e10) {
                paint.setColor(e10);
                invalidate();
                org.telegram.messenger.g0.u3(z2Var, e10, true, null);
                org.telegram.messenger.g0.n3(z2Var, org.telegram.messenger.g0.B(e10) >= 0.721f);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
