// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class iee {
    public static d13 a(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1678407252) {
                if (hashCode != -543568185) {
                    if (hashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            string.getClass();
                            return new u13(string, bundle);
                        } catch (Exception unused) {
                            throw new nr4();
                        }
                    }
                } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new e13("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                }
                throw new nr4();
            }
            if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    string2.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    e13 e13Var = new e13("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle2);
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return e13Var;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new nr4();
                }
            }
            throw new nr4();
        } catch (nr4 unused4) {
            e13 e13Var2 = new e13(str, bundle);
            if (str.length() > 0) {
                return e13Var2;
            }
            lq5.j("type should not be empty");
            return null;
        }
    }
}
