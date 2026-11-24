// default package

import android.content.Context;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ch4 {
    public static yg4 a;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0073, code lost:
    
        if (r8.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0038, code lost:
    
        if (r1.getPhoneCount() <= 1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lh0 a(Context context, v9c v9cVar) {
        String str;
        lh0 lh0Var = new lh0();
        lh0Var.a = v9cVar.a;
        String str2 = v9cVar.b;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        lh0Var.b = str2;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                int b = b(context, lh0Var.a);
                if (b != -1 && Build.VERSION.SDK_INT >= 24) {
                    telephonyManager = telephonyManager.createForSubscriptionId(b);
                }
                String simOperatorName = telephonyManager.getSimOperatorName();
                if (TextUtils.isEmpty(simOperatorName) && Build.VERSION.SDK_INT >= 28) {
                    CharSequence simCarrierIdName = telephonyManager.getSimCarrierIdName();
                    simOperatorName = simCarrierIdName == null ? null : simCarrierIdName.toString();
                }
                if (!TextUtils.isEmpty(simOperatorName)) {
                    lh0Var.b = simOperatorName;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    if (context.checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0) {
                    }
                    str = null;
                    lh0Var.c = TextUtils.isEmpty(str) ? null : str;
                }
                if (i >= 33 && b != -1) {
                    try {
                        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
                        str = subscriptionManager == null ? null : subscriptionManager.getPhoneNumber(b);
                    } catch (SecurityException unused) {
                    }
                }
                str = telephonyManager.getLine1Number();
                lh0Var.c = TextUtils.isEmpty(str) ? null : str;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        return lh0Var;
    }

    public static int b(Context context, int i) {
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                return SubscriptionManager.getSubscriptionId(i);
            }
            if (i2 >= 29) {
                SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
                int[] subscriptionIds = subscriptionManager != null ? subscriptionManager.getSubscriptionIds(i) : null;
                if (subscriptionIds != null && subscriptionIds.length > 0) {
                    return subscriptionIds[0];
                }
            } else {
                if (context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                    SubscriptionManager subscriptionManager2 = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                    SubscriptionInfo activeSubscriptionInfoForSimSlotIndex = subscriptionManager2 != null ? subscriptionManager2.getActiveSubscriptionInfoForSimSlotIndex(i) : null;
                    if (activeSubscriptionInfoForSimSlotIndex != null) {
                        return activeSubscriptionInfoForSimSlotIndex.getSubscriptionId();
                    }
                }
            }
            return -1;
        } catch (Exception e) {
            fa4.g(e, true);
            return -1;
        }
    }
}
