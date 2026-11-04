package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x61 extends AsyncTask {
    public final /* synthetic */ int a;
    public String b;
    public final String[] c;
    public final /* synthetic */ d71 d;

    public x61(d71 d71Var, String str, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.d = d71Var;
                this.c = new String[4];
                this.b = str;
                break;
            case 2:
                this.d = d71Var;
                this.c = new String[2];
                this.b = str;
                break;
            case 3:
                this.d = d71Var;
                this.c = new String[2];
                this.b = str;
                break;
            case 4:
                this.d = d71Var;
                this.c = new String[2];
                this.b = str;
                break;
            default:
                this.d = d71Var;
                this.c = new String[2];
                this.b = str;
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.a) {
            case 0:
                String[] strArr = this.c;
                Locale locale = Locale.US;
                String str = "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.b;
                this.d.getClass();
                String c2 = d71.c(this, str, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = d71.s0.matcher(c2);
                    if (matcher.find()) {
                        JSONArray jSONArray = new JSONArray(matcher.group(1));
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i3);
                            if (jSONArray2.length() != 0) {
                                JSONObject jSONObject = jSONArray2.getJSONObject(0);
                                if (jSONObject.has("file")) {
                                    strArr[0] = jSONObject.getString("file");
                                    strArr[1] = "other";
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr[0];
            case 1:
                String[] strArr2 = this.c;
                Locale locale2 = Locale.US;
                String str2 = "https://coub.com/api/v2/coubs/" + this.b + ".json";
                this.d.getClass();
                String c10 = d71.c(this, str2, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(c10).getJSONObject("file_versions").getJSONObject("mobile");
                    String string = jSONObject2.getString(MediaStreamTrack.VIDEO_TRACK_KIND);
                    String string2 = jSONObject2.getJSONArray(MediaStreamTrack.AUDIO_TRACK_KIND).getString(0);
                    if (string != null && string2 != null) {
                        strArr2[0] = string;
                        strArr2[1] = "other";
                        strArr2[2] = string2;
                        strArr2[3] = "other";
                    }
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr2[0];
            case 2:
                String[] strArr3 = this.c;
                String str3 = this.b;
                this.d.getClass();
                String c11 = d71.c(this, str3, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = d71.t0.matcher(c11);
                    if (matcher2.find()) {
                        strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr3[1] = "other";
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr3[0];
            case 3:
                String[] strArr4 = this.c;
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.b.indexOf(38);
                if (indexOf > 0) {
                    this.b = this.b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                String str4 = "https://api.twitch.tv/kraken/streams/" + this.b + "?stream_type=all";
                this.d.getClass();
                String c12 = d71.c(this, str4, hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c12).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(d71.c(this, "https://api.twitch.tv/api/channels/" + this.b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.b, "UTF-8");
                    String str5 = "allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2;
                    strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + this.b + ".m3u8?" + str5;
                    strArr4[1] = "hls";
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr4[0];
            default:
                String[] strArr5 = this.c;
                Locale locale4 = Locale.US;
                String str6 = "https://player.vimeo.com/video/" + this.b + "/config";
                this.d.getClass();
                String c13 = d71.c(this, str6, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject4 = new JSONObject(c13).getJSONObject("request").getJSONObject("files");
                    if (jSONObject4.has("hls")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("hls");
                        try {
                            strArr5[0] = jSONObject5.getString("url");
                        } catch (Exception unused) {
                            strArr5[0] = jSONObject5.getJSONObject("cdns").getJSONObject(jSONObject5.getString("default_cdn")).getString("url");
                        }
                        strArr5[1] = "hls";
                    } else if (jSONObject4.has("progressive")) {
                        strArr5[1] = "other";
                        strArr5[0] = jSONObject4.getJSONArray("progressive").getJSONObject(0).getString("url");
                    }
                } catch (Exception e14) {
                    org.telegram.messenger.a8.g(e14, true);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr5[0];
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                d71 d71Var = this.d;
                if (str == null) {
                    if (!isCancelled()) {
                        d71Var.h();
                        break;
                    }
                } else {
                    d71Var.x = true;
                    d71Var.y = str;
                    d71Var.E = this.c[1];
                    if (d71Var.s) {
                        d71Var.i();
                    }
                    d71Var.j(false, true);
                    d71Var.g0.d(true, true);
                    break;
                }
                break;
            case 1:
                String str2 = (String) obj;
                d71 d71Var2 = this.d;
                if (str2 == null) {
                    if (!isCancelled()) {
                        d71Var2.h();
                        break;
                    }
                } else {
                    d71Var2.x = true;
                    d71Var2.y = str2;
                    String[] strArr = this.c;
                    d71Var2.E = strArr[1];
                    d71Var2.F = strArr[2];
                    d71Var2.G = strArr[3];
                    if (d71Var2.s) {
                        d71Var2.i();
                    }
                    d71Var2.j(false, true);
                    d71Var2.g0.d(true, true);
                    break;
                }
                break;
            case 2:
                String str3 = (String) obj;
                d71 d71Var3 = this.d;
                if (str3 == null) {
                    if (!isCancelled()) {
                        d71Var3.h();
                        break;
                    }
                } else {
                    d71Var3.x = true;
                    d71Var3.y = str3;
                    d71Var3.E = this.c[1];
                    if (d71Var3.s) {
                        d71Var3.i();
                    }
                    d71Var3.j(false, true);
                    d71Var3.g0.d(true, true);
                    break;
                }
                break;
            case 3:
                String str4 = (String) obj;
                d71 d71Var4 = this.d;
                if (str4 == null) {
                    if (!isCancelled()) {
                        d71Var4.h();
                        break;
                    }
                } else {
                    d71Var4.x = true;
                    d71Var4.y = str4;
                    d71Var4.E = this.c[1];
                    if (d71Var4.s) {
                        d71Var4.i();
                    }
                    d71Var4.j(false, true);
                    d71Var4.g0.d(true, true);
                    break;
                }
                break;
            default:
                String str5 = (String) obj;
                d71 d71Var5 = this.d;
                if (str5 == null) {
                    if (!isCancelled()) {
                        d71Var5.h();
                        break;
                    }
                } else {
                    d71Var5.x = true;
                    d71Var5.y = str5;
                    d71Var5.E = this.c[1];
                    if (d71Var5.s) {
                        d71Var5.i();
                    }
                    d71Var5.j(false, true);
                    d71Var5.g0.d(true, true);
                    break;
                }
                break;
        }
    }
}
