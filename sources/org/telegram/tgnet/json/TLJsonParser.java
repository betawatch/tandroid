package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nx0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class TLJsonParser {
    private final JSONObject jsonObject;

    /* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, y10 y10Var) {
        try {
            return (T) y10Var.a(tLJsonParser);
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z10) {
        try {
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
        } catch (Exception e10) {
            a8.g(e10, true);
            return z10;
        }
    }

    private int parseInt32(Object obj, int i7) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Integer.parseInt((String) obj, 10) : i7;
        } catch (Exception e10) {
            a8.g(e10, true);
            return i7;
        }
    }

    private long parseInt64(Object obj, long j3) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Long.parseLong((String) obj, 10) : j3;
        } catch (Exception e10) {
            a8.g(e10, true);
            return j3;
        }
    }

    private String parseString(Object obj, String str) {
        return obj instanceof String ? (String) obj : str;
    }

    public boolean readBoolean(String str, boolean z10) {
        return parseBoolean(this.jsonObject.opt(str), z10);
    }

    public int readInt32(String str, int i7) {
        return parseInt32(this.jsonObject.opt(str), i7);
    }

    public long readInt64(String str, int i7) {
        return parseInt64(this.jsonObject.opt(str), i7);
    }

    public <T extends Deserializable> T readObject(String str, y10 y10Var) {
        JSONObject optJSONObject = this.jsonObject.optJSONObject(str);
        if (optJSONObject != null) {
            return (T) parse(new TLJsonParser(optJSONObject), y10Var);
        }
        return null;
    }

    public String readString(String str) {
        return readString(str, null);
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, y10 y10Var) {
        nx0 nx0Var = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i7)), y10Var);
                    if (parse != null) {
                        nx0Var.add(parse);
                    }
                } catch (JSONException e10) {
                    a8.g(e10, true);
                }
            }
        }
        return nx0Var;
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }
}
