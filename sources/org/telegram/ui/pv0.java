package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ pv0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i10 = this.a;
        final ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                final int i11 = 1;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i12) {
                            case 0:
                                RectF rectF2 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF3 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                RectF rectF2 = ProfileActivity.R6;
                final int i12 = 2;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i122) {
                            case 0:
                                RectF rectF22 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF3 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                RectF rectF3 = ProfileActivity.R6;
                final int i13 = 3;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i13;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i122) {
                            case 0:
                                RectF rectF22 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF32 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                RectF rectF4 = ProfileActivity.R6;
                final int i14 = 0;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.qv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i14;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i122) {
                            case 0:
                                RectF rectF22 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF32 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF42 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.R6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.m5.o(null, 2131743904, org.telegram.ui.Components.cc.a0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.cc.d0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                RectF rectF5 = ProfileActivity.R6;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new et0(14, profileActivity, tLObject));
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TL_account.TL_password)) {
                    RectF rectF6 = ProfileActivity.R6;
                    profileActivity.getClass();
                    break;
                } else {
                    profileActivity.G2 = (TL_account.TL_password) tLObject;
                    break;
                }
        }
    }
}
