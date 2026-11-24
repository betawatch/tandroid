// default package

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hzc {
    public gzc a;

    public hzc(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new fzc(nd3.b(i, interpolator, j));
        } else {
            this.a = new dzc(i, interpolator, j);
        }
    }
}
