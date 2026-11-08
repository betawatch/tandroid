package org.telegram.messenger;

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class i9 {
    public static db.a a;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x007a, code lost:
    
        if (r8.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d1 a(Context context, db.c cVar) {
        String str;
        d1 d1Var = new d1();
        d1Var.a = cVar.a;
        String str2 = cVar.b;
        String str3 = null;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        d1Var.b = str2;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                int b10 = b(context, d1Var.a);
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
                    d1Var.b = simOperatorName;
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 26) {
                    if (context.checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0) {
                    }
                    str = null;
                    if (!TextUtils.isEmpty(str)) {
                        str3 = str;
                    }
                    d1Var.c = str3;
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
                        d1Var.c = str3;
                    }
                }
                str = telephonyManager.getLine1Number();
                if (!TextUtils.isEmpty(str)) {
                }
                d1Var.c = str3;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return d1Var;
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
