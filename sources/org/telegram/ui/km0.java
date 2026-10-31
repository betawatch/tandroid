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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class km0 extends AsyncTask {
    public final /* synthetic */ oc.a a;
    public final /* synthetic */ sm0 b;

    public km0(sm0 sm0Var, oc.a aVar) {
        this.b = sm0Var;
        this.a = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:2|3)|(9:(13:46|47|(3:49|50|(1:52))|(1:7)(2:42|(1:44)(1:45))|8|9|10|11|12|13|14|15|(3:23|24|25)(3:19|20|21))|12|13|14|15|(1:17)|23|24|25)|5|(0)(0)|8|9|10|11|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0134, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x016c, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016f, code lost:
    
        if (r5 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
    
        if (r5.endsWith(".smart-glocal.com/cds/v1/tokenize/card") == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098 A[Catch: all -> 0x0087, Exception -> 0x0094, TryCatch #4 {all -> 0x0087, blocks: (B:3:0x000f, B:47:0x0063, B:50:0x0076, B:52:0x007e, B:7:0x008e, B:8:0x00af, B:42:0x0098, B:44:0x00a0, B:45:0x00a8), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008e A[Catch: all -> 0x0087, Exception -> 0x0094, TRY_ENTER, TryCatch #4 {all -> 0x0087, blocks: (B:3:0x000f, B:47:0x0063, B:50:0x0076, B:52:0x007e, B:7:0x008e, B:8:0x00af, B:42:0x0098, B:44:0x00a0, B:45:0x00a8), top: B:2:0x000f }] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        HttpURLConnection httpURLConnection;
        ?? r82;
        JSONObject jSONObject;
        String string;
        int responseCode;
        sm0 sm0Var = this.b;
        oc.a aVar = this.a;
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
                    r82 = aVar;
                    if (r82 != 0) {
                        r82.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r82 = 0;
                if (r82 != 0) {
                }
                throw th;
            }
        } catch (Exception e) {
            e = e;
            httpURLConnection = null;
        }
        try {
            if (sm0Var.C0.native_params != null) {
                try {
                    string = new JSONObject(sm0Var.C0.native_params.data).getString("tokenize_url");
                    if (string != null) {
                        try {
                            if (string.startsWith("https://")) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                httpURLConnection = (HttpURLConnection) (string == null ? new URL(string) : sm0Var.C0.invoice.test ? new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card") : new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card")).openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(80000);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("X-PUBLIC-TOKEN", sm0Var.j0);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(jSONObject.toString().getBytes("UTF-8"));
                outputStream.close();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 || responseCode >= 300) {
                    boolean z10 = org.telegram.messenger.v2.a;
                    StringBuilder sb2 = new StringBuilder("");
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    String next = new Scanner(errorStream, "UTF-8").useDelimiter("\\A").next();
                    errorStream.close();
                    sb2.append(next);
                    org.telegram.messenger.f8.d(sb2.toString());
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
            boolean z102 = org.telegram.messenger.v2.a;
            StringBuilder sb22 = new StringBuilder("");
            InputStream errorStream2 = httpURLConnection.getErrorStream();
            String next3 = new Scanner(errorStream2, "UTF-8").useDelimiter("\\A").next();
            errorStream2.close();
            sb22.append(next3);
            org.telegram.messenger.f8.d(sb22.toString());
            httpURLConnection.disconnect();
            return null;
        } finally {
        }
        string = null;
        httpURLConnection = (HttpURLConnection) (string == null ? new URL(string) : sm0Var.C0.invoice.test ? new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card") : new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card")).openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(80000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("X-PUBLIC-TOKEN", sm0Var.j0);
        OutputStream outputStream2 = httpURLConnection.getOutputStream();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        sm0 sm0Var = this.b;
        if (sm0Var.Q0) {
            return;
        }
        if (str == null) {
            org.telegram.ui.Components.s4.v0(org.telegram.messenger.cd.L0(2131747420, null), sm0Var);
        } else {
            sm0Var.w0 = str;
            sm0Var.y0();
        }
        sm0Var.M0(true, false);
        sm0Var.I0(false);
    }
}
