package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class TLJsonParser {
    private final JSONObject jsonObject;

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, q8c q8cVar) {
        try {
            return (T) q8cVar.a(tLJsonParser);
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z) {
        try {
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof String ? Boolean.parseBoolean((String) obj) : z;
        } catch (Exception e) {
            fa4.g(e, true);
            return z;
        }
    }

    private int parseInt32(Object obj, int i) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Integer.parseInt((String) obj, 10) : i;
        } catch (Exception e) {
            fa4.g(e, true);
            return i;
        }
    }

    private long parseInt64(Object obj, long j) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Long.parseLong((String) obj, 10) : j;
        } catch (Exception e) {
            fa4.g(e, true);
            return j;
        }
    }

    private String parseString(Object obj, String str) {
        return obj instanceof String ? (String) obj : str;
    }

    public boolean readBoolean(String str, boolean z) {
        return parseBoolean(this.jsonObject.opt(str), z);
    }

    public int readInt32(String str, int i) {
        return parseInt32(this.jsonObject.opt(str), i);
    }

    public long readInt64(String str, int i) {
        return parseInt64(this.jsonObject.opt(str), i);
    }

    public <T extends Deserializable> T readObject(String str, q8c q8cVar) {
        JSONObject optJSONObject = this.jsonObject.optJSONObject(str);
        if (optJSONObject != null) {
            return (T) parse(new TLJsonParser(optJSONObject), q8cVar);
        }
        return null;
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, q8c q8cVar) {
        yu7 yu7Var = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i)), q8cVar);
                    if (parse != null) {
                        yu7Var.add(parse);
                    }
                } catch (JSONException e) {
                    fa4.g(e, true);
                }
            }
        }
        return yu7Var;
    }

    public String readString(String str) {
        return readString(str, null);
    }
}
