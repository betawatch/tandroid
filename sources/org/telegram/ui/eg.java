package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eg(Object obj, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = tLObject;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.a;
        int i11 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.ub((sn) obj4, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 17));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                b80 b80Var = (b80) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.C1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.O).lambda$processUpdates$377(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new b80(2, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new ai.ub(launchActivity, b80Var, tL_error, updates, this.b, 26));
                break;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.xc.a0(passkeysActivity).f0(tL_error2, false);
                        arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                        passkeysActivity.a.W2.N(true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.xc.a0(passkeysActivity).e0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.a.W2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.z7 z7Var = (org.telegram.ui.Wallet.z7) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                z7Var.a1 = 0;
                if (cardVar2 == null) {
                    if (cardVar != null) {
                        org.telegram.ui.Wallet.z7.g0(i11, cardVar);
                    }
                    if (!z7Var.V0) {
                        if (tL_error3 != null) {
                            org.telegram.ui.Components.xc.a0(z7Var.a).f0(tL_error3, false);
                        }
                        z7Var.Y0 = false;
                        TL_wallet.card cardVar3 = z7Var.W0;
                        if (cardVar3 != null) {
                            z7Var.d(cardVar3);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.z7.g0(i11, cardVar2);
                    if (!z7Var.V0) {
                        if (!z7Var.Y0) {
                            z7Var.d(cardVar2);
                            break;
                        } else {
                            z7Var.W0 = cardVar2;
                            z7Var.X0 = org.telegram.ui.Wallet.z7.V(cardVar2);
                            z7Var.S();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ eg(LaunchActivity launchActivity, b80 b80Var, int i10) {
        this.a = 1;
        this.c = launchActivity;
        this.d = b80Var;
        this.b = i10;
    }
}
