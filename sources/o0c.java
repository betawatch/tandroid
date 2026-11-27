// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class o0c {
    public static WeakReference d;
    public final SharedPreferences a;
    public ko9 b;
    public final ScheduledThreadPoolExecutor c;

    public o0c(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized yxb a() {
        yxb yxbVar;
        String w = this.b.w();
        Pattern pattern = yxb.d;
        yxbVar = null;
        if (!TextUtils.isEmpty(w)) {
            String[] split = w.split("!", -1);
            if (split.length == 2) {
                yxbVar = new yxb(split[0], split[1]);
            }
        }
        return yxbVar;
    }

    public final synchronized void b() {
        this.b = ko9.j(this.a, this.c);
    }

    public final synchronized void c(yxb yxbVar) {
        this.b.z(yxbVar.c);
    }
}
