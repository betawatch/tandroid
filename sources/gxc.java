// default package

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
