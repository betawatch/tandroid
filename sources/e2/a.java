package e2;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }
}
