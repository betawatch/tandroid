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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.m2 b;

    public /* synthetic */ q2(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = i10;
        this.b = m2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // org.telegram.ui.ActionBar.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.m2 m2Var = this.b;
                MessagesController.getInstance(m2Var.getCurrentAccount()).openByUserName("spambot", m2Var, 1);
                break;
            default:
                org.telegram.ui.ActionBar.m2 m2Var2 = this.b;
                int currentAccount = m2Var2.getCurrentAccount();
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
                        m2Var2.presentFragment(new org.telegram.ui.wn(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(m2Var2.getParentActivity(), 3, null);
                        a2Var2.g0 = false;
                        a2Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new ai.za(mainSettings, a2Var2, currentAccount, m2Var2, 3));
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
