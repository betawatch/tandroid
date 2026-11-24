// default package

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m30 implements rgf {
    public long a;
    public Object b;
    public Object c;

    public m30(File file, long j, byte[] bArr) {
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

    public static m30 c(String str) {
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new m30(str, 0L, obj);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new m30(jSONObject.getString("token"), jSONObject.getLong("timestamp"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public final n30 a() {
        Object obj;
        if (!((bqb) this.b).p() && (obj = this.c) != null) {
            jte.f(((bqb) this.b).b(obj) != -1);
        }
        return new n30(this);
    }

    @Override // rgf
    public final ry zza() {
        yoe yoeVar = (yoe) this.b;
        o7f o7fVar = (o7f) this.c;
        long j = this.a;
        ovb ovbVar = new ovb();
        ovbVar.c = x6f.b;
        uqd uqdVar = new uqd((byte) 10);
        uqdVar.d = yoeVar.e.a();
        uqdVar.b = o7fVar;
        uqdVar.c = Long.valueOf((SystemClock.elapsedRealtime() - j) & Long.MAX_VALUE);
        ovbVar.e = new ndf(uqdVar);
        return new ry(ovbVar, 0);
    }

    public m30() {
        this.a = 0L;
        this.b = bqb.a;
        this.c = null;
    }

    public /* synthetic */ m30(Object obj, long j, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
