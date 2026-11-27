// default package

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oi5 extends AsyncTask {
    public final /* synthetic */ byte a = 0;
    public final HashMap b = new HashMap();
    public Exception c;
    public final pcc d;

    public oi5(pcc pccVar) {
        this.d = pccVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.a;
        HashMap hashMap = this.b;
        switch (b) {
            case 0:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        httpURLConnection.disconnect();
                        break;
                    } else if (httpURLConnection.getContentType() == null || !httpURLConnection.getContentType().contains("svg")) {
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    this.c = e;
                    return null;
                }
                break;
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry2 : hashMap.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null) {
                            httpURLConnection2.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setDoInput(true);
                    int responseCode2 = httpURLConnection2.getResponseCode();
                    BufferedReader bufferedReader = (responseCode2 < 200 || responseCode2 >= 300) ? new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream())) : new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            break;
                        } else {
                            sb.append(readLine);
                        }
                    }
                } catch (Exception e2) {
                    this.c = e2;
                    return null;
                }
                break;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        byte b = this.a;
        pcc pccVar = this.d;
        switch (b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                ku9 ku9Var = (ku9) pccVar;
                if (ku9Var != null) {
                    if (this.c != null) {
                        ku9Var.a(null);
                        break;
                    } else {
                        ku9Var.a(bitmap);
                        break;
                    }
                }
                break;
            default:
                String str = (String) obj;
                if (pccVar != null) {
                    if (this.c != null) {
                        pccVar.a(null);
                        break;
                    } else {
                        pccVar.a(str);
                        break;
                    }
                }
                break;
        }
    }

    public oi5(ku9 ku9Var) {
        this.d = ku9Var;
    }
}
