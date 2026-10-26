package b6;

import a8.ng;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final ng c = new ng("RevokeAccessOperation", new String[0]);
    public final String a;
    public final t b;

    public c(String str) {
        o6.l.f(str);
        this.a = str;
        this.b = new t(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ng ngVar = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) ngVar.c, ((String) ngVar.d).concat("Unable to revoke access!"));
            }
            ngVar.j("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) ngVar.c, ((String) ngVar.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e10) {
            Log.e((String) ngVar.c, ((String) ngVar.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.b.a(status);
    }
}
