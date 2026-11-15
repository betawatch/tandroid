package c8;

import android.content.res.Configuration;
import android.os.Build;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class x9 {
    public static n0.c a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new n0.c(new n0.f(androidx.emoji2.text.x.f(configuration))) : n0.c.a(configuration.locale);
    }
}
