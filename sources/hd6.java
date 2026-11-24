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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hd6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jd6 b;

    public /* synthetic */ hd6(jd6 jd6Var, byte b) {
        this.a = b;
        this.b = jd6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final jd6 jd6Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gl.c3(new Runnable() { // from class: id6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jd6 jd6Var2 = jd6Var;
                        byte b4 = 0;
                        switch (b3) {
                            case 0:
                                if (tL_error2 == null) {
                                    jd6Var2.n = (TL_account.Password) tLObject2;
                                    jd6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                mf6 mf6Var = jd6Var2.E;
                                mf6Var.x1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        mf6Var.y1(k96.M0(2131745878, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        mf6Var.y1(k96.M0(2131742597, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (mf6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            vib vibVar = new vib();
                                            vibVar.a |= 256;
                                            vibVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            vibVar.c = i2;
                                            valueOf.setSpan(new wib(vibVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = gl.m0(k96.M0(2131745887, null), valueOf);
                                        hd hdVar = alertDialog$Builder.a;
                                        hdVar.U = m0;
                                        hdVar.S = k96.M0(2131745885, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(k96.M0(2131751759, null), new h45(jd6Var2, tL_auth_passwordRecovery, (byte) 19));
                                        Dialog showDialog = mf6Var.showDialog(hdVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                mf6 mf6Var2 = jd6Var2.E;
                                jd6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mf6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new hd6(jd6Var2, b4), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    mf6Var2.x1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            mf6Var2.y1(k96.M0(2131745878, null), k96.a0("FloodWaitTime", null, 2131750669, intValue2 < 60 ? k96.G(intValue2, "Seconds", new Object[0]) : k96.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (mf6Var2.getParentActivity() != null) {
                                        jd6Var2.a.setText("");
                                        mf6.D1(jd6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    mf6Var2.J1(false, true);
                                    jd6Var2.postDelayed(new kz5(jd6Var2, tLObject2, (byte) 16), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 1;
                gl.c3(new Runnable() { // from class: id6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jd6 jd6Var2 = jd6Var;
                        byte b4 = 0;
                        switch (b32) {
                            case 0:
                                if (tL_error2 == null) {
                                    jd6Var2.n = (TL_account.Password) tLObject2;
                                    jd6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                mf6 mf6Var = jd6Var2.E;
                                mf6Var.x1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        mf6Var.y1(k96.M0(2131745878, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        mf6Var.y1(k96.M0(2131742597, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (mf6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            vib vibVar = new vib();
                                            vibVar.a |= 256;
                                            vibVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            vibVar.c = i2;
                                            valueOf.setSpan(new wib(vibVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = gl.m0(k96.M0(2131745887, null), valueOf);
                                        hd hdVar = alertDialog$Builder.a;
                                        hdVar.U = m0;
                                        hdVar.S = k96.M0(2131745885, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(k96.M0(2131751759, null), new h45(jd6Var2, tL_auth_passwordRecovery, (byte) 19));
                                        Dialog showDialog = mf6Var.showDialog(hdVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                mf6 mf6Var2 = jd6Var2.E;
                                jd6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mf6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new hd6(jd6Var2, b4), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    mf6Var2.x1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            mf6Var2.y1(k96.M0(2131745878, null), k96.a0("FloodWaitTime", null, 2131750669, intValue2 < 60 ? k96.G(intValue2, "Seconds", new Object[0]) : k96.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (mf6Var2.getParentActivity() != null) {
                                        jd6Var2.a.setText("");
                                        mf6.D1(jd6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    mf6Var2.J1(false, true);
                                    jd6Var2.postDelayed(new kz5(jd6Var2, tLObject2, (byte) 16), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b4 = 2;
                gl.c3(new Runnable() { // from class: id6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b32 = b4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jd6 jd6Var2 = jd6Var;
                        byte b42 = 0;
                        switch (b32) {
                            case 0:
                                if (tL_error2 == null) {
                                    jd6Var2.n = (TL_account.Password) tLObject2;
                                    jd6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                mf6 mf6Var = jd6Var2.E;
                                mf6Var.x1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        mf6Var.y1(k96.M0(2131745878, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        mf6Var.y1(k96.M0(2131742597, null), k96.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? k96.G(intValue, "Seconds", new Object[0]) : k96.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (mf6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            vib vibVar = new vib();
                                            vibVar.a |= 256;
                                            vibVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            vibVar.c = i2;
                                            valueOf.setSpan(new wib(vibVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = gl.m0(k96.M0(2131745887, null), valueOf);
                                        hd hdVar = alertDialog$Builder.a;
                                        hdVar.U = m0;
                                        hdVar.S = k96.M0(2131745885, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(k96.M0(2131751759, null), new h45(jd6Var2, tL_auth_passwordRecovery, (byte) 19));
                                        Dialog showDialog = mf6Var.showDialog(hdVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                mf6 mf6Var2 = jd6Var2.E;
                                jd6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mf6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new hd6(jd6Var2, b42), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    mf6Var2.x1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            mf6Var2.y1(k96.M0(2131745878, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            mf6Var2.y1(k96.M0(2131745878, null), k96.a0("FloodWaitTime", null, 2131750669, intValue2 < 60 ? k96.G(intValue2, "Seconds", new Object[0]) : k96.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (mf6Var2.getParentActivity() != null) {
                                        jd6Var2.a.setText("");
                                        mf6.D1(jd6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    mf6Var2.J1(false, true);
                                    jd6Var2.postDelayed(new kz5(jd6Var2, tLObject2, (byte) 16), 150L);
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
