package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gy0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ gy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final ProfileActivity profileActivity = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                    break;
                                }
                                break;
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error4);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error5);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 3;
                final ProfileActivity profileActivity2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                    break;
                                }
                                break;
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error4);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error5);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 0;
                final ProfileActivity profileActivity3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity3), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity3), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                    break;
                                }
                                break;
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity3), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error4);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity3), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error5);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 2;
                final ProfileActivity profileActivity4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                TLRPC.TL_error tL_error2 = tL_error;
                                if (tL_error2 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity4), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity4), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error3);
                                    break;
                                }
                                break;
                            case 2:
                                TLRPC.TL_error tL_error4 = tL_error;
                                if (tL_error4 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity4), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error4);
                                    break;
                                }
                                break;
                            default:
                                TLRPC.TL_error tL_error5 = tL_error;
                                if (tL_error5 == null) {
                                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.y3.s(R.string.UnknownError, org.telegram.ui.Components.qc.a0(profileActivity4), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.qc.b0(tL_error5);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new gr0(21, this.b, tLObject));
                    break;
                }
                break;
            default:
                boolean z4 = tLObject instanceof TL_account.TL_password;
                ProfileActivity profileActivity5 = this.b;
                if (!z4) {
                    profileActivity5.getClass();
                    break;
                } else {
                    profileActivity5.E2 = (TL_account.TL_password) tLObject;
                    break;
                }
        }
    }
}
