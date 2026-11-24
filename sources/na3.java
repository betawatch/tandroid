// default package

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class na3 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oa3 b;

    public /* synthetic */ na3(oa3 oa3Var, byte b) {
        this.a = b;
        this.b = oa3Var;
    }

    private final Object a() {
        String byteArrayOutputStream;
        oa3 oa3Var = this.b;
        synchronized (oa3Var) {
            td5 td5Var = (td5) oa3Var.a.get();
            ArrayList b = td5Var.b();
            td5Var.a();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < b.size(); i++) {
                u90 u90Var = (u90) b.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", u90Var.a);
                jSONObject.put("dates", new JSONArray((Collection) u90Var.b));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return byteArrayOutputStream;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return a();
            default:
                oa3 oa3Var = this.b;
                synchronized (oa3Var) {
                    ((td5) oa3Var.a.get()).i(System.currentTimeMillis(), ((tc3) oa3Var.c.get()).a());
                }
                return null;
        }
    }
}
