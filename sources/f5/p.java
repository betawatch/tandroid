package f5;

import a8.p0;
import android.text.TextUtils;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class p {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public p(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String optString = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
        this.c = optString;
        this.d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return TextUtils.equals(this.a, ((p) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.b);
        sb2.append("', productType='");
        sb2.append(this.c);
        sb2.append("', statusCode=");
        return p0.n(this.d, "}", sb2);
    }
}
