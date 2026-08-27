package k5;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final b6.a c = new b6.a("RevokeAccessOperation", new String[0]);
    public final String a;
    public final u b;

    public c(String str) {
        y5.l.f(str);
        this.a = str;
        this.b = new u(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        b6.a aVar = c;
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
        } catch (IOException e9) {
            Log.e((String) aVar.b, ((String) aVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e9.toString()))));
        } catch (Exception e10) {
            Log.e((String) aVar.b, ((String) aVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.b.a(status);
    }
}
