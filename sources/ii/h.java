package ii;

import ai.x1;
import bi.o1;
import bi.v3;
import bi.w4;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements q1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h(long j3, x1 x1Var, int i7, long j10, w4 w4Var) {
        this.c = j3;
        this.e = x1Var;
        this.b = i7;
        this.d = j10;
        this.f = w4Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void h(t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                x1 x1Var = (x1) this.e;
                w4 w4Var = (w4) this.f;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    j jVar = new j(T, this.c, twoStepVerificationActivity, x1Var, this.b, this.d, w4Var);
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
                    setcustomverification.bot = mp.u1(i10).q1(this.c);
                    setcustomverification.peer = mp.u1(i10).l1(this.d);
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
