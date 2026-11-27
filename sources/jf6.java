// default package

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jf6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lf6 b;

    public /* synthetic */ jf6(lf6 lf6Var, byte b) {
        this.a = b;
        this.b = lf6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final lf6 lf6Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                hl.c3(new Runnable() { // from class: kf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lf6 lf6Var2 = lf6Var;
                        byte b4 = 0;
                        switch (b3) {
                            case 0:
                                if (tL_error2 == null) {
                                    lf6Var2.n = (TL_account.Password) tLObject2;
                                    lf6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                qh6 qh6Var = lf6Var2.E;
                                qh6Var.y1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        qh6Var.z1(ob6.M0(2131745798, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        qh6Var.z1(ob6.M0(2131742491, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (qh6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            rmb rmbVar = new rmb();
                                            rmbVar.a |= 256;
                                            rmbVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            rmbVar.c = i2;
                                            valueOf.setSpan(new smb(rmbVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = hl.m0(ob6.M0(2131745807, null), valueOf);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.U = m0;
                                        idVar.S = ob6.M0(2131745805, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(ob6.M0(2131751736, null), new u34(lf6Var2, tL_auth_passwordRecovery, (byte) 24));
                                        Dialog showDialog = qh6Var.showDialog(idVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                qh6 qh6Var2 = lf6Var2.E;
                                lf6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((e) qh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new jf6(lf6Var2, b4), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    qh6Var2.y1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue2 < 60 ? ob6.G(intValue2, "Seconds", new Object[0]) : ob6.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (qh6Var2.getParentActivity() != null) {
                                        lf6Var2.a.setText("");
                                        qh6.E1(lf6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    qh6Var2.K1(false, true);
                                    lf6Var2.postDelayed(new z56(lf6Var2, tLObject2, (byte) 13), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 1;
                hl.c3(new Runnable() { // from class: kf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lf6 lf6Var2 = lf6Var;
                        byte b4 = 0;
                        switch (b32) {
                            case 0:
                                if (tL_error2 == null) {
                                    lf6Var2.n = (TL_account.Password) tLObject2;
                                    lf6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                qh6 qh6Var = lf6Var2.E;
                                qh6Var.y1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        qh6Var.z1(ob6.M0(2131745798, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        qh6Var.z1(ob6.M0(2131742491, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (qh6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            rmb rmbVar = new rmb();
                                            rmbVar.a |= 256;
                                            rmbVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            rmbVar.c = i2;
                                            valueOf.setSpan(new smb(rmbVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = hl.m0(ob6.M0(2131745807, null), valueOf);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.U = m0;
                                        idVar.S = ob6.M0(2131745805, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(ob6.M0(2131751736, null), new u34(lf6Var2, tL_auth_passwordRecovery, (byte) 24));
                                        Dialog showDialog = qh6Var.showDialog(idVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                qh6 qh6Var2 = lf6Var2.E;
                                lf6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((e) qh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new jf6(lf6Var2, b4), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    qh6Var2.y1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue2 < 60 ? ob6.G(intValue2, "Seconds", new Object[0]) : ob6.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (qh6Var2.getParentActivity() != null) {
                                        lf6Var2.a.setText("");
                                        qh6.E1(lf6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    qh6Var2.K1(false, true);
                                    lf6Var2.postDelayed(new z56(lf6Var2, tLObject2, (byte) 13), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b4 = 2;
                hl.c3(new Runnable() { // from class: kf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b32 = b4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        lf6 lf6Var2 = lf6Var;
                        byte b42 = 0;
                        switch (b32) {
                            case 0:
                                if (tL_error2 == null) {
                                    lf6Var2.n = (TL_account.Password) tLObject2;
                                    lf6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                qh6 qh6Var = lf6Var2.E;
                                qh6Var.y1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        qh6Var.z1(ob6.M0(2131745798, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        qh6Var.z1(ob6.M0(2131742491, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue < 60 ? ob6.G(intValue, "Seconds", new Object[0]) : ob6.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (qh6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            rmb rmbVar = new rmb();
                                            rmbVar.a |= 256;
                                            rmbVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            rmbVar.c = i2;
                                            valueOf.setSpan(new smb(rmbVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = hl.m0(ob6.M0(2131745807, null), valueOf);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.U = m0;
                                        idVar.S = ob6.M0(2131745805, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(ob6.M0(2131751736, null), new u34(lf6Var2, tL_auth_passwordRecovery, (byte) 24));
                                        Dialog showDialog = qh6Var.showDialog(idVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                qh6 qh6Var2 = lf6Var2.E;
                                lf6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((e) qh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new jf6(lf6Var2, b42), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    qh6Var2.y1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            qh6Var2.z1(ob6.M0(2131745798, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            qh6Var2.z1(ob6.M0(2131745798, null), ob6.a0("FloodWaitTime", null, 2131750646, intValue2 < 60 ? ob6.G(intValue2, "Seconds", new Object[0]) : ob6.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (qh6Var2.getParentActivity() != null) {
                                        lf6Var2.a.setText("");
                                        qh6.E1(lf6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    qh6Var2.K1(false, true);
                                    lf6Var2.postDelayed(new z56(lf6Var2, tLObject2, (byte) 13), 150L);
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
