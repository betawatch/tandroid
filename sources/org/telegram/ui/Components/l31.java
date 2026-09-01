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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l31 extends Thread {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Utilities.Callback2 d;

    public l31(String str, String str2, String str3, Utilities.Callback2 callback2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = callback2;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HttpURLConnection httpURLConnection;
        String str;
        Utilities.Callback2 callback2 = this.d;
        String str2 = this.c;
        boolean z4 = false;
        try {
            httpURLConnection = (HttpURLConnection) new URI(("https://translate.googleapis.com/translate_a/single?client=gtx&sl=" + Uri.encode(this.a) + "&tl=" + Uri.encode(this.b) + "&dt=t&ie=UTF-8&oe=UTF-8&otf=1&ssel=0&tsel=0&kc=7&dt=at&dt=bd&dt=ex&dt=ld&dt=md&dt=qca&dt=rw&dt=rm&dt=ss&q=") + str2).toURL().openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setRequestProperty("User-Agent", w31.O[(int) Math.round(Math.random() * 5)]);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), r8.d.c));
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
                for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
                    String string = jSONArray2.getJSONArray(i10).getString(0);
                    if (string != null && !string.equals(BuildConfig.BETA_URL)) {
                        str3 = str3 + string;
                    }
                }
                if (str2.length() > 0 && str2.charAt(0) == '\n') {
                    str3 = "\n" + str3;
                }
                AndroidUtilities.runOnUIThread(new a90(28, callback2, str3));
            } catch (Exception e6) {
                e = e6;
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("failed to translate a text ");
                    sb2.append(httpURLConnection != null ? Integer.valueOf(httpURLConnection.getResponseCode()) : null);
                    sb2.append(" ");
                    sb2.append(httpURLConnection != null ? httpURLConnection.getResponseMessage() : null);
                    Log.e("translate", sb2.toString());
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                e.printStackTrace();
                if (httpURLConnection != null) {
                    try {
                        if (httpURLConnection.getResponseCode() == 429) {
                            z4 = true;
                        }
                    } catch (Exception unused2) {
                        AndroidUtilities.runOnUIThread(new oq0(callback2, 21));
                        return;
                    }
                }
                AndroidUtilities.runOnUIThread(new rv0(1, callback2, z4));
            }
        } catch (Exception e11) {
            e = e11;
            httpURLConnection = null;
        }
    }
}
