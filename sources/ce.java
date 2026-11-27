// default package

import android.app.Activity;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ce implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ pcc e;
    public final /* synthetic */ long f;

    public /* synthetic */ ce(int i, long j, long j2, pcc pccVar, long j3, byte b) {
        this.a = b;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = pccVar;
        this.f = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        vnb x53Var;
        switch (this.a) {
            case 0:
                int i = this.b;
                long j = jxa.v(i, false).m().amount;
                long j2 = this.c;
                pcc pccVar = this.e;
                long j3 = this.f;
                if (j >= j2) {
                    pccVar.a(Long.valueOf(j3));
                    break;
                } else {
                    Activity u0 = hl.u0();
                    e S = LaunchActivity.S();
                    if (!PhotoViewer.q0().V0()) {
                        if (S == null) {
                            x53Var = null;
                        } else if (!S.hasShownSheet()) {
                            x53Var = S.getResourceProvider();
                        }
                        vnb vnbVar = x53Var;
                        if (u0 == null) {
                            long j4 = this.d;
                            new dza(u0, vnbVar, j2, 13, wf3.r(i, j4), new ve(pccVar, j3, (byte) 0), j4).show();
                            break;
                        }
                    }
                    x53Var = new x53();
                    vnb vnbVar2 = x53Var;
                    if (u0 == null) {
                    }
                }
                break;
            default:
                int i2 = this.b;
                ce ceVar = new ce(i2, this.c, this.d, this.e, this.f, (byte) 0);
                if (!jxa.v(i2, false).e) {
                    jxa v = jxa.v(i2, false);
                    v.e = false;
                    v.n(ceVar, false, true);
                    v.e = true;
                    break;
                } else {
                    ceVar.run();
                    break;
                }
        }
    }
}
