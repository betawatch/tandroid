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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gf6 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ if6 b;

    public /* synthetic */ gf6(if6 if6Var, byte b) {
        this.a = b;
        this.b = if6Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final if6 if6Var = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                gm.c3(new Runnable() { // from class: hf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b3 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        if6 if6Var2 = if6Var;
                        byte b4 = 0;
                        switch (b3) {
                            case 0:
                                if (tL_error2 == null) {
                                    if6Var2.n = (TL_account.Password) tLObject2;
                                    if6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                mh6 mh6Var = if6Var2.E;
                                mh6Var.y1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        mh6Var.z1(jb6.M0(2131745804, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        mh6Var.z1(jb6.M0(2131742523, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (mh6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            wkb wkbVar = new wkb();
                                            wkbVar.a |= 256;
                                            wkbVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            wkbVar.c = i2;
                                            valueOf.setSpan(new xkb(wkbVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = gm.m0(jb6.M0(2131745813, null), valueOf);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.U = m0;
                                        heVar.S = jb6.M0(2131745811, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(jb6.M0(2131751708, null), new nv4(if6Var2, tL_auth_passwordRecovery, (byte) 20));
                                        Dialog showDialog = mh6Var.showDialog(heVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                mh6 mh6Var2 = if6Var2.E;
                                if6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new gf6(if6Var2, b4), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    mh6Var2.y1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue2 < 60 ? jb6.G(intValue2, "Seconds", new Object[0]) : jb6.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (mh6Var2.getParentActivity() != null) {
                                        if6Var2.a.setText("");
                                        mh6.E1(if6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    mh6Var2.K1(false, true);
                                    if6Var2.postDelayed(new k16(if6Var2, tLObject2, (byte) 17), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 1;
                gm.c3(new Runnable() { // from class: hf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b32 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        if6 if6Var2 = if6Var;
                        byte b4 = 0;
                        switch (b32) {
                            case 0:
                                if (tL_error2 == null) {
                                    if6Var2.n = (TL_account.Password) tLObject2;
                                    if6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                mh6 mh6Var = if6Var2.E;
                                mh6Var.y1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        mh6Var.z1(jb6.M0(2131745804, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        mh6Var.z1(jb6.M0(2131742523, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (mh6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            wkb wkbVar = new wkb();
                                            wkbVar.a |= 256;
                                            wkbVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            wkbVar.c = i2;
                                            valueOf.setSpan(new xkb(wkbVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = gm.m0(jb6.M0(2131745813, null), valueOf);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.U = m0;
                                        heVar.S = jb6.M0(2131745811, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(jb6.M0(2131751708, null), new nv4(if6Var2, tL_auth_passwordRecovery, (byte) 20));
                                        Dialog showDialog = mh6Var.showDialog(heVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                mh6 mh6Var2 = if6Var2.E;
                                if6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new gf6(if6Var2, b4), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    mh6Var2.y1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue2 < 60 ? jb6.G(intValue2, "Seconds", new Object[0]) : jb6.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (mh6Var2.getParentActivity() != null) {
                                        if6Var2.a.setText("");
                                        mh6.E1(if6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    mh6Var2.K1(false, true);
                                    if6Var2.postDelayed(new k16(if6Var2, tLObject2, (byte) 17), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b4 = 2;
                gm.c3(new Runnable() { // from class: hf6
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i;
                        byte b32 = b4;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        if6 if6Var2 = if6Var;
                        byte b42 = 0;
                        switch (b32) {
                            case 0:
                                if (tL_error2 == null) {
                                    if6Var2.n = (TL_account.Password) tLObject2;
                                    if6Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                mh6 mh6Var = if6Var2.E;
                                mh6Var.y1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        mh6Var.z1(jb6.M0(2131745804, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        mh6Var.z1(jb6.M0(2131742523, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue < 60 ? jb6.G(intValue, "Seconds", new Object[0]) : jb6.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (mh6Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            wkb wkbVar = new wkb();
                                            wkbVar.a |= 256;
                                            wkbVar.b = indexOf;
                                            int i2 = lastIndexOf + 1;
                                            wkbVar.c = i2;
                                            valueOf.setSpan(new xkb(wkbVar, 0), indexOf, i2, 0);
                                        }
                                        SpannableStringBuilder m0 = gm.m0(jb6.M0(2131745813, null), valueOf);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.U = m0;
                                        heVar.S = jb6.M0(2131745811, "RestoreEmailSentTitle");
                                        alertDialog$Builder.j(jb6.M0(2131751708, null), new nv4(if6Var2, tL_auth_passwordRecovery, (byte) 20));
                                        Dialog showDialog = mh6Var.showDialog(heVar);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                mh6 mh6Var2 = if6Var2.E;
                                if6Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i = ((d) mh6Var2).currentAccount;
                                    ConnectionsManager.getInstance(i).sendRequest(getpassword, new gf6(if6Var2, b42), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    mh6Var2.y1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            mh6Var2.z1(jb6.M0(2131745804, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            mh6Var2.z1(jb6.M0(2131745804, null), jb6.a0("FloodWaitTime", null, 2131750618, intValue2 < 60 ? jb6.G(intValue2, "Seconds", new Object[0]) : jb6.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (mh6Var2.getParentActivity() != null) {
                                        if6Var2.a.setText("");
                                        mh6.E1(if6Var2.y, true);
                                        break;
                                    }
                                } else {
                                    mh6Var2.K1(false, true);
                                    if6Var2.postDelayed(new k16(if6Var2, tLObject2, (byte) 17), 150L);
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
