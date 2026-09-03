package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import androidx.car.app.navigation.model.Maneuver;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import k7.p7;
import kotlin.jvm.internal.j;
import org.telegram.messenger.MessageObject;
import sc.c;
import sc.g;
import tc.h;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class zzhc implements zzha {
    private final c zza;

    public zzhc() {
        int i10 = zzby.zza;
        this.zza = p7.a(zzhb.zza);
    }

    private static final void zzb(byte[] bArr) {
        for (zzwn zzwnVar : zzwq.zzk(bArr).zzl()) {
            String str = "INIT_TOTAL";
            List c3 = h.c("INIT_TOTAL", "EXECUTE_TOTAL");
            switch (zzwnVar.zzaa()) {
                case 2:
                    str = "UNKNOWN";
                    break;
                case 3:
                    str = "INIT_NATIVE";
                    break;
                case 4:
                    str = "INIT_NETWORK";
                    break;
                case 5:
                    str = "INIT_JS";
                    break;
                case 6:
                    break;
                case 7:
                    str = "EXECUTE_NATIVE";
                    break;
                case 8:
                    str = "EXECUTE_JS";
                    break;
                case 9:
                    str = "EXECUTE_TOTAL";
                    break;
                case 10:
                    str = "CHALLENGE_ACCOUNT_NATIVE";
                    break;
                case 11:
                    str = "CHALLENGE_ACCOUNT_JS";
                    break;
                case 12:
                    str = "CHALLENGE_ACCOUNT_TOTAL";
                    break;
                case 13:
                    str = "VERIFY_PIN_NATIVE";
                    break;
                case 14:
                    str = "VERIFY_PIN_JS";
                    break;
                case 15:
                    str = "VERIFY_PIN_TOTAL";
                    break;
                case 16:
                    str = "RUN_PROGRAM";
                    break;
                case 17:
                    str = "FETCH_ALLOWLIST";
                    break;
                case 18:
                    str = "JS_LOAD";
                    break;
                case 19:
                    str = "WEB_VIEW_RELOAD_JS";
                    break;
                case 20:
                    str = "INIT_NETWORK_MRI_ACTION";
                    break;
                case 21:
                    str = "INIT_DOWNLOAD_JS";
                    break;
                case 22:
                    str = "VALIDATE_INPUT";
                    break;
                case 23:
                    str = "DOWNLOAD_JS";
                    break;
                case 24:
                    str = "SAVE_CACHE_JS";
                    break;
                case 25:
                    str = "LOAD_CACHE_JS";
                    break;
                case 26:
                    str = "LOAD_WEBVIEW";
                    break;
                case 27:
                    str = "COLLECT_SIGNALS";
                    break;
                case 28:
                    str = "FETCH_TOKEN";
                    break;
                case 29:
                    str = "POST_EXECUTE";
                    break;
                case MessageObject.TYPE_GIFT_STARS /* 30 */:
                    str = "SIGNAL_MANAGER_INITIALIZATION";
                    break;
                case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                    str = "SIGNAL_MANAGER_COLLECT_SIGNALS";
                    break;
                case 32:
                    str = "WEBVIEW_ENGINE_INITIALIATION";
                    break;
                case 33:
                    str = "WEBVIEW_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 34:
                    str = "NATIVE_ENGINE_INITIALIZATION";
                    break;
                case 35:
                    str = "NATIVE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 36:
                    str = "NATIVE_SIGNAL_INITIALIZATION";
                    break;
                case 37:
                    str = "NATIVE_SIGNAL_COLLECTION";
                    break;
                case 38:
                    str = "PIA_WARMUP";
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    str = "GMSCORE_ENGINE_INITIALIZATION";
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    str = "GMSCORE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    str = "INIT_ATTEMPT";
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    str = "WEBVIEW_INITIALIZATION";
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    str = "ORCAS_ENGINE_INITIALIZATION";
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    str = "ORCAS_ENGINE_SIGNAL_COLLECTION";
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    str = "INIT_CLIENT_REUSE";
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    str = "ORCAS_SIGNAL_COLLECTION";
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    str = "ORCAS_SIGNAL_INITIALIZATION";
                    break;
                case 48:
                    str = "FETCH_TOKEN_ATTEMPT";
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    str = "ORCAS_FETCH_VERIFICATION_KEY";
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    str = "ORCAS_VALIDATE_SIGNATURE";
                    break;
                default:
                    str = "UNRECOGNIZED";
                    break;
            }
            if (c3.contains(str) && zzwnVar.zzY()) {
                zzwnVar.zzN();
                zzwnVar.zzO();
                zzwnVar.zzaa();
                zzwnVar.zzi().zzk();
                zzwnVar.zzi().zzf();
                zzwnVar.zzab();
            } else {
                zzwnVar.zzN();
                zzwnVar.zzO();
                zzwnVar.zzaa();
                zzwnVar.zzab();
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzha
    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            String zzc = ((zzcy) ((g) this.zza).a()).zzc();
            if (URLUtil.isHttpUrl(zzc)) {
                URLConnection openConnection = new URL(zzc).openConnection();
                j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                httpURLConnection = (HttpURLConnection) openConnection;
            } else {
                if (!URLUtil.isHttpsUrl(zzc)) {
                    throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                }
                URLConnection openConnection2 = new URL(zzc).openConnection();
                j.c(openConnection2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                httpURLConnection = (HttpsURLConnection) openConnection2;
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e6) {
            e6.getMessage();
            return false;
        }
    }
}
