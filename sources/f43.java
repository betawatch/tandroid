// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class f43 extends l13 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f43(String str, Bundle bundle, byte b) {
        super(str, bundle);
        switch (b) {
            case 2:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                if (str.length() > 0) {
                    return;
                }
                w26.j("password should not be empty");
                throw null;
            case 3:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                w26.j("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                bundle.getClass();
                if (str.length() > 0) {
                    return;
                }
                w26.j("type should not be empty");
                throw null;
        }
    }
}
