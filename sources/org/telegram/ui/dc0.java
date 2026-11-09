package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gc0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ dc0(gc0 gc0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = gc0Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i7 = this.a;
        TLObject tLObject = this.e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.c;
        gc0 gc0Var = this.b;
        switch (i7) {
            case 0:
                ee0 ee0Var = gc0Var.a0;
                gc0Var.M = false;
                gc0Var.w.invalidate();
                if (tLObject == null) {
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.messenger.camera.q.q(null, 2131751105, sb2, "\n");
                                            sb2.append(tL_error.text);
                                            ee0Var.D1(M0, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, null));
                                        break;
                                    }
                                } else {
                                    gc0Var.c(true);
                                    ee0Var.M1(0, true, null, true);
                                    ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                                    break;
                                }
                            } else {
                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, null));
                                break;
                            }
                        } else {
                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, null));
                            break;
                        }
                    }
                } else {
                    gc0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    gc0Var.T = tL_auth_sentCode;
                    ee0Var.y1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                ee0 ee0Var2 = gc0Var.a0;
                gc0Var.R = false;
                if (tL_error == null) {
                    ee0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749183, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            gc0Var.c(true);
                            ee0Var2.M1(0, true, null, true);
                            ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, null));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, null));
                        } else if (tL_error.code != -1000) {
                            String M02 = org.telegram.messenger.id.M0(2131746071, null);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.messenger.camera.q.q(null, 2131751105, sb3, "\n");
                            sb3.append(tL_error.text);
                            ee0Var2.D1(M02, sb3.toString());
                        }
                    }
                }
                ee0Var2.C1(false, true);
                break;
        }
    }

    public /* synthetic */ dc0(gc0 gc0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = gc0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
