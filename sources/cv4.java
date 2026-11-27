// default package

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class cv4 extends j23 {
    public final String e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cv4(String str) {
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", r2, new Bundle(), false, a34.a);
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
        this.e = str;
        if (str.length() != 0) {
            try {
                new JSONObject(str);
                return;
            } catch (Exception unused) {
            }
        }
        lq5.j("credentialJson must not be empty, and must be a valid JSON");
        throw null;
    }
}
