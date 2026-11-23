package ii;

import ai.y1;
import bi.o1;
import bi.v3;
import bi.w4;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements q1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h(long j3, y1 y1Var, int i7, long j10, w4 w4Var) {
        this.c = j3;
        this.e = y1Var;
        this.b = i7;
        this.d = j10;
        this.f = w4Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                y1 y1Var = (y1) this.e;
                w4 w4Var = (w4) this.f;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    j jVar = new j(T, this.c, twoStepVerificationActivity, y1Var, this.b, this.d, w4Var);
                    twoStepVerificationActivity.a0 = 1;
                    twoStepVerificationActivity.c0 = jVar;
                    twoStepVerificationActivity.x0(new b(T, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            default:
                boolean[] zArr = (boolean[]) this.e;
                v3 v3Var = (v3) this.f;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i10 = this.b;
                    setcustomverification.bot = np.u1(i10).q1(this.c);
                    setcustomverification.peer = np.u1(i10).l1(this.d);
                    ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new o1(24, zArr, v3Var));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h(boolean[] zArr, int i7, long j3, long j10, v3 v3Var) {
        this.e = zArr;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.f = v3Var;
    }
}
