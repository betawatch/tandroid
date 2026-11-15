package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, org.telegram.messenger.qr {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ bp(mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
    }

    @Override // org.telegram.messenger.yo
    public boolean d(TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 2:
                this.b.y0(false);
                return true;
            case 3:
                this.b.y0(false);
                return true;
            default:
                return mp.b0(this.b, tL_error);
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.w0(true);
                break;
            case 1:
                mp mpVar = this.b;
                mpVar.y0(true);
                dp dpVar = new dp(mpVar, 0);
                if (!mpVar.L && !mpVar.M) {
                    mpVar.getMessagesController().m(mpVar.x.id, mpVar.w, 0, mpVar.Z0, mpVar, true, dpVar, new bp(mpVar, 3), null);
                    break;
                } else {
                    mpVar.getMessagesController().Q4(mpVar.x.id, mpVar.w, mpVar.L ? mpVar.N : mp.t0(false), mpVar.T, false, mpVar, mpVar.a1, mpVar.L, mpVar.Z0, dpVar, new bp(mpVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                mp mpVar2 = this.b;
                mpVar2.getClass();
                mpVar2.presentFragment(new xa1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                mp mpVar3 = this.b;
                m2.d dVar = new m2.d(25, mpVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.a0 = 0;
                twoStepVerificationActivity.c0 = dVar;
                mpVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.qr
    public void run(long j3) {
        mp.Z(this.b, j3);
    }
}
