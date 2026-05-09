package androidx.car.app.utils;

import android.content.Context;
import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class CommonUtils {
    public static boolean isAutomotiveOS(Context context) {
        Objects.requireNonNull(context);
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }
}
