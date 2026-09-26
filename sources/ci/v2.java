package ci;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class v2 extends ImageView implements w2 {
    @Override // ci.w2
    public void setInvert(float f7) {
        setColorFilter(new PorterDuffColorFilter(i0.a.d(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
