package d5;

import org.json.JSONObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class m {
    public final String a;
    public final long b;
    public final String c;
    public final String d;

    public m(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.c = jSONObject.optString("priceCurrencyCode");
        this.a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
