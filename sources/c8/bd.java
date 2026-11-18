package c8;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.nd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class bd {
    public static nd0 a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a10 = rd.a(jSONObject.getString("id"));
        long j3 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(rd.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        uc.a aVar = new uc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, rd.a(jSONObject2.optString("name")), rd.a(jSONObject2.optString("address_line1")), rd.a(jSONObject2.optString("address_line2")), rd.a(jSONObject2.optString("address_city")), rd.a(jSONObject2.optString("address_state")), rd.a(jSONObject2.optString("address_zip")), rd.a(jSONObject2.optString("address_country")), td.a(rd.a(jSONObject2.optString("brand"))), rd.a(jSONObject2.optString("last4")), rd.a(jSONObject2.optString("fingerprint")), td.b(rd.a(jSONObject2.optString("funding"))), rd.a(jSONObject2.optString("country")), rd.a(jSONObject2.optString("currency")));
        new Date(j3 * 1000);
        return new nd0(a10, valueOf, aVar, str2);
    }
}
