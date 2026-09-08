package org.telegram.ui;

import android.os.AsyncTask;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class no0 extends AsyncTask {
    public final /* synthetic */ uc.a a;
    public final /* synthetic */ xo0 b;

    public no0(xo0 xo0Var, uc.a aVar) {
        this.b = xo0Var;
        this.a = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:2|3)|(13:48|49|(3:51|52|(1:54))|(1:7)(2:44|(1:46)(1:47))|8|9|10|11|12|13|14|15|(4:23|(1:25)|26|27)(3:19|20|21))|5|(0)(0)|8|9|10|11|12|13|14|15|(1:17)|23|(0)|26|27|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0137, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0171, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0174, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0084, code lost:
    
        if (r5.endsWith(".smart-glocal.com/cds/v1/tokenize/card") == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013d A[Catch: all -> 0x0134, Exception -> 0x0137, TRY_LEAVE, TryCatch #2 {all -> 0x0134, blocks: (B:11:0x00ba, B:14:0x00eb, B:19:0x00fc, B:23:0x0139, B:25:0x013d, B:38:0x0170, B:37:0x016d, B:41:0x0171), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b A[Catch: all -> 0x0087, Exception -> 0x0097, TryCatch #4 {all -> 0x0087, blocks: (B:3:0x000e, B:49:0x0063, B:52:0x0076, B:54:0x007e, B:7:0x0091, B:8:0x00b2, B:44:0x009b, B:46:0x00a3, B:47:0x00ab), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0091 A[Catch: all -> 0x0087, Exception -> 0x0097, TRY_ENTER, TryCatch #4 {all -> 0x0087, blocks: (B:3:0x000e, B:49:0x0063, B:52:0x0076, B:54:0x007e, B:7:0x0091, B:8:0x00b2, B:44:0x009b, B:46:0x00a3, B:47:0x00ab), top: B:2:0x000e }] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        HttpURLConnection httpURLConnection;
        ?? r72;
        JSONObject jSONObject;
        String string;
        int responseCode;
        xo0 xo0Var = this.b;
        uc.a aVar = this.a;
        try {
            try {
                try {
                    jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("number", aVar.a);
                    jSONObject2.put("expiration_month", String.format(Locale.US, "%02d", aVar.c));
                    jSONObject2.put("expiration_year", "" + aVar.d);
                    jSONObject2.put("security_code", "" + aVar.b);
                    jSONObject.put("card", jSONObject2);
                } catch (Throwable th2) {
                    th = th2;
                    r72 = aVar;
                    if (r72 != 0) {
                        r72.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r72 = 0;
                if (r72 != 0) {
                }
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            httpURLConnection = null;
        }
        try {
            if (xo0Var.C0.native_params != null) {
                try {
                    string = new JSONObject(xo0Var.C0.native_params.data).getString("tokenize_url");
                    if (string != null) {
                        try {
                            if (string.startsWith("https://")) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                httpURLConnection = (HttpURLConnection) (string == null ? new URL(string) : xo0Var.C0.invoice.test ? new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card") : new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card")).openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(80000);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("X-PUBLIC-TOKEN", xo0Var.j0);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(jSONObject.toString().getBytes("UTF-8"));
                outputStream.close();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 || responseCode >= 300) {
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder sb2 = new StringBuilder("");
                        InputStream errorStream = httpURLConnection.getErrorStream();
                        String next = new Scanner(errorStream, "UTF-8").useDelimiter("\\A").next();
                        errorStream.close();
                        sb2.append(next);
                        FileLog.e(sb2.toString());
                    }
                    httpURLConnection.disconnect();
                    return null;
                }
                JSONObject jSONObject3 = new JSONObject();
                InputStream inputStream = httpURLConnection.getInputStream();
                String next2 = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
                inputStream.close();
                jSONObject3.put("token", new JSONObject(next2).getJSONObject("data").getString("token"));
                jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "card");
                String jSONObject4 = jSONObject3.toString();
                httpURLConnection.disconnect();
                return jSONObject4;
            }
            outputStream.write(jSONObject.toString().getBytes("UTF-8"));
            outputStream.close();
            responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200) {
            }
            if (BuildVars.DEBUG_VERSION) {
            }
            httpURLConnection.disconnect();
            return null;
        } finally {
        }
        string = null;
        httpURLConnection = (HttpURLConnection) (string == null ? new URL(string) : xo0Var.C0.invoice.test ? new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card") : new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card")).openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(80000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("X-PUBLIC-TOKEN", xo0Var.j0);
        OutputStream outputStream2 = httpURLConnection.getOutputStream();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        xo0 xo0Var = this.b;
        if (xo0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.e5.w0(xo0Var, LocaleController.getString(R.string.PaymentConnectionFailed));
        } else {
            xo0Var.w0 = str;
            xo0Var.t0();
        }
        xo0Var.H0(true, false);
        xo0Var.D0(false);
    }
}
