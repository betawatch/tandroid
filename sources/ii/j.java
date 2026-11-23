package ii;

import ai.s1;
import bi.e0;
import bi.z4;
import di.xb;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u4;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ma1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ma1, ob0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ j(xb xbVar, long j3, long j10, int i7, qb0 qb0Var, t4 t4Var, u4 u4Var) {
        this.d = xbVar;
        this.a = j3;
        this.b = j10;
        this.c = i7;
        this.e = qb0Var;
        this.f = t4Var;
        this.h = u4Var;
    }

    @Override // org.telegram.ui.ma1
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        g2 g2Var = (g2) this.d;
        TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.e;
        e0 e0Var = new e0((s1) this.f, this.c, this.b, g2Var, (z4) this.h);
        int currentAccount = g2Var.getCurrentAccount();
        boolean[] zArr = n.a;
        if (zArr[currentAccount]) {
            return;
        }
        zArr[currentAccount] = true;
        n.b(g2Var, this.a, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, e0Var);
    }

    @Override // org.telegram.ui.Components.ob0
    public void o(qb0 qb0Var, int i7) {
        b5.g((xb) this.d, null, this.a, this.b, this.c, (qb0) this.e, (t4) this.f, (u4) this.h);
    }

    public /* synthetic */ j(g2 g2Var, long j3, TwoStepVerificationActivity twoStepVerificationActivity, s1 s1Var, int i7, long j10, z4 z4Var) {
        this.d = g2Var;
        this.a = j3;
        this.e = twoStepVerificationActivity;
        this.f = s1Var;
        this.c = i7;
        this.b = j10;
        this.h = z4Var;
    }
}
