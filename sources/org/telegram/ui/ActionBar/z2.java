package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class z2 extends View implements c6 {
    public final /* synthetic */ b3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(b3 b3Var, Context context) {
        super(context);
        this.a = b3Var;
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
        b3 b3Var = this.a;
        Paint paint = b3Var.d;
        try {
            k3 k3Var = b3Var.a;
            if (k3Var == null) {
                return;
            }
            int e10 = k3Var.e(n6.x0(null, n6.a7, false));
            if (paint.getColor() != e10) {
                paint.setColor(e10);
                invalidate();
                org.telegram.messenger.g0.s3(b3Var, e10, true, null);
                org.telegram.messenger.g0.m3(b3Var, org.telegram.messenger.g0.B(e10) >= 0.721f);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
