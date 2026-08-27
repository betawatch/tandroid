package e2;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.createDeviceProtectedStorageContext().getCodeCacheDir();
    }
}
