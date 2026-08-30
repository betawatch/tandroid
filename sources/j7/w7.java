package j7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class w7 {
    public static androidx.biometric.e a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = n8.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(n8.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        gc.a aVar = new gc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, n8.a(jSONObject2.optString("name")), n8.a(jSONObject2.optString("address_line1")), n8.a(jSONObject2.optString("address_line2")), n8.a(jSONObject2.optString("address_city")), n8.a(jSONObject2.optString("address_state")), n8.a(jSONObject2.optString("address_zip")), n8.a(jSONObject2.optString("address_country")), p8.a(n8.a(jSONObject2.optString("brand"))), n8.a(jSONObject2.optString("last4")), n8.a(jSONObject2.optString("fingerprint")), p8.b(n8.a(jSONObject2.optString("funding"))), n8.a(jSONObject2.optString("country")), n8.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new androidx.biometric.e(a2, valueOf, aVar, str2);
    }
}
