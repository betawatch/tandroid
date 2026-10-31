package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.f8;
import org.telegram.messenger.r20;
import xc.b;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class TLJsonParser {
    private final JSONObject jsonObject;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, r20 r20Var) {
        try {
            return (T) r20Var.a(tLJsonParser);
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z10) {
        try {
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
        } catch (Exception e) {
            f8.g(e, true);
            return z10;
        }
    }

    private int parseInt32(Object obj, int i10) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Integer.parseInt((String) obj, 10) : i10;
        } catch (Exception e) {
            f8.g(e, true);
            return i10;
        }
    }

    private long parseInt64(Object obj, long j10) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Long.parseLong((String) obj, 10) : j10;
        } catch (Exception e) {
            f8.g(e, true);
            return j10;
        }
    }

    private String parseString(Object obj, String str) {
        return obj instanceof String ? (String) obj : str;
    }

    public boolean readBoolean(String str, boolean z10) {
        return parseBoolean(this.jsonObject.opt(str), z10);
    }

    public int readInt32(String str, int i10) {
        return parseInt32(this.jsonObject.opt(str), i10);
    }

    public long readInt64(String str, int i10) {
        return parseInt64(this.jsonObject.opt(str), i10);
    }

    public <T extends Deserializable> T readObject(String str, r20 r20Var) {
        JSONObject optJSONObject = this.jsonObject.optJSONObject(str);
        if (optJSONObject != null) {
            return (T) parse(new TLJsonParser(optJSONObject), r20Var);
        }
        return null;
    }

    public String readString(String str) {
        return readString(str, null);
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, r20 r20Var) {
        b bVar = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i10)), r20Var);
                    if (parse != null) {
                        bVar.add(parse);
                    }
                } catch (JSONException e) {
                    f8.g(e, true);
                }
            }
        }
        return bVar;
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }
}
