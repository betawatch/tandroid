package gi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c6 {
    public final w8 c;
    public a6 d;
    public CameraView f;
    public Bitmap g;
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final z5 h = new z5(this, 0);
    public final String e = hp.s1(h10.t0).V2;

    public c6(Context context, w8 w8Var) {
        this.c = w8Var;
        Utilities.e.c(new g2.c(16, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f = cameraView;
        if (this.a.get() == null || this.b.get()) {
            return;
        }
        Utilities.e.a(this.h);
        Utilities.e.e(this.h, b());
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int o10 = az.o();
        if (o10 != 1) {
            return o10 != 2 ? 800L : 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.b.getAndSet(z10) == z10) {
            return;
        }
        if (!z10) {
            Utilities.e.a(this.h);
            Utilities.e.e(this.h, b());
            return;
        }
        Utilities.e.a(this.h);
        if (this.d != null) {
            this.d = null;
            org.telegram.messenger.g0.h3(new z5(this, 1));
        }
    }
}
