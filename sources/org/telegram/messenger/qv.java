package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class qv {
    public float a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public ValueAnimator f;
    public final Path g = new Path();

    public final void a(Canvas canvas) {
        if (this.a > 0.0f) {
            Path path = this.g;
            path.rewind();
            path.addCircle(this.c, this.d, this.e * this.a, Path.Direction.CW);
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public final boolean b() {
        return this.b && this.a >= 1.0f;
    }

    public final void c(View view, float f7, float f10, float f11, float f12) {
        if (this.b || this.f != null) {
            return;
        }
        this.c = f7;
        this.d = f10;
        this.e = (float) Math.sqrt((f12 * f12) + (f11 * f11));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.setDuration((long) Utilities.i(this.e * 0.3f, 550.0f, 250.0f));
        this.f.setInterpolator(org.telegram.ui.Components.gr.j);
        this.f.addUpdateListener(new r(2, this, view));
        this.f.addListener(new bg.f(7, this, view));
        this.f.start();
    }
}
