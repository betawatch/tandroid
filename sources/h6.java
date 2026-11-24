// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h6 implements qq7, ee, py4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ h6(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        byte b = this.a;
        return this.b.onInsetsInternal(view, wzcVar);
    }

    @Override // py4
    public final int i() {
        return this.b.getThemedColor(cmb.Z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    @Override // ee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(he heVar, int i) {
        TLRPC.User user;
        String string;
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 2:
                d dVar2 = this.b;
                int currentAccount = dVar2.getCurrentAccount();
                SharedPreferences sharedPreferences = oc7.r1(currentAccount).X3;
                long a1 = gm.a1(sharedPreferences, "support_id2", 0L);
                if (a1 != 0) {
                    user = oc7.r1(currentAccount).W1(Long.valueOf(a1));
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
                            fc4.g(e, true);
                        }
                    }
                    if (user == null) {
                        oc7.r1(currentAccount).c4(user, true, false);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        dVar2.presentFragment(new yv1(bundle));
                        break;
                    } else {
                        he heVar2 = new he(3, null, dVar2.getParentActivity());
                        heVar2.j0 = false;
                        heVar2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new af((Object) sharedPreferences, (Object) heVar2, currentAccount, (Object) dVar2, (byte) 0));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
            case 3:
                oc7.r1(dVar.getCurrentAccount()).C3("spambot", dVar, 1, null);
                break;
            default:
                dVar.presentFragment(new p5c(6, null));
                break;
        }
    }
}
