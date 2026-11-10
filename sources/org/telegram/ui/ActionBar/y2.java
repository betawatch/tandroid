package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y2 extends View implements c6 {
    public final /* synthetic */ a3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(a3 a3Var, Context context) {
        super(context);
        this.a = a3Var;
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        a3 a3Var = this.a;
        Paint paint = a3Var.d;
        try {
            i3 i3Var = a3Var.a;
            if (i3Var == null) {
                return;
            }
            int e10 = i3Var.e(m6.x0(null, m6.a7, false));
            if (paint.getColor() != e10) {
                paint.setColor(e10);
                invalidate();
                org.telegram.messenger.g0.u3(a3Var, e10, true, null);
                org.telegram.messenger.g0.n3(a3Var, org.telegram.messenger.g0.B(e10) >= 0.721f);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
