package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v2 extends View implements z5 {
    public final /* synthetic */ x2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(x2 x2Var, Context context) {
        super(context);
        this.a = x2Var;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.a.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.n);
        setTranslationY(org.telegram.messenger.g0.n);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        x2 x2Var = this.a;
        Paint paint = x2Var.d;
        try {
            g3 g3Var = x2Var.a;
            if (g3Var == null) {
                return;
            }
            int e10 = g3Var.e(k6.x0(null, k6.a7, false));
            if (paint.getColor() != e10) {
                paint.setColor(e10);
                invalidate();
                org.telegram.messenger.g0.u3(x2Var, e10, true, null);
                org.telegram.messenger.g0.n3(x2Var, org.telegram.messenger.g0.B(e10) >= 0.721f);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
