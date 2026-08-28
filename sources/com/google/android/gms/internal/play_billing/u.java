package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import f7.y5;
import java.util.ArrayList;
import org.json.JSONException;
import org.telegram.messenger.OneUIUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(Bundle bundle, String str, String str2, long j10) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j10);
    }

    public static Bundle c(int i9, n2.g gVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", gVar.a);
        bundle.putString("DEBUG_MESSAGE", gVar.c);
        bundle.putInt("LOG_REASON", aa.d.c(i9));
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, t1 t1Var, long j10) {
        Bundle bundle = new Bundle();
        b(bundle, str, str2, j10);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        p pVar = r.b;
        Object[] objArr = {"subs", "inapp"};
        y5.a(2, objArr);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(r.t(2, objArr)));
        Object[] objArr2 = {"inapp"};
        y5.a(1, objArr2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(r.t(1, objArr2)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        boolean z11 = false;
        for (int i9 = 0; i9 < size; i9++) {
            n2.o oVar = (n2.o) arrayList.get(i9);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z11 |= !TextUtils.isEmpty(null);
            if (oVar.b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z11) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static n2.g e(String str, Intent intent) {
        if (intent != null) {
            j3.a a2 = n2.g.a();
            a2.a = a(str, intent.getExtras());
            a2.c = f(str, intent.getExtras());
            return a2.a();
        }
        h("BillingHelper", "Got null intent!");
        j3.a a3 = n2.g.a();
        a3.a = 6;
        a3.c = "An internal error occurred.";
        return a3.a();
    }

    public static String f(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i9 = OneUIUtilities.ONE_UI_4_0;
            while (!str2.isEmpty() && i9 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i9));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i9 -= min;
            }
        }
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
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

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e10) {
            h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
            return null;
        }
    }
}
