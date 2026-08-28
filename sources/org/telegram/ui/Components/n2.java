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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 b;

    public /* synthetic */ n2(int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = i9;
        this.b = o2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // org.telegram.ui.ActionBar.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.o2 o2Var = this.b;
                MessagesController.getInstance(o2Var.getCurrentAccount()).openByUserName("spambot", o2Var, 1);
                break;
            default:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.b;
                int currentAccount = o2Var2.getCurrentAccount();
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                    }
                    if (user == null) {
                        MessagesController.getInstance(currentAccount).putUser(user, true);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        o2Var2.presentFragment(new org.telegram.ui.qn(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(o2Var2.getParentActivity(), 3, null);
                        c2Var2.c0 = false;
                        c2Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new ih.f8(mainSettings, c2Var2, currentAccount, o2Var2, 3));
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
