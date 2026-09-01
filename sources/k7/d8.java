package k7;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class d8 {
    public static v0.c a(String type, Bundle data) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(data, "data");
        try {
            int hashCode = type.hashCode();
            if (hashCode != -1678407252) {
                if (hashCode != -543568185) {
                    if (hashCode == -95037569 && type.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            kotlin.jvm.internal.j.b(string);
                            return new v0.f(string, data);
                        } catch (Exception unused) {
                            throw new z0.a();
                        }
                    }
                } else if (type.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new v0.d("android.credentials.TYPE_PASSWORD_CREDENTIAL", data);
                }
                throw new z0.a();
            }
            if (type.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = data.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    kotlin.jvm.internal.j.b(string2);
                    Bundle bundle = new Bundle();
                    bundle.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    v0.d dVar = new v0.d("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return dVar;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new z0.a();
                }
            }
            throw new z0.a();
        } catch (z0.a unused4) {
            v0.d dVar2 = new v0.d(type, data);
            if (type.length() > 0) {
                return dVar2;
            }
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
