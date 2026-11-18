package f5;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
