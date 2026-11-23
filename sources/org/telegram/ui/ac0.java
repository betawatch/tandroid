package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                de0 de0Var = dc0Var.b0;
                dc0Var.N = false;
                dc0Var.w.invalidate();
                if (tLObject == null) {
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String N0 = org.telegram.messenger.gd.N0(2131745875, null);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                                            sb2.append(tL_error.text);
                                            de0Var.D1(N0, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131750670, null));
                                        break;
                                    }
                                } else {
                                    dc0Var.c(true);
                                    de0Var.M1(0, true, null, true);
                                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, null));
                                    break;
                                }
                            } else {
                                de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748990, null));
                                break;
                            }
                        } else {
                            de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748986, null));
                            break;
                        }
                    }
                } else {
                    dc0Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    dc0Var.U = tL_auth_sentCode;
                    de0Var.y1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                de0 de0Var2 = dc0Var.b0;
                dc0Var.S = false;
                if (tL_error == null) {
                    de0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748986, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748990, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            dc0Var.c(true);
                            de0Var2.M1(0, true, null, true);
                            de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, null));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            de0Var2.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131750670, null));
                        } else if (tL_error.code != -1000) {
                            String N02 = org.telegram.messenger.gd.N0(2131745875, null);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.ui.Cells.c0.u(null, 2131751093, sb3, "\n");
                            sb3.append(tL_error.text);
                            de0Var2.D1(N02, sb3.toString());
                        }
                    }
                }
                de0Var2.C1(false, true);
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
