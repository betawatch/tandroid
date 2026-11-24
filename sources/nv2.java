// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class nv2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bw2 b;

    public /* synthetic */ nv2(bw2 bw2Var, byte b) {
        this.a = b;
        this.b = bw2Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        final byte b2 = 1;
        final bw2 bw2Var = this.b;
        switch (b) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        gm.c3(new pf2(bw2Var, tL_help_inviteText, b2));
                        break;
                    }
                }
                break;
            case 1:
                final byte b3 = 0;
                gm.c3(new Runnable() { // from class: gv2
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b3;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        bw2 bw2Var2 = bw2Var;
                        switch (b4) {
                            case 0:
                                if (tL_error2 == null) {
                                    bw2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    bw2Var2.G = (byte) 2;
                                } else {
                                    bw2Var2.G = (byte) 0;
                                }
                                bw2Var2.getNotificationCenter().k(48, new Object[0]);
                                break;
                            default:
                                if (tL_error2 == null) {
                                    bw2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    bw2Var2.H = (byte) 2;
                                } else {
                                    bw2Var2.H = (byte) 0;
                                }
                                bw2Var2.getNotificationCenter().k(48, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                gm.c3(new Runnable() { // from class: gv2
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b4 = b2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        bw2 bw2Var2 = bw2Var;
                        switch (b4) {
                            case 0:
                                if (tL_error2 == null) {
                                    bw2Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject2;
                                    bw2Var2.G = (byte) 2;
                                } else {
                                    bw2Var2.G = (byte) 0;
                                }
                                bw2Var2.getNotificationCenter().k(48, new Object[0]);
                                break;
                            default:
                                if (tL_error2 == null) {
                                    bw2Var2.I = ((TLRPC.TL_accountDaysTTL) tLObject2).days;
                                    bw2Var2.H = (byte) 2;
                                } else {
                                    bw2Var2.H = (byte) 0;
                                }
                                bw2Var2.getNotificationCenter().k(48, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
