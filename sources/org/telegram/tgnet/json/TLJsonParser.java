package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.yy0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class TLJsonParser {
    private final JSONObject jsonObject;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        try {
            return callbackReturn.run(tLJsonParser);
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z10) {
        try {
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
        } catch (Exception e7) {
            FileLog.e(e7);
            return z10;
        }
    }

    private int parseInt32(Object obj, int i10) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Integer.parseInt((String) obj, 10) : i10;
        } catch (Exception e7) {
            FileLog.e(e7);
            return i10;
        }
    }

    private long parseInt64(Object obj, long j3) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Long.parseLong((String) obj, 10) : j3;
        } catch (Exception e7) {
            FileLog.e(e7);
            return j3;
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

    public <T extends Deserializable> T readObject(String str, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        JSONObject optJSONObject = this.jsonObject.optJSONObject(str);
        if (optJSONObject != null) {
            return (T) parse(new TLJsonParser(optJSONObject), callbackReturn);
        }
        return null;
    }

    public String readString(String str) {
        return readString(str, null);
    }

    public <T extends Deserializable> ArrayList<T> readVector(String str, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        yy0 yy0Var = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i10)), callbackReturn);
                    if (parse != null) {
                        yy0Var.add(parse);
                    }
                } catch (JSONException e7) {
                    FileLog.e(e7);
                }
            }
        }
        return yy0Var;
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }
}
