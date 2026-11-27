// default package

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class hyd {
    public static qb6 a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new qb6(new tb6(lh0.i(configuration))) : qb6.a(configuration.locale);
    }
}
