package bi;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.de0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ k1(t1 t1Var, int i10) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
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
                t1 t1Var = this.b;
                NotificationCenter.getInstance(t1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.v.id));
                t1Var.u(true);
                break;
            case 4:
                this.b.w();
                break;
            case 5:
                this.b.t(true);
                break;
            case 6:
                t1 t1Var2 = this.b;
                if (t1Var2.E != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = t1Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                    t1Var2.M.clear();
                    t1Var2.E = null;
                }
                t1Var2.k();
                break;
            case 7:
                this.b.t(true);
                break;
            case 8:
                this.b.t(true);
                break;
            case 9:
                t1 t1Var3 = this.b;
                if (t1Var3.E != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = t1Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 3));
                    t1Var3.M.clear();
                    t1Var3.E = null;
                }
                t1Var3.k();
                break;
            case 10:
                this.b.p();
                break;
            case 11:
                this.b.q();
                break;
            default:
                t1 t1Var4 = this.b;
                if (!t1Var4.n) {
                    de0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o1(t1Var4, i10));
                    break;
                }
                break;
        }
    }
}
