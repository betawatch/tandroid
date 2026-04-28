package com.android.billingclient.api;

import com.android.billingclient.api.ProductDetails;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* loaded from: classes.dex */
public final class zzcs {
    zzcs(JSONObject jSONObject) {
        jSONObject.getString(TeXSymbolParser.TYPE_ATTR);
        JSONArray optJSONArray = jSONObject.optJSONArray("balanceThresholds");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(Integer.valueOf(optJSONArray.getInt(i)));
            }
        }
        new ProductDetails.PricingPhases(jSONObject.getJSONArray("pricingPhases"));
    }
}
