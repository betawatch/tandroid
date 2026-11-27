// default package

import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import org.json.JSONArray;
import org.json.JSONTokener;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class g3c extends Thread {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ icc d;

    public g3c(String str, String str2, String str3, icc iccVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iccVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        String str;
        icc iccVar = this.d;
        String str2 = this.c;
        boolean z = false;
        try {
            httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.a) + "&tl=" + Uri.encode(this.b) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str2).toURL().openConnection();
        } catch (Exception e) {
            e = e;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", r3c.R1[(int) Math.round(Math.random() * 5.0d)]);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), lk1.a));
            while (true) {
                try {
                    int read = bufferedReader.read();
                    if (read == -1) {
                        break;
                    } else {
                        sb.append((char) read);
                    }
                } finally {
                }
            }
            bufferedReader.close();
            JSONArray jSONArray = new JSONArray(new JSONTokener(sb.toString()));
            JSONArray jSONArray2 = jSONArray.getJSONArray(0);
            try {
                str = jSONArray.getString(2);
            } catch (Exception unused) {
                str = null;
            }
            if (str != null && str.contains("-")) {
                str.substring(0, str.indexOf("-"));
            }
            String str3 = "";
            for (int i = 0; i < jSONArray2.length(); i++) {
                String string = jSONArray2.getJSONArray(i).getString(0);
                if (string != null && !string.equals("null")) {
                    str3 = str3 + string;
                }
            }
            if (str2.length() > 0 && str2.charAt(0) == '\n') {
                str3 = "\n" + str3;
            }
            hl.c3(new f3c(iccVar, str3, (byte) 0));
        } catch (Exception e2) {
            e = e2;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("failed to translate a text ");
                sb2.append(httpURLConnection != null ? Integer.valueOf(httpURLConnection.getResponseCode()) : null);
                sb2.append(" ");
                sb2.append(httpURLConnection != null ? httpURLConnection.getResponseMessage() : null);
                Log.e("translate", sb2.toString());
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            e.printStackTrace();
            if (httpURLConnection != null) {
                try {
                    if (httpURLConnection.getResponseCode() == 429) {
                        z = true;
                    }
                } catch (Exception unused2) {
                    hl.c3(new g25(iccVar, (byte) 7));
                    return;
                }
            }
            hl.c3(new q38((byte) 23, (Object) iccVar, z));
        }
    }
}
