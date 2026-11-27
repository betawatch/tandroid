// default package

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class hyd {
    public static qb6 a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new qb6(new tb6(lh0.i(configuration))) : qb6.a(configuration.locale);
    }
}
