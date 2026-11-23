package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ d3(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // org.telegram.ui.ActionBar.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.g2 g2Var = this.b;
                int currentAccount = g2Var.getCurrentAccount();
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
                        g2Var.presentFragment(new org.telegram.ui.bn(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, g2Var.getParentActivity(), null);
                        t1Var2.j0 = false;
                        t1Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new fi.y7(sharedPreferences, t1Var2, currentAccount, g2Var, 3));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
            default:
                org.telegram.ui.ActionBar.g2 g2Var2 = this.b;
                org.telegram.messenger.mp.u1(g2Var2.getCurrentAccount()).F3("spambot", g2Var2, 1, null);
                break;
        }
    }
}
