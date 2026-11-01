package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ kd0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ hd0(kd0 kd0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = kd0Var;
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
        kd0 kd0Var = this.b;
        switch (i10) {
            case 0:
                gf0 gf0Var = kd0Var.a0;
                kd0Var.M = false;
                kd0Var.w.invalidate();
                if (tLObject == null) {
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.messenger.a30.q(null, 2131751106, sb2, "\n");
                                            sb2.append(tL_error.text);
                                            gf0Var.u1(L0, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, null));
                                        break;
                                    }
                                } else {
                                    kd0Var.c(true);
                                    gf0Var.D1(0, true, null, true);
                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, null));
                                    break;
                                }
                            } else {
                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749193, null));
                                break;
                            }
                        } else {
                            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, null));
                            break;
                        }
                    }
                } else {
                    kd0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    kd0Var.T = tL_auth_sentCode;
                    gf0Var.p1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                gf0 gf0Var2 = kd0Var.a0;
                kd0Var.R = false;
                if (tL_error == null) {
                    gf0Var2.p1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749193, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            kd0Var.c(true);
                            gf0Var2.D1(0, true, null, true);
                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, null));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, null));
                        } else if (tL_error.code != -1000) {
                            String L02 = org.telegram.messenger.dd.L0(2131746088, null);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.messenger.a30.q(null, 2131751106, sb3, "\n");
                            sb3.append(tL_error.text);
                            gf0Var2.u1(L02, sb3.toString());
                        }
                    }
                }
                gf0Var2.t1(false, true);
                break;
        }
    }

    public /* synthetic */ hd0(kd0 kd0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = kd0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
