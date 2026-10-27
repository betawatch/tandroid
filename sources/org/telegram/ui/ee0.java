package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ie0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ TLObject e;

    public /* synthetic */ ee0(ie0 ie0Var, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
        this.b = ie0Var;
        this.e = tLObject;
        this.d = bundle;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ie0 ie0Var = this.b;
                ig0 ig0Var = ie0Var.a0;
                ie0Var.M = false;
                ie0Var.v.invalidate();
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
                                            d3.p(R.string.ErrorOccurred, "\n", sb2);
                                            sb2.append(tL_error.text);
                                            ig0Var.q1(string, sb2.toString());
                                            break;
                                        }
                                    } else {
                                        ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                                        break;
                                    }
                                } else {
                                    ie0Var.c(true);
                                    ig0Var.z1(0, true, null, true);
                                    ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                                    break;
                                }
                            } else {
                                ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                                break;
                            }
                        } else {
                            ig0Var.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                            break;
                        }
                    }
                } else {
                    Bundle bundle = this.d;
                    ie0Var.S = bundle;
                    TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                    ie0Var.T = tL_auth_sentCode;
                    ig0Var.l1(bundle, tL_auth_sentCode, true);
                    break;
                }
                break;
            default:
                ie0 ie0Var2 = this.b;
                ig0 ig0Var2 = ie0Var2.a0;
                ie0Var2.R = false;
                TLRPC.TL_error tL_error2 = this.c;
                if (tL_error2 == null) {
                    ig0Var2.l1(this.d, (TLRPC.TL_auth_sentCode) this.e, true);
                } else {
                    String str2 = tL_error2.text;
                    if (str2 != null) {
                        if (str2.contains("PHONE_NUMBER_INVALID")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                        } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                        } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                            ie0Var2.c(true);
                            ig0Var2.z1(0, true, null, true);
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                        } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                            ig0Var2.q1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                        } else if (tL_error2.code != -1000) {
                            String string2 = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                            StringBuilder sb3 = new StringBuilder();
                            d3.p(R.string.ErrorOccurred, "\n", sb3);
                            sb3.append(tL_error2.text);
                            ig0Var2.q1(string2, sb3.toString());
                        }
                    }
                }
                ig0Var2.p1(false, true);
                break;
        }
    }

    public /* synthetic */ ee0(ie0 ie0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.b = ie0Var;
        this.c = tL_error;
        this.d = bundle;
        this.e = tLObject;
    }
}
