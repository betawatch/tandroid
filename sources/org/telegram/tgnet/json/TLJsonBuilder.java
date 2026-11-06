package org.telegram.tgnet.json;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class TLJsonBuilder {
    private final JSONObject result2 = new JSONObject();

    /* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    private void write(String str, Object obj) {
        try {
            this.result2.putOpt(str, obj);
        } catch (JSONException e10) {
            a8.g(e10, true);
        }
    }

    public void writeBoolean(String str, boolean z9) {
        write(str, Boolean.valueOf(z9));
    }

    public void writeInt32(String str, int i7) {
        writeString(str, Integer.toString(i7, 10));
    }

    public void writeInt64(String str, long j3) {
        writeString(str, Long.toString(j3, 10));
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
