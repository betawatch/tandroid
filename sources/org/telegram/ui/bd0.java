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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bd0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd0 b;

    public /* synthetic */ bd0(dd0 dd0Var, int i10) {
        this.a = i10;
        this.b = dd0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final dd0 dd0Var = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.cd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11;
                        int i12 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        dd0 dd0Var2 = dd0Var;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                dd0Var2.getClass();
                                if (tL_error2 == null) {
                                    dd0Var2.n = (TL_account.Password) tLObject2;
                                    dd0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                gf0 gf0Var = dd0Var2.D;
                                gf0Var.t1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131742885, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (gf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0();
                                            zz0Var.a |= 256;
                                            zz0Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            zz0Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.a01(zz0Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.dd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.dd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new qv(21, dd0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = gf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                gf0 gf0Var2 = dd0Var2.D;
                                dd0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i11 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i11).sendRequest(getpassword, new bd0(dd0Var2, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    gf0Var2.t1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.dd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (gf0Var2.getParentActivity() != null) {
                                        dd0Var2.a.setText("");
                                        gf0.b1(gf0Var2, dd0Var2.y, true);
                                        break;
                                    }
                                } else {
                                    gf0Var2.E1(false, true);
                                    dd0Var2.postDelayed(new y60(19, dd0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final dd0 dd0Var2 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.cd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        dd0 dd0Var22 = dd0Var2;
                        int i13 = 0;
                        switch (i12) {
                            case 0:
                                dd0Var22.getClass();
                                if (tL_error2 == null) {
                                    dd0Var22.n = (TL_account.Password) tLObject2;
                                    dd0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                gf0 gf0Var = dd0Var22.D;
                                gf0Var.t1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131742885, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (gf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0();
                                            zz0Var.a |= 256;
                                            zz0Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            zz0Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.a01(zz0Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.dd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.dd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new qv(21, dd0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = gf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                gf0 gf0Var2 = dd0Var22.D;
                                dd0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new bd0(dd0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    gf0Var2.t1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.dd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (gf0Var2.getParentActivity() != null) {
                                        dd0Var22.a.setText("");
                                        gf0.b1(gf0Var2, dd0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    gf0Var2.E1(false, true);
                                    dd0Var22.postDelayed(new y60(19, dd0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i12 = 2;
                final dd0 dd0Var3 = this.b;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.cd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112;
                        int i122 = i12;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        dd0 dd0Var22 = dd0Var3;
                        int i13 = 0;
                        switch (i122) {
                            case 0:
                                dd0Var22.getClass();
                                if (tL_error2 == null) {
                                    dd0Var22.n = (TL_account.Password) tLObject2;
                                    dd0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                gf0 gf0Var = dd0Var22.D;
                                gf0Var.t1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        gf0Var.u1(org.telegram.messenger.dd.L0(2131742885, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.dd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (gf0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0();
                                            zz0Var.a |= 256;
                                            zz0Var.b = indexOf;
                                            int i14 = lastIndexOf + 1;
                                            zz0Var.c = i14;
                                            valueOf.setSpan(new org.telegram.ui.Components.a01(zz0Var, 0), indexOf, i14, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.i0.m0(org.telegram.messenger.dd.L0(2131746097, null), valueOf);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.T = m0;
                                        x1Var.R = org.telegram.messenger.dd.L0(2131746095, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751771, null), new qv(21, dd0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = gf0Var.showDialog(x1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                gf0 gf0Var2 = dd0Var22.D;
                                dd0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i112 = ((org.telegram.ui.ActionBar.k2) gf0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i112).sendRequest(getpassword, new bd0(dd0Var22, i13), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    gf0Var2.t1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.dd.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.dd.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (gf0Var2.getParentActivity() != null) {
                                        dd0Var22.a.setText("");
                                        gf0.b1(gf0Var2, dd0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    gf0Var2.E1(false, true);
                                    dd0Var22.postDelayed(new y60(19, dd0Var22, tLObject2), 150L);
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
