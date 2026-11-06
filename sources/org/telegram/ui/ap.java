package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, org.telegram.messenger.tr {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ ap(kp kpVar, int i7) {
        this.a = i7;
        this.b = kpVar;
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.y0(false);
                return true;
            case 3:
                this.b.y0(false);
                return true;
            default:
                return kp.b0(this.b, tL_error);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.w0(true);
                break;
            case 1:
                kp kpVar = this.b;
                kpVar.y0(true);
                cp cpVar = new cp(kpVar, 0);
                if (!kpVar.K && !kpVar.L) {
                    kpVar.getMessagesController().m(kpVar.x.id, kpVar.w, 0, kpVar.Y0, kpVar, true, cpVar, new ap(kpVar, 3), null);
                    break;
                } else {
                    kpVar.getMessagesController().P4(kpVar.x.id, kpVar.w, kpVar.K ? kpVar.M : kp.t0(false), kpVar.S, false, kpVar, kpVar.Z0, kpVar.K, kpVar.Y0, cpVar, new ap(kpVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                kp kpVar2 = this.b;
                kpVar2.getClass();
                kpVar2.presentFragment(new ya1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                kp kpVar3 = this.b;
                ni.c cVar = new ni.c(21, kpVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = cVar;
                kpVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        kp.Z(this.b, j3);
    }
}
