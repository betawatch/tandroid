// default package

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jk4 {
    public final ArrayList a;

    public jk4(byte b) {
        switch (b) {
            case 1:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    public final void a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                rjb.p();
                return;
            } else {
                try {
                    throw null;
                } catch (Exception e) {
                    hk7.d.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
        }
        arrayList.clear();
    }

    public jk4(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new jn8(optJSONObject));
                }
            }
        }
        this.a = arrayList;
    }

    public jk4(ArrayList arrayList) {
        this.a = arrayList;
    }
}
