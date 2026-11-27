// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class i6 implements nr7, fd, sy4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e b;

    public /* synthetic */ i6(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        byte b = this.a;
        return this.b.onInsetsInternal(view, l2dVar);
    }

    @Override // sy4
    public final int h() {
        return this.b.getThemedColor(aob.a7);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    @Override // fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(id idVar, int i) {
        TLRPC.User user;
        String string;
        byte b = this.a;
        e eVar = this.b;
        switch (b) {
            case 2:
                uc7.s1(eVar.getCurrentAccount()).H3("spambot", eVar, 1, null);
                break;
            case 3:
                e eVar2 = this.b;
                int currentAccount = eVar2.getCurrentAccount();
                SharedPreferences sharedPreferences = uc7.s1(currentAccount).X3;
                long a1 = hl.a1(sharedPreferences, "support_id2", 0L);
                if (a1 != 0) {
                    user = uc7.s1(currentAccount).X1(Long.valueOf(a1));
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
                            cc4.g(e, true);
                        }
                    }
                    if (user == null) {
                        uc7.s1(currentAccount).i4(user, true, false);
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.id);
                        eVar2.presentFragment(new zu1(bundle));
                        break;
                    } else {
                        id idVar2 = new id(3, null, eVar2.getParentActivity());
                        idVar2.j0 = false;
                        idVar2.show();
                        ConnectionsManager.getInstance(currentAccount).sendRequest(new TLRPC.TL_help_getSupport(), new lh((Object) sharedPreferences, (Object) idVar2, currentAccount, (Object) eVar2, (byte) 0));
                        break;
                    }
                }
                user = null;
                if (user == null) {
                }
                break;
            default:
                eVar.presentFragment(new o7c(6, null));
                break;
        }
    }
}
