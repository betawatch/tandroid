// default package

import android.os.AsyncTask;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nvc extends AsyncTask {
    public final /* synthetic */ byte a;
    public String b;
    public final String[] c;
    public final /* synthetic */ tvc d;

    public nvc(tvc tvcVar, String str, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.d = tvcVar;
                this.c = new String[4];
                this.b = str;
                break;
            case 2:
                this.d = tvcVar;
                this.c = new String[2];
                this.b = str;
                break;
            case 3:
                this.d = tvcVar;
                this.c = new String[2];
                this.b = str;
                break;
            case 4:
                this.d = tvcVar;
                this.c = new String[2];
                this.b = str;
                break;
            default:
                this.d = tvcVar;
                this.c = new String[2];
                this.b = str;
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        byte b = this.a;
        tvc tvcVar = this.d;
        String[] strArr = this.c;
        switch (b) {
            case 0:
                Locale locale = Locale.US;
                String str = "http://www.aparat.com/video/video/embed/vt/frame/showvideo/yes/videohash/" + this.b;
                tvcVar.getClass();
                String c = tvc.c(this, str, null, true);
                if (!isCancelled()) {
                    try {
                        Matcher matcher = tvc.s0.matcher(c);
                        if (matcher.find()) {
                            JSONArray jSONArray = new JSONArray(matcher.group(1));
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
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
                        fc4.g(e, true);
                    }
                    if (!isCancelled()) {
                        break;
                    }
                }
                break;
            case 1:
                Locale locale2 = Locale.US;
                String str2 = "https://coub.com/api/v2/coubs/" + this.b + ".json";
                tvcVar.getClass();
                String c2 = tvc.c(this, str2, null, true);
                if (!isCancelled()) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(c2).getJSONObject("file_versions").getJSONObject("mobile");
                        String string = jSONObject2.getString(MediaStreamTrack.VIDEO_TRACK_KIND);
                        String string2 = jSONObject2.getJSONArray(MediaStreamTrack.AUDIO_TRACK_KIND).getString(0);
                        if (string != null && string2 != null) {
                            strArr[0] = string;
                            strArr[1] = "other";
                            strArr[2] = string2;
                            strArr[3] = "other";
                        }
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                    if (!isCancelled()) {
                        break;
                    }
                }
                break;
            case 2:
                String str3 = this.b;
                tvcVar.getClass();
                String c3 = tvc.c(this, str3, null, false);
                if (!isCancelled()) {
                    try {
                        Matcher matcher2 = tvc.t0.matcher(c3);
                        if (matcher2.find()) {
                            strArr[0] = new JSONObject(matcher2.group(1)).getJSONArray("quality_options").getJSONObject(0).getString("source");
                            strArr[1] = "other";
                        }
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                    }
                    if (!isCancelled()) {
                        break;
                    }
                }
                break;
            case 3:
                HashMap hashMap = new HashMap();
                hashMap.put("Client-ID", "jzkbprff40iqj646a697cyrvl0zt2m6");
                int indexOf = this.b.indexOf(38);
                if (indexOf > 0) {
                    this.b = this.b.substring(0, indexOf);
                }
                Locale locale3 = Locale.US;
                String str4 = "https://api.twitch.tv/kraken/streams/" + this.b + "?stream_type=all";
                tvcVar.getClass();
                String c4 = tvc.c(this, str4, hashMap, false);
                if (!isCancelled()) {
                    try {
                        new JSONObject(c4).getJSONObject("stream");
                        JSONObject jSONObject3 = new JSONObject(tvc.c(this, "https://api.twitch.tv/api/channels/" + this.b + "/access_token", hashMap, false));
                        String encode = URLEncoder.encode(jSONObject3.getString("sig"), "UTF-8");
                        String encode2 = URLEncoder.encode(jSONObject3.getString("token"), "UTF-8");
                        URLEncoder.encode("https://youtube.googleapis.com/v/" + this.b, "UTF-8");
                        String str5 = "allow_source=true&allow_audio_only=true&allow_spectre=true&player=twitchweb&segment_preference=4&p=" + ((int) (Math.random() * 1.0E7d)) + "&sig=" + encode + "&token=" + encode2;
                        strArr[0] = "https://usher.ttvnw.net/api/channel/hls/" + this.b + ".m3u8?" + str5;
                        strArr[1] = "hls";
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                    }
                    if (!isCancelled()) {
                        break;
                    }
                }
                break;
            default:
                Locale locale4 = Locale.US;
                String str6 = "https://player.vimeo.com/video/" + this.b + "/config";
                tvcVar.getClass();
                String c5 = tvc.c(this, str6, null, true);
                if (!isCancelled()) {
                    try {
                        JSONObject jSONObject4 = new JSONObject(c5).getJSONObject("request").getJSONObject("files");
                        if (jSONObject4.has("hls")) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("hls");
                            try {
                                strArr[0] = jSONObject5.getString("url");
                            } catch (Exception unused) {
                                strArr[0] = jSONObject5.getJSONObject("cdns").getJSONObject(jSONObject5.getString("default_cdn")).getString("url");
                            }
                            strArr[1] = "hls";
                        } else if (jSONObject4.has("progressive")) {
                            strArr[1] = "other";
                            strArr[0] = jSONObject4.getJSONArray("progressive").getJSONObject(0).getString("url");
                        }
                    } catch (Exception e5) {
                        fc4.g(e5, true);
                    }
                    if (!isCancelled()) {
                        break;
                    }
                }
                break;
        }
        return strArr[0];
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        byte b = this.a;
        String[] strArr = this.c;
        tvc tvcVar = this.d;
        switch (b) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    if (!isCancelled()) {
                        tvcVar.h();
                        break;
                    }
                } else {
                    tvcVar.x = true;
                    tvcVar.y = str;
                    tvcVar.E = strArr[1];
                    if (tvcVar.s) {
                        tvcVar.i();
                    }
                    tvcVar.j(false, true);
                    tvcVar.g0.d(true, true);
                    break;
                }
                break;
            case 1:
                String str2 = (String) obj;
                if (str2 == null) {
                    if (!isCancelled()) {
                        tvcVar.h();
                        break;
                    }
                } else {
                    tvcVar.x = true;
                    tvcVar.y = str2;
                    tvcVar.E = strArr[1];
                    tvcVar.F = strArr[2];
                    tvcVar.G = strArr[3];
                    if (tvcVar.s) {
                        tvcVar.i();
                    }
                    tvcVar.j(false, true);
                    tvcVar.g0.d(true, true);
                    break;
                }
                break;
            case 2:
                String str3 = (String) obj;
                if (str3 == null) {
                    if (!isCancelled()) {
                        tvcVar.h();
                        break;
                    }
                } else {
                    tvcVar.x = true;
                    tvcVar.y = str3;
                    tvcVar.E = strArr[1];
                    if (tvcVar.s) {
                        tvcVar.i();
                    }
                    tvcVar.j(false, true);
                    tvcVar.g0.d(true, true);
                    break;
                }
                break;
            case 3:
                String str4 = (String) obj;
                if (str4 == null) {
                    if (!isCancelled()) {
                        tvcVar.h();
                        break;
                    }
                } else {
                    tvcVar.x = true;
                    tvcVar.y = str4;
                    tvcVar.E = strArr[1];
                    if (tvcVar.s) {
                        tvcVar.i();
                    }
                    tvcVar.j(false, true);
                    tvcVar.g0.d(true, true);
                    break;
                }
                break;
            default:
                String str5 = (String) obj;
                if (str5 == null) {
                    if (!isCancelled()) {
                        tvcVar.h();
                        break;
                    }
                } else {
                    tvcVar.x = true;
                    tvcVar.y = str5;
                    tvcVar.E = strArr[1];
                    if (tvcVar.s) {
                        tvcVar.i();
                    }
                    tvcVar.j(false, true);
                    tvcVar.g0.d(true, true);
                    break;
                }
                break;
        }
    }
}
