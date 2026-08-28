package ih;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.kd0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ a1(f1 f1Var, int i9) {
        this.a = i9;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                this.b.q();
                break;
            case 2:
                this.b.t(true);
                break;
            case 3:
                f1 f1Var = this.b;
                NotificationCenter.getInstance(f1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var.v.id));
                f1Var.u(true);
                break;
            case 4:
                this.b.w();
                break;
            case 5:
                this.b.t(true);
                break;
            case 6:
                f1 f1Var2 = this.b;
                if (f1Var2.A != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = f1Var2.A;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
                    f1Var2.I.clear();
                    f1Var2.A = null;
                }
                f1Var2.k();
                break;
            case 7:
                this.b.t(true);
                break;
            case 8:
                this.b.t(true);
                break;
            case 9:
                f1 f1Var3 = this.b;
                if (f1Var3.A != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = f1Var3.A;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 4));
                    f1Var3.I.clear();
                    f1Var3.A = null;
                }
                f1Var3.k();
                break;
            case 10:
                this.b.p();
                break;
            case 11:
                this.b.q();
                break;
            default:
                f1 f1Var4 = this.b;
                if (!f1Var4.n) {
                    kd0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new bg.i(f1Var4, 17));
                    break;
                }
                break;
        }
    }
}
