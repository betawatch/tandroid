package c5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class n {
    public final String a;
    public final m b;

    public n(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").getClass();
        this.a = jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        m mVar = new m();
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new l(optJSONObject));
                }
            }
        }
        mVar.a = arrayList;
        this.b = mVar;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getInt("commitmentPaymentsCount");
            optJSONObject2.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("transitionPlanDetails");
        if (optJSONObject3 != null) {
            optJSONObject3.getString("productId");
            optJSONObject3.optString("title");
            optJSONObject3.optString("name");
            optJSONObject3.optString("description");
            optJSONObject3.optString("basePlanId");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("pricingPhase");
            if (optJSONObject4 != null) {
                optJSONObject4.optString("billingPeriod");
                optJSONObject4.optString("priceCurrencyCode");
                optJSONObject4.optString("formattedPrice");
                optJSONObject4.optLong("priceAmountMicros");
                optJSONObject4.optInt("recurrenceMode");
                optJSONObject4.optInt("billingCycleCount");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                arrayList2.add(optJSONArray.getString(i11));
            }
        }
    }
}
