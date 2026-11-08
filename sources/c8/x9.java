package c8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
