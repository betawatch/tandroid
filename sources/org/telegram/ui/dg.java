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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dg(Object obj, int i10, TLObject tLObject, int i11) {
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
                AndroidUtilities.runOnUIThread(new bi.sb((wn) obj4, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 17));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                kz kzVar = (kz) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.D1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.O).lambda$processUpdates$379(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new kz(20, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new bi.sb(launchActivity, kzVar, tL_error, updates, this.b, 26));
                break;
            case 2:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse)) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.wc.b0(passkeysActivity).g0(tL_error2, false);
                        arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                        passkeysActivity.a.g3.O(true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.wc.b0(passkeysActivity).f0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.a.g3.O(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.t7 t7Var = (org.telegram.ui.Wallet.t7) obj4;
                TL_wallet.card cardVar = (TL_wallet.card) obj3;
                TL_wallet.card cardVar2 = (TL_wallet.card) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                t7Var.f1 = 0;
                if (cardVar2 == null) {
                    if (cardVar != null) {
                        org.telegram.ui.Wallet.t7.e0(i11, cardVar);
                    }
                    if (!t7Var.a1) {
                        if (tL_error3 != null) {
                            org.telegram.ui.Components.wc.b0(t7Var.a).g0(tL_error3, false);
                        }
                        t7Var.d1 = false;
                        TL_wallet.card cardVar3 = t7Var.b1;
                        if (cardVar3 != null) {
                            t7Var.d(cardVar3);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.Wallet.t7.e0(i11, cardVar2);
                    if (!t7Var.a1) {
                        if (!t7Var.d1) {
                            t7Var.d(cardVar2);
                            break;
                        } else {
                            t7Var.b1 = cardVar2;
                            t7Var.c1 = org.telegram.ui.Wallet.t7.T(cardVar2);
                            t7Var.Q();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ dg(LaunchActivity launchActivity, kz kzVar, int i10) {
        this.a = 1;
        this.c = launchActivity;
        this.d = kzVar;
        this.b = i10;
    }
}
