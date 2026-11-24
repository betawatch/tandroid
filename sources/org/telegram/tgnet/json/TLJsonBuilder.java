package org.telegram.tgnet.json;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class TLJsonBuilder {
    private final JSONObject result2 = new JSONObject();

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
    public interface Serializable {
        void serializeToJson(TLJsonBuilder tLJsonBuilder);
    }

    private TLJsonBuilder() {
    }

    public static JSONObject serialize(Serializable serializable) {
        if (serializable == null) {
            return null;
        }
        try {
            TLJsonBuilder tLJsonBuilder = new TLJsonBuilder();
            serializable.serializeToJson(tLJsonBuilder);
            return tLJsonBuilder.result2;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    private void write(String str, Object obj) {
        try {
            this.result2.putOpt(str, obj);
        } catch (JSONException e) {
            fa4.g(e, true);
        }
    }

    public void writeBoolean(String str, boolean z) {
        write(str, Boolean.valueOf(z));
    }

    public void writeInt32(String str, int i) {
        writeString(str, Integer.toString(i, 10));
    }

    public void writeInt64(String str, long j) {
        writeString(str, Long.toString(j, 10));
    }

    public void writeObject(String str, Serializable serializable) {
        write(str, serialize(serializable));
    }

    public void writeString(String str, String str2) {
        write(str, str2);
    }

    public <T extends Serializable> void writeVector(String str, List<T> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            JSONObject serialize = serialize(it.next());
            if (serialize != null) {
                jSONArray.put(serialize);
            }
        }
        write(str, jSONArray);
    }
}
