package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ hy0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i10 = this.a;
        final ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                int i11 = ProfileActivity.R6;
                final int i12 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i13 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i13) {
                            case 0:
                                int i14 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                int i15 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                int i16 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                int i17 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
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
                int i13 = ProfileActivity.R6;
                final int i14 = 3;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i14;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i132) {
                            case 0:
                                int i142 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                int i15 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                int i16 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                int i17 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i16;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i132) {
                            case 0:
                                int i142 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                int i152 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                int i162 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                int i17 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
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
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.iy0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i18;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i132) {
                            case 0:
                                int i142 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                int i152 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                int i162 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.wc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                int i172 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.wh.n(R.string.UnknownError, org.telegram.ui.Components.wc.b0(profileActivity2), null);
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
                    AndroidUtilities.runOnUIThread(new by0(4, profileActivity, tLObject));
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
