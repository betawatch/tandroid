// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class bu2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qu2 b;

    public /* synthetic */ bu2(qu2 qu2Var, byte b) {
        this.a = b;
        this.b = qu2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 1;
        final qu2 qu2Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        gl.c3(new ee2(qu2Var, tL_help_inviteText, b2));
                        break;
                    }
                }
                break;
            case 1:
                final byte b3 = 0;
                gl.c3(new Runnable() { // from class: vt2
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        qu2 qu2Var2 = qu2Var;
                        switch (b4) {
                            case 0:
                                if (tL_error2 == null) {
                                    qu2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    qu2Var2.G = (byte) 2;
                                } else {
                                    qu2Var2.G = (byte) 0;
                                }
                                qu2Var2.getNotificationCenter().k(47, new Object[0]);
                                break;
                            default:
                                if (tL_error2 == null) {
                                    qu2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    qu2Var2.H = (byte) 2;
                                } else {
                                    qu2Var2.H = (byte) 0;
                                }
                                qu2Var2.getNotificationCenter().k(47, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                gl.c3(new Runnable() { // from class: vt2
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        qu2 qu2Var2 = qu2Var;
                        switch (b4) {
                            case 0:
                                if (tL_error2 == null) {
                                    qu2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    qu2Var2.G = (byte) 2;
                                } else {
                                    qu2Var2.G = (byte) 0;
                                }
                                qu2Var2.getNotificationCenter().k(47, new Object[0]);
                                break;
                            default:
                                if (tL_error2 == null) {
                                    qu2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    qu2Var2.H = (byte) 2;
                                } else {
                                    qu2Var2.H = (byte) 0;
                                }
                                qu2Var2.getNotificationCenter().k(47, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
