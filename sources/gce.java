// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class gce {
    public static x23 a(String str, Bundle bundle) {
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            string.getClass();
                            q53 q53Var = new q53("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    return q53Var;
                                } catch (Exception unused) {
                                }
                            }
                            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                        } catch (Exception unused2) {
                            throw new kr4();
                        }
                    }
                    throw new kr4();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string2 == null) {
                            throw new sl7("The device does not contain a restore credential.");
                        }
                        q53 q53Var2 = new q53("androidx.credentials.TYPE_RESTORE_CREDENTIAL", bundle);
                        if (string2.length() != 0) {
                            try {
                                new JSONObject(string2);
                                return q53Var2;
                            } catch (Exception unused3) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new kr4();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string3.getClass();
                            string4.getClass();
                            return new q53(string4, bundle, (byte) 2);
                        } catch (Exception unused4) {
                            throw new kr4();
                        }
                    }
                    throw new kr4();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string5 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string5.getClass();
                            return new q53(string5, bundle, (byte) 3);
                        } catch (Exception unused5) {
                            throw new kr4();
                        }
                    }
                    throw new kr4();
                default:
                    throw new kr4();
            }
        } catch (kr4 unused6) {
            return new q53(str, bundle, (byte) 0);
        }
    }
}
