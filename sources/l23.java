// default package

import android.os.Bundle;
import android.os.ResultReceiver;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class l23 {
    public static w03 a(String str, String str2) {
        return ur5.a(str, "CREATE_CANCELED") ? new u03(str2) : ur5.a(str, "CREATE_INTERRUPTED") ? new y03(str2) : new v03(str2, (byte) 2);
    }

    public static yu4 b(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new om7(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new zu4(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new vu4(str2);
            }
        }
        return new xu4(str2, (byte) 2);
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
