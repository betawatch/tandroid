package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp implements org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, org.telegram.messenger.tr {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ cp(mp mpVar, int i7) {
        this.a = i7;
        this.b = mpVar;
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
                return mp.b0(this.b, tL_error);
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.w0(true);
                break;
            case 1:
                mp mpVar = this.b;
                mpVar.y0(true);
                ep epVar = new ep(mpVar, 0);
                if (!mpVar.K && !mpVar.L) {
                    mpVar.getMessagesController().m(mpVar.x.id, mpVar.w, 0, mpVar.Y0, mpVar, true, epVar, new cp(mpVar, 3), null);
                    break;
                } else {
                    mpVar.getMessagesController().P4(mpVar.x.id, mpVar.w, mpVar.K ? mpVar.M : mp.t0(false), mpVar.S, false, mpVar, mpVar.Z0, mpVar.K, mpVar.Y0, epVar, new cp(mpVar, 2));
                    break;
                }
                break;
            case 2:
            case 3:
            default:
                mp mpVar2 = this.b;
                mpVar2.getClass();
                mpVar2.presentFragment(new cb1(6, null));
                break;
            case 4:
                this.b.finishFragment();
                break;
            case 5:
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                mp mpVar3 = this.b;
                ni.c cVar = new ni.c(21, mpVar3, twoStepVerificationActivity);
                twoStepVerificationActivity.Z = 0;
                twoStepVerificationActivity.b0 = cVar;
                mpVar3.presentFragment(twoStepVerificationActivity);
                break;
        }
    }

    @Override // org.telegram.messenger.tr
    public void run(long j3) {
        mp.Z(this.b, j3);
    }
}
