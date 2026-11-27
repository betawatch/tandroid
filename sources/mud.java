// default package

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class mud {
    public static Object a(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return t4.g(bundle);
        }
        Parcelable parcelable = bundle.getParcelable("RESULT_DATA");
        if (Intent.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
