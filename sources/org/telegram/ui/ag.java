package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ag(Object obj, int i7, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = tLObject;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i7 = this.a;
        int i10 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.ub((an) obj4, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 10));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                q10 q10Var = (q10) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = LaunchActivity.B1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    org.telegram.messenger.qp.s1(launchActivity.O).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new q10(10, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new bi.ub(launchActivity, q10Var, tL_error, updates, this.b, 19));
                break;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.hc.a0(passkeysActivity).f0(tL_error2, false);
                        arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                        passkeysActivity.a.f3.O(true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.hc.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.j(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.a.f3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.c8 c8Var = (org.telegram.ui.Wallet.c8) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c8Var.f1 = 0;
                if (cardVar2 == null) {
                    if (cardVar != null) {
                        org.telegram.ui.Wallet.c8.e0(i10, cardVar);
                    }
                    if (!c8Var.a1) {
                        if (tL_error3 != null) {
                            org.telegram.ui.Components.hc.a0(c8Var.a).f0(tL_error3, false);
                        }
                        c8Var.d1 = false;
                        TL_wallet.card cardVar3 = c8Var.b1;
                        if (cardVar3 != null) {
                            c8Var.d(cardVar3);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.c8.e0(i10, cardVar2);
                    if (!c8Var.a1) {
                        if (!c8Var.d1) {
                            c8Var.d(cardVar2);
                            break;
                        } else {
                            c8Var.b1 = cardVar2;
                            c8Var.c1 = org.telegram.ui.Wallet.c8.T(cardVar2);
                            c8Var.Q();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ ag(LaunchActivity launchActivity, q10 q10Var, int i7) {
        this.a = 1;
        this.c = launchActivity;
        this.d = q10Var;
        this.b = i7;
    }
}
