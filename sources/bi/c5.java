package bi;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.me0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zh.t0 b;

    public /* synthetic */ c5(zh.t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zh.t0 t0Var = this.b;
                if (!t0Var.n) {
                    me0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new org.telegram.ui.web.y1(t0Var, 23));
                    break;
                }
                break;
            case 1:
                this.b.p();
                break;
            case 2:
                this.b.q();
                break;
            case 3:
                this.b.t(true);
                break;
            case 4:
                zh.t0 t0Var2 = this.b;
                NotificationCenter.getInstance(t0Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t0Var2.v.id));
                t0Var2.u(true);
                break;
            case 5:
                this.b.w();
                break;
            case 6:
                this.b.t(true);
                break;
            case 7:
                zh.t0 t0Var3 = this.b;
                if (t0Var3.E != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = t0Var3.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.u0(nativeInstance, 3));
                    t0Var3.M.clear();
                    t0Var3.E = null;
                }
                t0Var3.k();
                break;
            case 8:
                this.b.t(true);
                break;
            case 9:
                this.b.t(true);
                break;
            case 10:
                zh.t0 t0Var4 = this.b;
                if (t0Var4.E != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = t0Var4.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.u0(nativeInstance2, 3));
                    t0Var4.M.clear();
                    t0Var4.E = null;
                }
                t0Var4.k();
                break;
            case 11:
                this.b.p();
                break;
            default:
                this.b.q();
                break;
        }
    }
}
