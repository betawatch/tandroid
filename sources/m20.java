// default package

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class m20 implements qef {
    public long a;
    public Object b;
    public Object c;

    public m20(File file, long j, byte[] bArr) {
        this.b = file;
        this.a = j;
        this.c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public static String b(long j, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static m20 c(String str) {
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new m20(str, 0L, obj);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new m20(jSONObject.getString("token"), jSONObject.getLong("timestamp"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public final n20 a() {
        Object obj;
        if (!((aob) this.b).p() && (obj = this.c) != null) {
            gre.f(((aob) this.b).b(obj) != -1);
        }
        return new n20(this);
    }

    @Override // qef
    public final qx zza() {
        vme vmeVar = (vme) this.b;
        m5f m5fVar = (m5f) this.c;
        long j = this.a;
        ntb ntbVar = new ntb();
        ntbVar.c = v4f.b;
        rod rodVar = new rod((byte) 10);
        rodVar.d = vmeVar.e.a();
        rodVar.b = m5fVar;
        rodVar.c = Long.valueOf((SystemClock.elapsedRealtime() - j) & Long.MAX_VALUE);
        ntbVar.e = new mbf(rodVar);
        return new qx(ntbVar, 0);
    }

    public m20() {
        this.a = 0L;
        this.b = aob.a;
        this.c = null;
    }

    public /* synthetic */ m20(Object obj, long j, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
