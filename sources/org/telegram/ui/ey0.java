package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ey0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ey0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i10 = this.a;
        final int i11 = 3;
        final ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                int i12 = ProfileActivity.R6;
                final int i13 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i14 = i13;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i14) {
                            case 0:
                                int i15 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                int i16 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                int i17 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                int i18 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                int i14 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i142 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i142) {
                            case 0:
                                int i15 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                int i16 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                int i17 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                int i18 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                int i15 = ProfileActivity.R6;
                final int i16 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i142 = i16;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i142) {
                            case 0:
                                int i152 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                int i162 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                int i17 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                int i18 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                int i17 = ProfileActivity.R6;
                final int i18 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.gy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i142 = i18;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i142) {
                            case 0:
                                int i152 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                int i162 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                int i172 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                int i182 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.vh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                int i19 = ProfileActivity.R6;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new fy0(3, profileActivity, tLObject));
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TL_account.TL_password)) {
                    int i20 = ProfileActivity.R6;
                    profileActivity.getClass();
                    break;
                } else {
                    profileActivity.H2 = (TL_account.TL_password) tLObject;
                    break;
                }
        }
    }
}
