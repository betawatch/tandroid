package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class eu extends org.telegram.ui.ActionBar.d5 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ hu s;

    public eu(hu huVar, boolean z10) {
        this.s = huVar;
        this.r = z10;
    }

    @Override // org.telegram.ui.ActionBar.d5, org.telegram.ui.ActionBar.t2
    public final void w() {
        String str;
        int intValue;
        hu huVar = this.s;
        int i10 = huVar.H1;
        RadialProgressView radialProgressView = huVar.o1;
        cu cuVar = huVar.i1;
        m81 m81Var = huVar.j1;
        if (this.r && huVar.j1.g(huVar.B1, null, null, huVar.z1, true)) {
            radialProgressView.setVisibility(4);
            cuVar.setVisibility(4);
            m81Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        cuVar.setVisibility(0);
        huVar.q1.setVisibility(0);
        huVar.r1.setVisibility(4);
        cuVar.setKeepScreenOn(true);
        m81Var.setVisibility(4);
        m81Var.getControlsView().setVisibility(4);
        m81Var.getTextureView().setVisibility(4);
        if (m81Var.getTextureImageView() != null) {
            m81Var.getTextureImageView().setVisibility(4);
        }
        huVar.j1.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = m81Var.getYoutubeId();
            if (youtubeId == null) {
                cuVar.loadUrl(huVar.B1, hashMap);
                return;
            }
            huVar.n1.setVisibility(0);
            huVar.u1 = true;
            cuVar.addJavascriptInterface(new gu(huVar), "YoutubeProxy");
            String str2 = huVar.z1;
            if (str2 != null) {
                try {
                    Uri parse = Uri.parse(str2);
                    if (i10 > 0) {
                        str = "" + i10;
                    } else {
                        str = null;
                    }
                    if (str == null && (str = parse.getQueryParameter("t")) == null) {
                        str = parse.getQueryParameter("time_continue");
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                if (str != null) {
                    if (str.contains("m")) {
                        String[] split = str.split("m");
                        intValue = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                    } else {
                        intValue = Utilities.z(str).intValue();
                    }
                    huVar.i1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                }
            }
            intValue = 0;
            huVar.i1.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d5, org.telegram.ui.ActionBar.t2
    public final boolean y() {
        hu huVar = this.s;
        m81 m81Var = huVar.j1;
        boolean z10 = m81Var.T;
        if (z10) {
            if (z10) {
                m81Var.T = false;
                m81Var.m();
                m81Var.l(false);
            }
            return false;
        }
        try {
            huVar.p1.getWindow().clearFlags(128);
            return true;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            return true;
        }
    }
}
