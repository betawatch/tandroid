package o5;

import android.util.Log;
import b4.e0;
import b6.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final e0 c = new e0("RevokeAccessOperation", new String[0]);
    public final String a;
    public final u b;

    public c(String str) {
        m.f(str);
        this.a = str;
        this.b = new u(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e((String) e0Var.c, ((String) e0Var.d).concat("Unable to revoke access!"));
            }
            e0Var.f("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            Log.e((String) e0Var.c, ((String) e0Var.d).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e6) {
            Log.e((String) e0Var.c, ((String) e0Var.d).concat("Exception when revoking access: ".concat(String.valueOf(e6.toString()))));
        }
        this.b.a(status);
    }
}
