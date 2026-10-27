package fi;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s6 {
    public final q9 c;
    public q6 d;
    public CameraView f;
    public Bitmap g;
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final p6 h = new p6(this, 0);
    public final String e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public s6(Context context, q9 q9Var) {
        this.c = q9Var;
        Utilities.globalQueue.postRunnable(new e2.q0(12, this, context));
    }

    public final void a(CameraView cameraView) {
        this.f = cameraView;
        if (this.a.get() == null || this.b.get()) {
            return;
        }
        Utilities.globalQueue.cancelRunnable(this.h);
        Utilities.globalQueue.postRunnable(this.h, b());
    }

    public final long b() {
        if (this.d == null) {
            return 750L;
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 1) {
            return devicePerformanceClass != 2 ? 800L : 80L;
        }
        return 400L;
    }

    public final void c(boolean z10) {
        if (this.b.getAndSet(z10) == z10) {
            return;
        }
        if (!z10) {
            Utilities.globalQueue.cancelRunnable(this.h);
            Utilities.globalQueue.postRunnable(this.h, b());
            return;
        }
        Utilities.globalQueue.cancelRunnable(this.h);
        if (this.d != null) {
            this.d = null;
            AndroidUtilities.runOnUIThread(new p6(this, 1));
        }
    }
}
