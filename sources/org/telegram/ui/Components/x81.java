package org.telegram.ui.Components;

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.FileLog;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class x81 extends AsyncTask {
    public final /* synthetic */ int a;
    public String b;
    public final String[] c;
    public final /* synthetic */ d91 d;

    public x81(d91 d91Var, String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.d = d91Var;
                this.c = new String[4];
                this.b = str;
                break;
            case 2:
                this.d = d91Var;
                this.c = new String[2];
                this.b = str;
                break;
            case 3:
                this.d = d91Var;
                this.c = new String[2];
                this.b = str;
                break;
            case 4:
                this.d = d91Var;
                this.c = new String[2];
                this.b = str;
                break;
            default:
                this.d = d91Var;
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
                String c10 = d91.c(this, str, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher = d91.r0.matcher(c10);
                    if (matcher.find()) {
                        JSONArray jSONArray = new JSONArray(matcher.group(1));
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
                            if (jSONArray2.length() != 0) {
                                JSONObject jSONObject = jSONArray2.getJSONObject(0);
                                if (jSONObject.has("file")) {
                                    strArr[0] = jSONObject.getString("file");
                                    strArr[1] = "other";
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
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
                String c11 = d91.c(this, str2, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject(c11).getJSONObject("file_versions").getJSONObject("mobile");
                    String string = jSONObject2.getString(MediaStreamTrack.VIDEO_TRACK_KIND);
                    String string2 = jSONObject2.getJSONArray(MediaStreamTrack.AUDIO_TRACK_KIND).getString(0);
                    if (string != null && string2 != null) {
                        strArr2[0] = string;
                        strArr2[1] = "other";
                        strArr2[2] = string2;
                        strArr2[3] = "other";
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (isCancelled()) {
                    return null;
                }
                return strArr2[0];
            case 2:
                String[] strArr3 = this.c;
                String str3 = this.b;
                this.d.getClass();
                String c12 = d91.c(this, str3, null, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    Matcher matcher2 = d91.s0.matcher(c12);
                    if (matcher2.find()) {
                        strArr3[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                        strArr3[1] = "other";
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
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
                String c13 = d91.c(this, str4, hashMap, false);
                if (isCancelled()) {
                    return null;
                }
                try {
                    new JSONObject(c13).getJSONObject("stream");
                    JSONObject jSONObject3 = new JSONObject(d91.c(this, "https://api.twitch.tv/api/channels/" + this.b + "/access_token", hashMap, false));
                    String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                    String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                    URLEncoder.encode("https://youtube.googleapis.com/v/" + this.b, "UTF-8");
                    String str5 = "allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2;
                    strArr4[0] = "https://usher.ttvnw.net/api/channel/hls/" + this.b + ".m3u8?" + str5;
                    strArr4[1] = "hls";
                } catch (Exception e11) {
                    FileLog.e(e11);
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
                String c14 = d91.c(this, str6, null, true);
                if (isCancelled()) {
                    return null;
                }
                try {
                    JSONObject jSONObject4 = new JSONObject(c14).getJSONObject("request").getJSONObject("files");
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
                } catch (Exception e12) {
                    FileLog.e(e12);
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
                d91 d91Var = this.d;
                if (str == null) {
                    if (!isCancelled()) {
                        d91Var.h();
                        break;
                    }
                } else {
                    d91Var.w = true;
                    d91Var.x = str;
                    d91Var.y = this.c[1];
                    if (d91Var.s) {
                        d91Var.i();
                    }
                    d91Var.j(false, true);
                    d91Var.f0.d(true, true);
                    break;
                }
                break;
            case 1:
                String str2 = (String) obj;
                d91 d91Var2 = this.d;
                if (str2 == null) {
                    if (!isCancelled()) {
                        d91Var2.h();
                        break;
                    }
                } else {
                    d91Var2.w = true;
                    d91Var2.x = str2;
                    String[] strArr = this.c;
                    d91Var2.y = strArr[1];
                    d91Var2.E = strArr[2];
                    d91Var2.F = strArr[3];
                    if (d91Var2.s) {
                        d91Var2.i();
                    }
                    d91Var2.j(false, true);
                    d91Var2.f0.d(true, true);
                    break;
                }
                break;
            case 2:
                String str3 = (String) obj;
                d91 d91Var3 = this.d;
                if (str3 == null) {
                    if (!isCancelled()) {
                        d91Var3.h();
                        break;
                    }
                } else {
                    d91Var3.w = true;
                    d91Var3.x = str3;
                    d91Var3.y = this.c[1];
                    if (d91Var3.s) {
                        d91Var3.i();
                    }
                    d91Var3.j(false, true);
                    d91Var3.f0.d(true, true);
                    break;
                }
                break;
            case 3:
                String str4 = (String) obj;
                d91 d91Var4 = this.d;
                if (str4 == null) {
                    if (!isCancelled()) {
                        d91Var4.h();
                        break;
                    }
                } else {
                    d91Var4.w = true;
                    d91Var4.x = str4;
                    d91Var4.y = this.c[1];
                    if (d91Var4.s) {
                        d91Var4.i();
                    }
                    d91Var4.j(false, true);
                    d91Var4.f0.d(true, true);
                    break;
                }
                break;
            default:
                String str5 = (String) obj;
                d91 d91Var5 = this.d;
                if (str5 == null) {
                    if (!isCancelled()) {
                        d91Var5.h();
                        break;
                    }
                } else {
                    d91Var5.w = true;
                    d91Var5.x = str5;
                    d91Var5.y = this.c[1];
                    if (d91Var5.s) {
                        d91Var5.i();
                    }
                    d91Var5.j(false, true);
                    d91Var5.f0.d(true, true);
                    break;
                }
                break;
        }
    }
}
