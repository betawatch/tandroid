package fi;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final class f0 extends AsyncTask {
    public String a;
    public long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ci.u d;

    public f0(String str, ci.u uVar) {
        this.c = str;
        this.d = uVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setConnectTimeout(MediaDataController.MAX_STYLE_RUNS_COUNT);
            httpURLConnection.setReadTimeout(MediaDataController.MAX_STYLE_RUNS_COUNT);
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
        } catch (Exception e7) {
            FileLog.e(e7);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        l0.h.put(this.c, new Pair(this.a, Long.valueOf(this.b)));
        this.d.run(this.a, Long.valueOf(this.b));
    }
}
