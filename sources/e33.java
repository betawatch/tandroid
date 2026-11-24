// default package

import android.os.Bundle;
import android.os.ResultReceiver;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e33 {
    public static o13 a(String str, String str2) {
        return rr5.a(str, "CREATE_CANCELED") ? new m13(str2) : rr5.a(str, "CREATE_INTERRUPTED") ? new q13(str2) : new n13(str2, (byte) 2);
    }

    public static vu4 b(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new sl7(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new wu4(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new su4(str2);
            }
        }
        return new uu4(str2, (byte) 2);
    }

    public static void c(ResultReceiver resultReceiver, String str, String str2) {
        resultReceiver.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(ConnectionsManager.DEFAULT_DATACENTER_ID, bundle);
    }
}
