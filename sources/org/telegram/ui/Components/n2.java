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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 b;

    public /* synthetic */ n2(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = i10;
        this.b = n2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // org.telegram.ui.ActionBar.a2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = this.b;
                MessagesController.getInstance(n2Var.getCurrentAccount()).openByUserName("spambot", n2Var, 1);
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.b;
                int currentAccount = n2Var2.getCurrentAccount();
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
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                    }
                    if (user == null) {
                        MessagesController.getInstance(currentAccount).putUser(user, true);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        n2Var2.presentFragment(new org.telegram.ui.rn(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(n2Var2.getParentActivity(), 3, null);
                        b2Var2.c0 = false;
                        b2Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new jh.b8(mainSettings, b2Var2, currentAccount, n2Var2, 3));
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
