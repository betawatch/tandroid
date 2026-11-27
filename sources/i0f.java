// default package

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class i0f {
    public static ko9 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a = ize.a(jSONObject.getString("id"));
        long j = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(ize.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        zc1 zc1Var = new zc1(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, ize.a(jSONObject2.optString("name")), ize.a(jSONObject2.optString("address_line1")), ize.a(jSONObject2.optString("address_line2")), ize.a(jSONObject2.optString("address_city")), ize.a(jSONObject2.optString("address_state")), ize.a(jSONObject2.optString("address_zip")), ize.a(jSONObject2.optString("address_country")), lze.a(ize.a(jSONObject2.optString("brand"))), ize.a(jSONObject2.optString("last4")), ize.a(jSONObject2.optString("fingerprint")), lze.b(ize.a(jSONObject2.optString("funding"))), ize.a(jSONObject2.optString("country")), ize.a(jSONObject2.optString("currency")));
        new Date(j * 1000);
        return new ko9(a, valueOf, zc1Var, str2);
    }
}
