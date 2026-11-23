package f5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class k {
    public final ArrayList a;

    public k() {
        this.a = new ArrayList();
        new ArrayList();
        new ArrayList();
    }

    public k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i7);
                if (optJSONObject != null) {
                    arrayList.add(new j(optJSONObject));
                }
            }
        }
        this.a = arrayList;
    }
}
