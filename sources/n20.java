// default package

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class n20 implements gjf {
    public long a;
    public Object b;
    public Object c;

    public n20(File file, long j, byte[] bArr) {
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

    public static n20 c(String str) {
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new n20(0L, str, obj);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new n20(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to parse token: " + e);
            return null;
        }
    }

    public final o20 a() {
        Object obj;
        if (!((asb) this.b).p() && (obj = this.c) != null) {
            yve.f(((asb) this.b).b(obj) != -1);
        }
        return new o20(this);
    }

    @Override // gjf
    public final rx zza() {
        mre mreVar = (mre) this.b;
        daf dafVar = (daf) this.c;
        long j = this.a;
        oxb oxbVar = new oxb();
        oxbVar.c = m9f.b;
        htd htdVar = new htd((byte) 10);
        htdVar.d = mreVar.e.a();
        htdVar.b = dafVar;
        htdVar.c = Long.valueOf((SystemClock.elapsedRealtime() - j) & Long.MAX_VALUE);
        oxbVar.e = new cgf(htdVar);
        return new rx(oxbVar, 0);
    }

    public n20() {
        this.a = 0L;
        this.b = asb.a;
        this.c = null;
    }

    public /* synthetic */ n20(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
