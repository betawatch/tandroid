package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t9 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public int d;
    public int e;
    public s9 f;

    public int getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        int i10 = 0;
        while (i10 < this.d) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i10 < this.e ? org.telegram.ui.ActionBar.k6.m5 : org.telegram.ui.ActionBar.k6.t5, false));
            canvas.drawBitmap(i10 < this.e ? this.a : this.b, AndroidUtilities.dp(48.0f) * i10, 0.0f, paint);
            i10++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.y3.D(16.0f, i12 - 1, AndroidUtilities.dp(32.0f) * i12), AndroidUtilities.dp(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float dp = AndroidUtilities.dp(-8.0f);
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.e != (i10 = i11 + 1)) {
                this.e = i10;
                s9 s9Var = this.f;
                if (s9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.u1) s9Var).a;
                    view.setEnabled(i10 > 0);
                    ((TextView) view).setText(LocaleController.getString(i10 < 4 ? R.string.Next : R.string.Send).toUpperCase());
                }
                invalidate();
                return true;
            }
            dp += AndroidUtilities.dp(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(s9 s9Var) {
        this.f = s9Var;
    }
}
