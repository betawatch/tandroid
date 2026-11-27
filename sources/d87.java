// default package

import android.content.SharedPreferences;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class d87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLObject b;

    public /* synthetic */ d87(TLObject tLObject, byte b) {
        this.a = b;
        this.b = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.TL_auth_loggedOut) {
                    TLRPC.TL_auth_loggedOut tL_auth_loggedOut = (TLRPC.TL_auth_loggedOut) tLObject;
                    if (tL_auth_loggedOut.future_auth_token != null) {
                        SharedPreferences sharedPreferences = a.b.getSharedPreferences("saved_tokens", 0);
                        int i = sharedPreferences.getInt("count", 0);
                        SerializedData serializedData = new SerializedData(tL_auth_loggedOut.getObjectSize());
                        tL_auth_loggedOut.serializeToStream(serializedData);
                        sharedPreferences.edit().putString(uh9.k(i, "log_out_token_"), Utilities.f(serializedData.toByteArray())).putInt("count", i + 1).apply();
                        BackupAgent.a();
                        break;
                    }
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
                    xea.n();
                    break;
                } else {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    String str = tL_help_passportConfig.countries_langs.data;
                    int i2 = tL_help_passportConfig.hash;
                    xea.g0 = null;
                    xea.f0 = str;
                    xea.h0 = i2;
                    xea.x();
                    xea.n();
                    break;
                }
        }
    }
}
