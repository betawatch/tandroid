// default package

import android.content.SharedPreferences;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class m87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLObject b;

    public /* synthetic */ m87(TLObject tLObject, byte b) {
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
                        sharedPreferences.edit().putString(hg9.j(i, "log_out_token_"), Utilities.f(serializedData.toByteArray())).putInt("count", i + 1).apply();
                        BackupAgent.a();
                        break;
                    }
                }
                break;
            default:
                if (!(tLObject instanceof TLRPC.TL_help_passportConfig)) {
                    gda.n();
                    break;
                } else {
                    TLRPC.TL_help_passportConfig tL_help_passportConfig = (TLRPC.TL_help_passportConfig) tLObject;
                    String str = tL_help_passportConfig.countries_langs.data;
                    int i2 = tL_help_passportConfig.hash;
                    gda.g0 = null;
                    gda.f0 = str;
                    gda.h0 = i2;
                    gda.x();
                    gda.n();
                    break;
                }
        }
    }
}
