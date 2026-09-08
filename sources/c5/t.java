package c5;

import android.text.TextUtils;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class t {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public t(String str) {
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
        if (obj instanceof t) {
            return TextUtils.equals(this.a, ((t) obj).a);
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
        return a4.a.n(this.d, "}", sb2);
    }
}
