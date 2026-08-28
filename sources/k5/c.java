package k5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final a6.a c = new a6.a("RevokeAccessOperation", new String[0]);
    public final String a;
    public final u b;

    public c(String str) {
        x5.l.f(str);
        this.a = str;
        this.b = new u(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        a6.a aVar = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) aVar.b, ((String) aVar.d).concat("Unable to revoke access!"));
            }
            aVar.e("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e((String) aVar.b, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e10.toString()))));
        } catch (Exception e11) {
            Log.e((String) aVar.b, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.b.a(status);
    }
}
