package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;

    public /* synthetic */ v2(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i3;
        this.b = d2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // org.telegram.ui.ActionBar.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2 d2Var = this.b;
                int currentAccount = d2Var.getCurrentAccount();
                SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(currentAccount).e7;
                long b12 = org.telegram.messenger.g0.b1(sharedPreferences, "support_id2", 0L);
                if (b12 != 0) {
                    user = org.telegram.messenger.hp.s1(currentAccount).a2(Long.valueOf(b12));
                    if (user == null && (string = sharedPreferences.getString("support_user", null)) != null) {
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
                            org.telegram.messenger.a8.g(e10, true);
                        }
                    }
                    if (user == null) {
                        org.telegram.messenger.hp.s1(currentAccount).X3(user, true, false);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        d2Var.presentFragment(new org.telegram.ui.wm(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, d2Var.getParentActivity(), null);
                        s1Var2.j0 = false;
                        s1Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new ei.i8(sharedPreferences, s1Var2, currentAccount, d2Var, 3));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.b;
                org.telegram.messenger.hp.s1(d2Var2.getCurrentAccount()).y3("spambot", d2Var2, 1, null);
                break;
        }
    }
}
