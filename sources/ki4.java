// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ki4 extends ImageView implements li4 {
    @Override // li4
    public void setInvert(float f) {
        setColorFilter(new PorterDuffColorFilter(bm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
