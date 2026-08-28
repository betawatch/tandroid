package kh;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v6 {
    public final w9 c;
    public t6 d;
    public CameraView f;
    public Bitmap g;
    public final AtomicReference a = new AtomicReference();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final s6 h = new s6(this, 0);
    public final String e = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix;

    public v6(Context context, w9 w9Var) {
        this.c = w9Var;
        Utilities.globalQueue.postRunnable(new ih.j7(20, this, context));
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
            AndroidUtilities.runOnUIThread(new s6(this, 1));
        }
    }
}
