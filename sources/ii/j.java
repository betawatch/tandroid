package ii;

import ai.y1;
import bi.e0;
import bi.w4;
import di.xb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.v4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.oa1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements oa1, rb0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ j(xb xbVar, long j3, long j10, int i7, tb0 tb0Var, u4 u4Var, v4 v4Var) {
        this.d = xbVar;
        this.a = j3;
        this.b = j10;
        this.c = i7;
        this.e = tb0Var;
        this.f = u4Var;
        this.h = v4Var;
    }

    @Override // org.telegram.ui.oa1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        g2 g2Var = (g2) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
        e0 e0Var = new e0((y1) this.f, this.c, this.b, g2Var, (w4) this.h);
        int currentAccount = g2Var.getCurrentAccount();
        boolean[] zArr = n.a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        n.b(g2Var, this.a, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, e0Var);
    }

    @Override // org.telegram.ui.Components.rb0
    public void n(tb0 tb0Var, int i7) {
        c5.g((xb) this.d, null, this.a, this.b, this.c, (tb0) this.e, (u4) this.f, (v4) this.h);
    }

    public /* synthetic */ j(g2 g2Var, long j3, TwoStepVerificationActivity twoStepVerificationActivity, y1 y1Var, int i7, long j10, w4 w4Var) {
        this.d = g2Var;
        this.a = j3;
        this.e = twoStepVerificationActivity;
        this.f = y1Var;
        this.c = i7;
        this.b = j10;
        this.h = w4Var;
    }
}
