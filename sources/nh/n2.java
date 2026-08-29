package nh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n2 extends ImageView implements o2 {
    @Override // nh.o2
    public void setInvert(float f9) {
        setColorFilter(new PorterDuffColorFilter(i0.a.d(f9, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
