package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed0 b;

    public /* synthetic */ cd0(ed0 ed0Var, int i10) {
        this.a = i10;
        this.b = ed0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final ed0 ed0Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.dd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ed0 ed0Var2 = ed0Var;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                ed0Var2.getClass();
                                if (tL_error2 == null) {
                                    ed0Var2.n = (TL_account.Password) tLObject2;
                                    ed0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                hf0 hf0Var = ed0Var2.D;
                                hf0Var.s1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131742885, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (hf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                                            yz0Var.a |= 256;
                                            yz0Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            yz0Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.cd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new rv(21, ed0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = hf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                hf0 hf0Var2 = ed0Var2.D;
                                ed0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new cd0(ed0Var2, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    hf0Var2.s1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.cd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (hf0Var2.getParentActivity() != null) {
                                        ed0Var2.a.setText("");
                                        hf0.a1(hf0Var2, ed0Var2.y, true);
                                        break;
                                    }
                                } else {
                                    hf0Var2.D1(false, true);
                                    ed0Var2.postDelayed(new f70(18, ed0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final ed0 ed0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.dd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ed0 ed0Var22 = ed0Var2;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                ed0Var22.getClass();
                                if (tL_error2 == null) {
                                    ed0Var22.n = (TL_account.Password) tLObject2;
                                    ed0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                hf0 hf0Var = ed0Var22.D;
                                hf0Var.s1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131742885, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (hf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                                            yz0Var.a |= 256;
                                            yz0Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            yz0Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.cd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new rv(21, ed0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = hf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                hf0 hf0Var2 = ed0Var22.D;
                                ed0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new cd0(ed0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    hf0Var2.s1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.cd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (hf0Var2.getParentActivity() != null) {
                                        ed0Var22.a.setText("");
                                        hf0.a1(hf0Var2, ed0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    hf0Var2.D1(false, true);
                                    ed0Var22.postDelayed(new f70(18, ed0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final ed0 ed0Var3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.dd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i122 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ed0 ed0Var22 = ed0Var3;
                        int i13 = 0;
                        switch (i122) {
                            case 0:
                                ed0Var22.getClass();
                                if (tL_error2 == null) {
                                    ed0Var22.n = (TL_account.Password) tLObject2;
                                    ed0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                hf0 hf0Var = ed0Var22.D;
                                hf0Var.s1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        hf0Var.t1(org.telegram.messenger.cd.L0(2131742885, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (hf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                                            yz0Var.a |= 256;
                                            yz0Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            yz0Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.cd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.cd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751771, null), new rv(21, ed0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = hf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                hf0 hf0Var2 = ed0Var22.D;
                                ed0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.k2) hf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new cd0(ed0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    hf0Var2.s1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.cd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.cd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (hf0Var2.getParentActivity() != null) {
                                        ed0Var22.a.setText("");
                                        hf0.a1(hf0Var2, ed0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    hf0Var2.D1(false, true);
                                    ed0Var22.postDelayed(new f70(18, ed0Var22, tLObject2), 150L);
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
