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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ pe0 b;

    public /* synthetic */ ne0(pe0 pe0Var, int i10) {
        this.a = i10;
        this.b = pe0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final pe0 pe0Var = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pe0 pe0Var2 = pe0Var;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                pe0Var2.getClass();
                                if (tL_error2 == null) {
                                    pe0Var2.n = (TL_account.Password) tLObject2;
                                    pe0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                wg0 wg0Var = pe0Var2.y;
                                wg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        wg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (wg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
                                            n01Var.a |= 256;
                                            n01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            n01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.o01(n01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.T = formatSpannable;
                                        b2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new z10(17, pe0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = wg0Var.showDialog(b2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                wg0 wg0Var2 = pe0Var2.y;
                                pe0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new ne0(pe0Var2, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    wg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (wg0Var2.getParentActivity() != null) {
                                        pe0Var2.a.setText("");
                                        wg0.U0(wg0Var2, pe0Var2.x, true);
                                        break;
                                    }
                                } else {
                                    wg0Var2.v1(false, true);
                                    pe0Var2.postDelayed(new r80(18, pe0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final pe0 pe0Var2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pe0 pe0Var22 = pe0Var2;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                pe0Var22.getClass();
                                if (tL_error2 == null) {
                                    pe0Var22.n = (TL_account.Password) tLObject2;
                                    pe0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                wg0 wg0Var = pe0Var22.y;
                                wg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        wg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (wg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
                                            n01Var.a |= 256;
                                            n01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            n01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.o01(n01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.T = formatSpannable;
                                        b2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new z10(17, pe0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = wg0Var.showDialog(b2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                wg0 wg0Var2 = pe0Var22.y;
                                pe0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new ne0(pe0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    wg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (wg0Var2.getParentActivity() != null) {
                                        pe0Var22.a.setText("");
                                        wg0.U0(wg0Var2, pe0Var22.x, true);
                                        break;
                                    }
                                } else {
                                    wg0Var2.v1(false, true);
                                    pe0Var22.postDelayed(new r80(18, pe0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final pe0 pe0Var3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.oe0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i122 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        pe0 pe0Var22 = pe0Var3;
                        int i13 = 0;
                        switch (i122) {
                            case 0:
                                pe0Var22.getClass();
                                if (tL_error2 == null) {
                                    pe0Var22.n = (TL_account.Password) tLObject2;
                                    pe0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                wg0 wg0Var = pe0Var22.y;
                                wg0Var.k1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        wg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        wg0Var.l1(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue < 60 ? LocaleController.formatPluralString("Seconds", intValue, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (wg0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
                                            n01Var.a |= 256;
                                            n01Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            n01Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.o01(n01Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder formatSpannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf);
                                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                                        b2Var.T = formatSpannable;
                                        b2Var.R = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        alertDialog$Builder.k(LocaleController.getString(R.string.Continue), new z10(17, pe0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = wg0Var.showDialog(b2Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                wg0 wg0Var2 = pe0Var22.y;
                                pe0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.n2) wg0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new ne0(pe0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    wg0Var2.k1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                            wg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, intValue2 < 60 ? LocaleController.formatPluralString("Seconds", intValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", intValue2 / 60, new Object[0])));
                                            break;
                                        }
                                    } else if (wg0Var2.getParentActivity() != null) {
                                        pe0Var22.a.setText("");
                                        wg0.U0(wg0Var2, pe0Var22.x, true);
                                        break;
                                    }
                                } else {
                                    wg0Var2.v1(false, true);
                                    pe0Var22.postDelayed(new r80(18, pe0Var22, tLObject2), 150L);
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
