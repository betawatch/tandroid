package ab;

import a8.r7;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
