package n2;

import android.text.TextUtils;
import j3.r0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final ArrayList h;
    public final ArrayList i;

    public l(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString(TeXSymbolParser.TYPE_ATTR);
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f = jSONObject.optString("skuDetailsToken");
        this.g = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                arrayList.add(new k(optJSONArray.getJSONObject(i9)));
            }
            this.h = arrayList;
        } else {
            this.h = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                arrayList2.add(new i(optJSONArray2.getJSONObject(i10)));
            }
            this.i = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.i = null;
        } else {
            arrayList2.add(new i(optJSONObject));
            this.i = arrayList2;
        }
    }

    public final i a() {
        ArrayList arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (i) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return TextUtils.equals(this.a, ((l) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        String valueOf = String.valueOf(this.h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        r0.A(sb2, this.a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.c);
        sb2.append("', productType='");
        sb2.append(this.d);
        sb2.append("', title='");
        sb2.append(this.e);
        sb2.append("', productDetailsToken='");
        sb2.append(this.f);
        sb2.append("', subscriptionOfferDetails=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
