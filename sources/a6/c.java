package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
            aVar.f("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            Log.e((String) aVar.c, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e7.toString()))));
        } catch (Exception e10) {
            Log.e((String) aVar.c, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.b.a(status);
    }
}
