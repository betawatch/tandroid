package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        int i7 = 0;
        while (i7 < this.d) {
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7 < this.e ? org.telegram.ui.ActionBar.m6.m5 : org.telegram.ui.ActionBar.m6.t5, false));
            canvas.drawBitmap(i7 < this.e ? this.a : this.b, org.telegram.messenger.g0.L(48.0f) * i7, 0.0f, paint);
            i7++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = this.d;
        setMeasuredDimension(org.telegram.messenger.k5.D(16.0f, i11 - 1, org.telegram.messenger.g0.L(32.0f) * i11), org.telegram.messenger.g0.L(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        float L = org.telegram.messenger.g0.L(-8.0f);
        for (int i10 = 0; i10 < this.d; i10++) {
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.g0.L(48.0f) + L && this.e != (i7 = i10 + 1)) {
                this.e = i7;
                n9 n9Var = this.f;
                if (n9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.o1) n9Var).a;
                    view.setEnabled(i7 > 0);
                    ((TextView) view).setText(org.telegram.messenger.id.M0(i7 < 4 ? 2131748250 : 2131745640, null).toUpperCase());
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
