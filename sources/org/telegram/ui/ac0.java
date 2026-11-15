package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ac0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ dc0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ ac0(dc0 dc0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = dc0Var;
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
        dc0 dc0Var = this.b;
        switch (i7) {
            case 0:
                ce0 ce0Var = dc0Var.b0;
                dc0Var.N = false;
                dc0Var.w.invalidate();
                if (tLObject == null) {
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String M0 = org.telegram.messenger.hd.M0(2131746071, null);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.ui.Cells.y0.r(null, 2131751105, sb2, "\n");
                                            sb2.append(tL_error.text);
                                            ce0Var.D1(M0, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, null));
                                        break;
                                    }
                                } else {
                                    dc0Var.c(true);
                                    ce0Var.M1(0, true, null, true);
                                    ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                                    break;
                                }
                            } else {
                                ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, null));
                                break;
                            }
                        } else {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, null));
                            break;
                        }
                    }
                } else {
                    dc0Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    dc0Var.U = tL_auth_sentCode;
                    ce0Var.y1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                ce0 ce0Var2 = dc0Var.b0;
                dc0Var.S = false;
                if (tL_error == null) {
                    ce0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            dc0Var.c(true);
                            ce0Var2.M1(0, true, null, true);
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, null));
                        } else if (tL_error.code != -1000) {
                            String M02 = org.telegram.messenger.hd.M0(2131746071, null);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.ui.Cells.y0.r(null, 2131751105, sb3, "\n");
                            sb3.append(tL_error.text);
                            ce0Var2.D1(M02, sb3.toString());
                        }
                    }
                }
                ce0Var2.C1(false, true);
                break;
        }
    }

    public /* synthetic */ ac0(dc0 dc0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = dc0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
