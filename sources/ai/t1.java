package ai;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ne0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2 b;

    public /* synthetic */ t1(d2 d2Var, int i10) {
        this.a = i10;
        this.b = d2Var;
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
                d2 d2Var = this.b;
                NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.v.id));
                d2Var.u(true);
                break;
            case 4:
                this.b.w();
                break;
            case 5:
                this.b.t(true);
                break;
            case 6:
                d2 d2Var2 = this.b;
                if (d2Var2.E != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = d2Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                    d2Var2.M.clear();
                    d2Var2.E = null;
                }
                d2Var2.k();
                break;
            case 7:
                this.b.t(true);
                break;
            case 8:
                this.b.t(true);
                break;
            case 9:
                d2 d2Var3 = this.b;
                if (d2Var3.E != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = d2Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 3));
                    d2Var3.M.clear();
                    d2Var3.E = null;
                }
                d2Var3.k();
                break;
            case 10:
                this.b.p();
                break;
            case 11:
                this.b.q();
                break;
            default:
                d2 d2Var4 = this.b;
                if (!d2Var4.n) {
                    ne0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new y1(d2Var4, i10));
                    break;
                }
                break;
        }
    }
}
