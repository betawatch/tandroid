package hi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gz;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class b6 {
    public final t8 c;
    public z5 d;
    public CameraView f;
    public Bitmap g;
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final y5 h = new y5(this, 0);
    public final String e = np.s1(m10.t0).V2;

    public b6(Context context, t8 t8Var) {
        this.c = t8Var;
        Utilities.e.c(new h4(5, this, context));
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
        int o4 = gz.o();
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
            org.telegram.messenger.g0.h3(new y5(this, 1));
        }
    }
}
