package org.telegram.ui.Components;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ x2(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    @Override // org.telegram.ui.ActionBar.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        TLRPC.User user;
        String string;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.f2 f2Var = this.b;
                int currentAccount = f2Var.getCurrentAccount();
                SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(currentAccount).e7;
                long b12 = org.telegram.messenger.g0.b1(sharedPreferences, "support_id2", 0L);
                if (b12 != 0) {
                    user = org.telegram.messenger.qp.s1(currentAccount).a2(Long.valueOf(b12));
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
                        org.telegram.messenger.qp.s1(currentAccount).X3(user, true, false);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        f2Var.presentFragment(new org.telegram.ui.an(bundle));
                        break;
                    } else {
                        org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, f2Var.getParentActivity(), null);
                        u1Var2.i0 = false;
                        u1Var2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new di.i8(sharedPreferences, u1Var2, currentAccount, f2Var, 3));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
            default:
                org.telegram.ui.ActionBar.f2 f2Var2 = this.b;
                org.telegram.messenger.qp.s1(f2Var2.getCurrentAccount()).y3("spambot", f2Var2, 1, null);
                break;
        }
    }
}
