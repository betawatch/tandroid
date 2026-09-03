package k7;

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class w {
    public static n0.c a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new n0.c(new n0.f(androidx.emoji2.text.w.f(configuration))) : n0.c.a(configuration.locale);
    }
}
