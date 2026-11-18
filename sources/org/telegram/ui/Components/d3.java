package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ d3(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // org.telegram.ui.ActionBar.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.h2 h2Var = this.b;
                int currentAccount = h2Var.getCurrentAccount();
                SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(currentAccount).h7;
                long b12 = org.telegram.messenger.g0.b1(sharedPreferences, "support_id2", 0L);
                if (b12 != 0) {
                    user = org.telegram.messenger.mp.u1(currentAccount).c2(Long.valueOf(b12));
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
                        org.telegram.messenger.mp.u1(currentAccount).e4(user, true, false);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        h2Var.presentFragment(new org.telegram.ui.bn(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, h2Var.getParentActivity(), null);
                        u1Var2.j0 = false;
                        u1Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new fi.y7(sharedPreferences, u1Var2, currentAccount, h2Var, 3));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
            default:
                org.telegram.ui.ActionBar.h2 h2Var2 = this.b;
                org.telegram.messenger.mp.u1(h2Var2.getCurrentAccount()).F3("spambot", h2Var2, 1, null);
                break;
        }
    }
}
