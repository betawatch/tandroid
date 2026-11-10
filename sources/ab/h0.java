package ab;

import a8.r7;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class h0 {
    public static WeakReference d;
    public final SharedPreferences a;
    public r7 b;
    public final ScheduledThreadPoolExecutor c;

    public h0(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized g0 a() {
        g0 g0Var;
        String B = this.b.B();
        Pattern pattern = g0.d;
        g0Var = null;
        if (!TextUtils.isEmpty(B)) {
            String[] split = B.split("!", -1);
            if (split.length == 2) {
                g0Var = new g0(split[0], split[1]);
            }
        }
        return g0Var;
    }

    public final synchronized void b() {
        this.b = r7.m(this.a, this.c);
    }

    public final synchronized void c(g0 g0Var) {
        this.b.G(g0Var.c);
    }
}
