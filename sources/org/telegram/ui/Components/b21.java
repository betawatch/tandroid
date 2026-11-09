package org.telegram.ui.Components;

import android.net.Uri;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import org.json.JSONArray;
import org.json.JSONTokener;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class b21 extends Thread {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ org.telegram.messenger.v10 d;

    public b21(String str, String str2, String str3, org.telegram.messenger.v10 v10Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = v10Var;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        String str;
        org.telegram.messenger.v10 v10Var = this.d;
        String str2 = this.c;
        boolean z9 = false;
        try {
            httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.a) + "&tl=" + Uri.encode(this.b) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str2).toURL().openConnection();
        } catch (Exception e10) {
            e = e10;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("User-Agent", l21.O1[(int) Math.round(Math.random() * 5)]);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), g9.j.a));
            while (true) {
                try {
                    int read = bufferedReader.read();
                    if (read == -1) {
                        break;
                    } else {
                        sb2.append((char) read);
                    }
                } finally {
                }
            }
            bufferedReader.close();
            JSONArray jSONArray = new JSONArray(new JSONTokener(sb2.toString()));
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
            for (int i7 = 0; i7 < jSONArray2.length(); i7++) {
                String string = jSONArray2.getJSONArray(i7).getString(0);
                if (string != null && !string.equals("null")) {
                    str3 = str3 + string;
                }
            }
            if (str2.length() > 0 && str2.charAt(0) == '\n') {
                str3 = "\n" + str3;
            }
            org.telegram.messenger.g0.h3(new a21(str3, 0, v10Var));
        } catch (Exception e11) {
            e = e11;
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("failed to translate a text ");
                sb3.append(httpURLConnection != null ? Integer.valueOf(httpURLConnection.getResponseCode()) : null);
                sb3.append(" ");
                sb3.append(httpURLConnection != null ? httpURLConnection.getResponseMessage() : null);
                Log.e("translate", sb3.toString());
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            e.printStackTrace();
            if (httpURLConnection != null) {
                try {
                    if (httpURLConnection.getResponseCode() == 429) {
                        z9 = true;
                    }
                } catch (Exception unused2) {
                    org.telegram.messenger.g0.h3(new kr0(v10Var, 20));
                    return;
                }
            }
            org.telegram.messenger.g0.h3(new up0(4, v10Var, z9));
        }
    }
}
