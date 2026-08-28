package org.telegram.tgnet.json;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gy0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class TLJsonParser {
    private final JSONObject jsonObject;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public interface Deserializable {
        void deserializeFromJson(TLJsonParser tLJsonParser);
    }

    public TLJsonParser(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    private static <T extends Deserializable> T parse(TLJsonParser tLJsonParser, Utilities.CallbackReturn<TLJsonParser, T> callbackReturn) {
        try {
            return callbackReturn.run(tLJsonParser);
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    private boolean parseBoolean(Object obj, boolean z10) {
        try {
            return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof String ? Boolean.parseBoolean((String) obj) : z10;
        } catch (Exception e10) {
            FileLog.e(e10);
            return z10;
        }
    }

    private int parseInt32(Object obj, int i9) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Integer.parseInt((String) obj, 10) : i9;
        } catch (Exception e10) {
            FileLog.e(e10);
            return i9;
        }
    }

    private long parseInt64(Object obj, long j10) {
        try {
            return obj instanceof Number ? ((Number) obj).intValue() : obj instanceof String ? Long.parseLong((String) obj, 10) : j10;
        } catch (Exception e10) {
            FileLog.e(e10);
            return j10;
        }
    }

    private String parseString(Object obj, String str) {
        return obj instanceof String ? (String) obj : str;
    }

    public boolean readBoolean(String str, boolean z10) {
        return parseBoolean(this.jsonObject.opt(str), z10);
    }

    public int readInt32(String str, int i9) {
        return parseInt32(this.jsonObject.opt(str), i9);
    }

    public long readInt64(String str, int i9) {
        return parseInt64(this.jsonObject.opt(str), i9);
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
        gy0 gy0Var = (ArrayList<T>) new ArrayList();
        JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Deserializable parse = parse(new TLJsonParser(optJSONArray.getJSONObject(i9)), callbackReturn);
                    if (parse != null) {
                        gy0Var.add(parse);
                    }
                } catch (JSONException e10) {
                    FileLog.e(e10);
                }
            }
        }
        return gy0Var;
    }

    public String readString(String str, String str2) {
        return parseString(this.jsonObject.opt(str), str2);
    }
}
