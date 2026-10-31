package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class u4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ u4(i5 i5Var, int i10) {
        this.a = i10;
        this.b = i5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        i0.g3(new e4(1, this.b, tL_help_inviteText));
                        break;
                    }
                }
                break;
            case 1:
                final int i10 = 0;
                final i5 i5Var = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.n4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i5 i5Var2 = i5Var;
                                if (tL_error == null) {
                                    i5Var2.X = (TLRPC.GlobalPrivacySettings) tLObject;
                                    i5Var2.F = 2;
                                } else {
                                    i5Var2.F = 0;
                                }
                                i5Var2.getNotificationCenter().k(47, new Object[0]);
                                break;
                            default:
                                i5 i5Var3 = i5Var;
                                if (tL_error == null) {
                                    i5Var3.H = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    i5Var3.G = 2;
                                } else {
                                    i5Var3.G = 0;
                                }
                                i5Var3.getNotificationCenter().k(47, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final i5 i5Var2 = this.b;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.n4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                i5 i5Var22 = i5Var2;
                                if (tL_error == null) {
                                    i5Var22.X = (TLRPC.GlobalPrivacySettings) tLObject;
                                    i5Var22.F = 2;
                                } else {
                                    i5Var22.F = 0;
                                }
                                i5Var22.getNotificationCenter().k(47, new Object[0]);
                                break;
                            default:
                                i5 i5Var3 = i5Var2;
                                if (tL_error == null) {
                                    i5Var3.H = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    i5Var3.G = 2;
                                } else {
                                    i5Var3.G = 0;
                                }
                                i5Var3.getNotificationCenter().k(47, new Object[0]);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
