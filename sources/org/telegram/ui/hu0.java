package org.telegram.ui;

import android.graphics.RectF;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hu0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ hu0(ProfileActivity profileActivity, int i7) {
        this.a = i7;
        this.b = profileActivity;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        int i7 = this.a;
        final ProfileActivity profileActivity = this.b;
        switch (i7) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                final int i10 = 1;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.iu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i11) {
                            case 0:
                                RectF rectF2 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF3 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                RectF rectF2 = ProfileActivity.Z6;
                final int i11 = 2;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.iu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i112) {
                            case 0:
                                RectF rectF22 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF3 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                RectF rectF3 = ProfileActivity.Z6;
                final int i12 = 3;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.iu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i112) {
                            case 0:
                                RectF rectF22 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF32 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF4 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                RectF rectF4 = ProfileActivity.Z6;
                final int i13 = 0;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.iu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i13;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ProfileActivity profileActivity2 = profileActivity;
                        switch (i112) {
                            case 0:
                                RectF rectF22 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 1:
                                RectF rectF32 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            case 2:
                                RectF rectF42 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                            default:
                                RectF rectF5 = ProfileActivity.Z6;
                                if (tL_error2 == null) {
                                    if (tLObject2 instanceof TLRPC.TL_boolFalse) {
                                        org.telegram.messenger.f3.o(null, 2131743634, org.telegram.ui.Components.lc.b0(profileActivity2), null);
                                        break;
                                    }
                                } else {
                                    org.telegram.ui.Components.lc.e0(tL_error2);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                RectF rectF5 = ProfileActivity.Z6;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new tr0(15, profileActivity, tLObject));
                    break;
                }
                break;
            default:
                if (!(tLObject instanceof TL_account.TL_password)) {
                    RectF rectF6 = ProfileActivity.Z6;
                    profileActivity.getClass();
                    break;
                } else {
                    profileActivity.I2 = (TL_account.TL_password) tLObject;
                    break;
                }
        }
    }
}
