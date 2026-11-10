package fi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c6 {
    public final v8 c;
    public a6 d;
    public CameraView f;
    public Bitmap g;
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final z5 h = new z5(this, 0);
    public final String e = qp.s1(p10.s0).U2;

    public c6(Context context, v8 v8Var) {
        this.c = v8Var;
        Utilities.e.c(new f2.h(10, context, (Object) this));
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
        int o4 = iz.o();
        if (o4 != 1) {
            return o4 != 2 ? 800L : 80L;
        }
        return 400L;
    }

    public final void c(boolean z9) {
        if (this.b.getAndSet(z9) == z9) {
            return;
        }
        if (!z9) {
            Utilities.e.a(this.h);
            Utilities.e.d(this.h, b());
            return;
        }
        Utilities.e.a(this.h);
        if (this.d != null) {
            this.d = null;
            org.telegram.messenger.g0.h3(new z5(this, 1));
        }
    }
}
