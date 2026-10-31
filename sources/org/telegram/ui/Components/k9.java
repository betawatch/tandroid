package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k9 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public int d;
    public int e;
    public j9 f;

    public int getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        int i10 = 0;
        while (i10 < this.d) {
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10 < this.e ? org.telegram.ui.ActionBar.t6.m5 : org.telegram.ui.ActionBar.t6.t5, false));
            canvas.drawBitmap(i10 < this.e ? this.a : this.b, org.telegram.messenger.i0.L(48.0f) * i10, 0.0f, paint);
            i10++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.m5.D(16.0f, i12 - 1, org.telegram.messenger.i0.L(32.0f) * i12), org.telegram.messenger.i0.L(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float L = org.telegram.messenger.i0.L(-8.0f);
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > L && motionEvent.getX() < org.telegram.messenger.i0.L(48.0f) + L && this.e != (i10 = i11 + 1)) {
                this.e = i10;
                j9 j9Var = this.f;
                if (j9Var != null) {
                    View view = ((fe.a) j9Var).a;
                    view.setEnabled(i10 > 0);
                    ((TextView) view).setText(org.telegram.messenger.cd.L0(i10 < 4 ? 2131748267 : 2131745657, null).toUpperCase());
                }
                invalidate();
                return true;
            }
            L += org.telegram.messenger.i0.L(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(j9 j9Var) {
        this.f = j9Var;
    }
}
