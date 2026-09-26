package org.telegram.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pg implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pg(org.telegram.ui.ActionBar.m2 m2Var, int i10, TLObject tLObject, int i11) {
        this.a = i11;
        this.c = m2Var;
        this.b = i10;
        this.d = tLObject;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        TLRPC.Updates updates;
        int i10 = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ei.l3((wn) obj4, this.b, (Boolean) obj, (TLRPC.WebPage) obj2, (TL_account.getWebPagePreview) obj3, 16));
                break;
            case 1:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                n80 n80Var = (n80) obj3;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.B1;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    MessagesController.getInstance(launchActivity.O).processUpdates(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        AndroidUtilities.runOnUIThread(new n80(2, launchActivity, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult));
                    }
                    updates = null;
                }
                AndroidUtilities.runOnUIThread(new ei.l3(launchActivity, n80Var, tL_error, updates, this.b, 26));
                break;
            default:
                PasskeysActivity passkeysActivity = (PasskeysActivity) obj4;
                TL_account.Passkey passkey = (TL_account.Passkey) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = passkeysActivity.b;
                boolean z10 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolFalse;
                int i11 = this.b;
                if (!z10) {
                    if (tL_error2 != null) {
                        org.telegram.ui.Components.xc.a0(passkeysActivity).d0(tL_error2, false);
                        arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                        passkeysActivity.a.Y2.N(true);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.xc.a0(passkeysActivity).c0("FALSE", false);
                    arrayList.add(Utilities.clamp(i11, arrayList.size(), 0), passkey);
                    passkeysActivity.a.Y2.N(true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ pg(LaunchActivity launchActivity, n80 n80Var, int i10) {
        this.a = 1;
        this.c = launchActivity;
        this.d = n80Var;
        this.b = i10;
    }
}
