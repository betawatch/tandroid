package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ x2(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // org.telegram.ui.ActionBar.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k2 k2Var = this.b;
                int currentAccount = k2Var.getCurrentAccount();
                SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(currentAccount).f7;
                long b12 = org.telegram.messenger.i0.b1(sharedPreferences, "support_id2", 0L);
                if (b12 != 0) {
                    user = org.telegram.messenger.vp.r1(currentAccount).Z1(Long.valueOf(b12));
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
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                    }
                    if (user == null) {
                        org.telegram.messenger.vp.r1(currentAccount).U3(user, true, false);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        k2Var.presentFragment(new org.telegram.ui.un(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, k2Var.getParentActivity(), null);
                        x1Var2.i0 = false;
                        x1Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new org.telegram.ui.b0(sharedPreferences, x1Var2, currentAccount, k2Var, 1));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
            default:
                org.telegram.ui.ActionBar.k2 k2Var2 = this.b;
                org.telegram.messenger.vp.r1(k2Var2.getCurrentAccount()).v3("spambot", k2Var2, 1, null);
                break;
        }
    }
}
