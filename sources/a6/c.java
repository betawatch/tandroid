package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final a5.a c = new a5.a("RevokeAccessOperation", new String[0]);
    public final String a;
    public final u b;

    public c(String str) {
        n6.l.f(str);
        this.a = str;
        this.b = new u(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a5.a aVar = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) aVar.c, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.i("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) aVar.c, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e7) {
            Log.e((String) aVar.c, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e7.toString()))));
        }
        this.b.a(status);
    }
}
