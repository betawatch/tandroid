package ii;

import ai.v1;
import bi.e0;
import di.xb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.oa1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements oa1, qb0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ j(xb xbVar, long j3, long j10, int i7, sb0 sb0Var, t4 t4Var, u4 u4Var) {
        this.d = xbVar;
        this.a = j3;
        this.b = j10;
        this.c = i7;
        this.e = sb0Var;
        this.f = t4Var;
        this.h = u4Var;
    }

    @Override // org.telegram.ui.oa1
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        h2 h2Var = (h2) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
        e0 e0Var = new e0((v1) this.f, this.c, this.b, h2Var, (bi.t4) this.h);
        int currentAccount = h2Var.getCurrentAccount();
        boolean[] zArr = n.a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        n.b(h2Var, this.a, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, e0Var);
    }

    @Override // org.telegram.ui.Components.qb0
    public void n(sb0 sb0Var, int i7) {
        b5.g((xb) this.d, null, this.a, this.b, this.c, (sb0) this.e, (t4) this.f, (u4) this.h);
    }

    public /* synthetic */ j(h2 h2Var, long j3, TwoStepVerificationActivity twoStepVerificationActivity, v1 v1Var, int i7, long j10, bi.t4 t4Var) {
        this.d = h2Var;
        this.a = j3;
        this.e = twoStepVerificationActivity;
        this.f = v1Var;
        this.c = i7;
        this.b = j10;
        this.h = t4Var;
    }
}
