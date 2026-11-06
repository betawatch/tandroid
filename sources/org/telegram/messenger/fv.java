package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class fv {
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

    public final void c(View view, float f10, float f11, float f12, float f13) {
        if (this.b || this.f != null) {
            return;
        }
        this.c = f10;
        this.d = f11;
        this.e = (float) Math.sqrt((f13 * f13) + (f12 * f12));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.setDuration((long) Utilities.i(this.e * 0.3f, 550.0f, 250.0f));
        this.f.setInterpolator(org.telegram.ui.Components.xq.j);
        this.f.addUpdateListener(new q(2, this, view));
        this.f.addListener(new ah.l(12, this, view));
        this.f.start();
    }
}
