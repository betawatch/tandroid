package ea;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import b4.e0;
import b6.m;
import ca.e;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final ba.b b;
    public final d c = new d();

    public c(Context context, ba.b bVar) {
        this.a = context;
        this.b = bVar;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e6) {
            throw new e(e6.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th2;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", yh.l("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : yh.k(", ", str)));
    }

    public static long d(String str) {
        m.a("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        e0 a2 = b.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        b bVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a2.c = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a2.d = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                b c3 = a2.c();
                jsonReader.endObject();
                bVar = c3;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, bVar, 1);
    }

    public static b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        e0 a2 = b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a2.c = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a2.d = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a2.b = 1;
        return a2.c();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.2.0");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.2.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4 A[Catch: NameNotFoundException -> 0x00bd, TryCatch #3 {NameNotFoundException -> 0x00bd, blocks: (B:8:0x006b, B:10:0x007d, B:17:0x0087, B:21:0x0094, B:23:0x00a4, B:27:0x00bf, B:29:0x00c9, B:31:0x00e2), top: B:7:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[Catch: NameNotFoundException -> 0x00bd, TryCatch #3 {NameNotFoundException -> 0x00bd, blocks: (B:8:0x006b, B:10:0x007d, B:17:0x0087, B:21:0x0094, B:23:0x00a4, B:27:0x00bf, B:29:0x00c9, B:31:0x00e2), top: B:7:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection c(URL url, String str) {
        PackageInfo b10;
        Signature[] signatureArr;
        byte[] bArr;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            z9.e eVar = (z9.e) this.b.get();
            if (eVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((z9.c) eVar).b()));
                } catch (InterruptedException e6) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e6);
                } catch (ExecutionException e10) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                }
            }
            String str2 = null;
            try {
                b10 = k6.c.a(context).b(64, context.getPackageName());
                signatureArr = b10.signatures;
            } catch (PackageManager.NameNotFoundException e11) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e11);
            }
            if (signatureArr != null && signatureArr.length == 1) {
                int i10 = 0;
                while (true) {
                    if (i10 >= 2) {
                        messageDigest = null;
                        break;
                    }
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i10++;
                }
                if (messageDigest != null) {
                    bArr = messageDigest.digest(b10.signatures[0].toByteArray());
                    if (bArr != null) {
                        Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                    } else {
                        int length = bArr.length;
                        StringBuilder sb = new StringBuilder(length + length);
                        for (int i11 = 0; i11 < length; i11++) {
                            char[] cArr = i6.b.a;
                            sb.append(cArr[(bArr[i11] & 240) >>> 4]);
                            sb.append(cArr[bArr[i11] & 15]);
                        }
                        str2 = sb.toString();
                    }
                    httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            bArr = null;
            if (bArr != null) {
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
