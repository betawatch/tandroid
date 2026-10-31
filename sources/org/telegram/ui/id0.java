package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class id0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ld0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ id0(ld0 ld0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = ld0Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10 = this.a;
        TLObject tLObject = this.e;
        Bundle bundle = this.d;
        TLRPC.TL_error tL_error = this.c;
        ld0 ld0Var = this.b;
        switch (i10) {
            case 0:
                hf0 hf0Var = ld0Var.a0;
                ld0Var.M = false;
                ld0Var.w.invalidate();
                if (tLObject == null) {
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.messenger.z20.q(null, 2131751106, sb2, "\n");
                                            sb2.append(tL_error.text);
                                            hf0Var.t1(L0, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, null));
                                        break;
                                    }
                                } else {
                                    ld0Var.c(true);
                                    hf0Var.C1(0, true, null, true);
                                    hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                                    break;
                                }
                            } else {
                                hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749193, null));
                                break;
                            }
                        } else {
                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, null));
                            break;
                        }
                    }
                } else {
                    ld0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ld0Var.T = tL_auth_sentCode;
                    hf0Var.o1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                hf0 hf0Var2 = ld0Var.a0;
                ld0Var.R = false;
                if (tL_error == null) {
                    hf0Var2.o1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749193, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ld0Var.c(true);
                            hf0Var2.C1(0, true, null, true);
                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, null));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, null));
                        } else if (tL_error.code != -1000) {
                            String L02 = org.telegram.messenger.cd.L0(2131746088, null);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.messenger.z20.q(null, 2131751106, sb3, "\n");
                            sb3.append(tL_error.text);
                            hf0Var2.t1(L02, sb3.toString());
                        }
                    }
                }
                hf0Var2.s1(false, true);
                break;
        }
    }

    public /* synthetic */ id0(ld0 ld0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = ld0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
