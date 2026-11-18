package ki;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import hi.e7;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class b0 extends AsyncTask {
    public String a;
    public long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ e7 d;

    public b0(String str, e7 e7Var) {
        this.c = str;
        this.d = e7Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setConnectTimeout(1000);
            httpURLConnection.setReadTimeout(1000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setDoInput(false);
            httpURLConnection.getResponseCode();
            if (Build.VERSION.SDK_INT >= 24) {
                this.b = httpURLConnection.getContentLengthLong();
            } else {
                this.b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.a = contentType;
            if (contentType.contains("; ")) {
                String str = this.a;
                this.a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        h0.h.put(this.c, new Pair(this.a, Long.valueOf(this.b)));
        this.d.a(this.a, Long.valueOf(this.b));
    }
}
