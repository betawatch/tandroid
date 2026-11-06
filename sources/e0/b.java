package e0;

import a8.p0;
import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class b extends f0.d {
    /* JADX WARN: Multi-variable type inference failed */
    public static void f(Activity activity, String[] strArr, int i7) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (TextUtils.isEmpty(strArr[i10])) {
                throw new IllegalArgumentException(p0.s(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i10], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (!hashSet.contains(Integer.valueOf(i12))) {
                    strArr2[i11] = strArr[i12];
                    i11++;
                }
            }
        }
        if (activity instanceof a) {
        }
        activity.requestPermissions(strArr, i7);
    }
}
