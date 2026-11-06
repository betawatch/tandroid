package org.telegram.messenger;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class i9 {
    public static db.a a;

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00da, code lost:
    
        if (r10.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a4.k a(Context context, db.c cVar) {
        String str;
        a4.k kVar = new a4.k(4, (byte) 0);
        kVar.b = cVar.a;
        String str2 = cVar.b;
        String str3 = null;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        kVar.c = str2;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                int b10 = b(context, kVar.b);
                if (b10 != -1 && Build.VERSION.SDK_INT >= 24) {
                    telephonyManager = telephonyManager.createForSubscriptionId(b10);
                } else if (telephonyManager.getPhoneCount() > 1) {
                }
                String simOperatorName = telephonyManager.getSimOperatorName();
                if (TextUtils.isEmpty(simOperatorName) && Build.VERSION.SDK_INT >= 28) {
                    CharSequence simCarrierIdName = telephonyManager.getSimCarrierIdName();
                    simOperatorName = simCarrierIdName == null ? null : simCarrierIdName.toString();
                }
                if (!TextUtils.isEmpty(simOperatorName)) {
                    kVar.c = simOperatorName;
                }
                String simCountryIso = telephonyManager.getSimCountryIso();
                if (!TextUtils.isEmpty(simCountryIso)) {
                    Locale locale = hd.E0().y;
                    Locale locale2 = new Locale("", simCountryIso.toUpperCase(Locale.US));
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    String displayCountry = locale2.getDisplayCountry(locale);
                    if (TextUtils.isEmpty(displayCountry)) {
                        displayCountry = null;
                    }
                    kVar.d = displayCountry;
                }
                String simOperator = telephonyManager.getSimOperator();
                if (simOperator != null && simOperator.length() >= 5) {
                    kVar.e = simOperator.substring(0, 3) + " " + simOperator.substring(3);
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 26) {
                    if (context.checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0) {
                    }
                    str = null;
                    if (!TextUtils.isEmpty(str)) {
                        str3 = str;
                    }
                    kVar.f = str3;
                }
                if (i7 >= 33 && b10 != -1) {
                    try {
                        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
                        str = subscriptionManager == null ? null : subscriptionManager.getPhoneNumber(b10);
                    } catch (SecurityException unused) {
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str)) {
                        }
                        kVar.f = str3;
                    }
                }
                str = telephonyManager.getLine1Number();
                if (!TextUtils.isEmpty(str)) {
                }
                kVar.f = str3;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return kVar;
    }

    public static int b(Context context, int i7) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                return SubscriptionManager.getSubscriptionId(i7);
            }
            SubscriptionInfo subscriptionInfo = null;
            int[] subscriptionIds = null;
            if (i10 >= 29) {
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
                if (subscriptionManager != null) {
                    subscriptionIds = subscriptionManager.getSubscriptionIds(i7);
                }
                if (subscriptionIds != null && subscriptionIds.length > 0) {
                    return subscriptionIds[0];
                }
            } else {
                if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                    SubscriptionManager subscriptionManager2 = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                    if (subscriptionManager2 != null) {
                        subscriptionInfo = subscriptionManager2.getActiveSubscriptionInfoForSimSlotIndex(i7);
                    }
                    if (subscriptionInfo != null) {
                        return subscriptionInfo.getSubscriptionId();
                    }
                }
            }
            return -1;
        } catch (Exception e10) {
            a8.g(e10, true);
            return -1;
        }
    }
}
