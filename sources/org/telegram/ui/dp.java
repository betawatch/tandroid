package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.xo, org.telegram.messenger.or {
    public final /* synthetic */ int a;
    public final /* synthetic */ np b;

    public /* synthetic */ dp(np npVar, int i7) {
        this.a = i7;
        this.b = npVar;
    }

    @Override // org.telegram.messenger.xo
    public boolean e(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.y0(false);
                return true;
            case 3:
                this.b.y0(false);
                return true;
            default:
                return np.b0(this.b, tL_error);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.w0(true);
                break;
            case 1:
                np npVar = this.b;
                npVar.y0(true);
                fp fpVar = new fp(npVar, 0);
                if (!npVar.L && !npVar.M) {
                    npVar.getMessagesController().m(npVar.x.id, npVar.w, 0, npVar.Z0, npVar, true, fpVar, new dp(npVar, 3), null);
                    break;
                } else {
                    npVar.getMessagesController().b5(npVar.x.id, npVar.w, npVar.L ? npVar.N : np.t0(false), npVar.T, false, npVar, npVar.a1, npVar.L, npVar.Z0, fpVar, new dp(npVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                np npVar2 = this.b;
                npVar2.getClass();
                npVar2.presentFragment(new bb1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                np npVar3 = this.b;
                oi.f0 f0Var = new oi.f0(23, npVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.a0 = 0;
                twoStepVerificationActivity.c0 = f0Var;
                npVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.or
    public void run(long j3) {
        np.Z(this.b, j3);
    }
}
