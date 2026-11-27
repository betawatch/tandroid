// default package

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class hyd {
    public static qb6 a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new qb6(new tb6(lh0.i(configuration))) : qb6.a(configuration.locale);
    }
}
