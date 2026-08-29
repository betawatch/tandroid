package m5;

import ag.j2;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final j2 c = new j2("RevokeAccessOperation", new String[0]);
    public final String a;
    public final u b;

    public c(String str) {
        z5.l.f(str);
        this.a = str;
        this.b = new u(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j2 j2Var = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) j2Var.c, ((String) j2Var.d).concat("Unable to revoke access!"));
            }
            j2Var.g("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e((String) j2Var.c, ((String) j2Var.d).concat("IOException when revoking access: ".concat(String.valueOf(e10.toString()))));
        } catch (Exception e11) {
            Log.e((String) j2Var.c, ((String) j2Var.d).concat("Exception when revoking access: ".concat(String.valueOf(e11.toString()))));
        }
        this.b.a(status);
    }
}
