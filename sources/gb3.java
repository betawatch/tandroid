// default package

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class gb3 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hb3 b;

    public /* synthetic */ gb3(hb3 hb3Var, byte b) {
        this.a = b;
        this.b = hb3Var;
    }

    private final Object a() {
        String byteArrayOutputStream;
        hb3 hb3Var = this.b;
        synchronized (hb3Var) {
            uf5 uf5Var = (uf5) hb3Var.a.get();
            ArrayList b = uf5Var.b();
            uf5Var.a();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < b.size(); i++) {
                w90 w90Var = (w90) b.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", w90Var.a);
                jSONObject.put("dates", new JSONArray((Collection) w90Var.b));
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
                hb3 hb3Var = this.b;
                synchronized (hb3Var) {
                    ((uf5) hb3Var.a.get()).i(System.currentTimeMillis(), ((md3) hb3Var.c.get()).a());
                }
                return null;
        }
    }
}
