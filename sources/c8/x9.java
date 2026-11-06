package c8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class x9 {
    public static Object a(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return g0.a.e(bundle);
        }
        Parcelable parcelable = bundle.getParcelable("RESULT_DATA");
        if (Intent.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
