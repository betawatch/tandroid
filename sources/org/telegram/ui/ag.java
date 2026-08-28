package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ag(org.telegram.ui.ActionBar.o2 o2Var, int i9, TLObject tLObject, int i10) {
        this.a = i10;
        this.c = o2Var;
        this.b = i9;
        this.d = tLObject;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i9 = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new fh.g1((qn) obj4, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 15));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                x20 x20Var = (x20) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.x1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.K).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new x20(9, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new fh.g1(launchActivity, x20Var, tL_error, updates, this.b, 25));
                break;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i10 = this.b;
                if (!z10) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.oc.a0(passkeysActivity).d0(tL_error2, false);
                        arrayList.add(Utilities.clamp(i10, arrayList.size(), 0), passkey);
                        passkeysActivity.a.U2.N(true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.oc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i10, arrayList.size(), 0), passkey);
                    passkeysActivity.a.U2.N(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ag(LaunchActivity launchActivity, x20 x20Var, int i9) {
        this.a = 1;
        this.c = launchActivity;
        this.d = x20Var;
        this.b = i9;
    }
}
