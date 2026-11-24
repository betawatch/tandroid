// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class h6 implements no7, ed, nw4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;

    public /* synthetic */ h6(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        byte b = this.a;
        return this.b.onInsetsInternal(view, vxcVar);
    }

    @Override // nw4
    public final int i() {
        return this.b.getThemedColor(bkb.Z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    @Override // ed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(hd hdVar, int i) {
        TLRPC.User user;
        String string;
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 2:
                d dVar2 = this.b;
                int currentAccount = dVar2.getCurrentAccount();
                SharedPreferences sharedPreferences = na7.q1(currentAccount).X3;
                long a1 = gl.a1(sharedPreferences, "support_id2", 0L);
                if (a1 != 0) {
                    user = na7.q1(currentAccount).V1(Long.valueOf(a1));
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
                            fa4.g(e, true);
                        }
                    }
                    if (user == null) {
                        na7.q1(currentAccount).a4(user, true, false);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        dVar2.presentFragment(new mu1(bundle));
                        break;
                    } else {
                        hd hdVar2 = new hd(3, null, dVar2.getParentActivity());
                        hdVar2.j0 = false;
                        hdVar2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new ae((Object) sharedPreferences, (Object) hdVar2, currentAccount, (Object) dVar2, (byte) 0));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
            case 3:
                na7.q1(dVar.getCurrentAccount()).A3("spambot", dVar, 1, null);
                break;
            default:
                dVar.presentFragment(new p3c(6, null));
                break;
        }
    }
}
