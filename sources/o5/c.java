package o5;

import android.util.Log;
import b4.e0;
import b6.m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.u;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            e0Var.g("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e6) {
            Log.e((String) e0Var.c, ((String) e0Var.d).concat("IOException when revoking access: ".concat(String.valueOf(e6.toString()))));
        } catch (Exception e10) {
            Log.e((String) e0Var.c, ((String) e0Var.d).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.b.a(status);
    }
}
