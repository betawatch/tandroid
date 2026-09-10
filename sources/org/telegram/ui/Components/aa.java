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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class aa extends View {
    public Bitmap a;
    public Bitmap b;
    public Paint c;
    public int d;
    public int e;
    public z9 f;

    public int getRating() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.c;
        int i10 = 0;
        while (i10 < this.d) {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10 < this.e ? org.telegram.ui.ActionBar.j6.m5 : org.telegram.ui.ActionBar.j6.t5, false));
            canvas.drawBitmap(i10 < this.e ? this.a : this.b, AndroidUtilities.dp(48.0f) * i10, 0.0f, paint);
            i10++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        setMeasuredDimension(org.telegram.messenger.a2.D(16.0f, i12 - 1, AndroidUtilities.dp(32.0f) * i12), AndroidUtilities.dp(32.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        float dp = AndroidUtilities.dp(-8.0f);
        for (int i11 = 0; i11 < this.d; i11++) {
            if (motionEvent.getX() > dp && motionEvent.getX() < AndroidUtilities.dp(48.0f) + dp && this.e != (i10 = i11 + 1)) {
                this.e = i10;
                z9 z9Var = this.f;
                if (z9Var != null) {
                    View view = ((le.a) z9Var).a;
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

    public void setOnRatingChangeListener(z9 z9Var) {
        this.f = z9Var;
    }
}
