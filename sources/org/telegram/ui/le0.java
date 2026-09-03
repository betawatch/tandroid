package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class le0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pe0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ le0(pe0 pe0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = pe0Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                pe0 pe0Var = this.b;
                og0 og0Var = pe0Var.U;
                pe0Var.J = false;
                pe0Var.v.invalidate();
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
                                            StringBuilder sb = new StringBuilder();
                                            b.i(R.string.ErrorOccurred, "\n", sb);
                                            sb.append(tL_error.text);
                                            og0Var.l1(string, sb.toString());
                                            break;
                                        }
                                    } else {
                                        og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                                        break;
                                    }
                                } else {
                                    pe0Var.c(true);
                                    og0Var.u1(0, true, null, true);
                                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                                    break;
                                }
                            } else {
                                og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                                break;
                            }
                        } else {
                            og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                            break;
                        }
                    }
                } else {
                    Bundle bundle = this.d;
                    pe0Var.P = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    pe0Var.Q = tL_auth_sentCode;
                    og0Var.g1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                pe0 pe0Var2 = this.b;
                og0 og0Var2 = pe0Var2.U;
                pe0Var2.O = false;
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 == null) {
                    og0Var2.g1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                            pe0Var2.c(true);
                            og0Var2.u1(0, true, null, true);
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error2.code != -1000) {
                            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb2 = new StringBuilder();
                            b.i(R.string.ErrorOccurred, "\n", sb2);
                            sb2.append(tL_error2.text);
                            og0Var2.l1(string2, sb2.toString());
                        }
                    }
                }
                og0Var2.k1(false, true);
                break;
        }
    }

    public /* synthetic */ le0(pe0 pe0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = pe0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
