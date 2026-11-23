package c8;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class bd {
    public static md0 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a10 = rd.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(rd.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, rd.a(jSONObject2.optString("name")), rd.a(jSONObject2.optString("address_line1")), rd.a(jSONObject2.optString("address_line2")), rd.a(jSONObject2.optString("address_city")), rd.a(jSONObject2.optString("address_state")), rd.a(jSONObject2.optString("address_zip")), rd.a(jSONObject2.optString("address_country")), td.a(rd.a(jSONObject2.optString("brand"))), rd.a(jSONObject2.optString("last4")), rd.a(jSONObject2.optString("fingerprint")), td.b(rd.a(jSONObject2.optString("funding"))), rd.a(jSONObject2.optString("country")), rd.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new md0(a10, valueOf, aVar, str2);
    }
}
