package a6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.g1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final g1 c = new g1("RevokeAccessOperation", new String[0]);
    public final String a;
    public final u b;

    public c(String str) {
        n6.l.e(str);
        this.a = str;
        this.b = new u(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1 g1Var = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e(g1Var.a, g1Var.b.concat("Unable to revoke access!"));
            }
            g1Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e(g1Var.a, g1Var.b.concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e7) {
            Log.e(g1Var.a, g1Var.b.concat("Exception when revoking access: ".concat(String.valueOf(e7.toString()))));
        }
        this.b.a(status);
    }
}
