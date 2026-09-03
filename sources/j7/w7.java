package j7;

import java.util.Date;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class w7 {
    public static af.d a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String a2 = o8.a(jSONObject.getString("id"));
        long j10 = jSONObject.getLong("created");
        jSONObject.getBoolean("livemode");
        String str2 = "card".equals(o8.a(jSONObject.getString(TeXSymbolParser.TYPE_ATTR))) ? "card" : null;
        Boolean valueOf = Boolean.valueOf(jSONObject.getBoolean("used"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("card");
        gc.a aVar = new gc.a(null, Integer.valueOf(jSONObject2.getInt("exp_month")), Integer.valueOf(jSONObject2.getInt("exp_year")), null, o8.a(jSONObject2.optString("name")), o8.a(jSONObject2.optString("address_line1")), o8.a(jSONObject2.optString("address_line2")), o8.a(jSONObject2.optString("address_city")), o8.a(jSONObject2.optString("address_state")), o8.a(jSONObject2.optString("address_zip")), o8.a(jSONObject2.optString("address_country")), q8.a(o8.a(jSONObject2.optString("brand"))), o8.a(jSONObject2.optString("last4")), o8.a(jSONObject2.optString("fingerprint")), q8.b(o8.a(jSONObject2.optString("funding"))), o8.a(jSONObject2.optString("country")), o8.a(jSONObject2.optString("currency")));
        new Date(j10 * 1000);
        return new af.d(a2, valueOf, aVar, str2);
    }
}
