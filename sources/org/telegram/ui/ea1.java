package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStepVerificationActivity b;

    public /* synthetic */ ea1(TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = twoStepVerificationActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final TwoStepVerificationActivity twoStepVerificationActivity = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ga1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i7;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (i10) {
                            case 0:
                                twoStepVerificationActivity2.t0();
                                if (!(tLObject2 instanceof TL_account.resetPasswordOk)) {
                                    if (!(tLObject2 instanceof TL_account.resetPasswordRequestedWait)) {
                                        if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                            int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                            twoStepVerificationActivity2.B0(org.telegram.messenger.id.M0(2131746096, null), org.telegram.messenger.id.a0("ResetPasswordWait", null, 2131746095, currentTime > 86400 ? org.telegram.messenger.id.G(currentTime / 86400, "Days", new Object[0]) : currentTime > 3600 ? org.telegram.messenger.id.G(currentTime / 86400, "Hours", new Object[0]) : currentTime > 60 ? org.telegram.messenger.id.G(currentTime / 60, "Minutes", new Object[0]) : org.telegram.messenger.id.G(Math.max(1, currentTime), "Seconds", new Object[0])));
                                            break;
                                        }
                                    } else {
                                        twoStepVerificationActivity2.I.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                        twoStepVerificationActivity2.D0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747832, null), null);
                                    String M0 = org.telegram.messenger.id.M0(2131746096, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131746070, null);
                                    twoStepVerificationActivity2.showDialog(u1Var, new q5(twoStepVerificationActivity2, 17));
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    twoStepVerificationActivity2.getClass();
                                    break;
                                } else {
                                    twoStepVerificationActivity2.I.pending_reset_date = 0;
                                    twoStepVerificationActivity2.D0();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 0;
                final TwoStepVerificationActivity twoStepVerificationActivity2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ha1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity2, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final TwoStepVerificationActivity twoStepVerificationActivity3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ga1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102 = i11;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity22 = twoStepVerificationActivity3;
                        switch (i102) {
                            case 0:
                                twoStepVerificationActivity22.t0();
                                if (!(tLObject2 instanceof TL_account.resetPasswordOk)) {
                                    if (!(tLObject2 instanceof TL_account.resetPasswordRequestedWait)) {
                                        if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                            int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity22.getConnectionsManager().getCurrentTime();
                                            twoStepVerificationActivity22.B0(org.telegram.messenger.id.M0(2131746096, null), org.telegram.messenger.id.a0("ResetPasswordWait", null, 2131746095, currentTime > 86400 ? org.telegram.messenger.id.G(currentTime / 86400, "Days", new Object[0]) : currentTime > 3600 ? org.telegram.messenger.id.G(currentTime / 86400, "Hours", new Object[0]) : currentTime > 60 ? org.telegram.messenger.id.G(currentTime / 60, "Minutes", new Object[0]) : org.telegram.messenger.id.G(Math.max(1, currentTime), "Seconds", new Object[0])));
                                            break;
                                        }
                                    } else {
                                        twoStepVerificationActivity22.I.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                        twoStepVerificationActivity22.D0();
                                        break;
                                    }
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity22.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747832, null), null);
                                    String M0 = org.telegram.messenger.id.M0(2131746096, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131746070, null);
                                    twoStepVerificationActivity22.showDialog(u1Var, new q5(twoStepVerificationActivity22, 17));
                                    break;
                                }
                                break;
                            default:
                                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                                    twoStepVerificationActivity22.getClass();
                                    break;
                                } else {
                                    twoStepVerificationActivity22.I.pending_reset_date = 0;
                                    twoStepVerificationActivity22.D0();
                                    break;
                                }
                        }
                    }
                });
                break;
            case 3:
                final int i12 = 1;
                final TwoStepVerificationActivity twoStepVerificationActivity4 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ha1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity4, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 4:
                final int i13 = 2;
                final TwoStepVerificationActivity twoStepVerificationActivity5 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ha1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity5, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            case 5:
                final int i14 = 3;
                final TwoStepVerificationActivity twoStepVerificationActivity6 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ha1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i14) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity6, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i15 = 4;
                final TwoStepVerificationActivity twoStepVerificationActivity7 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ha1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i15) {
                            case 0:
                                TwoStepVerificationActivity.k0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 1:
                                TwoStepVerificationActivity.Z(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 2:
                                TwoStepVerificationActivity.e0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            case 3:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                            default:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity7, tL_error, tLObject);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
