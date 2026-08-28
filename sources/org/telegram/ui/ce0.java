package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ge0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ ce0(ge0 ge0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = ge0Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ge0 ge0Var = this.b;
                fg0 fg0Var = ge0Var.T;
                ge0Var.I = false;
                ge0Var.v.invalidate();
                TLObject tLObject = this.e;
                if (tLObject == null) {
                    TLRPC.TL_error tL_error = this.c;
                    if (tL_error != null && (str = tL_error.text) != null) {
                        if (!str.contains("PHONE_NUMBER_INVALID")) {
                            if (!tL_error.text.contains("PHONE_CODE_EMPTY") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                                if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                                        if (tL_error.code != -1000) {
                                            String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                            StringBuilder sb2 = new StringBuilder();
                                            org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb2);
                                            sb2.append(tL_error.text);
                                            fg0Var.l1(string, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                                        break;
                                    }
                                } else {
                                    ge0Var.c(true);
                                    fg0Var.u1(0, true, null, true);
                                    fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                                    break;
                                }
                            } else {
                                fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                                break;
                            }
                        } else {
                            fg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                            break;
                        }
                    }
                } else {
                    Bundle bundle = this.d;
                    ge0Var.O = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ge0Var.P = tL_auth_sentCode;
                    fg0Var.g1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                ge0 ge0Var2 = this.b;
                fg0 fg0Var2 = ge0Var2.T;
                ge0Var2.N = false;
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 == null) {
                    fg0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                            ge0Var2.c(true);
                            fg0Var2.u1(0, true, null, true);
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            fg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error2.code != -1000) {
                            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb3 = new StringBuilder();
                            org.telegram.ui.Cells.j2.k(R.string.ErrorOccurred, "\n", sb3);
                            sb3.append(tL_error2.text);
                            fg0Var2.l1(string2, sb3.toString());
                        }
                    }
                }
                fg0Var2.k1(false, true);
                break;
        }
    }

    public /* synthetic */ ce0(ge0 ge0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = ge0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
