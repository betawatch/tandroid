package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ec0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ bc0(ec0 ec0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = ec0Var;
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
        ec0 ec0Var = this.b;
        switch (i7) {
            case 0:
                ee0 ee0Var = ec0Var.b0;
                ec0Var.N = false;
                ec0Var.w.invalidate();
                if (tLObject == null) {
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
                                            sb2.append(tL_error.text);
                                            ee0Var.D1(M0, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, null));
                                        break;
                                    }
                                } else {
                                    ec0Var.c(true);
                                    ee0Var.M1(0, true, null, true);
                                    ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                                    break;
                                }
                            } else {
                                ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, null));
                                break;
                            }
                        } else {
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, null));
                            break;
                        }
                    }
                } else {
                    ec0Var.T = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ec0Var.U = tL_auth_sentCode;
                    ee0Var.y1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                ee0 ee0Var2 = ec0Var.b0;
                ec0Var.S = false;
                if (tL_error == null) {
                    ee0Var2.y1(bundle, (TLRPC.TL_auth_sentCode) tLObject, true);
                } else {
                    String str2 = tL_error.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, null));
                        } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            ec0Var.c(true);
                            ee0Var2.M1(0, true, null, true);
                            ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, null));
                        } else if (tL_error.code != -1000) {
                            String M02 = org.telegram.messenger.gd.M0(2131745876, null);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.ui.Cells.c0.u(null, 2131751094, sb3, "\n");
                            sb3.append(tL_error.text);
                            ee0Var2.D1(M02, sb3.toString());
                        }
                    }
                }
                ee0Var2.C1(false, true);
                break;
        }
    }

    public /* synthetic */ bc0(ec0 ec0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = ec0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
