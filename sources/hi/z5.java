package hi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class z5 {
    public final s8 c;
    public x5 d;
    public CameraView f;
    public Bitmap g;
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final w5 h = new w5(this, 0);
    public final String e = mp.u1(j10.t0).X2;

    public z5(Context context, s8 s8Var) {
        this.c = s8Var;
        Utilities.e.c(new c(9, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f = cameraView;
        if (this.a.get() == null || this.b.get()) {
            return;
        }
        Utilities.e.a(this.h);
        Utilities.e.d(this.h, b());
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o4 = bz.o();
        if (o4 != 1) {
            return o4 != 2 ? 800L : 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.b.getAndSet(z10) == z10) {
            return;
        }
        if (!z10) {
            Utilities.e.a(this.h);
            Utilities.e.d(this.h, b());
            return;
        }
        Utilities.e.a(this.h);
        if (this.d != null) {
            this.d = null;
            org.telegram.messenger.g0.g3(new w5(this, 1));
        }
    }
}
