package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class s4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    public /* synthetic */ s4(i5 i5Var, int i7) {
        this.a = i7;
        this.b = i5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject != null) {
                    TLRPC.TL_help_inviteText tL_help_inviteText = (TLRPC.TL_help_inviteText) tLObject;
                    if (tL_help_inviteText.message.length() != 0) {
                        g0.g3(new w3(1, this.b, tL_help_inviteText));
                        break;
                    }
                }
                break;
            case 1:
                final int i7 = 0;
                final i5 i5Var = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.l4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                i5 i5Var2 = i5Var;
                                if (tL_error == null) {
                                    i5Var2.Y = (TLRPC.GlobalPrivacySettings) tLObject;
                                    i5Var2.G = 2;
                                } else {
                                    i5Var2.G = 0;
                                }
                                i5Var2.getNotificationCenter().k(47, new Object[0]);
                                break;
                            default:
                                i5 i5Var3 = i5Var;
                                if (tL_error == null) {
                                    i5Var3.I = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    i5Var3.H = 2;
                                } else {
                                    i5Var3.H = 0;
                                }
                                i5Var3.getNotificationCenter().k(47, new Object[0]);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final i5 i5Var2 = this.b;
                g0.g3(new Runnable() { // from class: org.telegram.messenger.l4
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i5 i5Var22 = i5Var2;
                                if (tL_error == null) {
                                    i5Var22.Y = (TLRPC.GlobalPrivacySettings) tLObject;
                                    i5Var22.G = 2;
                                } else {
                                    i5Var22.G = 0;
                                }
                                i5Var22.getNotificationCenter().k(47, new Object[0]);
                                break;
                            default:
                                i5 i5Var3 = i5Var2;
                                if (tL_error == null) {
                                    i5Var3.I = ((TLRPC.TL_accountDaysTTL) tLObject).days;
                                    i5Var3.H = 2;
                                } else {
                                    i5Var3.H = 0;
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
