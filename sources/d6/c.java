package d6;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.r;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.d1;
import q6.m;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public static final d1 c = new d1("RevokeAccessOperation", new String[0]);
    public final String a;
    public final r b;

    public c(String str) {
        m.e(str);
        this.a = str;
        this.b = new r(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var = c;
        Status status = Status.h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                Log.e(d1Var.a, d1Var.b("Unable to revoke access!", new Object[0]));
            }
            d1Var.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            Log.e(d1Var.a, d1Var.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]));
        } catch (Exception e11) {
            Log.e(d1Var.a, d1Var.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]));
        }
        this.b.a(status);
    }
}
