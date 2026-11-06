package hi;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class a0 extends AsyncTask {
    public String a;
    public long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ai.e d;

    public a0(String str, ai.e eVar) {
        this.c = str;
        this.d = eVar;
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
        g0.h.put(this.c, new Pair(this.a, Long.valueOf(this.b)));
        this.d.a(this.a, Long.valueOf(this.b));
    }
}
