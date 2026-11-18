package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class eu extends org.telegram.ui.ActionBar.w4 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ gu s;

    public eu(gu guVar, boolean z10) {
        this.s = guVar;
        this.r = z10;
    }

    @Override // org.telegram.ui.ActionBar.w4, org.telegram.ui.ActionBar.r2
    public final void v() {
        String str;
        int intValue;
        gu guVar = this.s;
        int i7 = guVar.L1;
        RadialProgressView radialProgressView = guVar.s1;
        cu cuVar = guVar.m1;
        w71 w71Var = guVar.n1;
        if (this.r && guVar.n1.g(guVar.F1, null, null, guVar.D1, true)) {
            radialProgressView.setVisibility(4);
            cuVar.setVisibility(4);
            w71Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        cuVar.setVisibility(0);
        guVar.u1.setVisibility(0);
        guVar.v1.setVisibility(4);
        cuVar.setKeepScreenOn(true);
        w71Var.setVisibility(4);
        w71Var.getControlsView().setVisibility(4);
        w71Var.getTextureView().setVisibility(4);
        if (w71Var.getTextureImageView() != null) {
            w71Var.getTextureImageView().setVisibility(4);
        }
        guVar.n1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = w71Var.getYoutubeId();
            if (youtubeId == null) {
                cuVar.loadUrl(guVar.F1, hashMap);
                return;
            }
            guVar.r1.setVisibility(0);
            guVar.y1 = true;
            cuVar.addJavascriptInterface(new fu(guVar), "YoutubeProxy");
            String str2 = guVar.D1;
            if (str2 != null) {
                try {
                    Uri parse = Uri.parse(str2);
                    if (i7 > 0) {
                        str = "" + i7;
                    } else {
                        str = null;
                    }
                    if (str == null && (str = parse.getQueryParameter("t")) == null) {
                        str = parse.getQueryParameter("time_continue");
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (str != null) {
                    if (str.contains("m")) {
                        String[] split = str.split("m");
                        intValue = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                    } else {
                        intValue = Utilities.z(str).intValue();
                    }
                    guVar.m1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                }
            }
            intValue = 0;
            guVar.m1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w4, org.telegram.ui.ActionBar.r2
    public final boolean x() {
        gu guVar = this.s;
        w71 w71Var = guVar.n1;
        boolean z10 = w71Var.U;
        if (z10) {
            if (z10) {
                w71Var.U = false;
                w71Var.m();
                w71Var.l(false);
            }
            return false;
        }
        try {
            guVar.t1.getWindow().clearFlags(128);
            return true;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return true;
        }
    }
}
