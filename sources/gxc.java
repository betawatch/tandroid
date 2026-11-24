// default package

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gxc {
    public fxc a;

    public gxc(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new exc(bc3.b(i, interpolator, j));
        } else {
            this.a = new cxc(i, interpolator, j);
        }
    }
}
