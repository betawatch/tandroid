package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ re0 b;

    public /* synthetic */ pe0(re0 re0Var, int i10) {
        this.a = i10;
        this.b = re0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final re0 re0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        re0 re0Var2 = re0Var;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                re0Var2.getClass();
                                if (tL_error2 == null) {
                                    re0Var2.n = (TL_account.Password) tLObject2;
                                    re0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                yg0 yg0Var = re0Var2.y;
                                yg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        yg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (yg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.p01 p01Var = new org.telegram.ui.Components.p01();
                                            p01Var.a |= 256;
                                            p01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            p01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.q01(p01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.T = formatSpannable;
                                        c2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new f20(16, re0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = yg0Var.showDialog(c2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                yg0 yg0Var2 = re0Var2.y;
                                re0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.o2) yg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new pe0(re0Var2, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    yg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (yg0Var2.getParentActivity() != null) {
                                        re0Var2.a.setText("");
                                        yg0.U0(yg0Var2, re0Var2.x, true);
                                        break;
                                    }
                                } else {
                                    yg0Var2.v1(false, true);
                                    re0Var2.postDelayed(new oa0(12, re0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final re0 re0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        re0 re0Var22 = re0Var2;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                re0Var22.getClass();
                                if (tL_error2 == null) {
                                    re0Var22.n = (TL_account.Password) tLObject2;
                                    re0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                yg0 yg0Var = re0Var22.y;
                                yg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        yg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (yg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.p01 p01Var = new org.telegram.ui.Components.p01();
                                            p01Var.a |= 256;
                                            p01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            p01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.q01(p01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.T = formatSpannable;
                                        c2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new f20(16, re0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = yg0Var.showDialog(c2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                yg0 yg0Var2 = re0Var22.y;
                                re0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.o2) yg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new pe0(re0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    yg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (yg0Var2.getParentActivity() != null) {
                                        re0Var22.a.setText("");
                                        yg0.U0(yg0Var2, re0Var22.x, true);
                                        break;
                                    }
                                } else {
                                    yg0Var2.v1(false, true);
                                    re0Var22.postDelayed(new oa0(12, re0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final re0 re0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.qe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i122 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        re0 re0Var22 = re0Var3;
                        int i13 = 0;
                        switch (i122) {
                            case 0:
                                re0Var22.getClass();
                                if (tL_error2 == null) {
                                    re0Var22.n = (TL_account.Password) tLObject2;
                                    re0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                yg0 yg0Var = re0Var22.y;
                                yg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        yg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (yg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.p01 p01Var = new org.telegram.ui.Components.p01();
                                            p01Var.a |= 256;
                                            p01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            p01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.q01(p01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                                        c2Var.T = formatSpannable;
                                        c2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new f20(16, re0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = yg0Var.showDialog(c2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                yg0 yg0Var2 = re0Var22.y;
                                re0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.o2) yg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new pe0(re0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    yg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (yg0Var2.getParentActivity() != null) {
                                        re0Var22.a.setText("");
                                        yg0.U0(yg0Var2, re0Var22.x, true);
                                        break;
                                    }
                                } else {
                                    yg0Var2.v1(false, true);
                                    re0Var22.postDelayed(new oa0(12, re0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
