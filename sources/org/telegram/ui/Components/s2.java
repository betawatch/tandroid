package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 b;

    public /* synthetic */ s2(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.a = i10;
        this.b = p2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // org.telegram.ui.ActionBar.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.p2 p2Var = this.b;
                MessagesController.getInstance(p2Var.getCurrentAccount()).openByUserName("spambot", p2Var, 1);
                break;
            default:
                org.telegram.ui.ActionBar.p2 p2Var2 = this.b;
                int currentAccount = p2Var2.getCurrentAccount();
                SharedPreferences mainSettings = MessagesController.getMainSettings(currentAccount);
                long prefIntOrLong = AndroidUtilities.getPrefIntOrLong(mainSettings, "support_id2", 0L);
                if (prefIntOrLong != 0) {
                    user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(prefIntOrLong));
                    if (user == null && (string = mainSettings.getString("support_user", null)) != null) {
                        try {
                            byte[] decode = Base64.decode(string, 0);
                            if (decode != null) {
                                SerializedData serializedData = new SerializedData(decode);
                                TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                                if (TLdeserialize != null && TLdeserialize.id == 333000) {
                                    TLdeserialize = null;
                                }
                                serializedData.cleanup();
                                user = TLdeserialize;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    if (user == null) {
                        MessagesController.getInstance(currentAccount).putUser(user, true);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        p2Var2.presentFragment(new org.telegram.ui.eo(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(p2Var2.getParentActivity(), 3, null);
                        d2Var2.g0 = false;
                        d2Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new di.c5(mainSettings, d2Var2, currentAccount, p2Var2, 2));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
        }
    }
}
