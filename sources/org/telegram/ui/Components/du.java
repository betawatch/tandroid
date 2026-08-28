package org.telegram.ui.Components;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class du extends org.telegram.ui.ActionBar.e5 {
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gu h;

    public du(gu guVar, boolean z10) {
        this.h = guVar;
        this.f = z10;
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.z2
    public final boolean g() {
        gu guVar = this.h;
        g81 g81Var = guVar.c;
        boolean z10 = g81Var.P;
        if (z10) {
            if (z10) {
                g81Var.P = false;
                g81Var.m();
                g81Var.l(false);
            }
            return false;
        }
        try {
            guVar.r.getWindow().clearFlags(128);
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return true;
        }
    }

    @Override // org.telegram.ui.ActionBar.e5, org.telegram.ui.ActionBar.z2
    public final void onOpenAnimationEnd() {
        String str;
        int intValue;
        gu guVar = this.h;
        int i9 = guVar.M;
        RadialProgressView radialProgressView = guVar.n;
        au auVar = guVar.b;
        g81 g81Var = guVar.c;
        if (this.f && guVar.c.g(guVar.G, null, null, guVar.E, true)) {
            radialProgressView.setVisibility(4);
            auVar.setVisibility(4);
            g81Var.setVisibility(0);
            return;
        }
        radialProgressView.setVisibility(0);
        auVar.setVisibility(0);
        guVar.s.setVisibility(0);
        guVar.v.setVisibility(4);
        auVar.setKeepScreenOn(true);
        g81Var.setVisibility(4);
        g81Var.getControlsView().setVisibility(4);
        g81Var.getTextureView().setVisibility(4);
        if (g81Var.getTextureImageView() != null) {
            g81Var.getTextureImageView().setVisibility(4);
        }
        guVar.c.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", "messenger.telegram.org");
        try {
            String youtubeId = g81Var.getYoutubeId();
            if (youtubeId == null) {
                auVar.loadUrl(guVar.G, hashMap);
                return;
            }
            guVar.h.setVisibility(0);
            guVar.y = true;
            auVar.addJavascriptInterface(new fu(guVar), "YoutubeProxy");
            String str2 = guVar.E;
            if (str2 != null) {
                try {
                    Uri parse = Uri.parse(str2);
                    if (i9 > 0) {
                        str = "" + i9;
                    } else {
                        str = null;
                    }
                    if (str == null && (str = parse.getQueryParameter("t")) == null) {
                        str = parse.getQueryParameter("time_continue");
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (str != null) {
                    if (str.contains("m")) {
                        String[] split = str.split("m");
                        intValue = (Utilities.parseInt((CharSequence) split[0]).intValue() * 60) + Utilities.parseInt((CharSequence) split[1]).intValue();
                    } else {
                        intValue = Utilities.parseInt((CharSequence) str).intValue();
                    }
                    guVar.b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
                }
            }
            intValue = 0;
            guVar.b.loadDataWithBaseURL("https://messenger.telegram.org/", String.format(Locale.US, "<!DOCTYPE html><html><head><style>body { margin: 0; width:100%%; height:100%%;  background-color:#000; }html { width:100%%; height:100%%; background-color:#000; }.embed-container iframe,.embed-container object,   .embed-container embed {       position: absolute;       top: 0;       left: 0;       width: 100%% !important;       height: 100%% !important;   }   </style></head><body>   <div class=\"embed-container\">       <div id=\"player\"></div>   </div>   <script src=\"https://www.youtube.com/iframe_api\"></script>   <script>   var player;   var observer;   var videoEl;   var playing;   var posted = false;   YT.ready(function() {       player = new YT.Player(\"player\", {                              \"width\" : \"100%%\",                              \"events\" : {                              \"onReady\" : \"onReady\",                              \"onError\" : \"onError\",                              \"onStateChange\" : \"onStateChange\",                              },                              \"videoId\" : \"%1$s\",                              \"height\" : \"100%%\",                              \"playerVars\" : {                              \"start\" : %2$d,                              \"rel\" : 1,                              \"showinfo\" : 0,                              \"modestbranding\" : 0,                              \"iv_load_policy\" : 3,                              \"autohide\" : 1,                              \"autoplay\" : 1,                              \"cc_load_policy\" : 1,                              \"playsinline\" : 1,                              \"controls\" : 1                              }                            });        player.setSize(window.innerWidth, window.innerHeight);    });    function hideControls() {        playing = !videoEl.paused;       videoEl.controls = 0;       observer.observe(videoEl, {attributes: true});    }    function showControls() {        playing = !videoEl.paused;       observer.disconnect();       videoEl.controls = 1;    }    function onError(event) {       if (!posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onStateChange(event) {       if (event.data == YT.PlayerState.PLAYING && !posted) {            if (window.YoutubeProxy !== undefined) {                   YoutubeProxy.postEvent(\"loaded\", null);             }            posted = true;       }    }    function onReady(event) {       player.playVideo();    }    window.onresize = function() {       player.setSize(window.innerWidth, window.innerHeight);       player.playVideo();    }    </script></body></html>", youtubeId, Integer.valueOf(intValue)), "text/html", "UTF-8", "https://youtube.com");
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }
}
