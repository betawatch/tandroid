package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o9 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public int d;
    public int e;
    public n9 f;

    public int getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        int i3 = 0;
        while (i3 < this.d) {
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3 < this.e ? org.telegram.ui.ActionBar.k6.m5 : org.telegram.ui.ActionBar.k6.t5, false));
            canvas.drawBitmap(i3 < this.e ? this.a : this.b, org.telegram.messenger.g0.L(48.0f) * i3, 0.0f, paint);
            i3++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = this.d;
        setMeasuredDimension(org.telegram.messenger.k5.D(16.0f, i11 - 1, org.telegram.messenger.g0.L(32.0f) * i11), org.telegram.messenger.g0.L(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        float L = org.telegram.messenger.g0.L(-8.0f);
        for (int i10 = 0; i10 < this.d; i10++) {
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.g0.L(48.0f) + L && this.e != (i3 = i10 + 1)) {
                this.e = i3;
                n9 n9Var = this.f;
                if (n9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.d1) n9Var).a;
                    view.setEnabled(i3 > 0);
                    ((TextView) view).setText(org.telegram.messenger.bd.M0(i3 < 4 ? 2131748258 : 2131745650, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += org.telegram.messenger.g0.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(n9 n9Var) {
        this.f = n9Var;
    }
}
