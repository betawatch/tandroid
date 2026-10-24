package ei;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class q2 extends ImageView implements r2 {
    @Override // ei.r2
    public void setInvert(float f7) {
        setColorFilter(new PorterDuffColorFilter(i0.a.f(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
