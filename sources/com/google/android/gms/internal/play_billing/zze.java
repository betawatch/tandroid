package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.telegram.messenger.OneUIUtilities;

/* loaded from: classes.dex */
public abstract class zze {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent != null) {
            return zzp(intent.getExtras(), "ProxyBillingActivity");
        }
        zzl("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzk(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzl(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(Bundle bundle, String str, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putLong("billingClientSessionId", j);
        return bundle;
    }

    public static Bundle zzd(boolean z, boolean z2, boolean z3, boolean z4, String str, long j) {
        Bundle bundle = new Bundle();
        zzc(bundle, str, j);
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static BillingResult zzf(Intent intent, String str) {
        if (intent != null) {
            BillingResult.Builder newBuilder = BillingResult.newBuilder();
            newBuilder.setResponseCode(zzb(intent.getExtras(), str));
            newBuilder.setDebugMessage(zzh(intent.getExtras(), str));
            return newBuilder.build();
        }
        zzl("BillingHelper", "Got null intent!");
        BillingResult.Builder newBuilder2 = BillingResult.newBuilder();
        newBuilder2.setResponseCode(6);
        newBuilder2.setDebugMessage("An internal error occurred.");
        return newBuilder2.build();
    }

    public static String zzh(Bundle bundle, String str) {
        if (bundle == null) {
            zzl(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzk(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzl(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzi(int i) {
        return zzd.zza(i).toString();
    }

    public static List zzj(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase zzq = zzq(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzq == null) {
                zzk("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzq);
        } else {
            zzk("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase zzq2 = zzq(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzq2 != null) {
                    arrayList.add(zzq2);
                }
            }
        }
        return arrayList;
    }

    public static void zzk(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = OneUIUtilities.ONE_UI_4_0;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i -= min;
            }
        }
    }

    public static void zzl(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void zzm(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Bundle zzn(BillingResult billingResult, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", billingResult.getResponseCode());
        bundle.putString("DEBUG_MESSAGE", billingResult.getDebugMessage());
        bundle.putInt("LOG_REASON", i - 1);
        return bundle;
    }

    public static Bundle zzo(BillingResult billingResult, int i, String str) {
        Bundle zzn = zzn(billingResult, 5);
        if (str != null) {
            zzn.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return zzn;
    }

    private static int zzp(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        zzl(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase zzq(String str, String str2) {
        if (str == null || str2 == null) {
            zzk("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            zzl("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
