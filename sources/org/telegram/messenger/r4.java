package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class r4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;

    public /* synthetic */ r4(g5 g5Var, int i7) {
        this.a = i7;
        this.b = g5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        g0.h3(new b4(1, this.b, tL_help_inviteText));
                        break;
                    }
                }
                break;
            case 1:
                final int i7 = 0;
                final g5 g5Var = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.k4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                g5 g5Var2 = g5Var;
                                if (tL_error == null) {
                                    g5Var2.X = (TLRPC.GlobalPrivacySettings) tLObject;
                                    g5Var2.F = 2;
                                } else {
                                    g5Var2.F = 0;
                                }
                                g5Var2.getNotificationCenter().k(47, new Object[0]);
                                break;
                            default:
                                g5 g5Var3 = g5Var;
                                if (tL_error == null) {
                                    g5Var3.H = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    g5Var3.G = 2;
                                } else {
                                    g5Var3.G = 0;
                                }
                                g5Var3.getNotificationCenter().k(47, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final g5 g5Var2 = this.b;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.k4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                g5 g5Var22 = g5Var2;
                                if (tL_error == null) {
                                    g5Var22.X = (TLRPC.GlobalPrivacySettings) tLObject;
                                    g5Var22.F = 2;
                                } else {
                                    g5Var22.F = 0;
                                }
                                g5Var22.getNotificationCenter().k(47, new Object[0]);
                                break;
                            default:
                                g5 g5Var3 = g5Var2;
                                if (tL_error == null) {
                                    g5Var3.H = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    g5Var3.G = 2;
                                } else {
                                    g5Var3.G = 0;
                                }
                                g5Var3.getNotificationCenter().k(47, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
