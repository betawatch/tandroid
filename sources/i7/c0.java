package i7;

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static n0.c a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new n0.c(new n0.f(androidx.emoji2.text.v.f(configuration))) : n0.c.a(configuration.locale);
    }
}
