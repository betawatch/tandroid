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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s9 extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public int d;
    public int e;
    public r9 f;

    public int getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        int i9 = 0;
        while (i9 < this.d) {
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9 < this.e ? org.telegram.ui.ActionBar.f6.m5 : org.telegram.ui.ActionBar.f6.t5, false));
            canvas.drawBitmap(i9 < this.e ? this.a : this.b, AndroidUtilities.dp(48.0f) * i9, 0.0f, paint);
            i9++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.d;
        setMeasuredDimension(org.telegram.messenger.l0.D(16.0f, i11 - 1, AndroidUtilities.dp(32.0f) * i11), AndroidUtilities.dp(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        float dp = AndroidUtilities.dp(-8.0f);
        for (int i10 = 0; i10 < this.d; i10++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.e != (i9 = i10 + 1)) {
                this.e = i9;
                r9 r9Var = this.f;
                if (r9Var != null) {
                    View view = ((org.telegram.ui.Components.voip.t1) r9Var).a;
                    view.setEnabled(i9 > 0);
                    ((TextView) view).setText(LocaleController.getString(i9 < 4 ? R.string.Next : R.string.Send).toUpperCase());
                }
                invalidate();
                return true;
            }
            dp += AndroidUtilities.dp(48.0f);
        }
        return true;
    }

    public void setOnRatingChangeListener(r9 r9Var) {
        this.f = r9Var;
    }
}
