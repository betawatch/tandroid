package k7;

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class x {
    public static n0.c a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new n0.c(new n0.f(androidx.emoji2.text.x.f(configuration))) : n0.c.a(configuration.locale);
    }
}
