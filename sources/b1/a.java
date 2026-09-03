package b1;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.ConnectionsManager;
import w0.i;
import w0.k;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public static w0.d a(String str, String str2) {
        return j.a(str, "CREATE_CANCELED") ? new w0.b(str2) : j.a(str, "CREATE_INTERRUPTED") ? new w0.e(str2) : new w0.c(str2, 2);
    }

    public static i b(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new k(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new w0.j(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new w0.g(str2);
            }
        }
        return new w0.h(str2, 2);
    }

    public static void c(ResultReceiver resultReceiver, String str, String errMsg) {
        j.e(resultReceiver, "<this>");
        j.e(errMsg, "errMsg");
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", errMsg);
        resultReceiver.send(ConnectionsManager.DEFAULT_DATACENTER_ID, bundle);
    }

    public static void d(ResultReceiver resultReceiver, int i10, int i11, Intent intent) {
        j.e(resultReceiver, "<this>");
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i10);
        bundle.putParcelable("RESULT_DATA", intent);
        resultReceiver.send(i11, bundle);
    }
}
