// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nh9 {
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

    public final void c(View view, float f, float f2, float f3, float f4) {
        if (this.b || this.f != null) {
            return;
        }
        this.c = f;
        this.d = f2;
        this.e = (float) Math.sqrt((f4 * f4) + (f3 * f3));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f = ofFloat;
        ofFloat.setDuration((long) Utilities.i(this.e * 0.3f, 550.0f, 250.0f));
        this.f.setInterpolator(s33.j);
        this.f.addUpdateListener(new pk(this, view, (byte) 26));
        this.f.addListener(new eh8((Object) this, (Object) view, (byte) 9));
        this.f.start();
    }
}
