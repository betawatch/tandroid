package ei;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class q2 extends ImageView implements r2 {
    @Override // ei.r2
    public void setInvert(float f7) {
        setColorFilter(new PorterDuffColorFilter(i0.a.f(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
