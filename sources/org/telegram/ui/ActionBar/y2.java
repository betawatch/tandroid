package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class y2 extends View implements b6 {
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        a3 a3Var = this.a;
        Paint paint = a3Var.d;
        try {
            j3 j3Var = a3Var.a;
            if (j3Var == null) {
                return;
            }
            int e10 = j3Var.e(m6.x0(null, m6.a7, false));
            if (paint.getColor() != e10) {
                paint.setColor(e10);
                invalidate();
                org.telegram.messenger.g0.s3(a3Var, e10, true, null);
                org.telegram.messenger.g0.m3(a3Var, org.telegram.messenger.g0.B(e10) >= 0.721f);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
