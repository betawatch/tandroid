package c8;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
